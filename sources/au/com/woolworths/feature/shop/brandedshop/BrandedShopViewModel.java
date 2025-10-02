package au.com.woolworths.feature.shop.brandedshop;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.analytics.model.AnalyticsDataKt$getScreen$1;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.supers.brandedshop.BrandedShopAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.TrolleyResult;
import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.base.shopapp.TrolleyInteractor;
import au.com.woolworths.feature.shop.brandedshop.Effect;
import au.com.woolworths.feature.shop.brandedshop.UiEvent;
import au.com.woolworths.feature.shop.brandedshop.data.BrandedShopData;
import au.com.woolworths.feature.shop.brandedshop.data.BrandedShopErrorData;
import au.com.woolworths.feature.shop.brandedshop.data.BrandedShopFeedItem;
import au.com.woolworths.feature.shop.brandedshop.data.BrandedShopHeaderData;
import au.com.woolworths.feature.shop.brandedshop.data.BrandedShopProductGridConfig;
import au.com.woolworths.feature.shop.brandedshop.data.ItemKey;
import au.com.woolworths.feature.shop.brandedshop.data.LocalAction;
import au.com.woolworths.feature.shop.brandedshop.mappers.BrandedShopDataHelperKt;
import au.com.woolworths.foundation.shop.instore.navigation.AnalyticsManagerExtKt;
import au.com.woolworths.foundation.shop.instore.navigation.map.InstoreNavigationInteractor;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.productbottomsheet.ProductListFeedTrolleyUpdater;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.model.action.ActionType;
import au.com.woolworths.shop.aem.components.model.GenericPageFeedItem;
import au.com.woolworths.shop.aem.components.model.bottomsheet.GenericPageBottomSheetItem;
import au.com.woolworths.shop.aem.components.model.bottomsheet.StaticBottomSheetData;
import au.com.woolworths.shop.aem.components.model.button.ButtonData;
import au.com.woolworths.shop.aem.components.model.contentcard.ContentCardData;
import au.com.woolworths.shop.aem.components.model.contentcard.FullWidthContentCardData;
import au.com.woolworths.shop.aem.components.model.contentcard.FullWidthImageCardData;
import au.com.woolworths.shop.aem.components.model.contentcard.NavRoundelCardData;
import au.com.woolworths.shop.aem.components.model.downloadableAsset.DownloadableAssetData;
import au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListData;
import au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListItem;
import au.com.woolworths.shop.aem.components.model.link.LinkData;
import au.com.woolworths.shop.aem.components.model.paragraph.ParagraphTextItemData;
import au.com.woolworths.shop.aem.components.model.product.ProductSectionData;
import au.com.woolworths.shop.aem.components.model.tab.TabSectionData;
import au.com.woolworths.shop.aem.components.model.tab.TabSectionItemData;
import au.com.woolworths.shop.aem.components.model.title.TitleSectionData;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import com.medallia.digital.mobilesdk.q2;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/BrandedShopViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/product/tile/ProductClickListener;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BrandedShopViewModel extends ViewModel implements ProductClickListener {
    public final BrandedShopInteractor e;
    public final CartUpdateInteractor f;
    public final FeatureToggleManager g;
    public final TrolleyInteractor h;
    public final AnalyticsManager i;
    public final InstoreNavigationInteractor j;
    public final MutableStateFlow k;
    public final StateFlow l;
    public final SharedFlowImpl m;
    public final Flow n;
    public BrandedShopData o;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.brandedshop.BrandedShopViewModel$1", f = "BrandedShopViewModel.kt", l = {94}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.brandedshop.BrandedShopViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return BrandedShopViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
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
            final BrandedShopViewModel brandedShopViewModel = BrandedShopViewModel.this;
            Flow flow = brandedShopViewModel.f.l;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.brandedshop.BrandedShopViewModel.1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    int iIntValue = ((Number) obj2).intValue();
                    BrandedShopViewModel brandedShopViewModel2 = brandedShopViewModel;
                    brandedShopViewModel2.k.f(ViewState.a((ViewState) brandedShopViewModel2.l.getValue(), new Integer(iIntValue), false, null, null, null, null, null, null, null, 510));
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            flow.collect(flowCollector, this);
            return coroutineSingletons;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.brandedshop.BrandedShopViewModel$2", f = "BrandedShopViewModel.kt", l = {103}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.feature.shop.brandedshop.BrandedShopViewModel$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return BrandedShopViewModel.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                final BrandedShopViewModel brandedShopViewModel = BrandedShopViewModel.this;
                final StateFlow p = brandedShopViewModel.h.getP();
                Flow<Result<? extends TrolleyResult>> flow = new Flow<Result<? extends TrolleyResult>>() { // from class: au.com.woolworths.feature.shop.brandedshop.BrandedShopViewModel$2$invokeSuspend$$inlined$filter$1

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @SourceDebugExtension
                    /* renamed from: au.com.woolworths.feature.shop.brandedshop.BrandedShopViewModel$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public final class AnonymousClass2<T> implements FlowCollector {
                        public final /* synthetic */ FlowCollector d;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        @DebugMetadata(c = "au.com.woolworths.feature.shop.brandedshop.BrandedShopViewModel$2$invokeSuspend$$inlined$filter$1$2", f = "BrandedShopViewModel.kt", l = {50}, m = "emit")
                        /* renamed from: au.com.woolworths.feature.shop.brandedshop.BrandedShopViewModel$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                                boolean r0 = r6 instanceof au.com.woolworths.feature.shop.brandedshop.BrandedShopViewModel$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                au.com.woolworths.feature.shop.brandedshop.BrandedShopViewModel$2$invokeSuspend$$inlined$filter$1$2$1 r0 = (au.com.woolworths.feature.shop.brandedshop.BrandedShopViewModel$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.q
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.q = r1
                                goto L18
                            L13:
                                au.com.woolworths.feature.shop.brandedshop.BrandedShopViewModel$2$invokeSuspend$$inlined$filter$1$2$1 r0 = new au.com.woolworths.feature.shop.brandedshop.BrandedShopViewModel$2$invokeSuspend$$inlined$filter$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.p
                                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                                int r2 = r0.q
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
                                r6 = r5
                                au.com.woolworths.android.onesite.rxutils.Result r6 = (au.com.woolworths.android.onesite.rxutils.Result) r6
                                boolean r6 = r6.b()
                                if (r6 == 0) goto L46
                                r0.q = r3
                                kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L46
                                return r1
                            L46:
                                kotlin.Unit r5 = kotlin.Unit.f24250a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.brandedshop.BrandedShopViewModel$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = p.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
                    }
                };
                FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.brandedshop.BrandedShopViewModel.2.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        BrandedShopData brandedShopData;
                        TrolleyResult trolleyResult = (TrolleyResult) ((Result) obj2).f4591a;
                        if (trolleyResult != null) {
                            BrandedShopViewModel brandedShopViewModel2 = brandedShopViewModel;
                            BrandedShopData brandedShopData2 = brandedShopViewModel2.o;
                            if (brandedShopData2 == null) {
                                brandedShopData = null;
                            } else {
                                List<Object> list = brandedShopData2.c;
                                int i2 = 10;
                                ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
                                for (Object objA : list) {
                                    if (objA instanceof TabSectionData) {
                                        TabSectionData tabSectionData = (TabSectionData) objA;
                                        List<TabSectionItemData> list2 = tabSectionData.b;
                                        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list2, i2));
                                        for (TabSectionItemData tabSectionItemData : list2) {
                                            List list3 = tabSectionItemData.c;
                                            ArrayList arrayList3 = new ArrayList(CollectionsKt.s(list3, i2));
                                            for (T t : list3) {
                                                if (t instanceof ProductSectionData) {
                                                    ProductSectionData productSectionData = (ProductSectionData) t;
                                                    List list4 = productSectionData.d;
                                                    ArrayList arrayList4 = new ArrayList();
                                                    for (T t2 : list4) {
                                                        if (t2 instanceof ProductCard) {
                                                            arrayList4.add(t2);
                                                        }
                                                    }
                                                    t = (T) ProductSectionData.a(productSectionData, ProductListFeedTrolleyUpdater.c(arrayList4, trolleyResult));
                                                }
                                                arrayList3.add(t);
                                            }
                                            arrayList2.add(new TabSectionItemData(tabSectionItemData.f10183a, tabSectionItemData.b, arrayList3));
                                            i2 = 10;
                                        }
                                        objA = new TabSectionData(tabSectionData.f10182a, arrayList2);
                                    } else if (objA instanceof ProductSectionData) {
                                        ProductSectionData productSectionData2 = (ProductSectionData) objA;
                                        List list5 = productSectionData2.d;
                                        ArrayList arrayList5 = new ArrayList();
                                        for (T t3 : list5) {
                                            if (t3 instanceof ProductCard) {
                                                arrayList5.add(t3);
                                            }
                                        }
                                        objA = ProductSectionData.a(productSectionData2, ProductListFeedTrolleyUpdater.c(arrayList5, trolleyResult));
                                    }
                                    arrayList.add(objA);
                                    i2 = 10;
                                }
                                brandedShopData = new BrandedShopData(brandedShopData2.f6677a, brandedShopData2.b, arrayList, brandedShopData2.d, brandedShopData2.e);
                            }
                            brandedShopViewModel2.o = brandedShopData;
                            if (brandedShopData != null) {
                                brandedShopViewModel2.u6(((ViewState) brandedShopViewModel2.l.getValue()).c, brandedShopData);
                            }
                        }
                        return Unit.f24250a;
                    }
                };
                this.p = 1;
                if (flow.collect(flowCollector, this) == coroutineSingletons) {
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6656a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ActionType.values().length];
            try {
                ActionType actionType = ActionType.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ActionType actionType2 = ActionType.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6656a = iArr;
            int[] iArr2 = new int[LocalAction.values().length];
            try {
                LocalAction.Companion companion = LocalAction.d;
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            b = iArr2;
        }
    }

    public BrandedShopViewModel(BrandedShopInteractor brandedShopInteractor, CartUpdateInteractor cartUpdateInteractor, FeatureToggleManager featureToggleManager, TrolleyInteractor trolleyInteractor, AnalyticsManager analyticsManager, InstoreNavigationInteractor instoreNavigationInteractor) {
        Intrinsics.h(cartUpdateInteractor, "cartUpdateInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(trolleyInteractor, "trolleyInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(instoreNavigationInteractor, "instoreNavigationInteractor");
        this.e = brandedShopInteractor;
        this.f = cartUpdateInteractor;
        this.g = featureToggleManager;
        this.h = trolleyInteractor;
        this.i = analyticsManager;
        this.j = instoreNavigationInteractor;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(ViewState.j);
        this.k = mutableStateFlowA;
        this.l = mutableStateFlowA;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.m = sharedFlowImplB;
        this.n = FlowKt.a(sharedFlowImplB);
        if (cartUpdateInteractor.b.z()) {
            BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass1(null), 3);
            BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass2(null), 3);
        }
    }

    public static final void p6(BrandedShopViewModel brandedShopViewModel, BrandedShopData brandedShopData) {
        AnalyticsData analyticsData = brandedShopData.e;
        AnalyticsData analyticsDataC = analyticsData != null ? AnalyticsDataKt.c(analyticsData, brandedShopData.d, false) : null;
        if (analyticsDataC != null) {
            brandedShopViewModel.i.f(new AnalyticsDataKt$getScreen$1(AnalyticsDataKt.a(analyticsDataC)));
        }
    }

    public static String q6(String action) throws UnsupportedEncodingException {
        String strDecode;
        Intrinsics.h(action, "action");
        try {
            strDecode = URLDecoder.decode(action, Charsets.f24671a.name());
        } catch (UnsupportedEncodingException unused) {
            strDecode = null;
        }
        Object obj = "";
        if (strDecode != null) {
            List listT = StringsKt.T(strDecode, new String[]{q2.c}, 6);
            if (strDecode.length() > 0) {
                obj = listT.get(0);
            }
        }
        return (String) obj;
    }

    public static void v6(BrandedShopViewModel brandedShopViewModel, boolean z, Map map, BrandedShopProductGridConfig brandedShopProductGridConfig, ArrayList arrayList, BrandedShopErrorData brandedShopErrorData, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            map = EmptyMap.d;
        }
        brandedShopViewModel.k.f(ViewState.a((ViewState) brandedShopViewModel.l.getValue(), null, z2, map, (i & 4) != 0 ? null : brandedShopProductGridConfig, null, (i & 8) != 0 ? null : arrayList, null, null, (i & 16) != 0 ? null : brandedShopErrorData, 209));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void D4(ProductCard productCardTileData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardTileData, "productCardTileData");
        this.m.f(new Effect.LaunchAddToCartBottomSheet(productCardTileData));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void J1(ProductCard productCardData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardData, "productCardData");
        this.i.i((Event) new BrandedShopAnalytics.BrandedShop(r6()).h.c.getD(), ProductAnalyticsExtKt.h(productCardData, null, null, 7));
        this.m.f(new Effect.LaunchProductDetails(productCardData));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void L0(ProductCard productCardTileData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardTileData, "productCardTileData");
        this.m.f(new Effect.LaunchListsBottomSheet(productCardTileData));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void T0(ProductCard productCardData) {
        Intrinsics.h(productCardData, "productCardData");
        this.m.f(new Effect.LaunchInStoreMap(productCardData));
        BrandedShopAnalytics.BrandedShop brandedShop = new BrandedShopAnalytics.BrandedShop(r6());
        TrackableValue trackableValue = TrackableValue.e;
        ?? r0 = brandedShop.f;
        AnalyticsManagerExtKt.a(this.i, (String) r0.get("screen.Name"), (String) r0.get("screen.Type"), (String) r0.get("app.Section"), productCardData);
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void T4(ProductCard productCardTileData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardTileData, "productCardTileData");
        this.m.f(new Effect.LaunchAddToCartBottomSheet(productCardTileData));
    }

    public final String r6() {
        String str;
        BrandedShopHeaderData brandedShopHeaderData = ((ViewState) this.l.getValue()).e;
        if (brandedShopHeaderData == null || (str = brandedShopHeaderData.f6692a) == null) {
            str = "Brands";
        }
        return str.concat(" screen");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v9, types: [au.com.woolworths.shop.aem.components.model.bottomsheet.GenericPageBottomSheetItem] */
    public final void s6(ActionData actionData) throws UnsupportedEncodingException {
        LocalAction localAction;
        StaticBottomSheetData staticBottomSheetData;
        Object next;
        ActionType type = actionData != null ? actionData.getType() : null;
        int i = type == null ? -1 : WhenMappings.f6656a[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.m.f(new Effect.OpenLink(actionData.getAction()));
            return;
        }
        List listT = StringsKt.T(actionData.getAction(), new String[]{q2.c}, 6);
        if (listT.size() > 1) {
            LocalAction.Companion companion = LocalAction.d;
            String actionString = (String) listT.get(0);
            companion.getClass();
            Intrinsics.h(actionString, "actionString");
            LocalAction[] localActionArrValues = LocalAction.values();
            int length = localActionArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    localAction = null;
                    break;
                }
                localAction = localActionArrValues[i2];
                localAction.getClass();
                if ("openbottomsheet".equals(actionString)) {
                    break;
                } else {
                    i2++;
                }
            }
            if ((localAction != null ? WhenMappings.b[localAction.ordinal()] : -1) == 1) {
                String str = (String) listT.get(1);
                BrandedShopData brandedShopData = this.o;
                if (brandedShopData != null) {
                    List list = brandedShopData.b;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            GenericPageBottomSheetItem genericPageBottomSheetItem = (GenericPageBottomSheetItem) next;
                            if (genericPageBottomSheetItem instanceof StaticBottomSheetData ? ((StaticBottomSheetData) genericPageBottomSheetItem).f10143a.equals(str) : false) {
                                break;
                            }
                        }
                        staticBottomSheetData = (GenericPageBottomSheetItem) next;
                    } else {
                        staticBottomSheetData = null;
                    }
                    this.k.f(ViewState.a((ViewState) this.l.getValue(), null, false, null, null, null, null, null, staticBottomSheetData, null, 383));
                    StaticBottomSheetData staticBottomSheetData2 = staticBottomSheetData instanceof StaticBottomSheetData ? staticBottomSheetData : null;
                    if (staticBottomSheetData2 != null) {
                        BrandedShopAnalytics.BrandedShop brandedShop = new BrandedShopAnalytics.BrandedShop(r6());
                        final String str2 = staticBottomSheetData2.b;
                        final String description = q6(str);
                        final BrandedShopAnalytics.BrandedShop.Action action = brandedShop.h;
                        action.getClass();
                        Intrinsics.h(description, "description");
                        this.i.g(new Event(action, str2, description) { // from class: au.com.woolworths.analytics.supers.brandedshop.BrandedShopAnalytics$BrandedShop$Action$accordionOpen$1
                            public final Object d;

                            {
                                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                spreadBuilder.b(action.f4030a.g);
                                spreadBuilder.a(new Pair("event.Category", "branded_shop"));
                                spreadBuilder.a(new Pair("event.Action", "accordion_open"));
                                androidx.constraintlayout.core.state.a.z("event.Label", str2, spreadBuilder, "event.Description", description);
                                ArrayList arrayList = spreadBuilder.f24269a;
                                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                            }

                            @Override // au.com.woolworths.analytics.Event
                            /* renamed from: d */
                            public final String getE() {
                                return "accordion_open";
                            }

                            public final boolean equals(Object obj) {
                                if (!(obj instanceof Event)) {
                                    return false;
                                }
                                Event event = (Event) obj;
                                return "accordion_open".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                            }

                            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                            @Override // au.com.woolworths.analytics.Event
                            public final Map getData() {
                                return this.d;
                            }
                        });
                    }
                }
            }
        }
    }

    public final void t6(UiEvent event) {
        final String str;
        Intrinsics.h(event, "event");
        boolean z = event instanceof UiEvent.OnTabClick;
        AnalyticsManager analyticsManager = this.i;
        if (z) {
            UiEvent.OnTabClick onTabClick = (UiEvent.OnTabClick) event;
            LinkedHashMap linkedHashMap = onTabClick.f6675a;
            final String description = onTabClick.b;
            final String label = onTabClick.c;
            BrandedShopData brandedShopData = this.o;
            if (brandedShopData != null) {
                u6(linkedHashMap, brandedShopData);
            }
            final BrandedShopAnalytics.BrandedShop.Action action = new BrandedShopAnalytics.BrandedShop(r6()).h;
            action.getClass();
            Intrinsics.h(label, "label");
            Intrinsics.h(description, "description");
            analyticsManager.g(new Event(action, label, description) { // from class: au.com.woolworths.analytics.supers.brandedshop.BrandedShopAnalytics$BrandedShop$Action$tabClick$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(action.f4030a.g);
                    spreadBuilder.a(new Pair("event.Category", "branded_shop"));
                    spreadBuilder.a(new Pair("event.Action", "tab_click"));
                    androidx.constraintlayout.core.state.a.y("event.Description", androidx.compose.ui.input.pointer.a.m("event.Label", YU.a.A("Tab name : ", label), spreadBuilder, description), spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "tab_click";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event2 = (Event) obj;
                    return "tab_click".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
            return;
        }
        boolean z2 = event instanceof UiEvent.OnBottomSheetDismiss;
        MutableStateFlow mutableStateFlow = this.k;
        StateFlow stateFlow = this.l;
        if (z2) {
            GenericPageBottomSheetItem genericPageBottomSheetItem = ((ViewState) stateFlow.getValue()).h;
            mutableStateFlow.f(ViewState.a((ViewState) stateFlow.getValue(), null, false, null, null, null, null, null, null, null, 383));
            StaticBottomSheetData staticBottomSheetData = genericPageBottomSheetItem instanceof StaticBottomSheetData ? (StaticBottomSheetData) genericPageBottomSheetItem : null;
            if (staticBottomSheetData != null) {
                BrandedShopAnalytics.BrandedShop brandedShop = new BrandedShopAnalytics.BrandedShop(r6());
                final String str2 = staticBottomSheetData.b;
                final String description2 = q6(staticBottomSheetData.f10143a);
                final BrandedShopAnalytics.BrandedShop.Action action2 = brandedShop.h;
                action2.getClass();
                Intrinsics.h(description2, "description");
                analyticsManager.g(new Event(action2, str2, description2) { // from class: au.com.woolworths.analytics.supers.brandedshop.BrandedShopAnalytics$BrandedShop$Action$accordionClose$1
                    public final Object d;

                    {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                        spreadBuilder.b(action2.f4030a.g);
                        spreadBuilder.a(new Pair("event.Category", "branded_shop"));
                        spreadBuilder.a(new Pair("event.Action", "accordion_close"));
                        androidx.constraintlayout.core.state.a.z("event.Label", str2, spreadBuilder, "event.Description", description2);
                        ArrayList arrayList = spreadBuilder.f24269a;
                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                    }

                    @Override // au.com.woolworths.analytics.Event
                    /* renamed from: d */
                    public final String getE() {
                        return "accordion_close";
                    }

                    public final boolean equals(Object obj) {
                        if (!(obj instanceof Event)) {
                            return false;
                        }
                        Event event2 = (Event) obj;
                        return "accordion_close".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    @Override // au.com.woolworths.analytics.Event
                    public final Map getData() {
                        return this.d;
                    }
                });
                return;
            }
            return;
        }
        if (event instanceof UiEvent.OnSnackbarStateChanged) {
            mutableStateFlow.f(ViewState.a((ViewState) stateFlow.getValue(), null, false, null, null, null, null, ((UiEvent.OnSnackbarStateChanged) event).f6674a, null, null, 447));
            return;
        }
        if (event instanceof UiEvent.OnButtonClick) {
            ButtonData buttonData = ((UiEvent.OnButtonClick) event).f6667a;
            s6(buttonData.e);
            BrandedShopAnalytics.BrandedShop brandedShop2 = new BrandedShopAnalytics.BrandedShop(r6());
            final String label2 = buttonData.b;
            String str3 = buttonData.f10145a;
            str = str3 != null ? str3 : "";
            final BrandedShopAnalytics.BrandedShop.Action action3 = brandedShop2.h;
            action3.getClass();
            Intrinsics.h(label2, "label");
            analyticsManager.g(new Event(action3, label2, str) { // from class: au.com.woolworths.analytics.supers.brandedshop.BrandedShopAnalytics$BrandedShop$Action$buttonClick$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(action3.f4030a.g);
                    androidx.constraintlayout.core.state.a.z("event.Category", "branded_shop", spreadBuilder, "event.Action", "button_click");
                    androidx.constraintlayout.core.state.a.z("event.Label", String.valueOf(label2), spreadBuilder, "event.Description", str);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "button_click";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event2 = (Event) obj;
                    return "button_click".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
            return;
        }
        if (event instanceof UiEvent.OnLinkClick) {
            LinkData linkData = ((UiEvent.OnLinkClick) event).f6671a;
            s6(linkData.b);
            BrandedShopAnalytics.BrandedShop brandedShop3 = new BrandedShopAnalytics.BrandedShop(r6());
            final String label3 = linkData.c.f10170a;
            String str4 = linkData.f10169a;
            str = str4 != null ? str4 : "";
            final BrandedShopAnalytics.BrandedShop.Action action4 = brandedShop3.h;
            action4.getClass();
            Intrinsics.h(label3, "label");
            analyticsManager.g(new Event(action4, label3, str) { // from class: au.com.woolworths.analytics.supers.brandedshop.BrandedShopAnalytics$BrandedShop$Action$linkClick$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(action4.f4030a.g);
                    androidx.constraintlayout.core.state.a.z("event.Category", "branded_shop", spreadBuilder, "event.Action", "link_click");
                    androidx.constraintlayout.core.state.a.z("event.Label", String.valueOf(label3), spreadBuilder, "event.Description", str);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "link_click";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event2 = (Event) obj;
                    return "link_click".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
            return;
        }
        if (event instanceof UiEvent.OnListItemClick) {
            HorizontalListItem horizontalListItem = ((UiEvent.OnListItemClick) event).f6672a;
            if (horizontalListItem instanceof ContentCardData) {
                ContentCardData contentCardData = (ContentCardData) horizontalListItem;
                ActionData actionData = contentCardData.h;
                if (actionData != null) {
                    s6(actionData);
                }
                BrandedShopAnalytics.BrandedShop brandedShop4 = new BrandedShopAnalytics.BrandedShop(r6());
                final String str5 = contentCardData.f;
                if (str5 == null && (str5 = contentCardData.g) == null) {
                    str5 = "";
                }
                String str6 = contentCardData.d;
                str = str6 != null ? str6 : "";
                final BrandedShopAnalytics.BrandedShop.Action action5 = brandedShop4.h;
                action5.getClass();
                analyticsManager.g(new Event(action5, str5, str) { // from class: au.com.woolworths.analytics.supers.brandedshop.BrandedShopAnalytics$BrandedShop$Action$listItemClick$1
                    public final Object d;

                    {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                        spreadBuilder.b(action5.f4030a.g);
                        spreadBuilder.a(new Pair("event.Category", "branded_shop"));
                        spreadBuilder.a(new Pair("event.Action", "teaser_title_click"));
                        androidx.constraintlayout.core.state.a.z("event.Label", str5, spreadBuilder, "event.Description", str);
                        ArrayList arrayList = spreadBuilder.f24269a;
                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                    }

                    @Override // au.com.woolworths.analytics.Event
                    /* renamed from: d */
                    public final String getE() {
                        return "teaser_title_click";
                    }

                    public final boolean equals(Object obj) {
                        if (!(obj instanceof Event)) {
                            return false;
                        }
                        Event event2 = (Event) obj;
                        return "teaser_title_click".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    @Override // au.com.woolworths.analytics.Event
                    public final Map getData() {
                        return this.d;
                    }
                });
                return;
            }
            if (horizontalListItem instanceof NavRoundelCardData) {
                NavRoundelCardData navRoundelCardData = (NavRoundelCardData) horizontalListItem;
                ActionData actionData2 = navRoundelCardData.g;
                if (actionData2 != null) {
                    s6(actionData2);
                }
                BrandedShopAnalytics.BrandedShop brandedShop5 = new BrandedShopAnalytics.BrandedShop(r6());
                final String str7 = navRoundelCardData.f;
                if (str7 == null) {
                    str7 = "";
                }
                String str8 = navRoundelCardData.d;
                str = str8 != null ? str8 : "";
                final BrandedShopAnalytics.BrandedShop.Action action6 = brandedShop5.h;
                action6.getClass();
                analyticsManager.g(new Event(action6, str7, str) { // from class: au.com.woolworths.analytics.supers.brandedshop.BrandedShopAnalytics$BrandedShop$Action$listItemClick$1
                    public final Object d;

                    {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                        spreadBuilder.b(action6.f4030a.g);
                        spreadBuilder.a(new Pair("event.Category", "branded_shop"));
                        spreadBuilder.a(new Pair("event.Action", "teaser_title_click"));
                        androidx.constraintlayout.core.state.a.z("event.Label", str7, spreadBuilder, "event.Description", str);
                        ArrayList arrayList = spreadBuilder.f24269a;
                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                    }

                    @Override // au.com.woolworths.analytics.Event
                    /* renamed from: d */
                    public final String getE() {
                        return "teaser_title_click";
                    }

                    public final boolean equals(Object obj) {
                        if (!(obj instanceof Event)) {
                            return false;
                        }
                        Event event2 = (Event) obj;
                        return "teaser_title_click".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    @Override // au.com.woolworths.analytics.Event
                    public final Map getData() {
                        return this.d;
                    }
                });
                return;
            }
            return;
        }
        boolean z3 = event instanceof UiEvent.OnShoppingListViewClick;
        SharedFlowImpl sharedFlowImpl = this.m;
        if (z3) {
            sharedFlowImpl.f(new Effect.ViewShoppingList(((UiEvent.OnShoppingListViewClick) event).f6673a));
            return;
        }
        if (event instanceof UiEvent.OnFullWidthContentCardClick) {
            FullWidthContentCardData fullWidthContentCardData = ((UiEvent.OnFullWidthContentCardClick) event).f6669a;
            s6(fullWidthContentCardData.f);
            BrandedShopAnalytics.BrandedShop brandedShop6 = new BrandedShopAnalytics.BrandedShop(r6());
            final String str9 = fullWidthContentCardData.c;
            if (str9 == null && (str9 = fullWidthContentCardData.d) == null) {
                str9 = "";
            }
            String str10 = fullWidthContentCardData.f10149a;
            str = str10 != null ? str10 : "";
            final BrandedShopAnalytics.BrandedShop.Action action7 = brandedShop6.h;
            action7.getClass();
            analyticsManager.g(new Event(action7, str9, str) { // from class: au.com.woolworths.analytics.supers.brandedshop.BrandedShopAnalytics$BrandedShop$Action$contentCardClick$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(action7.f4030a.g);
                    spreadBuilder.a(new Pair("event.Category", "Content Card"));
                    spreadBuilder.a(new Pair("event.Action", "banner_click"));
                    androidx.constraintlayout.core.state.a.z("event.Label", str9, spreadBuilder, "event.Description", str);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "contentcard_banner_click";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event2 = (Event) obj;
                    return "contentcard_banner_click".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
            return;
        }
        if (event instanceof UiEvent.OnErrorRetryClick) {
            String str11 = ((UiEvent.OnErrorRetryClick) event).f6668a;
            v6(this, true, null, null, null, null, 30);
            BuildersKt.c(ViewModelKt.a(this), null, null, new BrandedShopViewModel$fetchBrandedShopDetails$1(this, str11, null), 3);
        } else {
            if (!(event instanceof UiEvent.OnHorizontalListActionClick)) {
                throw new NoWhenBranchMatchedException();
            }
            HorizontalListData horizontalListData = ((UiEvent.OnHorizontalListActionClick) event).f6670a;
            String str12 = horizontalListData.d;
            if (str12 == null) {
                str12 = "";
            }
            sharedFlowImpl.f(new Effect.OpenLink(str12));
            BrandedShopAnalytics.BrandedShop brandedShop7 = new BrandedShopAnalytics.BrandedShop(r6());
            String str13 = horizontalListData.c;
            str = str13 != null ? str13 : "";
            final String str14 = horizontalListData.b;
            final BrandedShopAnalytics.BrandedShop.Action action8 = brandedShop7.h;
            action8.getClass();
            analyticsManager.g(new Event(action8, str, str14) { // from class: au.com.woolworths.analytics.supers.brandedshop.BrandedShopAnalytics$BrandedShop$Action$horizontalListActionButtonClick$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(action8.f4030a.g);
                    spreadBuilder.a(new Pair("event.Category", "branded_shop"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    androidx.constraintlayout.core.state.a.z("event.Label", str, spreadBuilder, "event.Description", str14);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "featured_brands_button_click";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event2 = (Event) obj;
                    return "featured_brands_button_click".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
        }
    }

    public final void u6(Map map, BrandedShopData brandedShopData) {
        Intrinsics.h(brandedShopData, "<this>");
        ArrayList arrayList = new ArrayList();
        List list = brandedShopData.c;
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            List list2 = EmptyList.d;
            BrandedShopProductGridConfig brandedShopProductGridConfigA = null;
            if (!zHasNext) {
                boolean zB = this.e.b.b();
                boolean zD = this.j.d();
                Iterator it2 = list.iterator();
                int i2 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    GenericPageFeedItem genericPageFeedItem = (GenericPageFeedItem) next;
                    if (genericPageFeedItem instanceof TabSectionData) {
                        Integer num = (Integer) map.get(new ItemKey.TabHeader(i2).getKey());
                        int iIntValue = num != null ? num.intValue() : 0;
                        List list3 = ((TabSectionData) genericPageFeedItem).b;
                        for (Object obj : !list3.isEmpty() ? ((TabSectionItemData) list3.get(iIntValue)).c : list2) {
                            if (obj instanceof ProductSectionData) {
                                List list4 = ((ProductSectionData) obj).d;
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj2 : list4) {
                                    if (obj2 instanceof ProductCard) {
                                        arrayList2.add(obj2);
                                    }
                                }
                                brandedShopProductGridConfigA = BrandedShopDataHelperKt.a(arrayList2, zB, zD);
                            }
                        }
                        i2 = i3;
                    } else if (genericPageFeedItem instanceof ProductSectionData) {
                        List list5 = ((ProductSectionData) genericPageFeedItem).d;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : list5) {
                            if (obj3 instanceof ProductCard) {
                                arrayList3.add(obj3);
                            }
                        }
                        brandedShopProductGridConfigA = BrandedShopDataHelperKt.a(arrayList3, zB, zD);
                    } else {
                        i2 = i3;
                    }
                }
                v6(this, false, map, brandedShopProductGridConfigA, arrayList, null, 16);
                return;
            }
            Object next2 = it.next();
            int i4 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            GenericPageFeedItem genericPageFeedItem2 = (GenericPageFeedItem) next2;
            if (genericPageFeedItem2 instanceof DownloadableAssetData) {
                arrayList.add(new BrandedShopFeedItem.BrandedShopHeroImage(new ItemKey.HeroImage(i).getKey(), (DownloadableAssetData) genericPageFeedItem2));
            } else if (genericPageFeedItem2 instanceof TitleSectionData) {
                arrayList.add(new BrandedShopFeedItem.BrandedShopTitle(new ItemKey.Title(i).getKey(), (TitleSectionData) genericPageFeedItem2));
            } else if (genericPageFeedItem2 instanceof TabSectionData) {
                List list6 = ((TabSectionData) genericPageFeedItem2).b;
                List list7 = list6;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.s(list7, 10));
                Iterator it3 = list7.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(((TabSectionItemData) it3.next()).b);
                }
                String key = new ItemKey.TabHeader(i).getKey();
                Integer num2 = (Integer) map.get(key);
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                if (!list6.isEmpty()) {
                    list2 = ((TabSectionItemData) list6.get(iIntValue2)).c;
                }
                List list8 = list2;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj4 : list8) {
                    if (obj4 instanceof ProductSectionData) {
                        arrayList5.add(obj4);
                    }
                }
                ProductSectionData productSectionData = (ProductSectionData) CollectionsKt.F(arrayList5);
                arrayList.add(new BrandedShopFeedItem.BrandedShopTabHeader(key, productSectionData != null ? productSectionData.b : null, arrayList4));
                for (Object obj5 : list8) {
                    if (obj5 instanceof ProductSectionData) {
                        BrandedShopDataHelperKt.c(arrayList, i, Integer.valueOf(iIntValue2), (ProductSectionData) obj5);
                    }
                }
            } else {
                if (genericPageFeedItem2 instanceof LinkData) {
                    arrayList.add(new BrandedShopFeedItem.BrandedShopLink(new ItemKey.Link(i, null).getKey(), (LinkData) genericPageFeedItem2, false));
                } else if (genericPageFeedItem2 instanceof ButtonData) {
                    arrayList.add(new BrandedShopFeedItem.BrandedShopButton(new ItemKey.Button(i).getKey(), (ButtonData) genericPageFeedItem2));
                } else if (genericPageFeedItem2 instanceof HorizontalListData) {
                    arrayList.add(new BrandedShopFeedItem.BrandedShopHorizontalList(new ItemKey.HorizontalList(i).getKey(), (HorizontalListData) genericPageFeedItem2));
                } else if (genericPageFeedItem2 instanceof FullWidthImageCardData) {
                    arrayList.add(new BrandedShopFeedItem.BrandedShopFullWidthImageCard(new ItemKey.ImageCard(i).getKey(), (FullWidthImageCardData) genericPageFeedItem2));
                } else if (genericPageFeedItem2 instanceof FullWidthContentCardData) {
                    arrayList.add(new BrandedShopFeedItem.BrandedShopFullWidthContentCard(new ItemKey.ContentCard(i).getKey(), (FullWidthContentCardData) genericPageFeedItem2));
                } else if (genericPageFeedItem2 instanceof ParagraphTextItemData) {
                    arrayList.add(new BrandedShopFeedItem.BrandedShopParagraphText(new ItemKey.ParagraphText(i).getKey(), (ParagraphTextItemData) genericPageFeedItem2));
                } else if (genericPageFeedItem2 instanceof ProductSectionData) {
                    ProductSectionData productSectionData2 = (ProductSectionData) genericPageFeedItem2;
                    String str = productSectionData2.b;
                    if (str != null) {
                        arrayList.add(new BrandedShopFeedItem.BrandedShopProductSectionHeader(new ItemKey.ProductHeader(i).getKey(), str));
                    }
                    BrandedShopDataHelperKt.c(arrayList, i, null, productSectionData2);
                }
                i = i4;
            }
            i = i4;
        }
    }
}
