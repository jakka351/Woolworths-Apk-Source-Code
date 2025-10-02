package au.com.woolworths.dynamic.page.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/dynamic/page/data/QuickLinkListData;", "Lau/com/woolworths/dynamic/page/data/FeedItemData;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class QuickLinkListData implements FeedItemData {

    /* renamed from: a, reason: collision with root package name */
    public final List f5188a;

    public QuickLinkListData(List list) {
        this.f5188a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof QuickLinkListData) && Intrinsics.c(this.f5188a, ((QuickLinkListData) obj).f5188a);
    }

    public final int hashCode() {
        return this.f5188a.hashCode();
    }

    public final String toString() {
        return a.l("QuickLinkListData(items=", ")", this.f5188a);
    }
}
