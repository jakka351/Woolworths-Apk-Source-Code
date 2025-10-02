package org.sqlite;

import YU.a;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.medallia.digital.mobilesdk.q2;
import com.salesforce.marketingcloud.messages.iam.j;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Properties;
import org.sqlite.util.OSInfo;

/* loaded from: classes8.dex */
public class SQLiteJDBCLoader {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f26878a = false;

    public static void a() {
        File[] fileArrListFiles = new File(new File(System.getProperty("org.sqlite.tmpdir", System.getProperty("java.io.tmpdir"))).getAbsolutePath()).listFiles(new FilenameFilter() { // from class: org.sqlite.SQLiteJDBCLoader.1

            /* renamed from: a, reason: collision with root package name */
            public final String f26879a = "sqlite-" + SQLiteJDBCLoader.b();

            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return str.startsWith(this.f26879a) && !str.endsWith(".lck");
            }
        });
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (!new File(file.getAbsolutePath() + ".lck").exists()) {
                    try {
                        file.delete();
                    } catch (SecurityException e) {
                        System.err.println("Failed to delete old native lib" + e.getMessage());
                    }
                }
            }
        }
    }

    public static String b() throws IOException {
        URL resource = SQLiteJDBCLoader.class.getResource("/META-INF/maven/org.xerial/sqlite-jdbc/pom.properties");
        if (resource == null) {
            resource = SQLiteJDBCLoader.class.getResource("/META-INF/maven/org.xerial/sqlite-jdbc/VERSION");
        }
        String property = j.h;
        if (resource != null) {
            try {
                Properties properties = new Properties();
                properties.load(FirebasePerfUrlConnection.openStream(resource));
                property = properties.getProperty("version", j.h);
                return property.trim().replaceAll("[^0-9\\.]", "");
            } catch (IOException e) {
                System.err.println(e);
            }
        }
        return property;
    }

    public static boolean c(String str, String str2) {
        if (new File(str, str2).exists()) {
            try {
                System.load(new File(str, str2).getAbsolutePath());
                return true;
            } catch (UnsatisfiedLinkError e) {
                PrintStream printStream = System.err;
                StringBuilder sbU = a.u("Failed to load native library:", str2, ". osinfo: ");
                HashMap map = OSInfo.f26910a;
                sbU.append(OSInfo.b() + q2.c + OSInfo.a());
                printStream.println(sbU.toString());
                System.err.println(e);
            }
        }
        return false;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.sqlite.SQLiteJDBCLoader.d():void");
    }
}
