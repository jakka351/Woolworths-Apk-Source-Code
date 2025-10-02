package au.com.woolworths.shop.checkout.domain.model.timeselector;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import java.util.ArrayList;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/timeselector/FulfilmentWindowsSuggestedGroup;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FulfilmentWindowsSuggestedGroup {

    /* renamed from: a, reason: collision with root package name */
    public final String f10673a;
    public final ArrayList b;
    public final FulfilmentBottomSheet c;

    public FulfilmentWindowsSuggestedGroup(String str, ArrayList arrayList, FulfilmentBottomSheet fulfilmentBottomSheet) {
        this.f10673a = str;
        this.b = arrayList;
        this.c = fulfilmentBottomSheet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FulfilmentWindowsSuggestedGroup)) {
            return false;
        }
        FulfilmentWindowsSuggestedGroup fulfilmentWindowsSuggestedGroup = (FulfilmentWindowsSuggestedGroup) obj;
        return this.f10673a.equals(fulfilmentWindowsSuggestedGroup.f10673a) && this.b.equals(fulfilmentWindowsSuggestedGroup.b) && this.c.equals(fulfilmentWindowsSuggestedGroup.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + a.b(this.f10673a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbX = d.x("FulfilmentWindowsSuggestedGroup(title=", this.f10673a, ", slots=", ", bottomSheet=", this.b);
        sbX.append(this.c);
        sbX.append(")");
        return sbX.toString();
    }
}
