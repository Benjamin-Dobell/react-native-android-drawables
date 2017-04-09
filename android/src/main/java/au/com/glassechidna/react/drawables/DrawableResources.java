package au.com.glassechidna.react.drawables;

import java.util.concurrent.atomic.AtomicInteger;

public final class DrawableResources
{
	// This class is to be accessed as a namespace only.
	private DrawableResources()
	{
	}

	private static final AtomicInteger nextGeneratedId = new AtomicInteger(1);

	public static int generateId()
	{
		for (;;)
		{
			final int id = nextGeneratedId.get();
			final int nextId = (id + 1 > 0x00FFFFFF) ? 1 : id + 1;

			if (nextGeneratedId.compareAndSet(id, nextId))
			{
				return id;
			}
		}
	}
}
