package au.com.woolworths.foundation.ui.toolbar.collapsingtoolbar.core;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.foundation.ui.toolbar.collapsingtoolbar.core.ComposableSingletons$CollapsingTopAppBarPreviewKt$lambda$-566687971$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$CollapsingTopAppBarPreviewKt$lambda$566687971$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$CollapsingTopAppBarPreviewKt$lambda$566687971$1 d = new ComposableSingletons$CollapsingTopAppBarPreviewKt$lambda$566687971$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            BoxKt.a(SizeKt.q(BackgroundKt.b(Modifier.Companion.d, Color.f, RoundedCornerShapeKt.f1100a), 24), composer, 0);
        }
        return Unit.f24250a;
    }
}
