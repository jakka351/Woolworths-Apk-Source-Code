package androidx.compose.material.pullrefresh;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.State;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class PullRefreshKt$pullRefresh$1 extends FunctionReferenceImpl implements Function1<Float, Float> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float fA;
        float fFloatValue = ((Number) obj).floatValue();
        PullRefreshState pullRefreshState = (PullRefreshState) this.receiver;
        MutableFloatState mutableFloatState = pullRefreshState.f;
        State state = pullRefreshState.c;
        boolean zB = pullRefreshState.b();
        float f = BitmapDescriptorFactory.HUE_RED;
        if (!zB) {
            SnapshotMutableFloatStateImpl snapshotMutableFloatStateImpl = (SnapshotMutableFloatStateImpl) mutableFloatState;
            float fA2 = snapshotMutableFloatStateImpl.a() + fFloatValue;
            if (fA2 < BitmapDescriptorFactory.HUE_RED) {
                fA2 = 0.0f;
            }
            float fA3 = fA2 - snapshotMutableFloatStateImpl.a();
            ((SnapshotMutableFloatStateImpl) pullRefreshState.f).p(fA2);
            if (((Number) state.getD()).floatValue() <= pullRefreshState.a()) {
                fA = ((Number) state.getD()).floatValue();
            } else {
                float fAbs = Math.abs(((Number) state.getD()).floatValue() / pullRefreshState.a()) - 1.0f;
                if (fAbs >= BitmapDescriptorFactory.HUE_RED) {
                    f = fAbs;
                }
                if (f > 2.0f) {
                    f = 2.0f;
                }
                fA = (pullRefreshState.a() * (f - (((float) Math.pow(f, 2)) / 4))) + pullRefreshState.a();
            }
            ((SnapshotMutableFloatStateImpl) pullRefreshState.e).p(fA);
            f = fA3;
        }
        return Float.valueOf(f);
    }
}
