package au.com.woolworths.shop.product.details;

import androidx.compose.runtime.Stable;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.analytics.model.AnalyticsExtraContent;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.analytics.supers.products.ProductDetailsAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.deeplink.SupportedLinksHelper;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.TrolleyResult;
import au.com.woolworths.android.onesite.models.TrolleyResultExtKt;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.TrolleyInteractor;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.foundation.rewards.offers.model.BasicRewardsOfferStatusData;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.instore.navigation.map.InstoreNavigationInteractor;
import au.com.woolworths.foundation.shop.shippingcalculator.data.ShippingCalculatorDataStore;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.InStoreLocationData;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.product.models.PurchaseRestriction;
import au.com.woolworths.product.offers.ProductBoostInteractor;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import au.com.woolworths.shop.lists.data.WatchlistInteractor;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.i;
import au.com.woolworths.shop.product.details.ProductDetailsContract;
import au.com.woolworths.shop.product.details.data.ButtonActionData;
import au.com.woolworths.shop.product.details.data.ButtonData;
import au.com.woolworths.shop.product.details.data.FooterButtonAction;
import au.com.woolworths.shop.product.details.data.FooterData;
import au.com.woolworths.shop.product.details.data.NutritionInfo;
import au.com.woolworths.shop.product.details.data.ProductDetailsImages;
import au.com.woolworths.shop.product.details.data.ProductDetailsPage;
import au.com.woolworths.shop.product.details.data.ProductDetailsPageKt;
import au.com.woolworths.shop.product.details.data.ProductDetailsProductPanel;
import au.com.woolworths.shop.product.details.data.ProductDetailsRowAccordion;
import au.com.woolworths.shop.product.details.data.ProductDetailsRowAccordionProductList;
import au.com.woolworths.shop.product.details.data.ProductDetailsRowLink;
import au.com.woolworths.shop.product.details.data.ProductHorizontalList;
import au.com.woolworths.shop.product.details.data.ProductImage;
import au.com.woolworths.shop.product.details.data.ProductRatingsAndReviewsSummaryData;
import com.medallia.digital.mobilesdk.l3;
import dagger.assisted.AssistedFactory;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@HiltViewModel
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "Factory", "Companion", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Stable
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductDetailsViewModel extends ViewModel {
    public final String e;
    public final boolean f;
    public final String g;
    public final ProductDetailsPageInteractor h;
    public final ShopAccountInteractor i;
    public final FeatureToggleManager j;
    public final AnalyticsManager k;
    public final CartUpdateInteractor l;
    public final CollectionModeInteractor m;
    public final InstoreNavigationInteractor n;
    public final WatchlistInteractor o;
    public final SupportedLinksHelper p;
    public final MutableStateFlow q;
    public final StateFlow r;
    public final SharedFlowImpl s;
    public final Flow t;
    public final i u;
    public final StateFlow v;
    public String w;
    public String x;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "it", "", "Lau/com/woolworths/foundation/rewards/offers/model/BasicRewardsOfferStatusData;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.product.details.ProductDetailsViewModel$1", f = "ProductDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.product.details.ProductDetailsViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends BasicRewardsOfferStatusData>, Continuation<? super Unit>, Object> {
        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ProductDetailsViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((List) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            ProductDetailsViewModel.this.r6(false);
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/android/onesite/models/TrolleyResult;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.product.details.ProductDetailsViewModel$3", f = "ProductDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.product.details.ProductDetailsViewModel$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function2<TrolleyResult, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;

        public AnonymousClass3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = ProductDetailsViewModel.this.new AnonymousClass3(continuation);
            anonymousClass3.p = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass3 anonymousClass3 = (AnonymousClass3) create((TrolleyResult) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass3.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ProductDetailsPage productDetailsPageA;
            ProductHorizontalList productHorizontalListA;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            TrolleyResult trolleyResult = (TrolleyResult) this.p;
            ProductDetailsViewModel productDetailsViewModel = ProductDetailsViewModel.this;
            MutableStateFlow mutableStateFlow = productDetailsViewModel.q;
            StateFlow stateFlow = productDetailsViewModel.r;
            ProductDetailsPage productDetailsPage = ((ProductDetailsContract.ViewState) stateFlow.getValue()).f12566a;
            int i = 10;
            if (productDetailsPage != null) {
                List list = productDetailsPage.f12608a;
                ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
                for (Object objA : list) {
                    if (objA instanceof ProductHorizontalList) {
                        ProductHorizontalList productHorizontalList = (ProductHorizontalList) objA;
                        List list2 = productHorizontalList.e;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list2, i));
                        for (Object objB : list2) {
                            if (objB instanceof ProductCard) {
                                objB = ProductCardExtKt.B((ProductCard) objB, trolleyResult);
                            }
                            arrayList2.add(objB);
                        }
                        objA = ProductHorizontalList.a(productHorizontalList, arrayList2, 47);
                    } else if (objA instanceof ProductDetailsRowAccordion) {
                        ProductDetailsRowAccordion productDetailsRowAccordion = (ProductDetailsRowAccordion) objA;
                        Object objA2 = productDetailsRowAccordion.d;
                        if (objA2 instanceof ProductDetailsRowAccordionProductList) {
                            ProductDetailsRowAccordionProductList productDetailsRowAccordionProductList = (ProductDetailsRowAccordionProductList) objA2;
                            ProductHorizontalList productHorizontalList2 = productDetailsRowAccordionProductList.c;
                            if (productHorizontalList2 != null) {
                                List list3 = productHorizontalList2.e;
                                ArrayList arrayList3 = new ArrayList(CollectionsKt.s(list3, i));
                                for (Object objB2 : list3) {
                                    if (objB2 instanceof ProductCard) {
                                        objB2 = ProductCardExtKt.B((ProductCard) objB2, trolleyResult);
                                    }
                                    arrayList3.add(objB2);
                                }
                                productHorizontalListA = ProductHorizontalList.a(productHorizontalList2, arrayList3, 47);
                            } else {
                                productHorizontalListA = null;
                            }
                            objA2 = ProductDetailsRowAccordionProductList.a(productDetailsRowAccordionProductList, productHorizontalListA);
                        }
                        objA = ProductDetailsRowAccordion.a(productDetailsRowAccordion, objA2);
                    }
                    arrayList.add(objA);
                    i = 10;
                }
                productDetailsPageA = ProductDetailsPage.a(productDetailsPage, arrayList, null, 14);
            } else {
                productDetailsPageA = null;
            }
            ProductDetailsViewModel.E6(productDetailsViewModel, mutableStateFlow, false, productDetailsPageA, false, null, null, null, null, null, null, 1021);
            ProductDetailsPage productDetailsPage2 = ((ProductDetailsContract.ViewState) stateFlow.getValue()).f12566a;
            if (productDetailsPage2 != null) {
                List list4 = productDetailsPage2.f12608a;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.s(list4, 10));
                for (Object productDetailsProductPanel : list4) {
                    if (productDetailsProductPanel instanceof ProductDetailsProductPanel) {
                        ProductDetailsProductPanel productDetailsProductPanel2 = (ProductDetailsProductPanel) productDetailsProductPanel;
                        ProductCard product = ProductCardExtKt.B(productDetailsProductPanel2.b, trolleyResult);
                        ProductRatingsAndReviewsSummaryData productRatingsAndReviewsSummaryData = productDetailsProductPanel2.f12609a;
                        Intrinsics.h(product, "product");
                        productDetailsProductPanel = new ProductDetailsProductPanel(productRatingsAndReviewsSummaryData, product);
                    }
                    arrayList4.add(productDetailsProductPanel);
                }
                ProductDetailsPage productDetailsPageA2 = ProductDetailsPage.a(productDetailsPage2, arrayList4, productDetailsPage2.d, 6);
                List<TrolleyResult.TrolleyItem> allGroceryAndMarketItems = TrolleyResultExtKt.getAllGroceryAndMarketItems(trolleyResult);
                boolean z = false;
                if (!(allGroceryAndMarketItems instanceof Collection) || !allGroceryAndMarketItems.isEmpty()) {
                    Iterator<T> it = allGroceryAndMarketItems.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        TrolleyResult.TrolleyItem trolleyItem = (TrolleyResult.TrolleyItem) it.next();
                        ProductId.Companion companion = ProductId.INSTANCE;
                        if (Intrinsics.c(companion.create(productDetailsViewModel.e), companion.create(trolleyItem.getArticle()))) {
                            z = true;
                            break;
                        }
                    }
                }
                ProductDetailsViewModel.E6(productDetailsViewModel, mutableStateFlow, false, productDetailsPageA2, z, null, null, null, null, null, null, 1013);
            }
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.product.details.ProductDetailsViewModel$4", f = "ProductDetailsViewModel.kt", l = {173}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.product.details.ProductDetailsViewModel$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass4(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ProductDetailsViewModel.this.new AnonymousClass4(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
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
                return Unit.f24250a;
            }
            ResultKt.b(obj);
            final ProductDetailsViewModel productDetailsViewModel = ProductDetailsViewModel.this;
            Flow flow = productDetailsViewModel.l.l;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.shop.product.details.ProductDetailsViewModel.4.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    int iIntValue = ((Number) obj2).intValue();
                    ProductDetailsViewModel productDetailsViewModel2 = productDetailsViewModel;
                    productDetailsViewModel2.q.f(ProductDetailsContract.ViewState.a((ProductDetailsContract.ViewState) productDetailsViewModel2.r.getValue(), new Integer(iIntValue), null, 4031));
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            flow.collect(flowCollector, this);
            return coroutineSingletons;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "it", "", "Lau/com/woolworths/product/models/ProductId;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.product.details.ProductDetailsViewModel$5", f = "ProductDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.product.details.ProductDetailsViewModel$5, reason: invalid class name */
    final class AnonymousClass5 extends SuspendLambda implements Function2<List<? extends ProductId>, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;

        public AnonymousClass5(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass5 anonymousClass5 = ProductDetailsViewModel.this.new AnonymousClass5(continuation);
            anonymousClass5.p = obj;
            return anonymousClass5;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass5 anonymousClass5 = (AnonymousClass5) create((List) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass5.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            List list = (List) this.p;
            ProductDetailsViewModel productDetailsViewModel = ProductDetailsViewModel.this;
            MutableStateFlow mutableStateFlow = productDetailsViewModel.q;
            ProductDetailsViewModel.E6(productDetailsViewModel, mutableStateFlow, false, null, false, null, null, null, null, list, ((ProductDetailsContract.ViewState) mutableStateFlow.getValue()).l, 255);
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/shop/auth/ShopAccountInteractor$LoginDetails;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.product.details.ProductDetailsViewModel$6", f = "ProductDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.product.details.ProductDetailsViewModel$6, reason: invalid class name */
    final class AnonymousClass6 extends SuspendLambda implements Function2<ShopAccountInteractor.LoginDetails, Continuation<? super Unit>, Object> {
        public AnonymousClass6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ProductDetailsViewModel.this.new AnonymousClass6(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass6 anonymousClass6 = (AnonymousClass6) create((ShopAccountInteractor.LoginDetails) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass6.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            ProductDetailsViewModel productDetailsViewModel = ProductDetailsViewModel.this;
            if (productDetailsViewModel.j.c(BaseShopAppFeature.q)) {
                productDetailsViewModel.h.a();
                productDetailsViewModel.r6(false);
            }
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.product.details.ProductDetailsViewModel$7", f = "ProductDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.product.details.ProductDetailsViewModel$7, reason: invalid class name */
    final class AnonymousClass7 extends SuspendLambda implements Function2<Pair<? extends String, ? extends String>, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;

        public AnonymousClass7(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass7 anonymousClass7 = ProductDetailsViewModel.this.new AnonymousClass7(continuation);
            anonymousClass7.p = obj;
            return anonymousClass7;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass7 anonymousClass7 = (AnonymousClass7) create((Pair) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass7.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            Pair pair = (Pair) this.p;
            String str = (String) pair.d;
            String str2 = (String) pair.e;
            ProductDetailsViewModel productDetailsViewModel = ProductDetailsViewModel.this;
            if (!Intrinsics.c(str, productDetailsViewModel.w) || !Intrinsics.c(str2, productDetailsViewModel.x)) {
                productDetailsViewModel.w = str;
                productDetailsViewModel.x = str2;
                productDetailsViewModel.r6(false);
            }
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsViewModel$Companion;", "", "", "AddToCartAnalyticsLabel", "Ljava/lang/String;", "UpdateCartAnalyticsLabel", "AddToCartAnalyticsDescription", "DefaultAppSection", "DefaultScreenName", "ErrorScreenName", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @AssistedFactory
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsViewModel$Factory;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        ProductDetailsViewModel a(String str, String str2, boolean z);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12592a;

        static {
            int[] iArr = new int[FooterButtonAction.values().length];
            try {
                FooterButtonAction footerButtonAction = FooterButtonAction.e;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FooterButtonAction footerButtonAction2 = FooterButtonAction.e;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                FooterButtonAction footerButtonAction3 = FooterButtonAction.e;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                FooterButtonAction footerButtonAction4 = FooterButtonAction.e;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                FooterButtonAction footerButtonAction5 = FooterButtonAction.e;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                FooterButtonAction footerButtonAction6 = FooterButtonAction.e;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f12592a = iArr;
        }
    }

    public ProductDetailsViewModel(String productId, boolean z, String str, ProductDetailsPageInteractor interactor, ShopAccountInteractor accountInteractor, FeatureToggleManager featureToggleManager, AnalyticsManager analyticsManager, TrolleyInteractor trolleyInteractor, ProductBoostInteractor productBoostInteractor, CartUpdateInteractor cartUpdateInteractor, CollectionModeInteractor collectionModeInteractor, InstoreNavigationInteractor instoreNavigationInteractor, WatchlistInteractor watchlistInteractor, SupportedLinksHelper supportedLinksHelper, ShippingCalculatorDataStore shippingCalculatorDataStore) {
        Intrinsics.h(productId, "productId");
        Intrinsics.h(interactor, "interactor");
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(trolleyInteractor, "trolleyInteractor");
        Intrinsics.h(productBoostInteractor, "productBoostInteractor");
        Intrinsics.h(cartUpdateInteractor, "cartUpdateInteractor");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(instoreNavigationInteractor, "instoreNavigationInteractor");
        Intrinsics.h(watchlistInteractor, "watchlistInteractor");
        Intrinsics.h(shippingCalculatorDataStore, "shippingCalculatorDataStore");
        this.e = productId;
        this.f = z;
        this.g = str;
        this.h = interactor;
        this.i = accountInteractor;
        this.j = featureToggleManager;
        this.k = analyticsManager;
        this.l = cartUpdateInteractor;
        this.m = collectionModeInteractor;
        this.n = instoreNavigationInteractor;
        this.o = watchlistInteractor;
        this.p = supportedLinksHelper;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new ProductDetailsContract.ViewState(null, false, null, null, null, null, null, null, false, false, null, null, l3.b));
        this.q = mutableStateFlowA;
        this.r = FlowKt.b(mutableStateFlowA);
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.s = sharedFlowImplB;
        this.t = FlowKt.a(sharedFlowImplB);
        this.u = new i(this, 2);
        StateFlow stateFlowA = featureToggleManager.a(BaseShopAppFeature.r);
        this.v = stateFlowA;
        this.w = ((Boolean) stateFlowA.getValue()).booleanValue() ? shippingCalculatorDataStore.e() : null;
        this.x = ((Boolean) stateFlowA.getValue()).booleanValue() ? shippingCalculatorDataStore.b() : null;
        r6(true);
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(null), productBoostInteractor.c), ViewModelKt.a(this));
        final StateFlow stateFlowV = trolleyInteractor.getP();
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass3(null), new Flow<TrolleyResult>() { // from class: au.com.woolworths.shop.product.details.ProductDetailsViewModel$special$$inlined$mapNotNull$1

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: au.com.woolworths.shop.product.details.ProductDetailsViewModel$special$$inlined$mapNotNull$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "au.com.woolworths.shop.product.details.ProductDetailsViewModel$special$$inlined$mapNotNull$1$2", f = "ProductDetailsViewModel.kt", l = {52}, m = "emit")
                /* renamed from: au.com.woolworths.shop.product.details.ProductDetailsViewModel$special$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object p;
                    public int q;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.p = obj;
                        this.q |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.d = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof au.com.woolworths.shop.product.details.ProductDetailsViewModel$special$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        au.com.woolworths.shop.product.details.ProductDetailsViewModel$special$$inlined$mapNotNull$1$2$1 r0 = (au.com.woolworths.shop.product.details.ProductDetailsViewModel$special$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.q = r1
                        goto L18
                    L13:
                        au.com.woolworths.shop.product.details.ProductDetailsViewModel$special$$inlined$mapNotNull$1$2$1 r0 = new au.com.woolworths.shop.product.details.ProductDetailsViewModel$special$$inlined$mapNotNull$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.p
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r2 = r0.q
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        kotlin.ResultKt.b(r6)
                        goto L43
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        kotlin.ResultKt.b(r6)
                        au.com.woolworths.android.onesite.rxutils.Result r5 = (au.com.woolworths.android.onesite.rxutils.Result) r5
                        java.lang.Object r5 = r5.f4591a
                        if (r5 == 0) goto L43
                        r0.q = r3
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        kotlin.Unit r5 = kotlin.Unit.f24250a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.product.details.ProductDetailsViewModel$special$$inlined$mapNotNull$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = stateFlowV.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        }), ViewModelKt.a(this));
        if (cartUpdateInteractor.b.z()) {
            BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass4(null), 3);
        }
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass5(null), watchlistInteractor.e), ViewModelKt.a(this));
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass6(null), FlowKt.s(accountInteractor.m, 1)), ViewModelKt.a(this));
        if (((Boolean) stateFlowA.getValue()).booleanValue()) {
            FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass7(null), shippingCalculatorDataStore.c()), ViewModelKt.a(this));
        }
    }

    public static void E6(ProductDetailsViewModel productDetailsViewModel, MutableStateFlow mutableStateFlow, boolean z, ProductDetailsPage productDetailsPage, boolean z2, ProductDetailsRowLink productDetailsRowLink, NutritionInfo nutritionInfo, InfoSection infoSection, List list, List list2, ProductDetailsContract.Snackbar snackbar, int i) {
        ProductCard productCardA;
        boolean z3 = (i & 1) != 0 ? ((ProductDetailsContract.ViewState) mutableStateFlow.getValue()).b : z;
        ProductDetailsPage productDetailsPage2 = (i & 2) != 0 ? ((ProductDetailsContract.ViewState) mutableStateFlow.getValue()).f12566a : productDetailsPage;
        Integer num = ((ProductDetailsContract.ViewState) mutableStateFlow.getValue()).g;
        boolean z4 = (i & 8) != 0 ? ((ProductDetailsContract.ViewState) mutableStateFlow.getValue()).j : z2;
        ProductDetailsRowLink productDetailsRowLink2 = (i & 16) != 0 ? ((ProductDetailsContract.ViewState) mutableStateFlow.getValue()).c : productDetailsRowLink;
        NutritionInfo nutritionInfo2 = (i & 32) != 0 ? ((ProductDetailsContract.ViewState) mutableStateFlow.getValue()).d : nutritionInfo;
        InfoSection infoSection2 = (i & 64) != 0 ? ((ProductDetailsContract.ViewState) mutableStateFlow.getValue()).e : infoSection;
        List list3 = (i & 128) != 0 ? ((ProductDetailsContract.ViewState) mutableStateFlow.getValue()).f : list;
        List list4 = (i & 256) != 0 ? ((ProductDetailsContract.ViewState) mutableStateFlow.getValue()).k : list2;
        ProductDetailsContract.Snackbar snackbar2 = (i & 512) != 0 ? null : snackbar;
        productDetailsViewModel.getClass();
        boolean z5 = false;
        if (productDetailsPage2 != null && (productCardA = ProductDetailsPageKt.a(productDetailsPage2)) != null && productDetailsViewModel.m.b() && productDetailsViewModel.n.d()) {
            InStoreLocationData inStoreLocation = productCardA.getInStoreLocation();
            if ((inStoreLocation != null ? inStoreLocation.getDetails() : null) != null) {
                z5 = true;
            }
        }
        mutableStateFlow.setValue(new ProductDetailsContract.ViewState(productDetailsPage2, z3, productDetailsRowLink2, nutritionInfo2, infoSection2, list3, num, null, z5, z4, list4, snackbar2, 128));
    }

    public static final void p6(ProductDetailsViewModel productDetailsViewModel, ProductDetailsPageErrorState productDetailsPageErrorState) {
        Event event;
        if (productDetailsPageErrorState instanceof ServerErrorState) {
            event = (Event) new ProductDetailsAnalytics.Details("error").g.d.getD();
        } else {
            if (!(productDetailsPageErrorState instanceof ConnectionErrorState)) {
                throw new NoWhenBranchMatchedException();
            }
            event = (Event) new ProductDetailsAnalytics.Details("error").g.e.getD();
        }
        productDetailsViewModel.k.g(AnalyticsDataKt.b(event, new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, CollectionsKt.Q(new AnalyticsExtraContent("product.ID", productDetailsViewModel.e, null)), 1023, (DefaultConstructorMarker) null)));
        MutableStateFlow mutableStateFlow = productDetailsViewModel.q;
        ProductDetailsPage productDetailsPage = null;
        boolean z = false;
        ProductDetailsRowLink productDetailsRowLink = null;
        NutritionInfo nutritionInfo = null;
        List list = null;
        mutableStateFlow.f(new ProductDetailsContract.ViewState(productDetailsPage, z, productDetailsRowLink, nutritionInfo, null, list, ((ProductDetailsContract.ViewState) mutableStateFlow.getValue()).g, productDetailsPageErrorState, false, false, null, null, 3903));
    }

    public static final void q6(ProductDetailsViewModel productDetailsViewModel) {
        final String str = productDetailsViewModel.g;
        if (str == null || !productDetailsViewModel.f) {
            return;
        }
        ProductCard productCardU6 = productDetailsViewModel.u6();
        final ProductDetailsAnalytics.Details.Action action = new ProductDetailsAnalytics.Details(productDetailsViewModel.x6()).g;
        action.getClass();
        Event eventB = AnalyticsDataKt.b(new Event(action, str) { // from class: au.com.woolworths.analytics.supers.products.ProductDetailsAnalytics$Details$Action$deeplinkVisit$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                spreadBuilder.b(action.f4045a.f);
                spreadBuilder.a(new Pair("event.Category", "deeplink"));
                spreadBuilder.a(new Pair("event.Action", "visit"));
                androidx.constraintlayout.core.state.a.y("deeplink.uri", androidx.compose.ui.input.pointer.a.m("event.Label", "Deeplink Product Details", spreadBuilder, str), spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "deeplink_visit";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "deeplink_visit".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        }, productCardU6 != null ? productCardU6.getProductCardAnalytics() : null);
        if (productCardU6 != null) {
            productDetailsViewModel.C6(eventB);
        } else {
            productDetailsViewModel.k.g(eventB);
        }
    }

    public final void A6(ProductCard productCard) {
        PurchaseRestriction purchaseRestriction = productCard.getPurchaseRestriction();
        PurchaseRestriction purchaseRestriction2 = PurchaseRestriction.LEGAL_AGE_RESTRICTION;
        SharedFlowImpl sharedFlowImpl = this.s;
        if (purchaseRestriction == purchaseRestriction2) {
            ShopAccountInteractor shopAccountInteractor = this.i;
            if (!shopAccountInteractor.K()) {
                sharedFlowImpl.f(new ProductDetailsContract.Action.DisplayRestrictedItemPrompt(shopAccountInteractor.d()));
                return;
            }
        }
        sharedFlowImpl.f(new ProductDetailsContract.Action.LaunchAddToCartBottomSheet(productCard));
    }

    public final void B6(ResText resText, ResText resText2, Function0 function0, Function1 function1) {
        MutableStateFlow mutableStateFlow = this.q;
        mutableStateFlow.f(ProductDetailsContract.ViewState.a((ProductDetailsContract.ViewState) mutableStateFlow.getValue(), null, new ProductDetailsContract.Snackbar(resText, resText2, function0, function1), 2047));
    }

    public final void C6(Event event) {
        ProductCard productCardU6 = u6();
        if (productCardU6 != null) {
            this.k.i(AnalyticsDataKt.b(AnalyticsDataKt.b(event, t6()), productCardU6.getProductCardAnalytics()), ProductAnalyticsExtKt.h(productCardU6, null, null, 7));
        }
    }

    public final void D6(Event event, ProductCard productCard) {
        this.k.i(AnalyticsDataKt.b(AnalyticsDataKt.b(event, t6()), productCard.getProductCardAnalytics()), ProductAnalyticsExtKt.h(productCard, null, null, 7));
    }

    public final void g6(final ProductCard productCard, final String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCard, "productCard");
        WatchlistInteractor watchlistInteractor = this.o;
        if (watchlistInteractor.c()) {
            this.s.f(ProductDetailsContract.Action.LaunchWatchlistGuestOnboardingScreen.f12562a);
            return;
        }
        String strB = watchlistInteractor.b();
        if (strB == null) {
            return;
        }
        boolean zT = ProductCardExtKt.t(productCard, ((ProductDetailsContract.ViewState) this.r.getValue()).k);
        AnalyticsManager analyticsManager = this.k;
        if (zT) {
            watchlistInteractor.d(productCard);
            final ProductDetailsAnalytics.Details.Action action = new ProductDetailsAnalytics.Details(x6()).g;
            action.getClass();
            analyticsManager.i(new Event(action, containerTitle) { // from class: au.com.woolworths.analytics.supers.products.ProductDetailsAnalytics$Details$Action$removeFromWatchlist$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(action.f4045a.f);
                    spreadBuilder.a(new Pair("event.Category", "watchlist"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    androidx.constraintlayout.core.state.a.y("event.Description", androidx.compose.ui.input.pointer.a.m("event.Label", "unsave from watchlist", spreadBuilder, containerTitle), spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "watchlist_buttonclick";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj;
                    return "watchlist_buttonclick".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            }, ProductAnalyticsExtKt.h(productCard, null, null, 7));
            final int i = 0;
            B6(new ResText(com.woolworths.R.string.watchlist_product_removed_snackbar_message), null, new h(20), new Function1(this) { // from class: au.com.woolworths.shop.product.details.c
                public final /* synthetic */ ProductDetailsViewModel e;

                {
                    this.e = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String message = (String) obj;
                    switch (i) {
                        case 0:
                            Intrinsics.h(message, "message");
                            ProductDetailsViewModel productDetailsViewModel = this.e;
                            AnalyticsManager analyticsManager2 = productDetailsViewModel.k;
                            ProductDetailsAnalytics.Details.Action action2 = new ProductDetailsAnalytics.Details(productDetailsViewModel.x6()).g;
                            action2.getClass();
                            String description = containerTitle;
                            Intrinsics.h(description, "description");
                            analyticsManager2.i(new Event(action2, message, description) { // from class: au.com.woolworths.analytics.supers.products.ProductDetailsAnalytics$Details$Action$watchlistSnackbarImpression$1
                                public final Object d;

                                {
                                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                    spreadBuilder.b(action2.f4045a.f);
                                    androidx.constraintlayout.core.state.a.z("event.Category", "watchlist", spreadBuilder, "event.Action", "snackbar_impression");
                                    androidx.constraintlayout.core.state.a.y("event.Description", androidx.compose.ui.input.pointer.a.m("event.Label", String.valueOf(message), spreadBuilder, description), spreadBuilder);
                                    ArrayList arrayList = spreadBuilder.f24269a;
                                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                }

                                @Override // au.com.woolworths.analytics.Event
                                /* renamed from: d */
                                public final String getD() {
                                    return "watchlist_snackbarimpression";
                                }

                                public final boolean equals(Object obj2) {
                                    if (!(obj2 instanceof Event)) {
                                        return false;
                                    }
                                    Event event = (Event) obj2;
                                    return "watchlist_snackbarimpression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                }

                                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                @Override // au.com.woolworths.analytics.Event
                                public final Map getData() {
                                    return this.d;
                                }
                            }, ProductAnalyticsExtKt.h(productCard, null, null, 7));
                            break;
                        default:
                            Intrinsics.h(message, "message");
                            ProductDetailsViewModel productDetailsViewModel2 = this.e;
                            AnalyticsManager analyticsManager3 = productDetailsViewModel2.k;
                            ProductDetailsAnalytics.Details.Action action3 = new ProductDetailsAnalytics.Details(productDetailsViewModel2.x6()).g;
                            action3.getClass();
                            String description2 = containerTitle;
                            Intrinsics.h(description2, "description");
                            analyticsManager3.i(new Event(action3, message, description2) { // from class: au.com.woolworths.analytics.supers.products.ProductDetailsAnalytics$Details$Action$watchlistSnackbarImpression$1
                                public final Object d;

                                {
                                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                    spreadBuilder.b(action3.f4045a.f);
                                    androidx.constraintlayout.core.state.a.z("event.Category", "watchlist", spreadBuilder, "event.Action", "snackbar_impression");
                                    androidx.constraintlayout.core.state.a.y("event.Description", androidx.compose.ui.input.pointer.a.m("event.Label", String.valueOf(message), spreadBuilder, description2), spreadBuilder);
                                    ArrayList arrayList = spreadBuilder.f24269a;
                                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                }

                                @Override // au.com.woolworths.analytics.Event
                                /* renamed from: d */
                                public final String getD() {
                                    return "watchlist_snackbarimpression";
                                }

                                public final boolean equals(Object obj2) {
                                    if (!(obj2 instanceof Event)) {
                                        return false;
                                    }
                                    Event event = (Event) obj2;
                                    return "watchlist_snackbarimpression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                }

                                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                @Override // au.com.woolworths.analytics.Event
                                public final Map getData() {
                                    return this.d;
                                }
                            }, ProductAnalyticsExtKt.h(productCard, null, null, 7));
                            break;
                    }
                    return Unit.f24250a;
                }
            });
            return;
        }
        watchlistInteractor.a(productCard);
        final ProductDetailsAnalytics.Details.Action action2 = new ProductDetailsAnalytics.Details(x6()).g;
        action2.getClass();
        analyticsManager.i(new Event(action2, containerTitle) { // from class: au.com.woolworths.analytics.supers.products.ProductDetailsAnalytics$Details$Action$addToWatchlist$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                spreadBuilder.b(action2.f4045a.f);
                spreadBuilder.a(new Pair("event.Category", "watchlist"));
                spreadBuilder.a(new Pair("event.Action", "button_click"));
                androidx.constraintlayout.core.state.a.y("event.Description", androidx.compose.ui.input.pointer.a.m("event.Label", "save to watchlist", spreadBuilder, containerTitle), spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "watchlist_buttonclick";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "watchlist_buttonclick".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        }, ProductAnalyticsExtKt.h(productCard, null, null, 7));
        ResText resText = new ResText(com.woolworths.R.string.watchlist_product_added_snackbar_message);
        ResText resText2 = new ResText(com.woolworths.R.string.view_list);
        androidx.work.impl.utils.b bVar = new androidx.work.impl.utils.b(this, containerTitle, productCard, strB, 13);
        final int i2 = 1;
        B6(resText, resText2, bVar, new Function1(this) { // from class: au.com.woolworths.shop.product.details.c
            public final /* synthetic */ ProductDetailsViewModel e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String message = (String) obj;
                switch (i2) {
                    case 0:
                        Intrinsics.h(message, "message");
                        ProductDetailsViewModel productDetailsViewModel = this.e;
                        AnalyticsManager analyticsManager2 = productDetailsViewModel.k;
                        ProductDetailsAnalytics.Details.Action action22 = new ProductDetailsAnalytics.Details(productDetailsViewModel.x6()).g;
                        action22.getClass();
                        String description = containerTitle;
                        Intrinsics.h(description, "description");
                        analyticsManager2.i(new Event(action22, message, description) { // from class: au.com.woolworths.analytics.supers.products.ProductDetailsAnalytics$Details$Action$watchlistSnackbarImpression$1
                            public final Object d;

                            {
                                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                spreadBuilder.b(action22.f4045a.f);
                                androidx.constraintlayout.core.state.a.z("event.Category", "watchlist", spreadBuilder, "event.Action", "snackbar_impression");
                                androidx.constraintlayout.core.state.a.y("event.Description", androidx.compose.ui.input.pointer.a.m("event.Label", String.valueOf(message), spreadBuilder, description), spreadBuilder);
                                ArrayList arrayList = spreadBuilder.f24269a;
                                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                            }

                            @Override // au.com.woolworths.analytics.Event
                            /* renamed from: d */
                            public final String getD() {
                                return "watchlist_snackbarimpression";
                            }

                            public final boolean equals(Object obj2) {
                                if (!(obj2 instanceof Event)) {
                                    return false;
                                }
                                Event event = (Event) obj2;
                                return "watchlist_snackbarimpression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                            }

                            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                            @Override // au.com.woolworths.analytics.Event
                            public final Map getData() {
                                return this.d;
                            }
                        }, ProductAnalyticsExtKt.h(productCard, null, null, 7));
                        break;
                    default:
                        Intrinsics.h(message, "message");
                        ProductDetailsViewModel productDetailsViewModel2 = this.e;
                        AnalyticsManager analyticsManager3 = productDetailsViewModel2.k;
                        ProductDetailsAnalytics.Details.Action action3 = new ProductDetailsAnalytics.Details(productDetailsViewModel2.x6()).g;
                        action3.getClass();
                        String description2 = containerTitle;
                        Intrinsics.h(description2, "description");
                        analyticsManager3.i(new Event(action3, message, description2) { // from class: au.com.woolworths.analytics.supers.products.ProductDetailsAnalytics$Details$Action$watchlistSnackbarImpression$1
                            public final Object d;

                            {
                                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                spreadBuilder.b(action3.f4045a.f);
                                androidx.constraintlayout.core.state.a.z("event.Category", "watchlist", spreadBuilder, "event.Action", "snackbar_impression");
                                androidx.constraintlayout.core.state.a.y("event.Description", androidx.compose.ui.input.pointer.a.m("event.Label", String.valueOf(message), spreadBuilder, description2), spreadBuilder);
                                ArrayList arrayList = spreadBuilder.f24269a;
                                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                            }

                            @Override // au.com.woolworths.analytics.Event
                            /* renamed from: d */
                            public final String getD() {
                                return "watchlist_snackbarimpression";
                            }

                            public final boolean equals(Object obj2) {
                                if (!(obj2 instanceof Event)) {
                                    return false;
                                }
                                Event event = (Event) obj2;
                                return "watchlist_snackbarimpression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                            }

                            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                            @Override // au.com.woolworths.analytics.Event
                            public final Map getData() {
                                return this.d;
                            }
                        }, ProductAnalyticsExtKt.h(productCard, null, null, 7));
                        break;
                }
                return Unit.f24250a;
            }
        });
    }

    @Override // androidx.lifecycle.ViewModel
    public final void o6() {
        this.h.a();
    }

    public final void r6(boolean z) {
        ProductDetailsPage productDetailsPage = (ProductDetailsPage) this.h.getD().getValue();
        if (productDetailsPage != null) {
            ProductCard productCardA = ProductDetailsPageKt.a(productDetailsPage);
            if (Intrinsics.c(productCardA != null ? productCardA.getProductId() : null, this.e)) {
                List list = productDetailsPage.f12608a;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof ProductDetailsImages) {
                        arrayList.add(obj);
                    }
                }
                ProductDetailsImages productDetailsImages = (ProductDetailsImages) CollectionsKt.F(arrayList);
                E6(this, this.q, false, productDetailsPage, false, null, null, null, productDetailsImages != null ? productDetailsImages.f12607a : EmptyList.d, null, null, 892);
                BuildersKt.c(ViewModelKt.a(this), null, null, new ProductDetailsViewModel$fetchProductDetailsPage$2(this, null), 3);
                return;
            }
        }
        BuildersKt.c(ViewModelKt.a(this), null, null, new ProductDetailsViewModel$fetchProductDetailsPage$1(this, z, null), 3);
    }

    public final Screen s6() {
        final AnalyticsData analyticsData;
        ProductDetailsPage productDetailsPage = ((ProductDetailsContract.ViewState) this.r.getValue()).f12566a;
        return (productDetailsPage == null || (analyticsData = productDetailsPage.b) == null || analyticsData.getScreenName() == null || analyticsData.getAppSection() == null) ? new ProductDetailsViewModel$getAnalyticsScreen$2() : new Screen(analyticsData) { // from class: au.com.woolworths.shop.product.details.ProductDetailsViewModel$getAnalyticsScreen$1$1
            public final String d;
            public final String e;

            {
                String screenName = analyticsData.getScreenName();
                Intrinsics.e(screenName);
                this.d = screenName;
                String appSection = analyticsData.getAppSection();
                Intrinsics.e(appSection);
                this.e = appSection;
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a, reason: from getter */
            public final String getE() {
                return this.e;
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: d, reason: from getter */
            public final String getD() {
                return this.d;
            }
        };
    }

    public final AnalyticsData t6() {
        AnalyticsData analyticsData;
        ProductDetailsPage productDetailsPage = ((ProductDetailsContract.ViewState) this.r.getValue()).f12566a;
        return (productDetailsPage == null || (analyticsData = productDetailsPage.b) == null) ? new AnalyticsData((EventConfig) null, "productdetails", x6(), "productdetail", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2033, (DefaultConstructorMarker) null) : analyticsData;
    }

    public final ProductCard u6() {
        ProductDetailsPage productDetailsPage = ((ProductDetailsContract.ViewState) this.r.getValue()).f12566a;
        if (productDetailsPage != null) {
            return ProductDetailsPageKt.a(productDetailsPage);
        }
        return null;
    }

    public final AnalyticsData v6(FooterButtonAction footerButtonAction) {
        ButtonData buttonData;
        FooterData footerData;
        Object next;
        ButtonActionData buttonActionData;
        AnalyticsData analyticsData;
        ProductDetailsPage productDetailsPage;
        FooterData footerData2;
        Object next2;
        ButtonActionData buttonActionData2;
        AnalyticsData analyticsData2;
        FooterData footerData3;
        Object next3;
        StateFlow stateFlow = this.r;
        ProductDetailsPage productDetailsPage2 = ((ProductDetailsContract.ViewState) stateFlow.getValue()).f12566a;
        if (productDetailsPage2 == null || (footerData3 = productDetailsPage2.d) == null) {
            buttonData = null;
        } else {
            Iterator it = footerData3.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it.next();
                ButtonActionData buttonActionData3 = ((ButtonData) next3).d;
                if ((buttonActionData3 != null ? buttonActionData3.b : null) == footerButtonAction) {
                    break;
                }
            }
            buttonData = (ButtonData) next3;
        }
        if (buttonData != null) {
            ButtonActionData buttonActionData4 = buttonData.d;
            if (buttonActionData4 != null) {
                return buttonActionData4.d;
            }
        } else {
            int iOrdinal = footerButtonAction.ordinal();
            if (iOrdinal == 1) {
                ProductDetailsPage productDetailsPage3 = ((ProductDetailsContract.ViewState) stateFlow.getValue()).f12566a;
                if (productDetailsPage3 != null && (footerData = productDetailsPage3.d) != null) {
                    Iterator it2 = footerData.b.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        ButtonActionData buttonActionData5 = ((ButtonData) next).d;
                        if ((buttonActionData5 != null ? buttonActionData5.b : null) == FooterButtonAction.g) {
                            break;
                        }
                    }
                    ButtonData buttonData2 = (ButtonData) next;
                    if (buttonData2 != null && (buttonActionData = buttonData2.d) != null && (analyticsData = buttonActionData.d) != null) {
                        return AnalyticsData.a(analyticsData, "Add", null, "Add to cart", null, 1759);
                    }
                }
            } else if (iOrdinal == 2 && (productDetailsPage = ((ProductDetailsContract.ViewState) stateFlow.getValue()).f12566a) != null && (footerData2 = productDetailsPage.d) != null) {
                Iterator it3 = footerData2.b.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                    ButtonActionData buttonActionData6 = ((ButtonData) next2).d;
                    if ((buttonActionData6 != null ? buttonActionData6.b : null) == FooterButtonAction.f) {
                        break;
                    }
                }
                ButtonData buttonData3 = (ButtonData) next2;
                if (buttonData3 != null && (buttonActionData2 = buttonData3.d) != null && (analyticsData2 = buttonActionData2.d) != null) {
                    return AnalyticsData.a(analyticsData2, "update", null, null, null, 1759);
                }
            }
        }
        return null;
    }

    public final ProductImage w6(int i) {
        ProductDetailsPage productDetailsPage = ((ProductDetailsContract.ViewState) this.r.getValue()).f12566a;
        if (productDetailsPage == null) {
            return null;
        }
        List list = productDetailsPage.f12608a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ProductDetailsImages) {
                arrayList.add(obj);
            }
        }
        ProductDetailsImages productDetailsImages = (ProductDetailsImages) CollectionsKt.F(arrayList);
        if (productDetailsImages != null) {
            return (ProductImage) CollectionsKt.J(i, productDetailsImages.f12607a);
        }
        return null;
    }

    public final String x6() {
        String name;
        ProductCard productCardU6 = u6();
        return (productCardU6 == null || (name = productCardU6.getName()) == null) ? "Product Details screen" : name;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0193, code lost:
    
        r12 = au.com.woolworths.shop.product.details.data.ProductHorizontalList.a((au.com.woolworths.shop.product.details.data.ProductHorizontalList) r12, null, 31);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:33:0x00ce, B:36:0x00d5], limit reached: 84 */
    /* JADX WARN: Path cross not found for [B:63:0x0145, B:66:0x014c], limit reached: 84 */
    /* JADX WARN: Path cross not found for [B:69:0x0152, B:74:0x016b], limit reached: 84 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019b  */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13, types: [au.com.woolworths.shop.product.details.data.ProductDetailsRowAccordionProductList] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00e2 -> B:80:0x0193). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x013f -> B:61:0x0141). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object y6(kotlin.coroutines.jvm.internal.ContinuationImpl r17) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.product.details.ProductDetailsViewModel.y6(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void z6(ProductCard productCard) {
        PurchaseRestriction purchaseRestriction = productCard.getPurchaseRestriction();
        PurchaseRestriction purchaseRestriction2 = PurchaseRestriction.LEGAL_AGE_RESTRICTION;
        SharedFlowImpl sharedFlowImpl = this.s;
        if (purchaseRestriction == purchaseRestriction2) {
            ShopAccountInteractor shopAccountInteractor = this.i;
            if (!shopAccountInteractor.K()) {
                sharedFlowImpl.f(new ProductDetailsContract.Action.DisplayRestrictedItemPrompt(shopAccountInteractor.d()));
                return;
            }
        }
        sharedFlowImpl.f(new ProductDetailsContract.Action.LaunchAddToCartBottomSheet(productCard));
    }
}
