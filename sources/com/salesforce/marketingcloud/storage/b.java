package com.salesforce.marketingcloud.storage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.salesforce.marketingcloud.storage.c;
import java.io.File;
import java.util.Locale;

@SuppressLint
/* loaded from: classes6.dex */
public abstract class b extends e {
    protected static final String k = "create_date";
    private static final String l = "storagedb.db";
    private static final String m = "ETSharedPrefs";
    private static final String n = "mcsdk_%s";
    protected final String h;
    protected final Context i;
    protected final com.salesforce.marketingcloud.util.c j;

    public b(@NonNull Context context, @NonNull com.salesforce.marketingcloud.util.c cVar, @NonNull String str, @NonNull String str2) {
        super(str, str2);
        this.i = context;
        this.j = cVar;
        this.h = str;
        if (!g() && i() && j()) {
            try {
                h();
            } catch (Exception e) {
                com.salesforce.marketingcloud.g.b(e.c, e, "Unable to migrate data to BU specific storage", new Object[0]);
            }
        }
    }

    public static String a(String str) {
        Locale locale = Locale.ENGLISH;
        return YU.a.A("mcsdk_", str);
    }

    private boolean g() {
        File databasePath = this.i.getDatabasePath(com.salesforce.marketingcloud.storage.db.l.a(this.h));
        return databasePath != null && databasePath.exists();
    }

    private void h() {
        File databasePath = this.i.getDatabasePath(l);
        if (databasePath != null && databasePath.exists()) {
            try {
                if (!databasePath.renameTo(new File(databasePath.getParent(), com.salesforce.marketingcloud.storage.db.l.a(this.h)))) {
                    com.salesforce.marketingcloud.g.b(e.c, "Unable to rename storagedb.db to BU specific naming scheme", new Object[0]);
                }
            } catch (Exception e) {
                com.salesforce.marketingcloud.g.b(e.c, e, "Unable to rename storagedb.db to BU specific naming scheme", new Object[0]);
            }
        }
        File file = new File(this.i.getApplicationInfo().dataDir, "shared_prefs/");
        if (file.exists()) {
            File file2 = new File(file, "ETCustomerPrefs.xml");
            if (file2.exists()) {
                try {
                    if (!file2.renameTo(new File(file, c.a.b(this.h) + ".xml"))) {
                        com.salesforce.marketingcloud.g.b(e.c, "Unable to rename ETCustomerPrefs.xml to BU specific naming scheme", new Object[0]);
                    }
                } catch (Exception e2) {
                    com.salesforce.marketingcloud.g.b(e.c, e2, "Unable to rename ETCustomerPrefs.xml to BU specific naming scheme", new Object[0]);
                }
            }
            File file3 = new File(file, "ETSharedPrefs.xml");
            if (file3.exists()) {
                try {
                    if (file3.renameTo(new File(file, a(this.h) + ".xml"))) {
                        return;
                    }
                    com.salesforce.marketingcloud.g.b(e.c, "Unable to rename ETSharedPrefs.xml to BU specific naming scheme", new Object[0]);
                } catch (Exception e3) {
                    com.salesforce.marketingcloud.g.b(e.c, e3, "Unable to rename ETSharedPrefs.xml to BU specific naming scheme", new Object[0]);
                }
            }
        }
    }

    private boolean i() {
        File databasePath = this.i.getDatabasePath(l);
        return databasePath != null && databasePath.exists();
    }

    private boolean j() {
        return a(this.i.getSharedPreferences(m, 0));
    }

    public abstract boolean a(SharedPreferences sharedPreferences);
}
