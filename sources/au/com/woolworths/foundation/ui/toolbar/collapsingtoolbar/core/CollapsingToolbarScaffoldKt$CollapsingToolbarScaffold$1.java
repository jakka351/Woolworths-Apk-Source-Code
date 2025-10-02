package au.com.woolworths.foundation.ui.toolbar.collapsingtoolbar.core;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class CollapsingToolbarScaffoldKt$CollapsingToolbarScaffold$1 implements Function2<Composer, Integer, Unit> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.foundation.ui.toolbar.collapsingtoolbar.core.CollapsingToolbarScaffoldKt$CollapsingToolbarScaffold$1$1, reason: invalid class name */
    final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) != 2 || !composer.c()) {
                throw null;
            }
            composer.j();
            return Unit.f24250a;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
            return Unit.f24250a;
        }
        SizeKt.e(Modifier.Companion.d, 1.0f);
        throw null;
    }
}
