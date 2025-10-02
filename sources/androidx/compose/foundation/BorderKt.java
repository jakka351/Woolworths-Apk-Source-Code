package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class BorderKt {
    public static final Modifier a(Modifier modifier, float f, long j, Shape shape) {
        return b(modifier, f, new SolidColor(j), shape);
    }

    public static final Modifier b(Modifier modifier, float f, SolidColor solidColor, Shape shape) {
        return modifier.x0(new BorderModifierNodeElement(f, solidColor, shape));
    }

    public static final long c(long j, float f) {
        float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, Float.intBitsToFloat((int) (j >> 32)) - f);
        float fMax2 = Math.max(BitmapDescriptorFactory.HUE_RED, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & 4294967295L);
    }
}
