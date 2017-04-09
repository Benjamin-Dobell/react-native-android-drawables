package au.com.glassechidna.react.drawables;

import android.content.res.*;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.InputStream;

public class ResourcesWrapper extends Resources
{
	private final Resources resources;

	public ResourcesWrapper(final Resources resources)
	{
		super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());

		this.resources = resources;
	}

	@Override
	public CharSequence getText(final int id) throws NotFoundException
	{
		return resources.getText(id);
	}

	@Override
	public CharSequence getQuantityText(final int id, final int quantity) throws NotFoundException
	{
		return resources.getQuantityText(id, quantity);
	}

	@Override
	public String getString(final int id) throws NotFoundException
	{
		return resources.getString(id);
	}

	@Override
	public String getString(final int id, final Object... formatArgs) throws NotFoundException
	{
		return resources.getString(id, formatArgs);
	}

	@Override
	public String getQuantityString(final int id, final int quantity, final Object... formatArgs) throws NotFoundException
	{
		return resources.getQuantityString(id, quantity, formatArgs);
	}

	@Override
	public String getQuantityString(final int id, final int quantity) throws NotFoundException
	{
		return resources.getQuantityString(id, quantity);
	}

	@Override
	public CharSequence getText(final int id, final CharSequence def)
	{
		return resources.getText(id, def);
	}

	@Override
	public CharSequence[] getTextArray(final int id) throws NotFoundException
	{
		return resources.getTextArray(id);
	}

	@Override
	public String[] getStringArray(final int id) throws NotFoundException
	{
		return resources.getStringArray(id);
	}

	@Override
	public int[] getIntArray(final int id) throws NotFoundException
	{
		return resources.getIntArray(id);
	}

	@Override
	public TypedArray obtainTypedArray(final int id) throws NotFoundException
	{
		return resources.obtainTypedArray(id);
	}

	@Override
	public float getDimension(final int id) throws NotFoundException
	{
		return resources.getDimension(id);
	}

	@Override
	public int getDimensionPixelOffset(final int id) throws NotFoundException
	{
		return resources.getDimensionPixelOffset(id);
	}

	@Override
	public int getDimensionPixelSize(final int id) throws NotFoundException
	{
		return resources.getDimensionPixelSize(id);
	}

	@Override
	public float getFraction(final int id, final int base, final int pbase)
	{
		return resources.getFraction(id, base, pbase);
	}

	@Override
	public Drawable getDrawable(final int id) throws NotFoundException
	{
		return resources.getDrawable(id);
	}

	@Override
	public Drawable getDrawableForDensity(final int id, final int density) throws NotFoundException
	{
		return resources.getDrawableForDensity(id, density);
	}

	@Override
	public Movie getMovie(final int id) throws NotFoundException
	{
		return resources.getMovie(id);
	}

	@Override
	public int getColor(final int id) throws NotFoundException
	{
		return resources.getColor(id);
	}

	@Override
	public ColorStateList getColorStateList(final int id) throws NotFoundException
	{
		return resources.getColorStateList(id);
	}

	@Override
	public boolean getBoolean(final int id) throws NotFoundException
	{
		return resources.getBoolean(id);
	}

	@Override
	public int getInteger(final int id) throws NotFoundException
	{
		return resources.getInteger(id);
	}

	@Override
	public XmlResourceParser getLayout(final int id) throws NotFoundException
	{
		return resources.getLayout(id);
	}

	@Override
	public XmlResourceParser getAnimation(final int id) throws NotFoundException
	{
		return resources.getAnimation(id);
	}

	@Override
	public XmlResourceParser getXml(final int id) throws NotFoundException
	{
		return resources.getXml(id);
	}

	@Override
	public InputStream openRawResource(final int id) throws NotFoundException
	{
		return resources.openRawResource(id);
	}

	@Override
	public InputStream openRawResource(final int id, final TypedValue value) throws NotFoundException
	{
		return resources.openRawResource(id, value);
	}

	@Override
	public AssetFileDescriptor openRawResourceFd(final int id) throws NotFoundException
	{
		return resources.openRawResourceFd(id);
	}

	@Override
	public void getValue(final int id, final TypedValue outValue, final boolean resolveRefs) throws NotFoundException
	{
		resources.getValue(id, outValue, resolveRefs);
	}

	@Override
	public void getValueForDensity(final int id, final int density, final TypedValue outValue, final boolean resolveRefs) throws NotFoundException
	{
		resources.getValueForDensity(id, density, outValue, resolveRefs);
	}

	@Override
	public void getValue(final String name, final TypedValue outValue, final boolean resolveRefs) throws NotFoundException
	{
		resources.getValue(name, outValue, resolveRefs);
	}

	@Override
	public TypedArray obtainAttributes(final AttributeSet set, final int[] attrs)
	{
		return resources.obtainAttributes(set, attrs);
	}

	@Override
	public void updateConfiguration(final Configuration config, final DisplayMetrics metrics)
	{
		// This method is first called from super's constructor i.e. before we've had a chance to set our resources field.
		if (resources != null)
		{
			resources.updateConfiguration(config, metrics);
		}
	}

	@Override
	public DisplayMetrics getDisplayMetrics()
	{
		return resources.getDisplayMetrics();
	}

	@Override
	public Configuration getConfiguration()
	{
		return resources.getConfiguration();
	}

	@Override
	public int getIdentifier(final String name, final String defType, final String defPackage)
	{
		return resources.getIdentifier(name, defType, defPackage);
	}

	@Override
	public String getResourceName(final int resid) throws NotFoundException
	{
		return resources.getResourceName(resid);
	}

	@Override
	public String getResourcePackageName(final int resid) throws NotFoundException
	{
		return resources.getResourcePackageName(resid);
	}

	@Override
	public String getResourceTypeName(final int resid) throws NotFoundException
	{
		return resources.getResourceTypeName(resid);
	}

	@Override
	public String getResourceEntryName(final int resid) throws NotFoundException
	{
		return resources.getResourceEntryName(resid);
	}

	@Override
	public void parseBundleExtras(final XmlResourceParser parser, final Bundle outBundle) throws XmlPullParserException, IOException
	{
		resources.parseBundleExtras(parser, outBundle);
	}

	@Override
	public void parseBundleExtra(final String tagName, final AttributeSet attrs, final Bundle outBundle) throws XmlPullParserException
	{
		resources.parseBundleExtra(tagName, attrs, outBundle);
	}
}
