package au.com.woolworths.shop.checkout.domain.model;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.inlinemessage.InlineMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/ContactDetails;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ContactDetails {

    /* renamed from: a, reason: collision with root package name */
    public final String f10595a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final InlineMessage f;

    public ContactDetails(String str, String str2, String str3, String str4, String str5, InlineMessage inlineMessage) {
        this.f10595a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = inlineMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactDetails)) {
            return false;
        }
        ContactDetails contactDetails = (ContactDetails) obj;
        return Intrinsics.c(this.f10595a, contactDetails.f10595a) && Intrinsics.c(this.b, contactDetails.b) && Intrinsics.c(this.c, contactDetails.c) && Intrinsics.c(this.d, contactDetails.d) && Intrinsics.c(this.e, contactDetails.e) && Intrinsics.c(this.f, contactDetails.f);
    }

    public final int hashCode() {
        int iHashCode = this.f10595a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iC = b.c(b.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d), 31, this.e);
        InlineMessage inlineMessage = this.f;
        return iC + (inlineMessage != null ? inlineMessage.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("ContactDetails(title=", this.f10595a, ", phoneNumberLabel=", this.b, ", phoneNumber=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", placeholder=", this.d, ", buttonTitle=");
        sbV.append(this.e);
        sbV.append(", inlineMessage=");
        sbV.append(this.f);
        sbV.append(")");
        return sbV.toString();
    }
}
