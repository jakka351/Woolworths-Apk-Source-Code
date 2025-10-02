package au.com.woolworths.foundation.rewards.common.ui.borderedmetricitem;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/borderedmetricitem/BorderedMetricItemData;", "", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BorderedMetricItemData {

    /* renamed from: a, reason: collision with root package name */
    public final String f8577a;
    public final String b;

    public BorderedMetricItemData(String str, String str2) {
        this.f8577a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderedMetricItemData)) {
            return false;
        }
        BorderedMetricItemData borderedMetricItemData = (BorderedMetricItemData) obj;
        return this.f8577a.equals(borderedMetricItemData.f8577a) && this.b.equals(borderedMetricItemData.b);
    }

    public final int hashCode() {
        return b.c(this.f8577a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return a.j("BorderedMetricItemData(iconUrl=, value=", this.f8577a, ", description=", this.b, ", altText=)");
    }
}
