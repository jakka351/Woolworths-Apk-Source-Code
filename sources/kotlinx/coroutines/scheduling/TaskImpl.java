package kotlinx.coroutines.scheduling;

import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlinx.coroutines.DebugStringsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/scheduling/TaskImpl;", "Lkotlinx/coroutines/scheduling/Task;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class TaskImpl extends Task {
    public final Runnable f;

    public TaskImpl(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(DebugStringsKt.a(runnable));
        sb.append(", ");
        sb.append(this.d);
        sb.append(", ");
        boolean z = this.e;
        String str = TasksKt.f24739a;
        return b.r(sb, z ? "Blocking" : "Non-blocking", ']');
    }
}
