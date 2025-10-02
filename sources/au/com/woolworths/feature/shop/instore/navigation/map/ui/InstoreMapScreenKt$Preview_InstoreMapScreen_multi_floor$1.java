package au.com.woolworths.feature.shop.instore.navigation.map.ui;

import android.graphics.Bitmap;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import ovh.plrapps.mapcompose.ui.state.MapState;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class InstoreMapScreenKt$Preview_InstoreMapScreen_multi_floor$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
            return Unit.f24250a;
        }
        InstoreMapScreenKt$EmptyCallbacks$1 instoreMapScreenKt$EmptyCallbacks$1 = InstoreMapScreenKt.f7385a;
        new MapState(10, 20, 48);
        Float.floatToRawIntBits(10.0f);
        Float.floatToRawIntBits(20.0f);
        Bitmap.createBitmap(10, 20, Bitmap.Config.ARGB_8888).eraseColor(ColorKt.j(Color.e));
        CollectionsKt.F(null);
        throw null;
    }
}
