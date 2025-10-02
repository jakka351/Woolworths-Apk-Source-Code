package au.com.woolworths.shop.aem.components.model.merchcardfullimage;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import au.com.woolworths.shop.aem.components.model.button.ButtonData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/merchcardfullimage/MerchCardFullImageData;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MerchCardFullImageData {

    /* renamed from: a, reason: collision with root package name */
    public final ImageWithAltText f10172a;
    public final ActionData b;
    public final ButtonData c;
    public final String d;
    public final String e;

    public MerchCardFullImageData(ImageWithAltText imageWithAlt, ActionData actionData, ButtonData buttonData, String str, String str2) {
        Intrinsics.h(imageWithAlt, "imageWithAlt");
        this.f10172a = imageWithAlt;
        this.b = actionData;
        this.c = buttonData;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MerchCardFullImageData)) {
            return false;
        }
        MerchCardFullImageData merchCardFullImageData = (MerchCardFullImageData) obj;
        return Intrinsics.c(this.f10172a, merchCardFullImageData.f10172a) && Intrinsics.c(this.b, merchCardFullImageData.b) && Intrinsics.c(this.c, merchCardFullImageData.c) && Intrinsics.c(this.d, merchCardFullImageData.d) && Intrinsics.c(this.e, merchCardFullImageData.e);
    }

    public final int hashCode() {
        int iHashCode = this.f10172a.hashCode() * 31;
        ActionData actionData = this.b;
        int iHashCode2 = (iHashCode + (actionData == null ? 0 : actionData.hashCode())) * 31;
        ButtonData buttonData = this.c;
        int iHashCode3 = (iHashCode2 + (buttonData == null ? 0 : buttonData.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchCardFullImageData(imageWithAlt=");
        sb.append(this.f10172a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", buttonData=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", title=");
        return a.o(sb, this.e, ")");
    }
}
