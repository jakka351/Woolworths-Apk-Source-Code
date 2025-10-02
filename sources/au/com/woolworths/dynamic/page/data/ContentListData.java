package au.com.woolworths.dynamic.page.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/dynamic/page/data/ContentListData;", "Lau/com/woolworths/dynamic/page/data/FeedItemData;", "Lau/com/woolworths/dynamic/page/data/BottomSheetFeedItemData;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ContentListData implements FeedItemData, BottomSheetFeedItemData {

    /* renamed from: a, reason: collision with root package name */
    public final String f5181a;
    public final List b;

    public ContentListData(String str, List list) {
        this.f5181a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentListData)) {
            return false;
        }
        ContentListData contentListData = (ContentListData) obj;
        return Intrinsics.c(this.f5181a, contentListData.f5181a) && Intrinsics.c(this.b, contentListData.b);
    }

    public final int hashCode() {
        String str = this.f5181a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return a.i("ContentListData(title=", this.f5181a, ", contentListItems=", ")", this.b);
    }
}
