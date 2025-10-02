package au.com.woolworths.shop.lists.ui.details.interactor;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.lists.ui.details.models.ListDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/details/interactor/ListDetailsResult;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ListDetailsResult {

    /* renamed from: a, reason: collision with root package name */
    public final ListDetailsInput f12305a;
    public final ListDetails b;

    public ListDetailsResult(ListDetailsInput listDetailsInput, ListDetails output) {
        Intrinsics.h(output, "output");
        this.f12305a = listDetailsInput;
        this.b = output;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListDetailsResult)) {
            return false;
        }
        ListDetailsResult listDetailsResult = (ListDetailsResult) obj;
        return Intrinsics.c(this.f12305a, listDetailsResult.f12305a) && Intrinsics.c(this.b, listDetailsResult.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12305a.hashCode() * 31);
    }

    public final String toString() {
        return "ListDetailsResult(input=" + this.f12305a + ", output=" + this.b + ")";
    }
}
