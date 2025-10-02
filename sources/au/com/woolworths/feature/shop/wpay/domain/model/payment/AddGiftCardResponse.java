package au.com.woolworths.feature.shop.wpay.domain.model.payment;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/AddGiftCardResponse;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AddGiftCardResponse {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8288a;
    public final String b;
    public final String c;

    public AddGiftCardResponse(boolean z, String str, String str2) {
        this.f8288a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddGiftCardResponse)) {
            return false;
        }
        AddGiftCardResponse addGiftCardResponse = (AddGiftCardResponse) obj;
        return this.f8288a == addGiftCardResponse.f8288a && Intrinsics.c(this.b, addGiftCardResponse.b) && Intrinsics.c(this.c, addGiftCardResponse.c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f8288a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return a.o(au.com.woolworths.android.onesite.a.t("AddGiftCardResponse(success=", ", id=", this.b, ", message=", this.f8288a), this.c, ")");
    }
}
