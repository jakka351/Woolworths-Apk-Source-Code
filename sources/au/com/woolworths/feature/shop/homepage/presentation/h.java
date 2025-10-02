package au.com.woolworths.feature.shop.homepage.presentation;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.feature.shop.contentpage.data.HorizontalListData;
import au.com.woolworths.feature.shop.contentpage.data.HorizontalListTrailingLinkData;
import au.com.woolworths.feature.shop.homepage.analytics.HomePageActions;
import au.com.woolworths.feature.shop.homepage.data.RewardsBalanceCardData;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ HomePageFragment e;
    public final /* synthetic */ Object f;

    public /* synthetic */ h(HomePageFragment homePageFragment, Object obj, int i) {
        this.d = i;
        this.e = homePageFragment;
        this.f = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String action;
        switch (this.d) {
            case 0:
                HomePageViewModel homePageViewModelH2 = this.e.h2();
                String str = ((RewardsBalanceCardData) this.f).e;
                homePageViewModelH2.f.c(HomePageActions.RewardsPointsClick.e);
                homePageViewModelH2.w6(new HomePageContract.Actions.LaunchDeepLink(str));
                break;
            default:
                HomePageViewModel homePageViewModelH22 = this.e.h2();
                HorizontalListData horizontalListData = (HorizontalListData) this.f;
                TrackableValue trackableValue = TrackableValue.o0;
                String d = horizontalListData.getD();
                if (d == null) {
                    d = "";
                }
                TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(trackableValue, HomePageViewModel.A6(d));
                if (!HomePageViewModel.C6(horizontalListData)) {
                    TrackableValue trackableValue2 = TrackableValue.z0;
                    String d2 = horizontalListData.getD();
                    if (d2 == null) {
                        d2 = "";
                    }
                    trackingMetadataA.b(trackableValue2, d2);
                    TrackableValue trackableValue3 = TrackableValue.y0;
                    HorizontalListTrailingLinkData horizontalListTrailingLink = horizontalListData.getHorizontalListTrailingLink();
                    String str2 = horizontalListTrailingLink != null ? horizontalListTrailingLink.c.f10170a : null;
                    trackingMetadataA.b(trackableValue3, str2 != null ? str2 : "");
                }
                homePageViewModelH22.f.j(HomePageActions.SeeAllClick.e, trackingMetadataA);
                HorizontalListTrailingLinkData horizontalListTrailingLink2 = horizontalListData.getHorizontalListTrailingLink();
                if (horizontalListTrailingLink2 != null && (action = horizontalListTrailingLink2.b.getAction()) != null) {
                    homePageViewModelH22.w6(new HomePageContract.Actions.LaunchDeepLink(action));
                }
                break;
        }
        return Unit.f24250a;
    }
}
