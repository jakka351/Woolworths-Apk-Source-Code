package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata(d1 = {"androidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt"}, k = 4, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnapshotIntStateKt {
    public static final MutableIntState a(int i) {
        return new ParcelableSnapshotMutableIntState(i);
    }
}
