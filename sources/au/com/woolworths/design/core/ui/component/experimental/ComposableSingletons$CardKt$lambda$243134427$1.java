package au.com.woolworths.design.core.ui.component.experimental;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.design.core.ui.component.experimental.ComposableSingletons$CardKt$lambda$-243134427$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$CardKt$lambda$243134427$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$CardKt$lambda$243134427$1 d = new ComposableSingletons$CardKt$lambda$243134427$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ColumnScope Card = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(Card, "$this$Card");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            TextKt.a("Card content", CoreTheme.f(composer).f5120a.b.f5123a, PaddingKt.f(Modifier.Companion.d, 8), 0L, null, 0, 0, false, 0, null, composer, 390, 1016);
        }
        return Unit.f24250a;
    }
}
