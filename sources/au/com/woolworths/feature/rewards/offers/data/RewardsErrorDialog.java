package au.com.woolworths.feature.rewards.offers.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.ContentCta;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/RewardsErrorDialog;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsErrorDialog {

    /* renamed from: a, reason: collision with root package name */
    public final String f6282a;
    public final String b;
    public final ContentCta c;
    public final ContentCta d;

    public RewardsErrorDialog(String str, String str2, ContentCta contentCta, ContentCta contentCta2) {
        this.f6282a = str;
        this.b = str2;
        this.c = contentCta;
        this.d = contentCta2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsErrorDialog)) {
            return false;
        }
        RewardsErrorDialog rewardsErrorDialog = (RewardsErrorDialog) obj;
        return Intrinsics.c(this.f6282a, rewardsErrorDialog.f6282a) && Intrinsics.c(this.b, rewardsErrorDialog.b) && Intrinsics.c(this.c, rewardsErrorDialog.c) && Intrinsics.c(this.d, rewardsErrorDialog.d);
    }

    public final int hashCode() {
        int iHashCode = this.f6282a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ContentCta contentCta = this.c;
        int iHashCode3 = (iHashCode2 + (contentCta == null ? 0 : contentCta.hashCode())) * 31;
        ContentCta contentCta2 = this.d;
        return iHashCode3 + (contentCta2 != null ? contentCta2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("RewardsErrorDialog(title=", this.f6282a, ", description=", this.b, ", primaryCta=");
        sbV.append(this.c);
        sbV.append(", secondaryCta=");
        sbV.append(this.d);
        sbV.append(")");
        return sbV.toString();
    }
}
