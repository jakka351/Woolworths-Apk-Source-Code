package au.com.woolworths.shop.specials;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.specials.SpecialsAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.android.onesite.deeplink.f;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.TrolleyResult;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.base.shopapp.TrolleyInteractor;
import au.com.woolworths.feature.shop.catalogue.CatalogueStoreInteractor;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.instore.navigation.map.InstoreNavigationInteractor;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.product.models.PromotionCard;
import au.com.woolworths.product.productbottomsheet.ProductListFeedTrolleyUpdater;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.product.tile.PromotionClickListener;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import au.com.woolworths.shop.aem.components.model.QuickLinkCard;
import au.com.woolworths.shop.aem.components.model.contentcard.ContentCardData;
import au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListItem;
import au.com.woolworths.shop.aem.components.model.offercard.OfferCardData;
import au.com.woolworths.shop.aem.components.model.offercard.OfferCardDataKt;
import au.com.woolworths.shop.lists.data.WatchlistInteractor;
import au.com.woolworths.shop.specials.SpecialsHomeContract;
import au.com.woolworths.shop.specials.model.SpecialsHome;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/specials/SpecialsHomeViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/product/tile/ProductClickListener;", "Lau/com/woolworths/product/tile/PromotionClickListener;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SpecialsHomeViewModel extends ViewModel implements ProductClickListener, PromotionClickListener {
    public final CollectionModeInteractor e;
    public final SpecialsHomeInteractor f;
    public final CatalogueStoreInteractor g;
    public final FeatureToggleManager h;
    public final AnalyticsManager i;
    public final WatchlistInteractor j;
    public final InstoreNavigationInteractor k;
    public final ProductListFeedTrolleyUpdater l;
    public final LinkedHashSet m;
    public final LinkedHashSet n;
    public final MutableStateFlow o;
    public final StateFlow p;
    public final BufferedChannel q;
    public final Flow r;
    public final MutableStateFlow s;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/android/onesite/rxutils/Result;", "Lau/com/woolworths/android/onesite/models/TrolleyResult;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.specials.SpecialsHomeViewModel$2", f = "SpecialsHomeViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.specials.SpecialsHomeViewModel$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<Result<? extends TrolleyResult>, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = SpecialsHomeViewModel.this.new AnonymousClass2(continuation);
            anonymousClass2.p = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((Result) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass2.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SpecialsHome specialsHome;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            TrolleyResult trolleyResult = (TrolleyResult) ((Result) this.p).f4591a;
            SpecialsHomeViewModel specialsHomeViewModel = SpecialsHomeViewModel.this;
            ProductListFeedTrolleyUpdater productListFeedTrolleyUpdater = specialsHomeViewModel.l;
            if (trolleyResult != null && (specialsHome = ((SpecialsHomeContract.ViewState) specialsHomeViewModel.p.getValue()).b) != null) {
                ArrayList arrayList = specialsHome.f12942a;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
                for (Object objCopy$default : arrayList) {
                    if (objCopy$default instanceof HorizontalListData) {
                        HorizontalListData horizontalListData = (HorizontalListData) objCopy$default;
                        if (SpecialsHomeViewModelKt.a(horizontalListData)) {
                            ArrayList arrayListB = CollectionsKt.B(horizontalListData.getH());
                            productListFeedTrolleyUpdater.getClass();
                            objCopy$default = HorizontalListData.copy$default(horizontalListData, null, null, null, null, null, ProductListFeedTrolleyUpdater.b(arrayListB, trolleyResult), null, null, null, null, 991, null);
                        } else if (SpecialsHomeViewModelKt.b(horizontalListData)) {
                            List<Object> d = horizontalListData.getH();
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj2 : d) {
                                if (obj2 instanceof PromotionCard) {
                                    arrayList3.add(obj2);
                                }
                            }
                            ArrayList arrayList4 = new ArrayList(CollectionsKt.s(arrayList3, 10));
                            Iterator it = arrayList3.iterator();
                            while (it.hasNext()) {
                                arrayList4.add(((PromotionCard) it.next()).getProductCard());
                            }
                            productListFeedTrolleyUpdater.getClass();
                            ArrayList arrayListB2 = ProductListFeedTrolleyUpdater.b(arrayList4, trolleyResult);
                            ArrayList arrayList5 = new ArrayList();
                            Iterator it2 = arrayListB2.iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                if (next instanceof ProductCard) {
                                    arrayList5.add(next);
                                }
                            }
                            ArrayList arrayList6 = new ArrayList(CollectionsKt.s(arrayList3, 10));
                            Iterator it3 = arrayList3.iterator();
                            int i = 0;
                            while (it3.hasNext()) {
                                Object next2 = it3.next();
                                int i2 = i + 1;
                                if (i < 0) {
                                    CollectionsKt.z0();
                                    throw null;
                                }
                                arrayList6.add(PromotionCard.copy$default((PromotionCard) next2, (ProductCard) arrayList5.get(i), null, null, null, null, 30, null));
                                i = i2;
                            }
                            objCopy$default = HorizontalListData.copy$default(horizontalListData, null, null, null, null, null, arrayList6, null, null, null, null, 991, null);
                        } else {
                            objCopy$default = horizontalListData;
                        }
                    }
                    arrayList2.add(objCopy$default);
                }
                specialsHomeViewModel.o.f(new SpecialsHomeContract.ViewState(new SpecialsHome(arrayList2), 61));
            }
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Triple;", "Lau/com/woolworths/android/onesite/modules/collectionmode/common/CollectionMode;", "", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.specials.SpecialsHomeViewModel$3", f = "SpecialsHomeViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.specials.SpecialsHomeViewModel$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function2<Triple<? extends CollectionMode, ? extends String, ? extends Integer>, Continuation<? super Unit>, Object> {
        public AnonymousClass3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return SpecialsHomeViewModel.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass3 anonymousClass3 = (AnonymousClass3) create((Triple) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass3.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            SpecialsHomeViewModel.this.q6(null);
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "it", "", "Lau/com/woolworths/product/models/ProductId;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.specials.SpecialsHomeViewModel$4", f = "SpecialsHomeViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.specials.SpecialsHomeViewModel$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements Function2<List<? extends ProductId>, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;

        public AnonymousClass4(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass4 anonymousClass4 = SpecialsHomeViewModel.this.new AnonymousClass4(continuation);
            anonymousClass4.p = obj;
            return anonymousClass4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass4 anonymousClass4 = (AnonymousClass4) create((List) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass4.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            List list = (List) this.p;
            MutableStateFlow mutableStateFlow = SpecialsHomeViewModel.this.o;
            mutableStateFlow.f(SpecialsHomeContract.ViewState.a((SpecialsHomeContract.ViewState) mutableStateFlow.getValue(), false, null, null, list, null, false, 55));
            return Unit.f24250a;
        }
    }

    public SpecialsHomeViewModel(TrolleyInteractor trolleyInteractor, CollectionModeInteractor collectionModeInteractor, SpecialsHomeInteractor specialsHomeInteractor, CatalogueStoreInteractor catalogueStoreInteractor, FeatureToggleManager featureToggleManager, AnalyticsManager analyticsManager, WatchlistInteractor watchlistInteractor, InstoreNavigationInteractor instoreNavigationInteractor) {
        Intrinsics.h(trolleyInteractor, "trolleyInteractor");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(watchlistInteractor, "watchlistInteractor");
        Intrinsics.h(instoreNavigationInteractor, "instoreNavigationInteractor");
        this.e = collectionModeInteractor;
        this.f = specialsHomeInteractor;
        this.g = catalogueStoreInteractor;
        this.h = featureToggleManager;
        this.i = analyticsManager;
        this.j = watchlistInteractor;
        this.k = instoreNavigationInteractor;
        this.l = new ProductListFeedTrolleyUpdater();
        this.m = new LinkedHashSet();
        this.n = new LinkedHashSet();
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new SpecialsHomeContract.ViewState(null, 63));
        this.o = mutableStateFlowA;
        this.p = FlowKt.b(mutableStateFlowA);
        BufferedChannel bufferedChannelA = ChannelKt.a(0, 7, null);
        this.q = bufferedChannelA;
        this.r = FlowKt.I(bufferedChannelA);
        MutableStateFlow mutableStateFlowA2 = StateFlowKt.a(new Triple(collectionModeInteractor.w(), collectionModeInteractor.y(), collectionModeInteractor.J()));
        this.s = mutableStateFlowA2;
        final StateFlow stateFlowV = trolleyInteractor.getP();
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass2(null), new Flow<Result<? extends TrolleyResult>>() { // from class: au.com.woolworths.shop.specials.SpecialsHomeViewModel$special$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: au.com.woolworths.shop.specials.SpecialsHomeViewModel$special$$inlined$filter$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "au.com.woolworths.shop.specials.SpecialsHomeViewModel$special$$inlined$filter$1$2", f = "SpecialsHomeViewModel.kt", l = {50}, m = "emit")
                /* renamed from: au.com.woolworths.shop.specials.SpecialsHomeViewModel$special$$inlined$filter$1$2$1, reason: invalid class name */
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
                        boolean r0 = r6 instanceof au.com.woolworths.shop.specials.SpecialsHomeViewModel$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        au.com.woolworths.shop.specials.SpecialsHomeViewModel$special$$inlined$filter$1$2$1 r0 = (au.com.woolworths.shop.specials.SpecialsHomeViewModel$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.q = r1
                        goto L18
                    L13:
                        au.com.woolworths.shop.specials.SpecialsHomeViewModel$special$$inlined$filter$1$2$1 r0 = new au.com.woolworths.shop.specials.SpecialsHomeViewModel$special$$inlined$filter$1$2$1
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
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.specials.SpecialsHomeViewModel$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = stateFlowV.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        }), ViewModelKt.a(this));
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass3(null), FlowKt.s(mutableStateFlowA2, 1)), ViewModelKt.a(this));
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass4(null), watchlistInteractor.e), ViewModelKt.a(this));
    }

    public static final void p6(SpecialsHomeViewModel specialsHomeViewModel, SpecialsHome specialsHome, Intent intent) {
        String string;
        String strB;
        Bundle extras;
        Object obj = null;
        if (intent == null || (extras = intent.getExtras()) == null) {
            string = null;
        } else {
            Bundle extras2 = intent.getExtras();
            string = extras.getString("ShopAppDeepLink.Extras.specialTitle", extras2 != null ? extras2.getString("specialTitle") : null);
        }
        if (intent != null) {
            intent.removeExtra("ShopAppDeepLink.Extras.specialTitle");
        }
        if (intent != null) {
            intent.removeExtra("specialTitle");
        }
        if (string != null) {
            String strD = androidx.camera.core.impl.b.D("[^a-zA-Z]", string, "");
            ArrayList arrayList = specialsHome.f12942a;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (obj2 instanceof HorizontalListData) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                List<Object> d = ((HorizontalListData) it.next()).getH();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : d) {
                    if (obj3 instanceof QuickLinkCard) {
                        arrayList4.add(obj3);
                    }
                }
                CollectionsKt.h(arrayList4, arrayList3);
            }
            Iterator it2 = arrayList3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (strD.equalsIgnoreCase(new Regex("[^a-zA-Z]").g(((QuickLinkCard) next).getTitle(), ""))) {
                    obj = next;
                    break;
                }
            }
            QuickLinkCard quickLinkCard = (QuickLinkCard) obj;
            if (quickLinkCard == null || (strB = OfferCardDataKt.b(quickLinkCard.getAction())) == null) {
                return;
            }
            specialsHomeViewModel.q.k(new SpecialsHomeContract.Action.LaunchDeepLink(strB));
        }
    }

    public static /* synthetic */ void u6(SpecialsHomeViewModel specialsHomeViewModel, ResText resText, Function1 function1) {
        specialsHomeViewModel.t6(resText, null, new h(20), function1);
    }

    @Override // au.com.woolworths.product.tile.PromotionClickListener
    public final void C1(PromotionCard promotionCard, final String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        SpecialsAnalytics.Home.Action.Companion companion = SpecialsAnalytics.Home.Action.d;
        final String offerId = promotionCard.getOfferId();
        if (offerId == null) {
            offerId = "";
        }
        companion.getClass();
        this.i.i(new Event(containerTitle, offerId) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsAnalytics$Home$Action$Companion$promotionAddToCart$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                spreadBuilder.b(SpecialsAnalytics.Home.f);
                spreadBuilder.a(new Pair("screen.Type", "productcategory"));
                spreadBuilder.a(new Pair("event.Category", "cart"));
                spreadBuilder.a(new Pair("event.Action", "button_click"));
                spreadBuilder.a(new Pair("event.Label", "Add"));
                a.y("event.Description", a.l(new StringBuilder(), containerTitle, " - ", offerId, " - price_family_variants"), spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "addtocart_click";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "addtocart_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        }, ProductAnalyticsExtKt.h(promotionCard.getProductCard(), null, null, 7));
        this.q.k(new SpecialsHomeContract.Action.LaunchCartBottomSheet(promotionCard.getProductCard()));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void D4(ProductCard productCardTileData, final String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardTileData, "productCardTileData");
        SpecialsAnalytics.Home.Action.d.getClass();
        this.i.i(new Event(containerTitle) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsAnalytics$Home$Action$Companion$updateCart$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                spreadBuilder.b(SpecialsAnalytics.Home.f);
                spreadBuilder.a(new Pair("event.Category", "cart"));
                spreadBuilder.a(new Pair("event.Action", "button_click"));
                a.y("event.Description", androidx.compose.ui.input.pointer.a.m("event.Label", "update", spreadBuilder, containerTitle), spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "addtocart_click";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "addtocart_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        }, ProductAnalyticsExtKt.h(productCardTileData, null, null, 7));
        this.q.k(new SpecialsHomeContract.Action.LaunchCartBottomSheet(productCardTileData));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void J1(ProductCard productCardData, final String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardData, "productCardData");
        SpecialsAnalytics.Home.Action.d.getClass();
        this.i.i(new Event(containerTitle) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsAnalytics$Home$Action$Companion$productClick$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                spreadBuilder.b(SpecialsAnalytics.Home.f);
                spreadBuilder.a(new Pair("event.Category", "specials-hub-body"));
                spreadBuilder.a(new Pair("event.Action", "product_click"));
                a.y("event.Description", androidx.compose.ui.input.pointer.a.m("event.Label", "Product", spreadBuilder, containerTitle), spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "specialshub_productclick";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "specialshub_productclick".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        }, ProductAnalyticsExtKt.h(productCardData, null, null, 7));
        this.q.k(new SpecialsHomeContract.Action.LaunchProductDetails(productCardData));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void L0(ProductCard productCardTileData, final String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardTileData, "productCardTileData");
        SpecialsAnalytics.Home.Action.d.getClass();
        this.i.i(new Event(containerTitle) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsAnalytics$Home$Action$Companion$addToList$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                spreadBuilder.b(SpecialsAnalytics.Home.f);
                spreadBuilder.a(new Pair("event.Category", "specials-hub-body"));
                spreadBuilder.a(new Pair("event.Action", "product_click"));
                a.y("event.Description", androidx.compose.ui.input.pointer.a.m("event.Label", "Add To List", spreadBuilder, containerTitle), spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "specialshub_productclick";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "specialshub_productclick".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        }, ProductAnalyticsExtKt.h(productCardTileData, null, null, 7));
        this.q.k(new SpecialsHomeContract.Action.LaunchAddToListBottomSheet(productCardTileData));
    }

    @Override // au.com.woolworths.product.tile.PromotionClickListener
    public final void Q4(PromotionCard promotionCard, final String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        SpecialsAnalytics.Home.Action.Companion companion = SpecialsAnalytics.Home.Action.d;
        final String offerId = promotionCard.getOfferId();
        if (offerId == null) {
            offerId = "";
        }
        companion.getClass();
        this.i.i(new Event(containerTitle, offerId) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsAnalytics$Home$Action$Companion$promotionClick$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                spreadBuilder.b(SpecialsAnalytics.Home.f);
                spreadBuilder.a(new Pair("screen.Type", "productcategory"));
                spreadBuilder.a(new Pair("event.Category", "universal_product_list_price_family_variants"));
                spreadBuilder.a(new Pair("event.Action", "button_click"));
                a.z("event.Label", containerTitle + " - view varieties", spreadBuilder, "event.Description", offerId);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "universalproductlist_buttonclick";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "universalproductlist_buttonclick".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        }, ProductAnalyticsExtKt.h(promotionCard.getProductCard(), null, null, 7));
        this.q.k(new SpecialsHomeContract.Action.LaunchProductDetails(promotionCard.getProductCard()));
    }

    @Override // au.com.woolworths.product.tile.PromotionClickListener
    public final void S3(PromotionCard promotionCard, final String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        SpecialsAnalytics.Home.Action.Companion companion = SpecialsAnalytics.Home.Action.d;
        final String offerId = promotionCard.getOfferId();
        if (offerId == null) {
            offerId = "";
        }
        companion.getClass();
        this.i.i(new Event(containerTitle, offerId) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsAnalytics$Home$Action$Companion$promotionAddToList$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                spreadBuilder.b(SpecialsAnalytics.Home.f);
                spreadBuilder.a(new Pair("screen.Type", "productcategory"));
                spreadBuilder.a(new Pair("event.Category", "price_family_variants"));
                spreadBuilder.a(new Pair("event.Action", "button_click"));
                spreadBuilder.a(new Pair("event.Label", "Add To List"));
                a.y("event.Description", a.l(new StringBuilder(), containerTitle, " - ", offerId, " - price_family_variants"), spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "price_family_variants_savetolist_click";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "price_family_variants_savetolist_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        }, ProductAnalyticsExtKt.h(promotionCard.getProductCard(), null, null, 7));
        this.q.k(new SpecialsHomeContract.Action.LaunchAddToListBottomSheet(promotionCard.getProductCard()));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void T0(ProductCard productCardData) {
        Intrinsics.h(productCardData, "productCardData");
        this.q.k(new SpecialsHomeContract.Action.LaunchProductOnMap(productCardData));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void T4(ProductCard productCardTileData, final String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardTileData, "productCardTileData");
        SpecialsAnalytics.Home.Action.d.getClass();
        this.i.i(new Event(containerTitle) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsAnalytics$Home$Action$Companion$addToCart$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                spreadBuilder.b(SpecialsAnalytics.Home.f);
                spreadBuilder.a(new Pair("event.Category", "cart"));
                spreadBuilder.a(new Pair("event.Action", "button_click"));
                a.y("event.Description", androidx.compose.ui.input.pointer.a.m("event.Label", "add", spreadBuilder, containerTitle), spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "addtocart_click";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "addtocart_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        }, ProductAnalyticsExtKt.h(productCardTileData, null, null, 7));
        this.q.k(new SpecialsHomeContract.Action.LaunchCartBottomSheet(productCardTileData));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void g6(final ProductCard productCard, final String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCard, "productCard");
        WatchlistInteractor watchlistInteractor = this.j;
        if (watchlistInteractor.c()) {
            this.q.k(SpecialsHomeContract.Action.LaunchWatchlistGuestOnboardingScreen.f12934a);
            return;
        }
        String strB = watchlistInteractor.b();
        if (strB == null) {
            return;
        }
        boolean zT = ProductCardExtKt.t(productCard, ((SpecialsHomeContract.ViewState) this.p.getValue()).d);
        AnalyticsManager analyticsManager = this.i;
        if (zT) {
            watchlistInteractor.d(productCard);
            SpecialsAnalytics.Home.Action.d.getClass();
            analyticsManager.i(new Event(containerTitle) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsAnalytics$Home$Action$Companion$removeFromWatchlist$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(SpecialsAnalytics.Home.f);
                    spreadBuilder.a(new Pair("event.Category", "watchlist"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    a.y("event.Description", androidx.compose.ui.input.pointer.a.m("event.Label", "unsave from watchlist", spreadBuilder, containerTitle), spreadBuilder);
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
            u6(this, new ResText(com.woolworths.R.string.watchlist_product_removed_snackbar_message), new Function1(this) { // from class: au.com.woolworths.shop.specials.a
                public final /* synthetic */ SpecialsHomeViewModel e;

                {
                    this.e = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String message = (String) obj;
                    switch (i) {
                        case 0:
                            Intrinsics.h(message, "message");
                            AnalyticsManager analyticsManager2 = this.e.i;
                            SpecialsAnalytics.Home.Action.d.getClass();
                            String description = containerTitle;
                            Intrinsics.h(description, "description");
                            analyticsManager2.i(new Event(message, description) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsAnalytics$Home$Action$Companion$watchlistSnackbarImpression$1
                                public final Object d;

                                {
                                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                    spreadBuilder.b(SpecialsAnalytics.Home.f);
                                    a.z("event.Category", "watchlist", spreadBuilder, "event.Action", "snackbar_impression");
                                    a.y("event.Description", androidx.compose.ui.input.pointer.a.m("event.Label", String.valueOf(message), spreadBuilder, description), spreadBuilder);
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
                            AnalyticsManager analyticsManager3 = this.e.i;
                            SpecialsAnalytics.Home.Action.d.getClass();
                            String description2 = containerTitle;
                            Intrinsics.h(description2, "description");
                            analyticsManager3.i(new Event(message, description2) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsAnalytics$Home$Action$Companion$watchlistSnackbarImpression$1
                                public final Object d;

                                {
                                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                    spreadBuilder.b(SpecialsAnalytics.Home.f);
                                    a.z("event.Category", "watchlist", spreadBuilder, "event.Action", "snackbar_impression");
                                    a.y("event.Description", androidx.compose.ui.input.pointer.a.m("event.Label", String.valueOf(message), spreadBuilder, description2), spreadBuilder);
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
        SpecialsAnalytics.Home.Action.d.getClass();
        analyticsManager.i(new Event(containerTitle) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsAnalytics$Home$Action$Companion$addToWatchlist$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                spreadBuilder.b(SpecialsAnalytics.Home.f);
                spreadBuilder.a(new Pair("event.Category", "watchlist"));
                spreadBuilder.a(new Pair("event.Action", "button_click"));
                a.y("event.Description", androidx.compose.ui.input.pointer.a.m("event.Label", "save to watchlist", spreadBuilder, containerTitle), spreadBuilder);
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
        androidx.work.impl.utils.b bVar = new androidx.work.impl.utils.b(this, containerTitle, productCard, strB, 14);
        final int i2 = 1;
        t6(resText, resText2, bVar, new Function1(this) { // from class: au.com.woolworths.shop.specials.a
            public final /* synthetic */ SpecialsHomeViewModel e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String message = (String) obj;
                switch (i2) {
                    case 0:
                        Intrinsics.h(message, "message");
                        AnalyticsManager analyticsManager2 = this.e.i;
                        SpecialsAnalytics.Home.Action.d.getClass();
                        String description = containerTitle;
                        Intrinsics.h(description, "description");
                        analyticsManager2.i(new Event(message, description) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsAnalytics$Home$Action$Companion$watchlistSnackbarImpression$1
                            public final Object d;

                            {
                                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                spreadBuilder.b(SpecialsAnalytics.Home.f);
                                a.z("event.Category", "watchlist", spreadBuilder, "event.Action", "snackbar_impression");
                                a.y("event.Description", androidx.compose.ui.input.pointer.a.m("event.Label", String.valueOf(message), spreadBuilder, description), spreadBuilder);
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
                        AnalyticsManager analyticsManager3 = this.e.i;
                        SpecialsAnalytics.Home.Action.d.getClass();
                        String description2 = containerTitle;
                        Intrinsics.h(description2, "description");
                        analyticsManager3.i(new Event(message, description2) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsAnalytics$Home$Action$Companion$watchlistSnackbarImpression$1
                            public final Object d;

                            {
                                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                spreadBuilder.b(SpecialsAnalytics.Home.f);
                                a.z("event.Category", "watchlist", spreadBuilder, "event.Action", "snackbar_impression");
                                a.y("event.Description", androidx.compose.ui.input.pointer.a.m("event.Label", String.valueOf(message), spreadBuilder, description2), spreadBuilder);
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
        this.m.clear();
    }

    public final void q6(Intent intent) {
        this.m.clear();
        MutableStateFlow mutableStateFlow = this.o;
        mutableStateFlow.f(SpecialsHomeContract.ViewState.a((SpecialsHomeContract.ViewState) mutableStateFlow.getValue(), true, null, null, null, null, false, 56));
        BuildersKt.c(ViewModelKt.a(this), null, null, new SpecialsHomeViewModel$fetch$1(this, intent, null), 3);
    }

    @Override // au.com.woolworths.product.tile.PromotionClickListener
    public final void r2(final PromotionCard promotionCard, final String containerTitle) {
        final String str;
        Intrinsics.h(containerTitle, "containerTitle");
        WatchlistInteractor watchlistInteractor = this.j;
        if (watchlistInteractor.c()) {
            this.q.k(SpecialsHomeContract.Action.LaunchWatchlistGuestOnboardingScreen.f12934a);
            return;
        }
        final ProductCard productCard = promotionCard.getProductCard();
        String strB = watchlistInteractor.b();
        if (strB == null) {
            return;
        }
        boolean zT = ProductCardExtKt.t(productCard, ((SpecialsHomeContract.ViewState) this.p.getValue()).d);
        AnalyticsManager analyticsManager = this.i;
        if (zT) {
            watchlistInteractor.d(productCard);
            SpecialsAnalytics.Home.Action.Companion companion = SpecialsAnalytics.Home.Action.d;
            String offerId = promotionCard.getOfferId();
            str = offerId != null ? offerId : "";
            companion.getClass();
            analyticsManager.i(new Event(containerTitle, str) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsAnalytics$Home$Action$Companion$promotionRemoveFromWatchlist$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                    spreadBuilder.b(SpecialsAnalytics.Home.f);
                    spreadBuilder.a(new Pair("screen.Type", "productcategory"));
                    spreadBuilder.a(new Pair("event.Category", "watchlist"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    spreadBuilder.a(new Pair("event.Label", "unsave from watchlist"));
                    a.y("event.Description", a.l(new StringBuilder(), containerTitle, " - ", str, " - price_family_variants"), spreadBuilder);
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
            u6(this, new ResText(com.woolworths.R.string.watchlist_product_removed_snackbar_message), new Function1(this) { // from class: au.com.woolworths.shop.specials.b
                public final /* synthetic */ SpecialsHomeViewModel e;

                {
                    this.e = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String message = (String) obj;
                    switch (i) {
                        case 0:
                            Intrinsics.h(message, "message");
                            AnalyticsManager analyticsManager2 = this.e.i;
                            SpecialsAnalytics.Home.Action.Companion companion2 = SpecialsAnalytics.Home.Action.d;
                            String offerId2 = promotionCard.getOfferId();
                            if (offerId2 == null) {
                                offerId2 = "";
                            }
                            companion2.getClass();
                            String section = containerTitle;
                            Intrinsics.h(section, "section");
                            analyticsManager2.i(new Event(message, section, offerId2) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsAnalytics$Home$Action$Companion$promotionWatchlistSnackbarImpression$1
                                public final Object d;

                                {
                                    SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                                    spreadBuilder.b(SpecialsAnalytics.Home.f);
                                    spreadBuilder.a(new Pair("screen.Type", "productcategory"));
                                    spreadBuilder.a(new Pair("event.Category", "watchlist"));
                                    spreadBuilder.a(new Pair("event.Label", androidx.compose.ui.input.pointer.a.m("event.Action", "snackbar_impression", spreadBuilder, message)));
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(section);
                                    sb.append(" - ");
                                    a.y("event.Description", YU.a.o(sb, offerId2, " - price_family_variants"), spreadBuilder);
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
                            AnalyticsManager analyticsManager3 = this.e.i;
                            SpecialsAnalytics.Home.Action.Companion companion3 = SpecialsAnalytics.Home.Action.d;
                            String offerId3 = promotionCard.getOfferId();
                            if (offerId3 == null) {
                                offerId3 = "";
                            }
                            companion3.getClass();
                            String section2 = containerTitle;
                            Intrinsics.h(section2, "section");
                            analyticsManager3.i(new Event(message, section2, offerId3) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsAnalytics$Home$Action$Companion$promotionWatchlistSnackbarImpression$1
                                public final Object d;

                                {
                                    SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                                    spreadBuilder.b(SpecialsAnalytics.Home.f);
                                    spreadBuilder.a(new Pair("screen.Type", "productcategory"));
                                    spreadBuilder.a(new Pair("event.Category", "watchlist"));
                                    spreadBuilder.a(new Pair("event.Label", androidx.compose.ui.input.pointer.a.m("event.Action", "snackbar_impression", spreadBuilder, message)));
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(section2);
                                    sb.append(" - ");
                                    a.y("event.Description", YU.a.o(sb, offerId3, " - price_family_variants"), spreadBuilder);
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
        SpecialsAnalytics.Home.Action.Companion companion2 = SpecialsAnalytics.Home.Action.d;
        String offerId2 = promotionCard.getOfferId();
        str = offerId2 != null ? offerId2 : "";
        companion2.getClass();
        analyticsManager.i(new Event(containerTitle, str) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsAnalytics$Home$Action$Companion$promotionAddToWatchlist$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                spreadBuilder.b(SpecialsAnalytics.Home.f);
                spreadBuilder.a(new Pair("screen.Type", "productcategory"));
                spreadBuilder.a(new Pair("event.Category", "watchlist"));
                spreadBuilder.a(new Pair("event.Action", "button_click"));
                spreadBuilder.a(new Pair("event.Label", "save to watchlist"));
                a.y("event.Description", a.l(new StringBuilder(), containerTitle, " - ", str, " - price_family_variants"), spreadBuilder);
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
        f fVar = new f(this, containerTitle, promotionCard, productCard, strB);
        final int i2 = 1;
        t6(resText, resText2, fVar, new Function1(this) { // from class: au.com.woolworths.shop.specials.b
            public final /* synthetic */ SpecialsHomeViewModel e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String message = (String) obj;
                switch (i2) {
                    case 0:
                        Intrinsics.h(message, "message");
                        AnalyticsManager analyticsManager2 = this.e.i;
                        SpecialsAnalytics.Home.Action.Companion companion22 = SpecialsAnalytics.Home.Action.d;
                        String offerId22 = promotionCard.getOfferId();
                        if (offerId22 == null) {
                            offerId22 = "";
                        }
                        companion22.getClass();
                        String section = containerTitle;
                        Intrinsics.h(section, "section");
                        analyticsManager2.i(new Event(message, section, offerId22) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsAnalytics$Home$Action$Companion$promotionWatchlistSnackbarImpression$1
                            public final Object d;

                            {
                                SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                                spreadBuilder.b(SpecialsAnalytics.Home.f);
                                spreadBuilder.a(new Pair("screen.Type", "productcategory"));
                                spreadBuilder.a(new Pair("event.Category", "watchlist"));
                                spreadBuilder.a(new Pair("event.Label", androidx.compose.ui.input.pointer.a.m("event.Action", "snackbar_impression", spreadBuilder, message)));
                                StringBuilder sb = new StringBuilder();
                                sb.append(section);
                                sb.append(" - ");
                                a.y("event.Description", YU.a.o(sb, offerId22, " - price_family_variants"), spreadBuilder);
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
                        AnalyticsManager analyticsManager3 = this.e.i;
                        SpecialsAnalytics.Home.Action.Companion companion3 = SpecialsAnalytics.Home.Action.d;
                        String offerId3 = promotionCard.getOfferId();
                        if (offerId3 == null) {
                            offerId3 = "";
                        }
                        companion3.getClass();
                        String section2 = containerTitle;
                        Intrinsics.h(section2, "section");
                        analyticsManager3.i(new Event(message, section2, offerId3) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsAnalytics$Home$Action$Companion$promotionWatchlistSnackbarImpression$1
                            public final Object d;

                            {
                                SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                                spreadBuilder.b(SpecialsAnalytics.Home.f);
                                spreadBuilder.a(new Pair("screen.Type", "productcategory"));
                                spreadBuilder.a(new Pair("event.Category", "watchlist"));
                                spreadBuilder.a(new Pair("event.Label", androidx.compose.ui.input.pointer.a.m("event.Action", "snackbar_impression", spreadBuilder, message)));
                                StringBuilder sb = new StringBuilder();
                                sb.append(section2);
                                sb.append(" - ");
                                a.y("event.Description", YU.a.o(sb, offerId3, " - price_family_variants"), spreadBuilder);
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

    public final void r6(SpecialsHomePageErrorState specialsHomePageErrorState) {
        MutableStateFlow mutableStateFlow = this.o;
        mutableStateFlow.f(SpecialsHomeContract.ViewState.a((SpecialsHomeContract.ViewState) mutableStateFlow.getValue(), false, null, specialsHomePageErrorState, null, null, false, 56));
    }

    public final void s6(HorizontalListData horizontalListData, HorizontalListItem horizontalListItem) {
        ContentCardData contentCardData;
        ActionData actionData;
        String strB;
        final String str;
        String strB2;
        boolean z = horizontalListItem instanceof QuickLinkCard;
        BufferedChannel bufferedChannel = this.q;
        AnalyticsManager analyticsManager = this.i;
        if (z) {
            SpecialsAnalytics.Home.Action.Companion companion = SpecialsAnalytics.Home.Action.d;
            QuickLinkCard quickLinkCard = (QuickLinkCard) horizontalListItem;
            final String title = quickLinkCard.getTitle();
            final String title2 = horizontalListData.getD();
            companion.getClass();
            Intrinsics.h(title, "title");
            analyticsManager.g(new Event(title, title2) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsAnalytics$Home$Action$Companion$quickLinkClick$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(SpecialsAnalytics.Home.f);
                    spreadBuilder.a(new Pair("event.Category", "specials-hub-body"));
                    spreadBuilder.a(new Pair("event.Action", "link_click"));
                    a.y("event.Label", title, spreadBuilder);
                    spreadBuilder.a(new Pair("event.Description", title2 == null ? "" : title2));
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "specialshub_linkclick";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj;
                    return "specialshub_linkclick".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
            String strB3 = OfferCardDataKt.b(quickLinkCard.getAction());
            if (strB3 != null) {
                bufferedChannel.k(new SpecialsHomeContract.Action.LaunchDeepLink(strB3));
                return;
            }
            return;
        }
        if (!(horizontalListItem instanceof OfferCardData)) {
            if (!(horizontalListItem instanceof ContentCardData) || (actionData = (contentCardData = (ContentCardData) horizontalListItem).h) == null || (strB = OfferCardDataKt.b(actionData)) == null) {
                return;
            }
            SpecialsAnalytics.Home.Action.Companion companion2 = SpecialsAnalytics.Home.Action.d;
            final String str2 = contentCardData.f;
            if (str2 == null) {
                str2 = "";
            }
            final String title3 = horizontalListData.getD();
            if (title3 == null) {
                title3 = "";
            }
            String str3 = contentCardData.d;
            str = str3 != null ? str3 : "";
            companion2.getClass();
            analyticsManager.g(new Event(str2, title3, str) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsAnalytics$Home$Action$Companion$contentCardClick$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                    spreadBuilder.b(SpecialsAnalytics.Home.f);
                    spreadBuilder.a(new Pair("event.Category", "Content Card"));
                    spreadBuilder.a(new Pair("event.Action", "banner_click"));
                    spreadBuilder.a(new Pair("event.Label", str2));
                    spreadBuilder.a(new Pair("event.Description", title3));
                    a.y("internal.Campaign", str, spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "contentcard_banner_click";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj;
                    return "contentcard_banner_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
            bufferedChannel.k(new SpecialsHomeContract.Action.LaunchDeepLink(strB));
            return;
        }
        OfferCardData offerCardData = (OfferCardData) horizontalListItem;
        ActionData actionDataA = offerCardData.getOfferCardAction();
        if (actionDataA == null || (strB2 = OfferCardDataKt.b(actionDataA)) == null) {
            return;
        }
        ImageWithAltText imageWithAltText = offerCardData.h;
        String str4 = imageWithAltText != null ? imageWithAltText.b : null;
        if (str4 == null) {
            str4 = "";
        }
        String strO = androidx.camera.core.impl.b.o(str4, " ", offerCardData.e);
        SpecialsAnalytics.Home.Action.Companion companion3 = SpecialsAnalytics.Home.Action.d;
        final String title4 = StringsKt.k0(strO).toString();
        String title5 = horizontalListData.getD();
        str = title5 != null ? title5 : "";
        companion3.getClass();
        Intrinsics.h(title4, "title");
        analyticsManager.g(new Event(title4, str) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsAnalytics$Home$Action$Companion$offerClick$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                spreadBuilder.b(SpecialsAnalytics.Home.f);
                spreadBuilder.a(new Pair("event.Category", "offers"));
                spreadBuilder.a(new Pair("event.Action", "button_click"));
                a.z("event.Label", title4, spreadBuilder, "event.Description", str);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "offers_button_click";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "offers_button_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
        bufferedChannel.k(new SpecialsHomeContract.Action.LaunchDeepLink(strB2));
    }

    public final void t6(ResText resText, ResText resText2, Function0 function0, Function1 function1) {
        MutableStateFlow mutableStateFlow = this.o;
        mutableStateFlow.f(SpecialsHomeContract.ViewState.a((SpecialsHomeContract.ViewState) mutableStateFlow.getValue(), false, null, null, null, new SpecialsHomeContract.Snackbar(resText, resText2, function0, function1), false, 47));
    }

    @Override // au.com.woolworths.product.tile.PromotionClickListener
    public final void v2(PromotionCard promotionCard, final String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        SpecialsAnalytics.Home.Action.Companion companion = SpecialsAnalytics.Home.Action.d;
        final String offerId = promotionCard.getOfferId();
        if (offerId == null) {
            offerId = "";
        }
        companion.getClass();
        this.i.i(new Event(containerTitle, offerId) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsAnalytics$Home$Action$Companion$promotionUpdateCart$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                spreadBuilder.b(SpecialsAnalytics.Home.f);
                spreadBuilder.a(new Pair("screen.Type", "productcategory"));
                spreadBuilder.a(new Pair("event.Category", "cart"));
                spreadBuilder.a(new Pair("event.Action", "button_click"));
                spreadBuilder.a(new Pair("event.Label", "Update"));
                a.y("event.Description", a.l(new StringBuilder(), containerTitle, " - ", offerId, " - price_family_variants"), spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "addtocart_click";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "addtocart_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        }, ProductAnalyticsExtKt.h(promotionCard.getProductCard(), null, null, 7));
        this.q.k(new SpecialsHomeContract.Action.LaunchCartBottomSheet(promotionCard.getProductCard()));
    }

    @Override // au.com.woolworths.product.tile.PromotionClickListener
    public final void x3(PromotionCard promotionCard, final String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        SpecialsAnalytics.Home.Action.Companion companion = SpecialsAnalytics.Home.Action.d;
        final String offerId = promotionCard.getOfferId();
        if (offerId == null) {
            offerId = "";
        }
        companion.getClass();
        this.i.i(new Event(containerTitle, offerId) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsAnalytics$Home$Action$Companion$promotionViewVarieties$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                spreadBuilder.b(SpecialsAnalytics.Home.f);
                spreadBuilder.a(new Pair("screen.Type", "productcategory"));
                spreadBuilder.a(new Pair("event.Category", "universal_product_list_price_family_variants"));
                spreadBuilder.a(new Pair("event.Action", "button_click"));
                a.z("event.Label", containerTitle + " - view varieties", spreadBuilder, "event.Description", offerId);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "universalproductlist_buttonclick";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "universalproductlist_buttonclick".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        }, ProductAnalyticsExtKt.h(promotionCard.getProductCard(), null, null, 7));
        this.q.k(new SpecialsHomeContract.Action.LaunchPromotionDetails(promotionCard, containerTitle));
    }
}
