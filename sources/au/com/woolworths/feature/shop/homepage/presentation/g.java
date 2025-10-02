package au.com.woolworths.feature.shop.homepage.presentation;

import au.com.woolworths.feature.shop.homepage.analytics.HomePageActions;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ HomePageFragment e;

    public /* synthetic */ g(HomePageFragment homePageFragment, int i) {
        this.d = i;
        this.e = homePageFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                HomePageFragment homePageFragment = this.e;
                homePageFragment.t = false;
                HomePageViewModel homePageViewModelH2 = homePageFragment.h2();
                homePageViewModelH2.E.clear();
                homePageViewModelH2.l.N();
                break;
            case 1:
                this.e.t = false;
                break;
            case 2:
                HomePageViewModel homePageViewModelH22 = this.e.h2();
                homePageViewModelH22.f.c(HomePageActions.ShowBarcodeClick.e);
                homePageViewModelH22.w6(HomePageContract.Actions.LaunchDisplayBarcode.f7217a);
                break;
            case 3:
                this.e.h2().f.c(HomePageActions.RewardsOffersBalanceErrorClick.e);
                break;
            case 4:
                this.e.h2().f.c(HomePageActions.RewardsPointsBalanceErrorClick.e);
                break;
            case 5:
                this.e.h2().f.c(HomePageActions.MyOrdersImpression.e);
                break;
            default:
                this.e.h2().y6();
                break;
        }
        return Unit.f24250a;
    }
}
