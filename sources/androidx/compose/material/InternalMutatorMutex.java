package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.Stable;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material/InternalMutatorMutex;", "", "Mutator", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InternalMutatorMutex {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f1292a = new AtomicReference(null);
    public final MutexImpl b = MutexKt.a();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/InternalMutatorMutex$Mutator;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Mutator {

        /* renamed from: a, reason: collision with root package name */
        public final MutatePriority f1293a;
        public final Job b;

        public Mutator(MutatePriority mutatePriority, Job job) {
            this.f1293a = mutatePriority;
            this.b = job;
        }
    }
}
