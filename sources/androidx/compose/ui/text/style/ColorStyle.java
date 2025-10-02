package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/style/ColorStyle;", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final /* data */ class ColorStyle implements TextForegroundStyle {

    /* renamed from: a, reason: collision with root package name */
    public final long f2150a;

    public ColorStyle(long j) {
        this.f2150a = j;
        if (j != 16) {
            return;
        }
        InlineClassHelperKt.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    /* renamed from: a */
    public final float getB() {
        return Color.d(this.f2150a);
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    /* renamed from: c, reason: from getter */
    public final long getF2150a() {
        return this.f2150a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ColorStyle) && Color.c(this.f2150a, ((ColorStyle) obj).f2150a);
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public final Brush getBrush() {
        return null;
    }

    public final int hashCode() {
        int i = Color.l;
        return Long.hashCode(this.f2150a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) Color.i(this.f2150a)) + ')';
    }
}
