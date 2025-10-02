package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.pager.PagerState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PagerSnapLayoutInfoProviderKt {
    public static final float a(PagerState pagerState) {
        return pagerState.l().getE() == Orientation.e ? Float.intBitsToFloat((int) (pagerState.p() >> 32)) : Float.intBitsToFloat((int) (pagerState.p() & 4294967295L));
    }

    public static final boolean b(PagerState pagerState, float f) {
        boolean zF = pagerState.l().F();
        boolean z = (pagerState.q() ? -f : a(pagerState)) > BitmapDescriptorFactory.HUE_RED;
        return (z && zF) || !(z || zF);
    }
}
