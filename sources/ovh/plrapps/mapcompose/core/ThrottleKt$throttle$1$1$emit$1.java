package ovh.plrapps.mapcompose.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import ovh.plrapps.mapcompose.core.ThrottleKt$throttle$1;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.core.ThrottleKt$throttle$1$1", f = "Throttle.kt", l = {24, 25}, m = "emit")
/* loaded from: classes8.dex */
final class ThrottleKt$throttle$1$1$emit$1 extends ContinuationImpl {
    public Object p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ThrottleKt$throttle$1.AnonymousClass1 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThrottleKt$throttle$1$1$emit$1(ThrottleKt$throttle$1.AnonymousClass1 anonymousClass1, Continuation continuation) {
        super(continuation);
        this.r = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.emit(null, this);
    }
}
