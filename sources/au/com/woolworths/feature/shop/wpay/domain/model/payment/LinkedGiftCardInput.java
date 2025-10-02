package au.com.woolworths.feature.shop.wpay.domain.model.payment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/LinkedGiftCardInput;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LinkedGiftCardInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f8300a;
    public final boolean b;
    public final int c;

    public LinkedGiftCardInput(String id, boolean z, int i) {
        Intrinsics.h(id, "id");
        this.f8300a = id;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkedGiftCardInput)) {
            return false;
        }
        LinkedGiftCardInput linkedGiftCardInput = (LinkedGiftCardInput) obj;
        return Intrinsics.c(this.f8300a, linkedGiftCardInput.f8300a) && this.b == linkedGiftCardInput.b && this.c == linkedGiftCardInput.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + b.e(this.f8300a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return a.m(androidx.constraintlayout.core.state.a.q("LinkedGiftCardInput(id=", this.f8300a, ", isSelected=", ", amountRedeemed=", this.b), this.c, ")");
    }
}
