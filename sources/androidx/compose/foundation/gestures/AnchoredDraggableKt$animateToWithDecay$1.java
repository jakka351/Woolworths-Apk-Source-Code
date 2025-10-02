package androidx.compose.foundation.gestures;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {1380}, m = "animateToWithDecay")
/* loaded from: classes2.dex */
final class AnchoredDraggableKt$animateToWithDecay$1<T> extends ContinuationImpl {
    public float p;
    public Ref.FloatRef q;
    public /* synthetic */ Object r;
    public int s;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return AnchoredDraggableKt.b(null, BitmapDescriptorFactory.HUE_RED, null, null, this);
    }
}
