package au.com.woolworths.feature.shop.modeselector.model;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/model/Item;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Item {

    /* renamed from: a, reason: collision with root package name */
    public final ShoppingModeVariant f7528a;
    public final ShoppingModeSelectorOptionStateApiData b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;
    public final BadgeData g;
    public final List h;

    public Item(ShoppingModeVariant shoppingModeVariant, ShoppingModeSelectorOptionStateApiData shoppingModeSelectorOptionStateApiData, String str, String str2, String str3, List list, BadgeData badgeData, List list2) {
        this.f7528a = shoppingModeVariant;
        this.b = shoppingModeSelectorOptionStateApiData;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = list;
        this.g = badgeData;
        this.h = list2;
    }

    public static Item a(Item item, int i) {
        ShoppingModeSelectorOptionStateApiData shoppingModeSelectorOptionStateApiData = ShoppingModeSelectorOptionStateApiData.e;
        ShoppingModeVariant shoppingModeVariant = item.f7528a;
        if ((i & 2) != 0) {
            shoppingModeSelectorOptionStateApiData = item.b;
        }
        ShoppingModeSelectorOptionStateApiData shoppingModeSelectorOptionStateApiData2 = shoppingModeSelectorOptionStateApiData;
        String str = item.c;
        String str2 = item.d;
        String str3 = item.e;
        List list = item.f;
        BadgeData badgeData = (i & 64) != 0 ? item.g : null;
        List list2 = item.h;
        item.getClass();
        return new Item(shoppingModeVariant, shoppingModeSelectorOptionStateApiData2, str, str2, str3, list, badgeData, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Item)) {
            return false;
        }
        Item item = (Item) obj;
        return this.f7528a == item.f7528a && this.b == item.b && Intrinsics.c(this.c, item.c) && Intrinsics.c(this.d, item.d) && Intrinsics.c(this.e, item.e) && Intrinsics.c(this.f, item.f) && Intrinsics.c(this.g, item.g) && Intrinsics.c(this.h, item.h);
    }

    public final int hashCode() {
        int iC = b.c(b.c((this.b.hashCode() + (this.f7528a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        BadgeData badgeData = this.g;
        return this.h.hashCode() + ((iHashCode2 + (badgeData != null ? badgeData.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Item(id=");
        sb.append(this.f7528a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", title=");
        a.B(sb, this.c, ", subtitle=", this.d, ", price=");
        au.com.woolworths.android.onesite.a.B(sb, this.e, ", fulfilment=", this.f, ", badge=");
        sb.append(this.g);
        sb.append(", conditions=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
