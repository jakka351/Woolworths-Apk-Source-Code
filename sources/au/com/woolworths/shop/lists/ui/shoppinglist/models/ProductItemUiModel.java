package au.com.woolworths.shop.lists.ui.shoppinglist.models;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.shop.lists.ui.shoppinglist.utils.ShoppingListsExtKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/models/ProductItemUiModel;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/models/ShoppingListItemUiModel;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductItemUiModel implements ShoppingListItemUiModel {

    /* renamed from: a, reason: collision with root package name */
    public final String f12432a;
    public final String b;
    public final long c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final ProductId g;
    public final float h;
    public final ProductCard i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final String o;
    public final List p;

    public ProductItemUiModel(String id, String listId, long j, long j2, boolean z, boolean z2, ProductId productId, float f, ProductCard productCard, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str, List list) {
        Intrinsics.h(id, "id");
        Intrinsics.h(listId, "listId");
        Intrinsics.h(productId, "productId");
        this.f12432a = id;
        this.b = listId;
        this.c = j;
        this.d = j2;
        this.e = z;
        this.f = z2;
        this.g = productId;
        this.h = f;
        this.i = productCard;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = z7;
        this.o = str;
        this.p = list;
    }

    public static ProductItemUiModel a(ProductItemUiModel productItemUiModel, boolean z, ProductCard productCard, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, ArrayList arrayList, int i) {
        String id = productItemUiModel.f12432a;
        String listId = productItemUiModel.b;
        long j = productItemUiModel.c;
        long j2 = productItemUiModel.d;
        boolean z7 = (i & 16) != 0 ? productItemUiModel.e : true;
        boolean z8 = (i & 32) != 0 ? productItemUiModel.f : z;
        ProductId productId = productItemUiModel.g;
        float f = productItemUiModel.h;
        ProductCard productCard2 = (i & 256) != 0 ? productItemUiModel.i : productCard;
        boolean z9 = (i & 512) != 0 ? productItemUiModel.j : z2;
        boolean z10 = (i & 1024) != 0 ? productItemUiModel.k : z3;
        boolean z11 = (i & 2048) != 0 ? productItemUiModel.l : z4;
        boolean z12 = z7;
        boolean z13 = (i & 4096) != 0 ? productItemUiModel.m : z5;
        boolean z14 = (i & 8192) != 0 ? productItemUiModel.n : z6;
        String buttonText = (i & 16384) != 0 ? productItemUiModel.o : str;
        List menuItems = (i & 32768) != 0 ? productItemUiModel.p : arrayList;
        productItemUiModel.getClass();
        Intrinsics.h(id, "id");
        Intrinsics.h(listId, "listId");
        Intrinsics.h(productId, "productId");
        Intrinsics.h(buttonText, "buttonText");
        Intrinsics.h(menuItems, "menuItems");
        return new ProductItemUiModel(id, listId, j, j2, z12, z8, productId, f, productCard2, z9, z10, z11, z13, z14, buttonText, menuItems);
    }

    public final boolean b() {
        ProductCard productCard = this.i;
        return productCard != null && ShoppingListsExtKt.e(productCard);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductItemUiModel)) {
            return false;
        }
        ProductItemUiModel productItemUiModel = (ProductItemUiModel) obj;
        return Intrinsics.c(this.f12432a, productItemUiModel.f12432a) && Intrinsics.c(this.b, productItemUiModel.b) && this.c == productItemUiModel.c && this.d == productItemUiModel.d && this.e == productItemUiModel.e && this.f == productItemUiModel.f && Intrinsics.c(this.g, productItemUiModel.g) && Float.compare(this.h, productItemUiModel.h) == 0 && Intrinsics.c(this.i, productItemUiModel.i) && this.j == productItemUiModel.j && this.k == productItemUiModel.k && this.l == productItemUiModel.l && this.m == productItemUiModel.m && this.n == productItemUiModel.n && Intrinsics.c(this.o, productItemUiModel.o) && Intrinsics.c(this.p, productItemUiModel.p);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.models.ShoppingListItemUiModel
    /* renamed from: getCreatedAt, reason: from getter */
    public final long getC() {
        return this.c;
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.models.ShoppingListItemUiModel
    /* renamed from: getUpdatedAt, reason: from getter */
    public final long getD() {
        return this.d;
    }

    public final int hashCode() {
        int iB = a.b(this.h, (this.g.hashCode() + b.e(b.e(b.b(b.b(b.c(this.f12432a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31, 31);
        ProductCard productCard = this.i;
        return this.p.hashCode() + b.c(b.e(b.e(b.e(b.e(b.e((iB + (productCard == null ? 0 : productCard.hashCode())) * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.models.ShoppingListItemUiModel
    /* renamed from: isChecked, reason: from getter */
    public final boolean getE() {
        return this.e;
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.models.ShoppingListItemUiModel
    /* renamed from: isVisible, reason: from getter */
    public final boolean getF() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("ProductItemUiModel(id=", this.f12432a, ", listId=", this.b, ", createdAt=");
        sbV.append(this.c);
        androidx.constraintlayout.core.state.a.A(sbV, ", updatedAt=", this.d, ", isChecked=");
        au.com.woolworths.android.onesite.a.D(sbV, this.e, ", isVisible=", this.f, ", productId=");
        sbV.append(this.g);
        sbV.append(", quantity=");
        sbV.append(this.h);
        sbV.append(", product=");
        sbV.append(this.i);
        sbV.append(", addToCartButtonEnabled=");
        sbV.append(this.j);
        sbV.append(", addToCartButtonVisible=");
        au.com.woolworths.android.onesite.a.D(sbV, this.k, ", viewSimilarItemsButtonVisible=", this.l, ", availabilityInfoButtonVisible=");
        au.com.woolworths.android.onesite.a.D(sbV, this.m, ", unavailableLabelVisible=", this.n, ", buttonText=");
        sbV.append(this.o);
        sbV.append(", menuItems=");
        sbV.append(this.p);
        sbV.append(")");
        return sbV.toString();
    }

    public /* synthetic */ ProductItemUiModel(String str, String str2, long j, long j2, boolean z, ProductId productId, float f, ProductCard productCard, int i) {
        this(str, str2, j, j2, z, false, productId, f, productCard, false, false, false, false, false, "", EmptyList.d);
    }
}
