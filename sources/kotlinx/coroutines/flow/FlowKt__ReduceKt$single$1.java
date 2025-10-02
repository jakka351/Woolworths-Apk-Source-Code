package kotlinx.coroutines.flow;

import androidx.camera.core.impl.b;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {53}, m = "single")
/* loaded from: classes7.dex */
final class FlowKt__ReduceKt$single$1<T> extends ContinuationImpl {
    public Ref.ObjectRef p;
    public /* synthetic */ Object q;
    public int r;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        int i = (this.r | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.r = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        Symbol symbol = NullSurrogateKt.f24716a;
        if (i == 0) {
            Ref.ObjectRef objectRefX = b.x(obj);
            objectRefX.d = symbol;
            this.p = objectRefX;
            this.r = 1;
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Ref.ObjectRef objectRef = this.p;
        ResultKt.b(obj);
        Object obj2 = objectRef.d;
        if (obj2 != symbol) {
            return obj2;
        }
        throw new NoSuchElementException("Flow is empty");
    }
}
