package au.com.woolworths.shop.aem.components.model.contentcard;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.aem.components.model.GenericPageFeedItem;
import au.com.woolworths.shop.aem.components.model.verticallist.VerticalListItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/contentcard/FullWidthContentCardData;", "Lau/com/woolworths/shop/aem/components/model/GenericPageFeedItem;", "Lau/com/woolworths/shop/aem/components/model/verticallist/VerticalListItem;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FullWidthContentCardData implements GenericPageFeedItem, VerticalListItem {

    /* renamed from: a, reason: collision with root package name */
    public final String f10149a;
    public final String b;
    public final String c;
    public final String d;
    public final Boolean e;
    public final ActionData f;

    public FullWidthContentCardData(String str, String str2, String str3, String str4, Boolean bool, ActionData actionData) {
        this.f10149a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = bool;
        this.f = actionData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FullWidthContentCardData)) {
            return false;
        }
        FullWidthContentCardData fullWidthContentCardData = (FullWidthContentCardData) obj;
        return Intrinsics.c(this.f10149a, fullWidthContentCardData.f10149a) && Intrinsics.c(this.b, fullWidthContentCardData.b) && Intrinsics.c(this.c, fullWidthContentCardData.c) && Intrinsics.c(this.d, fullWidthContentCardData.d) && Intrinsics.c(this.e, fullWidthContentCardData.e) && Intrinsics.c(this.f, fullWidthContentCardData.f);
    }

    public final int hashCode() {
        String str = this.f10149a;
        int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        ActionData actionData = this.f;
        return iHashCode3 + (actionData != null ? actionData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("FullWidthContentCardData(id=", this.f10149a, ", imageUrl=", this.b, ", title=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", description=", this.d, ", isVideoAvailable=");
        sbV.append(this.e);
        sbV.append(", action=");
        sbV.append(this.f);
        sbV.append(")");
        return sbV.toString();
    }
}
