package au.com.woolworths.dynamic.page.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/dynamic/page/data/CategoryTileListData;", "Lau/com/woolworths/dynamic/page/data/FeedItemData;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CategoryTileListData implements FeedItemData {

    /* renamed from: a, reason: collision with root package name */
    public final String f5180a;
    public final List b;

    public CategoryTileListData(String str, List list) {
        this.f5180a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryTileListData)) {
            return false;
        }
        CategoryTileListData categoryTileListData = (CategoryTileListData) obj;
        return Intrinsics.c(this.f5180a, categoryTileListData.f5180a) && Intrinsics.c(this.b, categoryTileListData.b);
    }

    public final int hashCode() {
        String str = this.f5180a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return a.i("CategoryTileListData(title=", this.f5180a, ", tiles=", ")", this.b);
    }
}
