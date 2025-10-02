package androidx.compose.foundation;

import androidx.compose.foundation.MutatorMutex;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;

@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.MutatorMutex$mutate$2", f = "MutatorMutex.kt", l = {210, 125}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class MutatorMutex$mutate$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<Object>, Object> {
    public Mutex p;
    public Object q;
    public MutatorMutex r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ MutatePriority u;
    public final /* synthetic */ MutatorMutex v;
    public final /* synthetic */ SuspendLambda w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MutatorMutex$mutate$2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.u = mutatePriority;
        this.v = mutatorMutex;
        this.w = (SuspendLambda) function1;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new MutatorMutex$mutate$2(this.u, this.v, this.w, continuation);
        mutatorMutex$mutate$2.t = obj;
        return mutatorMutex$mutate$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MutatorMutex$mutate$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutatorMutex mutatorMutex;
        Mutex mutex;
        ?? r3;
        MutatorMutex.Mutator mutator;
        Mutex mutex2;
        MutatorMutex mutatorMutex2;
        Throwable th;
        MutatorMutex.Mutator mutator2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ?? r1 = this.s;
        try {
            try {
                if (r1 == 0) {
                    ResultKt.b(obj);
                    CoroutineContext.Element element = ((CoroutineScope) this.t).getE().get(Job.Key.d);
                    Intrinsics.e(element);
                    MutatorMutex.Mutator mutator3 = new MutatorMutex.Mutator(this.u, (Job) element);
                    mutatorMutex = this.v;
                    MutatorMutex.a(mutatorMutex, mutator3);
                    mutex = mutatorMutex.b;
                    this.t = mutator3;
                    this.p = mutex;
                    SuspendLambda suspendLambda = this.w;
                    this.q = suspendLambda;
                    this.r = mutatorMutex;
                    this.s = 1;
                    if (mutex.a(this) != coroutineSingletons) {
                        r3 = suspendLambda;
                        mutator = mutator3;
                    }
                    return coroutineSingletons;
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutatorMutex2 = (MutatorMutex) this.q;
                    mutex2 = this.p;
                    mutator2 = (MutatorMutex.Mutator) this.t;
                    try {
                        ResultKt.b(obj);
                        atomicReference2 = mutatorMutex2.f840a;
                        while (!atomicReference2.compareAndSet(mutator2, null) && atomicReference2.get() == mutator2) {
                        }
                        mutex2.c(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        atomicReference = mutatorMutex2.f840a;
                        while (!atomicReference.compareAndSet(mutator2, null)) {
                        }
                        throw th;
                    }
                }
                MutatorMutex mutatorMutex3 = this.r;
                Function1 function1 = (Function1) this.q;
                mutex = this.p;
                mutator = (MutatorMutex.Mutator) this.t;
                ResultKt.b(obj);
                mutatorMutex = mutatorMutex3;
                r3 = function1;
                this.t = mutator;
                this.p = mutex2;
                this.q = mutatorMutex;
                this.r = null;
                this.s = 2;
                Object objInvoke = r3.invoke(this);
                if (objInvoke != coroutineSingletons) {
                    mutatorMutex2 = mutatorMutex;
                    obj = objInvoke;
                    mutator2 = mutator;
                    atomicReference2 = mutatorMutex2.f840a;
                    while (!atomicReference2.compareAndSet(mutator2, null)) {
                    }
                    mutex2.c(null);
                    return obj;
                }
                return coroutineSingletons;
            } catch (Throwable th3) {
                mutatorMutex2 = mutatorMutex;
                th = th3;
                mutator2 = mutator;
                atomicReference = mutatorMutex2.f840a;
                while (!atomicReference.compareAndSet(mutator2, null) && atomicReference.get() == mutator2) {
                }
                throw th;
            }
            mutex2 = mutex;
        } catch (Throwable th4) {
            r1.c(null);
            throw th4;
        }
    }
}
