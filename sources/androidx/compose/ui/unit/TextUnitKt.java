package androidx.compose.ui.unit;

import androidx.compose.ui.util.MathHelpersKt;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-unit_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class TextUnitKt {
    public static final void a(long j) {
        TextUnitType[] textUnitTypeArr = TextUnit.b;
        if ((j & 1095216660480L) == 0) {
            InlineClassHelperKt.a("Cannot perform operation for Unspecified type.");
        }
    }

    public static final long b(double d) {
        return e(llqqqql.a00610061aaaa, (float) d);
    }

    public static final long c(int i) {
        return e(llqqqql.a00610061aaaa, i);
    }

    public static final long d(long j, float f, long j2) {
        TextUnitType[] textUnitTypeArr = TextUnit.b;
        long j3 = j & 1095216660480L;
        if (j3 == 0 || (1095216660480L & j2) == 0) {
            InlineClassHelperKt.a("Cannot perform operation for Unspecified type.");
        }
        if (!TextUnitType.a(TextUnit.b(j), TextUnit.b(j2))) {
            InlineClassHelperKt.a("Cannot perform operation for " + ((Object) TextUnitType.b(TextUnit.b(j))) + " and " + ((Object) TextUnitType.b(TextUnit.b(j2))));
        }
        return e(j3, MathHelpersKt.b(TextUnit.c(j), TextUnit.c(j2), f));
    }

    public static final long e(long j, float f) {
        long jFloatToRawIntBits = j | (Float.floatToRawIntBits(f) & 4294967295L);
        TextUnitType[] textUnitTypeArr = TextUnit.b;
        return jFloatToRawIntBits;
    }
}
