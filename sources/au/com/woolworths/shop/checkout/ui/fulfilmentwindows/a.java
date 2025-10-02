package au.com.woolworths.shop.checkout.ui.fulfilmentwindows;

import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.shop.broadcastbanner.model.BasicCoreBroadcastBannerModel;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsOption;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsContract;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ FulfilmentWindowsActivity e;

    public /* synthetic */ a(FulfilmentWindowsActivity fulfilmentWindowsActivity, int i) {
        this.d = i;
        this.e = fulfilmentWindowsActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FulfilmentWindowsContract.ViewState viewState;
        FulfilmentWindowsOption fulfilmentWindowsOption;
        int i = this.d;
        Unit unit = Unit.f24250a;
        FulfilmentWindowsActivity fulfilmentWindowsActivity = this.e;
        switch (i) {
            case 0:
                BasicCoreBroadcastBannerModel bannerData = (BasicCoreBroadcastBannerModel) obj;
                int i2 = FulfilmentWindowsActivity.B;
                Intrinsics.h(bannerData, "bannerData");
                FulfilmentWindowsViewModel fulfilmentWindowsViewModelO4 = fulfilmentWindowsActivity.O4();
                ActionData actionData = bannerData.d;
                if (actionData == null) {
                    Bark.Companion companion = Bark.f8483a;
                    Bark.f8483a.f(new ReportOwner(ReportOwner.Squad.w), "Programming error: component click with null action", null);
                } else {
                    int iOrdinal = actionData.getType().ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fulfilmentWindowsViewModelO4.m.f(new FulfilmentWindowsContract.Actions.LaunchDeepLink(actionData.getAction()));
                    }
                }
                return unit;
            default:
                ActionData actionData2 = (ActionData) obj;
                int i3 = FulfilmentWindowsActivity.B;
                Intrinsics.h(actionData2, "actionData");
                FulfilmentWindowsViewModel fulfilmentWindowsViewModelO42 = fulfilmentWindowsActivity.O4();
                int iOrdinal2 = actionData2.getType().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fulfilmentWindowsViewModelO42.m.f(new FulfilmentWindowsContract.Actions.LaunchDeepLink(actionData2.getAction()));
                } else if (Intrinsics.c(actionData2.getAction(), "openDeliveryOptions") && (viewState = (FulfilmentWindowsContract.ViewState) fulfilmentWindowsViewModelO42.k.getValue()) != null && (fulfilmentWindowsOption = viewState.d) != null) {
                    fulfilmentWindowsViewModelO42.w6(fulfilmentWindowsOption);
                }
                return unit;
        }
    }
}
