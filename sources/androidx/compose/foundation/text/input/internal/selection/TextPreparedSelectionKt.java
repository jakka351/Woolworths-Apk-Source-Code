package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.internal.IndexTransformationType;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TextPreparedSelectionKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[IndexTransformationType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IndexTransformationType indexTransformationType = IndexTransformationType.d;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                IndexTransformationType indexTransformationType2 = IndexTransformationType.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                IndexTransformationType indexTransformationType3 = IndexTransformationType.d;
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final long a(int i, int i2, TransformedTextFieldState transformedTextFieldState) {
        if (i == -1) {
            return (i2 << 32) | (4294967295L & (-1));
        }
        boolean z = i > i2;
        transformedTextFieldState.getClass();
        long jA = TextRangeKt.a(i, i);
        int iOrdinal = ((TextRange.c(jA) && TextRange.c(jA)) ? IndexTransformationType.d : (TextRange.c(jA) || TextRange.c(jA)) ? (!TextRange.c(jA) || TextRange.c(jA)) ? IndexTransformationType.g : IndexTransformationType.e : IndexTransformationType.f).ordinal();
        if (iOrdinal == 0) {
            return CursorAndWedgeAffinity.b(i, z ? WedgeAffinity.d : WedgeAffinity.e);
        }
        if (iOrdinal == 1) {
            return z ? i == ((int) (jA >> 32)) ? CursorAndWedgeAffinity.b(i, WedgeAffinity.d) : CursorAndWedgeAffinity.b((int) (jA & 4294967295L), WedgeAffinity.e) : i == ((int) (jA & 4294967295L)) ? CursorAndWedgeAffinity.b(i, WedgeAffinity.e) : CursorAndWedgeAffinity.b((int) (jA >> 32), WedgeAffinity.d);
        }
        if (iOrdinal == 2) {
            return z ? CursorAndWedgeAffinity.b((int) (jA & 4294967295L), WedgeAffinity.d) : CursorAndWedgeAffinity.b((int) (jA >> 32), WedgeAffinity.e);
        }
        if (iOrdinal == 3) {
            return (i << 32) | (4294967295L & (-1));
        }
        throw new NoWhenBranchMatchedException();
    }
}
