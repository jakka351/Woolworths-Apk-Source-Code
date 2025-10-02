package au.com.woolworths.android.onesite.repository;

import au.com.woolworths.android.onesite.analytics.FirebasePerfMonitor;
import au.com.woolworths.android.onesite.network.ApiInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/repository/ConfigManagerImpl;", "Lau/com/woolworths/android/onesite/repository/ConfigManager;", "Companion", "base-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConfigManagerImpl implements ConfigManager {

    /* renamed from: a, reason: collision with root package name */
    public final ApiInterface f4585a;
    public final FirebasePerfMonitor b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lau/com/woolworths/android/onesite/repository/ConfigManagerImpl$Companion;", "", "", "APP_VERSION", "Ljava/lang/String;", "OS_PLATFORM", "OS_PLATFORM_VALUE", "OS_VERSION", "base-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ConfigManagerImpl(ApiInterface apiInterface, FirebasePerfMonitor firebasePerfMonitor) {
        Intrinsics.h(apiInterface, "apiInterface");
        Intrinsics.h(firebasePerfMonitor, "firebasePerfMonitor");
        this.f4585a = apiInterface;
        this.b = firebasePerfMonitor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r6, java.lang.String r7, java.lang.String r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof au.com.woolworths.android.onesite.repository.ConfigManagerImpl$checkCurrentVersion$1
            if (r0 == 0) goto L13
            r0 = r9
            au.com.woolworths.android.onesite.repository.ConfigManagerImpl$checkCurrentVersion$1 r0 = (au.com.woolworths.android.onesite.repository.ConfigManagerImpl$checkCurrentVersion$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.android.onesite.repository.ConfigManagerImpl$checkCurrentVersion$1 r0 = new au.com.woolworths.android.onesite.repository.ConfigManagerImpl$checkCurrentVersion$1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r8 = r0.p
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Exception -> L81
            goto L67
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.ResultKt.b(r9)
            kotlin.Pair r9 = new kotlin.Pair
            java.lang.String r2 = "app_version"
            r9.<init>(r2, r6)
            kotlin.Pair r6 = new kotlin.Pair
            java.lang.String r2 = "os_platform"
            java.lang.String r4 = "android"
            r6.<init>(r2, r4)
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r4 = "os_version"
            r2.<init>(r4, r7)
            kotlin.Pair[] r6 = new kotlin.Pair[]{r9, r6, r2}
            java.util.Map r6 = kotlin.collections.MapsKt.j(r6)
            au.com.woolworths.android.onesite.analytics.FirebasePerfMonitor r7 = r5.b
            java.lang.String r9 = "app_start_interactive_config_load"
            r7.c(r9)
            au.com.woolworths.android.onesite.network.ApiInterface r7 = r5.f4585a     // Catch: java.lang.Exception -> L81
            r0.p = r8     // Catch: java.lang.Exception -> L81
            r0.s = r3     // Catch: java.lang.Exception -> L81
            java.lang.Object r9 = r7.c(r6, r0)     // Catch: java.lang.Exception -> L81
            if (r9 != r1) goto L67
            return r1
        L67:
            au.com.woolworths.android.onesite.models.config.ConfigResponse r9 = (au.com.woolworths.android.onesite.models.config.ConfigResponse) r9     // Catch: java.lang.Exception -> L81
            int r6 = r9.getConfigStatus()     // Catch: java.lang.Exception -> L81
            r7 = 2
            if (r6 != r7) goto L80
            java.lang.String r6 = r9.getAppLatestVersion()     // Catch: java.lang.Exception -> L81
            boolean r6 = kotlin.jvm.internal.Intrinsics.c(r8, r6)     // Catch: java.lang.Exception -> L81
            if (r6 == 0) goto L80
            au.com.woolworths.android.onesite.models.config.ConfigResponse r6 = new au.com.woolworths.android.onesite.models.config.ConfigResponse     // Catch: java.lang.Exception -> L81
            r6.<init>()     // Catch: java.lang.Exception -> L81
            return r6
        L80:
            return r9
        L81:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.repository.ConfigManagerImpl.a(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
