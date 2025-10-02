package au.com.woolworths.foundation.advertising.data.google;

import au.com.woolworths.android.onesite.analytics.FirebasePerfMonitor;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdConsumer;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdLoadingTimeoutConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/advertising/data/google/GoogleAdManagerInteractor;", "", "advertising-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class GoogleAdManagerInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final GoogleAdManagerRepository f8399a;
    public final DispatcherProvider b;
    public final FirebasePerfMonitor c;
    public final GoogleAdLoadingTimeoutConfig d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[GoogleAdConsumer.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                GoogleAdConsumer googleAdConsumer = GoogleAdConsumer.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                GoogleAdConsumer googleAdConsumer2 = GoogleAdConsumer.e;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                GoogleAdConsumer googleAdConsumer3 = GoogleAdConsumer.e;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                GoogleAdConsumer googleAdConsumer4 = GoogleAdConsumer.e;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                GoogleAdConsumer googleAdConsumer5 = GoogleAdConsumer.e;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public GoogleAdManagerInteractor(GoogleAdManagerRepository googleAdManagerRepository, DispatcherProvider dispatcherProvider, FirebasePerfMonitor firebasePerfMonitor, GoogleAdLoadingTimeoutConfig config) {
        Intrinsics.h(googleAdManagerRepository, "googleAdManagerRepository");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        Intrinsics.h(firebasePerfMonitor, "firebasePerfMonitor");
        Intrinsics.h(config, "config");
        this.f8399a = googleAdManagerRepository;
        this.b = dispatcherProvider;
        this.c = firebasePerfMonitor;
        this.d = config;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor r4, au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard r5, java.util.concurrent.CopyOnWriteArrayList r6, boolean r7, au.com.woolworths.foundation.advertising.data.google.model.GoogleAdConsumer r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$populateGoogleAd$1
            if (r0 == 0) goto L13
            r0 = r9
            au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$populateGoogleAd$1 r0 = (au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$populateGoogleAd$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$populateGoogleAd$1 r0 = new au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$populateGoogleAd$1
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.concurrent.CopyOnWriteArrayList r6 = r0.q
            au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard r5 = r0.p
            kotlin.ResultKt.b(r9)
            goto L4f
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.ResultKt.b(r9)
            au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerRepository r9 = r4.f8399a
            au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBanner r9 = r9.a(r5)
            if (r7 == 0) goto L3f
            goto L40
        L3f:
            r9 = 0
        L40:
            if (r9 != 0) goto L51
            r0.p = r5
            r0.q = r6
            r0.t = r3
            java.lang.Object r9 = r4.b(r5, r8, r0)
            if (r9 != r1) goto L4f
            return r1
        L4f:
            au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBanner r9 = (au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBanner) r9
        L51:
            if (r9 == 0) goto L60
            au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard r4 = au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCardKt.d(r5, r9)
            boolean r5 = au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCardKt.c(r4)
            if (r5 == 0) goto L60
            r6.add(r4)
        L60:
            kotlin.Unit r4 = kotlin.Unit.f24250a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor.a(au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor, au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard, java.util.concurrent.CopyOnWriteArrayList, boolean, au.com.woolworths.foundation.advertising.data.google.model.GoogleAdConsumer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static /* synthetic */ Serializable j(GoogleAdManagerInteractor googleAdManagerInteractor, List list, ContinuationImpl continuationImpl, int i) {
        GoogleAdConsumer googleAdConsumer = GoogleAdConsumer.f;
        if ((i & 2) != 0) {
            googleAdConsumer = GoogleAdConsumer.j;
        }
        return googleAdManagerInteractor.i(list, googleAdConsumer, false, continuationImpl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
    
        if (r0 == r3) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10, types: [au.com.woolworths.android.onesite.analytics.FirebasePerfMonitor] */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v4, types: [au.com.woolworths.android.onesite.analytics.FirebasePerfMonitor] */
    /* JADX WARN: Type inference failed for: r13v5, types: [au.com.woolworths.android.onesite.analytics.FirebasePerfMonitor] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.coroutines.intrinsics.CoroutineSingletons] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard r17, au.com.woolworths.foundation.advertising.data.google.model.GoogleAdConsumer r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) throws java.lang.Throwable {
        /*
            r16 = this;
            r1 = r16
            r2 = r18
            r0 = r19
            boolean r3 = r0 instanceof au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$fetch$1
            if (r3 == 0) goto L1a
            r3 = r0
            au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$fetch$1 r3 = (au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$fetch$1) r3
            int r4 = r3.t
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1a
            int r4 = r4 - r5
            r3.t = r4
        L18:
            r10 = r3
            goto L20
        L1a:
            au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$fetch$1 r3 = new au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$fetch$1
            r3.<init>(r1, r0)
            goto L18
        L20:
            java.lang.Object r0 = r10.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r10.t
            r5 = 2
            r6 = 1
            r11 = 0
            java.lang.String r12 = "google_ad_loading_timeout"
            if (r4 == 0) goto L57
            if (r4 == r6) goto L4d
            if (r4 != r5) goto L45
            au.com.woolworths.android.onesite.analytics.FirebasePerfMonitor r2 = r10.q
            au.com.woolworths.foundation.advertising.data.google.model.GoogleAdConsumer r3 = r10.p
            kotlin.ResultKt.b(r0)     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L3c kotlinx.coroutines.TimeoutCancellationException -> L41
            r13 = r2
            r2 = r3
            goto La7
        L3c:
            r0 = move-exception
            r13 = r2
            r2 = r3
            goto Laa
        L41:
            r13 = r2
            r2 = r3
            goto Lb4
        L45:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L4d:
            au.com.woolworths.android.onesite.analytics.FirebasePerfMonitor r2 = r10.q
            au.com.woolworths.foundation.advertising.data.google.model.GoogleAdConsumer r3 = r10.p
            kotlin.ResultKt.b(r0)     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L3c kotlinx.coroutines.TimeoutCancellationException -> L41
            r13 = r2
            r2 = r3
            goto L7d
        L57:
            kotlin.ResultKt.b(r0)
            au.com.woolworths.android.onesite.analytics.FirebasePerfMonitor r13 = r1.c
            r13.c(r12)
            long r7 = r1.f(r2)     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L81 kotlinx.coroutines.TimeoutCancellationException -> Lb4
            r14 = 0
            int r0 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r0 <= 0) goto L83
            au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$fetch$2$banner$1 r0 = new au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$fetch$2$banner$1     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L81 kotlinx.coroutines.TimeoutCancellationException -> Lb4
            r4 = r17
            r0.<init>(r1, r4, r11)     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L81 kotlinx.coroutines.TimeoutCancellationException -> Lb4
            r10.p = r2     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L81 kotlinx.coroutines.TimeoutCancellationException -> Lb4
            r10.q = r13     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L81 kotlinx.coroutines.TimeoutCancellationException -> Lb4
            r10.t = r6     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L81 kotlinx.coroutines.TimeoutCancellationException -> Lb4
            java.lang.Object r0 = kotlinx.coroutines.TimeoutKt.b(r7, r0, r10)     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L81 kotlinx.coroutines.TimeoutCancellationException -> Lb4
            if (r0 != r3) goto L7d
            goto La6
        L7d:
            au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBanner r0 = (au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBanner) r0     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L81 kotlinx.coroutines.TimeoutCancellationException -> Lb4
        L7f:
            r11 = r0
            goto Lbb
        L81:
            r0 = move-exception
            goto Laa
        L83:
            au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerRepository r4 = r1.f8399a     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L81 kotlinx.coroutines.TimeoutCancellationException -> Lb4
            r10.p = r2     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L81 kotlinx.coroutines.TimeoutCancellationException -> Lb4
            r10.q = r13     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L81 kotlinx.coroutines.TimeoutCancellationException -> Lb4
            r10.t = r5     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L81 kotlinx.coroutines.TimeoutCancellationException -> Lb4
            r4.getClass()     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L81 kotlinx.coroutines.TimeoutCancellationException -> Lb4
            java.lang.String r5 = r17.getAdUnitId()     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L81 kotlinx.coroutines.TimeoutCancellationException -> Lb4
            java.lang.String r6 = r17.getTemplateId()     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L81 kotlinx.coroutines.TimeoutCancellationException -> Lb4
            au.com.woolworths.android.onesite.graphql.GoogleAdCustomTargeting r7 = r17.getTargeting()     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L81 kotlinx.coroutines.TimeoutCancellationException -> Lb4
            java.lang.String r8 = r17.getCorrelator()     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L81 kotlinx.coroutines.TimeoutCancellationException -> Lb4
            java.lang.Class<au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBanner> r9 = au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBanner.class
            java.lang.Object r0 = r4.b(r5, r6, r7, r8, r9, r10)     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L81 kotlinx.coroutines.TimeoutCancellationException -> Lb4
            if (r0 != r3) goto La7
        La6:
            return r3
        La7:
            au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBanner r0 = (au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBanner) r0     // Catch: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerException -> L81 kotlinx.coroutines.TimeoutCancellationException -> Lb4
            goto L7f
        Laa:
            java.lang.String r3 = r2.d
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r13.a(r12, r3, r0)
            goto Lbb
        Lb4:
            java.lang.String r0 = r2.d
            java.lang.String r3 = "timeout_reached"
            r13.a(r12, r0, r3)
        Lbb:
            if (r11 == 0) goto Lc4
            java.lang.String r0 = r2.d
            java.lang.String r2 = "consumed"
            r13.a(r12, r0, r2)
        Lc4:
            r13.d(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor.b(au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard, au.com.woolworths.foundation.advertising.data.google.model.GoogleAdConsumer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Flow c(ArrayList arrayList) {
        GoogleAdConsumer googleAdConsumer = GoogleAdConsumer.e;
        return FlowKt.B(new GoogleAdManagerInteractor$fetch$3(arrayList, this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(au.com.woolworths.foundation.advertising.data.google.model.UniversalInventoryContainerData r6, au.com.woolworths.foundation.advertising.data.google.model.GoogleAdConsumer r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$fetchGoogleAdBannerOrFallback$1
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$fetchGoogleAdBannerOrFallback$1 r0 = (au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$fetchGoogleAdBannerOrFallback$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$fetchGoogleAdBannerOrFallback$1 r0 = new au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$fetchGoogleAdBannerOrFallback$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard r6 = r0.q
            au.com.woolworths.foundation.advertising.data.google.model.UniversalInventoryContainerData r7 = r0.p
            kotlin.ResultKt.b(r8)
            goto L5a
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.ResultKt.b(r8)
            au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard r8 = r6.getGoogleAdBannerCard()
            if (r8 == 0) goto L77
            au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerRepository r2 = r5.f8399a
            au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBanner r2 = r2.a(r8)
            if (r2 == 0) goto L49
            au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard r7 = au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCardKt.d(r8, r2)
            goto L73
        L49:
            r0.p = r6
            r0.q = r8
            r0.t = r3
            java.lang.Object r7 = r5.b(r8, r7, r0)
            if (r7 != r1) goto L56
            return r1
        L56:
            r4 = r7
            r7 = r6
            r6 = r8
            r8 = r4
        L5a:
            au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBanner r8 = (au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBanner) r8
            if (r8 == 0) goto L6c
            au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard r6 = au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCardKt.d(r6, r8)
            boolean r8 = au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCardKt.c(r6)
            if (r8 == 0) goto L69
            goto L6a
        L69:
            r6 = 0
        L6a:
            if (r6 != 0) goto L70
        L6c:
            java.lang.Object r6 = r7.getUniversalInventoryFallback()
        L70:
            r4 = r7
            r7 = r6
            r6 = r4
        L73:
            if (r7 != 0) goto L76
            goto L77
        L76:
            return r7
        L77:
            java.lang.Object r6 = r6.getUniversalInventoryFallback()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor.d(au.com.woolworths.foundation.advertising.data.google.model.UniversalInventoryContainerData, au.com.woolworths.foundation.advertising.data.google.model.GoogleAdConsumer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard r5, au.com.woolworths.foundation.advertising.data.google.model.GoogleAdConsumer r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$fetchSingle$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$fetchSingle$1 r0 = (au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$fetchSingle$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$fetchSingle$1 r0 = new au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$fetchSingle$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard r5 = r0.p
            kotlin.ResultKt.b(r7)
            goto L4c
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r7)
            au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerRepository r7 = r4.f8399a
            au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBanner r7 = r7.a(r5)
            if (r7 == 0) goto L41
            au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard r5 = au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCardKt.d(r5, r7)
            return r5
        L41:
            r0.p = r5
            r0.s = r3
            java.lang.Object r7 = r4.b(r5, r6, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBanner r7 = (au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBanner) r7
            if (r7 == 0) goto L54
            au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard r5 = au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCardKt.d(r5, r7)
        L54:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor.e(au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard, au.com.woolworths.foundation.advertising.data.google.model.GoogleAdConsumer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final long f(GoogleAdConsumer googleAdConsumer) {
        Long l;
        int iOrdinal = googleAdConsumer.ordinal();
        GoogleAdLoadingTimeoutConfig googleAdLoadingTimeoutConfig = this.d;
        if (iOrdinal == 0) {
            l = googleAdLoadingTimeoutConfig.f8403a;
        } else if (iOrdinal == 1) {
            l = googleAdLoadingTimeoutConfig.b;
        } else if (iOrdinal == 2) {
            l = googleAdLoadingTimeoutConfig.c;
        } else if (iOrdinal == 3) {
            l = googleAdLoadingTimeoutConfig.d;
        } else if (iOrdinal == 4) {
            l = googleAdLoadingTimeoutConfig.e;
        } else {
            if (iOrdinal != 5) {
                throw new NoWhenBranchMatchedException();
            }
            l = null;
        }
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final Object g(GoogleAdBannerCard googleAdBannerCard, SuspendLambda suspendLambda) throws Throwable {
        Object objF = BuildersKt.f(NonCancellable.e, new GoogleAdManagerInteractor$performClick$2(this, googleAdBannerCard, null), suspendLambda);
        return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
    }

    public final Object h(GoogleAdBannerCard googleAdBannerCard, SuspendLambda suspendLambda) throws Throwable {
        Object objF = BuildersKt.f(NonCancellable.e, new GoogleAdManagerInteractor$recordImpression$2(this, googleAdBannerCard, null), suspendLambda);
        return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable i(java.util.List r15, au.com.woolworths.foundation.advertising.data.google.model.GoogleAdConsumer r16, boolean r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor.i(java.util.List, au.com.woolworths.foundation.advertising.data.google.model.GoogleAdConsumer, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable k(java.util.List r12, au.com.woolworths.foundation.advertising.data.google.model.GoogleAdConsumer r13, boolean r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$resolveUniversalInventoryContainer$1
            if (r0 == 0) goto L13
            r0 = r15
            au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$resolveUniversalInventoryContainer$1 r0 = (au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$resolveUniversalInventoryContainer$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$resolveUniversalInventoryContainer$1 r0 = new au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$resolveUniversalInventoryContainer$1
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.util.concurrent.CopyOnWriteArrayList r12 = r0.q
            java.util.List r13 = r0.p
            java.util.List r13 = (java.util.List) r13
            kotlin.ResultKt.b(r15)
            r8 = r12
            r12 = r13
            goto L5a
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            kotlin.ResultKt.b(r15)
            java.util.concurrent.CopyOnWriteArrayList r8 = new java.util.concurrent.CopyOnWriteArrayList
            r8.<init>()
            au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$resolveUniversalInventoryContainer$2 r4 = new au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$resolveUniversalInventoryContainer$2
            r10 = 0
            r6 = r11
            r5 = r12
            r7 = r13
            r9 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r12 = r5
            java.util.List r12 = (java.util.List) r12
            r0.p = r12
            r0.q = r8
            r0.t = r3
            java.lang.Object r12 = kotlinx.coroutines.CoroutineScopeKt.c(r4, r0)
            if (r12 != r1) goto L59
            return r1
        L59:
            r12 = r5
        L5a:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r12 = r12.iterator()
        L65:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto Lb2
            java.lang.Object r14 = r12.next()
            boolean r15 = r14 instanceof au.com.woolworths.foundation.advertising.data.google.model.UniversalInventoryContainerData
            if (r15 == 0) goto Lac
            java.util.Iterator r15 = r8.iterator()
        L77:
            boolean r0 = r15.hasNext()
            r1 = 0
            if (r0 == 0) goto La4
            java.lang.Object r0 = r15.next()
            boolean r2 = r0 instanceof au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard
            if (r2 == 0) goto L95
            r2 = r0
            au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard r2 = (au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard) r2
            r3 = r14
            au.com.woolworths.foundation.advertising.data.google.model.UniversalInventoryContainerData r3 = (au.com.woolworths.foundation.advertising.data.google.model.UniversalInventoryContainerData) r3
            au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard r3 = r3.getGoogleAdBannerCard()
            boolean r2 = au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCardKt.b(r2, r3)
            goto La0
        L95:
            r2 = r14
            au.com.woolworths.foundation.advertising.data.google.model.UniversalInventoryContainerData r2 = (au.com.woolworths.foundation.advertising.data.google.model.UniversalInventoryContainerData) r2
            java.lang.Object r2 = r2.getUniversalInventoryFallback()
            boolean r2 = kotlin.jvm.internal.Intrinsics.c(r0, r2)
        La0:
            if (r2 == 0) goto L77
            r14 = r0
            goto La5
        La4:
            r14 = r1
        La5:
            if (r14 == 0) goto Lab
            r8.remove(r14)
            goto Lac
        Lab:
            r14 = r1
        Lac:
            if (r14 == 0) goto L65
            r13.add(r14)
            goto L65
        Lb2:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor.k(java.util.List, au.com.woolworths.foundation.advertising.data.google.model.GoogleAdConsumer, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.io.Serializable");
    }
}
