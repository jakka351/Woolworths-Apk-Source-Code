package androidx.compose.material.ripple;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material-ripple_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RippleAnimationKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1388a = 10;

    public static final float a(Density density, boolean z, long j) {
        float fD = Offset.d(OffsetKt.a(Size.d(j), Size.b(j))) / 2.0f;
        return z ? density.T1(f1388a) + fD : fD;
    }
}
