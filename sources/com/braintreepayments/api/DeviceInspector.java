package com.braintreepayments.api;

import androidx.annotation.RestrictTo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/braintreepayments/api/DeviceInspector;", "", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@RestrictTo
/* loaded from: classes4.dex */
public final class DeviceInspector {

    /* renamed from: a, reason: collision with root package name */
    public final AppHelper f13721a = new AppHelper();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/braintreepayments/api/DeviceInspector$Companion;", "", "", "PAYPAL_APP_PACKAGE", "Ljava/lang/String;", "VENMO_APP_PACKAGE", "VENMO_APP_SWITCH_ACTIVITY", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.braintreepayments.api.DeviceMetadata a(android.content.Context r13, com.braintreepayments.api.Configuration r14, java.lang.String r15, java.lang.String r16) throws java.lang.NoSuchFieldException, android.content.pm.PackageManager.NameNotFoundException, java.lang.SecurityException {
        /*
            com.braintreepayments.api.DeviceMetadata r0 = new com.braintreepayments.api.DeviceMetadata
            r1 = 0
            if (r13 == 0) goto La
            java.lang.String r2 = r13.getPackageName()
            goto Lb
        La:
            r2 = r1
        Lb:
            r3 = 0
            if (r13 == 0) goto L1d
            android.content.pm.PackageManager r4 = r13.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1d
            if (r4 == 0) goto L1d
            java.lang.String r5 = r13.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1d
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo(r5, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1d
            goto L1e
        L1d:
            r4 = r1
        L1e:
            if (r4 == 0) goto L33
            if (r13 == 0) goto L2d
            android.content.pm.PackageManager r5 = r13.getPackageManager()
            if (r5 == 0) goto L2d
            java.lang.CharSequence r4 = r5.getApplicationLabel(r4)
            goto L2e
        L2d:
            r4 = r1
        L2e:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            goto L35
        L33:
            java.lang.String r4 = "ApplicationNameUnknown"
        L35:
            int r5 = android.os.Build.VERSION.SDK_INT
            java.lang.String r6 = "Android API "
            java.lang.String r5 = YU.a.d(r5, r6)
            java.lang.String r6 = android.os.Build.MANUFACTURER
            java.lang.String r7 = android.os.Build.MODEL
            r8 = 1
            java.lang.String r9 = "com.braintreepayments.api.dropin.BuildConfig"
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch: java.lang.Throwable -> L60
            java.lang.String r10 = "VERSION_NAME"
            java.lang.reflect.Field r9 = r9.getField(r10)     // Catch: java.lang.Throwable -> L60
            r9.setAccessible(r8)     // Catch: java.lang.Throwable -> L60
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            kotlin.jvm.internal.ReflectionFactory r11 = kotlin.jvm.internal.Reflection.f24268a     // Catch: java.lang.Throwable -> L60
            kotlin.reflect.KClass r10 = r11.b(r10)     // Catch: java.lang.Throwable -> L60
            java.lang.Object r9 = r9.get(r10)     // Catch: java.lang.Throwable -> L60
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L60
            goto L61
        L60:
            r9 = r1
        L61:
            if (r14 == 0) goto L66
            java.lang.String r10 = r14.b
            goto L67
        L66:
            r10 = r1
        L67:
            java.lang.String r11 = android.os.Build.PRODUCT
            java.lang.String r12 = "google_sdk"
            boolean r12 = r12.equalsIgnoreCase(r11)
            if (r12 != 0) goto L94
            java.lang.String r12 = "sdk"
            boolean r11 = r12.equalsIgnoreCase(r11)
            if (r11 != 0) goto L94
            java.lang.String r11 = "Genymotion"
            java.lang.String r12 = android.os.Build.MANUFACTURER
            boolean r11 = r11.equalsIgnoreCase(r12)
            if (r11 != 0) goto L94
            java.lang.String r11 = android.os.Build.FINGERPRINT
            java.lang.String r12 = "FINGERPRINT"
            kotlin.jvm.internal.Intrinsics.g(r11, r12)
            java.lang.String r12 = "generic"
            boolean r11 = kotlin.text.StringsKt.o(r11, r12, r3)
            if (r11 == 0) goto L93
            goto L94
        L93:
            r8 = r3
        L94:
            if (r13 == 0) goto La7
            android.content.pm.PackageManager r11 = r13.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La7
            java.lang.String r13 = r13.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La7
            android.content.pm.PackageInfo r13 = r11.getPackageInfo(r13, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La7
            if (r13 == 0) goto La7
            java.lang.String r13 = r13.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La7
            goto La8
        La7:
            r13 = r1
        La8:
            if (r13 != 0) goto Lac
            java.lang.String r13 = "VersionUnknown"
        Lac:
            if (r14 == 0) goto Lb0
            java.lang.String r1 = r14.d
        Lb0:
            r0.<init>()
            r0.f13722a = r2
            r0.b = r4
            java.lang.String r14 = "4.49.1"
            r0.c = r14
            r0.d = r5
            java.lang.String r14 = "braintreeclientsdk"
            r0.e = r14
            r0.f = r6
            r0.g = r7
            r0.h = r9
            r0.i = r10
            java.lang.String r14 = "mobile-native"
            r0.j = r14
            r14 = r16
            r0.k = r14
            r0.l = r8
            r0.m = r13
            r0.n = r1
            java.lang.String r13 = "Android"
            r0.o = r13
            r0.p = r15
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braintreepayments.api.DeviceInspector.a(android.content.Context, com.braintreepayments.api.Configuration, java.lang.String, java.lang.String):com.braintreepayments.api.DeviceMetadata");
    }
}
