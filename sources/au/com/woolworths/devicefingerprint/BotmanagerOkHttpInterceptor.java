package au.com.woolworths.devicefingerprint;

import au.com.woolworths.android.onesite.ShopAppFeature;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Interceptor;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/devicefingerprint/BotmanagerOkHttpInterceptor;", "Lokhttp3/Interceptor;", "device-fingerprint_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class BotmanagerOkHttpInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final BotmanagerInteractor f5168a;
    public final FeatureToggleManager b;

    public BotmanagerOkHttpInterceptor(FeatureToggleManager featureToggleManager, BotmanagerInteractor botmanagerInteractor) {
        ShopAppFeature shopAppFeature = ShopAppFeature.d;
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f5168a = botmanagerInteractor;
        this.b = featureToggleManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.Response a(okhttp3.internal.http.RealInterceptorChain r14) {
        /*
            r13 = this;
            au.com.woolworths.android.onesite.ShopAppFeature r0 = au.com.woolworths.android.onesite.ShopAppFeature.d
            okhttp3.Request r1 = r14.e
            okhttp3.HttpUrl r2 = r1.f26690a
            java.lang.String r2 = r2.b()
            okhttp3.Headers r3 = r1.c
            java.lang.String r4 = "/hermes/iris/v1/login/user"
            boolean r4 = r2.equals(r4)
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r5 = r13.b
            au.com.woolworths.devicefingerprint.BotmanagerInteractor r6 = r13.f5168a
            if (r4 == 0) goto L58
            boolean r4 = r5.c(r0)
            r7 = 12
            r8 = 0
            if (r4 != 0) goto L33
            au.com.woolworths.foundation.bark.Bark$Companion r4 = au.com.woolworths.foundation.bark.Bark.f8483a
            au.com.woolworths.foundation.bark.common.ReportOwner$Squad r4 = au.com.woolworths.foundation.bark.common.ReportOwner.Squad.m
            au.com.woolworths.foundation.bark.common.ReportOwner r4 = r4.a()
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Botmanager has incorrect value of feature flag."
            r9.<init>(r10)
            au.com.woolworths.foundation.bark.Bark.Barker.c(r4, r9, r8, r7)
        L33:
            boolean r4 = r6.c(r2)
            if (r4 != 0) goto L58
            au.com.woolworths.foundation.bark.Bark$Companion r4 = au.com.woolworths.foundation.bark.Bark.f8483a
            au.com.woolworths.foundation.bark.common.ReportOwner$Squad r4 = au.com.woolworths.foundation.bark.common.ReportOwner.Squad.m
            au.com.woolworths.foundation.bark.common.ReportOwner r4 = r4.a()
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r10 = r6.f5167a
            au.com.woolworths.base.shopapp.remoteconfig.ShopRemoteConfig r11 = au.com.woolworths.base.shopapp.remoteconfig.ShopRemoteConfig.e
            r12 = 0
            java.lang.String r10 = r10.e(r11, r12)
            java.lang.String r11 = "Botmanager has incorrect value of paths, value : "
            java.lang.String r10 = YU.a.A(r11, r10)
            r9.<init>(r10)
            au.com.woolworths.foundation.bark.Bark.Barker.c(r4, r9, r8, r7)
        L58:
            boolean r0 = r5.c(r0)
            if (r0 == 0) goto L9e
            boolean r0 = r3 instanceof java.util.Collection
            java.lang.String r4 = "x-acf-sensor-data"
            if (r0 == 0) goto L6e
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L6e
            goto L87
        L6e:
            java.util.Iterator r0 = r3.iterator()
        L72:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L87
            java.lang.Object r3 = r0.next()
            kotlin.Pair r3 = (kotlin.Pair) r3
            java.lang.Object r3 = r3.d
            boolean r3 = kotlin.jvm.internal.Intrinsics.c(r3, r4)
            if (r3 == 0) goto L72
            goto L9e
        L87:
            boolean r0 = r6.c(r2)
            if (r0 == 0) goto L9e
            java.lang.String r0 = r6.a()
            okhttp3.Request$Builder r1 = r1.b()
            r1.a(r4, r0)
            okhttp3.Request r0 = new okhttp3.Request
            r0.<init>(r1)
            r1 = r0
        L9e:
            okhttp3.Response r14 = r14.c(r1)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.devicefingerprint.BotmanagerOkHttpInterceptor.a(okhttp3.internal.http.RealInterceptorChain):okhttp3.Response");
    }
}
