package au.com.woolworths.dynamic.page.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/dynamic/page/data/DynamicPageActionData;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DynamicPageActionData {

    /* renamed from: a, reason: collision with root package name */
    public final String f5183a;
    public final String b;
    public final AnalyticsData c;

    public DynamicPageActionData(String str, String str2, AnalyticsData analyticsData) {
        this.f5183a = str;
        this.b = str2;
        this.c = analyticsData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicPageActionData)) {
            return false;
        }
        DynamicPageActionData dynamicPageActionData = (DynamicPageActionData) obj;
        return Intrinsics.c(this.f5183a, dynamicPageActionData.f5183a) && Intrinsics.c(this.b, dynamicPageActionData.b) && Intrinsics.c(this.c, dynamicPageActionData.c);
    }

    public final int hashCode() {
        int iC = b.c(this.f5183a.hashCode() * 31, 31, this.b);
        AnalyticsData analyticsData = this.c;
        return iC + (analyticsData == null ? 0 : analyticsData.hashCode());
    }

    public final String toString() {
        return a.n(YU.a.v("DynamicPageActionData(label=", this.f5183a, ", action=", this.b, ", analytics="), this.c, ")");
    }
}
