package au.com.woolworths.feature.rewards.offers.data;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/StandardOffersSection;", "Lau/com/woolworths/feature/rewards/offers/data/OffersSections;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StandardOffersSection implements OffersSections {

    /* renamed from: a, reason: collision with root package name */
    public final String f6299a;
    public final String b;
    public final ArrayList c;

    public StandardOffersSection(String str, String str2, ArrayList arrayList) {
        this.f6299a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StandardOffersSection)) {
            return false;
        }
        StandardOffersSection standardOffersSection = (StandardOffersSection) obj;
        return this.f6299a.equals(standardOffersSection.f6299a) && Intrinsics.c(this.b, standardOffersSection.b) && this.c.equals(standardOffersSection.c);
    }

    public final int hashCode() {
        int iHashCode = this.f6299a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return a.q(")", YU.a.v("StandardOffersSection(sectionId=", this.f6299a, ", sectionTitle=", this.b, ", items="), this.c);
    }
}
