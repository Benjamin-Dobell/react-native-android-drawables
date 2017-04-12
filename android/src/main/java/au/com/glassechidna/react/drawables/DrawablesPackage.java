package au.com.glassechidna.react.drawables;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.Collections;
import java.util.List;

// Exists so that `react-native link` detects us as a native Android module
public class DrawablesPackage implements ReactPackage
{
	@Override
	public List<NativeModule> createNativeModules(final ReactApplicationContext reactContext)
	{
		return Collections.emptyList();
	}

	@Override
	public List<Class<? extends JavaScriptModule>> createJSModules()
	{
		return Collections.emptyList();
	}

	@Override
	public List<ViewManager> createViewManagers(final ReactApplicationContext reactContext)
	{
		return Collections.emptyList();
	}
}
