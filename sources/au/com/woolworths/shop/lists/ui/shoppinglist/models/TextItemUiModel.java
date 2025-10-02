package au.com.woolworths.shop.lists.ui.shoppinglist.models;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/models/TextItemUiModel;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/models/ShoppingListItemUiModel;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TextItemUiModel implements ShoppingListItemUiModel {

    /* renamed from: a, reason: collision with root package name */
    public final String f12435a;
    public final String b;
    public final long c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final String g;

    public TextItemUiModel(String id, String listId, long j, long j2, boolean z, boolean z2, String text) {
        Intrinsics.h(id, "id");
        Intrinsics.h(listId, "listId");
        Intrinsics.h(text, "text");
        this.f12435a = id;
        this.b = listId;
        this.c = j;
        this.d = j2;
        this.e = z;
        this.f = z2;
        this.g = text;
    }

    public static TextItemUiModel a(TextItemUiModel textItemUiModel, String str, int i) {
        String id = textItemUiModel.f12435a;
        String listId = textItemUiModel.b;
        long j = textItemUiModel.c;
        long j2 = textItemUiModel.d;
        boolean z = (i & 16) != 0 ? textItemUiModel.e : true;
        boolean z2 = textItemUiModel.f;
        if ((i & 64) != 0) {
            str = textItemUiModel.g;
        }
        String text = str;
        textItemUiModel.getClass();
        Intrinsics.h(id, "id");
        Intrinsics.h(listId, "listId");
        Intrinsics.h(text, "text");
        return new TextItemUiModel(id, listId, j, j2, z, z2, text);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextItemUiModel)) {
            return false;
        }
        TextItemUiModel textItemUiModel = (TextItemUiModel) obj;
        return Intrinsics.c(this.f12435a, textItemUiModel.f12435a) && Intrinsics.c(this.b, textItemUiModel.b) && this.c == textItemUiModel.c && this.d == textItemUiModel.d && this.e == textItemUiModel.e && this.f == textItemUiModel.f && Intrinsics.c(this.g, textItemUiModel.g);
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
        return this.g.hashCode() + b.e(b.e(b.b(b.b(b.c(this.f12435a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
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
        StringBuilder sbV = a.v("TextItemUiModel(id=", this.f12435a, ", listId=", this.b, ", createdAt=");
        sbV.append(this.c);
        androidx.constraintlayout.core.state.a.A(sbV, ", updatedAt=", this.d, ", isChecked=");
        au.com.woolworths.android.onesite.a.D(sbV, this.e, ", isVisible=", this.f, ", text=");
        return a.o(sbV, this.g, ")");
    }

    public /* synthetic */ TextItemUiModel(String str, String str2, long j, long j2, boolean z, String str3, int i) {
        this((i & 1) != 0 ? "" : str, str2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? 0L : j2, (i & 16) != 0 ? false : z, true, str3);
    }
}
