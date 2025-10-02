package au.com.woolworths.feature.shop.healthylifefoodtracker.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/healthylifefoodtracker/data/FoodTrackerWebView;", "Lau/com/woolworths/feature/shop/healthylifefoodtracker/data/FoodTrackerPage;", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FoodTrackerWebView implements FoodTrackerPage {

    /* renamed from: a, reason: collision with root package name */
    public final String f7167a;
    public final String b;

    public FoodTrackerWebView(String str, String str2) {
        this.f7167a = str;
        this.b = str2;
    }

    @Override // au.com.woolworths.feature.shop.healthylifefoodtracker.data.FoodTrackerPage
    /* renamed from: a, reason: from getter */
    public final String getF7167a() {
        return this.f7167a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FoodTrackerWebView)) {
            return false;
        }
        FoodTrackerWebView foodTrackerWebView = (FoodTrackerWebView) obj;
        return Intrinsics.c(this.f7167a, foodTrackerWebView.f7167a) && Intrinsics.c(this.b, foodTrackerWebView.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7167a.hashCode() * 31);
    }

    public final String toString() {
        return a.j("FoodTrackerWebView(navigationTitle=", this.f7167a, ", url=", this.b, ")");
    }
}
