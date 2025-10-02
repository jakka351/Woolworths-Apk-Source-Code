package au.com.woolworths.android.onesite.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.appdata.AppBuildConfig;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.TrolleyResult;
import au.com.woolworths.android.onesite.models.TrolleyUpdateData;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.e;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardData;
import au.com.woolworths.android.onesite.network.ApiInterface;
import au.com.woolworths.android.onesite.network.TrolleyUrlUtil;
import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.android.onesite.utils.preload.PreLoader;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.TrolleyInteractor;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.cart.data.CartRepositoryImpl;
import io.reactivex.Single;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.ConsumerSingleObserver;
import io.reactivex.internal.operators.single.SingleMap;
import io.reactivex.internal.operators.single.SingleResumeNext;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.rx2.RxSingleKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u0002¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/android/onesite/repository/TrolleyInteractorImpl;", "Lau/com/woolworths/base/shopapp/TrolleyInteractor;", "Lau/com/woolworths/android/onesite/utils/preload/PreLoader;", "Lau/com/woolworths/android/onesite/rxutils/Result;", "Lau/com/woolworths/android/onesite/models/TrolleyResult;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Singleton
@SourceDebugExtension
/* loaded from: classes.dex */
public final class TrolleyInteractorImpl extends PreLoader<Result<? extends TrolleyResult>> implements TrolleyInteractor {
    public final ApiInterface e;
    public final RewardsAccountInteractor f;
    public final ShopAccountInteractor g;
    public final SchedulersProvider h;
    public final DispatcherProvider i;
    public final AppBuildConfig j;
    public final CartRepositoryImpl k;
    public final FeatureToggleManager l;
    public final TrolleyResultMapper m;
    public final CollectionModeInteractor n;
    public final MutableStateFlow o;
    public final StateFlow p;

    public TrolleyInteractorImpl(ApiInterface apiInterface, RewardsAccountInteractor rewardsInteractor, ShopAccountInteractor accountInteractor, SchedulersProvider schedulersProvider, DispatcherProvider dispatcherProvider, AppBuildConfig appBuildConfig, CartRepositoryImpl cartRepositoryImpl, FeatureToggleManager featureToggleManager, TrolleyResultMapper trolleyResultMapper, CollectionModeInteractor collectionModeInteractor) {
        Intrinsics.h(apiInterface, "apiInterface");
        Intrinsics.h(rewardsInteractor, "rewardsInteractor");
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(schedulersProvider, "schedulersProvider");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        Intrinsics.h(appBuildConfig, "appBuildConfig");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        this.e = apiInterface;
        this.f = rewardsInteractor;
        this.g = accountInteractor;
        this.h = schedulersProvider;
        this.i = dispatcherProvider;
        this.j = appBuildConfig;
        this.k = cartRepositoryImpl;
        this.l = featureToggleManager;
        this.m = trolleyResultMapper;
        this.n = collectionModeInteractor;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(Result.Companion.b(new TrolleyResult()));
        this.o = mutableStateFlowA;
        this.p = FlowKt.b(mutableStateFlowA);
    }

    @Override // au.com.woolworths.base.shopapp.TrolleyInteractor
    public final Object E(TrolleyUpdateData trolleyUpdateData, Continuation continuation) {
        this.i.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new TrolleyInteractorImpl$addOrUpdateTrolleyItemsOld$2(this, trolleyUpdateData, null), continuation);
    }

    @Override // au.com.woolworths.base.shopapp.TrolleyInteractor
    public final void K() {
        this.o.f(Result.Companion.b(new TrolleyResult()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // au.com.woolworths.android.onesite.utils.preload.PreLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object T(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof au.com.woolworths.android.onesite.repository.TrolleyInteractorImpl$getData$1
            if (r0 == 0) goto L13
            r0 = r5
            au.com.woolworths.android.onesite.repository.TrolleyInteractorImpl$getData$1 r0 = (au.com.woolworths.android.onesite.repository.TrolleyInteractorImpl$getData$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.android.onesite.repository.TrolleyInteractorImpl$getData$1 r0 = new au.com.woolworths.android.onesite.repository.TrolleyInteractorImpl$getData$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r5)
            goto L47
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            kotlin.ResultKt.b(r5)
            au.com.woolworths.shop.auth.ShopAccountInteractor r5 = r4.g
            boolean r5 = r5.S()
            if (r5 == 0) goto L4d
            io.reactivex.internal.operators.single.SingleResumeNext r5 = r4.U()
            r0.r = r3
            java.lang.Object r5 = kotlinx.coroutines.rx2.RxAwaitKt.b(r5, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.g(r5, r0)
            return r5
        L4d:
            r5 = 0
            au.com.woolworths.android.onesite.rxutils.Result r5 = au.com.woolworths.android.onesite.rxutils.Result.Companion.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.repository.TrolleyInteractorImpl.T(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final SingleResumeNext U() {
        Single<TrolleyResult> singleD;
        String str = null;
        if (this.l.c(BaseShopAppFeature.d0)) {
            singleD = RxSingleKt.a(new TrolleyInteractorImpl$getRefreshTrolleySingle$1(this, null));
        } else {
            String strA = TrolleyUrlUtil.a(this.g, this.j);
            Intrinsics.g(strA, "getTrolleyUrl(...)");
            RewardsCardData cardData = this.f.getCardData();
            String number = cardData != null ? cardData.getNumber() : null;
            if (number != null && !StringsKt.D(number)) {
                str = number;
            }
            singleD = this.e.d(strA, str);
        }
        return new SingleResumeNext(new SingleMap(singleD.h(this.h.d()), new e(new a(this, 0), 13)), new e(new a(this, 1), 14));
    }

    @Override // au.com.woolworths.base.shopapp.TrolleyInteractor
    public final void d() {
        if (this.g.S()) {
            U().a(new ConsumerSingleObserver(Functions.d, Functions.e));
        }
    }

    @Override // au.com.woolworths.base.shopapp.TrolleyInteractor
    public final void n(TrolleyResult value) {
        Intrinsics.h(value, "value");
        this.o.f(Result.Companion.b(value));
    }

    @Override // au.com.woolworths.base.shopapp.TrolleyInteractor
    public final Object u(Continuation continuation) {
        Object objS = S((ContinuationImpl) continuation);
        return objS == CoroutineSingletons.d ? objS : Unit.f24250a;
    }

    @Override // au.com.woolworths.base.shopapp.TrolleyInteractor
    /* renamed from: v, reason: from getter */
    public final StateFlow getP() {
        return this.p;
    }

    @Override // au.com.woolworths.base.shopapp.TrolleyInteractor
    public final boolean z() {
        return this.l.c(BaseShopAppFeature.t) || !this.n.b();
    }
}
