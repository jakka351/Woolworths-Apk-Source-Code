package au.com.woolworths.shop.graphql.type;

import YU.a;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/LinkedGiftCardInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LinkedGiftCardInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f11520a;
    public final boolean b;
    public final int c;

    public LinkedGiftCardInput(String id, boolean z, int i) {
        Intrinsics.h(id, "id");
        this.f11520a = id;
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
        return Intrinsics.c(this.f11520a, linkedGiftCardInput.f11520a) && this.b == linkedGiftCardInput.b && this.c == linkedGiftCardInput.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + b.e(this.f11520a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return a.m(androidx.constraintlayout.core.state.a.q("LinkedGiftCardInput(id=", this.f11520a, ", isSelected=", ", amountRedeemed=", this.b), this.c, ")");
    }
}
