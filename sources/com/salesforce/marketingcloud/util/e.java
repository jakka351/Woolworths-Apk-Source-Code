package com.salesforce.marketingcloud.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17073a = com.salesforce.marketingcloud.g.a("DeviceData");
    private static final String b = "SFMCDeviceUUID";

    @VisibleForTesting
    static volatile String c;

    private e() {
    }

    private static String a() {
        Locale locale = Locale.ENGLISH;
        return l.a(UUID.randomUUID().toString() + System.currentTimeMillis());
    }

    private static String b(@NonNull Context context, @Nullable String str) throws Throwable {
        File file = new File(context.getNoBackupFilesDir(), b);
        String strA = file.exists() ? a(file) : null;
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String str2 = f17073a;
        com.salesforce.marketingcloud.g.a(str2, "Checking SharedPreferences for deviceId", new Object[0]);
        String strA2 = a(context);
        if (TextUtils.isEmpty(strA2)) {
            com.salesforce.marketingcloud.g.a(str2, "Checking pre-lollipop location for deviceId", new Object[0]);
            File file2 = new File(context.getFilesDir(), b);
            if (file2.exists()) {
                strA2 = a(file2);
                g.b(file2);
            }
        }
        if (TextUtils.isEmpty(strA2)) {
            Object[] objArr = new Object[0];
            if (str != null) {
                com.salesforce.marketingcloud.g.a(str2, "Using registrationId as deviceId", objArr);
            } else {
                com.salesforce.marketingcloud.g.a(str2, "Generating/Storing new deviceId", objArr);
                str = a();
            }
        } else {
            str = strA2;
        }
        a(file, str);
        return str;
    }

    @NonNull
    public static String a(@NonNull Context context, @Nullable String str) {
        if (c == null) {
            synchronized (e.class) {
                c = b(context, str);
            }
        }
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.FileInputStream, java.io.InputStream] */
    private static String a(@NonNull File file) throws Throwable {
        ?? fileInputStream;
        Closeable closeable;
        String line = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Exception unused) {
            fileInputStream = 0;
        } catch (Throwable th) {
            th = th;
            fileInputStream = line;
            g.a((Closeable) fileInputStream);
            throw th;
        }
        try {
            line = new BufferedReader(new InputStreamReader((InputStream) fileInputStream, l.b)).readLine();
            closeable = fileInputStream;
        } catch (Exception unused2) {
            try {
                com.salesforce.marketingcloud.g.b(f17073a, "Failed to read device id from file: ", file.getAbsolutePath());
                closeable = fileInputStream;
                g.a(closeable);
                return line;
            } catch (Throwable th2) {
                th = th2;
                line = fileInputStream;
                fileInputStream = line;
                g.a((Closeable) fileInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            g.a((Closeable) fileInputStream);
            throw th;
        }
        g.a(closeable);
        return line;
    }

    private static String a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("_et_default_shared_preferences", 0);
        String string = sharedPreferences.getString("id", null);
        if (string != null) {
            sharedPreferences.edit().remove("id").apply();
        }
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r1v6 */
    private static void a(File file, String str) throws Throwable {
        ?? fileOutputStream;
        ?? r1;
        Charset charset = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    charset = l.b;
                    fileOutputStream.write(str.getBytes(charset));
                    r1 = fileOutputStream;
                } catch (Exception unused) {
                    charset = fileOutputStream;
                    com.salesforce.marketingcloud.g.b(f17073a, "Failed to write device id to file: ", file.getAbsolutePath());
                    r1 = charset;
                    g.a((Closeable) r1);
                } catch (Throwable th) {
                    th = th;
                    g.a((Closeable) fileOutputStream);
                    throw th;
                }
            } catch (Exception unused2) {
            }
            g.a((Closeable) r1);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = charset;
        }
    }
}
