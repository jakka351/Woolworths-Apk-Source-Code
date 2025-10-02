package com.salesforce.marketingcloud.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteOpenHelper;
import android.preference.PreferenceManager;
import android.provider.Settings;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
abstract class e {
    protected static final int d = -1;
    private static final String e = "DEFAULT_SHARED_PREFERENCES";
    private static final String f = "et_207_preference_migration_complete";

    /* renamed from: a, reason: collision with root package name */
    private final String f17062a;
    private final String b;
    protected static final String c = com.salesforce.marketingcloud.g.a("Storage");
    private static AtomicBoolean g = new AtomicBoolean(false);

    public e(@NonNull String str, @NonNull String str2) {
        this.f17062a = (String) com.salesforce.marketingcloud.util.j.a((String) com.salesforce.marketingcloud.util.j.a(str, "Application ID is null."), "Application ID is empty.");
        this.b = (String) com.salesforce.marketingcloud.util.j.a((String) com.salesforce.marketingcloud.util.j.a(str2, "Access Token is null."), "Access Token is empty.");
    }

    @Nullable
    private Object a(@NonNull com.salesforce.marketingcloud.util.c cVar, String str, Type type) {
        SharedPreferences sharedPreferences = a().getSharedPreferences("ETPush", 0);
        String str2 = null;
        try {
            String string = sharedPreferences.getString(str + "_enc", null);
            if (string == null) {
                string = sharedPreferences.getString(str, null);
            }
            if (string != null) {
                try {
                    string = cVar.b(string);
                    com.salesforce.marketingcloud.g.c(c, "Found encrypted value for %s", str);
                } catch (UnsupportedEncodingException | GeneralSecurityException unused) {
                    com.salesforce.marketingcloud.g.c(c, "Found unencrypted value for %s", str);
                }
            }
            str2 = string;
        } catch (Exception unused2) {
        }
        return str2 != null ? str2 : a(str, type);
    }

