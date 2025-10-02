package androidx.compose.ui.unit;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-unit_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DensityKt {
    public static final Density a(float f, float f2) {
        return new DensityImpl(f, f2);
    }

    public static Density b() {
        return new DensityImpl(1.0f, 1.0f);
    }
}
