package me.onebone.toolbar;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes7.dex */
final class ToolbarWithFabScaffoldKt$ToolbarWithFabScaffold$1$1$toolbarScaffoldPlaceables$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !composer.c()) {
            throw null;
        }
        composer.j();
        return Unit.f24250a;
    }
}
