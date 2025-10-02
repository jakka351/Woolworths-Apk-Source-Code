package com.woolworths.shop.modeselector.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.DownloadableAssetFit;
import au.com.woolworths.shop.graphql.type.DownloadableAssetType;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/fragment/DownloadableAssetFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DownloadableAssetFragment implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final DownloadableAssetType f23352a;
    public final String b;
    public final int c;
    public final int d;
    public final DownloadableAssetFit e;
    public final String f;

    public DownloadableAssetFragment(DownloadableAssetType downloadableAssetType, String str, int i, int i2, DownloadableAssetFit downloadableAssetFit, String str2) {
        this.f23352a = downloadableAssetType;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = downloadableAssetFit;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadableAssetFragment)) {
            return false;
        }
        DownloadableAssetFragment downloadableAssetFragment = (DownloadableAssetFragment) obj;
        return this.f23352a == downloadableAssetFragment.f23352a && Intrinsics.c(this.b, downloadableAssetFragment.b) && this.c == downloadableAssetFragment.c && this.d == downloadableAssetFragment.d && this.e == downloadableAssetFragment.e && Intrinsics.c(this.f, downloadableAssetFragment.f);
    }

    public final int hashCode() {
        int iA = b.a(this.d, b.a(this.c, b.c(this.f23352a.hashCode() * 31, 31, this.b), 31), 31);
        DownloadableAssetFit downloadableAssetFit = this.e;
        int iHashCode = (iA + (downloadableAssetFit == null ? 0 : downloadableAssetFit.hashCode())) * 31;
        String str = this.f;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadableAssetFragment(assetType=");
        sb.append(this.f23352a);
        sb.append(", assetUrl=");
        sb.append(this.b);
        sb.append(", assetWidth=");
        a.w(this.c, this.d, ", assetHeight=", ", fit=", sb);
        sb.append(this.e);
        sb.append(", altText=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
