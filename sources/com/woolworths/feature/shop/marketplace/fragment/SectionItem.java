package com.woolworths.feature.shop.marketplace.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.ProductListChannelType;
import au.com.woolworths.shop.graphql.type.ProductListFacetType;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/fragment/SectionItem;", "Lcom/apollographql/apollo/api/Fragment$Data;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SectionItem implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f19844a;
    public final ProductListChannelType b;
    public final ProductListFacetType c;

    public SectionItem(String str, ProductListChannelType productListChannelType, ProductListFacetType productListFacetType) {
        this.f19844a = str;
        this.b = productListChannelType;
        this.c = productListFacetType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionItem)) {
            return false;
        }
        SectionItem sectionItem = (SectionItem) obj;
        return Intrinsics.c(this.f19844a, sectionItem.f19844a) && this.b == sectionItem.b && this.c == sectionItem.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f19844a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SectionItem(displayName=" + this.f19844a + ", channel=" + this.b + ", facet=" + this.c + ")";
    }
}
