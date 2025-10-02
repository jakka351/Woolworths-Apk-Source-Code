package androidx.compose.material.pullrefresh;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.BuildersKt;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class PullRefreshKt$pullRefresh$2 extends AdaptedFunctionReference implements Function2<Float, Continuation<? super Float>, Object>, SuspendFunction {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        float fFloatValue = ((Number) obj).floatValue();
        PullRefreshState pullRefreshState = (PullRefreshState) this.d;
        boolean zB = pullRefreshState.b();
        MutableFloatState mutableFloatState = pullRefreshState.f;
        float f = BitmapDescriptorFactory.HUE_RED;
        if (!zB) {
            if (((Number) pullRefreshState.c.getD()).floatValue() > pullRefreshState.a()) {
                ((Function0) pullRefreshState.b.getD()).invoke();
            }
            BuildersKt.c(pullRefreshState.f1383a, null, null, new PullRefreshState$animateIndicatorTo$1(pullRefreshState, BitmapDescriptorFactory.HUE_RED, null), 3);
            if (((SnapshotMutableFloatStateImpl) mutableFloatState).a() == BitmapDescriptorFactory.HUE_RED || fFloatValue < BitmapDescriptorFactory.HUE_RED) {
                fFloatValue = 0.0f;
            }
            ((SnapshotMutableFloatStateImpl) mutableFloatState).p(BitmapDescriptorFactory.HUE_RED);
            f = fFloatValue;
        }
        return new Float(f);
    }
}
