package au.com.woolworths.shop.productcard.ui.horizontal;

import androidx.compose.runtime.Composer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ImageContainerHorizontalUiKt$lambda$541509381$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ImageContainerHorizontalUiKt.a("", null, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, composer, 54, 28);
        }
        return Unit.f24250a;
    }
}
