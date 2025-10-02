package au.com.woolworths.shop.checkout.domain.model.substitution;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/substitution/SubstitutionPreferenceOptionsSection;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SubstitutionPreferenceOptionsSection {

    /* renamed from: a, reason: collision with root package name */
    public final String f10667a;
    public final InsetBannerApiData b;
    public final List c;

    public SubstitutionPreferenceOptionsSection(String str, List list, InsetBannerApiData insetBannerApiData) {
        this.f10667a = str;
        this.b = insetBannerApiData;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubstitutionPreferenceOptionsSection)) {
            return false;
        }
        SubstitutionPreferenceOptionsSection substitutionPreferenceOptionsSection = (SubstitutionPreferenceOptionsSection) obj;
        return Intrinsics.c(this.f10667a, substitutionPreferenceOptionsSection.f10667a) && Intrinsics.c(this.b, substitutionPreferenceOptionsSection.b) && Intrinsics.c(this.c, substitutionPreferenceOptionsSection.c);
    }

    public final int hashCode() {
        int iHashCode = this.f10667a.hashCode() * 31;
        InsetBannerApiData insetBannerApiData = this.b;
        return this.c.hashCode() + ((iHashCode + (insetBannerApiData == null ? 0 : insetBannerApiData.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubstitutionPreferenceOptionsSection(title=");
        sb.append(this.f10667a);
        sb.append(", insetBanner=");
        sb.append(this.b);
        sb.append(", items=");
        return a.t(sb, this.c, ")");
    }
}
