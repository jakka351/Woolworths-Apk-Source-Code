package au.com.woolworths.design.core.ui.component.stable.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.unit.TextUnitKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$TextWithInlineIconKt$lambda$8539116$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            TextWithInlineIconKt.a("Single line link", CoreTheme.b(composer).b.c.b.f4808a, TextUnitKt.c(16), CoreTheme.f(composer).e.f5133a.b, CoreTheme.e(composer).e.p, BitmapDescriptorFactory.HUE_RED, composer, 390);
        }
        return Unit.f24250a;
    }
}
