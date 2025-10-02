package com.halilibo.richtext.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"richtext-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class RichTextLocalsKt {

    /* renamed from: a, reason: collision with root package name */
    public static final DynamicProvidableCompositionLocal f16288a = new DynamicProvidableCompositionLocal(new c(1));
    public static final DynamicProvidableCompositionLocal b = new DynamicProvidableCompositionLocal(RichTextLocalsKt$LocalInternalContentColor$1.d);

    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(com.halilibo.richtext.ui.RichTextScope r29, androidx.compose.ui.text.AnnotatedString r30, androidx.compose.ui.Modifier r31, kotlin.jvm.functions.Function1 r32, java.util.Map r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.halilibo.richtext.ui.RichTextLocalsKt.a(com.halilibo.richtext.ui.RichTextScope, androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, java.util.Map, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(com.halilibo.richtext.ui.RichTextScope r27, java.lang.String r28, androidx.compose.ui.Modifier r29, kotlin.jvm.functions.Function1 r30, int r31, boolean r32, int r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.halilibo.richtext.ui.RichTextLocalsKt.b(com.halilibo.richtext.ui.RichTextScope, java.lang.String, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, int, boolean, int, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final long c(RichTextScope richTextScope, Composer composer) {
        Intrinsics.h(richTextScope, "<this>");
        composer.o(-401305534);
        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = RichTextThemeConfigurationKt.f16293a;
        composer.o(-730696581);
        Function2 function2 = ((RichTextThemeConfiguration) composer.x(RichTextThemeConfigurationKt.f16293a)).c;
        composer.l();
        long j = ((Color) function2.invoke(composer, 0)).f1766a;
        composer.l();
        return j;
    }

    public static final TextStyle d(RichTextScope richTextScope, Composer composer) {
        Intrinsics.h(richTextScope, "<this>");
        composer.o(-1652167225);
        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = RichTextThemeConfigurationKt.f16293a;
        composer.o(605597993);
        Function2 function2 = ((RichTextThemeConfiguration) composer.x(RichTextThemeConfigurationKt.f16293a)).f16292a;
        composer.l();
        TextStyle textStyle = (TextStyle) function2.invoke(composer, 0);
        composer.l();
        return textStyle;
    }
}
