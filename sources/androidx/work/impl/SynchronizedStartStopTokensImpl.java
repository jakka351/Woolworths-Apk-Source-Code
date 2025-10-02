package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/SynchronizedStartStopTokensImpl;", "Landroidx/work/impl/StartStopTokens;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class SynchronizedStartStopTokensImpl implements StartStopTokens {

    /* renamed from: a, reason: collision with root package name */
    public final StartStopTokens f3933a;
    public final Object b = new Object();

    public SynchronizedStartStopTokensImpl(StartStopTokens startStopTokens) {
        this.f3933a = startStopTokens;
    }

    @Override // androidx.work.impl.StartStopTokens
    public final boolean a(WorkGenerationalId workGenerationalId) {
        boolean zContainsKey;
        synchronized (this.b) {
            zContainsKey = ((StartStopTokensImpl) this.f3933a).f3932a.containsKey(workGenerationalId);
        }
        return zContainsKey;
    }

    @Override // androidx.work.impl.StartStopTokens
    public final StartStopToken b(WorkGenerationalId id) {
        StartStopToken startStopTokenB;
        Intrinsics.h(id, "id");
        synchronized (this.b) {
            startStopTokenB = ((StartStopTokensImpl) this.f3933a).b(id);
        }
        return startStopTokenB;
    }

    @Override // androidx.work.impl.StartStopTokens
    public final StartStopToken d(WorkGenerationalId workGenerationalId) {
        StartStopToken startStopTokenD;
        synchronized (this.b) {
            startStopTokenD = ((StartStopTokensImpl) this.f3933a).d(workGenerationalId);
        }
        return startStopTokenD;
    }

    @Override // androidx.work.impl.StartStopTokens
    public final List remove(String workSpecId) {
        List listRemove;
        Intrinsics.h(workSpecId, "workSpecId");
        synchronized (this.b) {
            listRemove = ((StartStopTokensImpl) this.f3933a).remove(workSpecId);
        }
        return listRemove;
    }
}
