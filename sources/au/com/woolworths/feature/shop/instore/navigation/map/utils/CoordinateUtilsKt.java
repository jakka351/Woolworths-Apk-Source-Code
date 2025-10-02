package au.com.woolworths.feature.shop.instore.navigation.map.utils;

import au.com.woolworths.feature.shop.instore.navigation.map.data.ImageMapData;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMapOffset;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMetersCoordinate;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.ui.contentview.models.PixelCoordinate;
import me.oriient.ui.contentview.utils.ExtensionsKt;
import ovh.plrapps.mapcompose.api.LayoutApiKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"instore-navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CoordinateUtilsKt {
    public static final RelativePosition a(OriientMetersCoordinate oriientMetersCoordinate, InstoreMapContract.ViewState.MapData mapData) {
        Intrinsics.h(mapData, "mapData");
        return b(oriientMetersCoordinate, mapData.b, LayoutApiKt.b(mapData.f7384a));
    }

    public static final RelativePosition b(OriientMetersCoordinate oriientMetersCoordinate, ImageMapData imageMapData, long j) {
        PixelCoordinate pixelCoordinate;
        if (imageMapData != null) {
            float f = (float) imageMapData.c;
            double d = imageMapData.d;
            OriientMapOffset oriientMapOffset = imageMapData.e;
            double d2 = oriientMapOffset.f7342a;
            double d3 = oriientMapOffset.b;
            double d4 = oriientMetersCoordinate.f7344a - d2;
            double d5 = f;
            pixelCoordinate = new PixelCoordinate(ExtensionsKt.getPx(d4 * d5), ExtensionsKt.getPx(((d - oriientMetersCoordinate.b) + d3) * d5), null);
        } else {
            pixelCoordinate = new PixelCoordinate();
        }
        return new RelativePosition(pixelCoordinate.getX() / ((int) (j >> 32)), pixelCoordinate.getY() / ((int) (j & 4294967295L)));
    }
}
