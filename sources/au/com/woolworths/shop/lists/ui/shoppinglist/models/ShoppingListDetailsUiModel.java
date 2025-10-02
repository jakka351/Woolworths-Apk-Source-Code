package au.com.woolworths.shop.lists.ui.shoppinglist.models;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.lists.data.model.ShoppingList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/models/ShoppingListDetailsUiModel;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final /* data */ class ShoppingListDetailsUiModel {

    /* renamed from: a, reason: collision with root package name */
    public final ShoppingList f12434a;
    public final List b;
    public final List c;

    public ShoppingListDetailsUiModel(ShoppingList shoppingList, List list, List list2) {
        Intrinsics.h(shoppingList, "shoppingList");
        this.f12434a = shoppingList;
        this.b = list;
        this.c = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    public static ShoppingListDetailsUiModel a(ShoppingListDetailsUiModel shoppingListDetailsUiModel, ArrayList arrayList, ArrayList arrayList2, int i) {
        ShoppingList shoppingList = shoppingListDetailsUiModel.f12434a;
        ArrayList arrayList3 = arrayList;
        if ((i & 2) != 0) {
            arrayList3 = shoppingListDetailsUiModel.b;
        }
        ArrayList arrayList4 = arrayList2;
        if ((i & 4) != 0) {
            arrayList4 = shoppingListDetailsUiModel.c;
        }
        Intrinsics.h(shoppingList, "shoppingList");
        return new ShoppingListDetailsUiModel(shoppingList, arrayList3, arrayList4);
    }

    public final int b() {
        boolean zC = Intrinsics.c(this.f12434a.isWatchlist(), Boolean.TRUE);
        List list = this.b;
        if (!zC) {
            return this.c.size() + list.size();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((ProductItemUiModel) obj).e) {
                arrayList.add(obj);
            }
        }
        return arrayList.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoppingListDetailsUiModel)) {
            return false;
        }
        ShoppingListDetailsUiModel shoppingListDetailsUiModel = (ShoppingListDetailsUiModel) obj;
        return Intrinsics.c(this.f12434a, shoppingListDetailsUiModel.f12434a) && Intrinsics.c(this.b, shoppingListDetailsUiModel.b) && Intrinsics.c(this.c, shoppingListDetailsUiModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b.d(this.f12434a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShoppingListDetailsUiModel(shoppingList=");
        sb.append(this.f12434a);
        sb.append(", productItems=");
        sb.append(this.b);
        sb.append(", textItems=");
        return a.t(sb, this.c, ")");
    }
}
