package au.com.woolworths.shop.aem.components.model.verticallist;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/verticallist/VerticalListData;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class VerticalListData {

    /* renamed from: a, reason: collision with root package name */
    public final String f10186a;
    public final String b;
    public final ArrayList c;
    public final VerticalListActionData d;

    public VerticalListData(String str, String str2, ArrayList arrayList, VerticalListActionData verticalListActionData) {
        this.f10186a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = verticalListActionData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerticalListData)) {
            return false;
        }
        VerticalListData verticalListData = (VerticalListData) obj;
        return Intrinsics.c(this.f10186a, verticalListData.f10186a) && Intrinsics.c(this.b, verticalListData.b) && this.c.equals(verticalListData.c) && Intrinsics.c(this.d, verticalListData.d);
    }

    public final int hashCode() {
        String str = this.f10186a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iB = a.b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c);
        VerticalListActionData verticalListActionData = this.d;
        return iB + (verticalListActionData != null ? verticalListActionData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("VerticalListData(verticalListTitle=", this.f10186a, ", verticalListSubtitle=", this.b, ", verticalListItems=");
        sbV.append(this.c);
        sbV.append(", verticalListAction=");
        sbV.append(this.d);
        sbV.append(")");
        return sbV.toString();
    }
}
