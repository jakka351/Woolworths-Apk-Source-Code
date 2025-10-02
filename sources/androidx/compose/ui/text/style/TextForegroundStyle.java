package androidx.compose.ui.text.style;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.SolidColor;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/style/TextForegroundStyle;", "", "Companion", "Unspecified", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface TextForegroundStyle {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/style/TextForegroundStyle$Companion;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static TextForegroundStyle a(Brush brush, float f) {
            if (brush == null) {
                return Unspecified.f2159a;
            }
            if (brush instanceof SolidColor) {
                return b(TextDrawStyleKt.c(((SolidColor) brush).f1783a, f));
            }
            if (brush instanceof ShaderBrush) {
                return new BrushStyle((ShaderBrush) brush, f);
            }
            throw new NoWhenBranchMatchedException();
        }

        public static TextForegroundStyle b(long j) {
            return j != 16 ? new ColorStyle(j) : Unspecified.f2159a;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/style/TextForegroundStyle$Unspecified;", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Unspecified implements TextForegroundStyle {

        /* renamed from: a, reason: collision with root package name */
        public static final Unspecified f2159a = new Unspecified();

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        /* renamed from: a */
        public final float getB() {
            return Float.NaN;
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        /* renamed from: c */
        public final long getF2150a() {
            int i = Color.l;
            return Color.k;
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        public final Brush getBrush() {
            return null;
        }
    }

    /* renamed from: a */
    float getB();

    default TextForegroundStyle b(Function0 function0) {
        return !equals(Unspecified.f2159a) ? this : (TextForegroundStyle) function0.invoke();
    }

    /* renamed from: c */
    long getF2150a();

    default TextForegroundStyle d(TextForegroundStyle textForegroundStyle) {
        boolean z = textForegroundStyle instanceof BrushStyle;
        if (!z || !(this instanceof BrushStyle)) {
            return (!z || (this instanceof BrushStyle)) ? (z || !(this instanceof BrushStyle)) ? textForegroundStyle.b(new Function0<TextForegroundStyle>() { // from class: androidx.compose.ui.text.style.TextForegroundStyle$merge$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.h;
                }
            }) : this : textForegroundStyle;
        }
        BrushStyle brushStyle = (BrushStyle) textForegroundStyle;
        return new BrushStyle(brushStyle.f2149a, TextDrawStyleKt.a(brushStyle.b, new TextForegroundStyle$merge$1(this)));
    }

    Brush getBrush();
}
