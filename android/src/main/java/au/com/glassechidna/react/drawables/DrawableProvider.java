package au.com.glassechidna.react.drawables;

import android.graphics.drawable.Drawable;

interface DrawableProvider
{
	Drawable getDrawable(final int id);
	int getIdentifier(final String name);
}
