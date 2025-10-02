package au.com.woolworths.shop.graphql.type;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ProductListInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductListInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f11753a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final Optional f;
    public final Optional g;
    public final Optional h;
    public final Optional i;
    public final Optional j;
    public final Optional k;
    public final Optional l;
    public final Optional m;
    public final Optional n;

    public ProductListInput(String type, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7, Optional optional8, Optional optional9, Optional optional10, Optional optional11, Optional optional12, Optional optional13) {
        Intrinsics.h(type, "type");
        this.f11753a = type;
        this.b = optional;
        this.c = optional2;
        this.d = optional3;
        this.e = optional4;
        this.f = optional5;
        this.g = optional6;
        this.h = optional7;
        this.i = optional8;
        this.j = optional9;
        this.k = optional10;
        this.l = optional11;
        this.m = optional12;
        this.n = optional13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductListInput)) {
            return false;
        }
        ProductListInput productListInput = (ProductListInput) obj;
        return Intrinsics.c(this.f11753a, productListInput.f11753a) && Intrinsics.c(this.b, productListInput.b) && Intrinsics.c(this.c, productListInput.c) && Intrinsics.c(this.d, productListInput.d) && Intrinsics.c(this.e, productListInput.e) && Intrinsics.c(this.f, productListInput.f) && Intrinsics.c(this.g, productListInput.g) && Intrinsics.c(this.h, productListInput.h) && Intrinsics.c(this.i, productListInput.i) && Intrinsics.c(this.j, productListInput.j) && Intrinsics.c(this.k, productListInput.k) && Intrinsics.c(this.l, productListInput.l) && Intrinsics.c(this.m, productListInput.m) && Intrinsics.c(this.n, productListInput.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + a.c(this.m, a.c(this.l, a.c(this.k, a.c(this.j, a.c(this.i, a.c(this.h, a.c(this.g, a.c(this.f, a.c(this.e, a.c(this.d, a.c(this.c, a.c(this.b, this.f11753a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbR = a.r("ProductListInput(type=", this.f11753a, ", argument=", this.b, ", storeId=");
        a.x(sbR, this.c, ", facetChip=", this.d, ", chips=");
        a.x(sbR, this.e, ", filterOptions=", this.f, ", includeMarketProducts=");
        a.x(sbR, this.g, ", initialLoad=", this.h, ", pageNumber=");
        a.x(sbR, this.i, ", pageSize=", this.j, ", sortOption=");
        a.x(sbR, this.k, ", source=", this.l, ", supportedLinks=");
        sbR.append(this.m);
        sbR.append(", persistedChipIds=");
        sbR.append(this.n);
        sbR.append(")");
        return sbR.toString();
    }
}
