package au.com.woolworths.shop.cart.ui.productreview;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.analytics.supers.productreview.ProductReviewAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.cart.domain.interactor.ProductReviewFetchPage;
import au.com.woolworths.shop.cart.domain.interactor.ProductReviewUpdateQuantityProduct;
import au.com.woolworths.shop.cart.domain.model.PageResult;
import au.com.woolworths.shop.cart.domain.model.ProductReviewCard;
import au.com.woolworths.shop.cart.domain.model.ProductReviewFeed;
import au.com.woolworths.shop.cart.domain.model.ProductReviewResult;
import au.com.woolworths.shop.cart.ui.productreview.ProductReviewContract;
import dagger.assisted.AssistedFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
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
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import timber.log.Timber;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/shop/cart/ui/productreview/ProductsReviewCallbacks;", "Factory", "Companion", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductReviewViewModel extends ViewModel implements ProductsReviewCallbacks {
    public static final Timber.Forest q;
    public final Activities.ProductsReviewActivity.Source e;
    public final ProductReviewFetchPage f;
    public final ProductReviewUpdateQuantityProduct g;
    public final CollectionModeInteractor h;
    public final ProductReviewAnalytics i;
    public final ReplaceProductResultRouter j;
    public final MutableStateFlow k;
    public final BufferedChannel l;
    public final SharedFlowImpl m;
    public final LinkedHashMap n;
    public final StateFlow o;
    public final Flow p;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.cart.ui.productreview.ProductReviewViewModel$1", f = "ProductReviewViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.cart.ui.productreview.ProductReviewViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        public /* synthetic */ boolean p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = ProductReviewViewModel.this.new AnonymousClass1(continuation);
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
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            if (this.p) {
                ProductReviewViewModel productReviewViewModel = ProductReviewViewModel.this;
                productReviewViewModel.p6(true);
                productReviewViewModel.j.f10527a.setValue(Boolean.FALSE);
            }
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.cart.ui.productreview.ProductReviewViewModel$2", f = "ProductReviewViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.shop.cart.ui.productreview.ProductReviewViewModel$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ProductReviewViewModel.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((Unit) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass2.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            ProductReviewViewModel productReviewViewModel = ProductReviewViewModel.this;
            Activities.ProductsReviewActivity.Source source = productReviewViewModel.e;
            LinkedHashMap linkedHashMap = productReviewViewModel.n;
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                arrayList.add(new Pair(entry.getKey(), entry.getValue()));
            }
            productReviewViewModel.q6(source, CollectionsKt.L0(arrayList), new f(productReviewViewModel, 1));
            linkedHashMap.clear();
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewViewModel$Companion;", "", "Ltimber/log/Timber$Tree;", "logger", "Ltimber/log/Timber$Tree;", "", "USER_INTERACTION_DELAY", "J", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @AssistedFactory
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewViewModel$Factory;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        ProductReviewViewModel a(Activities.ProductsReviewActivity.Source source);
    }

    static {
        Timber.Forest forest = Timber.f27013a;
        forest.s("ProductReviewViewModel");
        q = forest;
    }

    public ProductReviewViewModel(Activities.ProductsReviewActivity.Source source, ProductReviewFetchPage productReviewFetchPage, ProductReviewUpdateQuantityProduct productReviewUpdateQuantityProduct, CollectionModeInteractor collectionModeInteractor, ProductReviewAnalytics productReviewAnalytics, ReplaceProductResultRouter replaceProductResultRouter) {
        Intrinsics.h(source, "source");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(replaceProductResultRouter, "replaceProductResultRouter");
        this.e = source;
        this.f = productReviewFetchPage;
        this.g = productReviewUpdateQuantityProduct;
        this.h = collectionModeInteractor;
        this.i = productReviewAnalytics;
        this.j = replaceProductResultRouter;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new ProductReviewContract.ViewState(false, PageResult.Uninitialized.f10439a));
        this.k = mutableStateFlowA;
        BufferOverflow bufferOverflow = BufferOverflow.e;
        BufferedChannel bufferedChannelA = ChannelKt.a(-2, 4, bufferOverflow);
        this.l = bufferedChannelA;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, bufferOverflow, 1);
        this.m = sharedFlowImplB;
        this.n = new LinkedHashMap();
        this.o = mutableStateFlowA;
        this.p = FlowKt.I(bufferedChannelA);
        p6(false);
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(null), replaceProductResultRouter.b), ViewModelKt.a(this));
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass2(null), FlowKt.o(sharedFlowImplB, 1000L)), ViewModelKt.a(this));
    }

    @Override // au.com.woolworths.shop.cart.ui.productreview.ProductsReviewCallbacks
    public final void U2(ProductReviewCard productReviewCard) {
        Intrinsics.h(productReviewCard, "productReviewCard");
        Activities.ProductsReviewActivity.Source source = this.e;
        String str = source.d;
        ProductReviewAnalytics productReviewAnalytics = this.i;
        productReviewAnalytics.getClass();
        AnalyticsManager analyticsManager = productReviewAnalytics.f10512a;
        ProductReviewAnalytics.ProductReview productReview = new ProductReviewAnalytics.ProductReview(str);
        String str2 = productReviewCard.b;
        final List listQ = CollectionsKt.Q(str2);
        final List listQ2 = CollectionsKt.Q(productReviewCard.f10444a);
        final List listQ3 = CollectionsKt.Q(Boolean.valueOf(productReviewCard.h));
        Integer num = productReviewCard.g;
        String string = num != null ? num.toString() : null;
        if (string == null) {
            string = "";
        }
        final List listQ4 = CollectionsKt.Q(string);
        final List listQ5 = CollectionsKt.Q(Double.valueOf(productReviewCard.c));
        final List listQ6 = CollectionsKt.Q(ProductReviewAnalytics.a(productReviewCard));
        final List listQ7 = CollectionsKt.Q(productReviewCard.d);
        final ProductReviewAnalytics.ProductReview.Action action = productReview.h;
        action.getClass();
        analyticsManager.g(new Event(action, listQ, listQ2, listQ3, listQ4, listQ5, listQ6, listQ7) { // from class: au.com.woolworths.analytics.supers.productreview.ProductReviewAnalytics$ProductReview$Action$removeProduct$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(15);
                spreadBuilder.b(action.f4044a.g);
                spreadBuilder.a(new Pair("event.Category", "cart"));
                spreadBuilder.a(new Pair("event.Action", "button_click"));
                spreadBuilder.a(new Pair("event.Label", "x remove"));
                spreadBuilder.a(new Pair("product.ID", listQ));
                spreadBuilder.a(new Pair("product.Name", listQ2));
                List list = listQ3;
                ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
                }
                spreadBuilder.a(new Pair("product.Availability", arrayList));
                spreadBuilder.a(new Pair("product.Price", listQ4));
                List list2 = listQ5;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(String.valueOf(((Number) it2.next()).doubleValue()));
                }
                spreadBuilder.a(new Pair("product.Quantity", arrayList2));
                EmptyList emptyList = EmptyList.d;
                spreadBuilder.a(new Pair("product.BrandName", emptyList));
                spreadBuilder.a(new Pair("product.SellerName", emptyList));
                spreadBuilder.a(new Pair("product.SubTotal", listQ6));
                spreadBuilder.a(new Pair("product.Discount", emptyList));
                spreadBuilder.a(new Pair("product.ImageURL", listQ7));
                spreadBuilder.a(new Pair("product.OriginalPrice", emptyList));
                ArrayList arrayList3 = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList3.toArray(new Pair[arrayList3.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                return "cart_remove";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "cart_remove".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
        q6(source, SetsKt.i(new Pair(str2, Double.valueOf(0.0d))), new f(this, 0));
    }

    @Override // au.com.woolworths.shop.cart.ui.productreview.ProductsReviewCallbacks
    public final void V4(ProductReviewFeed.ProductReviewGroup productReviewGroup) {
        String str = this.e.d;
        AnalyticsData analyticsData = productReviewGroup.d;
        ProductReviewAnalytics productReviewAnalytics = this.i;
        productReviewAnalytics.getClass();
        productReviewAnalytics.f10512a.g(AnalyticsDataKt.b(new ProductReviewAnalytics.ProductReview(str), analyticsData));
    }

    @Override // au.com.woolworths.shop.cart.ui.productreview.ProductsReviewCallbacks
    public final void Z3(ProductReviewCard productReviewCard) {
        Intrinsics.h(productReviewCard, "productReviewCard");
        this.l.k(new ProductReviewContract.Actions.OpenQuantitySelector(ProductReviewCardExtKt.a(productReviewCard)));
    }

    @Override // au.com.woolworths.shop.cart.ui.productreview.ProductsReviewCallbacks
    public final void d3(List list) {
        String str = this.e.d;
        ProductReviewAnalytics productReviewAnalytics = this.i;
        productReviewAnalytics.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            productReviewAnalytics.f10512a.g(AnalyticsDataKt.b(new ProductReviewAnalytics.ProductReview(str), (AnalyticsData) it.next()));
        }
    }

    @Override // au.com.woolworths.shop.cart.ui.productreview.ProductsReviewCallbacks
    public final void f0(String str) {
        String str2 = this.e.d;
        ProductReviewAnalytics productReviewAnalytics = this.i;
        productReviewAnalytics.getClass();
        AnalyticsManager analyticsManager = productReviewAnalytics.f10512a;
        ProductReviewAnalytics.ProductReview productReview = new ProductReviewAnalytics.ProductReview(str2);
        final List listQ = CollectionsKt.Q(str);
        final ProductReviewAnalytics.ProductReview.Action action = productReview.h;
        action.getClass();
        analyticsManager.g(new Event(action, listQ) { // from class: au.com.woolworths.analytics.supers.productreview.ProductReviewAnalytics$ProductReview$Action$productAlternativesSimilarAvailableClick$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                spreadBuilder.b(action.f4044a.g);
                spreadBuilder.a(new Pair("event.Category", "Product Out of Stock: View Similar Items"));
                spreadBuilder.a(new Pair("event.Action", "click"));
                spreadBuilder.a(new Pair("event.Label", "X similar available"));
                spreadBuilder.a(new Pair("product.ID", listQ));
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                return "product_alternatives_search_for_similar_click";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "product_alternatives_search_for_similar_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
        this.l.k(new ProductReviewContract.Actions.OpenProductReviewAlternative(str));
    }

    @Override // au.com.woolworths.shop.cart.ui.productreview.ProductsReviewCallbacks
    public final void j5(ProductReviewCard productReviewCard, double d) {
        String string;
        Intrinsics.h(productReviewCard, "productReviewCard");
        String str = productReviewCard.d;
        Integer num = productReviewCard.g;
        boolean z = productReviewCard.h;
        String str2 = productReviewCard.f10444a;
        String str3 = productReviewCard.b;
        double d2 = productReviewCard.c;
        Activities.ProductsReviewActivity.Source source = this.e;
        ProductReviewAnalytics productReviewAnalytics = this.i;
        if (d > d2) {
            String str4 = source.d;
            productReviewAnalytics.getClass();
            AnalyticsManager analyticsManager = productReviewAnalytics.f10512a;
            ProductReviewAnalytics.ProductReview productReview = new ProductReviewAnalytics.ProductReview(str4);
            final List listQ = CollectionsKt.Q(str3);
            final List listQ2 = CollectionsKt.Q(str2);
            final List listQ3 = CollectionsKt.Q(Boolean.valueOf(z));
            string = num != null ? num.toString() : null;
            final List listQ4 = CollectionsKt.Q(string != null ? string : "");
            final List listQ5 = CollectionsKt.Q(Double.valueOf(d2));
            final List listQ6 = CollectionsKt.Q(ProductReviewAnalytics.a(productReviewCard));
            final List listQ7 = CollectionsKt.Q(str);
            final ProductReviewAnalytics.ProductReview.Action action = productReview.h;
            action.getClass();
            analyticsManager.g(new Event(action, listQ, listQ2, listQ3, listQ4, listQ5, listQ6, listQ7) { // from class: au.com.woolworths.analytics.supers.productreview.ProductReviewAnalytics$ProductReview$Action$updateCartStepperIncrease$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(15);
                    spreadBuilder.b(action.f4044a.g);
                    spreadBuilder.a(new Pair("event.Category", "cart"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    spreadBuilder.a(new Pair("event.Label", "Update Cart - Stepper"));
                    spreadBuilder.a(new Pair("product.ID", listQ));
                    spreadBuilder.a(new Pair("product.Name", listQ2));
                    List list = listQ3;
                    ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
                    }
                    spreadBuilder.a(new Pair("product.Availability", arrayList));
                    spreadBuilder.a(new Pair("product.Price", listQ4));
                    List list2 = listQ5;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(String.valueOf(((Number) it2.next()).doubleValue()));
                    }
                    spreadBuilder.a(new Pair("product.Quantity", arrayList2));
                    EmptyList emptyList = EmptyList.d;
                    spreadBuilder.a(new Pair("product.BrandName", emptyList));
                    spreadBuilder.a(new Pair("product.SellerName", emptyList));
                    spreadBuilder.a(new Pair("product.SubTotal", listQ6));
                    spreadBuilder.a(new Pair("product.Discount", emptyList));
                    spreadBuilder.a(new Pair("product.ImageURL", listQ7));
                    spreadBuilder.a(new Pair("product.OriginalPrice", emptyList));
                    ArrayList arrayList3 = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList3.toArray(new Pair[arrayList3.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "cart_add";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj;
                    return "cart_add".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
        } else {
            String str5 = source.d;
            productReviewAnalytics.getClass();
            AnalyticsManager analyticsManager2 = productReviewAnalytics.f10512a;
            ProductReviewAnalytics.ProductReview productReview2 = new ProductReviewAnalytics.ProductReview(str5);
            final List listQ8 = CollectionsKt.Q(str3);
            final List listQ9 = CollectionsKt.Q(str2);
            final List listQ10 = CollectionsKt.Q(Boolean.valueOf(z));
            string = num != null ? num.toString() : null;
            final List listQ11 = CollectionsKt.Q(string != null ? string : "");
            final List listQ12 = CollectionsKt.Q(Double.valueOf(d2));
            final List listQ13 = CollectionsKt.Q(ProductReviewAnalytics.a(productReviewCard));
            final List listQ14 = CollectionsKt.Q(str);
            final ProductReviewAnalytics.ProductReview.Action action2 = productReview2.h;
            action2.getClass();
            analyticsManager2.g(new Event(action2, listQ8, listQ9, listQ10, listQ11, listQ12, listQ13, listQ14) { // from class: au.com.woolworths.analytics.supers.productreview.ProductReviewAnalytics$ProductReview$Action$updateCartStepperDecrease$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(15);
                    spreadBuilder.b(action2.f4044a.g);
                    spreadBuilder.a(new Pair("event.Category", "cart"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    spreadBuilder.a(new Pair("event.Label", "remove"));
                    spreadBuilder.a(new Pair("product.ID", listQ8));
                    spreadBuilder.a(new Pair("product.Name", listQ9));
                    List list = listQ10;
                    ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
                    }
                    spreadBuilder.a(new Pair("product.Availability", arrayList));
                    spreadBuilder.a(new Pair("product.Price", listQ11));
                    List list2 = listQ12;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(String.valueOf(((Number) it2.next()).doubleValue()));
                    }
                    spreadBuilder.a(new Pair("product.Quantity", arrayList2));
                    EmptyList emptyList = EmptyList.d;
                    spreadBuilder.a(new Pair("product.BrandName", emptyList));
                    spreadBuilder.a(new Pair("product.SellerName", emptyList));
                    spreadBuilder.a(new Pair("product.SubTotal", listQ13));
                    spreadBuilder.a(new Pair("product.Discount", emptyList));
                    spreadBuilder.a(new Pair("product.ImageURL", listQ14));
                    spreadBuilder.a(new Pair("product.OriginalPrice", emptyList));
                    ArrayList arrayList3 = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList3.toArray(new Pair[arrayList3.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "cart_remove";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj;
                    return "cart_remove".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
        }
        this.n.put(str3, Double.valueOf(d));
        this.m.f(Unit.f24250a);
        MutableStateFlow mutableStateFlow = this.k;
        ProductReviewContract.ViewState viewStateA = (ProductReviewContract.ViewState) mutableStateFlow.getValue();
        PageResult pageResult = viewStateA.b;
        if (pageResult instanceof PageResult.Success) {
            Object obj = ((PageResult.Success) pageResult).f10438a;
            if (obj instanceof ProductReviewResult.Response) {
                ProductReviewResult.Response response = (ProductReviewResult.Response) obj;
                List<ProductReviewFeed> list = response.b;
                ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
                for (ProductReviewFeed productReviewFeed : list) {
                    if (!(productReviewFeed instanceof ProductReviewFeed.ProductReviewGroup)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ProductReviewFeed.ProductReviewGroup productReviewGroup = (ProductReviewFeed.ProductReviewGroup) productReviewFeed;
                    List<ProductReviewCard> list2 = productReviewGroup.c;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
                    for (ProductReviewCard productReviewCardA : list2) {
                        if (productReviewCardA.b.equals(str3)) {
                            productReviewCardA = ProductReviewCard.a(productReviewCardA, d, null, null, null, null, 2043);
                        }
                        arrayList2.add(productReviewCardA);
                    }
                    arrayList.add(new ProductReviewFeed.ProductReviewGroup(productReviewGroup.f10446a, productReviewGroup.b, arrayList2, productReviewGroup.d));
                }
                viewStateA = ProductReviewContract.ViewState.a(viewStateA, new PageResult.Success(new ProductReviewResult.Response(response.f10449a, arrayList, response.c)), 1);
            }
        }
        mutableStateFlow.setValue(viewStateA);
    }

    public final void p6(boolean z) {
        String str = this.e.d;
        ProductReviewAnalytics productReviewAnalytics = this.i;
        productReviewAnalytics.getClass();
        productReviewAnalytics.f10512a.g((Event) new ProductReviewAnalytics.ProductReview(str).h.b.getD());
        MutableStateFlow mutableStateFlow = this.k;
        mutableStateFlow.setValue(ProductReviewContract.ViewState.a((ProductReviewContract.ViewState) mutableStateFlow.getValue(), null, 2));
        BuildersKt.c(ViewModelKt.a(this), null, null, new ProductReviewViewModel$fetchPage$2(this, z, null), 3);
    }

    @Override // au.com.woolworths.shop.cart.ui.productreview.ProductsReviewCallbacks
    public final void q(ProductCard productCard) {
        String str = this.e.d;
        ProductReviewAnalytics productReviewAnalytics = this.i;
        productReviewAnalytics.getClass();
        AnalyticsManager analyticsManager = productReviewAnalytics.f10512a;
        ProductReviewAnalytics.ProductReview productReview = new ProductReviewAnalytics.ProductReview(str);
        final List listQ = CollectionsKt.Q(productCard.getProductId());
        final ProductReviewAnalytics.ProductReview.Action action = productReview.h;
        action.getClass();
        analyticsManager.g(new Event(action, listQ) { // from class: au.com.woolworths.analytics.supers.productreview.ProductReviewAnalytics$ProductReview$Action$productAlternativesSearchForSimilarClick$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                spreadBuilder.b(action.f4044a.g);
                spreadBuilder.a(new Pair("event.Category", "Product Out of Stock: View Similar Items"));
                spreadBuilder.a(new Pair("event.Action", "click"));
                spreadBuilder.a(new Pair("event.Label", "Search for similar items"));
                spreadBuilder.a(new Pair("product.ID", listQ));
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                return "product_alternatives_search_for_similar_click";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "product_alternatives_search_for_similar_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
        this.l.k(new ProductReviewContract.Actions.NavigateToSearch(productCard));
    }

    public final void q6(Activities.ProductsReviewActivity.Source source, Set set, Function1 function1) {
        MutableStateFlow mutableStateFlow = this.k;
        mutableStateFlow.setValue(ProductReviewContract.ViewState.a((ProductReviewContract.ViewState) mutableStateFlow.getValue(), null, 2));
        BuildersKt.c(ViewModelKt.a(this), null, null, new ProductReviewViewModel$updateQuantity$2(this, source, set, function1, null), 3);
    }

    @Override // au.com.woolworths.shop.cart.ui.productreview.ProductsReviewCallbacks
    public final void r1(List list, AnalyticsData analyticsData) {
        final String eventDescription;
        if (analyticsData != null && (eventDescription = analyticsData.getEventDescription()) != null) {
            String str = this.e.d;
            ProductReviewAnalytics productReviewAnalytics = this.i;
            productReviewAnalytics.getClass();
            AnalyticsManager analyticsManager = productReviewAnalytics.f10512a;
            ProductReviewAnalytics.ProductReview productReview = new ProductReviewAnalytics.ProductReview(str);
            List list2 = list;
            final ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((ProductReviewCard) it.next()).b);
            }
            final ProductReviewAnalytics.ProductReview.Action action = productReview.h;
            action.getClass();
            analyticsManager.g(new Event(action, eventDescription, arrayList) { // from class: au.com.woolworths.analytics.supers.productreview.ProductReviewAnalytics$ProductReview$Action$productReviewBannerClick$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                    spreadBuilder.b(action.f4044a.g);
                    spreadBuilder.a(new Pair("event.Category", "notification"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    spreadBuilder.a(new Pair("event.Label", "Product review modal - banner"));
                    spreadBuilder.a(new Pair("event.Description", eventDescription));
                    spreadBuilder.a(new Pair("product.ID", arrayList));
                    ArrayList arrayList2 = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList2.toArray(new Pair[arrayList2.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "product_review_modal_click";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj;
                    return "product_review_modal_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
        }
        this.l.k(ProductReviewContract.Actions.ShowFulfilmentWindow.f10516a);
    }

    @Override // au.com.woolworths.shop.cart.ui.productreview.ProductsReviewCallbacks
    public final void y5() {
        String str = this.e.d;
        ProductReviewAnalytics productReviewAnalytics = this.i;
        productReviewAnalytics.getClass();
        productReviewAnalytics.f10512a.g((Event) new ProductReviewAnalytics.ProductReview(str).h.d.getD());
    }

    @Override // au.com.woolworths.shop.cart.ui.productreview.ProductsReviewCallbacks
    public final void z() {
        p6(false);
    }
}
