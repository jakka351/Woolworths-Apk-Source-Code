package au.com.woolworths.shop.aem.components.model.tab;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shop.aem.components.model.GenericPageFeedItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/tab/TabSectionData;", "Lau/com/woolworths/shop/aem/components/model/GenericPageFeedItem;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TabSectionData implements GenericPageFeedItem {

    /* renamed from: a, reason: collision with root package name */
    public final String f10182a;
    public final List b;

    public TabSectionData(String str, List list) {
        this.f10182a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabSectionData)) {
            return false;
        }
        TabSectionData tabSectionData = (TabSectionData) obj;
        return Intrinsics.c(this.f10182a, tabSectionData.f10182a) && Intrinsics.c(this.b, tabSectionData.b);
    }

    public final int hashCode() {
        String str = this.f10182a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return a.i("TabSectionData(id=", this.f10182a, ", tabSectionItems=", ")", this.b);
    }
}
