package com.halilibo.richtext.ui;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.TextUnit;
import com.halilibo.richtext.ui.string.RichTextStringStyle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/halilibo/richtext/ui/RichTextStyle;", "", "Companion", "richtext-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class RichTextStyle {
    public static final RichTextStyle i = new RichTextStyle(null, null, null, null, null, null, null, null);

    /* renamed from: a, reason: collision with root package name */
    public final TextUnit f16290a;
    public final Function2 b;
    public final ListStyle c;
    public final BlockQuoteGutter d;
    public final CodeBlockStyle e;
    public final TableStyle f;
    public final InfoPanelStyle g;
    public final RichTextStringStyle h;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/ui/RichTextStyle$Companion;", "", "richtext-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public RichTextStyle(TextUnit textUnit, Function2 function2, ListStyle listStyle, BlockQuoteGutter blockQuoteGutter, CodeBlockStyle codeBlockStyle, TableStyle tableStyle, InfoPanelStyle infoPanelStyle, RichTextStringStyle richTextStringStyle) {
        this.f16290a = textUnit;
        this.b = function2;
        this.c = listStyle;
        this.d = blockQuoteGutter;
        this.e = codeBlockStyle;
        this.f = tableStyle;
        this.g = infoPanelStyle;
        this.h = richTextStringStyle;
    }

    public static RichTextStyle a(RichTextStyle richTextStyle, TextUnit textUnit, Function2 function2, RichTextStringStyle richTextStringStyle, int i2) {
        if ((i2 & 2) != 0) {
            function2 = richTextStyle.b;
        }
        Function2 function22 = function2;
        ListStyle listStyle = richTextStyle.c;
        BlockQuoteGutter blockQuoteGutter = richTextStyle.d;
        CodeBlockStyle codeBlockStyle = richTextStyle.e;
        TableStyle tableStyle = richTextStyle.f;
        InfoPanelStyle infoPanelStyle = richTextStyle.g;
        if ((i2 & 128) != 0) {
            richTextStringStyle = richTextStyle.h;
        }
        richTextStyle.getClass();
        return new RichTextStyle(textUnit, function22, listStyle, blockQuoteGutter, codeBlockStyle, tableStyle, infoPanelStyle, richTextStringStyle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RichTextStyle)) {
            return false;
        }
        RichTextStyle richTextStyle = (RichTextStyle) obj;
        return Intrinsics.c(this.f16290a, richTextStyle.f16290a) && Intrinsics.c(this.b, richTextStyle.b) && Intrinsics.c(this.c, richTextStyle.c) && Intrinsics.c(this.d, richTextStyle.d) && Intrinsics.c(this.e, richTextStyle.e) && Intrinsics.c(this.f, richTextStyle.f) && Intrinsics.c(this.g, richTextStyle.g) && Intrinsics.c(this.h, richTextStyle.h);
    }

    public final int hashCode() {
        TextUnit textUnit = this.f16290a;
        int iHashCode = (textUnit == null ? 0 : Long.hashCode(textUnit.f2204a)) * 31;
        Function2 function2 = this.b;
        int iHashCode2 = (iHashCode + (function2 == null ? 0 : function2.hashCode())) * 31;
        ListStyle listStyle = this.c;
        int iHashCode3 = (iHashCode2 + (listStyle == null ? 0 : listStyle.hashCode())) * 31;
        BlockQuoteGutter blockQuoteGutter = this.d;
        int iHashCode4 = (iHashCode3 + (blockQuoteGutter == null ? 0 : blockQuoteGutter.hashCode())) * 31;
        CodeBlockStyle codeBlockStyle = this.e;
        int iHashCode5 = (iHashCode4 + (codeBlockStyle == null ? 0 : codeBlockStyle.hashCode())) * 31;
        TableStyle tableStyle = this.f;
        int iHashCode6 = (iHashCode5 + (tableStyle == null ? 0 : tableStyle.hashCode())) * 31;
        InfoPanelStyle infoPanelStyle = this.g;
        int iHashCode7 = (iHashCode6 + (infoPanelStyle == null ? 0 : infoPanelStyle.hashCode())) * 31;
        RichTextStringStyle richTextStringStyle = this.h;
        return iHashCode7 + (richTextStringStyle != null ? richTextStringStyle.hashCode() : 0);
    }

    public final String toString() {
        return "RichTextStyle(paragraphSpacing=" + this.f16290a + ", headingStyle=" + this.b + ", listStyle=" + this.c + ", blockQuoteGutter=" + this.d + ", codeBlockStyle=" + this.e + ", tableStyle=" + this.f + ", infoPanelStyle=" + this.g + ", stringStyle=" + this.h + ")";
    }
}
