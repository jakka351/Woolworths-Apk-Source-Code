package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/TextLinkStyles;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextLinkStyles {

    /* renamed from: a, reason: collision with root package name */
    public final SpanStyle f2065a;
    public final SpanStyle b;
    public final SpanStyle c;
    public final SpanStyle d;

    public TextLinkStyles(SpanStyle spanStyle, SpanStyle spanStyle2, SpanStyle spanStyle3, SpanStyle spanStyle4) {
        this.f2065a = spanStyle;
        this.b = spanStyle2;
        this.c = spanStyle3;
        this.d = spanStyle4;
    }

    /* renamed from: a, reason: from getter */
    public final SpanStyle getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final SpanStyle getC() {
        return this.c;
    }

    /* renamed from: c, reason: from getter */
    public final SpanStyle getD() {
        return this.d;
    }

    /* renamed from: d, reason: from getter */
    public final SpanStyle getF2065a() {
        return this.f2065a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TextLinkStyles)) {
            return false;
        }
        TextLinkStyles textLinkStyles = (TextLinkStyles) obj;
        return Intrinsics.c(this.f2065a, textLinkStyles.f2065a) && Intrinsics.c(this.b, textLinkStyles.b) && Intrinsics.c(this.c, textLinkStyles.c) && Intrinsics.c(this.d, textLinkStyles.d);
    }

    public final int hashCode() {
        SpanStyle spanStyle = this.f2065a;
        int iHashCode = (spanStyle != null ? spanStyle.hashCode() : 0) * 31;
        SpanStyle spanStyle2 = this.b;
        int iHashCode2 = (iHashCode + (spanStyle2 != null ? spanStyle2.hashCode() : 0)) * 31;
        SpanStyle spanStyle3 = this.c;
        int iHashCode3 = (iHashCode2 + (spanStyle3 != null ? spanStyle3.hashCode() : 0)) * 31;
        SpanStyle spanStyle4 = this.d;
        return iHashCode3 + (spanStyle4 != null ? spanStyle4.hashCode() : 0);
    }

    public /* synthetic */ TextLinkStyles(SpanStyle spanStyle, SpanStyle spanStyle2, int i) {
        this((i & 1) != 0 ? null : spanStyle, null, (i & 4) != 0 ? null : spanStyle2, null);
    }
}
