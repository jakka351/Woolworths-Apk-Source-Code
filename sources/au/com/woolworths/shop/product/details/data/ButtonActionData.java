package au.com.woolworths.shop.product.details.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.sdui.model.action.ActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/data/ButtonActionData;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ButtonActionData {

    /* renamed from: a, reason: collision with root package name */
    public final String f12596a;
    public final FooterButtonAction b;
    public final ActionType c;
    public final AnalyticsData d;

    public ButtonActionData(String str, FooterButtonAction footerButtonAction, ActionType type, AnalyticsData analyticsData) {
        Intrinsics.h(type, "type");
        this.f12596a = str;
        this.b = footerButtonAction;
        this.c = type;
        this.d = analyticsData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonActionData)) {
            return false;
        }
        ButtonActionData buttonActionData = (ButtonActionData) obj;
        return Intrinsics.c(this.f12596a, buttonActionData.f12596a) && this.b == buttonActionData.b && this.c == buttonActionData.c && Intrinsics.c(this.d, buttonActionData.d);
    }

    public final int hashCode() {
        String str = this.f12596a;
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31;
        AnalyticsData analyticsData = this.d;
        return iHashCode + (analyticsData != null ? analyticsData.hashCode() : 0);
    }

    public final String toString() {
        return "ButtonActionData(id=" + this.f12596a + ", action=" + this.b + ", type=" + this.c + ", analytics=" + this.d + ")";
    }
}
