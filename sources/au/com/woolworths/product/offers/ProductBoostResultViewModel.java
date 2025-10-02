package au.com.woolworths.product.offers;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.RewardsOfferAction;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.product.offers.ProductBoostContract;
import au.com.woolworths.product.offers.ProductBoostFailureCause;
import au.com.woolworths.product.offers.ProductBoostResult;
import au.com.woolworths.product.productbottomsheet.ProductBottomSheetActions;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/product/offers/ProductBoostResultViewModel;", "Landroidx/lifecycle/ViewModel;", "Companion", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductBoostResultViewModel extends ViewModel {
    public final ProductBoostInteractor e;
    public final AnalyticsManager f;
    public final SharedFlowImpl g;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.product.offers.ProductBoostResultViewModel$1", f = "ProductBoostResultViewModel.kt", l = {53}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.product.offers.ProductBoostResultViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", lqlqqlq.m006Dm006Dm006Dm, "Lau/com/woolworths/product/offers/ProductBoostResult;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.product.offers.ProductBoostResultViewModel$1$1", f = "ProductBoostResultViewModel.kt", l = {}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: au.com.woolworths.product.offers.ProductBoostResultViewModel$1$1, reason: invalid class name and collision with other inner class name */
        final class C02301 extends SuspendLambda implements Function2<ProductBoostResult, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ ProductBoostResultViewModel q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02301(ProductBoostResultViewModel productBoostResultViewModel, Continuation continuation) {
                super(2, continuation);
                this.q = productBoostResultViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C02301 c02301 = new C02301(this.q, continuation);
                c02301.p = obj;
                return c02301;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                C02301 c02301 = (C02301) create((ProductBoostResult) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                c02301.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                ProductBoostResult productBoostResult = (ProductBoostResult) this.p;
                ProductBoostResultViewModel productBoostResultViewModel = this.q;
                AnalyticsManager analyticsManager = productBoostResultViewModel.f;
                Object showSnackbar = null;
                if (productBoostResult instanceof ProductBoostResult.Success) {
                    ProductBoostResult.Success success = (ProductBoostResult.Success) productBoostResult;
                    Object obj2 = success.c;
                    boolean z = success.d;
                    TrackableBoostMetadata trackableBoostMetadata = success.e;
                    Object obj3 = success.f;
                    Iterable<ProductCard> iterable = (Iterable) obj2;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : iterable) {
                        RewardsOfferInfo rewardsOfferInfo = ((ProductCard) obj4).getRewardsOfferInfo();
                        if ((rewardsOfferInfo != null ? rewardsOfferInfo.getN() : null) == RewardsOfferStatus.NOT_ACTIVATED) {
                            arrayList.add(obj4);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        int size = arrayList.size();
                        String str = size == 1 ? "Unable to boost 1 offer" : String.format(Locale.getDefault(), "Unable to boost %d offers", Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(ProductAnalyticsExtKt.k((ProductCard) it.next(), RewardsOfferAction.g));
                        }
                        ProductBottomSheetActions.BoostRetryFailure boostRetryFailure = new ProductBottomSheetActions.BoostRetryFailure(trackableBoostMetadata.f9330a);
                        TrackingMetadata trackingMetadataA = ProductAnalyticsExtKt.a(arrayList2, trackableBoostMetadata.b, str);
                        if (trackingMetadataA != null) {
                            analyticsManager.j(boostRetryFailure, trackingMetadataA);
                        }
                        showSnackbar = new ProductBoostContract.Action.ShowRetrySnackbar(trackableBoostMetadata, obj3, str, arrayList);
                    } else if (z) {
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj5 : iterable) {
                            RewardsOfferInfo rewardsOfferInfo2 = ((ProductCard) obj5).getRewardsOfferInfo();
                            if ((rewardsOfferInfo2 != null ? rewardsOfferInfo2.getN() : null) == RewardsOfferStatus.ACTIVATED) {
                                arrayList3.add(obj5);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList(CollectionsKt.s(arrayList3, 10));
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(((ProductCard) it2.next()).getProductId());
                        }
                        ArrayList arrayList5 = new ArrayList(CollectionsKt.s(iterable, 10));
                        for (ProductCard productCardK : iterable) {
                            if (arrayList4.contains(productCardK.getProductId())) {
                                productCardK = ProductAnalyticsExtKt.k(productCardK, RewardsOfferAction.f);
                            }
                            arrayList5.add(productCardK);
                        }
                        ProductBottomSheetActions.BoostRetrySuccess boostRetrySuccess = new ProductBottomSheetActions.BoostRetrySuccess(trackableBoostMetadata.f9330a);
                        TrackingMetadata trackingMetadataA2 = ProductAnalyticsExtKt.a(arrayList5, trackableBoostMetadata.b, null);
                        if (trackingMetadataA2 != null) {
                            analyticsManager.j(boostRetrySuccess, trackingMetadataA2);
                        }
                        showSnackbar = new ProductBoostContract.Action.ShowSnackbar("Your Rewards offer has been boosted", obj3);
                    }
                } else {
                    if (!(productBoostResult instanceof ProductBoostResult.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ProductBoostResult.Failure failure = (ProductBoostResult.Failure) productBoostResult;
                    if (failure.c instanceof ProductBoostFailureCause.ServerError) {
                        showSnackbar = new ProductBoostContract.Action.ShowSnackbar("Unable to boost your Rewards offer", failure.f);
                    }
                }
                if (showSnackbar != null) {
                    productBoostResultViewModel.g.f(showSnackbar);
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ProductBoostResultViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                ProductBoostResultViewModel productBoostResultViewModel = ProductBoostResultViewModel.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new C02301(productBoostResultViewModel, null), productBoostResultViewModel.e.d);
                this.p = 1;
                if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Lau/com/woolworths/product/offers/ProductBoostResultViewModel$Companion;", "", "", "PRODUCT_BOOST_RETRY_SUCCESS", "Ljava/lang/String;", "PRODUCT_BOOST_FAILED", "PRODUCT_BOOST_RETRY_ACTION", "PRODUCT_BOOST_PARTIAL_FAILURE_ONE", "PRODUCT_BOOST_PARTIAL_FAILURE_OTHER", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ProductBoostResultViewModel(ProductBoostInteractor productBoostInteractor, AnalyticsManager analyticsManager) {
        Intrinsics.h(productBoostInteractor, "productBoostInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = productBoostInteractor;
        this.f = analyticsManager;
        this.g = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass1(null), 3);
    }

    public final void p6(TrackableBoostMetadata trackableBoostMetadata, Object obj, String str, ArrayList arrayList) {
        Intrinsics.h(trackableBoostMetadata, "trackableBoostMetadata");
        ProductBottomSheetActions.BoostRetryClick boostRetryClick = new ProductBottomSheetActions.BoostRetryClick(trackableBoostMetadata.f9330a);
        TrackingMetadata trackingMetadataA = ProductAnalyticsExtKt.a(arrayList, trackableBoostMetadata.b, str);
        if (trackingMetadataA != null) {
            this.f.j(boostRetryClick, trackingMetadataA);
        }
        BuildersKt.c(ViewModelKt.a(this), null, null, new ProductBoostResultViewModel$retryBoost$1(this, arrayList, trackableBoostMetadata, obj, null), 3);
    }
}
