package au.com.woolworths.feature.shop.instore.navigation.map.ui;

import android.graphics.Bitmap;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import au.com.woolworths.feature.shop.instore.navigation.map.data.ImageMapData;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMapOffset;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract;
import au.com.woolworths.product.composeui.ProductCardPreviewDataKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import ovh.plrapps.mapcompose.ui.state.MapState;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$InstoreMapScreenKt$lambda$427630297$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            OriientMapOffset oriientMapOffset = new OriientMapOffset(0.0d, 0.0d);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(10, 20, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.eraseColor(ColorKt.j(Color.e));
            InstoreMapScreenKt.c(InstoreMapScreenKt.f7385a, new InstoreMapContract.ViewState.Content("Mona vale", new InstoreMapContract.ViewState.MapData(new MapState(10, 20, 48), new ImageMapData((Float.floatToRawIntBits(10.0f) << 32) | (Float.floatToRawIntBits(20.0f) & 4294967295L), 0L, 1.0d, 20.0d, oriientMapOffset, bitmapCreateBitmap)), null, ProductCardPreviewDataKt.b(null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -9437185, 3), Double.valueOf(25.0d), true, null, InstoreMapContract.ViewState.NavigationState.d, null, 1048196), ScaffoldKt.d(null, composer, 3), null, composer, 6, 24);
        }
        return Unit.f24250a;
    }
}
