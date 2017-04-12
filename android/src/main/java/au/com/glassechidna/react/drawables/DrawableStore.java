package au.com.glassechidna.react.drawables;

import android.graphics.drawable.Drawable;
import android.util.SparseArray;

import java.util.HashMap;

public class DrawableStore implements DrawableProvider
{
	private final HashMap<String, Integer> drawableNameIdMap = new HashMap<String, Integer>();
	private final SparseArray<Drawable> drawables = new SparseArray<Drawable>();

	public Drawable getDrawable(final int id)
	{
		return drawables.get(id);
	}

	public int getIdentifier(final String name)
	{
		return drawableNameIdMap.containsKey(name) ? drawableNameIdMap.get(name) : 0;
	}

	public int setDrawable(final String name, final Drawable drawable)
	{
		final int id;

		if (drawableNameIdMap.containsKey(name))
		{
			id = drawableNameIdMap.get(name);
		}
		else
		{
			id = DrawableResources.generateId();
			drawableNameIdMap.put(name, id);
		}

		drawables.put(id, drawable);

		return id;
	}

	public Drawable removeDrawable(final String name)
	{
		Drawable drawable = null;

		if (drawableNameIdMap.containsKey(name))
		{
			final int id = drawableNameIdMap.remove(name);
			drawable = drawables.get(id);
			drawables.delete(id);
		}

		return drawable;
	}

	public void clear()
	{
		drawableNameIdMap.clear();
		drawables.clear();
	}
}
