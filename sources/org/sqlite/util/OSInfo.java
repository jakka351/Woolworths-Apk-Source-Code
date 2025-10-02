package org.sqlite.util;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public class OSInfo {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f26910a;

    static {
        HashMap map = new HashMap();
        f26910a = map;
        map.put("x86", "x86");
        map.put("i386", "x86");
        map.put("i486", "x86");
        map.put("i586", "x86");
        map.put("i686", "x86");
        map.put("pentium", "x86");
        map.put("x86_64", "x86_64");
        map.put("amd64", "x86_64");
        map.put("em64t", "x86_64");
        map.put("universal", "x86_64");
        map.put("ia64", "ia64");
        map.put("ia64w", "ia64");
        map.put("ia64_32", "ia64_32");
        map.put("ia64n", "ia64_32");
        map.put("ppc", "ppc");
        map.put("power", "ppc");
        map.put("powerpc", "ppc");
        map.put("power_pc", "ppc");
        map.put("power_rs", "ppc");
        map.put("ppc64", "ppc64");
        map.put("power64", "ppc64");
        map.put("powerpc64", "ppc64");
        map.put("power_pc64", "ppc64");
        map.put("power_rs64", "ppc64");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a() {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.sqlite.util.OSInfo.a():java.lang.String");
    }

    public static String b() {
        String property = System.getProperty("os.name");
        if (property.contains("Windows")) {
            return "Windows";
        }
        if (property.contains("Mac") || property.contains("Darwin")) {
            return "Mac";
        }
        boolean z = false;
        try {
            Process processExec = Runtime.getRuntime().exec("cat /etc/os-release | grep ^ID");
            processExec.waitFor(300L, TimeUnit.MILLISECONDS);
            InputStream inputStream = processExec.getInputStream();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[32];
                while (true) {
                    int i = inputStream.read(bArr, 0, 32);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                }
                boolean zContains = byteArrayOutputStream.toString().toLowerCase().contains("alpine");
                inputStream.close();
                z = zContains;
            } catch (Throwable th) {
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable unused) {
        }
        if (z) {
            return "Linux-Alpine";
        }
        String str = "Linux";
        if (!property.contains("Linux")) {
            str = "AIX";
            if (!property.contains("AIX")) {
                return property.replaceAll("\\W", "");
            }
        }
        return str;
    }
}
