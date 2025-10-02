package au.com.woolworths.foundation.force.upgrade.impl;

import androidx.datastore.preferences.core.PreferencesKt;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.repository.ReleaseSettingsInteractorImpl;
import au.com.woolworths.foundation.force.upgrade.AppConfigClient;
import au.com.woolworths.foundation.force.upgrade.data.SoftUpgradeAlertBanner;
import au.com.woolworths.foundation.force.upgrade.data.UpgradePromptType;
import au.com.woolworths.foundation.force.upgrade.shop.ShopAppConfigFetcher;
import java.time.Clock;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/impl/AppConfigClientImpl;", "Lau/com/woolworths/foundation/force/upgrade/AppConfigClient;", "Companion", "force-upgrade-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppConfigClientImpl implements AppConfigClient {

    /* renamed from: a, reason: collision with root package name */
    public final ShopAppConfigFetcher f8505a;
    public final AppConfigRepositoryImpl b;
    public final ReleaseSettingsInteractorImpl c;
    public final RewardsAccountInteractor d;
    public final SoftUpgradeAlertBannerSessionImpl e;
    public final Clock f;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.foundation.force.upgrade.impl.AppConfigClientImpl$1", f = "AppConfigClientImpl.kt", l = {46}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.foundation.force.upgrade.impl.AppConfigClientImpl$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public SoftUpgradeAlertBannerSessionImpl p;
        public int q;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return AppConfigClientImpl.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SoftUpgradeAlertBannerSessionImpl softUpgradeAlertBannerSessionImpl;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.q;
            if (i == 0) {
                ResultKt.b(obj);
                AppConfigClientImpl appConfigClientImpl = AppConfigClientImpl.this;
                SoftUpgradeAlertBannerSessionImpl softUpgradeAlertBannerSessionImpl2 = appConfigClientImpl.e;
                AppConfigRepositoryImpl appConfigRepositoryImpl = appConfigClientImpl.b;
                this.p = softUpgradeAlertBannerSessionImpl2;
                this.q = 1;
                obj = FlowKt.y(appConfigRepositoryImpl.b.getD(), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                softUpgradeAlertBannerSessionImpl = softUpgradeAlertBannerSessionImpl2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                softUpgradeAlertBannerSessionImpl = this.p;
                ResultKt.b(obj);
            }
            softUpgradeAlertBannerSessionImpl.a((SoftUpgradeAlertBanner) obj);
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/impl/AppConfigClientImpl$Companion;", "", "", "NEXT_FETCH_AFTER_IN_HOURS", "J", "force-upgrade-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8506a;

        static {
            int[] iArr = new int[UpgradePromptType.values().length];
            try {
                UpgradePromptType.Companion companion = UpgradePromptType.INSTANCE;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                UpgradePromptType.Companion companion2 = UpgradePromptType.INSTANCE;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f8506a = iArr;
        }
    }

    public AppConfigClientImpl(ShopAppConfigFetcher shopAppConfigFetcher, AppConfigRepositoryImpl appConfigRepositoryImpl, ReleaseSettingsInteractorImpl releaseSettingsInteractorImpl, RewardsAccountInteractor rewardsAccountInteractor, Clock clock) {
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        DefaultIoScheduler dispatcher = DefaultIoScheduler.f;
        Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
        Intrinsics.h(dispatcher, "dispatcher");
        this.f8505a = shopAppConfigFetcher;
        this.b = appConfigRepositoryImpl;
        this.c = releaseSettingsInteractorImpl;
        this.d = rewardsAccountInteractor;
        this.e = SoftUpgradeAlertBannerSessionImpl.f8508a;
        this.f = clock;
        BuildersKt.c(GlobalScope.d, dispatcher, null, new AnonymousClass1(null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r5, java.lang.String r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r7 instanceof au.com.woolworths.foundation.force.upgrade.impl.AppConfigClientImpl$fetchLatestAppConfig$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.foundation.force.upgrade.impl.AppConfigClientImpl$fetchLatestAppConfig$1 r0 = (au.com.woolworths.foundation.force.upgrade.impl.AppConfigClientImpl$fetchLatestAppConfig$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.foundation.force.upgrade.impl.AppConfigClientImpl$fetchLatestAppConfig$1 r0 = new au.com.woolworths.foundation.force.upgrade.impl.AppConfigClientImpl$fetchLatestAppConfig$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Exception -> L27
            goto L3f
        L27:
            r5 = move-exception
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r7)
            au.com.woolworths.foundation.force.upgrade.shop.ShopAppConfigFetcher r7 = r4.f8505a     // Catch: java.lang.Exception -> L27
            r0.r = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r7 = r7.a(r5, r6, r0)     // Catch: java.lang.Exception -> L27
            if (r7 != r1) goto L3f
            return r1
        L3f:
            au.com.woolworths.foundation.force.upgrade.common.data.AppConfigData r7 = (au.com.woolworths.foundation.force.upgrade.common.data.AppConfigData) r7     // Catch: java.lang.Exception -> L27
            return r7
        L42:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 != 0) goto L48
            r5 = 0
            return r5
        L48:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.force.upgrade.impl.AppConfigClientImpl.a(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f5, code lost:
    
        if (e(r11, r0) == r1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f9, code lost:
    
        r11 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0165, code lost:
    
        if (e(0, r0) == r1) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0141 A[PHI: r11
  0x0141: PHI (r11v22 au.com.woolworths.foundation.force.upgrade.data.UpgradeConfig) = 
  (r11v16 au.com.woolworths.foundation.force.upgrade.data.UpgradeConfig)
  (r11v24 au.com.woolworths.foundation.force.upgrade.data.UpgradeConfig)
 binds: [B:65:0x013d, B:16:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c3 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r11, java.lang.String r12, java.lang.Boolean r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.force.upgrade.impl.AppConfigClientImpl.b(java.lang.String, java.lang.String, java.lang.Boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        if (r3.b(r2, r0) != r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof au.com.woolworths.foundation.force.upgrade.impl.AppConfigClientImpl$markSoftUpgradeAlertBannerAsSeen$1
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.foundation.force.upgrade.impl.AppConfigClientImpl$markSoftUpgradeAlertBannerAsSeen$1 r0 = (au.com.woolworths.foundation.force.upgrade.impl.AppConfigClientImpl$markSoftUpgradeAlertBannerAsSeen$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.foundation.force.upgrade.impl.AppConfigClientImpl$markSoftUpgradeAlertBannerAsSeen$1 r0 = new au.com.woolworths.foundation.force.upgrade.impl.AppConfigClientImpl$markSoftUpgradeAlertBannerAsSeen$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            au.com.woolworths.foundation.force.upgrade.impl.AppConfigRepositoryImpl r3 = r7.b
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3f
            if (r2 == r6) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            kotlin.ResultKt.b(r8)
            goto L77
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            kotlin.ResultKt.b(r8)
            goto L58
        L3b:
            kotlin.ResultKt.b(r8)
            goto L4d
        L3f:
            kotlin.ResultKt.b(r8)
            r0.r = r6
            androidx.datastore.core.DataStore r8 = r3.b
            kotlinx.coroutines.flow.Flow r8 = r8.getD()
            if (r8 != r1) goto L4d
            goto L76
        L4d:
            kotlinx.coroutines.flow.Flow r8 = (kotlinx.coroutines.flow.Flow) r8
            r0.r = r5
            java.lang.Object r8 = kotlinx.coroutines.flow.FlowKt.y(r8, r0)
            if (r8 != r1) goto L58
            goto L76
        L58:
            au.com.woolworths.foundation.force.upgrade.data.SoftUpgradeAlertBanner r8 = (au.com.woolworths.foundation.force.upgrade.data.SoftUpgradeAlertBanner) r8
            if (r8 == 0) goto L77
            boolean r2 = r8.f8499a
            if (r2 != 0) goto L77
            au.com.woolworths.foundation.force.upgrade.data.SoftUpgradeAlertBanner r2 = new au.com.woolworths.foundation.force.upgrade.data.SoftUpgradeAlertBanner
            au.com.woolworths.foundation.force.upgrade.data.UpgradeConfig r8 = r8.b
            r2.<init>(r6, r8)
            au.com.woolworths.foundation.force.upgrade.impl.SoftUpgradeAlertBannerSessionImpl r8 = r7.e
            r8.getClass()
            au.com.woolworths.foundation.force.upgrade.impl.SoftUpgradeAlertBannerSessionImpl.b = r2
            r0.r = r4
            java.lang.Object r8 = r3.b(r2, r0)
            if (r8 != r1) goto L77
        L76:
            return r1
        L77:
            kotlin.Unit r8 = kotlin.Unit.f24250a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.force.upgrade.impl.AppConfigClientImpl.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.Boolean r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.foundation.force.upgrade.impl.AppConfigClientImpl$shouldFetchAppConfig$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.foundation.force.upgrade.impl.AppConfigClientImpl$shouldFetchAppConfig$1 r0 = (au.com.woolworths.foundation.force.upgrade.impl.AppConfigClientImpl$shouldFetchAppConfig$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.foundation.force.upgrade.impl.AppConfigClientImpl$shouldFetchAppConfig$1 r0 = new au.com.woolworths.foundation.force.upgrade.impl.AppConfigClientImpl$shouldFetchAppConfig$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r6)
            goto L46
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.b(r6)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r5 = kotlin.jvm.internal.Intrinsics.c(r5, r6)
            if (r5 == 0) goto L3b
            return r6
        L3b:
            r0.r = r3
            au.com.woolworths.foundation.force.upgrade.impl.AppConfigRepositoryImpl r5 = r4.b
            java.lang.Object r6 = r5.a(r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            java.lang.Number r6 = (java.lang.Number) r6
            long r5 = r6.longValue()
            java.time.Clock r0 = r4.f
            java.time.Instant r0 = r0.instant()
            long r0 = r0.getEpochSecond()
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 >= 0) goto L5b
            goto L5c
        L5b:
            r3 = 0
        L5c:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.force.upgrade.impl.AppConfigClientImpl.d(java.lang.Boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object e(long j, Continuation continuation) {
        AppConfigRepositoryImpl appConfigRepositoryImpl = this.b;
        Object objA = PreferencesKt.a(appConfigRepositoryImpl.c, new AppConfigRepositoryImpl$storeAppConfigNextFetchAfter$2(appConfigRepositoryImpl, j, null), continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        Unit unit = Unit.f24250a;
        if (objA != coroutineSingletons) {
            objA = unit;
        }
        return objA == coroutineSingletons ? objA : unit;
    }
}
