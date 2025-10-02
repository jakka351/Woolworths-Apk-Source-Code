package au.com.woolworths.feature.rewards.offers.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/PersonalisedOffersBanner;", "Lau/com/woolworths/feature/rewards/offers/data/OffersSections;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PersonalisedOffersBanner implements OffersSections {

    /* renamed from: a, reason: collision with root package name */
    public final String f6279a;
    public final String b;
    public final String c;
    public final String d;
    public final PersonalisedOffersStatus e;
    public final String f;

    public PersonalisedOffersBanner(String str, String str2, String str3, String str4, PersonalisedOffersStatus personalisedOffersStatus, String str5) {
        this.f6279a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = personalisedOffersStatus;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalisedOffersBanner)) {
            return false;
        }
        PersonalisedOffersBanner personalisedOffersBanner = (PersonalisedOffersBanner) obj;
        return Intrinsics.c(this.f6279a, personalisedOffersBanner.f6279a) && Intrinsics.c(this.b, personalisedOffersBanner.b) && Intrinsics.c(this.c, personalisedOffersBanner.c) && Intrinsics.c(this.d, personalisedOffersBanner.d) && this.e == personalisedOffersBanner.e && Intrinsics.c(this.f, personalisedOffersBanner.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + b.c(b.c(b.c(this.f6279a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbV = a.v("PersonalisedOffersBanner(bannerId=", this.f6279a, ", imageUrl=", this.b, ", title=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", description=", this.d, ", status=");
        sbV.append(this.e);
        sbV.append(", actionUrl=");
        sbV.append(this.f);
        sbV.append(")");
        return sbV.toString();
    }
}
