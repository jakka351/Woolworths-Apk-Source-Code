package au.com.woolworths.feature.rewards.offers.ui.details;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/ui/details/ProgressRing;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProgressRing {

    /* renamed from: a, reason: collision with root package name */
    public final float f6412a;
    public final long b;

    public ProgressRing(long j, float f) {
        this.f6412a = f;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressRing)) {
            return false;
        }
        ProgressRing progressRing = (ProgressRing) obj;
        return Float.compare(this.f6412a, progressRing.f6412a) == 0 && Color.c(this.b, progressRing.b);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f6412a) * 31;
        int i = Color.l;
        return Long.hashCode(this.b) + iHashCode;
    }

    public final String toString() {
        return "ProgressRing(progress=" + this.f6412a + ", color=" + Color.i(this.b) + ")";
    }
}
