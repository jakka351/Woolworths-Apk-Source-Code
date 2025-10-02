package lib.android.paypal.com.magnessdk.filesystem;

import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import lib.android.paypal.com.magnessdk.f;

/* loaded from: classes7.dex */
public final class c {
    public static void a(File file, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(str.getBytes("UTF-8"));
                    f.f(c.class, fileOutputStream);
                } catch (Exception e) {
                    e = e;
                    fileOutputStream2 = fileOutputStream;
                    lib.android.paypal.com.magnessdk.log.a.b(e, c.class);
                    f.f(c.class, fileOutputStream2);
                } catch (Throwable th) {
                    th = th;
                    f.f(c.class, fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static boolean b(File file) {
        try {
            if (!file.exists()) {
                return false;
            }
            lib.android.paypal.com.magnessdk.log.a.a("deleting CachedConfigDataFromDisk", 0, c.class);
            return file.delete();
        } catch (Exception e) {
            lib.android.paypal.com.magnessdk.log.a.b(e, c.class);
            return false;
        }
    }

    public static boolean c(String str, String[] strArr) {
        if (strArr != null) {
            boolean zIsEmpty = str.isEmpty();
            for (String str2 : strArr) {
                if ((!zIsEmpty ? new File(str2, str) : new File(str2)).exists()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String d(File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    byte[] bArr = new byte[(int) randomAccessFile.length()];
                    randomAccessFile.readFully(bArr);
                    String str = new String(bArr, "UTF-8");
                    f.f(c.class, randomAccessFile);
                    return str;
                } catch (Exception e) {
                    e = e;
                    randomAccessFile2 = randomAccessFile;
                    lib.android.paypal.com.magnessdk.log.a.b(e, c.class);
                    f.f(c.class, randomAccessFile2);
                    return "";
                } catch (Throwable th) {
                    th = th;
                    f.f(c.class, randomAccessFile);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = randomAccessFile2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String e(java.io.File r5) throws java.lang.Throwable {
        /*
            java.lang.Class<lib.android.paypal.com.magnessdk.filesystem.c> r0 = lib.android.paypal.com.magnessdk.filesystem.c.class
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L26
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L26
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L26
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L26
        L12:
            java.lang.String r5 = r3.readLine()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            if (r5 == 0) goto L20
            r1.append(r5)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            goto L12
        L1c:
            r5 = move-exception
            goto L44
        L1e:
            r5 = move-exception
            goto L28
        L20:
            lib.android.paypal.com.magnessdk.f.f(r0, r3)
            goto L31
        L24:
            r5 = move-exception
            goto L43
        L26:
            r5 = move-exception
            r3 = r2
        L28:
            r4 = -403(0xfffffffffffffe6d, float:NaN)
            r1.append(r4)     // Catch: java.lang.Throwable -> L41
            lib.android.paypal.com.magnessdk.log.a.b(r5, r0)     // Catch: java.lang.Throwable -> L41
            goto L20
        L31:
            java.lang.String r5 = r1.toString()
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3c
            goto L40
        L3c:
            java.lang.String r2 = r1.toString()
        L40:
            return r2
        L41:
            r5 = move-exception
            r2 = r3
        L43:
            r3 = r2
        L44:
            lib.android.paypal.com.magnessdk.f.f(r0, r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.android.paypal.com.magnessdk.filesystem.c.e(java.io.File):java.lang.String");
    }
}
