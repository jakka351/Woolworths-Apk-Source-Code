package androidx.compose.ui.text.platform.extensions;

import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SpannableExtensions_androidKt {
    public static final float a(long j, float f, Density density) {
        if (TextUnit.a(j, TextUnit.c)) {
            return f;
        }
        long jB = TextUnit.b(j);
        if (TextUnitType.a(jB, llqqqql.a00610061aaaa)) {
            return density.t1(j);
        }
        if (TextUnitType.a(jB, 8589934592L)) {
            return TextUnit.c(j) * f;
        }
        return Float.NaN;
    }

    public static final float b(long j, float f, Density density) {
        float fC;
        long jB = TextUnit.b(j);
        if (TextUnitType.a(jB, llqqqql.a00610061aaaa)) {
            if (density.getF() <= 1.05d) {
                return density.t1(j);
            }
            fC = TextUnit.c(j) / TextUnit.c(density.v(f));
        } else {
            if (!TextUnitType.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = TextUnit.c(j);
        }
        return fC * f;
    }

    public static final void c(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(ColorKt.j(j)), i, i2, 33);
        }
    }

    public static final void d(Spannable spannable, long j, Density density, int i, int i2) {
        long jB = TextUnit.b(j);
        if (TextUnitType.a(jB, llqqqql.a00610061aaaa)) {
            spannable.setSpan(new AbsoluteSizeSpan(MathKt.b(density.t1(j)), false), i, i2, 33);
        } else if (TextUnitType.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(TextUnit.c(j)), i, i2, 33);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(final android.text.Spannable r30, androidx.compose.ui.text.TextStyle r31, java.util.List r32, androidx.compose.ui.unit.Density r33, final kotlin.jvm.functions.Function4 r34) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.e(android.text.Spannable, androidx.compose.ui.text.TextStyle, java.util.List, androidx.compose.ui.unit.Density, kotlin.jvm.functions.Function4):void");
    }
}
