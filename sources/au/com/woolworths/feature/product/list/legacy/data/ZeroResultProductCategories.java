package au.com.woolworths.feature.product.list.legacy.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/data/ZeroResultProductCategories;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ZeroResultProductCategories {

    /* renamed from: a, reason: collision with root package name */
    public final String f5370a;
    public final ArrayList b;

    public ZeroResultProductCategories(String str, ArrayList arrayList) {
        this.f5370a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZeroResultProductCategories)) {
            return false;
        }
        ZeroResultProductCategories zeroResultProductCategories = (ZeroResultProductCategories) obj;
        return Intrinsics.c(this.f5370a, zeroResultProductCategories.f5370a) && this.b.equals(zeroResultProductCategories.b);
    }

    public final int hashCode() {
        String str = this.f5370a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return d.q("ZeroResultProductCategories(zeroResultProductCategoriesTitle=", this.f5370a, ", zeroResultProductCategoriesItems=", ")", this.b);
    }
}
