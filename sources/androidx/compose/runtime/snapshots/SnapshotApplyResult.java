package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "", "Failure", "Success", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult$Failure;", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult$Success;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class SnapshotApplyResult {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotApplyResult$Failure;", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Failure extends SnapshotApplyResult {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotApplyResult$Success;", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Success extends SnapshotApplyResult {

        /* renamed from: a, reason: collision with root package name */
        public static final Success f1704a = new Success();
    }
}
