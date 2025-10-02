package androidx.room;

import androidx.room.InvalidationTracker;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/MultiInstanceInvalidationClient;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class MultiInstanceInvalidationClient {

    /* renamed from: a, reason: collision with root package name */
    public IMultiInstanceInvalidationService f3716a;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/room/MultiInstanceInvalidationClient$1", "Landroidx/room/InvalidationTracker$Observer;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.room.MultiInstanceInvalidationClient$1, reason: invalid class name */
    public final class AnonymousClass1 extends InvalidationTracker.Observer {
        @Override // androidx.room.InvalidationTracker.Observer
        public final void a(Set tables) {
            Intrinsics.h(tables, "tables");
            throw null;
        }
    }
}
