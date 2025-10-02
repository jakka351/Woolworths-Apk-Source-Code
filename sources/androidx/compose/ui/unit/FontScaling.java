package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/unit/FontScaling;", "", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public interface FontScaling {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
    }

    default long H(float f) {
        float[] fArr = FontScaleConverterFactory.f2207a;
        if (getE() < 1.03f) {
            return TextUnitKt.e(llqqqql.a00610061aaaa, f / getE());
        }
        FontScaleConverter fontScaleConverterA = FontScaleConverterFactory.a(getE());
        return TextUnitKt.e(llqqqql.a00610061aaaa, fontScaleConverterA != null ? fontScaleConverterA.a(f) : f / getE());
    }

    /* renamed from: Q1 */
    float getE();

    default float r(long j) {
        float fC;
        float fQ1;
        if (!TextUnitType.a(TextUnit.b(j), llqqqql.a00610061aaaa)) {
            InlineClassHelperKt.b("Only Sp can convert to Px");
        }
        float[] fArr = FontScaleConverterFactory.f2207a;
        if (getE() >= 1.03f) {
            FontScaleConverter fontScaleConverterA = FontScaleConverterFactory.a(getE());
            fC = TextUnit.c(j);
            if (fontScaleConverterA != null) {
                return fontScaleConverterA.b(fC);
            }
            fQ1 = getE();
        } else {
            fC = TextUnit.c(j);
            fQ1 = getE();
        }
        return fQ1 * fC;
    }
}
