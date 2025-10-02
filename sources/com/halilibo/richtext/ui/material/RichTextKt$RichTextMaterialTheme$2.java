package com.halilibo.richtext.ui.material;

import androidx.compose.material.ContentColorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
final class RichTextKt$RichTextMaterialTheme$2 implements Function2<Composer, Integer, Color> {
    public static final RichTextKt$RichTextMaterialTheme$2 d = new RichTextKt$RichTextMaterialTheme$2();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        ((Number) obj2).intValue();
        composer.o(-1949010564);
        long j = ((Color) composer.x(ContentColorKt.f1261a)).f1766a;
        composer.l();
        return new Color(j);
    }
}
