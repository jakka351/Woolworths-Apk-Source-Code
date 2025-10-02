package com.halilibo.richtext.ui.material;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.halilibo.richtext.ui.material.ComposableSingletons$RichTextKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes6.dex */
public final class ComposableSingletons$RichTextKt$lambda1$1 implements Function4<TextStyle, Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
    public static final ComposableSingletons$RichTextKt$lambda1$1 d = new ComposableSingletons$RichTextKt$lambda1$1();

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        TextStyle textStyle = (TextStyle) obj;
        Function2 content = (Function2) obj2;
        Composer composer = (Composer) obj3;
        int iIntValue = ((Number) obj4).intValue();
        Intrinsics.h(textStyle, "textStyle");
        Intrinsics.h(content, "content");
        if ((iIntValue & 6) == 0) {
            i = (composer.n(textStyle) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= composer.I(content) ? 32 : 16;
        }
        if ((i & 147) == 146 && composer.c()) {
            composer.j();
        } else {
            TextKt.a(textStyle, content, composer, i & 126);
        }
        return Unit.f24250a;
    }
}
