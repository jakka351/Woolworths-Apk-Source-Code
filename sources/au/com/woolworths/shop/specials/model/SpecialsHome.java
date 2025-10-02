package au.com.woolworths.shop.specials.model;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import java.util.ArrayList;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/specials/model/SpecialsHome;", "", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SpecialsHome {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12942a;

    public SpecialsHome(ArrayList arrayList) {
        this.f12942a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SpecialsHome) && this.f12942a.equals(((SpecialsHome) obj).f12942a);
    }

    public final int hashCode() {
        return this.f12942a.hashCode();
    }

    public final String toString() {
        return a.k("SpecialsHome(items=", ")", this.f12942a);
    }
}
