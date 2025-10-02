package au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets;

import androidx.compose.runtime.Composer;
import au.com.woolworths.feature.shop.instore.navigation.map.data.FloorTransitionType;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$FloorTransitionMarkerKt$lambda$6719872$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            FloorTransitionMarkerKt.a(FloorTransitionType.g, null, BitmapDescriptorFactory.HUE_RED, composer, 6);
        }
        return Unit.f24250a;
    }
}
