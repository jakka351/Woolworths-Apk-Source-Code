package au.com.woolworths.feature.rewards.offers.points.ui;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferAnalyticsManager;
import au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferScreen;
import au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData;
import au.com.woolworths.feature.rewards.offers.points.RewardsPointsViewModel;
import au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.RewardsOfferListItemSeen;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import au.com.woolworths.foundation.rewards.offers.model.analytics.BasicRewardsOfferStatusDataExtKt;
import au.com.woolworths.foundation.rewards.offers.model.analytics.RewardsOffersSwrveEvent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ RewardsPointsViewModel e;

    public /* synthetic */ a(RewardsPointsViewModel rewardsPointsViewModel, int i) {
        this.d = i;
        this.e = rewardsPointsViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
                Intrinsics.h(DisposableEffect, "$this$DisposableEffect");
                final RewardsPointsViewModel rewardsPointsViewModel = this.e;
                if (!rewardsPointsViewModel.B) {
                    rewardsPointsViewModel.y6();
                }
                rewardsPointsViewModel.y2();
                rewardsPointsViewModel.b3(new au.com.woolworths.rewards.base.a(true, 0));
                return new DisposableEffectResult() { // from class: au.com.woolworths.feature.rewards.offers.points.ui.PointsScreenKt$PointsScreen$lambda$5$lambda$4$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        RewardsPointsViewModel rewardsPointsViewModel2 = rewardsPointsViewModel;
                        rewardsPointsViewModel2.y2();
                        rewardsPointsViewModel2.b3(new au.com.woolworths.rewards.base.a(false, 0));
                    }
                };
            default:
                RewardsOfferListItemSeen it = (RewardsOfferListItemSeen) obj;
                Intrinsics.h(it, "it");
                if (!(it instanceof RewardsOfferListItemSeen.Offer)) {
                    throw new NoWhenBranchMatchedException();
                }
                RewardsOfferData offer = ((RewardsOfferListItemSeen.Offer) it).f6380a;
                Intrinsics.h(offer, "offer");
                RewardsPointsViewModel rewardsPointsViewModel2 = this.e;
                boolean zAdd = rewardsPointsViewModel2.x.add(offer.d);
                Boolean boolValueOf = Boolean.valueOf(zAdd);
                if (!zAdd) {
                    boolValueOf = null;
                }
                if (boolValueOf != null) {
                    RewardsOfferAnalyticsManager rewardsOfferAnalyticsManager = rewardsPointsViewModel2.u;
                    RewardsOfferScreen rewardsOfferScreen = RewardsOfferScreen.e;
                    rewardsOfferAnalyticsManager.q(offer, rewardsOfferScreen, RewardsPointsActionData.h);
                    rewardsPointsViewModel2.q.c(RewardsOffersSwrveEvent.g, BasicRewardsOfferStatusDataExtKt.d(offer, rewardsOfferScreen.getD()));
                }
                return Unit.f24250a;
        }
    }
}
