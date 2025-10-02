package com.halilibo.richtext.ui.string;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import com.halilibo.richtext.ui.string.RichTextString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/halilibo/richtext/ui/string/RichTextStringStyle;", "", "Companion", "richtext-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RichTextStringStyle {
    public static final RichTextStringStyle i = new RichTextStringStyle(null, 255);

    /* renamed from: a, reason: collision with root package name */
    public final SpanStyle f16308a;
    public final SpanStyle b;
    public final SpanStyle c;
    public final SpanStyle d;
    public final SpanStyle e;
    public final SpanStyle f;
    public final SpanStyle g;
    public final TextLinkStyles h;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/ui/string/RichTextStringStyle$Companion;", "", "richtext-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static final SpanStyle a(SpanStyle spanStyle, SpanStyle spanStyle2) {
            RichTextStringStyle richTextStringStyle = RichTextStringStyle.i;
            return spanStyle != null ? spanStyle.d(spanStyle2) : spanStyle2;
        }
    }

    public RichTextStringStyle(SpanStyle spanStyle, SpanStyle spanStyle2, SpanStyle spanStyle3, SpanStyle spanStyle4, SpanStyle spanStyle5, SpanStyle spanStyle6, SpanStyle spanStyle7, TextLinkStyles textLinkStyles) {
        this.f16308a = spanStyle;
        this.b = spanStyle2;
        this.c = spanStyle3;
        this.d = spanStyle4;
        this.e = spanStyle5;
        this.f = spanStyle6;
        this.g = spanStyle7;
        this.h = textLinkStyles;
    }

    public final RichTextStringStyle a() {
        SpanStyle spanStyle = this.f16308a;
        if (spanStyle == null) {
            RichTextString.Format.Bold bold = RichTextString.Format.Bold.d;
            spanStyle = RichTextString.Format.Bold.e;
        }
        SpanStyle spanStyle2 = this.b;
        if (spanStyle2 == null) {
            RichTextString.Format.Italic italic = RichTextString.Format.Italic.d;
            spanStyle2 = RichTextString.Format.Italic.e;
        }
        SpanStyle spanStyle3 = this.c;
        if (spanStyle3 == null) {
            RichTextString.Format.Underline underline = RichTextString.Format.Underline.d;
            spanStyle3 = RichTextString.Format.Underline.e;
        }
        SpanStyle spanStyle4 = this.d;
        if (spanStyle4 == null) {
            RichTextString.Format.Strikethrough strikethrough = RichTextString.Format.Strikethrough.d;
            spanStyle4 = RichTextString.Format.Strikethrough.e;
        }
        SpanStyle spanStyle5 = this.e;
        if (spanStyle5 == null) {
            RichTextString.Format.Subscript subscript = RichTextString.Format.Subscript.d;
            spanStyle5 = RichTextString.Format.Subscript.e;
        }
        SpanStyle spanStyle6 = this.f;
        if (spanStyle6 == null) {
            RichTextString.Format.Superscript superscript = RichTextString.Format.Superscript.d;
            spanStyle6 = RichTextString.Format.Superscript.e;
        }
        SpanStyle spanStyle7 = this.g;
        if (spanStyle7 == null) {
            RichTextString.Format.Code code = RichTextString.Format.Code.d;
            spanStyle7 = RichTextString.Format.Code.e;
        }
        TextLinkStyles textLinkStyles = this.h;
        if (textLinkStyles == null) {
            TextLinkStyles textLinkStyles2 = RichTextString.Format.Link.e;
            textLinkStyles = RichTextString.Format.Link.e;
        }
        return new RichTextStringStyle(spanStyle, spanStyle2, spanStyle3, spanStyle4, spanStyle5, spanStyle6, spanStyle7, textLinkStyles);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RichTextStringStyle)) {
            return false;
        }
        RichTextStringStyle richTextStringStyle = (RichTextStringStyle) obj;
        return Intrinsics.c(this.f16308a, richTextStringStyle.f16308a) && Intrinsics.c(this.b, richTextStringStyle.b) && Intrinsics.c(this.c, richTextStringStyle.c) && Intrinsics.c(this.d, richTextStringStyle.d) && Intrinsics.c(this.e, richTextStringStyle.e) && Intrinsics.c(this.f, richTextStringStyle.f) && Intrinsics.c(this.g, richTextStringStyle.g) && Intrinsics.c(this.h, richTextStringStyle.h);
    }

    public final int hashCode() {
        SpanStyle spanStyle = this.f16308a;
        int iHashCode = (spanStyle != null ? spanStyle.hashCode() : 0) * 31;
        SpanStyle spanStyle2 = this.b;
        int iHashCode2 = (iHashCode + (spanStyle2 != null ? spanStyle2.hashCode() : 0)) * 31;
        SpanStyle spanStyle3 = this.c;
        int iHashCode3 = (iHashCode2 + (spanStyle3 != null ? spanStyle3.hashCode() : 0)) * 31;
        SpanStyle spanStyle4 = this.d;
        int iHashCode4 = (iHashCode3 + (spanStyle4 != null ? spanStyle4.hashCode() : 0)) * 31;
        SpanStyle spanStyle5 = this.e;
        int iHashCode5 = (iHashCode4 + (spanStyle5 != null ? spanStyle5.hashCode() : 0)) * 31;
        SpanStyle spanStyle6 = this.f;
        int iHashCode6 = (iHashCode5 + (spanStyle6 != null ? spanStyle6.hashCode() : 0)) * 31;
        SpanStyle spanStyle7 = this.g;
        int iHashCode7 = (iHashCode6 + (spanStyle7 != null ? spanStyle7.hashCode() : 0)) * 31;
        TextLinkStyles textLinkStyles = this.h;
        return iHashCode7 + (textLinkStyles != null ? textLinkStyles.hashCode() : 0);
    }

    public final String toString() {
        return "RichTextStringStyle(boldStyle=" + this.f16308a + ", italicStyle=" + this.b + ", underlineStyle=" + this.c + ", strikethroughStyle=" + this.d + ", subscriptStyle=" + this.e + ", superscriptStyle=" + this.f + ", codeStyle=" + this.g + ", linkStyle=" + this.h + ")";
    }

    public /* synthetic */ RichTextStringStyle(TextLinkStyles textLinkStyles, int i2) {
        this(null, null, null, null, null, null, null, (i2 & 128) != 0 ? null : textLinkStyles);
    }
}
