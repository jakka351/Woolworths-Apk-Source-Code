package androidx.compose.foundation;

import androidx.compose.runtime.Stable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/MutatorMutex;", "", "Mutator", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MutatorMutex {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f840a = new AtomicReference(null);
    public final MutexImpl b = MutexKt.a();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/MutatorMutex$Mutator;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Mutator {

        /* renamed from: a, reason: collision with root package name */
        public final MutatePriority f841a;
        public final Job b;

        public Mutator(MutatePriority mutatePriority, Job job) {
            this.f841a = mutatePriority;
            this.b = job;
        }

        public final boolean a(Mutator mutator) {
            return this.f841a.compareTo(mutator.f841a) >= 0;
        }

        public final void b() {
            this.b.cancel((CancellationException) new MutationInterruptedException("Mutation interrupted"));
        }
    }

    public static final void a(MutatorMutex mutatorMutex, Mutator mutator) {
        Mutator mutator2;
        AtomicReference atomicReference = mutatorMutex.f840a;
        do {
            mutator2 = (Mutator) atomicReference.get();
            if (mutator2 != null && !mutator.a(mutator2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!android.support.v4.media.session.a.D(atomicReference, mutator2, mutator));
        if (mutator2 != null) {
            mutator2.b();
        }
    }

    public final Object b(MutatePriority mutatePriority, Function1 function1, ContinuationImpl continuationImpl) {
        return CoroutineScopeKt.c(new MutatorMutex$mutate$2(mutatePriority, this, function1, null), continuationImpl);
    }

    public final Object c(Object obj, MutatePriority mutatePriority, Function2 function2, SuspendLambda suspendLambda) {
        return CoroutineScopeKt.c(new MutatorMutex$mutateWith$2(mutatePriority, this, function2, obj, null), suspendLambda);
    }
}
