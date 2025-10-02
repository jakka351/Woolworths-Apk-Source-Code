package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-unit_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class IntRectKt {
    public static final IntRect a(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new IntRect(i, i2, ((int) (j2 >> 32)) + i, ((int) (j2 & 4294967295L)) + i2);
    }

    public static final IntRect b(Rect rect) {
        return new IntRect(Math.round(rect.f1752a), Math.round(rect.b), Math.round(rect.c), Math.round(rect.d));
    }
}
