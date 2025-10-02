package au.com.woolworths.shop.graphql.type;

import androidx.compose.ui.input.pointer.a;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/SyncListItemsInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SyncListItemsInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f11954a;
    public final double b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;

    public SyncListItemsInput(String str, double d, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        this.f11954a = str;
        this.b = d;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f = arrayList4;
        this.g = arrayList5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyncListItemsInput)) {
            return false;
        }
        SyncListItemsInput syncListItemsInput = (SyncListItemsInput) obj;
        return this.f11954a.equals(syncListItemsInput.f11954a) && Double.compare(this.b, syncListItemsInput.b) == 0 && this.c.equals(syncListItemsInput.c) && this.d.equals(syncListItemsInput.d) && this.e.equals(syncListItemsInput.e) && this.f.equals(syncListItemsInput.f) && this.g.equals(syncListItemsInput.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + a.b(a.b(a.b(a.b(android.support.v4.media.session.a.a(this.b, this.f11954a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbR = au.com.woolworths.android.onesite.a.r(this.b, "SyncListItemsInput(listId=", this.f11954a, ", timestamp=");
        sbR.append(", createdProductItems=");
        sbR.append(this.c);
        sbR.append(", createdFreeTextItems=");
        sbR.append(this.d);
        sbR.append(", updatedProductItems=");
        sbR.append(this.e);
        sbR.append(", updatedFreeTextItems=");
        sbR.append(this.f);
        sbR.append(", deletedItems=");
        sbR.append(this.g);
        sbR.append(")");
        return sbR.toString();
    }
}
