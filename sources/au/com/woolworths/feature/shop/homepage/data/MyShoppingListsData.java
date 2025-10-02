package au.com.woolworths.feature.shop.homepage.data;

import YU.a;
import androidx.compose.runtime.Immutable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/data/MyShoppingListsData;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MyShoppingListsData {

    /* renamed from: a, reason: collision with root package name */
    public final String f7202a;
    public final String b;
    public final String c;
    public final String d;
    public final transient List e;
    public final transient boolean f;

    public /* synthetic */ MyShoppingListsData(String str, String str2, String str3, String str4, List list, int i) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : list, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyShoppingListsData)) {
            return false;
        }
        MyShoppingListsData myShoppingListsData = (MyShoppingListsData) obj;
        return Intrinsics.c(this.f7202a, myShoppingListsData.f7202a) && Intrinsics.c(this.b, myShoppingListsData.b) && Intrinsics.c(this.c, myShoppingListsData.c) && Intrinsics.c(this.d, myShoppingListsData.d) && Intrinsics.c(this.e, myShoppingListsData.e) && this.f == myShoppingListsData.f;
    }

    public final int hashCode() {
        int iHashCode = this.f7202a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode4 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbV = a.v("MyShoppingListsData(title=", this.f7202a, ", subtitle=", this.b, ", actionTitle=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", deepLink=", this.d, ", items=");
        sbV.append(this.e);
        sbV.append(", showBuyAgain=");
        sbV.append(this.f);
        sbV.append(")");
        return sbV.toString();
    }

    public MyShoppingListsData(String title, String str, String str2, String str3, List list, boolean z) {
        Intrinsics.h(title, "title");
        this.f7202a = title;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = z;
    }
}
