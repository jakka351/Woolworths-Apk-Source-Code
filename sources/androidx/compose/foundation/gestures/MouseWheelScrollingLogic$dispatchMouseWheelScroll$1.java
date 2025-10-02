package androidx.compose.foundation.gestures;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", l = {244, 295}, m = "dispatchMouseWheelScroll")
/* loaded from: classes2.dex */
final class MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 extends ContinuationImpl {
    public MouseWheelScrollingLogic p;
    public ScrollingLogic q;
    public Ref.FloatRef r;
    public float s;
    public /* synthetic */ Object t;
    public final /* synthetic */ MouseWheelScrollingLogic u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$dispatchMouseWheelScroll$1(MouseWheelScrollingLogic mouseWheelScrollingLogic, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.u = mouseWheelScrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return MouseWheelScrollingLogic.b(this.u, null, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this);
    }
}
