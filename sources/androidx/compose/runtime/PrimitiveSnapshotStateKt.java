package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata(d1 = {"androidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt"}, k = 4, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PrimitiveSnapshotStateKt {
    public static final MutableFloatState a(float f) {
        return new ParcelableSnapshotMutableFloatState(f);
    }
}
