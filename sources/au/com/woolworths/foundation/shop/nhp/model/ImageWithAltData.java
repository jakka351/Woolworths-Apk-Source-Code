package au.com.woolworths.foundation.shop.nhp.model;

import YU.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/model/ImageWithAltData;", "", "nhp-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ImageWithAltData {

    /* renamed from: a, reason: collision with root package name */
    public final String f8777a;
    public final String b;

    public ImageWithAltData(String imageUrl, String altText) {
        Intrinsics.h(imageUrl, "imageUrl");
        Intrinsics.h(altText, "altText");
        this.f8777a = imageUrl;
        this.b = altText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageWithAltData)) {
            return false;
        }
        ImageWithAltData imageWithAltData = (ImageWithAltData) obj;
        return Intrinsics.c(this.f8777a, imageWithAltData.f8777a) && Intrinsics.c(this.b, imageWithAltData.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8777a.hashCode() * 31);
    }

    public final String toString() {
        return a.j("ImageWithAltData(imageUrl=", this.f8777a, ", altText=", this.b, ")");
    }
}
