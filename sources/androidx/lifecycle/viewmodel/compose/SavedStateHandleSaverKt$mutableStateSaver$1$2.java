package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SavedStateHandleSaverKt$mutableStateSaver$1$2 implements Function1<MutableState<Object>, MutableState<Object>> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MutableState mutableState = (MutableState) obj;
        if (!(mutableState instanceof SnapshotMutableState)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        SnapshotMutableState snapshotMutableState = (SnapshotMutableState) mutableState;
        if (snapshotMutableState.getD() != null) {
            Intrinsics.e(snapshotMutableState.getD());
            throw null;
        }
        SnapshotMutationPolicy e = snapshotMutableState.getE();
        Intrinsics.f(e, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver?>");
        return SnapshotStateKt.e(null, e);
    }
}
