package au.com.woolworths.feature.shop.contentpage;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import androidx.activity.result.ActivityResult;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.supers.dynamicpage.ContentPageAnalytics;
import au.com.woolworths.analytics.supers.dynamicpage.ContentPageAnalytics$ContentPage$Action$addToWatchlist$1;
import au.com.woolworths.analytics.supers.dynamicpage.ContentPageAnalytics$ContentPage$Action$removeFromWatchlist$1;
import au.com.woolworths.analytics.supers.products.ProductCardAnalytics;
import au.com.woolworths.analytics.supers.products.ProductCardAnalytics$Carousel$Action$Companion$addToCartClick$1;
import au.com.woolworths.analytics.supers.products.ProductCardAnalytics$Carousel$Action$Companion$addToListClick$1;
import au.com.woolworths.analytics.supers.products.ProductCardAnalytics$Carousel$Action$Companion$cardTap$1;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.models.TrolleyResult;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.repository.ReleaseSettingsInteractorImpl;
import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.base.shopapp.TrolleyInteractor;
import au.com.woolworths.feature.shop.banners.broadcastbanner.BannerDismissInteractor;
import au.com.woolworths.feature.shop.banners.broadcastbanner.analytics.AnalyticsExtensionsKt;
import au.com.woolworths.feature.shop.catalogue.CatalogueStoreInteractor;
import au.com.woolworths.feature.shop.contentpage.ContentPageContract;
import au.com.woolworths.feature.shop.contentpage.analytics.ContentPageActions;
import au.com.woolworths.feature.shop.contentpage.data.ContentPageData;
import au.com.woolworths.feature.shop.contentpage.data.ContentPageHeaderData;
import au.com.woolworths.feature.shop.contentpage.data.DataHelperKt$getAnalyticsScreen$2;
import au.com.woolworths.feature.shop.contentpage.data.HorizontalListData;
import au.com.woolworths.feature.shop.contentpage.data.SnackbarContent;
import au.com.woolworths.feature.shop.contentpage.data.infotile.InfoTileCta;
import au.com.woolworths.feature.shop.contentpage.data.infotile.InfoTileData;
import au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCardKt;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.instore.navigation.map.InstoreNavigationInteractor;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdPlayerState;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.product.models.ProductTrolleyData;
import au.com.woolworths.product.models.PromotionCard;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.product.tile.PromotionClickListener;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.model.action.ActionType;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCard;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import au.com.woolworths.shop.aem.components.model.basicCoreRow.BasicCoreRowListData;
import au.com.woolworths.shop.aem.components.model.contentcard.FullWidthContentCardData;
import au.com.woolworths.shop.aem.components.model.editorialbanner.EditorialBannerData;
import au.com.woolworths.shop.aem.components.model.herobanner.HeroBanner;
import au.com.woolworths.shop.aem.components.model.herobanner.HeroBannerAction;
import au.com.woolworths.shop.aem.components.model.herobanner.HeroBannerTermsAndConditions;
import au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListItem;
import au.com.woolworths.shop.aem.components.model.verticallist.VerticalListData;
import au.com.woolworths.shop.aem.components.model.verticallist.VerticalListItem;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import au.com.woolworths.shop.lists.data.WatchlistInteractor;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.ranges.IntRange;
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/product/tile/ProductClickListener;", "Lau/com/woolworths/product/tile/PromotionClickListener;", "Companion", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ContentPageViewModel extends ViewModel implements ProductClickListener, PromotionClickListener {
    public final ContentPageInteractor e;
    public final TrolleyInteractor f;
    public final CollectionModeInteractor g;
    public final GoogleAdManagerInteractor h;
    public final BannerDismissInteractor i;
    public final AnalyticsManager j;
    public final ReleaseSettingsInteractorImpl k;
    public final WatchlistInteractor l;
    public final ShopAccountInteractor m;
    public final CatalogueStoreInteractor n;
    public final InstoreNavigationInteractor o;
    public final MutableStateFlow p;
    public final SharedFlowImpl q;
    public final Flow r;
    public final StateFlow s;
    public Activities.ContentPage.ContentPageExtras t;
    public final c u;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "mode", "Lau/com/woolworths/android/onesite/modules/collectionmode/common/CollectionMode;", "count", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.contentpage.ContentPageViewModel$1", f = "ContentPageViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.feature.shop.contentpage.ContentPageViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function3<CollectionMode, Integer, Continuation<? super Unit>, Object> {
        public /* synthetic */ CollectionMode p;
        public /* synthetic */ int q;

        public AnonymousClass1(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int iIntValue = ((Number) obj2).intValue();
            AnonymousClass1 anonymousClass1 = ContentPageViewModel.this.new AnonymousClass1((Continuation) obj3);
            anonymousClass1.p = (CollectionMode) obj;
            anonymousClass1.q = iIntValue;
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            ContentPageContract.ViewState viewState;
            ContentPageContract.CartData cartData;
            ContentPageContract.TopBarConfig topBarConfig;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            CollectionMode collectionMode = this.p;
            int i = this.q;
            MutableStateFlow mutableStateFlow = ContentPageViewModel.this.p;
            do {
                value = mutableStateFlow.getValue();
                viewState = (ContentPageContract.ViewState) value;
                ContentPageContract.CartData cartData2 = viewState.c.b;
                Integer num = new Integer(i);
                boolean z = cartData2.f6979a;
                cartData2.getClass();
                cartData = new ContentPageContract.CartData(z, num);
                topBarConfig = viewState.c;
            } while (!mutableStateFlow.d(value, ContentPageContract.ViewState.a(viewState, new ContentPageContract.TopBarConfig(topBarConfig.f6981a, cartData, topBarConfig.c), null, Intrinsics.c(collectionMode, CollectionMode.InStore.d), 30715)));
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/android/onesite/rxutils/Result;", "Lau/com/woolworths/android/onesite/models/TrolleyResult;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.contentpage.ContentPageViewModel$3", f = "ContentPageViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.contentpage.ContentPageViewModel$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function2<Result<? extends TrolleyResult>, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;

        public AnonymousClass3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = ContentPageViewModel.this.new AnonymousClass3(continuation);
            anonymousClass3.p = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass3 anonymousClass3 = (AnonymousClass3) create((Result) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass3.invokeSuspend(unit);
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                kotlin.ResultKt.b(r18)
                java.lang.Object r1 = r0.p
                au.com.woolworths.android.onesite.rxutils.Result r1 = (au.com.woolworths.android.onesite.rxutils.Result) r1
                au.com.woolworths.feature.shop.contentpage.ContentPageViewModel r2 = au.com.woolworths.feature.shop.contentpage.ContentPageViewModel.this
                kotlinx.coroutines.flow.MutableStateFlow r3 = r2.p
                kotlinx.coroutines.flow.StateFlow r4 = r2.s
                java.lang.Object r4 = r4.getValue()
                au.com.woolworths.feature.shop.contentpage.ContentPageContract$ViewState r4 = (au.com.woolworths.feature.shop.contentpage.ContentPageContract.ViewState) r4
                au.com.woolworths.feature.shop.contentpage.data.ContentPageData r4 = r4.f6982a
                r5 = 0
                if (r4 == 0) goto La5
                java.lang.Object r1 = r1.f4591a
                kotlin.jvm.internal.Intrinsics.e(r1)
                au.com.woolworths.android.onesite.models.TrolleyResult r1 = (au.com.woolworths.android.onesite.models.TrolleyResult) r1
                java.util.List r6 = r4.d
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.ArrayList r7 = new java.util.ArrayList
                r8 = 10
                int r8 = kotlin.collections.CollectionsKt.s(r6, r8)
                r7.<init>(r8)
                java.util.Iterator r6 = r6.iterator()
            L36:
                boolean r8 = r6.hasNext()
                if (r8 == 0) goto L9f
                java.lang.Object r8 = r6.next()
                boolean r9 = r8 instanceof au.com.woolworths.feature.shop.contentpage.data.HorizontalListData
                if (r9 == 0) goto L59
                au.com.woolworths.feature.shop.contentpage.data.HorizontalListData r8 = (au.com.woolworths.feature.shop.contentpage.data.HorizontalListData) r8
                java.util.List r9 = r8.getH()
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.util.ArrayList r9 = kotlin.collections.CollectionsKt.B(r9)
                java.util.ArrayList r9 = au.com.woolworths.product.productbottomsheet.ProductListFeedTrolleyUpdater.b(r9, r1)
                au.com.woolworths.feature.shop.contentpage.data.HorizontalListData r8 = au.com.woolworths.feature.shop.contentpage.data.HorizontalListData.a(r8, r9)
                goto L9b
            L59:
                boolean r9 = r8 instanceof au.com.woolworths.product.models.VideoAdUnitData
                if (r9 == 0) goto L9b
                r10 = r8
                au.com.woolworths.product.models.VideoAdUnitData r10 = (au.com.woolworths.product.models.VideoAdUnitData) r10
                au.com.woolworths.product.models.VideoAdUnitCarousel r8 = r10.getVideoAdUnitCarousel()
                if (r8 == 0) goto L9a
                java.util.List r9 = r8.getItems()
                java.util.ArrayList r9 = au.com.woolworths.product.productbottomsheet.ProductListFeedTrolleyUpdater.b(r9, r1)
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                java.util.Iterator r9 = r9.iterator()
            L77:
                boolean r12 = r9.hasNext()
                if (r12 == 0) goto L89
                java.lang.Object r12 = r9.next()
                boolean r13 = r12 instanceof au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListItem
                if (r13 == 0) goto L77
                r11.add(r12)
                goto L77
            L89:
                au.com.woolworths.product.models.VideoAdUnitCarousel r13 = r8.copy(r11)
                r15 = 11
                r16 = 0
                r11 = 0
                r12 = 0
                r14 = 0
                au.com.woolworths.product.models.VideoAdUnitData r8 = au.com.woolworths.product.models.VideoAdUnitData.copy$default(r10, r11, r12, r13, r14, r15, r16)
                if (r8 != 0) goto L9b
            L9a:
                r8 = r10
            L9b:
                r7.add(r8)
                goto L36
            L9f:
                r1 = 55
                au.com.woolworths.feature.shop.contentpage.data.ContentPageData r5 = au.com.woolworths.feature.shop.contentpage.data.ContentPageData.a(r4, r5, r7, r1)
            La5:
                r4 = r5
                r15 = 0
                r16 = 16382(0x3ffe, float:2.2956E-41)
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                au.com.woolworths.feature.shop.contentpage.ContentPageViewModel.K6(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                kotlin.Unit r1 = kotlin.Unit.f24250a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.contentpage.ContentPageViewModel.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "it", "", "Lau/com/woolworths/product/models/ProductId;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.contentpage.ContentPageViewModel$4", f = "ContentPageViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.contentpage.ContentPageViewModel$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements Function2<List<? extends ProductId>, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;

        public AnonymousClass4(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass4 anonymousClass4 = ContentPageViewModel.this.new AnonymousClass4(continuation);
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
            ContentPageViewModel contentPageViewModel = ContentPageViewModel.this;
            ContentPageViewModel.K6(contentPageViewModel, contentPageViewModel.p, null, null, false, false, null, null, null, null, list, null, false, false, 15359);
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageViewModel$Companion;", "", "", "DEFAULT_PAGE_NAME", "Ljava/lang/String;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7016a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[Activities.ContentPage.ContentPageType.values().length];
            try {
                Parcelable.Creator<Activities.ContentPage.ContentPageType> creator = Activities.ContentPage.ContentPageType.CREATOR;
                iArr[5] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f7016a = iArr;
            int[] iArr2 = new int[ActionType.values().length];
            try {
                ActionType actionType = ActionType.d;
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ActionType actionType2 = ActionType.d;
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            b = iArr2;
        }
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [au.com.woolworths.feature.shop.contentpage.c] */
    public ContentPageViewModel(ContentPageInteractor contentPageInteractor, CartUpdateInteractor cartUpdateInteractor, TrolleyInteractor trolleyInteractor, CollectionModeInteractor collectionModeInteractor, GoogleAdManagerInteractor googleAdManagerInteractor, BannerDismissInteractor bannerDismissInteractor, AnalyticsManager analyticsManager, ReleaseSettingsInteractorImpl releaseSettingsInteractorImpl, WatchlistInteractor watchlistInteractor, ShopAccountInteractor accountInteractor, CatalogueStoreInteractor catalogueStoreInteractor, InstoreNavigationInteractor inStoreNavigationInteractor) {
        Intrinsics.h(cartUpdateInteractor, "cartUpdateInteractor");
        Intrinsics.h(trolleyInteractor, "trolleyInteractor");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(googleAdManagerInteractor, "googleAdManagerInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(watchlistInteractor, "watchlistInteractor");
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(inStoreNavigationInteractor, "inStoreNavigationInteractor");
        this.e = contentPageInteractor;
        this.f = trolleyInteractor;
        this.g = collectionModeInteractor;
        this.h = googleAdManagerInteractor;
        this.i = bannerDismissInteractor;
        this.j = analyticsManager;
        this.k = releaseSettingsInteractorImpl;
        this.l = watchlistInteractor;
        this.m = accountInteractor;
        this.n = catalogueStoreInteractor;
        this.o = inStoreNavigationInteractor;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(ContentPageContract.ViewState.p);
        this.p = mutableStateFlowA;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.q = sharedFlowImplB;
        this.r = FlowKt.a(sharedFlowImplB);
        this.s = mutableStateFlowA;
        FlowKt.E(FlowKt.C(collectionModeInteractor.getM(), (StateFlow) cartUpdateInteractor.l, new AnonymousClass1(null)), ViewModelKt.a(this));
        final StateFlow stateFlowV = trolleyInteractor.getP();
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass3(null), new Flow<Result<? extends TrolleyResult>>() { // from class: au.com.woolworths.feature.shop.contentpage.ContentPageViewModel$special$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: au.com.woolworths.feature.shop.contentpage.ContentPageViewModel$special$$inlined$filter$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "au.com.woolworths.feature.shop.contentpage.ContentPageViewModel$special$$inlined$filter$1$2", f = "ContentPageViewModel.kt", l = {50}, m = "emit")
                /* renamed from: au.com.woolworths.feature.shop.contentpage.ContentPageViewModel$special$$inlined$filter$1$2$1, reason: invalid class name */
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
                        boolean r0 = r6 instanceof au.com.woolworths.feature.shop.contentpage.ContentPageViewModel$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        au.com.woolworths.feature.shop.contentpage.ContentPageViewModel$special$$inlined$filter$1$2$1 r0 = (au.com.woolworths.feature.shop.contentpage.ContentPageViewModel$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.q = r1
                        goto L18
                    L13:
                        au.com.woolworths.feature.shop.contentpage.ContentPageViewModel$special$$inlined$filter$1$2$1 r0 = new au.com.woolworths.feature.shop.contentpage.ContentPageViewModel$special$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.p
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r2 = r0.q
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        kotlin.ResultKt.b(r6)
                        goto L4a
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        kotlin.ResultKt.b(r6)
                        r6 = r5
                        au.com.woolworths.android.onesite.rxutils.Result r6 = (au.com.woolworths.android.onesite.rxutils.Result) r6
                        boolean r2 = r6.b()
                        if (r2 == 0) goto L4a
                        java.lang.Object r6 = r6.f4591a
                        if (r6 == 0) goto L4a
                        r0.q = r3
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4a
                        return r1
                    L4a:
                        kotlin.Unit r5 = kotlin.Unit.f24250a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.contentpage.ContentPageViewModel$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = stateFlowV.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        }), ViewModelKt.a(this));
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass4(null), watchlistInteractor.e), ViewModelKt.a(this));
        K6(this, mutableStateFlowA, null, null, false, false, null, null, null, null, null, null, false, inStoreNavigationInteractor.d(), 8191);
        this.u = new Function1() { // from class: au.com.woolworths.feature.shop.contentpage.c
            /* JADX WARN: Removed duplicated region for block: B:108:0x01fa  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r27) {
                /*
                    Method dump skipped, instructions count: 1787
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.contentpage.c.invoke(java.lang.Object):java.lang.Object");
            }
        };
    }

    public static void J6(ContentPageViewModel contentPageViewModel, final String str, final String str2) {
        ContentPageAnalytics.ContentPage contentPageS6 = contentPageViewModel.s6();
        if (contentPageS6 != null) {
            AnalyticsManager analyticsManager = contentPageViewModel.j;
            final ContentPageAnalytics.ContentPage.Action action = contentPageS6.h;
            action.getClass();
            analyticsManager.g(new Event(action, str, str2) { // from class: au.com.woolworths.analytics.supers.dynamicpage.ContentPageAnalytics$ContentPage$Action$collectionComponentClick$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                    spreadBuilder.b(action.f4035a.g);
                    spreadBuilder.a(new Pair("event.Category", "collection component"));
                    spreadBuilder.a(new Pair("event.Action", "collectioncomponent_click"));
                    spreadBuilder.a(new Pair("event.Label", str));
                    spreadBuilder.a(new Pair("event.Description", str2));
                    spreadBuilder.a(new Pair("internal.Campaign", ""));
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "collectioncomponent_click";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj;
                    return "collectioncomponent_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
        }
    }

    public static void K6(ContentPageViewModel contentPageViewModel, MutableStateFlow mutableStateFlow, ContentPageData contentPageData, ContentPageContract.TopBarConfig topBarConfig, boolean z, boolean z2, ContentPageFullPageError contentPageFullPageError, Map map, SnackbarContent snackbarContent, VideoAdPlayerState videoAdPlayerState, List list, ContentPageContract.Snackbar snackbar, boolean z3, boolean z4, int i) {
        String str;
        boolean z5;
        Screen dataHelperKt$getAnalyticsScreen$2;
        ContentPageData contentPageDataA;
        Iterator it;
        ContentPageHeaderData contentPageHeaderData;
        final ContentPageData contentPageData2 = (i & 1) != 0 ? ((ContentPageContract.ViewState) contentPageViewModel.s.getValue()).f6982a : contentPageData;
        if (contentPageData2 == null || (contentPageHeaderData = contentPageData2.f7020a) == null || (str = contentPageHeaderData.f7021a) == null) {
            str = "Generic Content Page screen";
        }
        String str2 = str;
        ContentPageContract.TopBarConfig topBarConfig2 = (i & 4) != 0 ? ((ContentPageContract.ViewState) contentPageViewModel.s.getValue()).c : topBarConfig;
        boolean z6 = ((ContentPageContract.ViewState) contentPageViewModel.s.getValue()).l;
        boolean z7 = (i & 16) != 0 ? ((ContentPageContract.ViewState) contentPageViewModel.s.getValue()).d : z;
        boolean z8 = (i & 32) != 0 ? ((ContentPageContract.ViewState) contentPageViewModel.s.getValue()).f : z2;
        ContentPageFullPageError contentPageFullPageError2 = (i & 64) != 0 ? ((ContentPageContract.ViewState) contentPageViewModel.s.getValue()).e : contentPageFullPageError;
        Map map2 = (i & 128) != 0 ? ((ContentPageContract.ViewState) contentPageViewModel.s.getValue()).g : map;
        SnackbarContent snackbarContent2 = (i & 256) != 0 ? ((ContentPageContract.ViewState) contentPageViewModel.s.getValue()).h : snackbarContent;
        VideoAdPlayerState videoAdPlayerState2 = (i & 512) != 0 ? ((ContentPageContract.ViewState) contentPageViewModel.s.getValue()).k : videoAdPlayerState;
        List list2 = (i & 1024) != 0 ? ((ContentPageContract.ViewState) contentPageViewModel.s.getValue()).m : list;
        ContentPageContract.Snackbar snackbar2 = (i & 2048) != 0 ? ((ContentPageContract.ViewState) contentPageViewModel.s.getValue()).n : snackbar;
        boolean z9 = (i & 4096) != 0 ? ((ContentPageContract.ViewState) contentPageViewModel.s.getValue()).i : z3;
        boolean z10 = (i & 8192) != 0 ? ((ContentPageContract.ViewState) contentPageViewModel.s.getValue()).o : z4;
        contentPageViewModel.getClass();
        while (true) {
            Object value = mutableStateFlow.getValue();
            if (contentPageData2 != null) {
                List list3 = contentPageData2.d;
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    boolean z11 = z6;
                    BroadcastBannerData broadcastBannerData = next instanceof BroadcastBannerData ? (BroadcastBannerData) next : null;
                    boolean z12 = true;
                    if (broadcastBannerData != null) {
                        it = it2;
                        z12 = !contentPageViewModel.i.a(broadcastBannerData);
                    } else {
                        it = it2;
                    }
                    if (z12) {
                        arrayList.add(next);
                    }
                    it2 = it;
                    z6 = z11;
                }
                z5 = z6;
                dataHelperKt$getAnalyticsScreen$2 = null;
                contentPageDataA = ContentPageData.a(contentPageData2, null, arrayList, 55);
            } else {
                z5 = z6;
                dataHelperKt$getAnalyticsScreen$2 = null;
                contentPageDataA = null;
            }
            if (contentPageData2 != null) {
                AnalyticsData analyticsData = contentPageData2.b;
                dataHelperKt$getAnalyticsScreen$2 = (analyticsData == null || analyticsData.getScreenName() == null || analyticsData.getAppSection() == null) ? new DataHelperKt$getAnalyticsScreen$2() : new Screen() { // from class: au.com.woolworths.feature.shop.contentpage.data.DataHelperKt$getAnalyticsScreen$1
                    @Override // au.com.woolworths.android.onesite.analytics.Screen
                    /* renamed from: a */
                    public final String getE() {
                        String appSection = contentPageData2.b.getAppSection();
                        Intrinsics.e(appSection);
                        return appSection;
                    }

                    @Override // au.com.woolworths.android.onesite.analytics.Screen
                    /* renamed from: d */
                    public final String getD() {
                        String screenName = contentPageData2.b.getScreenName();
                        Intrinsics.e(screenName);
                        return screenName;
                    }
                };
            }
            if (mutableStateFlow.d(value, new ContentPageContract.ViewState(contentPageDataA, dataHelperKt$getAnalyticsScreen$2, topBarConfig2, z7, contentPageFullPageError2, z8, map2, snackbarContent2, z9, str2, videoAdPlayerState2, z5, list2, snackbar2, z10))) {
                return;
            } else {
                z6 = z5;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object p6(au.com.woolworths.feature.shop.contentpage.ContentPageViewModel r10, au.com.woolworths.feature.shop.contentpage.data.ContentPageData r11, au.com.woolworths.android.onesite.navigation.Activities.ContentPage.ContentPageExtras r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.contentpage.ContentPageViewModel.p6(au.com.woolworths.feature.shop.contentpage.ContentPageViewModel, au.com.woolworths.feature.shop.contentpage.data.ContentPageData, au.com.woolworths.android.onesite.navigation.Activities$ContentPage$ContentPageExtras, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void A6(HeroBanner heroBanner) {
        Intrinsics.h(heroBanner, "heroBanner");
        HeroBannerAction heroBannerAction = heroBanner.b;
        AnalyticsData analyticsData = heroBannerAction.b;
        if (analyticsData != null) {
            this.j.g(AnalyticsDataKt.a(AnalyticsDataKt.c(AnalyticsDataKt.c(analyticsData, heroBanner.c, false), u6(), false)));
        }
        this.q.f(new ContentPageContract.Actions.LaunchDeepLink(heroBannerAction.f10164a));
    }

    public final void B6(HeroBanner heroBanner) {
        ActionData actionData;
        Intrinsics.h(heroBanner, "heroBanner");
        HeroBannerTermsAndConditions heroBannerTermsAndConditions = heroBanner.k;
        if (heroBannerTermsAndConditions == null || (actionData = heroBannerTermsAndConditions.b) == null) {
            return;
        }
        this.j.g(AnalyticsDataKt.b(AnalyticsDataKt.b(AnalyticsDataKt.a(heroBanner.c), actionData.getAnalytics()), u6()));
        int iOrdinal = actionData.getType().ordinal();
        SharedFlowImpl sharedFlowImpl = this.q;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            sharedFlowImpl.f(new ContentPageContract.Actions.LaunchDeepLink(actionData.getAction()));
            return;
        }
        Uri uri = Uri.parse(actionData.getAction());
        String queryParameter = uri.getQueryParameter("title");
        String queryParameter2 = uri.getQueryParameter("url");
        if (queryParameter == null || queryParameter2 == null) {
            return;
        }
        sharedFlowImpl.f(new ContentPageContract.Actions.LaunchWebView(queryParameter, queryParameter2));
    }

    @Override // au.com.woolworths.product.tile.PromotionClickListener
    public final void C1(PromotionCard promotionCard, String containerTitle) {
        String buttonQuantity;
        String lowerCase;
        String buttonLabel;
        Intrinsics.h(containerTitle, "containerTitle");
        ProductCard productCard = promotionCard.getProductCard();
        AnalyticsData productCardAnalytics = productCard.getProductCardAnalytics();
        if (productCardAnalytics != null) {
            ProductTrolleyData trolley = productCard.getTrolley();
            if (trolley == null || (buttonQuantity = trolley.getButtonQuantity()) == null) {
                buttonQuantity = "0";
            }
            AnalyticsData analyticsDataE = AnalyticsDataKt.e(buttonQuantity, productCardAnalytics);
            ProductCardAnalytics.Carousel.Action.Companion companion = ProductCardAnalytics.Carousel.Action.d;
            ProductTrolleyData trolley2 = productCard.getTrolley();
            if (trolley2 == null || (buttonLabel = trolley2.getButtonLabel()) == null) {
                lowerCase = null;
            } else {
                lowerCase = buttonLabel.toLowerCase(Locale.ROOT);
                Intrinsics.g(lowerCase, "toLowerCase(...)");
            }
            if (lowerCase == null) {
                lowerCase = "";
            }
            companion.getClass();
            ProductCardAnalytics$Carousel$Action$Companion$addToCartClick$1 productCardAnalytics$Carousel$Action$Companion$addToCartClick$1A = ProductCardAnalytics.Carousel.Action.Companion.a(containerTitle, lowerCase);
            AnalyticsData analyticsDataU6 = u6();
            this.j.i(AnalyticsDataKt.b(AnalyticsDataKt.b(productCardAnalytics$Carousel$Action$Companion$addToCartClick$1A, analyticsDataU6 != null ? AnalyticsDataKt.c(analyticsDataU6, analyticsDataE, false) : null), promotionCard.getAnalytics()), ProductAnalyticsExtKt.h(productCard, null, null, 7));
        }
        this.q.f(new ContentPageContract.Actions.LaunchAddToCartBottomSheet(promotionCard.getProductCard()));
    }

    public final void C6(int i, HorizontalListData data) {
        Intrinsics.h(data, "data");
        Integer num = data.d;
        if (i >= (num != null ? num.intValue() : -1)) {
            ContentPageData contentPageData = ((ContentPageContract.ViewState) this.s.getValue()).f6982a;
            AnalyticsData analyticsData = contentPageData != null ? contentPageData.b : null;
            ArrayList arrayList = new ArrayList();
            AnalyticsData horizontalListImpressionAnalytics = data.getHorizontalListImpressionAnalytics();
            if (horizontalListImpressionAnalytics != null) {
                AnalyticsData analyticsDataC = AnalyticsDataKt.c(AnalyticsDataKt.c(horizontalListImpressionAnalytics, data.getHorizontalListAnalytics(), false), analyticsData, false);
                List h = data.getH();
                Integer num2 = data.d;
                List listQ0 = CollectionsKt.q0(h, new IntRange(num2 != null ? num2.intValue() : 0, i, 1));
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listQ0) {
                    if (obj instanceof HorizontalListItem) {
                        arrayList2.add(obj);
                    }
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    HorizontalListItem horizontalListItem = (HorizontalListItem) it.next();
                    if (horizontalListItem instanceof ProductCard) {
                        arrayList.add(horizontalListItem);
                    }
                    if (horizontalListItem instanceof PromotionCard) {
                        arrayList.add(((PromotionCard) horizontalListItem).getProductCard());
                    }
                    analyticsDataC = AnalyticsDataKt.c(analyticsDataC, horizontalListItem.getO(), true);
                }
                boolean zIsEmpty = arrayList.isEmpty();
                AnalyticsManager analyticsManager = this.j;
                if (zIsEmpty) {
                    analyticsManager.g(AnalyticsDataKt.a(analyticsDataC));
                } else {
                    analyticsManager.i(AnalyticsDataKt.a(analyticsDataC), ProductAnalyticsExtKt.f(arrayList));
                }
            }
            data.d = Integer.valueOf(i + 1);
        }
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void D4(ProductCard productCardTileData, String containerTitle) {
        String buttonQuantity;
        String lowerCase;
        String buttonLabel;
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardTileData, "productCardTileData");
        AnalyticsData productCardAnalytics = productCardTileData.getProductCardAnalytics();
        if (productCardAnalytics != null) {
            ProductTrolleyData trolley = productCardTileData.getTrolley();
            if (trolley == null || (buttonQuantity = trolley.getButtonQuantity()) == null) {
                buttonQuantity = "0";
            }
            AnalyticsData analyticsDataE = AnalyticsDataKt.e(buttonQuantity, productCardAnalytics);
            ProductCardAnalytics.Carousel.Action.Companion companion = ProductCardAnalytics.Carousel.Action.d;
            ProductTrolleyData trolley2 = productCardTileData.getTrolley();
            if (trolley2 == null || (buttonLabel = trolley2.getButtonLabel()) == null) {
                lowerCase = "";
            } else {
                lowerCase = buttonLabel.toLowerCase(Locale.ROOT);
                Intrinsics.g(lowerCase, "toLowerCase(...)");
            }
            companion.getClass();
            ProductCardAnalytics$Carousel$Action$Companion$addToCartClick$1 productCardAnalytics$Carousel$Action$Companion$addToCartClick$1A = ProductCardAnalytics.Carousel.Action.Companion.a(containerTitle, lowerCase);
            AnalyticsData analyticsDataU6 = u6();
            this.j.i(AnalyticsDataKt.b(productCardAnalytics$Carousel$Action$Companion$addToCartClick$1A, analyticsDataU6 != null ? AnalyticsDataKt.c(analyticsDataU6, analyticsDataE, true) : null), ProductAnalyticsExtKt.h(productCardTileData, null, null, 7));
        }
        this.q.f(new ContentPageContract.Actions.LaunchAddToCartBottomSheet(productCardTileData));
    }

    public final void D6(Set listIndices) {
        List list;
        Intrinsics.h(listIndices, "listIndices");
        Iterator it = listIndices.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            ContentPageData contentPageData = ((ContentPageContract.ViewState) this.p.getValue()).f6982a;
            Object obj = (contentPageData == null || (list = contentPageData.d) == null) ? null : list.get(iIntValue);
            HorizontalListData horizontalListData = obj instanceof HorizontalListData ? (HorizontalListData) obj : null;
            if (horizontalListData != null) {
                horizontalListData.d = null;
            }
        }
    }

    public final void E6(VerticalListData data, VerticalListItem item) {
        Intrinsics.h(data, "data");
        String str = data.f10186a;
        Intrinsics.h(item, "item");
        boolean z = item instanceof FullWidthContentCardData;
        SharedFlowImpl sharedFlowImpl = this.q;
        if (z) {
            FullWidthContentCardData fullWidthContentCardData = (FullWidthContentCardData) item;
            ActionData actionData = fullWidthContentCardData.f;
            if (actionData != null) {
                sharedFlowImpl.f(new ContentPageContract.Actions.LaunchDeepLink(actionData.getAction()));
                String str2 = fullWidthContentCardData.c;
                if (str2 == null) {
                    str2 = "";
                }
                if (str == null) {
                    str = "";
                }
                J6(this, str2, str);
                return;
            }
            return;
        }
        if (!(item instanceof InfoTileData)) {
            throw new IllegalArgumentException("Vertical List Item type " + item + " not supported");
        }
        InfoTileData infoTileData = (InfoTileData) item;
        InfoTileCta infoTileCta = infoTileData.d;
        if (infoTileCta != null) {
            sharedFlowImpl.f(new ContentPageContract.Actions.LaunchDeepLink(infoTileCta.b.getAction()));
            String str3 = infoTileData.b;
            if (str == null) {
                str = "";
            }
            J6(this, str3, str);
        }
    }

    public final void F6(VideoAdPlayerState state) {
        MutableStateFlow mutableStateFlow;
        Object value;
        Intrinsics.h(state, "state");
        do {
            mutableStateFlow = this.p;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, ContentPageContract.ViewState.a((ContentPageContract.ViewState) value, null, state, false, 31743)));
    }

    public final void G6(ActivityResult result) {
        Intent intent;
        Activities.FullPageVideoPlayerActivity.Result result2;
        Intrinsics.h(result, "result");
        if (result.d != -1 || (intent = result.e) == null || (result2 = (Activities.FullPageVideoPlayerActivity.Result) intent.getParcelableExtra("RESULT_KEY")) == null) {
            return;
        }
        String str = result2.d;
        long j = result2.e;
        Map map = ((ContentPageContract.ViewState) this.s.getValue()).g;
        map.put(str, Long.valueOf(j));
        K6(this, this.p, null, null, false, false, null, map, null, null, null, null, false, false, 16255);
        String str2 = result2.f;
        if (str2 != null) {
            I6(str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object H6(au.com.woolworths.feature.shop.contentpage.data.ContentPageData r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof au.com.woolworths.feature.shop.contentpage.ContentPageViewModel$processGoogleAdsMetadata$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.feature.shop.contentpage.ContentPageViewModel$processGoogleAdsMetadata$1 r0 = (au.com.woolworths.feature.shop.contentpage.ContentPageViewModel$processGoogleAdsMetadata$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.contentpage.ContentPageViewModel$processGoogleAdsMetadata$1 r0 = new au.com.woolworths.feature.shop.contentpage.ContentPageViewModel$processGoogleAdsMetadata$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            au.com.woolworths.feature.shop.contentpage.data.ContentPageData r6 = r0.p
            kotlin.ResultKt.b(r7)
            goto L69
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.ResultKt.b(r7)
            java.util.List r7 = r6.d
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r2 = r7 instanceof java.util.Collection
            if (r2 == 0) goto L46
            r2 = r7
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L46
            goto L72
        L46:
            java.util.Iterator r7 = r7.iterator()
        L4a:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L72
            java.lang.Object r2 = r7.next()
            boolean r2 = r2 instanceof au.com.woolworths.foundation.advertising.data.google.model.UniversalInventoryContainerData
            if (r2 == 0) goto L4a
            java.util.List r7 = r6.d
            au.com.woolworths.foundation.advertising.data.google.model.GoogleAdConsumer r2 = au.com.woolworths.foundation.advertising.data.google.model.GoogleAdConsumer.i
            r0.p = r6
            r0.s = r3
            au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor r4 = r5.h
            java.io.Serializable r7 = r4.k(r7, r2, r3, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            java.util.List r7 = (java.util.List) r7
            r0 = 0
            r1 = 55
            au.com.woolworths.feature.shop.contentpage.data.ContentPageData r6 = au.com.woolworths.feature.shop.contentpage.data.ContentPageData.a(r6, r0, r7, r1)
        L72:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.contentpage.ContentPageViewModel.H6(au.com.woolworths.feature.shop.contentpage.data.ContentPageData, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void I6(String message) {
        Intrinsics.h(message, "message");
        K6(this, this.p, null, null, false, false, null, null, new SnackbarContent(new PlainText(message), null, null), null, null, null, false, false, 16127);
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void J1(ProductCard productCardData, String containerTitle) {
        String buttonQuantity;
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardData, "productCardData");
        AnalyticsData productCardAnalytics = productCardData.getProductCardAnalytics();
        if (productCardAnalytics != null) {
            ProductTrolleyData trolley = productCardData.getTrolley();
            if (trolley == null || (buttonQuantity = trolley.getButtonQuantity()) == null) {
                buttonQuantity = "0";
            }
            AnalyticsData analyticsDataE = AnalyticsDataKt.e(buttonQuantity, productCardAnalytics);
            ProductCardAnalytics.Carousel.Action.d.getClass();
            ProductCardAnalytics$Carousel$Action$Companion$cardTap$1 productCardAnalytics$Carousel$Action$Companion$cardTap$1 = new ProductCardAnalytics$Carousel$Action$Companion$cardTap$1(containerTitle);
            AnalyticsData analyticsDataU6 = u6();
            this.j.i(AnalyticsDataKt.b(productCardAnalytics$Carousel$Action$Companion$cardTap$1, analyticsDataU6 != null ? AnalyticsDataKt.c(analyticsDataU6, analyticsDataE, true) : null), ProductAnalyticsExtKt.h(productCardData, null, null, 7));
        }
        this.q.f(new ContentPageContract.Actions.LaunchProductDetails(productCardData));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void L0(ProductCard productCardTileData, String containerTitle) {
        String buttonQuantity;
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardTileData, "productCardTileData");
        AnalyticsData productCardAnalytics = productCardTileData.getProductCardAnalytics();
        if (productCardAnalytics != null) {
            ProductTrolleyData trolley = productCardTileData.getTrolley();
            if (trolley == null || (buttonQuantity = trolley.getButtonQuantity()) == null) {
                buttonQuantity = "0";
            }
            AnalyticsData analyticsDataE = AnalyticsDataKt.e(buttonQuantity, productCardAnalytics);
            ProductCardAnalytics.Carousel.Action.d.getClass();
            ProductCardAnalytics$Carousel$Action$Companion$addToListClick$1 productCardAnalytics$Carousel$Action$Companion$addToListClick$1 = new ProductCardAnalytics$Carousel$Action$Companion$addToListClick$1(containerTitle);
            AnalyticsData analyticsDataU6 = u6();
            this.j.i(AnalyticsDataKt.b(productCardAnalytics$Carousel$Action$Companion$addToListClick$1, analyticsDataU6 != null ? AnalyticsDataKt.c(analyticsDataU6, analyticsDataE, true) : null), ProductAnalyticsExtKt.h(productCardTileData, null, null, 7));
        }
        this.q.f(new ContentPageContract.Actions.LaunchListsBottomSheet(productCardTileData));
    }

    public final void L6(ContentPageData contentPageData, CollectionMode collectionMode, Activities.ContentPage.ContentPageExtras contentPageExtras) {
        ArrayList<AnalyticsData> arrayList;
        List list;
        AnalyticsData analyticsDataA;
        StateFlow stateFlow = this.s;
        ContentPageContract.CartData cartData = ((ContentPageContract.ViewState) stateFlow.getValue()).c.b;
        Activities.ContentPage.ContentPageExtras contentPageExtras2 = this.t;
        if (contentPageExtras2 == null) {
            Intrinsics.p("contentPageExtra");
            throw null;
        }
        boolean z = ((collectionMode instanceof CollectionMode.InStore) || CollectionsKt.R(Activities.ContentPage.ContentPageType.e, Activities.ContentPage.ContentPageType.k).contains(contentPageExtras2.f)) ? false : true;
        Integer num = cartData.b;
        cartData.getClass();
        ContentPageContract.CartData cartData2 = new ContentPageContract.CartData(z, num);
        Activities.ContentPage.ContentPageType contentPageType = contentPageExtras.f;
        Activities.ContentPage.ContentPageType contentPageType2 = Activities.ContentPage.ContentPageType.j;
        boolean z2 = !CollectionsKt.R(contentPageType2, Activities.ContentPage.ContentPageType.k, Activities.ContentPage.ContentPageType.e, Activities.ContentPage.ContentPageType.q, Activities.ContentPage.ContentPageType.s, Activities.ContentPage.ContentPageType.t, Activities.ContentPage.ContentPageType.v).contains(contentPageType);
        ContentPageContract.TopBarConfig topBarConfig = ((ContentPageContract.ViewState) stateFlow.getValue()).c;
        Activities.ContentPage.ContentPageType contentPageType3 = contentPageExtras.f;
        boolean z3 = contentPageType3 == contentPageType2;
        boolean z4 = contentPageType3 == contentPageType2;
        topBarConfig.getClass();
        K6(this, this.p, contentPageData, new ContentPageContract.TopBarConfig(z4, cartData2, z3), false, z2, null, null, (contentPageData == null || !contentPageData.e) ? null : new SnackbarContent(new ResText(com.woolworths.R.string.content_page_partial_error_snackbar_message), null, null), null, null, null, false, false, 16010);
        if (contentPageData == null || (list = contentPageData.d) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof BasicCoreRowListData) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                BasicCoreRowListData basicCoreRowListData = (BasicCoreRowListData) it.next();
                AnalyticsData analyticsDataB = basicCoreRowListData.getBasicCoreRowListImpressionAnalytics();
                AnalyticsData analyticsDataC = (analyticsDataB == null || (analyticsDataA = basicCoreRowListData.getBasicCoreRowListAnalytics()) == null) ? null : AnalyticsDataKt.c(analyticsDataA, analyticsDataB, false);
                if (analyticsDataC != null) {
                    arrayList.add(analyticsDataC);
                }
            }
        }
        if (arrayList != null) {
            for (AnalyticsData analyticsData : arrayList) {
                Event eventA = analyticsData != null ? AnalyticsDataKt.a(AnalyticsDataKt.c(analyticsData, contentPageData != null ? contentPageData.b : null, false)) : null;
                if (eventA != null) {
                    this.j.g(eventA);
                }
            }
        }
    }

    @Override // au.com.woolworths.product.tile.PromotionClickListener
    public final void Q4(PromotionCard promotionCard, String containerTitle) {
        String buttonQuantity;
        Intrinsics.h(containerTitle, "containerTitle");
        AnalyticsData productCardAnalytics = promotionCard.getProductCard().getProductCardAnalytics();
        if (productCardAnalytics != null) {
            ProductTrolleyData trolley = promotionCard.getProductCard().getTrolley();
            if (trolley == null || (buttonQuantity = trolley.getButtonQuantity()) == null) {
                buttonQuantity = "0";
            }
            AnalyticsData analyticsDataE = AnalyticsDataKt.e(buttonQuantity, productCardAnalytics);
            ProductCardAnalytics.Carousel.Action.d.getClass();
            ProductCardAnalytics$Carousel$Action$Companion$cardTap$1 productCardAnalytics$Carousel$Action$Companion$cardTap$1 = new ProductCardAnalytics$Carousel$Action$Companion$cardTap$1(containerTitle);
            AnalyticsData analyticsDataU6 = u6();
            this.j.i(AnalyticsDataKt.b(AnalyticsDataKt.b(productCardAnalytics$Carousel$Action$Companion$cardTap$1, analyticsDataU6 != null ? AnalyticsDataKt.c(analyticsDataU6, analyticsDataE, false) : null), promotionCard.getAnalytics()), ProductAnalyticsExtKt.h(promotionCard.getProductCard(), null, null, 7));
        }
        this.q.f(new ContentPageContract.Actions.LaunchProductDetails(promotionCard.getProductCard()));
    }

    @Override // au.com.woolworths.product.tile.PromotionClickListener
    public final void S3(PromotionCard promotionCard, String containerTitle) {
        String buttonQuantity;
        Intrinsics.h(containerTitle, "containerTitle");
        ProductCard productCard = promotionCard.getProductCard();
        AnalyticsData productCardAnalytics = productCard.getProductCardAnalytics();
        if (productCardAnalytics != null) {
            ProductTrolleyData trolley = productCard.getTrolley();
            if (trolley == null || (buttonQuantity = trolley.getButtonQuantity()) == null) {
                buttonQuantity = "0";
            }
            AnalyticsData analyticsDataE = AnalyticsDataKt.e(buttonQuantity, productCardAnalytics);
            ProductCardAnalytics.Carousel.Action.d.getClass();
            ProductCardAnalytics$Carousel$Action$Companion$addToListClick$1 productCardAnalytics$Carousel$Action$Companion$addToListClick$1 = new ProductCardAnalytics$Carousel$Action$Companion$addToListClick$1(containerTitle);
            AnalyticsData analyticsDataU6 = u6();
            this.j.i(AnalyticsDataKt.b(AnalyticsDataKt.b(productCardAnalytics$Carousel$Action$Companion$addToListClick$1, analyticsDataU6 != null ? AnalyticsDataKt.c(analyticsDataU6, analyticsDataE, false) : null), promotionCard.getAnalytics()), ProductAnalyticsExtKt.h(productCard, null, null, 7));
        }
        this.q.f(new ContentPageContract.Actions.LaunchListsBottomSheet(promotionCard.getProductCard()));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void T0(ProductCard productCardData) {
        Intrinsics.h(productCardData, "productCardData");
        this.q.f(new ContentPageContract.Actions.LaunchProductOnMap(productCardData));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void T4(ProductCard productCardTileData, String containerTitle) {
        String buttonQuantity;
        String lowerCase;
        String buttonLabel;
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardTileData, "productCardTileData");
        AnalyticsData productCardAnalytics = productCardTileData.getProductCardAnalytics();
        if (productCardAnalytics != null) {
            ProductTrolleyData trolley = productCardTileData.getTrolley();
            if (trolley == null || (buttonQuantity = trolley.getButtonQuantity()) == null) {
                buttonQuantity = "0";
            }
            AnalyticsData analyticsDataE = AnalyticsDataKt.e(buttonQuantity, productCardAnalytics);
            ProductCardAnalytics.Carousel.Action.Companion companion = ProductCardAnalytics.Carousel.Action.d;
            ProductTrolleyData trolley2 = productCardTileData.getTrolley();
            if (trolley2 == null || (buttonLabel = trolley2.getButtonLabel()) == null) {
                lowerCase = "";
            } else {
                lowerCase = buttonLabel.toLowerCase(Locale.ROOT);
                Intrinsics.g(lowerCase, "toLowerCase(...)");
            }
            companion.getClass();
            ProductCardAnalytics$Carousel$Action$Companion$addToCartClick$1 productCardAnalytics$Carousel$Action$Companion$addToCartClick$1A = ProductCardAnalytics.Carousel.Action.Companion.a(containerTitle, lowerCase);
            AnalyticsData analyticsDataU6 = u6();
            this.j.i(AnalyticsDataKt.b(productCardAnalytics$Carousel$Action$Companion$addToCartClick$1A, analyticsDataU6 != null ? AnalyticsDataKt.c(analyticsDataU6, analyticsDataE, true) : null), ProductAnalyticsExtKt.h(productCardTileData, null, null, 7));
        }
        this.q.f(new ContentPageContract.Actions.LaunchAddToCartBottomSheet(productCardTileData));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void g6(ProductCard productCardData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardData, "productCardData");
        WatchlistInteractor watchlistInteractor = this.l;
        if (watchlistInteractor.c()) {
            this.q.f(ContentPageContract.Actions.LaunchWatchlistGuestOnboardingScreen.f6973a);
            return;
        }
        String strB = watchlistInteractor.b();
        if (strB == null) {
            return;
        }
        boolean zT = ProductCardExtKt.t(productCardData, ((ContentPageContract.ViewState) this.s.getValue()).m);
        String description = "Carousel - ".concat(containerTitle);
        MutableStateFlow mutableStateFlow = this.p;
        AnalyticsManager analyticsManager = this.j;
        if (zT) {
            ContentPageAnalytics.ContentPage contentPageS6 = s6();
            if (contentPageS6 != null) {
                ContentPageAnalytics.ContentPage.Action action = contentPageS6.h;
                action.getClass();
                Intrinsics.h(description, "description");
                analyticsManager.i(new ContentPageAnalytics$ContentPage$Action$removeFromWatchlist$1(action, description), ProductAnalyticsExtKt.h(productCardData, null, null, 7));
            }
            watchlistInteractor.d(productCardData);
            K6(this, mutableStateFlow, null, null, false, false, null, null, null, null, null, new ContentPageContract.Snackbar(new ResText(com.woolworths.R.string.watchlist_product_removed_snackbar_message), new d(this, description, productCardData, 0)), false, false, 14335);
            return;
        }
        ContentPageAnalytics.ContentPage contentPageS62 = s6();
        if (contentPageS62 != null) {
            ContentPageAnalytics.ContentPage.Action action2 = contentPageS62.h;
            action2.getClass();
            Intrinsics.h(description, "description");
            analyticsManager.i(new ContentPageAnalytics$ContentPage$Action$addToWatchlist$1(action2, description), ProductAnalyticsExtKt.h(productCardData, null, null, 7));
        }
        watchlistInteractor.a(productCardData);
        K6(this, mutableStateFlow, null, null, false, false, null, null, null, null, null, new ContentPageContract.Snackbar(new ResText(com.woolworths.R.string.watchlist_product_added_snackbar_message), new ResText(com.woolworths.R.string.view_list), new e(this, strB, description, productCardData, 0), new d(this, description, productCardData, 1)), false, false, 14335);
    }

    public final void m(DynamicSizeCardData data) {
        Intrinsics.h(data, "data");
        boolean z = data instanceof GoogleAdBannerCard;
        AnalyticsManager analyticsManager = this.j;
        SharedFlowImpl sharedFlowImpl = this.q;
        if (!z) {
            if (data instanceof ActionableCard) {
                ActionableCard actionableCard = (ActionableCard) data;
                AnalyticsData analyticsDataE = actionableCard.getClickAnalytics();
                if (analyticsDataE != null) {
                    ContentPageData contentPageData = ((ContentPageContract.ViewState) this.s.getValue()).f6982a;
                    analyticsManager.g(AnalyticsDataKt.a(AnalyticsDataKt.c(analyticsDataE, contentPageData != null ? contentPageData.b : null, false)));
                }
                sharedFlowImpl.f(new ContentPageContract.Actions.LaunchDeepLink(actionableCard.getLink()));
                return;
            }
            return;
        }
        GoogleAdBannerCard googleAdBannerCard = (GoogleAdBannerCard) data;
        String ctaUrl = googleAdBannerCard.getCtaUrl();
        String targetId = googleAdBannerCard.getTargetId();
        BuildersKt.c(ViewModelKt.a(this), null, null, new ContentPageViewModel$onGoogleAdBannerClicked$1(this, googleAdBannerCard, null), 3);
        ContentPageActions.GoogleAdBannerClick googleAdBannerClick = ContentPageActions.GoogleAdBannerClick.e;
        TrackingMetadata trackingMetadataA = GoogleAdBannerCardKt.a(googleAdBannerCard);
        TrackingMetadata trackingMetadataT6 = t6();
        if (trackingMetadataT6 != null) {
            trackingMetadataA.a(trackingMetadataT6);
        }
        analyticsManager.j(googleAdBannerClick, trackingMetadataA);
        if (ctaUrl != null && ctaUrl.length() != 0) {
            sharedFlowImpl.f(new ContentPageContract.Actions.LaunchDeepLink(ctaUrl));
        } else if (targetId != null) {
            sharedFlowImpl.f(new ContentPageContract.Actions.LaunchProductListProductGroup(targetId, googleAdBannerCard.getTitle(), googleAdBannerCard.getTargetType()));
        }
    }

    public final void q6(Activities.ContentPage.ContentPageExtras extras) {
        Intrinsics.h(extras, "extras");
        this.t = extras;
        BuildersKt.c(ViewModelKt.a(this), null, null, new ContentPageViewModel$fetchContentPage$1(this, null), 3);
    }

    @Override // au.com.woolworths.product.tile.PromotionClickListener
    public final void r2(PromotionCard promotionCard, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        WatchlistInteractor watchlistInteractor = this.l;
        if (watchlistInteractor.c()) {
            this.q.f(ContentPageContract.Actions.LaunchWatchlistGuestOnboardingScreen.f6973a);
            return;
        }
        ProductCard productCard = promotionCard.getProductCard();
        String strB = watchlistInteractor.b();
        if (strB == null) {
            return;
        }
        boolean zT = ProductCardExtKt.t(productCard, ((ContentPageContract.ViewState) this.s.getValue()).m);
        String offerId = promotionCard.getOfferId();
        if (offerId == null) {
            offerId = "";
        }
        String description = androidx.constraintlayout.core.state.a.i(containerTitle, " - ", offerId, " - price_family_variants");
        MutableStateFlow mutableStateFlow = this.p;
        AnalyticsManager analyticsManager = this.j;
        if (zT) {
            ContentPageAnalytics.ContentPage contentPageS6 = s6();
            if (contentPageS6 != null) {
                ContentPageAnalytics.ContentPage.Action action = contentPageS6.h;
                action.getClass();
                Intrinsics.h(description, "description");
                analyticsManager.i(new ContentPageAnalytics$ContentPage$Action$removeFromWatchlist$1(action, description), ProductAnalyticsExtKt.h(productCard, null, null, 7));
            }
            watchlistInteractor.d(productCard);
            K6(this, mutableStateFlow, null, null, false, false, null, null, null, null, null, new ContentPageContract.Snackbar(new ResText(com.woolworths.R.string.watchlist_product_removed_snackbar_message), new d(this, description, productCard, 2)), false, false, 14335);
            return;
        }
        ContentPageAnalytics.ContentPage contentPageS62 = s6();
        if (contentPageS62 != null) {
            ContentPageAnalytics.ContentPage.Action action2 = contentPageS62.h;
            action2.getClass();
            Intrinsics.h(description, "description");
            analyticsManager.i(new ContentPageAnalytics$ContentPage$Action$addToWatchlist$1(action2, description), ProductAnalyticsExtKt.h(productCard, null, null, 7));
        }
        watchlistInteractor.a(productCard);
        K6(this, mutableStateFlow, null, null, false, false, null, null, null, null, null, new ContentPageContract.Snackbar(new ResText(com.woolworths.R.string.watchlist_product_added_snackbar_message), new ResText(com.woolworths.R.string.view_list), new e(this, strB, description, productCard, 1), new d(this, description, productCard, 3)), false, false, 14335);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [au.com.woolworths.feature.shop.contentpage.ContentPageViewModel$getAnalyticsScreen$1$1] */
    public final ContentPageViewModel$getAnalyticsScreen$1$1 r6() {
        final AnalyticsData analyticsData;
        ContentPageData contentPageData = ((ContentPageContract.ViewState) this.s.getValue()).f6982a;
        if (contentPageData == null || (analyticsData = contentPageData.b) == null || analyticsData.getScreenName() == null || analyticsData.getAppSection() == null) {
            return null;
        }
        return new Screen(analyticsData) { // from class: au.com.woolworths.feature.shop.contentpage.ContentPageViewModel$getAnalyticsScreen$1$1
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

    public final ContentPageAnalytics.ContentPage s6() {
        AnalyticsData analyticsData;
        AnalyticsData analyticsData2;
        AnalyticsData analyticsData3;
        AnalyticsData analyticsData4;
        StateFlow stateFlow = this.s;
        ContentPageData contentPageData = ((ContentPageContract.ViewState) stateFlow.getValue()).f6982a;
        String appSection = null;
        if (((contentPageData == null || (analyticsData4 = contentPageData.b) == null) ? null : analyticsData4.getScreenName()) == null) {
            return null;
        }
        ContentPageData contentPageData2 = ((ContentPageContract.ViewState) stateFlow.getValue()).f6982a;
        String screenName = (contentPageData2 == null || (analyticsData3 = contentPageData2.b) == null) ? null : analyticsData3.getScreenName();
        Intrinsics.e(screenName);
        ContentPageData contentPageData3 = ((ContentPageContract.ViewState) stateFlow.getValue()).f6982a;
        String screenType = (contentPageData3 == null || (analyticsData2 = contentPageData3.b) == null) ? null : analyticsData2.getScreenType();
        ContentPageData contentPageData4 = ((ContentPageContract.ViewState) stateFlow.getValue()).f6982a;
        if (contentPageData4 != null && (analyticsData = contentPageData4.b) != null) {
            appSection = analyticsData.getAppSection();
        }
        return new ContentPageAnalytics.ContentPage(screenName, screenType, appSection);
    }

    public final TrackingMetadata t6() {
        AnalyticsData analyticsData;
        ContentPageData contentPageData = ((ContentPageContract.ViewState) this.s.getValue()).f6982a;
        if (contentPageData != null && (analyticsData = contentPageData.b) != null) {
            String screenName = analyticsData.getScreenName();
            trackingMetadataA = screenName != null ? TrackingMetadata.Companion.a(TrackableValue.E2, screenName) : null;
            String screenType = analyticsData.getScreenType();
            if (screenType != null && trackingMetadataA != null) {
                trackingMetadataA.b(TrackableValue.F2, screenType);
            }
        }
        return trackingMetadataA;
    }

    public final AnalyticsData u6() {
        ContentPageData contentPageData = ((ContentPageContract.ViewState) this.p.getValue()).f6982a;
        if (contentPageData != null) {
            return contentPageData.b;
        }
        return null;
    }

    @Override // au.com.woolworths.product.tile.PromotionClickListener
    public final void v2(PromotionCard promotionCard, String containerTitle) {
        String buttonQuantity;
        String lowerCase;
        String buttonLabel;
        Intrinsics.h(containerTitle, "containerTitle");
        ProductCard productCard = promotionCard.getProductCard();
        AnalyticsData productCardAnalytics = productCard.getProductCardAnalytics();
        if (productCardAnalytics != null) {
            ProductTrolleyData trolley = productCard.getTrolley();
            if (trolley == null || (buttonQuantity = trolley.getButtonQuantity()) == null) {
                buttonQuantity = "0";
            }
            AnalyticsData analyticsDataE = AnalyticsDataKt.e(buttonQuantity, productCardAnalytics);
            ProductCardAnalytics.Carousel.Action.Companion companion = ProductCardAnalytics.Carousel.Action.d;
            ProductTrolleyData trolley2 = productCard.getTrolley();
            if (trolley2 == null || (buttonLabel = trolley2.getButtonLabel()) == null) {
                lowerCase = "";
            } else {
                lowerCase = buttonLabel.toLowerCase(Locale.ROOT);
                Intrinsics.g(lowerCase, "toLowerCase(...)");
            }
            companion.getClass();
            ProductCardAnalytics$Carousel$Action$Companion$addToCartClick$1 productCardAnalytics$Carousel$Action$Companion$addToCartClick$1A = ProductCardAnalytics.Carousel.Action.Companion.a(containerTitle, lowerCase);
            AnalyticsData analyticsDataU6 = u6();
            this.j.i(AnalyticsDataKt.b(AnalyticsDataKt.b(productCardAnalytics$Carousel$Action$Companion$addToCartClick$1A, analyticsDataU6 != null ? AnalyticsDataKt.c(analyticsDataU6, analyticsDataE, false) : null), promotionCard.getAnalytics()), ProductAnalyticsExtKt.h(productCard, null, null, 7));
        }
        this.q.f(new ContentPageContract.Actions.LaunchAddToCartBottomSheet(promotionCard.getProductCard()));
    }

    public final boolean v6() {
        Activities.ContentPage.ContentPageExtras contentPageExtras = this.t;
        if (contentPageExtras == null) {
            Intrinsics.p("contentPageExtra");
            throw null;
        }
        if (contentPageExtras.f != Activities.ContentPage.ContentPageType.s) {
            return false;
        }
        if (contentPageExtras != null) {
            return Intrinsics.c(contentPageExtras.d, "saved-recipes-app");
        }
        Intrinsics.p("contentPageExtra");
        throw null;
    }

    public final void w6(BroadcastBannerData broadcastBannerData) {
        Intrinsics.h(broadcastBannerData, "broadcastBannerData");
        ContentPageViewModel$getAnalyticsScreen$1$1 contentPageViewModel$getAnalyticsScreen$1$1R6 = r6();
        if (contentPageViewModel$getAnalyticsScreen$1$1R6 != null) {
            this.j.g(AnalyticsExtensionsKt.a(broadcastBannerData, contentPageViewModel$getAnalyticsScreen$1$1R6));
        }
        String deeplink = broadcastBannerData.getDeeplink();
        if (deeplink != null) {
            this.q.f(new ContentPageContract.Actions.LaunchDeepLink(deeplink));
        }
    }

    @Override // au.com.woolworths.product.tile.PromotionClickListener
    public final void x3(PromotionCard promotionCard, final String containerTitle) {
        String buttonQuantity;
        Intrinsics.h(containerTitle, "containerTitle");
        ProductCard productCard = promotionCard.getProductCard();
        AnalyticsData productCardAnalytics = productCard.getProductCardAnalytics();
        if (productCardAnalytics != null) {
            ProductTrolleyData trolley = productCard.getTrolley();
            if (trolley == null || (buttonQuantity = trolley.getButtonQuantity()) == null) {
                buttonQuantity = "0";
            }
            AnalyticsData analyticsDataE = AnalyticsDataKt.e(buttonQuantity, productCardAnalytics);
            ProductCardAnalytics.Carousel.Action.d.getClass();
            Event event = new Event(containerTitle) { // from class: au.com.woolworths.analytics.supers.products.ProductCardAnalytics$Carousel$Action$Companion$varietiesClick$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(ProductCardAnalytics.Carousel.e);
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    spreadBuilder.a(new Pair("event.Category", "link"));
                    androidx.constraintlayout.core.state.a.z("event.Description", YU.a.A("Carousel - ", containerTitle), spreadBuilder, "event.Label", "view varieties");
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
            };
            AnalyticsData analyticsDataU6 = u6();
            this.j.i(AnalyticsDataKt.b(AnalyticsDataKt.b(event, analyticsDataU6 != null ? AnalyticsDataKt.c(analyticsDataU6, analyticsDataE, false) : null), promotionCard.getAnalytics()), ProductAnalyticsExtKt.h(productCard, null, null, 7));
        }
        this.q.f(new ContentPageContract.Actions.LaunchPromotionDetails(promotionCard, containerTitle));
    }

    public final void x6(BroadcastBannerData broadcastBannerData) {
        Intrinsics.h(broadcastBannerData, "broadcastBannerData");
        String bannerId = broadcastBannerData.getBannerId();
        if (bannerId != null) {
            if (!Intrinsics.c(broadcastBannerData.getDismissible(), Boolean.TRUE)) {
                bannerId = null;
            }
            if (bannerId != null) {
                ContentPageViewModel$getAnalyticsScreen$1$1 contentPageViewModel$getAnalyticsScreen$1$1R6 = r6();
                if (contentPageViewModel$getAnalyticsScreen$1$1R6 != null) {
                    this.j.g(AnalyticsExtensionsKt.b(broadcastBannerData, contentPageViewModel$getAnalyticsScreen$1$1R6));
                }
                this.i.b(bannerId);
                K6(this, this.p, null, null, false, false, null, null, null, null, null, null, false, false, 16383);
            }
        }
    }

    public final void y6(DynamicSizeCardData data) {
        AnalyticsData analyticsDataG;
        Intrinsics.h(data, "data");
        boolean z = data instanceof GoogleAdBannerCard;
        AnalyticsManager analyticsManager = this.j;
        if (!z) {
            if (!(data instanceof ActionableCard) || (analyticsDataG = ((ActionableCard) data).getImpressionAnalytics()) == null) {
                return;
            }
            ContentPageData contentPageData = ((ContentPageContract.ViewState) this.s.getValue()).f6982a;
            analyticsManager.g(AnalyticsDataKt.a(AnalyticsDataKt.c(analyticsDataG, contentPageData != null ? contentPageData.b : null, false)));
            return;
        }
        GoogleAdBannerCard googleAdBannerCard = (GoogleAdBannerCard) data;
        BuildersKt.c(ViewModelKt.a(this), null, null, new ContentPageViewModel$onGoogleAdBannerImpression$1(this, googleAdBannerCard, null), 3);
        ContentPageActions.GoogleAdBannerImpression googleAdBannerImpression = ContentPageActions.GoogleAdBannerImpression.e;
        TrackingMetadata trackingMetadataA = GoogleAdBannerCardKt.a(googleAdBannerCard);
        TrackingMetadata trackingMetadataT6 = t6();
        if (trackingMetadataT6 != null) {
            trackingMetadataA.a(trackingMetadataT6);
        }
        analyticsManager.j(googleAdBannerImpression, trackingMetadataA);
    }

    public final void z6(EditorialBannerData bannerData) {
        String action;
        Intrinsics.h(bannerData, "bannerData");
        ActionData actionData = bannerData.i;
        ContentPageData contentPageData = ((ContentPageContract.ViewState) this.p.getValue()).f6982a;
        AnalyticsData analyticsData = contentPageData != null ? contentPageData.b : null;
        AnalyticsData analyticsData2 = bannerData.j;
        if (analyticsData2 != null) {
            this.j.g(AnalyticsDataKt.b(AnalyticsDataKt.b(AnalyticsDataKt.a(analyticsData2), analyticsData), actionData != null ? actionData.getAnalytics() : null));
        }
        if (actionData == null || (action = actionData.getAction()) == null) {
            return;
        }
        this.q.f(new ContentPageContract.Actions.LaunchDeepLink(action));
    }
}
