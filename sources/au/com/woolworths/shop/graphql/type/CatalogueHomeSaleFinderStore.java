package au.com.woolworths.shop.graphql.type;

import YU.a;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CatalogueHomeSaleFinderStore;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CatalogueHomeSaleFinderStore {

    /* renamed from: a, reason: collision with root package name */
    public final String f11145a;
    public final String b;
    public final String c;

    public CatalogueHomeSaleFinderStore(String id, String name, String postCode) {
        Intrinsics.h(id, "id");
        Intrinsics.h(name, "name");
        Intrinsics.h(postCode, "postCode");
        this.f11145a = id;
        this.b = name;
        this.c = postCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogueHomeSaleFinderStore)) {
            return false;
        }
        CatalogueHomeSaleFinderStore catalogueHomeSaleFinderStore = (CatalogueHomeSaleFinderStore) obj;
        return Intrinsics.c(this.f11145a, catalogueHomeSaleFinderStore.f11145a) && Intrinsics.c(this.b, catalogueHomeSaleFinderStore.b) && Intrinsics.c(this.c, catalogueHomeSaleFinderStore.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b.c(this.f11145a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return a.o(a.v("CatalogueHomeSaleFinderStore(id=", this.f11145a, ", name=", this.b, ", postCode="), this.c, ")");
    }
}
