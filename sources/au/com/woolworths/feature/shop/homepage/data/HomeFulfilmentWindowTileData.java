package au.com.woolworths.feature.shop.homepage.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.shopapp.modules.text.TextWithAltApiData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/data/HomeFulfilmentWindowTileData;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HomeFulfilmentWindowTileData {

    /* renamed from: a, reason: collision with root package name */
    public final HomeFulfilmentWindowButtonStyleType f7191a;
    public final String b;
    public final String c;
    public final TextWithAltApiData d;
    public final TextWithAltApiData e;
    public final HomeFulfilmentAnalytics f;

    public HomeFulfilmentWindowTileData(HomeFulfilmentWindowButtonStyleType style, String str, String str2, TextWithAltApiData textWithAltApiData, TextWithAltApiData textWithAltApiData2, HomeFulfilmentAnalytics homeFulfilmentAnalytics) {
        Intrinsics.h(style, "style");
        this.f7191a = style;
        this.b = str;
        this.c = str2;
        this.d = textWithAltApiData;
        this.e = textWithAltApiData2;
        this.f = homeFulfilmentAnalytics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeFulfilmentWindowTileData)) {
            return false;
        }
        HomeFulfilmentWindowTileData homeFulfilmentWindowTileData = (HomeFulfilmentWindowTileData) obj;
        return this.f7191a == homeFulfilmentWindowTileData.f7191a && Intrinsics.c(this.b, homeFulfilmentWindowTileData.b) && Intrinsics.c(this.c, homeFulfilmentWindowTileData.c) && Intrinsics.c(this.d, homeFulfilmentWindowTileData.d) && Intrinsics.c(this.e, homeFulfilmentWindowTileData.e) && Intrinsics.c(this.f, homeFulfilmentWindowTileData.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + b.c(b.c(this.f7191a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        TextWithAltApiData textWithAltApiData = this.e;
        return this.f.f7190a.hashCode() + ((iHashCode + (textWithAltApiData == null ? 0 : textWithAltApiData.hashCode())) * 31);
    }

    public final String toString() {
        return "HomeFulfilmentWindowTileData(style=" + this.f7191a + ", iconUrl=" + this.b + ", url=" + this.c + ", title=" + this.d + ", subtitle=" + this.e + ", analytics=" + this.f + ")";
    }
}
