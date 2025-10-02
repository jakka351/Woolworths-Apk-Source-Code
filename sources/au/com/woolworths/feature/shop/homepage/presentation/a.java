package au.com.woolworths.feature.shop.homepage.presentation;

import android.net.Uri;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.feature.shop.banners.broadcastbanner.analytics.AnalyticsExtensionsKt;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageContract;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.aem.components.model.herobanner.HeroBanner;
import au.com.woolworths.shop.aem.components.model.herobanner.HeroBannerAction;
import au.com.woolworths.shop.aem.components.model.herobanner.HeroBannerTermsAndConditions;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ HomeController e;

    public /* synthetic */ a(HomeController homeController, int i) {
        this.d = i;
        this.e = homeController;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ActionData actionData;
        switch (this.d) {
            case 0:
                BroadcastBannerData bannerData = (BroadcastBannerData) obj;
                Intrinsics.h(bannerData, "bannerData");
                HomePageViewModel homePageViewModel = this.e.viewModel;
                homePageViewModel.getClass();
                homePageViewModel.f.g(AnalyticsExtensionsKt.a(bannerData, Screens.l));
                String deeplink = bannerData.getDeeplink();
                if (deeplink != null) {
                    homePageViewModel.w6(new HomePageContract.Actions.LaunchDeepLink(deeplink));
                }
                return Unit.f24250a;
            case 1:
                BroadcastBannerData bannerData2 = (BroadcastBannerData) obj;
                Intrinsics.h(bannerData2, "bannerData");
                this.e.viewModel.D6(bannerData2);
                break;
            case 2:
                HeroBanner it = (HeroBanner) obj;
                Intrinsics.h(it, "it");
                HomeController homeController = this.e;
                homeController.heroBannerInteractor.a(Long.MAX_VALUE);
                HomePageViewModel homePageViewModel2 = homeController.viewModel;
                homePageViewModel2.getClass();
                AnalyticsManager analyticsManager = homePageViewModel2.f;
                Event eventA = AnalyticsDataKt.a(it.c);
                HeroBannerAction heroBannerAction = it.b;
                analyticsManager.g(AnalyticsDataKt.b(eventA, heroBannerAction.b));
                homePageViewModel2.F6(heroBannerAction.f10164a);
                break;
            default:
                HeroBanner it2 = (HeroBanner) obj;
                Intrinsics.h(it2, "it");
                HomeController homeController2 = this.e;
                homeController2.heroBannerInteractor.a(Long.MAX_VALUE);
                HomePageViewModel homePageViewModel3 = homeController2.viewModel;
                homePageViewModel3.getClass();
                HeroBannerTermsAndConditions heroBannerTermsAndConditions = it2.k;
                if (heroBannerTermsAndConditions != null && (actionData = heroBannerTermsAndConditions.b) != null) {
                    homePageViewModel3.f.g(AnalyticsDataKt.b(AnalyticsDataKt.a(it2.c), actionData.getAnalytics()));
                    int iOrdinal = actionData.getType().ordinal();
                    if (iOrdinal == 0) {
                        Uri uri = Uri.parse(actionData.getAction());
                        String queryParameter = uri.getQueryParameter("title");
                        String queryParameter2 = uri.getQueryParameter("url");
                        if (queryParameter != null && queryParameter2 != null) {
                            homePageViewModel3.w6(new HomePageContract.Actions.LaunchWebView(queryParameter, queryParameter2));
                        }
                    } else if (iOrdinal == 1) {
                        homePageViewModel3.F6(actionData.getAction());
                    }
                }
                return Unit.f24250a;
        }
        return Unit.f24250a;
    }
}
