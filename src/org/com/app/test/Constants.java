package com.app.test;

import android.os.Environment;

public class Constants {
    public static final String CONF_FILE_NAME = "mkxp.conf";
    public static final String GAME_NAME = "test";
    public static final String OBB_DIRECTORY = String.format("%s/Android/obb/%s/", new Object[]{Environment.getExternalStorageDirectory().getAbsolutePath(), "com.app.test"});
    public static final String OBB_NAME_MAIN = "main.1.com.app.test.obb";
    public static final String OBB_NAME_PATCH = "patch.1.com.app.test.obb";
    public static final String OBB_PATH_MAIN;
    public static final String OBB_PATH_PATCH;
    public static final int OBB_VERSION_CODE = 1;
    public static final String PACKAGE_NAME = "com.app.test";
    public static final String PREFS_NAME = "apptestprefs";
    public static final String SAVE_FILE_DIR = "apptest";

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(OBB_DIRECTORY);
        stringBuilder.append(OBB_NAME_MAIN);
        OBB_PATH_MAIN = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(OBB_DIRECTORY);
        stringBuilder.append(OBB_NAME_PATCH);
        OBB_PATH_PATCH = stringBuilder.toString();
    }
}
