package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/snapshots/GlobalSnapshot;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class GlobalSnapshot extends MutableSnapshot {

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.runtime.snapshots.GlobalSnapshot$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function1<Object, Unit> {
        public static final AnonymousClass1 h = new AnonymousClass1(1);

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            synchronized (SnapshotKt.c) {
                ?? r1 = SnapshotKt.i;
                int size = ((Collection) r1).size();
                for (int i = 0; i < size; i++) {
                    ((Function1) r1.get(i)).invoke(obj);
                }
            }
            return Unit.f24250a;
        }
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public final MutableSnapshot C(final Function1 function1, final Function1 function12) {
        return (MutableSnapshot) ((Snapshot) SnapshotKt.f(new SnapshotKt$takeNewSnapshot$1(new Function1<SnapshotIdSet, MutableSnapshot>() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot$takeNestedMutableSnapshot$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                long j;
                SnapshotIdSet snapshotIdSet = (SnapshotIdSet) obj;
                synchronized (SnapshotKt.c) {
                    j = SnapshotKt.e;
                    SnapshotKt.e = 1 + j;
                }
                return new MutableSnapshot(j, snapshotIdSet, function1, function12);
            }
        })));
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final void c() {
        synchronized (SnapshotKt.c) {
            o();
        }
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final void k() {
        SnapshotStateMapKt.a();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final void l() {
        SnapshotStateMapKt.a();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final void m() {
        SnapshotKt.a();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final Snapshot u(final Function1 function1) {
        return (ReadonlySnapshot) ((Snapshot) SnapshotKt.f(new SnapshotKt$takeNewSnapshot$1(new Function1<SnapshotIdSet, ReadonlySnapshot>() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot$takeNestedSnapshot$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                long j;
                SnapshotIdSet snapshotIdSet = (SnapshotIdSet) obj;
                synchronized (SnapshotKt.c) {
                    j = SnapshotKt.e;
                    SnapshotKt.e = 1 + j;
                }
                return new ReadonlySnapshot(j, snapshotIdSet, function1);
            }
        })));
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public final SnapshotApplyResult w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
