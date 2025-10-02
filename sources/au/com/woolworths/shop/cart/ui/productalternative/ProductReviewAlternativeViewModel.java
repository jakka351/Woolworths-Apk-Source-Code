package au.com.woolworths.shop.cart.ui.productalternative;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.analytics.supers.productreview.ProductReviewAlternativeAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.cart.domain.interactor.ProductReviewAlternativeFetchPage;
import au.com.woolworths.shop.cart.domain.model.PageResult;
import au.com.woolworths.shop.cart.domain.model.ProductReviewCard;
import au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeContract;
import au.com.woolworths.shop.cart.ui.productreview.ProductReviewCardExtKt;
import au.com.woolworths.shop.cart.ui.productreview.ReplaceProductResultRouter;
import dagger.assisted.AssistedFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productalternative/ProductReviewAlternativeViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/shop/cart/ui/productalternative/ProductsReviewAlternativeCallbacks;", "Factory", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductReviewAlternativeViewModel extends ViewModel implements ProductsReviewAlternativeCallbacks {
    public final String e;
    public final ProductReviewAlternativeFetchPage f;
    public final ReplaceProductResultRouter g;
    public final ProductReviewAlternativeAnalytics h;
    public final MutableStateFlow i;
    public final BufferedChannel j;
    public final StateFlow k;
    public final Flow l;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeViewModel$1", f = "ProductReviewAlternativeViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        public /* synthetic */ boolean p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = ProductReviewAlternativeViewModel.this.new AnonymousClass1(continuation);
            anonymousClass1.p = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(bool, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            if (this.p) {
                ProductReviewAlternativeViewModel productReviewAlternativeViewModel = ProductReviewAlternativeViewModel.this;
                MutableStateFlow mutableStateFlow = productReviewAlternativeViewModel.i;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value, ProductReviewAlternativeContract.ViewState.a((ProductReviewAlternativeContract.ViewState) value, false, false, null, 7)));
                productReviewAlternativeViewModel.g.c.setValue(Boolean.FALSE);
            }
            return Unit.f24250a;
        }
    }

    @AssistedFactory
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productalternative/ProductReviewAlternativeViewModel$Factory;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        ProductReviewAlternativeViewModel a(String str);
    }

    public ProductReviewAlternativeViewModel(String str, ProductReviewAlternativeFetchPage productReviewAlternativeFetchPage, ReplaceProductResultRouter replaceProductResultRouter, ProductReviewAlternativeAnalytics productReviewAlternativeAnalytics) {
        Intrinsics.h(replaceProductResultRouter, "replaceProductResultRouter");
        this.e = str;
        this.f = productReviewAlternativeFetchPage;
        this.g = replaceProductResultRouter;
        this.h = productReviewAlternativeAnalytics;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new ProductReviewAlternativeContract.ViewState(false, false, PageResult.Uninitialized.f10439a, false));
        this.i = mutableStateFlowA;
        BufferedChannel bufferedChannelA = ChannelKt.a(-2, 4, BufferOverflow.e);
        this.j = bufferedChannelA;
        this.k = mutableStateFlowA;
        this.l = FlowKt.I(bufferedChannelA);
        p6();
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(null), replaceProductResultRouter.d), ViewModelKt.a(this));
    }

    @Override // au.com.woolworths.shop.cart.ui.productalternative.ProductsReviewAlternativeCallbacks
    public final void I3(AnalyticsData analyticsData) {
        MutableStateFlow mutableStateFlow;
        Object value;
        ProductReviewAlternativeAnalytics productReviewAlternativeAnalytics = this.h;
        productReviewAlternativeAnalytics.getClass();
        productReviewAlternativeAnalytics.f10502a.g(AnalyticsDataKt.b(ProductReviewAlternativeAnalytics.ProductReviewAlternatives.d, analyticsData));
        do {
            mutableStateFlow = this.i;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, ProductReviewAlternativeContract.ViewState.a((ProductReviewAlternativeContract.ViewState) value, false, true, null, 13)));
    }

    @Override // au.com.woolworths.shop.cart.ui.productalternative.ProductsReviewAlternativeCallbacks
    public final void K2() {
        MutableStateFlow mutableStateFlow;
        Object value;
        do {
            mutableStateFlow = this.i;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, ProductReviewAlternativeContract.ViewState.a((ProductReviewAlternativeContract.ViewState) value, false, false, null, 13)));
    }

    @Override // au.com.woolworths.shop.cart.ui.productalternative.ProductsReviewAlternativeCallbacks
    public final void U0(AnalyticsData analyticsData) {
        MutableStateFlow mutableStateFlow;
        Object value;
        if (analyticsData != null) {
            ProductReviewAlternativeAnalytics productReviewAlternativeAnalytics = this.h;
            productReviewAlternativeAnalytics.getClass();
            productReviewAlternativeAnalytics.f10502a.g(AnalyticsDataKt.b(ProductReviewAlternativeAnalytics.ProductReviewAlternatives.d, analyticsData));
        }
        do {
            mutableStateFlow = this.i;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, ProductReviewAlternativeContract.ViewState.a((ProductReviewAlternativeContract.ViewState) value, false, false, null, 13)));
    }

    @Override // au.com.woolworths.shop.cart.ui.productalternative.ProductsReviewAlternativeCallbacks
    public final void i1() {
        this.j.k(ProductReviewAlternativeContract.Actions.NavigateBack.f10504a);
    }

    @Override // au.com.woolworths.shop.cart.ui.productalternative.ProductsReviewAlternativeCallbacks
    public final void j1(ProductReviewCard productReviewCard, ProductCard productToReplaceWith) {
        String string;
        Intrinsics.h(productToReplaceWith, "productToReplaceWith");
        ProductReviewAlternativeAnalytics productReviewAlternativeAnalytics = this.h;
        productReviewAlternativeAnalytics.getClass();
        AnalyticsManager analyticsManager = productReviewAlternativeAnalytics.f10502a;
        ProductReviewAlternativeAnalytics.ProductReviewAlternatives.Action.Companion companion = ProductReviewAlternativeAnalytics.ProductReviewAlternatives.Action.d;
        final List listQ = CollectionsKt.Q(productReviewCard.b);
        final List listQ2 = CollectionsKt.Q(productToReplaceWith.getProductId());
        final List listQ3 = CollectionsKt.Q(productToReplaceWith.getName());
        if (productToReplaceWith.getPrice() == null || (string = Float.valueOf(r5.intValue() / 100.0f).toString()) == null) {
            string = "";
        }
        final List listQ4 = CollectionsKt.Q(string);
        companion.getClass();
        analyticsManager.g(new Event(listQ, listQ2, listQ3, listQ4) { // from class: au.com.woolworths.analytics.supers.productreview.ProductReviewAlternativeAnalytics$ProductReviewAlternatives$Action$Companion$replaceInitiated$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(8);
                spreadBuilder.b(ProductReviewAlternativeAnalytics.ProductReviewAlternatives.f);
                spreadBuilder.a(new Pair("event.Action", "click"));
                spreadBuilder.a(new Pair("event.Category", "Product Out of Stock: View Similar Items"));
                spreadBuilder.a(new Pair("event.Label", "Replace product initiated"));
                spreadBuilder.a(new Pair("product.ID", listQ));
                spreadBuilder.a(new Pair("product.ReplacedItemID", listQ2));
                spreadBuilder.a(new Pair("product.ReplacedItemName", listQ3));
                spreadBuilder.a(new Pair("product.ReplacedItemPrice", listQ4));
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                return "product_alternatives_replacement_initiated";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "product_alternatives_replacement_initiated".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
        this.j.k(new ProductReviewAlternativeContract.Actions.DisplayAddToCartBottomSheet(ProductReviewCardExtKt.a(ProductReviewCard.a(productReviewCard, 0.0d, null, null, null, null, 2043)), productToReplaceWith));
    }

    public final void p6() {
        MutableStateFlow mutableStateFlow;
        Object value;
        do {
            mutableStateFlow = this.i;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, ProductReviewAlternativeContract.ViewState.a((ProductReviewAlternativeContract.ViewState) value, true, false, null, 14)));
        BuildersKt.c(ViewModelKt.a(this), null, null, new ProductReviewAlternativeViewModel$fetchPage$2(this, null), 3);
    }

    @Override // au.com.woolworths.shop.cart.ui.productalternative.ProductsReviewAlternativeCallbacks
    public final void q(ProductCard productCard) {
        this.j.k(new ProductReviewAlternativeContract.Actions.NavigateToSearch(productCard));
    }

    @Override // au.com.woolworths.shop.cart.ui.productalternative.ProductsReviewAlternativeCallbacks
    public final void q5(AnalyticsData analyticsData) {
        ProductReviewAlternativeAnalytics productReviewAlternativeAnalytics = this.h;
        productReviewAlternativeAnalytics.getClass();
        productReviewAlternativeAnalytics.f10502a.g(AnalyticsDataKt.b(ProductReviewAlternativeAnalytics.ProductReviewAlternatives.d, analyticsData));
    }

    @Override // au.com.woolworths.shop.cart.ui.productalternative.ProductsReviewAlternativeCallbacks
    public final void z() {
        p6();
    }
}
