package au.com.woolworths.feature.rewards.offers.listpage.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.lifecycle.f;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.compose.utils.list.LazyListUniqueIdValidator;
import au.com.woolworths.compose.utils.list.UniqueIdValidator;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.rewards.offers.MandyBannerViewItem;
import au.com.woolworths.feature.rewards.offers.NoOffersCardViewItem;
import au.com.woolworths.feature.rewards.offers.OfferFeedInlineBannerViewItem;
import au.com.woolworths.feature.rewards.offers.OfferSectionViewItem;
import au.com.woolworths.feature.rewards.offers.PersonalisedOffersBannerViewItem;
import au.com.woolworths.feature.rewards.offers.RewardsCtaCardViewItem;
import au.com.woolworths.feature.rewards.offers.RewardsOfferBaseContract;
import au.com.woolworths.feature.rewards.offers.SectionViewItem;
import au.com.woolworths.feature.rewards.offers.SpinSurpriseBannerViewItem;
import au.com.woolworths.feature.rewards.offers.StandardBannerViewItem;
import au.com.woolworths.feature.rewards.offers.data.PersonalisedOffersStatus;
import au.com.woolworths.feature.rewards.offers.data.RewardsOfferFilterData;
import au.com.woolworths.feature.rewards.offers.data.RewardsOfferListPageFooter;
import au.com.woolworths.feature.rewards.offers.listpage.OfferListPageType;
import au.com.woolworths.feature.rewards.offers.listpage.OffersListPageContract;
import au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.RewardsBoostersListViewKt;
import au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection.OfferSectionViewKt;
import au.com.woolworths.feature.rewards.offers.ui.OfferFeedInlineBannerKt;
import au.com.woolworths.feature.rewards.offers.ui.RewardsCtaCardKt;
import au.com.woolworths.feature.rewards.offers.ui.SpinSurpriseBannerSectionKt;
import au.com.woolworths.feature.rewards.offers.ui.StandardBannerSectionKt;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.foundation.feature.analytics.list.ListItemsSeenEffectKt;
import au.com.woolworths.foundation.feature.analytics.list.ListItemsTrackerState;
import au.com.woolworths.foundation.feature.analytics.list.ListItemsTrackerStateKt;
import au.com.woolworths.foundation.rewards.common.ui.TigerBannerKt;
import au.com.woolworths.foundation.rewards.common.ui.TigerBannerStatus;
import au.com.woolworths.foundation.rewards.common.ui.banners.MandyBannerUiKt;
import au.com.woolworths.foundation.rewards.common.ui.banners.data.MandyBanner;
import au.com.woolworths.foundation.rewards.common.ui.emptystate.RewardsEmptyStateKt;
import au.com.woolworths.foundation.rewards.common.ui.emptystate.RewardsEmptyStateSpec;
import au.com.woolworths.shared.ui.compose.rewards.ContentCtaButtonKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/compose/utils/list/LazyListUniqueIdValidator;", "uniqueIdValidator", "offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OfferListPageContentKt {
    public static final void a(final OffersListPageContract.ViewState viewState, final OfferListPageType offerListPageType, final List content, RewardsOfferListPageFooter rewardsOfferListPageFooter, final LazyListState state, final Function1 onBannerClick, final Function1 onOfferSectionCtaClick, final Function1 onOfferClick, final Function1 activateOffer, final Function2 onOfferCtaButtonClick, final Function1 onFooterClick, final Function1 onItemSeen, final Function1 trackSpinSurpriseBannerImpression, final Function1 trackStandardBannerImpression, final Function0 onProductOffersSwipeStarted, final Function1 onProductOffersSwipeEnded, final RewardsOfferBaseContract.RewardsCtaCardListener rewardsCtaCardListener, final RewardsOfferBaseContract.OfferFeedInlineBannerListener offerFeedInlineBannerListener, final Modifier modifier, Composer composer, final int i) {
        Object obj;
        int i2;
        ComposerImpl composerImpl;
        ComposerImpl composerImpl2;
        RewardsOfferListPageFooter rewardsOfferListPageFooter2;
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(content, "content");
        Intrinsics.h(state, "state");
        Intrinsics.h(onBannerClick, "onBannerClick");
        Intrinsics.h(onOfferSectionCtaClick, "onOfferSectionCtaClick");
        Intrinsics.h(onOfferClick, "onOfferClick");
        Intrinsics.h(activateOffer, "activateOffer");
        Intrinsics.h(onOfferCtaButtonClick, "onOfferCtaButtonClick");
        Intrinsics.h(onFooterClick, "onFooterClick");
        Intrinsics.h(onItemSeen, "onItemSeen");
        Intrinsics.h(trackSpinSurpriseBannerImpression, "trackSpinSurpriseBannerImpression");
        Intrinsics.h(trackStandardBannerImpression, "trackStandardBannerImpression");
        Intrinsics.h(onProductOffersSwipeStarted, "onProductOffersSwipeStarted");
        Intrinsics.h(onProductOffersSwipeEnded, "onProductOffersSwipeEnded");
        Intrinsics.h(rewardsCtaCardListener, "rewardsCtaCardListener");
        Intrinsics.h(offerFeedInlineBannerListener, "offerFeedInlineBannerListener");
        ComposerImpl composerImplV = composer.v(-1130678184);
        int i3 = i | (composerImplV.I(viewState) ? 4 : 2) | (composerImplV.r(offerListPageType.ordinal()) ? 32 : 16) | (composerImplV.I(content) ? 256 : 128) | (composerImplV.I(rewardsOfferListPageFooter) ? 2048 : 1024) | (composerImplV.n(state) ? 16384 : 8192) | (composerImplV.I(onBannerClick) ? 131072 : 65536) | (composerImplV.I(onOfferSectionCtaClick) ? 1048576 : 524288) | (composerImplV.I(onOfferClick) ? 8388608 : 4194304) | (composerImplV.I(activateOffer) ? 67108864 : 33554432) | (composerImplV.I(onOfferCtaButtonClick) ? 536870912 : 268435456);
        int i4 = 100884480 | (composerImplV.I(onFooterClick) ? 4 : 2) | (composerImplV.I(onItemSeen) ? 32 : 16) | (composerImplV.I(trackSpinSurpriseBannerImpression) ? 256 : 128) | (composerImplV.I(trackStandardBannerImpression) ? 2048 : 1024) | (composerImplV.n(rewardsCtaCardListener) ? 1048576 : 524288) | (composerImplV.n(offerFeedInlineBannerListener) ? 8388608 : 4194304);
        if ((i3 & 306783379) == 306783378 && (38347923 & i4) == 38347922 && composerImplV.c()) {
            composerImplV.j();
            rewardsOfferListPageFooter2 = rewardsOfferListPageFooter;
            composerImpl2 = composerImplV;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                ReportOwner.Squad squad = ReportOwner.Squad.d;
                objG = SnapshotStateKt.f(new LazyListUniqueIdValidator("Rewards Offer List Page " + offerListPageType));
                composerImplV.A(objG);
            }
            final MutableState mutableState = (MutableState) objG;
            composerImplV.V(false);
            final ListItemsTrackerState listItemsTrackerStateA = ListItemsTrackerStateKt.a(state, onItemSeen, composerImplV, ((i3 >> 12) & 14) | ((i4 << 3) & 896));
            ListItemsSeenEffectKt.b(listItemsTrackerStateA, composerImplV, 0);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Modifier modifierA = ColumnScopeInstance.f948a.a(SizeKt.e(Modifier.Companion.d, 1.0f), 1.0f, true);
            composerImplV.o(-1224400529);
            boolean zI = composerImplV.I(content) | composerImplV.I(viewState) | ((i3 & 29360128) == 8388608) | ((i3 & 458752) == 131072) | ((i3 & 3670016) == 1048576) | ((i3 & 234881024) == 67108864) | ((i3 & 1879048192) == 536870912) | composerImplV.n(listItemsTrackerStateA) | ((i4 & 112) == 32) | ((i4 & 896) == 256) | ((i4 & 7168) == 2048) | ((3670016 & i4) == 1048576) | ((29360128 & i4) == 8388608);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                i2 = i4;
                obj = new Function1() { // from class: au.com.woolworths.feature.rewards.offers.listpage.ui.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        LazyListScope LazyColumn = (LazyListScope) obj2;
                        Intrinsics.h(LazyColumn, "$this$LazyColumn");
                        MutableState mutableState2 = mutableState;
                        ((LazyListUniqueIdValidator) mutableState2.getD()).b.clear();
                        for (SectionViewItem sectionViewItem : content) {
                            LazyListUniqueIdValidator lazyListUniqueIdValidator = (LazyListUniqueIdValidator) mutableState2.getD();
                            OffersListPageContract.ViewState viewState2 = viewState;
                            LazyColumn = LazyColumn;
                            OfferListPageContentKt.c(LazyColumn, sectionViewItem, null, null, lazyListUniqueIdValidator, onOfferClick, onBannerClick, onOfferSectionCtaClick, activateOffer, onOfferCtaButtonClick, listItemsTrackerStateA, onItemSeen, trackSpinSurpriseBannerImpression, trackStandardBannerImpression, onProductOffersSwipeStarted, onProductOffersSwipeEnded, rewardsCtaCardListener, offerFeedInlineBannerListener, viewState2.k.contains(sectionViewItem.getB()), viewState2.l);
                            mutableState2 = mutableState2;
                        }
                        return Unit.f24250a;
                    }
                };
                composerImpl = composerImplV;
                composerImpl.A(obj);
            } else {
                i2 = i4;
                obj = objG2;
                composerImpl = composerImplV;
            }
            composerImpl.V(false);
            ComposerImpl composerImpl3 = composerImpl;
            LazyDslKt.b(modifierA, state, null, false, null, null, null, false, null, (Function1) obj, composerImpl3, (i3 >> 9) & 112, 508);
            composerImpl2 = composerImpl3;
            composerImpl2.o(-1286940803);
            rewardsOfferListPageFooter2 = rewardsOfferListPageFooter;
            if (rewardsOfferListPageFooter2 != null) {
                b(rewardsOfferListPageFooter2.f6291a, rewardsOfferListPageFooter2.b, onFooterClick, null, composerImpl2, (i2 << 6) & 896);
            }
            composerImpl2.V(false);
            composerImpl2.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl2.X();
        if (recomposeScopeImplX != null) {
            final RewardsOfferListPageFooter rewardsOfferListPageFooter3 = rewardsOfferListPageFooter2;
            recomposeScopeImplX.d = new Function2(offerListPageType, content, rewardsOfferListPageFooter3, state, onBannerClick, onOfferSectionCtaClick, onOfferClick, activateOffer, onOfferCtaButtonClick, onFooterClick, onItemSeen, trackSpinSurpriseBannerImpression, trackStandardBannerImpression, onProductOffersSwipeStarted, onProductOffersSwipeEnded, rewardsCtaCardListener, offerFeedInlineBannerListener, modifier, i) { // from class: au.com.woolworths.feature.rewards.offers.listpage.ui.b
                public final /* synthetic */ OfferListPageType e;
                public final /* synthetic */ List f;
                public final /* synthetic */ RewardsOfferListPageFooter g;
                public final /* synthetic */ LazyListState h;
                public final /* synthetic */ Function1 i;
                public final /* synthetic */ Function1 j;
                public final /* synthetic */ Function1 k;
                public final /* synthetic */ Function1 l;
                public final /* synthetic */ Function2 m;
                public final /* synthetic */ Function1 n;
                public final /* synthetic */ Function1 o;
                public final /* synthetic */ Function1 p;
                public final /* synthetic */ Function1 q;
                public final /* synthetic */ Function0 r;
                public final /* synthetic */ Function1 s;
                public final /* synthetic */ RewardsOfferBaseContract.RewardsCtaCardListener t;
                public final /* synthetic */ RewardsOfferBaseContract.OfferFeedInlineBannerListener u;
                public final /* synthetic */ Modifier v;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    OfferListPageContentKt.a(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, (Composer) obj2, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(String str, ContentCta contentCta, Function1 onClick, Modifier modifier, Composer composer, int i) {
        int i2;
        int i3;
        float f;
        Modifier modifier2;
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(-640859393);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(contentCta) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onClick) ? 256 : 128;
        }
        int i4 = i2 | 3072;
        if ((i4 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            long jA = WxTheme.a(composerImplV).a();
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierB = BackgroundKt.b(companion, jA, rectangleShapeKt$RectangleShape$1);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composerImplV, 48);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 6, 6, 0L, composerImplV, SizeKt.e(companion, 1.0f));
            composerImplV = composerImplV;
            float f2 = 8;
            SpacerKt.a(composerImplV, SizeKt.g(companion, f2));
            composerImplV.o(1206872110);
            if (str == null) {
                i3 = i4;
                f = f2;
                modifier2 = companion;
            } else {
                i3 = i4;
                TextKt.b(str, PaddingKt.h(companion, 24, BitmapDescriptorFactory.HUE_RED, 2), WxTheme.a(composerImplV).c(), 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).p, composerImplV, 48, 0, 65016);
                composerImplV = composerImplV;
                f = f2;
                modifier2 = companion;
                SpacerKt.a(composerImplV, SizeKt.g(modifier2, f));
            }
            composerImplV.V(false);
            composerImplV.o(1206883791);
            ContentCtaButtonKt.c(contentCta, onClick, PaddingKt.h(SizeKt.e(modifier2, 1.0f), 24, BitmapDescriptorFactory.HUE_RED, 2), false, composerImplV, ((i3 >> 3) & 112) | KyberEngine.KyberPolyBytes, 8);
            SpacerKt.a(composerImplV, SizeKt.g(modifier2, f));
            composerImplV.V(false);
            SpacerKt.a(composerImplV, SizeKt.g(modifier2, f));
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.d(str, contentCta, onClick, modifier2, i, 8);
        }
    }

    public static final void c(LazyListScope lazyListScope, final SectionViewItem sectionViewItem, List list, RewardsOfferFilterData rewardsOfferFilterData, UniqueIdValidator uniqueIdValidator, Function1 onOfferClick, final Function1 onBannerClick, Function1 onOfferSectionCtaClick, Function1 activateOffer, Function2 onOfferCtaButtonClick, ListItemsTrackerState listItemsTrackerState, Function1 onItemSeen, final Function1 trackSpinSurpriseBannerImpression, final Function1 trackStandardBannerImpression, Function0 onProductOffersSwipeStarted, Function1 onProductOffersSwipeEnded, final RewardsOfferBaseContract.RewardsCtaCardListener rewardsCtaCardListener, final RewardsOfferBaseContract.OfferFeedInlineBannerListener offerFeedInlineBannerListener, final boolean z, boolean z2) {
        Intrinsics.h(lazyListScope, "<this>");
        Intrinsics.h(uniqueIdValidator, "uniqueIdValidator");
        Intrinsics.h(onOfferClick, "onOfferClick");
        Intrinsics.h(onBannerClick, "onBannerClick");
        Intrinsics.h(onOfferSectionCtaClick, "onOfferSectionCtaClick");
        Intrinsics.h(activateOffer, "activateOffer");
        Intrinsics.h(onOfferCtaButtonClick, "onOfferCtaButtonClick");
        Intrinsics.h(onItemSeen, "onItemSeen");
        Intrinsics.h(trackSpinSurpriseBannerImpression, "trackSpinSurpriseBannerImpression");
        Intrinsics.h(trackStandardBannerImpression, "trackStandardBannerImpression");
        Intrinsics.h(onProductOffersSwipeStarted, "onProductOffersSwipeStarted");
        Intrinsics.h(onProductOffersSwipeEnded, "onProductOffersSwipeEnded");
        Intrinsics.h(rewardsCtaCardListener, "rewardsCtaCardListener");
        Intrinsics.h(offerFeedInlineBannerListener, "offerFeedInlineBannerListener");
        if (sectionViewItem instanceof StandardBannerViewItem) {
            if (list == null || RewardsBoostersListViewKt.d(((StandardBannerViewItem) sectionViewItem).b, list)) {
                LazyListScope.i(lazyListScope, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.listpage.ui.OfferListPageContentKt$sectionViewItemUi$1
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        LazyItemScope item = (LazyItemScope) obj;
                        Composer composer = (Composer) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Intrinsics.h(item, "$this$item");
                        if ((iIntValue & 17) == 16 && composer.c()) {
                            composer.j();
                        } else {
                            StandardBannerSectionKt.a((StandardBannerViewItem) sectionViewItem, onBannerClick, trackStandardBannerImpression, composer, 0);
                        }
                        return Unit.f24250a;
                    }
                }, true, 1040543393), 3);
                return;
            }
            return;
        }
        if (sectionViewItem instanceof SpinSurpriseBannerViewItem) {
            LazyListScope.i(lazyListScope, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.listpage.ui.OfferListPageContentKt$sectionViewItemUi$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    LazyItemScope item = (LazyItemScope) obj;
                    Composer composer = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(item, "$this$item");
                    if ((iIntValue & 17) == 16 && composer.c()) {
                        composer.j();
                    } else {
                        SpinSurpriseBannerSectionKt.a((SpinSurpriseBannerViewItem) sectionViewItem, onBannerClick, trackSpinSurpriseBannerImpression, composer, 0);
                    }
                    return Unit.f24250a;
                }
            }, true, -1044291537), 3);
            return;
        }
        if (sectionViewItem instanceof PersonalisedOffersBannerViewItem) {
            LazyListScope.i(lazyListScope, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.listpage.ui.OfferListPageContentKt$sectionViewItemUi$3

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    static {
                        int[] iArr = new int[PersonalisedOffersStatus.values().length];
                        try {
                            iArr[0] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            PersonalisedOffersStatus personalisedOffersStatus = PersonalisedOffersStatus.d;
                            iArr[1] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            PersonalisedOffersStatus personalisedOffersStatus2 = PersonalisedOffersStatus.d;
                            iArr[2] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    TigerBannerStatus tigerBannerStatus;
                    LazyItemScope item = (LazyItemScope) obj;
                    Composer composer = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(item, "$this$item");
                    if ((iIntValue & 17) == 16 && composer.c()) {
                        composer.j();
                    } else {
                        SectionViewItem sectionViewItem2 = sectionViewItem;
                        PersonalisedOffersBannerViewItem personalisedOffersBannerViewItem = (PersonalisedOffersBannerViewItem) sectionViewItem2;
                        int iOrdinal = personalisedOffersBannerViewItem.f.ordinal();
                        if (iOrdinal == 0) {
                            tigerBannerStatus = TigerBannerStatus.d;
                        } else if (iOrdinal == 1) {
                            tigerBannerStatus = TigerBannerStatus.e;
                        } else {
                            if (iOrdinal != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            tigerBannerStatus = TigerBannerStatus.f;
                        }
                        String str = personalisedOffersBannerViewItem.c;
                        String str2 = personalisedOffersBannerViewItem.d;
                        String str3 = personalisedOffersBannerViewItem.e;
                        Modifier modifierG = PaddingKt.g(Modifier.Companion.d, 16, 8);
                        composer.o(1849434622);
                        Object objG = composer.G();
                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                        if (objG == composer$Companion$Empty$1) {
                            objG = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui.b(25);
                            composer.A(objG);
                        }
                        composer.l();
                        Modifier modifierB = SemanticsModifierKt.b(modifierG, false, (Function1) objG);
                        composer.o(-1633490746);
                        Function1 function1 = onBannerClick;
                        boolean zN = composer.n(function1) | composer.n(sectionViewItem2);
                        Object objG2 = composer.G();
                        if (zN || objG2 == composer$Companion$Empty$1) {
                            objG2 = new au.com.woolworths.feature.rewards.card.overlay.ui.b(10, function1, sectionViewItem2);
                            composer.A(objG2);
                        }
                        composer.l();
                        TigerBannerKt.c(tigerBannerStatus, str, str2, str3, modifierB, (Function0) objG2, composer, 0);
                    }
                    return Unit.f24250a;
                }
            }, true, 2065600590), 3);
            return;
        }
        if (sectionViewItem instanceof OfferFeedInlineBannerViewItem) {
            LazyListScope.i(lazyListScope, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.listpage.ui.OfferListPageContentKt$sectionViewItemUi$4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    LazyItemScope item = (LazyItemScope) obj;
                    Composer composer = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(item, "$this$item");
                    if ((iIntValue & 17) == 16 && composer.c()) {
                        composer.j();
                    } else {
                        OfferFeedInlineBannerViewItem offerFeedInlineBannerViewItem = (OfferFeedInlineBannerViewItem) sectionViewItem;
                        RewardsOfferBaseContract.OfferFeedInlineBannerListener offerFeedInlineBannerListener2 = offerFeedInlineBannerListener;
                        OfferFeedInlineBannerKt.c(offerFeedInlineBannerViewItem, z, offerFeedInlineBannerListener2.f6238a, offerFeedInlineBannerListener2.b, offerFeedInlineBannerListener2.c, PaddingKt.g(Modifier.Companion.d, 16, 8), composer, 196608);
                    }
                    return Unit.f24250a;
                }
            }, true, 880525421), 3);
            return;
        }
        if (sectionViewItem instanceof RewardsCtaCardViewItem) {
            LazyListScope.i(lazyListScope, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.listpage.ui.OfferListPageContentKt$sectionViewItemUi$5
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    LazyItemScope item = (LazyItemScope) obj;
                    Composer composer = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(item, "$this$item");
                    if ((iIntValue & 17) == 16 && composer.c()) {
                        composer.j();
                    } else {
                        SectionViewItem sectionViewItem2 = sectionViewItem;
                        RewardsCtaCardViewItem rewardsCtaCardViewItem = (RewardsCtaCardViewItem) sectionViewItem2;
                        composer.o(-1633490746);
                        RewardsOfferBaseContract.RewardsCtaCardListener rewardsCtaCardListener2 = rewardsCtaCardListener;
                        boolean zN = composer.n(rewardsCtaCardListener2) | composer.n(sectionViewItem2);
                        Object objG = composer.G();
                        if (zN || objG == Composer.Companion.f1624a) {
                            objG = new au.com.woolworths.feature.rewards.card.overlay.ui.b(11, rewardsCtaCardListener2, sectionViewItem2);
                            composer.A(objG);
                        }
                        composer.l();
                        RewardsCtaCardKt.a(rewardsCtaCardViewItem, (Function0) objG, PaddingKt.j(PaddingKt.h(Modifier.Companion.d, 16, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 2, 7), composer, KyberEngine.KyberPolyBytes);
                    }
                    return Unit.f24250a;
                }
            }, true, -304549748), 3);
            return;
        }
        if (sectionViewItem instanceof OfferSectionViewItem) {
            OfferSectionViewKt.b(lazyListScope, rewardsOfferFilterData, (OfferSectionViewItem) sectionViewItem, onOfferSectionCtaClick, onOfferClick, activateOffer, onOfferCtaButtonClick, listItemsTrackerState, uniqueIdValidator, new au.com.woolworths.design.wx.component.searchbar.a(10, onItemSeen), onProductOffersSwipeStarted, onProductOffersSwipeEnded, z2);
        } else if (sectionViewItem instanceof MandyBannerViewItem) {
            LazyListScope.i(lazyListScope, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.listpage.ui.OfferListPageContentKt$sectionViewItemUi$7
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    LazyItemScope item = (LazyItemScope) obj;
                    Composer composer = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(item, "$this$item");
                    if ((iIntValue & 17) == 16 && composer.c()) {
                        composer.j();
                    } else {
                        Object obj4 = sectionViewItem;
                        MandyBannerViewItem mandyBannerViewItem = (MandyBannerViewItem) obj4;
                        MandyBanner mandyBanner = new MandyBanner(mandyBannerViewItem.c, mandyBannerViewItem.d, mandyBannerViewItem.e, mandyBannerViewItem.f, mandyBannerViewItem.g);
                        composer.o(-1633490746);
                        Function1 function1 = onBannerClick;
                        boolean zN = composer.n(function1) | composer.n(obj4);
                        Object objG = composer.G();
                        if (zN || objG == Composer.Companion.f1624a) {
                            objG = new f(15, obj4, function1);
                            composer.A(objG);
                        }
                        composer.l();
                        float f = 16;
                        MandyBannerUiKt.a(mandyBanner, (Function1) objG, PaddingKt.g(Modifier.Companion.d, f, f), composer, KyberEngine.KyberPolyBytes, 0);
                    }
                    return Unit.f24250a;
                }
            }, true, 1620267210), 3);
        } else {
            if (!(sectionViewItem instanceof NoOffersCardViewItem)) {
                throw new NoWhenBranchMatchedException();
            }
            LazyListScope.i(lazyListScope, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.listpage.ui.OfferListPageContentKt$sectionViewItemUi$8
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    LazyItemScope item = (LazyItemScope) obj;
                    Composer composer = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(item, "$this$item");
                    if ((iIntValue & 17) == 16 && composer.c()) {
                        composer.j();
                    } else {
                        NoOffersCardViewItem noOffersCardViewItem = (NoOffersCardViewItem) sectionViewItem;
                        RewardsEmptyStateKt.a(RewardsEmptyStateSpec.Companion.a(noOffersCardViewItem.c, noOffersCardViewItem.d, noOffersCardViewItem.e, null, null, 242), null, null, composer, 0, 6);
                    }
                    return Unit.f24250a;
                }
            }, true, 435192041), 3);
        }
    }
}
