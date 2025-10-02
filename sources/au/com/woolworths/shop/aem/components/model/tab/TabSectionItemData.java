package au.com.woolworths.shop.aem.components.model.tab;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/tab/TabSectionItemData;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TabSectionItemData {

    /* renamed from: a, reason: collision with root package name */
    public final String f10183a;
    public final String b;
    public final List c;

    public TabSectionItemData(String str, String str2, List list) {
        this.f10183a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabSectionItemData)) {
            return false;
        }
        TabSectionItemData tabSectionItemData = (TabSectionItemData) obj;
        return Intrinsics.c(this.f10183a, tabSectionItemData.f10183a) && Intrinsics.c(this.b, tabSectionItemData.b) && Intrinsics.c(this.c, tabSectionItemData.c);
    }

    public final int hashCode() {
        String str = this.f10183a;
        return this.c.hashCode() + b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return a.t(YU.a.v("TabSectionItemData(id=", this.f10183a, ", tabItemTitle=", this.b, ", tabItemFeed="), this.c, ")");
    }
}
