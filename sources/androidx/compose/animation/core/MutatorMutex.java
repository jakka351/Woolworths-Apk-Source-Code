package androidx.compose.animation.core;

import androidx.compose.runtime.Stable;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/MutatorMutex;", "", "Mutator", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MutatorMutex {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f766a = new AtomicReference(null);
    public final MutexImpl b = MutexKt.a();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/core/MutatorMutex$Mutator;", "", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Mutator {

        /* renamed from: a, reason: collision with root package name */
        public final Job f767a;

        public Mutator(Job job) {
            MutatePriority mutatePriority = MutatePriority.d;
            this.f767a = job;
        }
    }

    public static Object a(MutatorMutex mutatorMutex, Function1 function1, Continuation continuation) {
        MutatePriority mutatePriority = MutatePriority.d;
        mutatorMutex.getClass();
        return CoroutineScopeKt.c(new MutatorMutex$mutate$2(mutatorMutex, function1, null), continuation);
    }
}
