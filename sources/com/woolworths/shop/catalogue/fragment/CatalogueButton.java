package com.woolworths.shop.catalogue.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/fragment/CatalogueButton;", "Lcom/apollographql/apollo/api/Fragment$Data;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CatalogueButton implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f21773a;
    public final String b;
    public final ButtonStyle c;
    public final boolean d;

    public CatalogueButton(String str, String str2, ButtonStyle buttonStyle, boolean z) {
        this.f21773a = str;
        this.b = str2;
        this.c = buttonStyle;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogueButton)) {
            return false;
        }
        CatalogueButton catalogueButton = (CatalogueButton) obj;
        return Intrinsics.c(this.f21773a, catalogueButton.f21773a) && Intrinsics.c(this.b, catalogueButton.b) && this.c == catalogueButton.c && this.d == catalogueButton.d;
    }

    public final int hashCode() {
        int iHashCode = this.f21773a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ButtonStyle buttonStyle = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (buttonStyle != null ? buttonStyle.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return a.n(YU.a.v("CatalogueButton(label=", this.f21773a, ", action=", this.b, ", style="), this.c, ", enabled=", this.d, ")");
    }
}
