package au.com.woolworths.feature.shop.catalogue.browse.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/model/CatalogueBrowse;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CatalogueBrowse {

    /* renamed from: a, reason: collision with root package name */
    public final int f6810a;
    public final ArrayList b;

    public CatalogueBrowse(int i, ArrayList arrayList) {
        this.f6810a = i;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogueBrowse)) {
            return false;
        }
        CatalogueBrowse catalogueBrowse = (CatalogueBrowse) obj;
        return this.f6810a == catalogueBrowse.f6810a && this.b.equals(catalogueBrowse.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f6810a) * 31);
    }

    public final String toString() {
        return "CatalogueBrowse(totalNumberOfPages=" + this.f6810a + ", pages=" + this.b + ")";
    }
}
