package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata(d1 = {"androidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt"}, k = 4, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SnapshotLongStateKt {
    public static final MutableLongState a(long j) {
        return new ParcelableSnapshotMutableLongState(j);
    }
}
