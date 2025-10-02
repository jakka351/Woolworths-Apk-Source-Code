package com.halilibo.richtext.ui.material;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
final class RichTextKt$RichTextMaterialTheme$1 implements Function2<Composer, Integer, TextStyle> {
    public static final RichTextKt$RichTextMaterialTheme$1 d = new RichTextKt$RichTextMaterialTheme$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        ((Number) obj2).intValue();
        composer.o(1692365885);
        TextStyle textStyle = (TextStyle) composer.x(TextKt.f1345a);
        composer.l();
        return textStyle;
    }
}
