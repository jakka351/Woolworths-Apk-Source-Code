package androidx.compose.foundation;

import androidx.compose.foundation.MutatorMutex;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;

@Metadata(d1 = {"\u0000\b\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "R", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", l = {210, 165}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class MutatorMutex$mutateWith$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<Object>, Object> {
    public Mutex p;
    public Object q;
    public Object r;
    public MutatorMutex s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ MutatePriority v;
    public final /* synthetic */ MutatorMutex w;
    public final /* synthetic */ SuspendLambda x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MutatorMutex$mutateWith$2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, Function2 function2, Object obj, Continuation continuation) {
        super(2, continuation);
        this.v = mutatePriority;
        this.w = mutatorMutex;
        this.x = (SuspendLambda) function2;
        this.y = obj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MutatorMutex$mutateWith$2 mutatorMutex$mutateWith$2 = new MutatorMutex$mutateWith$2(this.v, this.w, this.x, this.y, continuation);
        mutatorMutex$mutateWith$2.u = obj;
        return mutatorMutex$mutateWith$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MutatorMutex$mutateWith$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutatorMutex mutatorMutex;
        Object obj2;
        MutatorMutex.Mutator mutator;
        Mutex mutex;
        ?? r5;
        MutatorMutex mutatorMutex2;
        Throwable th;
        MutatorMutex.Mutator mutator2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ?? r1 = this.t;
        try {
            try {
                if (r1 == 0) {
                    ResultKt.b(obj);
                    CoroutineContext.Element element = ((CoroutineScope) this.u).getE().get(Job.Key.d);
                    Intrinsics.e(element);
                    MutatorMutex.Mutator mutator3 = new MutatorMutex.Mutator(this.v, (Job) element);
                    mutatorMutex = this.w;
                    MutatorMutex.a(mutatorMutex, mutator3);
                    MutexImpl mutexImpl = mutatorMutex.b;
                    this.u = mutator3;
                    this.p = mutexImpl;
                    SuspendLambda suspendLambda = this.x;
                    this.q = suspendLambda;
                    Object obj3 = this.y;
                    this.r = obj3;
                    this.s = mutatorMutex;
                    this.t = 1;
                    if (mutexImpl.a(this) != coroutineSingletons) {
                        obj2 = obj3;
                        mutator = mutator3;
                        mutex = mutexImpl;
                        r5 = suspendLambda;
                    }
                    return coroutineSingletons;
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutatorMutex2 = (MutatorMutex) this.q;
                    mutex = this.p;
                    mutator2 = (MutatorMutex.Mutator) this.u;
                    try {
                        ResultKt.b(obj);
                        atomicReference2 = mutatorMutex2.f840a;
                        while (!atomicReference2.compareAndSet(mutator2, null) && atomicReference2.get() == mutator2) {
                        }
                        mutex.c(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        atomicReference = mutatorMutex2.f840a;
                        while (!atomicReference.compareAndSet(mutator2, null)) {
                        }
                        throw th;
                    }
                }
                MutatorMutex mutatorMutex3 = this.s;
                obj2 = this.r;
                Function2 function2 = (Function2) this.q;
                Mutex mutex2 = this.p;
                mutator = (MutatorMutex.Mutator) this.u;
                ResultKt.b(obj);
                mutatorMutex = mutatorMutex3;
                mutex = mutex2;
                r5 = function2;
                this.u = mutator;
                this.p = mutex;
                this.q = mutatorMutex;
                this.r = null;
                this.s = null;
                this.t = 2;
                Object objInvoke = r5.invoke(obj2, this);
                if (objInvoke != coroutineSingletons) {
                    mutatorMutex2 = mutatorMutex;
                    obj = objInvoke;
                    mutator2 = mutator;
                    atomicReference2 = mutatorMutex2.f840a;
                    while (!atomicReference2.compareAndSet(mutator2, null)) {
                    }
                    mutex.c(null);
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
        } catch (Throwable th4) {
            r1.c(null);
            throw th4;
        }
    }
}
