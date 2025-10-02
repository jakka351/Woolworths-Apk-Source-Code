package au.com.woolworths.shop.aem.components.model.horizontalList;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.aem.components.model.GenericPageFeedItem;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/horizontalList/HorizontalListData;", "Lau/com/woolworths/shop/aem/components/model/GenericPageFeedItem;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HorizontalListData implements GenericPageFeedItem {

    /* renamed from: a, reason: collision with root package name */
    public final String f10168a;
    public final String b;
    public final String c;
    public final String d;
    public final ArrayList e;

    public HorizontalListData(String str, String str2, String str3, String str4, ArrayList arrayList) {
        this.f10168a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HorizontalListData)) {
            return false;
        }
        HorizontalListData horizontalListData = (HorizontalListData) obj;
        return Intrinsics.c(this.f10168a, horizontalListData.f10168a) && this.b.equals(horizontalListData.b) && Intrinsics.c(this.c, horizontalListData.c) && Intrinsics.c(this.d, horizontalListData.d) && this.e.equals(horizontalListData.e);
    }

    public final int hashCode() {
        String str = this.f10168a;
        int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return this.e.hashCode() + ((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbV = a.v("HorizontalListData(id=", this.f10168a, ", title=", this.b, ", actionTitle=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", deepLink=", this.d, ", items=");
        return android.support.v4.media.session.a.q(")", sbV, this.e);
    }
}
