package au.com.woolworths.design.core.ui.component.stable.corerow.impl;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$CoreRowImplKt$lambda$1160443891$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$CoreRowImplKt$lambda$1160443891$1 d = new ComposableSingletons$CoreRowImplKt$lambda$1160443891$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            IconKt.b(CoreTheme.e(composer).c.f, null, SizeKt.q(Modifier.Companion.d, 48), 0L, composer, 432, 8);
        }
        return Unit.f24250a;
    }
}
