package androidx.compose.animation.core;

import androidx.compose.animation.core.MutatorMutex;
import java.util.concurrent.CancellationException;
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
@DebugMetadata(c = "androidx.compose.animation.core.MutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {176, 124}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class MutatorMutex$mutate$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<Object>, Object> {
    public Mutex p;
    public Object q;
    public MutatorMutex r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ MutatorMutex u;
    public final /* synthetic */ SuspendLambda v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MutatorMutex$mutate$2(MutatorMutex mutatorMutex, Function1 function1, Continuation continuation) {
        super(2, continuation);
        MutatePriority mutatePriority = MutatePriority.d;
        this.u = mutatorMutex;
        this.v = (SuspendLambda) function1;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MutatePriority mutatePriority = MutatePriority.d;
        MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new MutatorMutex$mutate$2(this.u, this.v, continuation);
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
        MutatorMutex.Mutator mutator;
        Mutex mutex;
        ?? r3;
        MutatorMutex.Mutator mutator2;
        Mutex mutex2;
        MutatorMutex mutatorMutex2;
        Throwable th;
        MutatorMutex.Mutator mutator3;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ?? r1 = this.s;
        try {
            try {
                if (r1 == 0) {
                    ResultKt.b(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.t;
                    MutatePriority mutatePriority = MutatePriority.d;
                    CoroutineContext.Element element = coroutineScope.getE().get(Job.Key.d);
                    Intrinsics.e(element);
                    MutatorMutex.Mutator mutator4 = new MutatorMutex.Mutator((Job) element);
                    mutatorMutex = this.u;
                    AtomicReference atomicReference3 = mutatorMutex.f766a;
                    do {
                        mutator = (MutatorMutex.Mutator) atomicReference3.get();
                        if (mutator != null) {
                            MutatePriority mutatePriority2 = MutatePriority.d;
                            if (!(mutatePriority2.compareTo(mutatePriority2) >= 0)) {
                                throw new CancellationException("Current mutation had a higher priority");
                            }
                        }
                    } while (!android.support.v4.media.session.a.D(atomicReference3, mutator, mutator4));
                    if (mutator != null) {
                        mutator.f767a.cancel((CancellationException) new MutationInterruptedException("Mutation interrupted"));
                    }
                    mutex = mutatorMutex.b;
                    this.t = mutator4;
                    this.p = mutex;
                    SuspendLambda suspendLambda = this.v;
                    this.q = suspendLambda;
                    this.r = mutatorMutex;
                    this.s = 1;
                    if (mutex.a(this) != coroutineSingletons) {
                        r3 = suspendLambda;
                        mutator2 = mutator4;
                    }
                    return coroutineSingletons;
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutatorMutex2 = (MutatorMutex) this.q;
                    mutex2 = this.p;
                    mutator3 = (MutatorMutex.Mutator) this.t;
                    try {
                        ResultKt.b(obj);
                        atomicReference2 = mutatorMutex2.f766a;
                        while (!atomicReference2.compareAndSet(mutator3, null) && atomicReference2.get() == mutator3) {
                        }
                        mutex2.c(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        atomicReference = mutatorMutex2.f766a;
                        while (!atomicReference.compareAndSet(mutator3, null) && atomicReference.get() == mutator3) {
                        }
                        throw th;
                    }
                }
                MutatorMutex mutatorMutex3 = this.r;
                Function1 function1 = (Function1) this.q;
                mutex = this.p;
                mutator2 = (MutatorMutex.Mutator) this.t;
                ResultKt.b(obj);
                mutatorMutex = mutatorMutex3;
                r3 = function1;
                this.t = mutator2;
                this.p = mutex2;
                this.q = mutatorMutex;
                this.r = null;
                this.s = 2;
                Object objInvoke = r3.invoke(this);
                if (objInvoke != coroutineSingletons) {
                    mutatorMutex2 = mutatorMutex;
                    obj = objInvoke;
                    mutator3 = mutator2;
                    atomicReference2 = mutatorMutex2.f766a;
                    while (!atomicReference2.compareAndSet(mutator3, null)) {
                    }
                    mutex2.c(null);
                    return obj;
                }
                return coroutineSingletons;
            } catch (Throwable th3) {
                mutatorMutex2 = mutatorMutex;
                th = th3;
                mutator3 = mutator2;
                atomicReference = mutatorMutex2.f766a;
                while (!atomicReference.compareAndSet(mutator3, null)) {
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
