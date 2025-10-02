package au.com.woolworths.shop.lists.ui.substitutions;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.models.TrolleyResult;
import au.com.woolworths.base.shopapp.TrolleyInteractor;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.shop.graphql.type.AlternativeProductsMode;
import au.com.woolworths.shop.lists.data.ShoppingListInteractor;
import au.com.woolworths.shop.lists.data.ShoppingListItemInteractor;
import au.com.woolworths.shop.lists.data.SimilarProductsInteractor;
import au.com.woolworths.shop.lists.data.model.AlternativeProductsCtaSection;
import au.com.woolworths.shop.lists.data.model.AlternativeProductsSection;
import au.com.woolworths.shop.lists.data.utils.ListsInMemoryRepository;
import au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsContract;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
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

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/product/tile/ProductClickListener;", "Companion", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ViewSimilarProductsViewModel extends ViewModel implements ProductClickListener {
    public final SimilarProductsInteractor e;
    public final ShoppingListItemInteractor f;
    public final ShoppingListInteractor g;
    public final AnalyticsManager h;
    public final ListsInMemoryRepository i;
    public final TrolleyInteractor j;
    public final MutableStateFlow k;
    public final SharedFlowImpl l;
    public AlternativeProductsMode m;
    public final Flow n;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsViewModel$Companion;", "", "Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract$ViewState;", "InitialViewState", "Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract$ViewState;", "", "CtaActionSearchByCategory", "Ljava/lang/String;", "SubstitutionsScreenTitle", "ValueSwapsScreenTitle", "AlternativesScreenTitle", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[AlternativeProductsMode.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AlternativeProductsMode.Companion companion = AlternativeProductsMode.e;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AlternativeProductsMode.Companion companion2 = AlternativeProductsMode.e;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ViewSimilarProductsViewModel(SimilarProductsInteractor similarProductsInteractor, ShoppingListItemInteractor shoppingListItemInteractor, ShoppingListInteractor shoppingListInteractor, AnalyticsManager analyticsManager, ListsInMemoryRepository listsInMemoryRepository, TrolleyInteractor trolleyInteractor) {
        Intrinsics.h(similarProductsInteractor, "similarProductsInteractor");
        Intrinsics.h(shoppingListItemInteractor, "shoppingListItemInteractor");
        Intrinsics.h(shoppingListInteractor, "shoppingListInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(listsInMemoryRepository, "listsInMemoryRepository");
        Intrinsics.h(trolleyInteractor, "trolleyInteractor");
        this.e = similarProductsInteractor;
        this.f = shoppingListItemInteractor;
        this.g = shoppingListInteractor;
        this.h = analyticsManager;
        this.i = listsInMemoryRepository;
        this.j = trolleyInteractor;
        this.k = StateFlowKt.a(ViewSimilarProductsContract.ViewState.Loading.f12482a);
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.l = sharedFlowImplB;
        this.m = AlternativeProductsMode.i;
        this.n = FlowKt.a(sharedFlowImplB);
    }

    public static final ArrayList p6(ViewSimilarProductsViewModel viewSimilarProductsViewModel, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            AlternativeProductsSection alternativeProductsSection = (AlternativeProductsSection) obj;
            if (alternativeProductsSection instanceof AlternativeProductsCtaSection ? Intrinsics.c(((AlternativeProductsCtaSection) alternativeProductsSection).getAction(), "search-by-category") : true) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        if (r5.emit(r7, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object q6(au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel r5, java.lang.String r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            boolean r0 = r7 instanceof au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel$finishWithResult$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel$finishWithResult$1 r0 = (au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel$finishWithResult$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel$finishWithResult$1 r0 = new au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel$finishWithResult$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r7)
            goto L62
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            kotlin.ResultKt.b(r7)
            goto L44
        L36:
            kotlin.ResultKt.b(r7)
            au.com.woolworths.shop.lists.data.ShoppingListInteractor r7 = r5.g
            r0.r = r4
            java.lang.Object r7 = r7.d(r6, r0)
            if (r7 != r1) goto L44
            goto L61
        L44:
            au.com.woolworths.shop.lists.data.model.ShoppingList r7 = (au.com.woolworths.shop.lists.data.model.ShoppingList) r7
            if (r7 == 0) goto L4e
            java.lang.String r6 = r7.getTitle()
            if (r6 != 0) goto L50
        L4e:
            java.lang.String r6 = ""
        L50:
            au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsContract$ResultStatus r7 = au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsContract.ResultStatus.d
            kotlinx.coroutines.flow.SharedFlowImpl r5 = r5.l
            au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsContract$Action$FinishWithResult r7 = new au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsContract$Action$FinishWithResult
            r7.<init>(r6)
            r0.r = r3
            java.lang.Object r5 = r5.emit(r7, r0)
            if (r5 != r1) goto L62
        L61:
            return r1
        L62:
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel.q6(au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String r6(java.util.List r3, au.com.woolworths.shop.graphql.type.AlternativeProductsMode r4) {
        /*
            java.lang.String r4 = s6(r4)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        Lf:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r3.next()
            boolean r2 = r1 instanceof au.com.woolworths.shop.lists.data.model.AlternativeProductsTargetProductSection
            if (r2 == 0) goto Lf
            r0.add(r1)
            goto Lf
        L21:
            java.lang.Object r3 = kotlin.collections.CollectionsKt.F(r0)
            au.com.woolworths.shop.lists.data.model.AlternativeProductsSection r3 = (au.com.woolworths.shop.lists.data.model.AlternativeProductsSection) r3
            au.com.woolworths.shop.lists.data.model.AlternativeProductsTargetProductSection r3 = (au.com.woolworths.shop.lists.data.model.AlternativeProductsTargetProductSection) r3
            if (r3 != 0) goto L2c
            return r4
        L2c:
            au.com.woolworths.product.models.ProductCard r0 = r3.getProduct()
            boolean r0 = r0.isAvailable()
            if (r0 != 0) goto L39
            java.lang.String r0 = "Unavailable"
            goto L68
        L39:
            au.com.woolworths.product.models.ProductCard r0 = r3.getProduct()
            java.lang.Integer r0 = r0.getPrice()
            if (r0 == 0) goto L66
            int r0 = r0.intValue()
            int r1 = r0 / 100
            int r0 = r0 % 100
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " dollars and "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = " cents"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            if (r0 != 0) goto L68
        L66:
            java.lang.String r0 = ""
        L68:
            au.com.woolworths.product.models.ProductCard r3 = r3.getProduct()
            java.lang.String r3 = r3.getName()
            java.lang.String r1 = " "
            java.lang.String r3 = androidx.constraintlayout.core.state.a.j(r4, r1, r3, r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel.r6(java.util.List, au.com.woolworths.shop.graphql.type.AlternativeProductsMode):java.lang.String");
    }

    public static String s6(AlternativeProductsMode alternativeProductsMode) {
        Intrinsics.h(alternativeProductsMode, "alternativeProductsMode");
        int iOrdinal = alternativeProductsMode.ordinal();
        if (iOrdinal == 0) {
            return "Lower unit price options";
        }
        if (iOrdinal == 1) {
            return "Find similar items for";
        }
        if (iOrdinal == 2) {
            return "View similar";
        }
        throw new IllegalArgumentException("Unknown header banner type");
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void D4(ProductCard productCardTileData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardTileData, "productCardTileData");
        this.l.f(new ViewSimilarProductsContract.Action.DisplayAddToCartBottomSheet(productCardTileData));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void J1(ProductCard productCardData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardData, "productCardData");
        if (this.m == AlternativeProductsMode.h) {
            this.l.f(new ViewSimilarProductsContract.Action.LaunchProductDetailsScreen(productCardData));
        }
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void L0(ProductCard productCardTileData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardTileData, "productCardTileData");
        this.l.f(new ViewSimilarProductsContract.Action.DisplayAddToListBottomSheet(productCardTileData));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void T4(ProductCard productCardTileData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardTileData, "productCardTileData");
        this.l.f(new ViewSimilarProductsContract.Action.DisplayAddToCartBottomSheet(productCardTileData));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void g5(ProductCard productCardTileData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardTileData, "productCardTileData");
        this.l.f(new ViewSimilarProductsContract.Action.DisplaySeeInStoreBottomSheet(productCardTileData));
    }

    public final void t6(String productId, AlternativeProductsMode alternativeProductsMode) {
        Intrinsics.h(productId, "productId");
        Intrinsics.h(alternativeProductsMode, "alternativeProductsMode");
        this.m = alternativeProductsMode;
        final StateFlow stateFlowV = this.j.v();
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new ViewSimilarProductsViewModel$onReady$2(this, null), new Flow<TrolleyResult>() { // from class: au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel$onReady$$inlined$mapNotNull$1

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel$onReady$$inlined$mapNotNull$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel$onReady$$inlined$mapNotNull$1$2", f = "ViewSimilarProductsViewModel.kt", l = {52}, m = "emit")
                /* renamed from: au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel$onReady$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                        boolean r0 = r6 instanceof au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel$onReady$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel$onReady$$inlined$mapNotNull$1$2$1 r0 = (au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel$onReady$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.q = r1
                        goto L18
                    L13:
                        au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel$onReady$$inlined$mapNotNull$1$2$1 r0 = new au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel$onReady$$inlined$mapNotNull$1$2$1
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
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel$onReady$$inlined$mapNotNull$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = stateFlowV.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        }), ViewModelKt.a(this));
        BuildersKt.c(ViewModelKt.a(this), null, null, new ViewSimilarProductsViewModel$onReady$3(this, productId, alternativeProductsMode, null), 3);
    }
}
