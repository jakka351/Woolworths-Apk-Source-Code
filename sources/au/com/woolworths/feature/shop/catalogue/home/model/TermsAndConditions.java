package au.com.woolworths.feature.shop.catalogue.home.model;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import java.util.ArrayList;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/home/model/TermsAndConditions;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TermsAndConditions {

    /* renamed from: a, reason: collision with root package name */
    public final ButtonApiData f6860a;
    public final ArrayList b;

    public TermsAndConditions(ButtonApiData buttonApiData, ArrayList arrayList) {
        this.f6860a = buttonApiData;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TermsAndConditions)) {
            return false;
        }
        TermsAndConditions termsAndConditions = (TermsAndConditions) obj;
        return this.f6860a.equals(termsAndConditions.f6860a) && this.b.equals(termsAndConditions.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6860a.hashCode() * 31);
    }

    public final String toString() {
        return "TermsAndConditions(button=" + this.f6860a + ", terms=" + this.b + ")";
    }
}
