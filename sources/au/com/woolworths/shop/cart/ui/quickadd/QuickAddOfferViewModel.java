package au.com.woolworths.shop.cart.ui.quickadd;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductTrolleyData;
import au.com.woolworths.shop.cart.domain.interactor.QuickAddOfferInteractor;
import au.com.woolworths.shop.cart.domain.model.OfferProductList;
import au.com.woolworths.shop.cart.domain.model.PageResult;
import au.com.woolworths.shop.cart.ui.productreview.h;
import au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferContract;
import com.woolworths.R;
import dagger.assisted.AssistedFactory;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/cart/ui/quickadd/QuickAddOfferViewModel;", "Landroidx/lifecycle/ViewModel;", "Factory", "Companion", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class QuickAddOfferViewModel extends ViewModel {
    public static final long o;
    public static final /* synthetic */ int p = 0;
    public final String e;
    public final QuickAddOfferInteractor f;
    public final AnalyticsManager g;
    public final SharedFlowImpl h;
    public final MutableStateFlow i;
    public final SharedFlowImpl j;
    public final StateFlow k;
    public final SharedFlow l;
    public final Lazy m;
    public final Lazy n;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferViewModel$1", f = "QuickAddOfferViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/shop/cart/domain/model/PageResult;", "Lau/com/woolworths/shop/cart/domain/model/OfferProductList;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferViewModel$1$2", f = "QuickAddOfferViewModel.kt", l = {89}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferViewModel$1$2, reason: invalid class name */
        final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super PageResult<? extends OfferProductList>>, Object> {
            public int p;
            public final /* synthetic */ QuickAddOfferViewModel q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(QuickAddOfferViewModel quickAddOfferViewModel, Continuation continuation) {
                super(1, continuation);
                this.q = quickAddOfferViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new AnonymousClass2(this.q, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ((AnonymousClass2) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                int i = this.p;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    return obj;
                }
                ResultKt.b(obj);
                QuickAddOfferViewModel quickAddOfferViewModel = this.q;
                QuickAddOfferInteractor quickAddOfferInteractor = quickAddOfferViewModel.f;
                QuickAddOfferContract.Content content = ((QuickAddOfferContract.ViewState) quickAddOfferViewModel.i.getValue()).b;
                QuickAddOfferContract.Content.Success success = content instanceof QuickAddOfferContract.Content.Success ? (QuickAddOfferContract.Content.Success) content : null;
                Map map = success != null ? success.b : EmptyMap.d;
                this.p = 1;
                Object objB = quickAddOfferInteractor.b(map, this);
                return objB == coroutineSingletons ? coroutineSingletons : objB;
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return QuickAddOfferViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            final QuickAddOfferViewModel quickAddOfferViewModel = QuickAddOfferViewModel.this;
            MutableStateFlow mutableStateFlow = quickAddOfferViewModel.i;
            mutableStateFlow.setValue(QuickAddOfferContract.ViewState.b((QuickAddOfferContract.ViewState) mutableStateFlow.getValue(), null, 2));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(quickAddOfferViewModel, null);
            final int i = 0;
            Function0 function0 = new Function0() { // from class: au.com.woolworths.shop.cart.ui.quickadd.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i) {
                        case 0:
                            QuickAddOfferViewModel quickAddOfferViewModel2 = quickAddOfferViewModel;
                            QuickAddOfferViewModel.p6(quickAddOfferViewModel2);
                            quickAddOfferViewModel2.j.f(new QuickAddOfferContract.Action.ShowSnackBar(R.string.error_no_network));
                            break;
                        default:
                            QuickAddOfferViewModel quickAddOfferViewModel3 = quickAddOfferViewModel;
                            QuickAddOfferViewModel.p6(quickAddOfferViewModel3);
                            quickAddOfferViewModel3.j.f(new QuickAddOfferContract.Action.ShowSnackBar(R.string.quick_add_offer_update_server_error_message));
                            break;
                    }
                    return Unit.f24250a;
                }
            };
            final int i2 = 1;
            Function0 function02 = new Function0() { // from class: au.com.woolworths.shop.cart.ui.quickadd.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i2) {
                        case 0:
                            QuickAddOfferViewModel quickAddOfferViewModel2 = quickAddOfferViewModel;
                            QuickAddOfferViewModel.p6(quickAddOfferViewModel2);
                            quickAddOfferViewModel2.j.f(new QuickAddOfferContract.Action.ShowSnackBar(R.string.error_no_network));
                            break;
                        default:
                            QuickAddOfferViewModel quickAddOfferViewModel3 = quickAddOfferViewModel;
                            QuickAddOfferViewModel.p6(quickAddOfferViewModel3);
                            quickAddOfferViewModel3.j.f(new QuickAddOfferContract.Action.ShowSnackBar(R.string.quick_add_offer_update_server_error_message));
                            break;
                    }
                    return Unit.f24250a;
                }
            };
            BuildersKt.c(ViewModelKt.a(quickAddOfferViewModel), null, null, new QuickAddOfferViewModel$handleOfferOperation$1(anonymousClass2, quickAddOfferViewModel, new h(3), function0, function02, null), 3);
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/cart/ui/quickadd/QuickAddOfferViewModel$Companion;", "", "Lkotlin/time/Duration;", "DEBOUNCE_DURATION", "J", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @AssistedFactory
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/cart/ui/quickadd/QuickAddOfferViewModel$Factory;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        QuickAddOfferViewModel a(String str);
    }

    static {
        int i = Duration.g;
        o = DurationKt.g(1, DurationUnit.h);
    }

    public QuickAddOfferViewModel(String promotionId, QuickAddOfferInteractor quickAddOfferInteractor, AnalyticsManager analyticsManager) {
        Intrinsics.h(promotionId, "promotionId");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = promotionId;
        this.f = quickAddOfferInteractor;
        this.g = analyticsManager;
        BufferOverflow bufferOverflow = BufferOverflow.e;
        SharedFlowImpl sharedFlowImplA = SharedFlowKt.a(0, 1, bufferOverflow);
        this.h = sharedFlowImplA;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new QuickAddOfferContract.ViewState(false, QuickAddOfferContract.Content.Empty.f10531a));
        this.i = mutableStateFlowA;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, bufferOverflow, 1);
        this.j = sharedFlowImplB;
        this.k = FlowKt.b(mutableStateFlowA);
        this.l = FlowKt.a(sharedFlowImplB);
        this.m = LazyKt.b(new au.com.woolworths.rewards.base.d(11));
        this.n = LazyKt.b(new au.com.woolworths.rewards.base.d(12));
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(null), FlowKt.p(sharedFlowImplA, o)), ViewModelKt.a(this));
    }

    public static final void p6(QuickAddOfferViewModel quickAddOfferViewModel) {
        MutableStateFlow mutableStateFlow = quickAddOfferViewModel.i;
        QuickAddOfferContract.Content contentA = ((QuickAddOfferContract.ViewState) mutableStateFlow.getValue()).b;
        if (contentA instanceof QuickAddOfferContract.Content.Success) {
            contentA = QuickAddOfferContract.Content.Success.a((QuickAddOfferContract.Content.Success) contentA, EmptyMap.d);
        }
        mutableStateFlow.setValue(QuickAddOfferContract.ViewState.a(false, contentA));
    }

    public final void q6() {
        MutableStateFlow mutableStateFlow = this.i;
        mutableStateFlow.setValue(QuickAddOfferContract.ViewState.b((QuickAddOfferContract.ViewState) mutableStateFlow.getValue(), null, 2));
        QuickAddOfferViewModel$loadOffers$2 quickAddOfferViewModel$loadOffers$2 = new QuickAddOfferViewModel$loadOffers$2(this, null);
        QuickAddOfferViewModel$loadOffers$3 quickAddOfferViewModel$loadOffers$3 = new QuickAddOfferViewModel$loadOffers$3(0, this, QuickAddOfferViewModel.class, "onLoadOffersNetworkError", "onLoadOffersNetworkError()V", 0);
        QuickAddOfferViewModel$loadOffers$4 quickAddOfferViewModel$loadOffers$4 = new QuickAddOfferViewModel$loadOffers$4(0, this, QuickAddOfferViewModel.class, "onLoadOffersServerError", "onLoadOffersServerError()V", 0);
        BuildersKt.c(ViewModelKt.a(this), null, null, new QuickAddOfferViewModel$handleOfferOperation$1(quickAddOfferViewModel$loadOffers$2, this, new au.com.woolworths.product.details.d(this, 9), quickAddOfferViewModel$loadOffers$3, quickAddOfferViewModel$loadOffers$4, null), 3);
    }

    public final void r6(ProductCard productCard, double d) {
        double dDoubleValue;
        MutableStateFlow mutableStateFlow = this.i;
        QuickAddOfferContract.ViewState viewState = (QuickAddOfferContract.ViewState) mutableStateFlow.getValue();
        QuickAddOfferContract.Content content = viewState.b;
        QuickAddOfferContract.Content.Success success = content instanceof QuickAddOfferContract.Content.Success ? (QuickAddOfferContract.Content.Success) content : null;
        if (success == null) {
            return;
        }
        Map map = success.b;
        Double d2 = (Double) map.get(productCard.getProductId());
        if (d2 != null) {
            dDoubleValue = d2.doubleValue();
        } else {
            ProductTrolleyData trolley = productCard.getTrolley();
            Double inTrolley = trolley != null ? trolley.getInTrolley() : null;
            dDoubleValue = inTrolley != null ? inTrolley.doubleValue() : 0.0d;
        }
        mutableStateFlow.setValue(QuickAddOfferContract.ViewState.b(viewState, QuickAddOfferContract.Content.Success.a(success, MapsKt.n(map, new Pair(productCard.getProductId(), Double.valueOf(dDoubleValue + d)))), 1));
    }
}
