package retrofit2;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {119}, m = "suspendAndThrow")
/* loaded from: classes8.dex */
final class KotlinExtensions$suspendAndThrow$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public int q;

    public KotlinExtensions$suspendAndThrow$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.q |= Integer.MIN_VALUE;
        KotlinExtensions.c(null, this);
        return CoroutineSingletons.d;
    }
}
