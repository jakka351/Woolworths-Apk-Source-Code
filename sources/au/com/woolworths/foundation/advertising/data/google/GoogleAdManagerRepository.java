package au.com.woolworths.foundation.advertising.data.google;

import android.app.Application;
import au.com.woolworths.android.onesite.analytics.FirebasePerfMonitor;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBanner;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.gson.Gson;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/advertising/data/google/GoogleAdManagerRepository;", "", "Companion", "advertising-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GoogleAdManagerRepository {

    /* renamed from: a, reason: collision with root package name */
    public final Application f8400a;
    public final Gson b;
    public final DispatcherProvider c;
    public final FirebasePerfMonitor d;
    public final FeatureToggleManager e;
    public final GoogleAdManagerRepository$cache$1 f;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lau/com/woolworths/foundation/advertising/data/google/GoogleAdManagerRepository$Companion;", "", "", "MAX_CACHED_ADS", "I", "", "AD_REQUEST_URL", "Ljava/lang/String;", "AD_UNIT_ATTRIBUTE", "AD_UNIT_ERROR_ATTRIBUTE", "advertising-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public GoogleAdManagerRepository(Application application, Gson gson, DispatcherProvider dispatchers, FirebasePerfMonitor firebasePerfMonitor, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(gson, "gson");
        Intrinsics.h(dispatchers, "dispatchers");
        Intrinsics.h(firebasePerfMonitor, "firebasePerfMonitor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f8400a = application;
        this.b = gson;
        this.c = dispatchers;
        this.d = firebasePerfMonitor;
        this.e = featureToggleManager;
        this.f = new GoogleAdManagerRepository$cache$1(5);
    }

    public final GoogleAdBanner a(GoogleAdBannerCard googleAdBannerCard) {
        Intrinsics.h(googleAdBannerCard, "googleAdBannerCard");
        Object objD = null;
        try {
            NativeCustomFormatAd nativeCustomFormatAd = this.f.get(new CacheKey(googleAdBannerCard.getAdUnitId(), googleAdBannerCard.getTemplateId(), googleAdBannerCard.getTargeting()));
            if (nativeCustomFormatAd != null) {
                Map mapA = GoogleAdManagerRepositoryKt.a(nativeCustomFormatAd);
                Gson gson = this.b;
                objD = gson.d(GoogleAdBanner.class, gson.j(mapA));
            }
        } catch (GoogleAdManagerException unused) {
        }
        return (GoogleAdBanner) objD;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r10, java.lang.String r11, au.com.woolworths.android.onesite.graphql.GoogleAdCustomTargeting r12, java.lang.String r13, java.lang.Class r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            r9 = this;
            boolean r0 = r15 instanceof au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerRepository$fetch$2
            if (r0 == 0) goto L13
            r0 = r15
            au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerRepository$fetch$2 r0 = (au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerRepository$fetch$2) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerRepository$fetch$2 r0 = new au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerRepository$fetch$2
            r0.<init>(r9, r15)
        L18:
            java.lang.Object r15 = r0.t
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Class r14 = r0.s
            au.com.woolworths.android.onesite.graphql.GoogleAdCustomTargeting r12 = r0.r
            java.lang.String r11 = r0.q
            java.lang.String r10 = r0.p
            kotlin.ResultKt.b(r15)     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L30
            r3 = r9
            goto L68
        L30:
            r0 = move-exception
            r13 = r0
            r3 = r9
            goto L93
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3d:
            kotlin.ResultKt.b(r15)
            r0.p = r10     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L8d
            r0.q = r11     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L8d
            r0.r = r12     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L8d
            r0.s = r14     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L8d
            r0.v = r3     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L8d
            au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider r15 = r9.c     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L82
            r15.getClass()     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L7a
            kotlinx.coroutines.scheduling.DefaultScheduler r15 = kotlinx.coroutines.Dispatchers.f24691a     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L7a
            kotlinx.coroutines.scheduling.DefaultIoScheduler r15 = kotlinx.coroutines.scheduling.DefaultIoScheduler.f     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L7a
            au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerRepository$fetch$4 r2 = new au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerRepository$fetch$4     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L7a
            r8 = 0
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L78
            java.lang.Object r15 = kotlinx.coroutines.BuildersKt.f(r15, r2, r0)     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L78
            if (r15 != r1) goto L65
            return r1
        L65:
            r10 = r4
            r11 = r5
            r12 = r6
        L68:
            java.util.Map r15 = (java.util.Map) r15     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L75
            com.google.gson.Gson r13 = r3.b     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L75
            java.lang.String r15 = r13.j(r15)     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L75
            java.lang.Object r10 = r13.d(r14, r15)     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L75
            return r10
        L75:
            r0 = move-exception
        L76:
            r13 = r0
            goto L93
        L78:
            r0 = move-exception
            goto L87
        L7a:
            r0 = move-exception
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            goto L87
        L80:
            r13 = r10
            goto L89
        L82:
            r0 = move-exception
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
        L87:
            r10 = r0
            goto L80
        L89:
            r10 = r4
            r11 = r5
            r12 = r6
            goto L93
        L8d:
            r0 = move-exception
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            goto L76
        L93:
            au.com.woolworths.foundation.advertising.data.google.CacheKey r14 = new au.com.woolworths.foundation.advertising.data.google.CacheKey
            r14.<init>(r10, r11, r12)
            au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerRepository$cache$1 r10 = r3.f
            r10.remove(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerRepository.b(java.lang.String, java.lang.String, au.com.woolworths.android.onesite.graphql.GoogleAdCustomTargeting, java.lang.String, java.lang.Class, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
