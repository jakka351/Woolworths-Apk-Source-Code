package androidx.compose.foundation.gestures;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/gestures/BringIntoViewSpec_androidKt$PivotBringIntoViewSpec$1", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BringIntoViewSpec_androidKt$PivotBringIntoViewSpec$1 implements BringIntoViewSpec {
    @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
    public final float a(float f, float f2, float f3) {
        float fAbs = Math.abs((f2 + f) - f);
        boolean z = fAbs <= f3;
        float f4 = (0.3f * f3) - (BitmapDescriptorFactory.HUE_RED * fAbs);
        float f5 = f3 - f4;
        if (z && f5 < fAbs) {
            f4 = f3 - fAbs;
        }
        return f - f4;
    }
}
