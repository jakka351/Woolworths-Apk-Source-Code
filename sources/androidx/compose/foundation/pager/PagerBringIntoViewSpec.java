package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/pager/PagerBringIntoViewSpec;", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PagerBringIntoViewSpec implements BringIntoViewSpec {
    public final PagerState b;
    public final BringIntoViewSpec c;

    public PagerBringIntoViewSpec(PagerState pagerState, BringIntoViewSpec bringIntoViewSpec) {
        this.b = pagerState;
        this.c = bringIntoViewSpec;
    }

    @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
    public final float a(float f, float f2, float f3) {
        float fA = this.c.a(f, f2, f3);
        boolean z = false;
        if (f <= BitmapDescriptorFactory.HUE_RED ? f + f2 <= BitmapDescriptorFactory.HUE_RED : f + f2 > f3) {
            z = true;
        }
        float fAbs = Math.abs(fA);
        PagerState pagerState = this.b;
        if (fAbs == BitmapDescriptorFactory.HUE_RED || !z) {
            if (Math.abs(pagerState.f) < 1.0E-6d) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            float fO = pagerState.f * (-1.0f);
            if (((Boolean) ((SnapshotMutableStateImpl) pagerState.H).getD()).booleanValue()) {
                fO += pagerState.o();
            }
            return RangesKt.b(fO, -f3, f3);
        }
        float fO2 = pagerState.f * (-1);
        while (fA > BitmapDescriptorFactory.HUE_RED && fO2 < fA) {
            fO2 += pagerState.o();
        }
        while (fA < BitmapDescriptorFactory.HUE_RED && fO2 > fA) {
            fO2 -= pagerState.o();
        }
        return fO2;
    }
}
