package au.com.woolworths.foundation.ui.toolbar.collapsingtoolbar.core;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class CollapsingToolbarScaffoldKt$CollapsingToolbarScaffold$2 implements Function3<PaddingValues, Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PaddingValues paddingValues = (PaddingValues) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(paddingValues, "paddingValues");
        if ((iIntValue & 6) == 0) {
            iIntValue |= composer.n(paddingValues) ? 4 : 2;
        }
        if ((iIntValue & 19) != 18 || !composer.c()) {
            throw null;
        }
        composer.j();
        return Unit.f24250a;
    }
}
