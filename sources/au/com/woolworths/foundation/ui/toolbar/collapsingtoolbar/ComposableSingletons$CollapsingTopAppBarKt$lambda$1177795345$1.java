package au.com.woolworths.foundation.ui.toolbar.collapsingtoolbar;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$CollapsingTopAppBarKt$lambda$1177795345$1 implements Function3<RowScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$CollapsingTopAppBarKt$lambda$1177795345$1 d = new ComposableSingletons$CollapsingTopAppBarKt$lambda$1177795345$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h((RowScope) obj, "<this>");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        }
        return Unit.f24250a;
    }
}
