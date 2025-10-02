package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata(d1 = {"androidx/compose/runtime/SnapshotDoubleStateKt__SnapshotDoubleStateKt"}, k = 4, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SnapshotDoubleStateKt {
    public static final MutableDoubleState a(double d) {
        return new ParcelableSnapshotMutableDoubleState(d);
    }
}
