package au.com.woolworths.foundation.shop.nhp.ui.pp;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.foundation.shop.nhp.ui.pp.ComposableSingletons$InlineProductCarouselKt$lambda$-2040651317$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$InlineProductCarouselKt$lambda$2040651317$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$InlineProductCarouselKt$lambda$2040651317$1 d = new ComposableSingletons$InlineProductCarouselKt$lambda$2040651317$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            IconKt.b(CoreTheme.e(composer).g.U, null, SizeKt.z(Modifier.Companion.d, null, 3), CoreTheme.b(composer).e.c.c.f4855a, composer, 432, 0);
        }
        return Unit.f24250a;
    }
}
