package au.com.woolworths.feature.shop.onboarding.sdui.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.base.shopapp.modules.button.ButtonStyleApiData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/sdui/data/ButtonData;", "", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ButtonData {

    /* renamed from: a, reason: collision with root package name */
    public final String f7976a;
    public final String b;
    public final boolean c;
    public final ButtonActionData d;
    public final String e;
    public final ButtonStyleApiData f;
    public final AnalyticsData g;

    public ButtonData(String str, String str2, boolean z, ButtonActionData buttonActionData, String str3, ButtonStyleApiData buttonStyleApiData, AnalyticsData analyticsData) {
        this.f7976a = str;
        this.b = str2;
        this.c = z;
        this.d = buttonActionData;
        this.e = str3;
        this.f = buttonStyleApiData;
        this.g = analyticsData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonData)) {
            return false;
        }
        ButtonData buttonData = (ButtonData) obj;
        return Intrinsics.c(this.f7976a, buttonData.f7976a) && Intrinsics.c(this.b, buttonData.b) && this.c == buttonData.c && Intrinsics.c(this.d, buttonData.d) && Intrinsics.c(this.e, buttonData.e) && this.f == buttonData.f && Intrinsics.c(this.g, buttonData.g);
    }

    public final int hashCode() {
        String str = this.f7976a;
        int iE = b.e(b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        ButtonActionData buttonActionData = this.d;
        int iHashCode = (iE + (buttonActionData == null ? 0 : buttonActionData.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ButtonStyleApiData buttonStyleApiData = this.f;
        int iHashCode3 = (iHashCode2 + (buttonStyleApiData == null ? 0 : buttonStyleApiData.hashCode())) * 31;
        AnalyticsData analyticsData = this.g;
        return iHashCode3 + (analyticsData != null ? analyticsData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("ButtonData(altText=", this.f7976a, ", label=", this.b, ", enabled=");
        sbV.append(this.c);
        sbV.append(", buttonAction=");
        sbV.append(this.d);
        sbV.append(", buttonId=");
        sbV.append(this.e);
        sbV.append(", style=");
        sbV.append(this.f);
        sbV.append(", analytics=");
        return au.com.woolworths.android.onesite.a.n(sbV, this.g, ")");
    }
}
