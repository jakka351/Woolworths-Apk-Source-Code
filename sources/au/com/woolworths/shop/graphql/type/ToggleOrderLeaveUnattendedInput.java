package au.com.woolworths.shop.graphql.type;

import au.com.woolworths.android.onesite.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ToggleOrderLeaveUnattendedInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ToggleOrderLeaveUnattendedInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f11970a;
    public final boolean b;

    public ToggleOrderLeaveUnattendedInput(String orderId, boolean z) {
        Intrinsics.h(orderId, "orderId");
        this.f11970a = orderId;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToggleOrderLeaveUnattendedInput)) {
            return false;
        }
        ToggleOrderLeaveUnattendedInput toggleOrderLeaveUnattendedInput = (ToggleOrderLeaveUnattendedInput) obj;
        return Intrinsics.c(this.f11970a, toggleOrderLeaveUnattendedInput.f11970a) && this.b == toggleOrderLeaveUnattendedInput.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f11970a.hashCode() * 31);
    }

    public final String toString() {
        return a.j("ToggleOrderLeaveUnattendedInput(orderId=", this.f11970a, ", leaveUnattendedEnabled=", this.b, ")");
    }
}
