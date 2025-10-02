package au.com.woolworths.dynamic.page.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/dynamic/page/data/DynamicPageBottomSheetData;", "Lau/com/woolworths/dynamic/page/data/BottomSheetType;", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DynamicPageBottomSheetData implements BottomSheetType {

    /* renamed from: a, reason: collision with root package name */
    public final String f5184a;
    public final List b;
    public final AnalyticsData c;

    public DynamicPageBottomSheetData(String str, List list, AnalyticsData analyticsData) {
        this.f5184a = str;
        this.b = list;
        this.c = analyticsData;
    }

    @Override // au.com.woolworths.dynamic.page.data.BottomSheetType
    /* renamed from: a, reason: from getter */
    public final List getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicPageBottomSheetData)) {
            return false;
        }
        DynamicPageBottomSheetData dynamicPageBottomSheetData = (DynamicPageBottomSheetData) obj;
        return Intrinsics.c(this.f5184a, dynamicPageBottomSheetData.f5184a) && Intrinsics.c(this.b, dynamicPageBottomSheetData.b) && Intrinsics.c(this.c, dynamicPageBottomSheetData.c);
    }

    @Override // au.com.woolworths.dynamic.page.data.BottomSheetType
    /* renamed from: getAnalytics, reason: from getter */
    public final AnalyticsData getC() {
        return this.c;
    }

    @Override // au.com.woolworths.dynamic.page.data.BottomSheetType
    /* renamed from: getId, reason: from getter */
    public final String getF5184a() {
        return this.f5184a;
    }

    public final int hashCode() {
        int iD = b.d(this.f5184a.hashCode() * 31, 31, this.b);
        AnalyticsData analyticsData = this.c;
        return iD + (analyticsData == null ? 0 : analyticsData.hashCode());
    }

    public final String toString() {
        return a.n(a.s("DynamicPageBottomSheetData(id=", this.f5184a, ", feedItems=", ", analytics=", this.b), this.c, ")");
    }
}
