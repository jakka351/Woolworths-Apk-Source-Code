package au.com.woolworths.design.core.ui.component.stable.corerow.impl;

import androidx.compose.runtime.Composer;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.design.core.ui.component.stable.corerow.impl.ComposableSingletons$CoreRowImplKt$lambda$-829508354$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$CoreRowImplKt$lambda$829508354$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$CoreRowImplKt$lambda$829508354$1 d = new ComposableSingletons$CoreRowImplKt$lambda$829508354$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            IconKt.b(CoreTheme.e(composer).c.f, null, null, 0L, composer, 48, 12);
        }
        return Unit.f24250a;
    }
}
