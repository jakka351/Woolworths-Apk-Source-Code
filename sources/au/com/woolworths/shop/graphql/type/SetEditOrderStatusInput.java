package au.com.woolworths.shop.graphql.type;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/SetEditOrderStatusInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SetEditOrderStatusInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f11892a;
    public final EditOrderMode b;

    public SetEditOrderStatusInput(String orderId, EditOrderMode editOrderMode) {
        Intrinsics.h(orderId, "orderId");
        this.f11892a = orderId;
        this.b = editOrderMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetEditOrderStatusInput)) {
            return false;
        }
        SetEditOrderStatusInput setEditOrderStatusInput = (SetEditOrderStatusInput) obj;
        return Intrinsics.c(this.f11892a, setEditOrderStatusInput.f11892a) && this.b == setEditOrderStatusInput.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11892a.hashCode() * 31);
    }

    public final String toString() {
        return "SetEditOrderStatusInput(orderId=" + this.f11892a + ", mode=" + this.b + ")";
    }
}
