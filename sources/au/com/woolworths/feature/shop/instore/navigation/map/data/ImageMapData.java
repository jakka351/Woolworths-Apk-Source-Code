package au.com.woolworths.feature.shop.instore.navigation.map.data;

import android.graphics.Bitmap;
import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import au.com.woolworths.feature.shop.instore.navigation.map.utils.Meters;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/data/ImageMapData;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ImageMapData {

    /* renamed from: a, reason: collision with root package name */
    public final long f7336a;
    public final long b;
    public final double c;
    public final double d;
    public final OriientMapOffset e;
    public final Bitmap f;

    public ImageMapData(long j, long j2, double d, double d2, OriientMapOffset oriientMapOffset, Bitmap bitmap) {
        this.f7336a = j;
        this.b = j2;
        this.c = d;
        this.d = d2;
        this.e = oriientMapOffset;
        this.f = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ImageMapData) {
            ImageMapData imageMapData = (ImageMapData) obj;
            if (Size.a(this.f7336a, imageMapData.f7336a) && Offset.c(this.b, imageMapData.b) && Double.compare(this.c, imageMapData.c) == 0 && Double.compare(this.d, imageMapData.d) == 0 && this.e.equals(imageMapData.e) && this.f.equals(imageMapData.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + a.a(this.d, a.a(this.c, b.b(Long.hashCode(this.f7336a) * 31, 31, this.b), 31), 31)) * 31);
    }

    public final String toString() {
        String strG = Size.g(this.f7336a);
        String strJ = Offset.j(this.b);
        String strA = Meters.a(this.d);
        StringBuilder sbV = YU.a.v("ImageMapData(mapSize=", strG, ", mapOrigin=", strJ, ", pixelToMeter=");
        sbV.append(this.c);
        sbV.append(", heightInMeters=");
        sbV.append(strA);
        sbV.append(", offset=");
        sbV.append(this.e);
        sbV.append(", bitmap=");
        sbV.append(this.f);
        sbV.append(")");
        return sbV.toString();
    }
}
