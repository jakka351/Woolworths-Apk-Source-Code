package au.com.woolworths.feature.shop.editorder.review.data;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/data/ChangeMyOrderDetailsSection;", "", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ChangeMyOrderDetailsSection {

    /* renamed from: a, reason: collision with root package name */
    public final String f7120a;
    public final String b;
    public final List c;

    public ChangeMyOrderDetailsSection(String str, String str2, List list) {
        this.f7120a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeMyOrderDetailsSection)) {
            return false;
        }
        ChangeMyOrderDetailsSection changeMyOrderDetailsSection = (ChangeMyOrderDetailsSection) obj;
        return Intrinsics.c(this.f7120a, changeMyOrderDetailsSection.f7120a) && Intrinsics.c(this.b, changeMyOrderDetailsSection.b) && Intrinsics.c(this.c, changeMyOrderDetailsSection.c);
    }

    public final int hashCode() {
        int iHashCode = this.f7120a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return a.t(YU.a.v("ChangeMyOrderDetailsSection(title=", this.f7120a, ", subtitle=", this.b, ", items="), this.c, ")");
    }
}
