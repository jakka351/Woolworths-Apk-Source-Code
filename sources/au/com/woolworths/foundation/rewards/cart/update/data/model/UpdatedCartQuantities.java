package au.com.woolworths.foundation.rewards.cart.update.data.model;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/cart/update/data/model/UpdatedCartQuantities;", "", "cart-update-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpdatedCartQuantities {

    /* renamed from: a, reason: collision with root package name */
    public final int f8566a;
    public final Object b;
    public final int c;
    public final String d;
    public final Object e;

    public UpdatedCartQuantities(int i, List list, int i2, String str, Object obj) {
        this.f8566a = i;
        this.b = list;
        this.c = i2;
        this.d = str;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdatedCartQuantities)) {
            return false;
        }
        UpdatedCartQuantities updatedCartQuantities = (UpdatedCartQuantities) obj;
        return this.f8566a == updatedCartQuantities.f8566a && this.b.equals(updatedCartQuantities.b) && this.c == updatedCartQuantities.c && this.d.equals(updatedCartQuantities.d) && this.e.equals(updatedCartQuantities.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + b.c(b.a(this.c, a.e(Integer.hashCode(this.f8566a) * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdatedCartQuantities(productCount=");
        sb.append(this.f8566a);
        sb.append(", updatedCartQuantities=");
        sb.append(this.b);
        sb.append(", totalProductCount=");
        androidx.compose.ui.input.pointer.a.u(this.c, ", totalProductCountAltText=", this.d, ", totalPrice=", sb);
        return a.o(this.e, ")", sb);
    }
}
