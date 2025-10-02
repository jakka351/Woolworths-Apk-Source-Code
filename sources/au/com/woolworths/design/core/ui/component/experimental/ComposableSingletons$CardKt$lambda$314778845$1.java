package au.com.woolworths.design.core.ui.component.experimental;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.design.core.ui.component.experimental.ComposableSingletons$CardKt$lambda$-314778845$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$CardKt$lambda$314778845$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$CardKt$lambda$314778845$1 d = new ComposableSingletons$CardKt$lambda$314778845$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            CardKt.a(PaddingKt.f(SizeKt.q(Modifier.Companion.d, 120), 8), null, 0L, 0L, null, null, ComposableSingletons$CardKt.f4717a, composer, 1572870, 62);
        }
        return Unit.f24250a;
    }
}
