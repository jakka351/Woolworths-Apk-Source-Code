package androidx.room;

import androidx.camera.core.impl.utils.futures.e;
import androidx.room.IMultiInstanceInvalidationCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/room/MultiInstanceInvalidationClient$callback$1", "Landroidx/room/IMultiInstanceInvalidationCallback$Stub;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MultiInstanceInvalidationClient$callback$1 extends IMultiInstanceInvalidationCallback.Stub {
    public static final /* synthetic */ int d = 0;

    @Override // androidx.room.IMultiInstanceInvalidationCallback
    public final void f(String[] tables) {
        Intrinsics.h(tables, "tables");
        new e(16, null, tables);
        throw null;
    }
}
