package au.com.woolworths.feature.shop.bundles;

import androidx.lifecycle.ViewModelKt;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.PagingData;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.analytics.model.AnalyticsDataKt$getScreen$1;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.feature.shop.bundles.data.BundlesData;
import au.com.woolworths.feature.shop.bundles.data.BundlesProductCardConfig;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¨\u0006\u0006"}, d2 = {"<anonymous>", "", "R", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/FlowCollector;", "it", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.bundles.BundlesViewModel$fetchBundles$$inlined$flatMapLatest$1", f = "BundlesViewModel.kt", l = {189}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BundlesViewModel$fetchBundles$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super PagingData<Object>>, PagingParams, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ FlowCollector q;
    public /* synthetic */ Object r;
    public final /* synthetic */ BundlesViewModel s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundlesViewModel$fetchBundles$$inlined$flatMapLatest$1(BundlesViewModel bundlesViewModel, Continuation continuation) {
        super(3, continuation);
        this.s = bundlesViewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BundlesViewModel$fetchBundles$$inlined$flatMapLatest$1 bundlesViewModel$fetchBundles$$inlined$flatMapLatest$1 = new BundlesViewModel$fetchBundles$$inlined$flatMapLatest$1(this.s, (Continuation) obj3);
        bundlesViewModel$fetchBundles$$inlined$flatMapLatest$1.q = (FlowCollector) obj;
        bundlesViewModel$fetchBundles$$inlined$flatMapLatest$1.r = obj2;
        return bundlesViewModel$fetchBundles$$inlined$flatMapLatest$1.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = this.q;
            PagingParams pagingParams = (PagingParams) this.r;
            boolean z = pagingParams.e;
            final BundlesViewModel bundlesViewModel = this.s;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new BundlesViewModel$fetchBundles$4$3(bundlesViewModel, null), CachedPagingDataKt.a(z ? new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(PagingData.Companion.a()) : bundlesViewModel.f.f(pagingParams.f6746a, pagingParams.d, pagingParams.c, pagingParams.b, new Function1<BundlesData, Unit>() { // from class: au.com.woolworths.feature.shop.bundles.BundlesViewModel$fetchBundles$4$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Object value;
                    BundlesData it = (BundlesData) obj2;
                    Intrinsics.h(it, "it");
                    BundlesViewModel bundlesViewModel2 = bundlesViewModel;
                    MutableStateFlow mutableStateFlow = bundlesViewModel2.m;
                    AnalyticsManager analyticsManager = bundlesViewModel2.l;
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.d(value, BundlesUiState.a((BundlesUiState) value, null, bundlesViewModel2.g.b.z(), it, false, BundlesProductCardConfig.a(BundlesProductCardConfig.e, bundlesViewModel2.h.b(), false, bundlesViewModel2.i.d(), bundlesViewModel2.j.c(BaseShopAppFeature.f), 110), EmptyMap.d, EmptyMap.d, null, null, 1)));
                    if (it instanceof BundlesData.BundlesLandingPage) {
                        BundlesData.BundlesLandingPage bundlesLandingPage = (BundlesData.BundlesLandingPage) it;
                        AnalyticsData analyticsData = bundlesLandingPage.d;
                        if (analyticsData != null) {
                            analyticsManager.f(new AnalyticsDataKt$getScreen$1(AnalyticsDataKt.b(AnalyticsDataKt.a(analyticsData), bundlesLandingPage.c)));
                        }
                    } else {
                        if (!(it instanceof BundlesData.BundlesLandingErrorPage)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        BundlesData.BundlesLandingErrorPage bundlesLandingErrorPage = (BundlesData.BundlesLandingErrorPage) it;
                        AnalyticsData analyticsData2 = bundlesLandingErrorPage.f;
                        if (analyticsData2 != null) {
                            analyticsManager.f(new AnalyticsDataKt$getScreen$1(AnalyticsDataKt.b(AnalyticsDataKt.a(analyticsData2), bundlesLandingErrorPage.e)));
                        }
                    }
                    return Unit.f24250a;
                }
            }, new Function1<Exception, Unit>() { // from class: au.com.woolworths.feature.shop.bundles.BundlesViewModel$fetchBundles$4$2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Object value;
                    Object value2;
                    Exception loadError = (Exception) obj2;
                    Intrinsics.h(loadError, "loadError");
                    BundlesViewModel bundlesViewModel2 = bundlesViewModel;
                    MutableStateFlow mutableStateFlow = bundlesViewModel2.m;
                    CartUpdateInteractor cartUpdateInteractor = bundlesViewModel2.g;
                    if (((BundlesUiState) mutableStateFlow.getValue()).c == null) {
                        if (loadError instanceof NoConnectivityException) {
                            do {
                                value2 = mutableStateFlow.getValue();
                            } while (!mutableStateFlow.d(value2, BundlesUiState.a((BundlesUiState) value2, null, cartUpdateInteractor.b.z(), null, false, null, null, null, null, FullPageMessage.Error.ConnectionError.f8915a, 253)));
                        } else if (loadError instanceof ServerErrorException) {
                            do {
                                value = mutableStateFlow.getValue();
                            } while (!mutableStateFlow.d(value, BundlesUiState.a((BundlesUiState) value, null, cartUpdateInteractor.b.z(), null, false, null, null, null, null, FullPageMessage.Error.ServerError.f8916a, 253)));
                        }
                    }
                    return Unit.f24250a;
                }
            }), ViewModelKt.a(bundlesViewModel)));
            this.p = 1;
            if (FlowKt.u(flowCollector, flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
