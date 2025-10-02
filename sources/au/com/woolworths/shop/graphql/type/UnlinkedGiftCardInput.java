package au.com.woolworths.shop.graphql.type;

import YU.a;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/UnlinkedGiftCardInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UnlinkedGiftCardInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f11989a;
    public final String b;
    public final boolean c;
    public final int d;

    public UnlinkedGiftCardInput(String str, int i, String str2, boolean z) {
        this.f11989a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnlinkedGiftCardInput)) {
            return false;
        }
        UnlinkedGiftCardInput unlinkedGiftCardInput = (UnlinkedGiftCardInput) obj;
        return Intrinsics.c(this.f11989a, unlinkedGiftCardInput.f11989a) && Intrinsics.c(this.b, unlinkedGiftCardInput.b) && this.c == unlinkedGiftCardInput.c && this.d == unlinkedGiftCardInput.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + b.e(b.c(this.f11989a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbV = a.v("UnlinkedGiftCardInput(number=", this.f11989a, ", pin=", this.b, ", isSelected=");
        sbV.append(this.c);
        sbV.append(", amountRedeemed=");
        sbV.append(this.d);
        sbV.append(")");
        return sbV.toString();
    }
}
