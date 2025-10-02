package com.woolworths.shop.catalogue.fragment;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/fragment/CatalogueLandingCard;", "Lcom/apollographql/apollo/api/Fragment$Data;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CatalogueLandingCard implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f21781a;
    public final String b;

    public CatalogueLandingCard(String str, String str2) {
        this.f21781a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogueLandingCard)) {
            return false;
        }
        CatalogueLandingCard catalogueLandingCard = (CatalogueLandingCard) obj;
        return Intrinsics.c(this.f21781a, catalogueLandingCard.f21781a) && Intrinsics.c(this.b, catalogueLandingCard.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f21781a.hashCode() * 31);
    }

    public final String toString() {
        return a.j("CatalogueLandingCard(title=", this.f21781a, ", image=", this.b, ")");
    }
}
