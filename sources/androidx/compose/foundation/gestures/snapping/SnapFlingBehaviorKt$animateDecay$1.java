package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", l = {313}, m = "animateDecay")
/* loaded from: classes2.dex */
final class SnapFlingBehaviorKt$animateDecay$1 extends ContinuationImpl {
    public float p;
    public AnimationState q;
    public Ref.FloatRef r;
    public /* synthetic */ Object s;
    public int t;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.t |= Integer.MIN_VALUE;
        return SnapFlingBehaviorKt.a(null, BitmapDescriptorFactory.HUE_RED, null, null, null, this);
    }
}
