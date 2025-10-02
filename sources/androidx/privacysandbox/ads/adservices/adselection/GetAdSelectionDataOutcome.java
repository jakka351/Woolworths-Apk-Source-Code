package androidx.privacysandbox.ads.adservices.adselection;

import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ExperimentalFeatures.Ext10OptIn
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataOutcome;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GetAdSelectionDataOutcome {

    /* renamed from: a, reason: collision with root package name */
    public final long f3622a;
    public final byte[] b;

    public GetAdSelectionDataOutcome(android.adservices.adselection.GetAdSelectionDataOutcome response) {
        Intrinsics.h(response, "response");
        long adSelectionId = response.getAdSelectionId();
        byte[] adSelectionData = response.getAdSelectionData();
        this.f3622a = adSelectionId;
        this.b = adSelectionData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAdSelectionDataOutcome)) {
            return false;
        }
        GetAdSelectionDataOutcome getAdSelectionDataOutcome = (GetAdSelectionDataOutcome) obj;
        return this.f3622a == getAdSelectionDataOutcome.f3622a && Arrays.equals(this.b, getAdSelectionDataOutcome.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f3622a) * 31;
        byte[] bArr = this.b;
        return iHashCode + (bArr != null ? bArr.hashCode() : 0);
    }

    public final String toString() {
        return "GetAdSelectionDataOutcome: adSelectionId=" + this.f3622a + ", adSelectionData=" + this.b;
    }
}
