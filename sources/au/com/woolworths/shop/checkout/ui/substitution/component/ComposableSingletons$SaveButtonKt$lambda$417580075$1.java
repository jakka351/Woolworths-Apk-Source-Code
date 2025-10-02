package au.com.woolworths.shop.checkout.ui.substitution.component;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.component.experimental.progressindicator.CircularProgressIndicatorKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$SaveButtonKt$lambda$417580075$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$SaveButtonKt$lambda$417580075$1 d = new ComposableSingletons$SaveButtonKt$lambda$417580075$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            CircularProgressIndicatorKt.b(SizeKt.q(Modifier.Companion.d, 24), CoreTheme.b(composer).e.f4848a.c, BitmapDescriptorFactory.HUE_RED, 0, composer, 6, 12);
        }
        return Unit.f24250a;
    }
}
