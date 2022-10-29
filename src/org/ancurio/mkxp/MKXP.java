package org.ancurio.mkxp;

import android.content.Context;
import java.io.File;
import org.libsdl.app.SDLActivity;

public class MKXP
{
    public static String getLibDir(Context c) {
        String s = c.getApplicationInfo().nativeLibraryDir;
		String s1 = s;
        if (!s.endsWith(File.separator)) {
            s1 = s + File.separator;
        }
        return s1;
    }
	
    public static native void loadLibs(String path);
	
    public static native void unloadLibs();
	
	
}
