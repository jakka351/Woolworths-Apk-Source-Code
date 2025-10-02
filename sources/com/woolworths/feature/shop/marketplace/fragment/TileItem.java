package com.woolworths.feature.shop.marketplace.fragment;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/fragment/TileItem;", "Lcom/apollographql/apollo/api/Fragment$Data;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TileItem implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f19846a;
    public final String b;

    public TileItem(String str, String str2) {
        this.f19846a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TileItem)) {
            return false;
        }
        TileItem tileItem = (TileItem) obj;
        return Intrinsics.c(this.f19846a, tileItem.f19846a) && Intrinsics.c(this.b, tileItem.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f19846a.hashCode() * 31);
    }

    public final String toString() {
        return a.j("TileItem(title=", this.f19846a, ", imageUrl=", this.b, ")");
    }
}
