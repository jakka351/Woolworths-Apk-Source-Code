package com.halilibo.richtext.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.halilibo.richtext.ui.ComposableSingletons$RichTextThemeConfigurationKt$lambda-2$1, reason: invalid class name */
/* loaded from: classes6.dex */
public final class ComposableSingletons$RichTextThemeConfigurationKt$lambda2$1 implements Function4<Color, Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
    public static final ComposableSingletons$RichTextThemeConfigurationKt$lambda2$1 d = new ComposableSingletons$RichTextThemeConfigurationKt$lambda2$1();

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        long j = ((Color) obj).f1766a;
        final Function2 content = (Function2) obj2;
        Composer composer = (Composer) obj3;
        int iIntValue = ((Number) obj4).intValue();
        Intrinsics.h(content, "content");
        if ((iIntValue & 6) == 0) {
            i = (composer.s(j) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= composer.I(content) ? 32 : 16;
        }
        if ((i & 147) == 146 && composer.c()) {
            composer.j();
        } else {
            CompositionLocalKt.a(androidx.camera.core.impl.b.g(j, RichTextLocalsKt.b), ComposableLambdaKt.c(-824975258, new Function2<Composer, Integer, Unit>() { // from class: com.halilibo.richtext.ui.ComposableSingletons$RichTextThemeConfigurationKt$lambda-2$1.1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    Composer composer2 = (Composer) obj5;
                    if ((((Number) obj6).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        content.invoke(composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composer), composer, 56);
        }
        return Unit.f24250a;
    }
}
