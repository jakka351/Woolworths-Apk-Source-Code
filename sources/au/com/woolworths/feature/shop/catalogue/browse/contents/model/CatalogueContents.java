package au.com.woolworths.feature.shop.catalogue.browse.contents.model;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import java.util.ArrayList;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/contents/model/CatalogueContents;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CatalogueContents {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6803a;

    public CatalogueContents(ArrayList arrayList) {
        this.f6803a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CatalogueContents) && this.f6803a.equals(((CatalogueContents) obj).f6803a);
    }

    public final int hashCode() {
        return this.f6803a.hashCode();
    }

    public final String toString() {
        return a.k("CatalogueContents(items=", ")", this.f6803a);
    }
}
