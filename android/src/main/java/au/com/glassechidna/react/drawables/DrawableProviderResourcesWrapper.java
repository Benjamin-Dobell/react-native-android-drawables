package au.com.glassechidna.react.drawables;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public class DrawableProviderResourcesWrapper extends ResourcesWrapper
{
	private final DrawableProvider drawableProvider;

	public DrawableProviderResourcesWrapper(final Resources resources, final DrawableProvider drawableProvider)
	{
		super(resources);

		this.drawableProvider = drawableProvider;
	}

	@Override
	public Drawable getDrawable(final int id) throws NotFoundException
	{
		final Drawable drawable = drawableProvider.getDrawable(id);
		return drawable != null ? drawable : super.getDrawable(id);
	}

	@Override
	public Drawable getDrawableForDensity(final int id, final int density) throws NotFoundException
	{
		final Drawable drawable = drawableProvider.getDrawable(id);
		return drawable != null ? drawable : super.getDrawableForDensity(id, density);
	}

	@Override
	public int getIdentifier(final String name, final String defType, final String defPackage)
	{
		if (defType == "drawable")
		{
			final int id = drawableProvider.getIdentifier(name);

			if (id != 0)
			{
				return id;
			}
		}

		return super.getIdentifier(name, defType, defPackage);
	}
}
