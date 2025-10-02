package com.google.firebase.crashlytics.internal.persistence;

import android.content.Context;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.ProcessDetailsProvider;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class FileStore {

    /* renamed from: a, reason: collision with root package name */
    public final String f15388a;
    public final File b;
    public final File c;
    public final File d;
    public final File e;
    public final File f;
    public final File g;

    public FileStore(Context context) {
        String string;
        String strD = ProcessDetailsProvider.f15259a.c(context).d();
        this.f15388a = strD;
        File filesDir = context.getFilesDir();
        this.b = filesDir;
        if (strD.isEmpty()) {
            string = ".com.google.firebase.crashlytics.files.v1";
        } else {
            StringBuilder sb = new StringBuilder(".crashlytics.v3");
            sb.append(File.separator);
            sb.append(strD.length() > 40 ? CommonUtils.h(strD) : strD.replaceAll("[^a-zA-Z0-9.]", "_"));
            string = sb.toString();
        }
        File file = new File(filesDir, string);
        c(file);
        this.c = file;
        File file2 = new File(file, "open-sessions");
        c(file2);
        this.d = file2;
        File file3 = new File(file, "reports");
        c(file3);
        this.e = file3;
        File file4 = new File(file, "priority-reports");
        c(file4);
        this.f = file4;
        File file5 = new File(file, "native-reports");
        c(file5);
        this.g = file5;
    }

    public static synchronized void c(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                Logger.f15258a.b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.", null);
                file.delete();
            }
            if (!file.mkdirs()) {
                Logger.f15258a.c(null, "Could not create Crashlytics-specific directory: " + file);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean d(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                d(file2);
            }
        }
        return file.delete();
    }

    public static List e(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    public final void a(String str) {
        File file = new File(this.b, str);
        if (file.exists() && d(file)) {
            Logger.f15258a.b("Deleted previous Crashlytics file system: " + file.getPath(), null);
        }
    }

    public final File b(String str, String str2) {
        File file = new File(this.d, str);
        file.mkdirs();
        return new File(file, str2);
    }
}
