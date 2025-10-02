package au.com.woolworths.feature.shop.modeselector.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.design.wx.component.SurfaceKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$ShoppingModeOptionKt$lambda$2120416169$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            SurfaceKt.a(null, null, ToneColors.j, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableSingletons$ShoppingModeOptionKt.d, composer, 1572864, 59);
        }
        return Unit.f24250a;
    }
}
