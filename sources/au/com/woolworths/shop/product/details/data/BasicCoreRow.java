package au.com.woolworths.shop.product.details.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.sdui.common.corerow.model.CoreRowModel;
import au.com.woolworths.sdui.model.action.ActionData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/data/BasicCoreRow;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BasicCoreRow {

    /* renamed from: a, reason: collision with root package name */
    public final CoreRowModel f12595a;
    public final ActionData b;

    public BasicCoreRow(CoreRowModel coreRowModel, ActionData actionData) {
        this.f12595a = coreRowModel;
        this.b = actionData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasicCoreRow)) {
            return false;
        }
        BasicCoreRow basicCoreRow = (BasicCoreRow) obj;
        return Intrinsics.c(this.f12595a, basicCoreRow.f12595a) && Intrinsics.c(this.b, basicCoreRow.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12595a.hashCode() * 31);
    }

    public final String toString() {
        return "BasicCoreRow(row=" + this.f12595a + ", action=" + this.b + ")";
    }
}
