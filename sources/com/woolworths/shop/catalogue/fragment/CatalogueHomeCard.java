package com.woolworths.shop.catalogue.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/fragment/CatalogueHomeCard;", "Lcom/apollographql/apollo/api/Fragment$Data;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CatalogueHomeCard implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f21775a;
    public final String b;
    public final String c;

    public CatalogueHomeCard(String str, String str2, String str3) {
        this.f21775a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogueHomeCard)) {
            return false;
        }
        CatalogueHomeCard catalogueHomeCard = (CatalogueHomeCard) obj;
        return Intrinsics.c(this.f21775a, catalogueHomeCard.f21775a) && Intrinsics.c(this.b, catalogueHomeCard.b) && Intrinsics.c(this.c, catalogueHomeCard.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b.c(this.f21775a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return a.o(a.v("CatalogueHomeCard(id=", this.f21775a, ", image=", this.b, ", title="), this.c, ")");
    }
}
