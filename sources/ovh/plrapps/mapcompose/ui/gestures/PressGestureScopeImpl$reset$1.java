package ovh.plrapps.mapcompose.ui.gestures;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.ui.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", l = {231}, m = "reset")
/* loaded from: classes8.dex */
final class PressGestureScopeImpl$reset$1 extends ContinuationImpl {
    public Object p;
    public /* synthetic */ Object q;
    public final /* synthetic */ PressGestureScopeImpl r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PressGestureScopeImpl$reset$1(PressGestureScopeImpl pressGestureScopeImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = pressGestureScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.i(this);
    }
}
