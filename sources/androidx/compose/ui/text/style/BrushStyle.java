package androidx.compose.ui.text.style;

import android.support.v4.media.session.a;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ShaderBrush;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/style/BrushStyle;", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class BrushStyle implements TextForegroundStyle {

    /* renamed from: a, reason: collision with root package name */
    public final ShaderBrush f2149a;
    public final float b;

    public BrushStyle(ShaderBrush shaderBrush, float f) {
        this.f2149a = shaderBrush;
        this.b = f;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    /* renamed from: a, reason: from getter */
    public final float getB() {
        return this.b;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    /* renamed from: c */
    public final long getF2150a() {
        int i = Color.l;
        return Color.k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrushStyle)) {
            return false;
        }
        BrushStyle brushStyle = (BrushStyle) obj;
        return Intrinsics.c(this.f2149a, brushStyle.f2149a) && Float.compare(this.b, brushStyle.b) == 0;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public final Brush getBrush() {
        return this.f2149a;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.f2149a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.f2149a);
        sb.append(", alpha=");
        return a.r(sb, this.b, ')');
    }
}
