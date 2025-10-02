package au.com.woolworths.shop.lists.data.sync.scheduler;

import androidx.work.WorkInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/data/sync/scheduler/WorkData;", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class WorkData {

    /* renamed from: a, reason: collision with root package name */
    public final String f12293a;
    public WorkInfo.State b = null;

    public WorkData(String str) {
        this.f12293a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkData)) {
            return false;
        }
        WorkData workData = (WorkData) obj;
        return Intrinsics.c(this.f12293a, workData.f12293a) && this.b == workData.b;
    }

    public final int hashCode() {
        int iHashCode = this.f12293a.hashCode() * 31;
        WorkInfo.State state = this.b;
        return iHashCode + (state == null ? 0 : state.hashCode());
    }

    public final String toString() {
        return "WorkData(tag=" + this.f12293a + ", state=" + this.b + ")";
    }
}
