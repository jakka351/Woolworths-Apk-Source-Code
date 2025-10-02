package com.google.firebase.messaging;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

/* loaded from: classes.dex */
class Metadata {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15645a;
    public String b;
    public String c;
    public int d;
    public int e = 0;

    public Metadata(Context context) {
        this.f15645a = context;
    }

    public static String b(FirebaseApp firebaseApp) {
        firebaseApp.a();
        FirebaseOptions firebaseOptions = firebaseApp.c;
        String str = firebaseOptions.e;
        if (str != null) {
            return str;
        }
        firebaseApp.a();
        String str2 = firebaseOptions.b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final synchronized String a() {
        try {
            if (this.b == null) {
                e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    public final PackageInfo c(String str) {
        try {
            return this.f15645a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Failed to find package " + e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004a A[Catch: all -> 0x0025, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001b, B:15:0x0027, B:17:0x002d, B:19:0x003f, B:21:0x0045, B:24:0x004a, B:26:0x005d, B:28:0x0063, B:31:0x0068, B:33:0x0075, B:35:0x007a, B:34:0x0078), top: B:42:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.e     // Catch: java.lang.Throwable -> L25
            r1 = 1
            r2 = 0
            if (r0 == 0) goto La
            monitor-exit(r5)
            goto L7d
        La:
            android.content.Context r0 = r5.f15645a     // Catch: java.lang.Throwable -> L25
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r4 = "com.google.android.gms"
            int r3 = r0.checkPermission(r3, r4)     // Catch: java.lang.Throwable -> L25
            r4 = -1
            if (r3 != r4) goto L27
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r3 = "Google Play services missing or without correct permission."
            android.util.Log.e(r0, r3)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r5)
            r0 = r2
            goto L7d
        L25:
            r0 = move-exception
            goto L81
        L27:
            boolean r3 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()     // Catch: java.lang.Throwable -> L25
            if (r3 != 0) goto L4a
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "com.google.android.gms"
            r3.setPackage(r4)     // Catch: java.lang.Throwable -> L25
            java.util.List r3 = r0.queryIntentServices(r3, r2)     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L4a
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L25
            if (r3 <= 0) goto L4a
            r5.e = r1     // Catch: java.lang.Throwable -> L25
            monitor-exit(r5)
            r0 = r1
            goto L7d
        L4a:
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "com.google.android.gms"
            r3.setPackage(r4)     // Catch: java.lang.Throwable -> L25
            java.util.List r0 = r0.queryBroadcastReceivers(r3, r2)     // Catch: java.lang.Throwable -> L25
            r3 = 2
            if (r0 == 0) goto L68
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L25
            if (r0 <= 0) goto L68
            r5.e = r3     // Catch: java.lang.Throwable -> L25
            monitor-exit(r5)
            r0 = r3
            goto L7d
        L68:
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r4 = "Failed to resolve IID implementation package, falling back"
            android.util.Log.w(r0, r4)     // Catch: java.lang.Throwable -> L25
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L78
            r5.e = r3     // Catch: java.lang.Throwable -> L25
            goto L7a
        L78:
            r5.e = r1     // Catch: java.lang.Throwable -> L25
        L7a:
            int r0 = r5.e     // Catch: java.lang.Throwable -> L25
            monitor-exit(r5)
        L7d:
            if (r0 == 0) goto L80
            return r1
        L80:
            return r2
        L81:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L25
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.Metadata.d():boolean");
    }

    public final synchronized void e() {
        PackageInfo packageInfoC = c(this.f15645a.getPackageName());
        if (packageInfoC != null) {
            this.b = Integer.toString(packageInfoC.versionCode);
            this.c = packageInfoC.versionName;
        }
    }
}
