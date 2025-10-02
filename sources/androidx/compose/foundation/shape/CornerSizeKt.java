package androidx.compose.foundation.shape;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CornerSizeKt {

    /* renamed from: a, reason: collision with root package name */
    public static final CornerSizeKt$ZeroCornerSize$1 f1098a = new CornerSizeKt$ZeroCornerSize$1();

    public static final CornerSize a(int i) {
        return new PercentCornerSize(i);
    }

    public static final CornerSize b(float f) {
        return new DpCornerSize(f);
    }
}
