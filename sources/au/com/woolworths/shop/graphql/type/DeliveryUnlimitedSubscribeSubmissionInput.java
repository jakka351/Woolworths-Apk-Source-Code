package au.com.woolworths.shop.graphql.type;

import au.com.woolworths.android.onesite.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/DeliveryUnlimitedSubscribeSubmissionInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeliveryUnlimitedSubscribeSubmissionInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f11335a;
    public final java.util.List b;

    public DeliveryUnlimitedSubscribeSubmissionInput(String str, java.util.List list) {
        this.f11335a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryUnlimitedSubscribeSubmissionInput)) {
            return false;
        }
        DeliveryUnlimitedSubscribeSubmissionInput deliveryUnlimitedSubscribeSubmissionInput = (DeliveryUnlimitedSubscribeSubmissionInput) obj;
        return Intrinsics.c(this.f11335a, deliveryUnlimitedSubscribeSubmissionInput.f11335a) && Intrinsics.c(this.b, deliveryUnlimitedSubscribeSubmissionInput.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11335a.hashCode() * 31);
    }

    public final String toString() {
        return a.i("DeliveryUnlimitedSubscribeSubmissionInput(planId=", this.f11335a, ", instruments=", ")", this.b);
    }
}
