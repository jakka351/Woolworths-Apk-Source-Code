package androidx.compose.foundation.gestures.snapping;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", l = {115}, m = "fling")
/* loaded from: classes2.dex */
final class SnapFlingBehavior$fling$1 extends ContinuationImpl {
    public Function1 p;
    public /* synthetic */ Object q;
    public final /* synthetic */ SnapFlingBehavior r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$fling$1(SnapFlingBehavior snapFlingBehavior, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = snapFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.d(null, BitmapDescriptorFactory.HUE_RED, null, this);
    }
}
