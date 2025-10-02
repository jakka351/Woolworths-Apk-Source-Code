package au.com.woolworths.shop.rewards.priming.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/rewards/priming/data/CvpItem;", "", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CvpItem {

    /* renamed from: a, reason: collision with root package name */
    public final int f12906a;
    public final int b;

    public CvpItem(int i, int i2) {
        this.f12906a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CvpItem)) {
            return false;
        }
        CvpItem cvpItem = (CvpItem) obj;
        return this.f12906a == cvpItem.f12906a && this.b == cvpItem.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f12906a) * 31);
    }

    public final String toString() {
        return b.j(this.f12906a, this.b, "CvpItem(iconRes=", ", textRes=", ")");
    }
}
