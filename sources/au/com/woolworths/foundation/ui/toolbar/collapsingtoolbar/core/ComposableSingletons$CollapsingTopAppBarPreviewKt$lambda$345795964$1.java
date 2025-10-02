package au.com.woolworths.foundation.ui.toolbar.collapsingtoolbar.core;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.foundation.ui.toolbar.collapsingtoolbar.core.ComposableSingletons$CollapsingTopAppBarPreviewKt$lambda$-345795964$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$CollapsingTopAppBarPreviewKt$lambda$345795964$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$CollapsingTopAppBarPreviewKt$lambda$345795964$1 d = new ComposableSingletons$CollapsingTopAppBarPreviewKt$lambda$345795964$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            BoxKt.a(SizeKt.g(SizeKt.e(BackgroundKt.b(Modifier.Companion.d, Color.g, RectangleShapeKt.f1779a), 1.0f), DilithiumEngine.DilithiumPolyT1PackedBytes), composer, 6);
        }
        return Unit.f24250a;
    }
}
