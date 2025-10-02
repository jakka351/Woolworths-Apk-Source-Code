package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/PlatformTextStyle;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlatformTextStyle {

    /* renamed from: a, reason: collision with root package name */
    public final PlatformSpanStyle f2054a;
    public final PlatformParagraphStyle b;

    public PlatformTextStyle(PlatformSpanStyle platformSpanStyle, PlatformParagraphStyle platformParagraphStyle) {
        this.f2054a = platformSpanStyle;
        this.b = platformParagraphStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformTextStyle)) {
            return false;
        }
        PlatformTextStyle platformTextStyle = (PlatformTextStyle) obj;
        return Intrinsics.c(this.b, platformTextStyle.b) && Intrinsics.c(this.f2054a, platformTextStyle.f2054a);
    }

    public final int hashCode() {
        PlatformSpanStyle platformSpanStyle = this.f2054a;
        int iHashCode = (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.b;
        return iHashCode + (platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f2054a + ", paragraphSyle=" + this.b + ')';
    }

    public PlatformTextStyle(boolean z) {
        this(null, new PlatformParagraphStyle(z));
    }
}
