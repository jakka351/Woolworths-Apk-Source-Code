package au.com.woolworths.shop.aem.components.model.button;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.aem.components.model.GenericPageFeedItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/button/ButtonData;", "Lau/com/woolworths/shop/aem/components/model/GenericPageFeedItem;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ButtonData implements GenericPageFeedItem {

    /* renamed from: a, reason: collision with root package name */
    public final String f10145a;
    public final String b;
    public final ButtonStyle c;
    public final boolean d;
    public final ActionData e;
    public final String f;
    public final String g;
    public final ButtonAnalytics h;

    public ButtonData(String str, String label, ButtonStyle buttonStyle, boolean z, ActionData actionData, String str2, String str3, ButtonAnalytics buttonAnalytics) {
        Intrinsics.h(label, "label");
        this.f10145a = str;
        this.b = label;
        this.c = buttonStyle;
        this.d = z;
        this.e = actionData;
        this.f = str2;
        this.g = str3;
        this.h = buttonAnalytics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonData)) {
            return false;
        }
        ButtonData buttonData = (ButtonData) obj;
        return Intrinsics.c(this.f10145a, buttonData.f10145a) && Intrinsics.c(this.b, buttonData.b) && this.c == buttonData.c && this.d == buttonData.d && Intrinsics.c(this.e, buttonData.e) && Intrinsics.c(this.f, buttonData.f) && Intrinsics.c(this.g, buttonData.g) && Intrinsics.c(this.h, buttonData.h);
    }

    public final int hashCode() {
        String str = this.f10145a;
        int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        ButtonStyle buttonStyle = this.c;
        int iE = b.e((iC + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31, 31, this.d);
        ActionData actionData = this.e;
        int iHashCode = (iE + (actionData == null ? 0 : actionData.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ButtonAnalytics buttonAnalytics = this.h;
        return iHashCode3 + (buttonAnalytics != null ? buttonAnalytics.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("ButtonData(buttonId=", this.f10145a, ", label=", this.b, ", style=");
        sbV.append(this.c);
        sbV.append(", enabled=");
        sbV.append(this.d);
        sbV.append(", buttonAction=");
        sbV.append(this.e);
        sbV.append(", iconUrl=");
        sbV.append(this.f);
        sbV.append(", altText=");
        sbV.append(this.g);
        sbV.append(", analytics=");
        sbV.append(this.h);
        sbV.append(")");
        return sbV.toString();
    }
}
