package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.material3.internal.InternalMutatorMutex;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
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

@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.internal.InternalMutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {SubsamplingScaleImageView.ORIENTATION_180, 103}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class InternalMutatorMutex$mutate$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<Object>, Object> {
    public Mutex p;
    public Object q;
    public InternalMutatorMutex r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ MutatePriority u;
    public final /* synthetic */ InternalMutatorMutex v;
    public final /* synthetic */ SuspendLambda w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InternalMutatorMutex$mutate$2(MutatePriority mutatePriority, InternalMutatorMutex internalMutatorMutex, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.u = mutatePriority;
        this.v = internalMutatorMutex;
        this.w = (SuspendLambda) function1;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        InternalMutatorMutex$mutate$2 internalMutatorMutex$mutate$2 = new InternalMutatorMutex$mutate$2(this.u, this.v, this.w, continuation);
        internalMutatorMutex$mutate$2.t = obj;
        return internalMutatorMutex$mutate$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InternalMutatorMutex$mutate$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InternalMutatorMutex internalMutatorMutex;
        Mutex mutex;
        ?? r3;
        InternalMutatorMutex.Mutator mutator;
        Mutex mutex2;
        InternalMutatorMutex internalMutatorMutex2;
        Throwable th;
        InternalMutatorMutex.Mutator mutator2;
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
                    InternalMutatorMutex.Mutator mutator3 = new InternalMutatorMutex.Mutator(this.u, (Job) element);
                    internalMutatorMutex = this.v;
                    AtomicReference atomicReference3 = internalMutatorMutex.f1558a;
                    while (true) {
                        InternalMutatorMutex.Mutator mutator4 = (InternalMutatorMutex.Mutator) atomicReference3.get();
                        if (mutator4 != null && mutator3.f1559a.compareTo(mutator4.f1559a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(mutator4, mutator3)) {
                            if (atomicReference3.get() != mutator4) {
                                break;
                            }
                        }
                        if (mutator4 != null) {
                            mutator4.b.cancel((CancellationException) null);
                        }
                        mutex = internalMutatorMutex.b;
                        this.t = mutator3;
                        this.p = mutex;
                        SuspendLambda suspendLambda = this.w;
                        this.q = suspendLambda;
                        this.r = internalMutatorMutex;
                        this.s = 1;
                        if (mutex.a(this) != coroutineSingletons) {
                            r3 = suspendLambda;
                            mutator = mutator3;
                        }
                    }
                    return coroutineSingletons;
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    internalMutatorMutex2 = (InternalMutatorMutex) this.q;
                    mutex2 = this.p;
                    mutator2 = (InternalMutatorMutex.Mutator) this.t;
                    try {
                        ResultKt.b(obj);
                        atomicReference2 = internalMutatorMutex2.f1558a;
                        while (!atomicReference2.compareAndSet(mutator2, null) && atomicReference2.get() == mutator2) {
                        }
                        mutex2.c(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        atomicReference = internalMutatorMutex2.f1558a;
                        while (!atomicReference.compareAndSet(mutator2, null)) {
                        }
                        throw th;
                    }
                }
                InternalMutatorMutex internalMutatorMutex3 = this.r;
                Function1 function1 = (Function1) this.q;
                mutex = this.p;
                mutator = (InternalMutatorMutex.Mutator) this.t;
                ResultKt.b(obj);
                internalMutatorMutex = internalMutatorMutex3;
                r3 = function1;
                this.t = mutator;
                this.p = mutex2;
                this.q = internalMutatorMutex;
                this.r = null;
                this.s = 2;
                Object objInvoke = r3.invoke(this);
                if (objInvoke != coroutineSingletons) {
                    internalMutatorMutex2 = internalMutatorMutex;
                    obj = objInvoke;
                    mutator2 = mutator;
                    atomicReference2 = internalMutatorMutex2.f1558a;
                    while (!atomicReference2.compareAndSet(mutator2, null)) {
                    }
                    mutex2.c(null);
                    return obj;
                }
                return coroutineSingletons;
            } catch (Throwable th3) {
                internalMutatorMutex2 = internalMutatorMutex;
                th = th3;
                mutator2 = mutator;
                atomicReference = internalMutatorMutex2.f1558a;
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
