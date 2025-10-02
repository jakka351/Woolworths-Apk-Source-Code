package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.model.SnapshotVersion;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class RemoteEvent {

    /* renamed from: a, reason: collision with root package name */
    public final SnapshotVersion f15577a;
    public final Map b;
    public final Map c;
    public final Map d;
    public final Set e;

    public RemoteEvent(SnapshotVersion snapshotVersion, Map map, Map map2, Map map3, Set set) {
        this.f15577a = snapshotVersion;
        this.b = map;
        this.c = map2;
        this.d = map3;
        this.e = set;
    }

    public final String toString() {
        return "RemoteEvent{snapshotVersion=" + this.f15577a + ", targetChanges=" + this.b + ", targetMismatches=" + this.c + ", documentUpdates=" + this.d + ", resolvedLimboDocuments=" + this.e + '}';
    }
}
