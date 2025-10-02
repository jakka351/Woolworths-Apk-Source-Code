package au.com.woolworths.shop.checkout.domain.model.substitution;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/substitution/SubstitutionPreferenceOption;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SubstitutionPreferenceOption {

    /* renamed from: a, reason: collision with root package name */
    public final String f10666a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final boolean f;

    public SubstitutionPreferenceOption(String str, String str2, boolean z, boolean z2, boolean z3, String str3) {
        this.f10666a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = str3;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubstitutionPreferenceOption)) {
            return false;
        }
        SubstitutionPreferenceOption substitutionPreferenceOption = (SubstitutionPreferenceOption) obj;
        return Intrinsics.c(this.f10666a, substitutionPreferenceOption.f10666a) && Intrinsics.c(this.b, substitutionPreferenceOption.b) && this.c == substitutionPreferenceOption.c && this.d == substitutionPreferenceOption.d && Intrinsics.c(this.e, substitutionPreferenceOption.e) && this.f == substitutionPreferenceOption.f;
    }

    public final int hashCode() {
        int iE = b.e(b.e(b.c(this.f10666a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return Boolean.hashCode(this.f) + ((iE + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbV = a.v("SubstitutionPreferenceOption(id=", this.f10666a, ", title=", this.b, ", isSelected=");
        au.com.woolworths.android.onesite.a.D(sbV, this.c, ", isEnabled=", this.d, ", description=");
        return d.r(this.e, ", showProducts=", ")", sbV, this.f);
    }
}