    private void b(@NonNull com.salesforce.marketingcloud.util.c cVar) {
        Object objA;
        boolean zBooleanValue;
        SharedPreferences.Editor editorEdit = f().edit();
        ArrayMap arrayMap = new ArrayMap(0);
        arrayMap.put("et_geo_enabled_key", Boolean.class);
        arrayMap.put("et_proximity_enabled_key", Boolean.class);
        arrayMap.put("et_push_enabled", Boolean.class);
        Iterator it = arrayMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            Type type = (Type) entry.getValue();
            String str2 = c;
            com.salesforce.marketingcloud.g.c(str2, "Migrating %s ...", str);
            try {
                objA = a(cVar, str, type);
            } catch (Exception e2) {
                com.salesforce.marketingcloud.g.b(c, e2, "Unable to migrate %s", str);
            }
            if (objA != null) {
                if (type == Boolean.class) {
                    if (objA instanceof Boolean) {
                        zBooleanValue = ((Boolean) objA).booleanValue();
                    } else if (objA instanceof String) {
                        zBooleanValue = Boolean.valueOf((String) objA).booleanValue();
                    } else {
                        com.salesforce.marketingcloud.g.c(str2, "Unknown Type for %s. Preference will not be migrated.", str);
                    }
                    editorEdit.putBoolean(str, zBooleanValue);
                } else {
                    com.salesforce.marketingcloud.g.c(str2, "Key '%s' with value of '%s' was not written to preferences.", str, objA);
                }
            }
            com.salesforce.marketingcloud.g.c(str2, "Done with %s.", str);
        }
        editorEdit.apply();
    }

    private void c(@NonNull com.salesforce.marketingcloud.util.c cVar) {
        Map<String, String> mapC;
        String[] strArr = {c.c, c.b, c.d};
        for (int i = 0; i < 3; i++) {
            String str = strArr[i];
            try {
                String str2 = c;
                com.salesforce.marketingcloud.g.c(str2, "Migrating %s ...", str);
                Object objA = a(cVar, str, String.class);
                if (c.b.equals(str) && (mapC = com.salesforce.marketingcloud.util.l.c((String) objA)) != null) {
                    mapC.remove("_ETSDKVersion");
                    objA = com.salesforce.marketingcloud.util.l.a(mapC);
                }
                if (objA == null || "null".equals(objA)) {
                    com.salesforce.marketingcloud.g.c(str2, "Value was \"null\" and will not be migrated.", new Object[0]);
                } else {
                    com.salesforce.marketingcloud.g.c(str2, "Writing %s to encrypted preferences ...", str);
                    c().a(str, String.valueOf(objA));
                }
                com.salesforce.marketingcloud.g.c(str2, "Done with %s.", str);
            } catch (Exception e2) {
                com.salesforce.marketingcloud.g.b(c, e2, "Unable to migrate %s", str);
            }
        }
    }

    @NonNull
    private String d() {
        return com.salesforce.marketingcloud.util.l.e(Settings.Secure.getString(a().getContentResolver(), nnlllnn.nnlllln.w007700770077www) + "-" + a().getPackageName());
    }

    public abstract Context a();

    public abstract void a(Context context, int i, int i2);

    @RestrictTo
    public abstract com.salesforce.marketingcloud.util.c b();

    public abstract c c();

    public abstract SQLiteOpenHelper e();

    public abstract SharedPreferences f();

    @Nullable
    private Object a(String str, Type type) {
        String[] strArr = {"ETPush", "et_registration_cache", "~!Registration", "~!ETPush", "~!ETLocationManager", "etpushSDK@ETPush", "etpushsdk@ETLocationManager", e};
        for (int i = 0; i < 8; i++) {
            String str2 = strArr[i];
            SharedPreferences defaultSharedPreferences = e.equals(str2) ? PreferenceManager.getDefaultSharedPreferences(a()) : a().getSharedPreferences(str2, 0);
            if (defaultSharedPreferences.contains(str)) {
                try {
                    if (type == Boolean.class) {
                        return Boolean.valueOf(defaultSharedPreferences.getBoolean(str, false));
                    }
                    if (type == String.class) {
                        return defaultSharedPreferences.getString(str, null);
                    }
                } catch (ClassCastException unused) {
                }
            }
        }
        return null;
    }

    public final void a(@NonNull com.salesforce.marketingcloud.util.c cVar) throws GeneralSecurityException, UnsupportedEncodingException {
        String str = c;
        com.salesforce.marketingcloud.g.c(str, "Migrating SharedPreferences ...", new Object[0]);
        c(cVar);
        b(cVar);
        com.salesforce.marketingcloud.g.c(str, "Finished migrating SharedPreferences.", new Object[0]);
    }

    private void a(Context context, String str, String str2) {
        boolean andSet;
        boolean z;
        try {
            try {
                andSet = g.getAndSet(true);
                z = f().getBoolean(f, false);
            } catch (Exception e2) {
                com.salesforce.marketingcloud.g.b(c, e2, "Data migration failed", new Object[0]);
            }
            if (!andSet && !z) {
                com.salesforce.marketingcloud.util.i iVar = new com.salesforce.marketingcloud.util.i(context, str, str2, d());
                try {
                    iVar.b(context.getSharedPreferences("ETPush", 0).getString("et_device_id_cache_enc", null));
                    a(iVar);
                    com.salesforce.marketingcloud.g.c(c, "Old data migrations completed without exception.", new Object[0]);
                } catch (Exception unused) {
                    com.salesforce.marketingcloud.g.a(c, "Unable to verify old encryption.  Moving on without migrating data.", new Object[0]);
                }
                f().edit().putBoolean(f, true).apply();
                g.set(false);
            }
        } finally {
            f().edit().putBoolean(f, true).apply();
            g.set(false);
        }
    }

    public final void b(Context context, int i, int i2) {
        String[] strArrDatabaseList;
        if (i != -1 || (strArrDatabaseList = context.databaseList()) == null) {
            return;
        }
        for (String str : strArrDatabaseList) {
            if ("etdb.db".equals(str)) {
                a(context, this.f17062a, this.b);
                return;
            }
        }
    }
}
