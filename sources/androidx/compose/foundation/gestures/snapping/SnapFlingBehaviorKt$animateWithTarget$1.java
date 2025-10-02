package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", l = {354}, m = "animateWithTarget")
/* loaded from: classes2.dex */
final class SnapFlingBehaviorKt$animateWithTarget$1 extends ContinuationImpl {
    public float p;
    public float q;
    public AnimationState r;
    public Ref.FloatRef s;
    public /* synthetic */ Object t;
    public int u;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.u |= Integer.MIN_VALUE;
        return SnapFlingBehaviorKt.c(null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, null, this);
    }
}
