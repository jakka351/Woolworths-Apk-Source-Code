package com.halilibo.richtext.ui;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import com.halilibo.richtext.ui.string.RichTextStringStyle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"richtext-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class RichTextStyleKt {

    /* renamed from: a, reason: collision with root package name */
    public static final DynamicProvidableCompositionLocal f16291a = new DynamicProvidableCompositionLocal(new c(2));
    public static final long b = TextUnitKt.c(8);

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public static final void a(com.halilibo.richtext.ui.RichTextStyle r28, androidx.compose.runtime.internal.ComposableLambdaImpl r29, androidx.compose.runtime.Composer r30, int r31) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.halilibo.richtext.ui.RichTextStyleKt.a(com.halilibo.richtext.ui.RichTextStyle, androidx.compose.runtime.internal.ComposableLambdaImpl, androidx.compose.runtime.Composer, int):void");
    }

    public static final RichTextStyle b(RichTextScope richTextScope, Composer composer) {
        Intrinsics.h(richTextScope, "<this>");
        composer.o(1277159346);
        RichTextStyle richTextStyle = (RichTextStyle) composer.x(f16291a);
        composer.l();
        return richTextStyle;
    }

    public static final RichTextStyle c(RichTextStyle richTextStyle) {
        Intrinsics.h(richTextStyle, "<this>");
        TextUnit textUnit = richTextStyle.f16290a;
        TextUnit textUnit2 = new TextUnit(textUnit != null ? textUnit.f2204a : b);
        Function2 function2 = richTextStyle.b;
        if (function2 == null) {
            function2 = HeadingKt.f16283a;
        }
        Function2 function22 = function2;
        ListStyle listStyle = richTextStyle.c;
        if (listStyle == null) {
            listStyle = ListStyle.f;
        }
        b bVar = FormattedListKt.d;
        TextUnit textUnit3 = listStyle.f16286a;
        TextUnit textUnit4 = new TextUnit(textUnit3 != null ? textUnit3.f2204a : FormattedListKt.f16281a);
        TextUnit textUnit5 = listStyle.b;
        TextUnit textUnit6 = new TextUnit(textUnit5 != null ? textUnit5.f2204a : FormattedListKt.b);
        TextUnit textUnit7 = listStyle.c;
        TextUnit textUnit8 = new TextUnit(textUnit7 != null ? textUnit7.f2204a : FormattedListKt.c);
        Function1 function1 = listStyle.d;
        if (function1 == null) {
            function1 = FormattedListKt.d;
        }
        Function1 function12 = listStyle.e;
        if (function12 == null) {
            function12 = FormattedListKt.e;
        }
        ListStyle listStyle2 = new ListStyle(textUnit4, textUnit6, textUnit8, function1, function12);
        BlockQuoteGutter blockQuoteGutter = richTextStyle.d;
        if (blockQuoteGutter == null) {
            blockQuoteGutter = BlockQuoteKt.f16276a;
        }
        BlockQuoteGutter blockQuoteGutter2 = blockQuoteGutter;
        CodeBlockStyle codeBlockStyle = richTextStyle.e;
        if (codeBlockStyle == null) {
            codeBlockStyle = CodeBlockStyle.e;
        }
        TextStyle textStyle = CodeBlockKt.f16278a;
        TextStyle textStyle2 = codeBlockStyle.f16279a;
        if (textStyle2 == null) {
            textStyle2 = CodeBlockKt.f16278a;
        }
        Modifier modifier = codeBlockStyle.b;
        if (modifier == null) {
            modifier = CodeBlockKt.c;
        }
        TextUnit textUnit9 = codeBlockStyle.c;
        TextUnit textUnit10 = new TextUnit(textUnit9 != null ? textUnit9.f2204a : CodeBlockKt.d);
        Boolean bool = codeBlockStyle.d;
        CodeBlockStyle codeBlockStyle2 = new CodeBlockStyle(textStyle2, modifier, textUnit10, Boolean.valueOf(bool != null ? bool.booleanValue() : true));
        TableStyle tableStyle = richTextStyle.f;
        if (tableStyle == null) {
            tableStyle = TableStyle.e;
        }
        TextStyle textStyle3 = TableKt.f16296a;
        TextStyle textStyle4 = tableStyle.f16299a;
        if (textStyle4 == null) {
            textStyle4 = TableKt.f16296a;
        }
        TextUnit textUnit11 = tableStyle.b;
        TextUnit textUnit12 = new TextUnit(textUnit11 != null ? textUnit11.f2204a : TableKt.b);
        Color color = tableStyle.c;
        Color color2 = new Color(color != null ? color.f1766a : TableKt.c);
        Float f = tableStyle.d;
        TableStyle tableStyle2 = new TableStyle(textStyle4, textUnit12, color2, Float.valueOf(f != null ? f.floatValue() : 1.0f));
        InfoPanelStyle infoPanelStyle = richTextStyle.g;
        if (infoPanelStyle == null) {
            infoPanelStyle = InfoPanelStyle.d;
        }
        PaddingValuesImpl paddingValuesImpl = InfoPanelKt.f16284a;
        PaddingValues paddingValues = infoPanelStyle.f16285a;
        if (paddingValues == null) {
            paddingValues = InfoPanelKt.f16284a;
        }
        Function3 function3 = infoPanelStyle.b;
        if (function3 == null) {
            function3 = InfoPanelKt.b;
        }
        Function3 function32 = infoPanelStyle.c;
        if (function32 == null) {
            function32 = InfoPanelKt.c;
        }
        InfoPanelStyle infoPanelStyle2 = new InfoPanelStyle(paddingValues, function3, function32);
        RichTextStringStyle richTextStringStyle = richTextStyle.h;
        if (richTextStringStyle == null) {
            richTextStringStyle = RichTextStringStyle.i;
        }
        return new RichTextStyle(textUnit2, function22, listStyle2, blockQuoteGutter2, codeBlockStyle2, tableStyle2, infoPanelStyle2, richTextStringStyle.a());
    }
}
