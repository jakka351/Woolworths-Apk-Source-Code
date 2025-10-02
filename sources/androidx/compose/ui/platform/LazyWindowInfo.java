package androidx.compose.ui.platform;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/LazyWindowInfo;", "Landroidx/compose/ui/platform/WindowInfo;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LazyWindowInfo implements WindowInfo {

    /* renamed from: a, reason: collision with root package name */
    public Function0 f1974a;
    public MutableState b;
    public final MutableState c = SnapshotStateKt.f(Boolean.FALSE);

    @Override // androidx.compose.ui.platform.WindowInfo
    public final long a() {
        if (this.b == null) {
            Function0 function0 = this.f1974a;
            this.b = SnapshotStateKt.f(new IntSize(function0 != null ? ((IntSize) function0.invoke()).f2202a : 0L));
            this.f1974a = null;
        }
        MutableState mutableState = this.b;
        Intrinsics.e(mutableState);
        return ((IntSize) ((SnapshotMutableStateImpl) mutableState).getD()).f2202a;
    }

    @Override // androidx.compose.ui.platform.WindowInfo
    public final boolean b() {
        return ((Boolean) ((SnapshotMutableStateImpl) this.c).getD()).booleanValue();
    }
}
