package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/snapshots/StateRecord;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class StateRecord {

    /* renamed from: a, reason: collision with root package name */
    public long f1715a;
    public StateRecord b;

    public StateRecord(long j) {
        this.f1715a = j;
    }

    public abstract void a(StateRecord stateRecord);

    public abstract StateRecord b();

    public StateRecord c(long j) {
        StateRecord stateRecordB = b();
        stateRecordB.f1715a = j;
        return stateRecordB;
    }
}
