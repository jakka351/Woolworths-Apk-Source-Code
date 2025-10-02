package au.com.woolworths.shop.lists.ui.shoppinglist.main;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.lists.ui.shoppinglist.utils.TrolleyResultWithMessage;
import java.util.ArrayList;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/BoostProductsGraphQl;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BoostProductsGraphQl {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12376a;
    public final TrolleyResultWithMessage b;
    public final ArrayList c;

    public BoostProductsGraphQl(ArrayList arrayList, TrolleyResultWithMessage trolleyResultWithMessage, ArrayList arrayList2) {
        this.f12376a = arrayList;
        this.b = trolleyResultWithMessage;
        this.c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoostProductsGraphQl)) {
            return false;
        }
        BoostProductsGraphQl boostProductsGraphQl = (BoostProductsGraphQl) obj;
        return this.f12376a.equals(boostProductsGraphQl.f12376a) && this.b.equals(boostProductsGraphQl.b) && this.c.equals(boostProductsGraphQl.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f12376a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoostProductsGraphQl(updatedProducts=");
        sb.append(this.f12376a);
        sb.append(", resultWithMessage=");
        sb.append(this.b);
        sb.append(", boostedProductId=");
        return android.support.v4.media.session.a.q(")", sb, this.c);
    }
}
