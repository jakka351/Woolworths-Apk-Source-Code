package com.halilibo.richtext.ui.string;

import androidx.compose.foundation.text.InlineTextContentKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.rewards.base.d;
import com.halilibo.richtext.ui.CodeBlockKt;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/halilibo/richtext/ui/string/RichTextString;", "", "Format", "Builder", "richtext-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class RichTextString {

    /* renamed from: a, reason: collision with root package name */
    public final AnnotatedString f16305a;
    public final Map b;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/ui/string/RichTextString$Builder;", "", "richtext-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final AnnotatedString.Builder f16306a = new AnnotatedString.Builder(16);
        public final LinkedHashMap b = new LinkedHashMap();

        public static void b(Builder builder, InlineContent inlineContent) {
            String strH = a.h("toString(...)");
            builder.b.put("inline:".concat(strH), inlineContent);
            InlineTextContentKt.a(builder.f16306a, strH, "�");
        }

        public final void a(String text) {
            Intrinsics.h(text, "text");
            this.f16306a.e(text);
        }

        public final int c(Format format) {
            LinkedHashMap tags = this.b;
            Intrinsics.h(tags, "tags");
            String strConcat = format.f16307a;
            if (strConcat == null) {
                String string = UUID.randomUUID().toString();
                Intrinsics.g(string, "toString(...)");
                tags.put(string, format);
                strConcat = "format:".concat(string);
            }
            return this.f16306a.k(Format.b, strConcat);
        }

        public final RichTextString d() {
            return new RichTextString(this.f16306a.m(), MapsKt.q(this.b));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/halilibo/richtext/ui/string/RichTextString$Format;", "", "Italic", "Bold", "Underline", "Strikethrough", "Subscript", "Superscript", "Code", "Link", "Companion", "Lcom/halilibo/richtext/ui/string/RichTextString$Format$Bold;", "Lcom/halilibo/richtext/ui/string/RichTextString$Format$Code;", "Lcom/halilibo/richtext/ui/string/RichTextString$Format$Italic;", "Lcom/halilibo/richtext/ui/string/RichTextString$Format$Link;", "Lcom/halilibo/richtext/ui/string/RichTextString$Format$Strikethrough;", "Lcom/halilibo/richtext/ui/string/RichTextString$Format$Subscript;", "Lcom/halilibo/richtext/ui/string/RichTextString$Format$Superscript;", "Lcom/halilibo/richtext/ui/string/RichTextString$Format$Underline;", "richtext-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static abstract class Format {
        public static final String b;
        public static final Object c;

        /* renamed from: a, reason: collision with root package name */
        public final String f16307a;

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/ui/string/RichTextString$Format$Bold;", "Lcom/halilibo/richtext/ui/string/RichTextString$Format;", "richtext-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Bold extends Format {
            public static final Bold d = new Bold("foo");
            public static final SpanStyle e = new SpanStyle(0, 0, FontWeight.m, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, 65531);

            @Override // com.halilibo.richtext.ui.string.RichTextString.Format
            public final Object a(RichTextStringStyle richTextStringStyle) {
                return richTextStringStyle.f16308a;
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/ui/string/RichTextString$Format$Code;", "Lcom/halilibo/richtext/ui/string/RichTextString$Format;", "richtext-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Code extends Format {
            public static final Code d = new Code("code");
            public static final SpanStyle e = new SpanStyle(0, 0, FontWeight.k, (FontStyle) null, (FontSynthesis) null, FontFamily.g, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, CodeBlockKt.b, (TextDecoration) null, (Shadow) null, 63451);

            @Override // com.halilibo.richtext.ui.string.RichTextString.Format
            public final Object a(RichTextStringStyle richTextStringStyle) {
                return richTextStringStyle.g;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/ui/string/RichTextString$Format$Companion;", "", "richtext-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @SourceDebugExtension
        public static final class Companion {
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/ui/string/RichTextString$Format$Italic;", "Lcom/halilibo/richtext/ui/string/RichTextString$Format;", "richtext-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Italic extends Format {
            public static final Italic d = new Italic("italic");
            public static final SpanStyle e = new SpanStyle(0, 0, (FontWeight) null, new FontStyle(1), (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, 65527);

            @Override // com.halilibo.richtext.ui.string.RichTextString.Format
            public final Object a(RichTextStringStyle richTextStringStyle) {
                return richTextStringStyle.b;
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/halilibo/richtext/ui/string/RichTextString$Format$Link;", "Lcom/halilibo/richtext/ui/string/RichTextString$Format;", "Companion", "richtext-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Link extends Format {
            public static final TextLinkStyles e;
            public final String d;

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/ui/string/RichTextString$Format$Link$Companion;", "", "richtext-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
            }

            static {
                long j = Color.h;
                e = new TextLinkStyles(new SpanStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65534), new SpanStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, 61438), 10);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Link(String destination) {
                super(null);
                Intrinsics.h(destination, "destination");
                this.d = destination;
            }

            @Override // com.halilibo.richtext.ui.string.RichTextString.Format
            public final Object a(RichTextStringStyle richTextStringStyle) {
                return new LinkAnnotation.Url(this.d, richTextStringStyle.h);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Link) {
                    return Intrinsics.c(this.d, ((Link) obj).d);
                }
                return false;
            }

            public final int hashCode() {
                return this.d.hashCode() * 31;
            }

            public final String toString() {
                return YU.a.h("Link(destination='", this.d, "', linkInteractionListener=null)");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/ui/string/RichTextString$Format$Strikethrough;", "Lcom/halilibo/richtext/ui/string/RichTextString$Format;", "richtext-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Strikethrough extends Format {
            public static final Strikethrough d = new Strikethrough("strikethrough");
            public static final SpanStyle e = new SpanStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, TextDecoration.d, (Shadow) null, 61439);

            @Override // com.halilibo.richtext.ui.string.RichTextString.Format
            public final Object a(RichTextStringStyle richTextStringStyle) {
                return richTextStringStyle.d;
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/ui/string/RichTextString$Format$Subscript;", "Lcom/halilibo/richtext/ui/string/RichTextString$Format;", "richtext-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Subscript extends Format {
            public static final Subscript d = new Subscript("subscript");
            public static final SpanStyle e = new SpanStyle(0, TextUnitKt.c(10), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, new BaselineShift(-0.2f), (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, 65277);

            @Override // com.halilibo.richtext.ui.string.RichTextString.Format
            public final Object a(RichTextStringStyle richTextStringStyle) {
                return richTextStringStyle.e;
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/ui/string/RichTextString$Format$Superscript;", "Lcom/halilibo/richtext/ui/string/RichTextString$Format;", "richtext-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Superscript extends Format {
            public static final Superscript d = new Superscript("superscript");
            public static final SpanStyle e = new SpanStyle(0, TextUnitKt.c(10), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, new BaselineShift(0.5f), (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, 65277);

            @Override // com.halilibo.richtext.ui.string.RichTextString.Format
            public final Object a(RichTextStringStyle richTextStringStyle) {
                return richTextStringStyle.f;
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/ui/string/RichTextString$Format$Underline;", "Lcom/halilibo/richtext/ui/string/RichTextString$Format;", "richtext-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Underline extends Format {
            public static final Underline d = new Underline("underline");
            public static final SpanStyle e = new SpanStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, TextDecoration.c, (Shadow) null, 61439);

            @Override // com.halilibo.richtext.ui.string.RichTextString.Format
            public final Object a(RichTextStringStyle richTextStringStyle) {
                return richTextStringStyle.c;
            }
        }

        static {
            String strX = Reflection.f24268a.b(Format.class).x();
            Intrinsics.e(strX);
            b = strX;
            c = LazyKt.a(LazyThreadSafetyMode.e, new d(21));
        }

        public Format(String str) {
            this.f16307a = str;
        }

        public Object a(RichTextStringStyle richTextStringStyle) {
            return null;
        }
    }

    public RichTextString(AnnotatedString annotatedString, Map map) {
        this.f16305a = annotatedString;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RichTextString)) {
            return false;
        }
        RichTextString richTextString = (RichTextString) obj;
        return Intrinsics.c(this.f16305a, richTextString.f16305a) && Intrinsics.c(this.b, richTextString.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16305a.hashCode() * 31);
    }
}
