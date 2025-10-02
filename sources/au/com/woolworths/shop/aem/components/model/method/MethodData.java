package au.com.woolworths.shop.aem.components.model.method;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.shop.aem.components.model.GenericPageFeedItem;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/method/MethodData;", "Lau/com/woolworths/shop/aem/components/model/GenericPageFeedItem;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MethodData implements GenericPageFeedItem {

    /* renamed from: a, reason: collision with root package name */
    public final MethodDescription f10173a;
    public final ArrayList b;
    public final String c;
    public final String d;
    public final String e;

    public MethodData(MethodDescription methodDescription, ArrayList arrayList, String str, String str2, String str3) {
        this.f10173a = methodDescription;
        this.b = arrayList;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MethodData)) {
            return false;
        }
        MethodData methodData = (MethodData) obj;
        return Intrinsics.c(this.f10173a, methodData.f10173a) && this.b.equals(methodData.b) && Intrinsics.c(this.c, methodData.c) && Intrinsics.c(this.d, methodData.d) && Intrinsics.c(this.e, methodData.e);
    }

    public final int hashCode() {
        MethodDescription methodDescription = this.f10173a;
        int iB = a.b((methodDescription == null ? 0 : methodDescription.hashCode()) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MethodData(description=");
        sb.append(this.f10173a);
        sb.append(", items=");
        sb.append(this.b);
        sb.append(", disclaimer=");
        androidx.constraintlayout.core.state.a.B(sb, this.c, ", panelTitle=", this.d, ", caption=");
        return YU.a.o(sb, this.e, ")");
    }
}
