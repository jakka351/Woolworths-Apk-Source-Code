package au.com.woolworths.shop.lists.ui.shoppinglist.models;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/models/ProductMenuItem;", "", "Companion", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductMenuItem {

    /* renamed from: a, reason: collision with root package name */
    public final String f12433a;
    public final String b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/models/ProductMenuItem$Companion;", "", "", "ValueSwapsAction", "Ljava/lang/String;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ProductMenuItem(String str, String str2) {
        this.f12433a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductMenuItem)) {
            return false;
        }
        ProductMenuItem productMenuItem = (ProductMenuItem) obj;
        return Intrinsics.c(this.f12433a, productMenuItem.f12433a) && Intrinsics.c(this.b, productMenuItem.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12433a.hashCode() * 31);
    }

    public final String toString() {
        return a.j("ProductMenuItem(action=", this.f12433a, ", label=", this.b, ")");
    }
}
