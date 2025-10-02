package au.com.woolworths.base.shopapp.models.address;

import androidx.constraintlayout.core.state.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/shopapp/models/address/AddressInput;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AddressInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f4619a;
    public final Boolean b;
    public final Boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final Integer g;

    public AddressInput(String str, Boolean bool, Boolean bool2, String str2, String str3, String str4, Integer num) {
        this.f4619a = str;
        this.b = bool;
        this.c = bool2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressInput)) {
            return false;
        }
        AddressInput addressInput = (AddressInput) obj;
        return Intrinsics.c(this.f4619a, addressInput.f4619a) && this.b.equals(addressInput.b) && this.c.equals(addressInput.c) && Intrinsics.c(this.d, addressInput.d) && Intrinsics.c(this.e, addressInput.e) && Intrinsics.c(this.f, addressInput.f) && Intrinsics.c(this.g, addressInput.g);
    }

    public final int hashCode() {
        String str = this.f4619a;
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.g;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddressInput(alternateAddressId=null, amasId=");
        sb.append(this.f4619a);
        sb.append(", isAlternateAddressId=");
        sb.append(this.b);
        sb.append(", isForBilling=");
        sb.append(this.c);
        sb.append(", postcode=");
        sb.append(this.d);
        sb.append(", street1=");
        a.B(sb, this.e, ", street2=", this.f, ", suburbId=");
        return au.com.woolworths.android.onesite.a.p(sb, this.g, ")");
    }
}
