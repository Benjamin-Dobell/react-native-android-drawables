# What does this module do?

This module provides a simple "toolkit" for injecting named `Drawable` into the native Android `Resources` utilised by React Native applications.

This module isn't particularly useful on its own, but can be used in conjunction with other React Native modules or native Android (Java) code bundled in your app.

# Usage

Although this library is designed to be used in React Native apps, this project contains native Android (Java) code only, so you won't interact with this library directly from JavaScript.

Typically other node modules will utilise this library and provide JavaScript bindings specific to those modules.

Consequently, the following documents the Java API.

## DrawableProvider

A simple interface for providing resource identifiers for names (named drawables), and drawables for resource identifiers.

## DrawableStore

A concrete implementation of `DrawableProvider`. This class allows you to store drawables by name and automatically generates a corresponding resource identifier using `DrawableResources`.

Its public methods are generally pretty self explanatory in nature:

* `Drawable getDrawable(int id)`
* `int getIdentifier(String name)`
* `int setDrawable(String name, Drawable drawable)`
* `Drawable removeDrawable(String name)`

Setting a `Drawable` using `setDrawable(name, drawable)` for an already existing `name`, will result in `drawable` replacing whatever `Drawable` was previously set (the corresponding identifier will also be reused).

The `int` returned  from `setDrawable(name, drawable)` is the automatically generated identifier i.e. the same value returned from `getIdentifier(name)`.

## DrawableResources

Provides just the one public (static) method:

 * `static int generateId()`

`generateId()` is called by `DrawableStore` to obtain suitable identifiers. Any additional `DrawableProvider` implementations should also use this method for generating `Drawable` resource identifies.

## ResourcesWrapper

A simple `Resources` subclass which takes another `Resources` and delegates all method calls to it.

## DrawableProviderResourcesWrapper

A subclass of `ResourcesWrapper` which in addition to taking (wrapping) another `Resources` instance, also takes a `DrawableProvider` (e.g. `DrawableStore`) instance.
 
Instead of simply delegating to the supplied `Resources`, when a `Drawable` is involved, this class will first delegate to the `DrawableProvider`. If the `DrawableProvider` does not return a value, then the values from the wrapped `Resources` will be utilised.

The affected methods which try the `DrawableProvider` before the wrapped `Resources` are:

* `Drawable getDrawable(int id) throws NotFoundException`
* `Drawable getDrawableForDensity(int id, int density) throws NotFoundException`
* `int getIdentifier(String name, String defType, String defPackage)`
