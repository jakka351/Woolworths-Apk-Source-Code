package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/UndoManager;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class UndoManager<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f1186a;
    public final SnapshotStateList b;
    public final SnapshotStateList c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/UndoManager$Companion;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public UndoManager(List list, List list2, int i) {
        this.f1186a = i;
        SnapshotStateList snapshotStateList = new SnapshotStateList();
        snapshotStateList.addAll(list);
        this.b = snapshotStateList;
        SnapshotStateList snapshotStateList2 = new SnapshotStateList();
        snapshotStateList2.addAll(list2);
        this.c = snapshotStateList2;
        if (i < 0) {
            InlineClassHelperKt.a("Capacity must be a positive integer");
        }
        if (snapshotStateList2.size() + snapshotStateList.size() <= i) {
            return;
        }
        InlineClassHelperKt.a("Initial list of undo and redo operations have a size greater than the given capacity.");
    }
}
