package au.com.woolworths.feature.shop.healthylifefoodtracker.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/healthylifefoodtracker/data/UpdateFoodTrackerConsent;", "", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UpdateFoodTrackerConsent {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7168a;
    public final String b;

    public UpdateFoodTrackerConsent(boolean z, String str) {
        this.f7168a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateFoodTrackerConsent)) {
            return false;
        }
        UpdateFoodTrackerConsent updateFoodTrackerConsent = (UpdateFoodTrackerConsent) obj;
        return this.f7168a == updateFoodTrackerConsent.f7168a && Intrinsics.c(this.b, updateFoodTrackerConsent.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f7168a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return a.m("UpdateFoodTrackerConsent(status=", this.f7168a, ", message=", this.b, ")");
    }
}
