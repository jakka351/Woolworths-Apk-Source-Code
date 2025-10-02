package au.com.woolworths.foundation.rewards.cart.update.data.model;

import YU.a;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/cart/update/data/model/UpdatedCartQuantity;", "", "cart-update-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpdatedCartQuantity {

    /* renamed from: a, reason: collision with root package name */
    public final String f8567a;
    public final int b;
    public final boolean c;

    public UpdatedCartQuantity(String str, int i, boolean z) {
        this.f8567a = str;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdatedCartQuantity)) {
            return false;
        }
        UpdatedCartQuantity updatedCartQuantity = (UpdatedCartQuantity) obj;
        return Intrinsics.c(this.f8567a, updatedCartQuantity.f8567a) && this.b == updatedCartQuantity.b && this.c == updatedCartQuantity.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + b.a(this.b, this.f8567a.hashCode() * 31, 31);
    }

    public final String toString() {
        return a.k(")", b.u("UpdatedCartQuantity(productId=", this.b, this.f8567a, ", updatedQuantity=", ", success="), this.c);
    }
}
