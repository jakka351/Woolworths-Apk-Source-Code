package au.com.woolworths.feature.shop.homepage.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/data/MyShoppingListItemData;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MyShoppingListItemData {

    /* renamed from: a, reason: collision with root package name */
    public final String f7201a;
    public final String b;
    public final int c;
    public final long d;
    public final String e;

    public MyShoppingListItemData(int i, long j, String listId, String title, String containerTitle) {
        Intrinsics.h(listId, "listId");
        Intrinsics.h(title, "title");
        Intrinsics.h(containerTitle, "containerTitle");
        this.f7201a = listId;
        this.b = title;
        this.c = i;
        this.d = j;
        this.e = containerTitle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyShoppingListItemData)) {
            return false;
        }
        MyShoppingListItemData myShoppingListItemData = (MyShoppingListItemData) obj;
        return Intrinsics.c(this.f7201a, myShoppingListItemData.f7201a) && Intrinsics.c(this.b, myShoppingListItemData.b) && this.c == myShoppingListItemData.c && Color.c(this.d, myShoppingListItemData.d) && Intrinsics.c(this.e, myShoppingListItemData.e);
    }

    public final int hashCode() {
        int iA = b.a(this.c, b.c(this.f7201a.hashCode() * 31, 31, this.b), 31);
        int i = Color.l;
        return this.e.hashCode() + b.b(iA, 31, this.d);
    }

    public final String toString() {
        String strI = Color.i(this.d);
        StringBuilder sbV = a.v("MyShoppingListItemData(listId=", this.f7201a, ", title=", this.b, ", itemCount=");
        androidx.compose.ui.input.pointer.a.u(this.c, ", iconTint=", strI, ", containerTitle=", sbV);
        return a.o(sbV, this.e, ")");
    }
}
