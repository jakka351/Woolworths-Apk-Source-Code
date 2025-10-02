package androidx.compose.ui.unit.fontscaling;

import YU.a;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/unit/fontscaling/MathUtils;", "", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@RestrictTo
/* loaded from: classes2.dex */
public final class MathUtils {
    public static float a(float f, float f2, float f3, float f4, float f5) {
        return b(f, f2, Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(1.0f, f3 == f4 ? 0.0f : (f5 - f3) / (f4 - f3))));
    }

    public static float b(float f, float f2, float f3) {
        return a.a(f2, f, f3, f);
    }
}
