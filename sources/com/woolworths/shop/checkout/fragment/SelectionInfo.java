package com.woolworths.shop.checkout.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.FulfilmentWindowsFooterIcon;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/SelectionInfo;", "Lcom/apollographql/apollo/api/Fragment$Data;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SelectionInfo implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f22536a;
    public final FulfilmentWindowsFooterIcon b;

    public SelectionInfo(String str, FulfilmentWindowsFooterIcon fulfilmentWindowsFooterIcon) {
        this.f22536a = str;
        this.b = fulfilmentWindowsFooterIcon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionInfo)) {
            return false;
        }
        SelectionInfo selectionInfo = (SelectionInfo) obj;
        return Intrinsics.c(this.f22536a, selectionInfo.f22536a) && this.b == selectionInfo.b;
    }

    public final int hashCode() {
        String str = this.f22536a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "SelectionInfo(descriptionMd=" + this.f22536a + ", iconType=" + this.b + ")";
    }
}
