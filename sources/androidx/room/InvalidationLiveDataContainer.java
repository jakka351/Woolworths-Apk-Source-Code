package androidx.room;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/InvalidationLiveDataContainer;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InvalidationLiveDataContainer {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f3711a;
    public final Set b;

    public InvalidationLiveDataContainer(RoomDatabase roomDatabase) {
        this.f3711a = roomDatabase;
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        Intrinsics.g(setNewSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.b = setNewSetFromMap;
    }
}
