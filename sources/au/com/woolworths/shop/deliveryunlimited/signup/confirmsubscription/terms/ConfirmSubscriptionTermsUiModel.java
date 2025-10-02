package au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/terms/ConfirmSubscriptionTermsUiModel;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ConfirmSubscriptionTermsUiModel {

    /* renamed from: a, reason: collision with root package name */
    public final String f10868a;
    public final List b;
    public final ButtonApiData c;
    public final AnalyticsData d;

    public ConfirmSubscriptionTermsUiModel(String title, List list, ButtonApiData button, AnalyticsData analyticsData) {
        Intrinsics.h(title, "title");
        Intrinsics.h(button, "button");
        this.f10868a = title;
        this.b = list;
        this.c = button;
        this.d = analyticsData;
    }

    public static ConfirmSubscriptionTermsUiModel a(ConfirmSubscriptionTermsUiModel confirmSubscriptionTermsUiModel, ArrayList arrayList) {
        String title = confirmSubscriptionTermsUiModel.f10868a;
        ButtonApiData button = confirmSubscriptionTermsUiModel.c;
        AnalyticsData analyticsData = confirmSubscriptionTermsUiModel.d;
        confirmSubscriptionTermsUiModel.getClass();
        Intrinsics.h(title, "title");
        Intrinsics.h(button, "button");
        return new ConfirmSubscriptionTermsUiModel(title, arrayList, button, analyticsData);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmSubscriptionTermsUiModel)) {
            return false;
        }
        ConfirmSubscriptionTermsUiModel confirmSubscriptionTermsUiModel = (ConfirmSubscriptionTermsUiModel) obj;
        return Intrinsics.c(this.f10868a, confirmSubscriptionTermsUiModel.f10868a) && Intrinsics.c(this.b, confirmSubscriptionTermsUiModel.b) && Intrinsics.c(this.c, confirmSubscriptionTermsUiModel.c) && Intrinsics.c(this.d, confirmSubscriptionTermsUiModel.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + b.d(this.f10868a.hashCode() * 31, 31, this.b)) * 31;
        AnalyticsData analyticsData = this.d;
        return iHashCode + (analyticsData == null ? 0 : analyticsData.hashCode());
    }

    public final String toString() {
        StringBuilder sbS = a.s("ConfirmSubscriptionTermsUiModel(title=", this.f10868a, ", items=", ", button=", this.b);
        sbS.append(this.c);
        sbS.append(", impressionAnalytics=");
        sbS.append(this.d);
        sbS.append(")");
        return sbS.toString();
    }

    public /* synthetic */ ConfirmSubscriptionTermsUiModel(List list, ButtonApiData buttonApiData) {
        this("Terms & Conditions", list, buttonApiData, null);
    }
}
