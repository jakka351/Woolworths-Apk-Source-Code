package au.com.woolworths.shop.checkout.ui.summary.promocode;

import androidx.compose.runtime.Composer;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.shop.checkout.ui.summary.promocode.ComposableSingletons$PromoCodeUiKt$lambda$-447430958$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$PromoCodeUiKt$lambda$447430958$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$PromoCodeUiKt$lambda$447430958$1 d = new ComposableSingletons$PromoCodeUiKt$lambda$447430958$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            IconKt.b(CoreTheme.e(composer).f.f, null, null, CoreTheme.b(composer).e.c.d, composer, 48, 4);
        }
        return Unit.f24250a;
    }
}
