package com.medallia.digital.mobilesdk;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class MedalliaExceptionHandler implements Thread.UncaughtExceptionHandler {
    protected static final String CRASHES_FOLDER = ".crashes";
    private static final String FILE_NAME = "crash.txt";
    protected static final String FILE_PATH = ".crashes/crash.txt";
    private Thread.UncaughtExceptionHandler defaultExceptionHandler;
    private String filePath;
    private boolean isRegistered;

    public MedalliaExceptionHandler(Context context) {
        if (context != null) {
            this.filePath = getPath(CRASHES_FOLDER, context);
        }
    }

    private String getPath(String str, Context context) {
        if (context == null) {
            return null;
        }
        return androidx.camera.core.impl.b.o(getSdkDirectoryPath(context), q2.c, str);
    }

    private String getSdkDirectoryPath(Context context) {
        if (context == null) {
            return null;
        }
        return YU.a.g(context.getFilesDir().getPath(), "/medalliaDigitalSDK");
    }

    private String getStackTrace(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        String string = stringWriter.toString();
        printWriter.close();
        return string;
    }

    private void saveCrashReport(Throwable th) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("timestamp", System.currentTimeMillis());
            jSONObject.put("stacktrace", getStackTrace(th));
            writeToFile(jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    private void writeToFile(String str) throws IOException {
        if (TextUtils.isEmpty(FILE_NAME) || str == null || this.filePath == null) {
            return;
        }
        File file = new File(YU.a.o(new StringBuilder(), this.filePath, "/crash.txt"));
        if (file.getParentFile() != null && !file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(str.getBytes());
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }

    public boolean isRegistered() {
        return this.isRegistered;
    }

    public void register() {
        if (this.isRegistered) {
            return;
        }
        this.isRegistered = true;
        this.defaultExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) throws JSONException {
        saveCrashReport(th);
        this.defaultExceptionHandler.uncaughtException(thread, th);
    }

    public void unregister() {
        if (this.isRegistered) {
            Thread.setDefaultUncaughtExceptionHandler(this.defaultExceptionHandler);
            this.isRegistered = false;
        }
    }

    public void updateFilePath(Context context) {
        if (context != null) {
            this.filePath = getPath(CRASHES_FOLDER, context);
        }
    }
}
