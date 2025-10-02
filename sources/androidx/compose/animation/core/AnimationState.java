package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/animation/core/AnimationState;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/runtime/State;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AnimationState<T, V extends AnimationVector> implements State<T> {
    public final TwoWayConverter d;
    public final MutableState e;
    public AnimationVector f;
    public long g;
    public long h;
    public boolean i;

    public /* synthetic */ AnimationState(TwoWayConverter twoWayConverter, Object obj, AnimationVector animationVector, int i) {
        this(twoWayConverter, obj, (i & 4) != 0 ? null : animationVector, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public final Object b() {
        return this.d.b().invoke(this.f);
    }

    @Override // androidx.compose.runtime.State
    /* renamed from: getValue */
    public final Object getD() {
        return ((SnapshotMutableStateImpl) this.e).getD();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationState(value=");
        sb.append(((SnapshotMutableStateImpl) this.e).getD());
        sb.append(", velocity=");
        sb.append(b());
        sb.append(", isRunning=");
        sb.append(this.i);
        sb.append(", lastFrameTimeNanos=");
        sb.append(this.g);
        sb.append(", finishedTimeNanos=");
        return androidx.camera.core.impl.b.q(sb, this.h, ')');
    }

    public AnimationState(TwoWayConverter twoWayConverter, Object obj, AnimationVector animationVector, long j, long j2, boolean z) {
        AnimationVector animationVectorA;
        this.d = twoWayConverter;
        this.e = SnapshotStateKt.f(obj);
        if (animationVector != null) {
            animationVectorA = AnimationVectorsKt.a(animationVector);
        } else {
            animationVectorA = (AnimationVector) twoWayConverter.a().invoke(obj);
            animationVectorA.d();
        }
        this.f = animationVectorA;
        this.g = j;
        this.h = j2;
        this.i = z;
    }
}
