package com.woolworths.shop.catalogue.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.CardHeight;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/fragment/CatalogueActionableCard;", "Lcom/apollographql/apollo/api/Fragment$Data;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CatalogueActionableCard implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f21747a;
    public final String b;
    public final CardHeight c;
    public final String d;

    public CatalogueActionableCard(CardHeight cardHeight, String str, String str2, String str3) {
        this.f21747a = str;
        this.b = str2;
        this.c = cardHeight;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogueActionableCard)) {
            return false;
        }
        CatalogueActionableCard catalogueActionableCard = (CatalogueActionableCard) obj;
        return Intrinsics.c(this.f21747a, catalogueActionableCard.f21747a) && Intrinsics.c(this.b, catalogueActionableCard.b) && this.c == catalogueActionableCard.c && Intrinsics.c(this.d, catalogueActionableCard.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + d.b(this.c, b.c(this.f21747a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbV = a.v("CatalogueActionableCard(image=", this.f21747a, ", altText=", this.b, ", cardHeight=");
        sbV.append(this.c);
        sbV.append(", link=");
        sbV.append(this.d);
        sbV.append(")");
        return sbV.toString();
    }
}
