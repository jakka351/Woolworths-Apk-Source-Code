package androidx.compose.foundation.gestures.snapping;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", l = {101}, m = "performFling")
/* loaded from: classes2.dex */
final class SnapFlingBehavior$performFling$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ SnapFlingBehavior q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$performFling$1(SnapFlingBehavior snapFlingBehavior, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = snapFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(null, BitmapDescriptorFactory.HUE_RED, null, this);
    }
}
