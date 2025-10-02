package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.unit.Density;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollDeltaBetweenPasses;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LazyLayoutScrollDeltaBetweenPasses {

    /* renamed from: a, reason: collision with root package name */
    public AnimationState f1053a;

    public LazyLayoutScrollDeltaBetweenPasses() {
        TwoWayConverter twoWayConverter = VectorConvertersKt.f788a;
        Float fValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        this.f1053a = new AnimationState(twoWayConverter, fValueOf, (AnimationVector) twoWayConverter.a().invoke(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public final void a(float f, Density density, CoroutineScope coroutineScope) {
        if (f <= density.T1(LazyLayoutScrollDeltaBetweenPassesKt.f1054a)) {
            return;
        }
        Snapshot snapshotA = Snapshot.Companion.a();
        Function1 g = snapshotA != null ? snapshotA.getE() : null;
        Snapshot snapshotB = Snapshot.Companion.b(snapshotA);
        try {
            float fFloatValue = ((Number) ((SnapshotMutableStateImpl) this.f1053a.e).getD()).floatValue();
            AnimationState animationState = this.f1053a;
            if (animationState.i) {
                this.f1053a = AnimationStateKt.b(animationState, fFloatValue - f, BitmapDescriptorFactory.HUE_RED, 30);
                BuildersKt.c(coroutineScope, null, null, new LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1(this, null), 3);
            } else {
                this.f1053a = new AnimationState(VectorConvertersKt.f788a, Float.valueOf(-f), null, 60);
                BuildersKt.c(coroutineScope, null, null, new LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$2(this, null), 3);
            }
            Snapshot.Companion.e(snapshotA, snapshotB, g);
        } catch (Throwable th) {
            Snapshot.Companion.e(snapshotA, snapshotB, g);
            throw th;
        }
    }
}
