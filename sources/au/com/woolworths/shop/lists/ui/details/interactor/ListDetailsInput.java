package au.com.woolworths.shop.lists.ui.details.interactor;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/details/interactor/ListDetailsInput;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ListDetailsInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f12302a;
    public final List b;

    public ListDetailsInput(String str, List productItems) {
        Intrinsics.h(productItems, "productItems");
        this.f12302a = str;
        this.b = productItems;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListDetailsInput)) {
            return false;
        }
        ListDetailsInput listDetailsInput = (ListDetailsInput) obj;
        return Intrinsics.c(this.f12302a, listDetailsInput.f12302a) && Intrinsics.c(this.b, listDetailsInput.b);
    }

    public final int hashCode() {
        String str = this.f12302a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return a.i("ListDetailsInput(storeId=", this.f12302a, ", productItems=", ")", this.b);
    }
}
