package au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets;

import androidx.compose.runtime.Composer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.ComposableSingletons$PulseEffectMarkerWrapperKt$lambda$-1034746075$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$PulseEffectMarkerWrapperKt$lambda$1034746075$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            PulseEffectMarkerWrapperKt.a(null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0L, BitmapDescriptorFactory.HUE_RED, ComposableSingletons$PulseEffectMarkerWrapperKt.f7406a, composer, 1572864);
        }
        return Unit.f24250a;
    }
}
