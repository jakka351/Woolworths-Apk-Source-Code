package au.com.woolworths.feature.rewards.offers.points.ui.boosterlist;

import android.content.Context;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.f;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.compose.utils.effect.ChangedEffectKt;
import au.com.woolworths.compose.utils.list.LazyListUniqueIdValidator;
import au.com.woolworths.feature.rewards.offers.RewardsOfferBaseContract;
import au.com.woolworths.feature.rewards.offers.data.BannerSectionConfig;
import au.com.woolworths.feature.rewards.offers.data.BoostersHeaderAddOn;
import au.com.woolworths.feature.rewards.offers.data.RewardsErrorDialog;
import au.com.woolworths.feature.rewards.offers.data.RewardsOfferFilterData;
import au.com.woolworths.feature.rewards.offers.data.RewardsOffersHeader;
import au.com.woolworths.feature.rewards.offers.data.RewardsSummaryContent;
import au.com.woolworths.feature.rewards.offers.data.RewardsSummaryCta;
import au.com.woolworths.feature.rewards.offers.data.RewardsSummaryText;
import au.com.woolworths.feature.rewards.offers.points.RewardsPointsContract;
import au.com.woolworths.feature.rewards.offers.points.RewardsPointsContractKt;
import au.com.woolworths.feature.rewards.offers.points.ui.RewardsErrorDialogUiKt;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.foundation.feature.analytics.list.ListItemsSeenEffectKt;
import au.com.woolworths.foundation.feature.analytics.list.ListItemsTrackerState;
import au.com.woolworths.foundation.feature.analytics.list.ListItemsTrackerStateKt;
import au.com.woolworths.foundation.rewards.onboarding.ui.OnboardingCoachMarkKt;
import au.com.woolworths.rewards.base.coachmark.data.HomeCoachMarkElement;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"", "foundTheEndAt", "Lau/com/woolworths/compose/utils/list/LazyListUniqueIdValidator;", "uniqueIdValidator", "offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsBoostersListViewKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Region.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Region.Companion companion = Region.h;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final void a(RewardsPointsContract.ViewState viewState, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(255390205);
        int i3 = i | (composerImplV.I(viewState) ? 4 : 2) | (composerImplV.I(function1) ? 32 : 16);
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            RewardsOffersHeader rewardsOffersHeader = viewState.g;
            composerImplV.o(616857857);
            BoostersHeaderAddOn cta = null;
            if (rewardsOffersHeader == null) {
                int iOrdinal = viewState.k.ordinal();
                if (iOrdinal == 0) {
                    i2 = R.string.rewards_boosters_tab_points_uplift;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = R.string.rewards_boosters_tab_points_nz;
                }
                String string = ((Context) composerImplV.x(AndroidCompositionLocals_androidKt.b)).getString(i2);
                Intrinsics.g(string, "getString(...)");
                rewardsOffersHeader = new RewardsOffersHeader(string, null);
            }
            composerImplV.V(false);
            RewardsSummaryContent rewardsSummaryContent = rewardsOffersHeader.b;
            RewardsSummaryCta rewardsSummaryCta = rewardsSummaryContent instanceof RewardsSummaryCta ? (RewardsSummaryCta) rewardsSummaryContent : null;
            ContentCta contentCta = rewardsSummaryCta != null ? rewardsSummaryCta.f6295a : null;
            String str = rewardsOffersHeader.f6293a;
            if (rewardsSummaryContent != null) {
                if (rewardsSummaryContent instanceof RewardsSummaryText) {
                    cta = new BoostersHeaderAddOn.Text(((RewardsSummaryText) rewardsSummaryContent).f6296a);
                } else {
                    if (!(rewardsSummaryContent instanceof RewardsSummaryCta)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ContentCta contentCta2 = ((RewardsSummaryCta) rewardsSummaryContent).f6295a;
                    String label = contentCta2.getLabel();
                    String url = contentCta2.getUrl();
                    if (url == null) {
                        url = "";
                    }
                    cta = new BoostersHeaderAddOn.Cta(label, url);
                }
            }
            composerImplV.o(-1633490746);
            boolean zI = composerImplV.I(contentCta) | ((i3 & 112) == 32);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new f(16, (Object) contentCta, (Object) function1);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            BoostersHeaderUiKt.a(str, modifier, (Function1) objG, cta, composerImplV, 48);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.internal.a(viewState, function1, modifier, i, 8);
        }
    }

    public static final void b(final boolean z, final RewardsPointsContract.ViewState viewState, final Function1 onBannerClick, final Function1 onOfferSectionCtaClick, final Function1 onOfferClick, final Function1 activateOffer, final Function2 onOfferCtaButtonClick, final Function1 fixedSizeCallback, final Function1 onFoundTheEnd, final Function1 onItemSeen, final Function1 trackSpinSurpriseBannerImpression, final Function1 trackStandardBannerImpression, final Function0 onProductOffersSwipeStarted, final Function1 onProductOffersSwipeEnded, final Function1 onSelectedFilterChanged, Function2 onErrorDialogCtaClicked, final Function0 onErrorDialogDismiss, final Function1 onHeaderCtaClicked, final RewardsOfferBaseContract.OfferFeedInlineBannerListener offerFeedInlineBannerListener, final RewardsOfferBaseContract.RewardsCtaCardListener rewardsCtaCardListener, final Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        final Function1 function1;
        int i6;
        RewardsPointsContract.ViewState viewState2;
        ComposerImpl composerImpl;
        Function2 function2;
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(onBannerClick, "onBannerClick");
        Intrinsics.h(onOfferSectionCtaClick, "onOfferSectionCtaClick");
        Intrinsics.h(onOfferClick, "onOfferClick");
        Intrinsics.h(activateOffer, "activateOffer");
        Intrinsics.h(onOfferCtaButtonClick, "onOfferCtaButtonClick");
        Intrinsics.h(fixedSizeCallback, "fixedSizeCallback");
        Intrinsics.h(onFoundTheEnd, "onFoundTheEnd");
        Intrinsics.h(onItemSeen, "onItemSeen");
        Intrinsics.h(trackSpinSurpriseBannerImpression, "trackSpinSurpriseBannerImpression");
        Intrinsics.h(trackStandardBannerImpression, "trackStandardBannerImpression");
        Intrinsics.h(onProductOffersSwipeStarted, "onProductOffersSwipeStarted");
        Intrinsics.h(onProductOffersSwipeEnded, "onProductOffersSwipeEnded");
        Intrinsics.h(onSelectedFilterChanged, "onSelectedFilterChanged");
        Intrinsics.h(onErrorDialogCtaClicked, "onErrorDialogCtaClicked");
        Intrinsics.h(onErrorDialogDismiss, "onErrorDialogDismiss");
        Intrinsics.h(onHeaderCtaClicked, "onHeaderCtaClicked");
        Intrinsics.h(offerFeedInlineBannerListener, "offerFeedInlineBannerListener");
        Intrinsics.h(rewardsCtaCardListener, "rewardsCtaCardListener");
        ComposerImpl composerImplV = composer.v(-1237620033);
        if ((i & 6) == 0) {
            i4 = i | (composerImplV.p(true) ? 4 : 2);
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= composerImplV.I(viewState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= composerImplV.I(onBannerClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= composerImplV.I(onOfferSectionCtaClick) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i4 |= composerImplV.I(onOfferClick) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= composerImplV.I(activateOffer) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= composerImplV.I(onOfferCtaButtonClick) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= composerImplV.I(fixedSizeCallback) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= composerImplV.I(onFoundTheEnd) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (composerImplV.I(onItemSeen) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= composerImplV.I(trackSpinSurpriseBannerImpression) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i5 |= composerImplV.I(trackStandardBannerImpression) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= composerImplV.I(onProductOffersSwipeStarted) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= composerImplV.I(onProductOffersSwipeEnded) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            function1 = onSelectedFilterChanged;
            i5 |= composerImplV.I(function1) ? 131072 : 65536;
        } else {
            function1 = onSelectedFilterChanged;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= composerImplV.I(onErrorDialogCtaClicked) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= composerImplV.I(onErrorDialogDismiss) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= composerImplV.I(onHeaderCtaClicked) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 |= composerImplV.n(offerFeedInlineBannerListener) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i6 = i3 | (composerImplV.n(rewardsCtaCardListener) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i4 & 306783379) == 306783378 && (i5 & 306783379) == 306783378 && (i6 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            function2 = onErrorDialogCtaClicked;
            viewState2 = viewState;
            composerImpl = composerImplV;
        } else {
            viewState2 = viewState;
            composerImpl = composerImplV;
            OnboardingCoachMarkKt.a(HomeCoachMarkElement.OfferList.INSTANCE.getId(), null, ComposableLambdaKt.c(-975545858, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.RewardsBoostersListViewKt$RewardsBoostersListView$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        composer2.o(1557096434);
                        RewardsBoostersListViewKt.c(z, viewState, onBannerClick, onOfferSectionCtaClick, onOfferClick, activateOffer, onOfferCtaButtonClick, fixedSizeCallback, onFoundTheEnd, onItemSeen, trackSpinSurpriseBannerImpression, trackStandardBannerImpression, onProductOffersSwipeStarted, onProductOffersSwipeEnded, function1, offerFeedInlineBannerListener, rewardsCtaCardListener, modifier, composer2, 0);
                        composer2.l();
                    }
                    return Unit.f24250a;
                }
            }, composerImpl), composerImpl, KyberEngine.KyberPolyBytes);
            RewardsErrorDialog rewardsErrorDialog = viewState2.d;
            if (rewardsErrorDialog == null) {
                function2 = onErrorDialogCtaClicked;
            } else {
                composerImpl.o(-1633490746);
                boolean zI = ((i5 & 3670016) == 1048576) | composerImpl.I(rewardsErrorDialog);
                Object objG = composerImpl.G();
                if (zI || objG == Composer.Companion.f1624a) {
                    function2 = onErrorDialogCtaClicked;
                    objG = new f(17, function2, rewardsErrorDialog);
                    composerImpl.A(objG);
                } else {
                    function2 = onErrorDialogCtaClicked;
                }
                composerImpl.V(false);
                RewardsErrorDialogUiKt.a(rewardsErrorDialog, (Function1) objG, onErrorDialogDismiss, null, composerImpl, (i5 >> 15) & 896);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            final RewardsPointsContract.ViewState viewState3 = viewState2;
            final Function2 function22 = function2;
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    int iA2 = RecomposeScopeImplKt.a(i2);
                    int iA3 = RecomposeScopeImplKt.a(i3);
                    RewardsBoostersListViewKt.b(z, viewState3, onBannerClick, onOfferSectionCtaClick, onOfferClick, activateOffer, onOfferCtaButtonClick, fixedSizeCallback, onFoundTheEnd, onItemSeen, trackSpinSurpriseBannerImpression, trackStandardBannerImpression, onProductOffersSwipeStarted, onProductOffersSwipeEnded, onSelectedFilterChanged, function22, onErrorDialogDismiss, onHeaderCtaClicked, offerFeedInlineBannerListener, rewardsCtaCardListener, modifier, (Composer) obj, iA, iA2, iA3);
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    public static final void c(final boolean z, final RewardsPointsContract.ViewState viewState, final Function1 onBannerClick, final Function1 onOfferSectionCtaClick, final Function1 onOfferClick, final Function1 activateOffer, final Function2 onOfferCtaButtonClick, Function1 fixedSizeCallback, Function1 onFoundTheEnd, final Function1 onItemSeen, final Function1 trackSpinSurpriseBannerImpression, final Function1 trackStandardBannerImpression, final Function0 onProductOffersSwipeStarted, final Function1 onProductOffersSwipeEnded, final Function1 onSelectedFilterChanged, final RewardsOfferBaseContract.OfferFeedInlineBannerListener offerFeedInlineBannerListener, final RewardsOfferBaseContract.RewardsCtaCardListener rewardsCtaCardListener, final Modifier modifier, Composer composer, final int i) {
        List list;
        ArrayList arrayList;
        int i2;
        int i3;
        Object obj;
        MutableState mutableState;
        ComposerImpl composerImpl;
        final Function1 function1;
        Continuation continuation;
        final Function1 function12;
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(onBannerClick, "onBannerClick");
        Intrinsics.h(onOfferSectionCtaClick, "onOfferSectionCtaClick");
        Intrinsics.h(onOfferClick, "onOfferClick");
        Intrinsics.h(activateOffer, "activateOffer");
        Intrinsics.h(onOfferCtaButtonClick, "onOfferCtaButtonClick");
        Intrinsics.h(fixedSizeCallback, "fixedSizeCallback");
        Intrinsics.h(onFoundTheEnd, "onFoundTheEnd");
        Intrinsics.h(onItemSeen, "onItemSeen");
        Intrinsics.h(trackSpinSurpriseBannerImpression, "trackSpinSurpriseBannerImpression");
        Intrinsics.h(trackStandardBannerImpression, "trackStandardBannerImpression");
        Intrinsics.h(onProductOffersSwipeStarted, "onProductOffersSwipeStarted");
        Intrinsics.h(onProductOffersSwipeEnded, "onProductOffersSwipeEnded");
        Intrinsics.h(onSelectedFilterChanged, "onSelectedFilterChanged");
        Intrinsics.h(offerFeedInlineBannerListener, "offerFeedInlineBannerListener");
        Intrinsics.h(rewardsCtaCardListener, "rewardsCtaCardListener");
        ComposerImpl composerImplV = composer.v(1970366674);
        int i4 = i | (composerImplV.p(z) ? 4 : 2) | (composerImplV.I(viewState) ? 32 : 16) | (composerImplV.I(onBannerClick) ? 256 : 128) | (composerImplV.I(onOfferSectionCtaClick) ? 2048 : 1024) | (composerImplV.I(onOfferClick) ? 16384 : 8192) | (composerImplV.I(activateOffer) ? 131072 : 65536) | (composerImplV.I(onOfferCtaButtonClick) ? 1048576 : 524288) | (composerImplV.I(fixedSizeCallback) ? 8388608 : 4194304) | (composerImplV.I(onFoundTheEnd) ? 67108864 : 33554432) | (composerImplV.I(onItemSeen) ? 536870912 : 268435456);
        int i5 = (composerImplV.I(trackSpinSurpriseBannerImpression) ? 4 : 2) | (composerImplV.I(trackStandardBannerImpression) ? 32 : 16) | (composerImplV.I(onProductOffersSwipeStarted) ? 256 : 128) | (composerImplV.I(onProductOffersSwipeEnded) ? 2048 : 1024) | (composerImplV.I(onSelectedFilterChanged) ? 16384 : 8192) | (composerImplV.n(offerFeedInlineBannerListener) ? 131072 : 65536) | (composerImplV.n(rewardsCtaCardListener) ? 1048576 : 524288) | (composerImplV.n(modifier) ? 8388608 : 4194304);
        if ((i4 & 306783379) == 306783378 && (4793491 & i5) == 4793490 && composerImplV.c()) {
            composerImplV.j();
            function12 = onFoundTheEnd;
            composerImpl = composerImplV;
            function1 = fixedSizeCallback;
        } else {
            List list2 = viewState.e;
            EmptyList emptyList = EmptyList.d;
            if (list2 == null) {
                list2 = emptyList;
                list = list2;
            } else {
                list = emptyList;
            }
            final RewardsOfferFilterData rewardsOfferFilterData = viewState.i;
            final ArrayList arrayList2 = viewState.m;
            final boolean z2 = viewState.n;
            final ?? r6 = viewState.o;
            RewardsOfferFilterData rewardsOfferFilterData2 = viewState.i;
            if (rewardsOfferFilterData2 != null) {
                Iterable iterable = (Iterable) rewardsOfferFilterData2.f;
                arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    Iterator it2 = it;
                    Object next = it2.next();
                    if (next instanceof BannerSectionConfig) {
                        arrayList.add(next);
                    }
                    it = it2;
                }
            } else {
                arrayList = null;
            }
            final List list3 = arrayList == null ? list : arrayList;
            LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composerImplV);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Object obj2 = Composer.Companion.f1624a;
            if (objG == obj2) {
                objG = SnapshotStateKt.f(0);
                composerImplV.A(objG);
            }
            final MutableState mutableState2 = (MutableState) objG;
            composerImplV.V(false);
            Integer numValueOf = Integer.valueOf(RewardsPointsContractKt.a(viewState));
            composerImplV.o(5004770);
            boolean zN = composerImplV.n(lazyListStateA);
            Object objG2 = composerImplV.G();
            if (zN || objG2 == obj2) {
                objG2 = new RewardsBoostersListViewKt$RewardsBoostersListViewContentShopVariant$1$1(lazyListStateA, null);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, numValueOf, (Function2) objG2);
            composerImplV.o(1849434622);
            Object objG3 = composerImplV.G();
            if (objG3 == obj2) {
                ReportOwner.Squad squad = ReportOwner.Squad.d;
                objG3 = SnapshotStateKt.f(new LazyListUniqueIdValidator("Rewards Booster List"));
                composerImplV.A(objG3);
            }
            final MutableState mutableState3 = (MutableState) objG3;
            composerImplV.V(false);
            final ListItemsTrackerState listItemsTrackerStateA = ListItemsTrackerStateKt.a(lazyListStateA, onItemSeen, composerImplV, (i4 >> 21) & 896);
            ListItemsSeenEffectKt.b(listItemsTrackerStateA, composerImplV, 0);
            composerImplV.o(-1224400529);
            final LazyListState lazyListState = lazyListStateA;
            boolean zN2 = ((i4 & 14) == 4) | composerImplV.n(lazyListStateA) | composerImplV.I(viewState) | ((i5 & 57344) == 16384) | composerImplV.I(rewardsOfferFilterData) | composerImplV.I(list2) | composerImplV.I(list3) | ((i4 & 57344) == 16384) | ((i4 & 896) == 256) | ((i4 & 7168) == 2048) | ((i4 & 458752) == 131072) | ((i4 & 3670016) == 1048576) | composerImplV.n(listItemsTrackerStateA) | ((1879048192 & i4) == 536870912) | ((i5 & 14) == 4) | ((i5 & 112) == 32) | ((i5 & 896) == 256) | ((i5 & 7168) == 2048) | ((i5 & 3670016) == 1048576) | ((i5 & 458752) == 131072) | composerImplV.I(arrayList2) | composerImplV.I(r6) | composerImplV.p(z2);
            Object objG4 = composerImplV.G();
            if (zN2 || objG4 == obj2) {
                final List list4 = list2;
                i2 = i5;
                i3 = i4;
                obj = obj2;
                Function1 function13 = new Function1() { // from class: au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.a
                    /* JADX WARN: Removed duplicated region for block: B:29:0x0134 A[LOOP:9: B:27:0x012e->B:29:0x0134, LOOP_END] */
                    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
                    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.List] */
                    @Override // kotlin.jvm.functions.Function1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invoke(java.lang.Object r27) {
                        /*
                            Method dump skipped, instructions count: 719
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.a.invoke(java.lang.Object):java.lang.Object");
                    }
                };
                lazyListState = lazyListState;
                mutableState = mutableState2;
                composerImpl = composerImplV;
                composerImpl.A(function13);
                objG4 = function13;
            } else {
                i3 = i4;
                i2 = i5;
                composerImpl = composerImplV;
                obj = obj2;
                mutableState = mutableState2;
            }
            composerImpl.V(false);
            LazyDslKt.b(modifier, lazyListState, null, false, null, null, null, false, null, (Function1) objG4, composerImpl, (i2 >> 21) & 14, 508);
            composerImpl.o(5004770);
            boolean z3 = (i3 & 29360128) == 8388608;
            Object objG5 = composerImpl.G();
            Object obj3 = obj;
            if (z3 || objG5 == obj3) {
                function1 = fixedSizeCallback;
                continuation = null;
                objG5 = new RewardsBoostersListViewKt$RewardsBoostersListViewContentShopVariant$3$1(function1, null);
                composerImpl.A(objG5);
            } else {
                function1 = fixedSizeCallback;
                continuation = null;
            }
            composerImpl.V(false);
            EffectsKt.e(composerImpl, Unit.f24250a, (Function2) objG5);
            Integer numValueOf2 = Integer.valueOf(((Number) mutableState.getD()).intValue());
            composerImpl.o(-1633490746);
            boolean z4 = (i3 & 234881024) == 67108864;
            Object objG6 = composerImpl.G();
            if (z4 || objG6 == obj3) {
                function12 = onFoundTheEnd;
                objG6 = new RewardsBoostersListViewKt$RewardsBoostersListViewContentShopVariant$4$1(function12, mutableState, continuation);
                composerImpl.A(objG6);
            } else {
                function12 = onFoundTheEnd;
            }
            composerImpl.V(false);
            ChangedEffectKt.a(numValueOf2, (Function2) objG6, composerImpl, 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(z, viewState, onBannerClick, onOfferSectionCtaClick, onOfferClick, activateOffer, onOfferCtaButtonClick, function1, function12, onItemSeen, trackSpinSurpriseBannerImpression, trackStandardBannerImpression, onProductOffersSwipeStarted, onProductOffersSwipeEnded, onSelectedFilterChanged, offerFeedInlineBannerListener, rewardsCtaCardListener, modifier, i) { // from class: au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.b
                public final /* synthetic */ boolean d;
                public final /* synthetic */ RewardsPointsContract.ViewState e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ Function1 g;
                public final /* synthetic */ Function1 h;
                public final /* synthetic */ Function1 i;
                public final /* synthetic */ Function2 j;
                public final /* synthetic */ Function1 k;
                public final /* synthetic */ Function1 l;
                public final /* synthetic */ Function1 m;
                public final /* synthetic */ Function1 n;
                public final /* synthetic */ Function1 o;
                public final /* synthetic */ Function0 p;
                public final /* synthetic */ Function1 q;
                public final /* synthetic */ Function1 r;
                public final /* synthetic */ RewardsOfferBaseContract.OfferFeedInlineBannerListener s;
                public final /* synthetic */ RewardsOfferBaseContract.RewardsCtaCardListener t;
                public final /* synthetic */ Modifier u;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    RewardsBoostersListViewKt.c(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, (Composer) obj4, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final boolean d(String sectionId, List list) {
        Object next;
        Intrinsics.h(list, "<this>");
        Intrinsics.h(sectionId, "sectionId");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.c(((BannerSectionConfig) next).f6269a, sectionId)) {
                break;
            }
        }
        BannerSectionConfig bannerSectionConfig = (BannerSectionConfig) next;
        return bannerSectionConfig != null && bannerSectionConfig.b;
    }
}
