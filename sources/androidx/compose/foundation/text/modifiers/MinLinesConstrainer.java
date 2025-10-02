package androidx.compose.foundation.text.modifiers;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class MinLinesConstrainer {
    public static MinLinesConstrainer h;

    /* renamed from: a, reason: collision with root package name */
    public final LayoutDirection f1188a;
    public final TextStyle b;
    public final Density c;
    public final FontFamily.Resolver d;
    public final TextStyle e;
    public float f = Float.NaN;
    public float g = Float.NaN;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer$Companion;", "", "Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "last", "Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static MinLinesConstrainer a(MinLinesConstrainer minLinesConstrainer, LayoutDirection layoutDirection, TextStyle textStyle, Density density, FontFamily.Resolver resolver) {
            if (minLinesConstrainer != null && layoutDirection == minLinesConstrainer.f1188a && TextStyleKt.b(textStyle, layoutDirection).equals(minLinesConstrainer.b) && density.getE() == minLinesConstrainer.c.getE() && resolver == minLinesConstrainer.d) {
                return minLinesConstrainer;
            }
            MinLinesConstrainer minLinesConstrainer2 = MinLinesConstrainer.h;
            if (minLinesConstrainer2 != null && layoutDirection == minLinesConstrainer2.f1188a && TextStyleKt.b(textStyle, layoutDirection).equals(minLinesConstrainer2.b) && density.getE() == minLinesConstrainer2.c.getE() && resolver == minLinesConstrainer2.d) {
                return minLinesConstrainer2;
            }
            MinLinesConstrainer minLinesConstrainer3 = new MinLinesConstrainer(layoutDirection, TextStyleKt.b(textStyle, layoutDirection), DensityKt.a(density.getE(), density.getF()), resolver);
            MinLinesConstrainer.h = minLinesConstrainer3;
            return minLinesConstrainer3;
        }
    }

    public MinLinesConstrainer(LayoutDirection layoutDirection, TextStyle textStyle, Density density, FontFamily.Resolver resolver) {
        this.f1188a = layoutDirection;
        this.b = textStyle;
        this.c = density;
        this.d = resolver;
        this.e = TextStyleKt.b(textStyle, layoutDirection);
    }

    public final long a(int i, long j) {
        int i2;
        float f = this.g;
        float f2 = this.f;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = MinLinesConstrainerKt.f1189a;
            long jB = ConstraintsKt.b(0, 0, 15);
            TextStyle textStyle = this.e;
            Density density = this.c;
            float fD = ParagraphKt.a(str, textStyle, jB, density, this.d, 1, 96).d();
            float fD2 = ParagraphKt.a(MinLinesConstrainerKt.b, this.e, ConstraintsKt.b(0, 0, 15), density, this.d, 2, 96).d() - fD;
            this.g = fD;
            this.f = fD2;
            f2 = fD2;
            f = fD;
        }
        if (i != 1) {
            int iRound = Math.round((f2 * (i - 1)) + f);
            i2 = iRound >= 0 ? iRound : 0;
            int iG = Constraints.g(j);
            if (i2 > iG) {
                i2 = iG;
            }
        } else {
            i2 = Constraints.i(j);
        }
        return ConstraintsKt.a(Constraints.j(j), Constraints.h(j), i2, Constraints.g(j));
    }
}
