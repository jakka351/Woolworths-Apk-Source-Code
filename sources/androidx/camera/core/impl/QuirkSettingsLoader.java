package androidx.camera.core.impl;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import androidx.arch.core.util.Function;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.QuirkSettings;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes2.dex */
public class QuirkSettingsLoader implements Function<Context, QuirkSettings> {

    public static class MetadataHolderService extends Service {
        private MetadataHolderService() {
        }

        @Override // android.app.Service
        public final IBinder onBind(Intent intent) {
            throw new UnsupportedOperationException();
        }
    }

    public static QuirkSettings a(Context context, Bundle bundle) {
        boolean z = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] strArrB = b(context, "androidx.camera.core.quirks.FORCE_ENABLED", bundle);
        String[] strArrB2 = b(context, "androidx.camera.core.quirks.FORCE_DISABLED", bundle);
        Logger.a("QuirkSettingsLoader", "Loaded quirk settings from metadata:");
        Logger.a("QuirkSettingsLoader", "  KEY_DEFAULT_QUIRK_ENABLED = " + z);
        Logger.a("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_ENABLED = " + Arrays.toString(strArrB));
        Logger.a("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_DISABLED = " + Arrays.toString(strArrB2));
        QuirkSettings.Builder builder = new QuirkSettings.Builder();
        builder.f494a = z;
        builder.b = new HashSet(c(strArrB));
        HashSet hashSet = new HashSet(c(strArrB2));
        builder.c = hashSet;
        return new QuirkSettings(builder.f494a, builder.b, hashSet);
    }

    public static String[] b(Context context, String str, Bundle bundle) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            Logger.e("QuirkSettingsLoader", "Resource ID not found for key: ".concat(str));
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i);
        } catch (Resources.NotFoundException e) {
            Logger.f("QuirkSettingsLoader", "Quirk class names resource not found: " + i, e);
            return new String[0];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.HashSet c(java.lang.String[] r8) throws java.lang.ClassNotFoundException {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            int r1 = r8.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L4a
            r3 = r8[r2]
            java.lang.String r4 = "QuirkSettingsLoader"
            java.lang.Class r5 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L2f
            java.lang.Class<androidx.camera.core.impl.Quirk> r6 = androidx.camera.core.impl.Quirk.class
            boolean r6 = r6.isAssignableFrom(r5)     // Catch: java.lang.ClassNotFoundException -> L2f
            if (r6 == 0) goto L1a
            goto L42
        L1a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L2f
            r5.<init>()     // Catch: java.lang.ClassNotFoundException -> L2f
            r5.append(r3)     // Catch: java.lang.ClassNotFoundException -> L2f
            java.lang.String r6 = " does not implement the Quirk interface."
            r5.append(r6)     // Catch: java.lang.ClassNotFoundException -> L2f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.ClassNotFoundException -> L2f
            androidx.camera.core.Logger.e(r4, r5)     // Catch: java.lang.ClassNotFoundException -> L2f
            goto L41
        L2f:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Class not found: "
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            androidx.camera.core.Logger.f(r4, r3, r5)
        L41:
            r5 = 0
        L42:
            if (r5 == 0) goto L47
            r0.add(r5)
        L47:
            int r2 = r2 + 1
            goto L7
        L4a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.QuirkSettingsLoader.c(java.lang.String[]):java.util.HashSet");
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        Context context = (Context) obj;
        try {
            Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) MetadataHolderService.class), 640).metaData;
            if (bundle != null) {
                return a(context, bundle);
            }
            Logger.e("QuirkSettingsLoader", "No metadata in MetadataHolderService.");
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            Logger.a("QuirkSettingsLoader", "QuirkSettings$MetadataHolderService is not found.");
            return null;
        }
    }
}
