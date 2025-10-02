package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/pager/DefaultPagerNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class DefaultPagerNestedScrollConnection implements NestedScrollConnection {
    public final PagerState d;
    public final Orientation e;

    public DefaultPagerNestedScrollConnection(PagerState pagerState, Orientation orientation) {
        this.d = pagerState;
        this.e = orientation;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final Object V(long j, long j2, Continuation continuation) {
        return new Velocity(this.e == Orientation.d ? Velocity.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 2, j2) : Velocity.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1, j2));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long b0(int i, long j) {
        if (i != 1) {
            return 0L;
        }
        PagerState pagerState = this.d;
        if (Math.abs(pagerState.k()) <= 1.0E-6d) {
            return 0L;
        }
        float fK = pagerState.k() * pagerState.n();
        float c = ((pagerState.l().getC() + pagerState.l().getB()) * (-Math.signum(pagerState.k()))) + fK;
        if (pagerState.k() > BitmapDescriptorFactory.HUE_RED) {
            c = fK;
            fK = c;
        }
        Orientation orientation = Orientation.e;
        Orientation orientation2 = this.e;
        float fIntBitsToFloat = -pagerState.k.c(-RangesKt.b(Float.intBitsToFloat((int) (orientation2 == orientation ? j >> 32 : j & 4294967295L)), fK, c));
        float fIntBitsToFloat2 = orientation2 == orientation ? fIntBitsToFloat : Float.intBitsToFloat((int) (j >> 32));
        if (orientation2 != Orientation.d) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return (Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long n0(int i, long j, long j2) {
        if (i != 2) {
            return 0L;
        }
        if (Float.intBitsToFloat((int) (this.e == Orientation.e ? j2 >> 32 : 4294967295L & j2)) == BitmapDescriptorFactory.HUE_RED) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }
}
