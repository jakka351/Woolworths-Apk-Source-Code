package au.com.woolworths.shop.graphql.type;

import YU.a;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/AddGiftCardInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AddGiftCardInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f11006a;
    public final String b;
    public final boolean c;

    public AddGiftCardInput(String number, String pin, boolean z) {
        Intrinsics.h(number, "number");
        Intrinsics.h(pin, "pin");
        this.f11006a = number;
        this.b = pin;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddGiftCardInput)) {
            return false;
        }
        AddGiftCardInput addGiftCardInput = (AddGiftCardInput) obj;
        return Intrinsics.c(this.f11006a, addGiftCardInput.f11006a) && Intrinsics.c(this.b, addGiftCardInput.b) && this.c == addGiftCardInput.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + b.c(this.f11006a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return a.k(")", a.v("AddGiftCardInput(number=", this.f11006a, ", pin=", this.b, ", link="), this.c);
    }
}
