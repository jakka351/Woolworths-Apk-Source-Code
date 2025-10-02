package au.com.woolworths.feature.shop.homepage.data;

import YU.a;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/data/FulfilmentStatusBannerData;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FulfilmentStatusBannerData {

    /* renamed from: a, reason: collision with root package name */
    public final String f7186a;
    public final String b;

    public FulfilmentStatusBannerData(String str, String str2) {
        this.f7186a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FulfilmentStatusBannerData)) {
            return false;
        }
        FulfilmentStatusBannerData fulfilmentStatusBannerData = (FulfilmentStatusBannerData) obj;
        return Intrinsics.c(this.f7186a, fulfilmentStatusBannerData.f7186a) && Intrinsics.c(this.b, fulfilmentStatusBannerData.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7186a.hashCode() * 31);
    }

    public final String toString() {
        return a.j("FulfilmentStatusBannerData(text=", this.f7186a, ", buttonLabel=", this.b, ")");
    }
}
