package au.com.woolworths.shop.lists.ui.magicmatch.models;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/magicmatch/models/MagicMatchProductListData;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MagicMatchProductListData {

    /* renamed from: a, reason: collision with root package name */
    public final String f12361a;
    public final String b;
    public final MatchProductByQuantityData c;
    public final ArrayList d;

    public MagicMatchProductListData(String str, String str2, MatchProductByQuantityData matchProductByQuantityData, ArrayList arrayList) {
        this.f12361a = str;
        this.b = str2;
        this.c = matchProductByQuantityData;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagicMatchProductListData)) {
            return false;
        }
        MagicMatchProductListData magicMatchProductListData = (MagicMatchProductListData) obj;
        return this.f12361a.equals(magicMatchProductListData.f12361a) && this.b.equals(magicMatchProductListData.b) && Intrinsics.c(this.c, magicMatchProductListData.c) && this.d.equals(magicMatchProductListData.d);
    }

    public final int hashCode() {
        int iC = b.c(this.f12361a.hashCode() * 31, 31, this.b);
        MatchProductByQuantityData matchProductByQuantityData = this.c;
        return this.d.hashCode() + ((iC + (matchProductByQuantityData == null ? 0 : matchProductByQuantityData.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbV = a.v("MagicMatchProductListData(searchText=", this.f12361a, ", listItemId=", this.b, ", matchedProduct=");
        sbV.append(this.c);
        sbV.append(", suggestedProductList=");
        sbV.append(this.d);
        sbV.append(")");
        return sbV.toString();
    }
}
