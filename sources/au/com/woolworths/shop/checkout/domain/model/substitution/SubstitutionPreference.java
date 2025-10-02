package au.com.woolworths.shop.checkout.domain.model.substitution;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/substitution/SubstitutionPreference;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SubstitutionPreference {

    /* renamed from: a, reason: collision with root package name */
    public final ProductToBeSubstituteSection f10664a;
    public final CheaperSubstitutesSection b;
    public final SubstitutionPreferenceOptionsSection c;
    public final ProductSubstitutesSection d;
    public final SubstitutionPreferenceFooter e;

    public SubstitutionPreference(ProductToBeSubstituteSection productToBeSubstituteSection, CheaperSubstitutesSection cheaperSubstitutesSection, SubstitutionPreferenceOptionsSection substitutionPreferenceOptionsSection, ProductSubstitutesSection productSubstitutesSection, SubstitutionPreferenceFooter substitutionPreferenceFooter) {
        this.f10664a = productToBeSubstituteSection;
        this.b = cheaperSubstitutesSection;
        this.c = substitutionPreferenceOptionsSection;
        this.d = productSubstitutesSection;
        this.e = substitutionPreferenceFooter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubstitutionPreference)) {
            return false;
        }
        SubstitutionPreference substitutionPreference = (SubstitutionPreference) obj;
        return Intrinsics.c(this.f10664a, substitutionPreference.f10664a) && Intrinsics.c(this.b, substitutionPreference.b) && Intrinsics.c(this.c, substitutionPreference.c) && Intrinsics.c(this.d, substitutionPreference.d) && Intrinsics.c(this.e, substitutionPreference.e);
    }

    public final int hashCode() {
        return this.e.f10665a.hashCode() + b.d((this.c.hashCode() + ((this.b.hashCode() + (this.f10664a.hashCode() * 31)) * 31)) * 31, 31, this.d.f10662a);
    }

    public final String toString() {
        return "SubstitutionPreference(productToBeSubstituteSection=" + this.f10664a + ", cheaperSubstitutesSection=" + this.b + ", substitutionPreferenceOptionsSection=" + this.c + ", productSubstitutesSection=" + this.d + ", substitutionPreferenceFooter=" + this.e + ")";
    }
}
