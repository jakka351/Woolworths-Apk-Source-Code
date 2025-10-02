package androidx.compose.foundation.text.selection;

import androidx.compose.ui.semantics.SemanticsPropertyKey;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SelectionHandlesKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1211a;
    public static final float b;
    public static final SemanticsPropertyKey c = new SemanticsPropertyKey("SelectionHandleInfo");

    static {
        float f = 25;
        f1211a = f;
        b = f;
    }

    public static final long a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - 1.0f;
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
