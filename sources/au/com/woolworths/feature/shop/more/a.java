package au.com.woolworths.feature.shop.more;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.feature.shop.banners.broadcastbanner.analytics.AnalyticsExtensionsKt;
import au.com.woolworths.feature.shop.more.MoreContract;
import au.com.woolworths.feature.shop.more.MoreViewModel;
import au.com.woolworths.feature.shop.more.data.LocalAction;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.sdui.model.action.ActionData;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.AbstractList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ MoreEpoxyController e;

    public /* synthetic */ a(MoreEpoxyController moreEpoxyController, int i) {
        this.d = i;
        this.e = moreEpoxyController;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object next;
        switch (this.d) {
            case 0:
                ActionData actionData = (ActionData) obj;
                Intrinsics.h(actionData, "actionData");
                MoreViewModel moreViewModel = this.e.viewModel;
                SharedFlowImpl sharedFlowImpl = moreViewModel.v;
                String actionString = actionData.getAction();
                AnalyticsData analytics = actionData.getAnalytics();
                if (analytics != null) {
                    moreViewModel.f.g(AnalyticsDataKt.a(analytics));
                }
                LocalAction.e.getClass();
                Intrinsics.h(actionString, "actionString");
                Iterator it = ((AbstractList) LocalAction.g).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((LocalAction) next).d.equals(actionString)) {
                        }
                    } else {
                        next = null;
                    }
                }
                LocalAction localAction = (LocalAction) next;
                int i = localAction == null ? -1 : MoreViewModel.WhenMappings.b[localAction.ordinal()];
                if (i == 1) {
                    sharedFlowImpl.f(MoreContract.Actions.LaunchAppUpdate.f7554a);
                } else if (i == 2) {
                    sharedFlowImpl.f(MoreContract.Actions.LaunchOsUpdate.f7569a);
                }
                break;
            case 1:
                BroadcastBannerData bannerData = (BroadcastBannerData) obj;
                Intrinsics.h(bannerData, "bannerData");
                MoreViewModel moreViewModel2 = this.e.viewModel;
                moreViewModel2.getClass();
                moreViewModel2.f.g(AnalyticsExtensionsKt.a(bannerData, Screens.k));
                String deeplink = bannerData.getDeeplink();
                if (deeplink != null) {
                    moreViewModel2.v.f(new MoreContract.Actions.LaunchDeepLink(deeplink));
                }
                break;
            default:
                BroadcastBannerData bannerData2 = (BroadcastBannerData) obj;
                Intrinsics.h(bannerData2, "bannerData");
                MoreViewModel moreViewModel3 = this.e.viewModel;
                moreViewModel3.getClass();
                String bannerId = bannerData2.getBannerId();
                if (bannerId != null) {
                    if (!Intrinsics.c(bannerData2.getDismissible(), Boolean.TRUE)) {
                        bannerId = null;
                    }
                    if (bannerId != null) {
                        moreViewModel3.m.b(bannerId);
                        moreViewModel3.r6(Boolean.FALSE);
                        moreViewModel3.f.g(AnalyticsExtensionsKt.b(bannerData2, Screens.k));
                    }
                }
                break;
        }
        return Unit.f24250a;
    }
}
