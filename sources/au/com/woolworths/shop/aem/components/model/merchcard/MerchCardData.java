package au.com.woolworths.shop.aem.components.model.merchcard;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import au.com.woolworths.shop.aem.components.model.button.ButtonData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/merchcard/MerchCardData;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MerchCardData {

    /* renamed from: a, reason: collision with root package name */
    public final ImageWithAltText f10171a;
    public final ImageWithAltText b;
    public final String c;
    public final String d;
    public final ButtonData e;
    public final ActionData f;
    public final AnalyticsData g;
    public final AnalyticsData h;

    public MerchCardData(ImageWithAltText gridImageWithAlt, ImageWithAltText listImageWithAlt, String title, String str, ButtonData buttonData, ActionData actionData, AnalyticsData analyticsData, AnalyticsData analyticsData2) {
        Intrinsics.h(gridImageWithAlt, "gridImageWithAlt");
        Intrinsics.h(listImageWithAlt, "listImageWithAlt");
        Intrinsics.h(title, "title");
        this.f10171a = gridImageWithAlt;
        this.b = listImageWithAlt;
        this.c = title;
        this.d = str;
        this.e = buttonData;
        this.f = actionData;
        this.g = analyticsData;
        this.h = analyticsData2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MerchCardData)) {
            return false;
        }
        MerchCardData merchCardData = (MerchCardData) obj;
        return Intrinsics.c(this.f10171a, merchCardData.f10171a) && Intrinsics.c(this.b, merchCardData.b) && Intrinsics.c(this.c, merchCardData.c) && Intrinsics.c(this.d, merchCardData.d) && Intrinsics.c(this.e, merchCardData.e) && Intrinsics.c(this.f, merchCardData.f) && Intrinsics.c(this.g, merchCardData.g) && Intrinsics.c(this.h, merchCardData.h);
    }

    public final int hashCode() {
        int iC = b.c((this.b.hashCode() + (this.f10171a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        ButtonData buttonData = this.e;
        int iHashCode2 = (iHashCode + (buttonData == null ? 0 : buttonData.hashCode())) * 31;
        ActionData actionData = this.f;
        int iHashCode3 = (iHashCode2 + (actionData == null ? 0 : actionData.hashCode())) * 31;
        AnalyticsData analyticsData = this.g;
        int iHashCode4 = (iHashCode3 + (analyticsData == null ? 0 : analyticsData.hashCode())) * 31;
        AnalyticsData analyticsData2 = this.h;
        return iHashCode4 + (analyticsData2 != null ? analyticsData2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchCardData(gridImageWithAlt=");
        sb.append(this.f10171a);
        sb.append(", listImageWithAlt=");
        sb.append(this.b);
        sb.append(", title=");
        a.B(sb, this.c, ", description=", this.d, ", button=");
        sb.append(this.e);
        sb.append(", action=");
        sb.append(this.f);
        sb.append(", analytics=");
        sb.append(this.g);
        sb.append(", impressionAnalytics=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
