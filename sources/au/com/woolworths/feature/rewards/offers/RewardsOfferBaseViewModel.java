package au.com.woolworths.feature.rewards.offers;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.rewards.autoboost.AutoboostAnalytics;
import au.com.woolworths.analytics.rewards.home.HomeAnalytics;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.rewards.offers.RewardsOfferBaseContract;
import au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferScreen;
import au.com.woolworths.feature.rewards.offers.banner.RewardsBannerInteractor;
import au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/RewardsOfferBaseViewModel;", "Landroidx/lifecycle/ViewModel;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RewardsOfferBaseViewModel extends ViewModel {
    public final AnalyticsManager e;
    public final RewardsBannerInteractor f;
    public final SharedFlowImpl g;
    public final HashSet h;
    public Function1 i;
    public final SharedFlow j;
    public final RewardsOfferBaseContract.OfferFeedInlineBannerListener k;
    public final RewardsOfferBaseContract.RewardsCtaCardListener l;

    public RewardsOfferBaseViewModel(AnalyticsManager analyticsManager, RewardsBannerInteractor rewardsBannerInteractor) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = analyticsManager;
        this.f = rewardsBannerInteractor;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.g = sharedFlowImplB;
        this.h = new HashSet();
        this.j = FlowKt.a(sharedFlowImplB);
        this.k = new RewardsOfferBaseContract.OfferFeedInlineBannerListener(new RewardsOfferBaseViewModel$offerFeedInlineBannerListener$1(1, this, RewardsOfferBaseViewModel.class, "onDismissOfferFeedInlineBanner", "onDismissOfferFeedInlineBanner(Lau/com/woolworths/feature/rewards/offers/OfferFeedInlineBannerViewItem;)V", 0), new RewardsOfferBaseViewModel$offerFeedInlineBannerListener$2(1, this, RewardsOfferBaseViewModel.class, "onImpressionOfferFeedInlineBanner", "onImpressionOfferFeedInlineBanner(Lau/com/woolworths/feature/rewards/offers/OfferFeedInlineBannerViewItem;)V", 0), new RewardsOfferBaseViewModel$offerFeedInlineBannerListener$3(1, this, RewardsOfferBaseViewModel.class, "onClickOfferFeedInlineBanner", "onClickOfferFeedInlineBanner(Lau/com/woolworths/feature/rewards/offers/OfferFeedInlineBannerViewItem;)V", 0));
        this.l = new RewardsOfferBaseContract.RewardsCtaCardListener(new RewardsOfferBaseViewModel$rewardsCtaCardListener$1(1, this, RewardsOfferBaseViewModel.class, "onClickRewardsCtaCard", "onClickRewardsCtaCard(Lau/com/woolworths/feature/rewards/offers/RewardsCtaCardViewItem;)V", 0));
    }

    public final void p6(SectionViewItem banner) {
        Intrinsics.h(banner, "banner");
        boolean z = banner instanceof StandardBannerViewItem;
        AnalyticsManager analyticsManager = this.e;
        SharedFlowImpl sharedFlowImpl = this.g;
        if (z) {
            String str = ((StandardBannerViewItem) banner).f;
            if (str != null) {
                sharedFlowImpl.f(new RewardsOfferBaseContract.Actions.OpenUrl(str));
            }
            RewardsPointsActionData rewardsPointsActionData = RewardsPointsActionData.f;
            TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.o0, str == null ? "" : str);
            TrackableValue trackableValue = TrackableValue.h0;
            if (str == null) {
                str = "";
            }
            trackingMetadataA.b(trackableValue, str);
            analyticsManager.j(rewardsPointsActionData, trackingMetadataA);
            return;
        }
        if (banner instanceof PersonalisedOffersBannerViewItem) {
            PersonalisedOffersBannerViewItem personalisedOffersBannerViewItem = (PersonalisedOffersBannerViewItem) banner;
            sharedFlowImpl.f(new RewardsOfferBaseContract.Actions.OpenUrl(personalisedOffersBannerViewItem.g));
            RewardsPointsActionData.Companion companion = RewardsPointsActionData.e;
            final String str2 = personalisedOffersBannerViewItem.d;
            companion.getClass();
            analyticsManager.j(new Action(str2) { // from class: au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData$Companion$personalisedOffersBannerClick$1
                public final RewardsOfferScreen d = RewardsOfferScreen.e;
                public final Category e = Category.R;
                public final String f;

                {
                    this.f = str2;
                }

                @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                /* renamed from: a, reason: from getter */
                public final String getF() {
                    return this.f;
                }

                @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                /* renamed from: b, reason: from getter */
                public final Category getE() {
                    return this.e;
                }

                @Override // au.com.woolworths.android.onesite.analytics.Action
                /* renamed from: f */
                public final Screen getD() {
                    return this.d;
                }
            }, TrackingMetadata.Companion.a(TrackableValue.o0, personalisedOffersBannerViewItem.e));
            return;
        }
        if (banner instanceof SpinSurpriseBannerViewItem) {
            SpinSurpriseBannerViewItem spinSurpriseBannerViewItem = (SpinSurpriseBannerViewItem) banner;
            sharedFlowImpl.f(new RewardsOfferBaseContract.Actions.OpenUrl(spinSurpriseBannerViewItem.d));
            analyticsManager.j(RewardsPointsActionData.m, TrackingMetadata.Companion.a(TrackableValue.m, spinSurpriseBannerViewItem.b));
        } else if (banner instanceof MandyBannerViewItem) {
            MandyBannerViewItem mandyBannerViewItem = (MandyBannerViewItem) banner;
            sharedFlowImpl.f(new RewardsOfferBaseContract.Actions.OpenUrl(mandyBannerViewItem.g));
            HomeAnalytics.Points.Action.Companion companion2 = HomeAnalytics.Points.Action.d;
            final String str3 = mandyBannerViewItem.f;
            companion2.getClass();
            analyticsManager.g(new Event(str3) { // from class: au.com.woolworths.analytics.rewards.home.HomeAnalytics$Points$Action$Companion$mandyBannerClick$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(HomeAnalytics.Points.e);
                    spreadBuilder.a(new Pair("event.Category", "banner"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.z("event.Label", str3, spreadBuilder, "event.Description", "Mandy Chat");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "banner_click";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj;
                    return "banner_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
        }
    }

    public final void q6(OfferSectionViewItem section) {
        Intrinsics.h(section, "section");
        ContentCta h = section.getH();
        if (h != null) {
            String url = h.getUrl();
            if (url != null) {
                this.g.f(new RewardsOfferBaseContract.Actions.OpenUrl(url));
            }
            AutoboostAnalytics.Home.Action.Companion companion = AutoboostAnalytics.Home.Action.d;
            final String label = h.getLabel();
            companion.getClass();
            Intrinsics.h(label, "label");
            this.e.g(new Event(label) { // from class: au.com.woolworths.analytics.rewards.autoboost.AutoboostAnalytics$Home$Action$Companion$sectionCtaClick$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(AutoboostAnalytics.Home.e);
                    spreadBuilder.a(new Pair("event.Category", "button"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.y("event.Label", label, spreadBuilder);
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
                    Event event = (Event) obj;
                    return "button_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
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
