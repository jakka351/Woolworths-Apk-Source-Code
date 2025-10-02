package au.com.woolworths.shop.productcard.data;

import YU.a;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/productcard/data/RoundelImage;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RoundelImage {

    /* renamed from: a, reason: collision with root package name */
    public final String f12660a;
    public final String b;
    public final RoundelImagePriority c;

    public RoundelImage(String str, String str2, RoundelImagePriority roundelImagePriority) {
        this.f12660a = str;
        this.b = str2;
        this.c = roundelImagePriority;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundelImage)) {
            return false;
        }
        RoundelImage roundelImage = (RoundelImage) obj;
        return Intrinsics.c(this.f12660a, roundelImage.f12660a) && Intrinsics.c(this.b, roundelImage.b) && this.c == roundelImage.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + b.c(this.f12660a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbV = a.v("RoundelImage(url=", this.f12660a, ", altText=", this.b, ", priority=");
        sbV.append(this.c);
        sbV.append(")");
        return sbV.toString();
    }
}
