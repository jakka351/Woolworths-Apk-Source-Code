package androidx.compose.runtime.snapshots;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/snapshots/Snapshot;", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invoke", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/Snapshot;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class SnapshotKt$takeNewSnapshot$1 extends Lambda implements Function1<SnapshotIdSet, Snapshot> {
    public final /* synthetic */ Lambda h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotKt$takeNewSnapshot$1(Function1 function1) {
        super(1);
        this.h = (Lambda) function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Snapshot snapshot = (Snapshot) this.h.invoke((SnapshotIdSet) obj);
        synchronized (SnapshotKt.c) {
            SnapshotKt.d = SnapshotKt.d.i(snapshot.getB());
        }
        return snapshot;
    }
}
