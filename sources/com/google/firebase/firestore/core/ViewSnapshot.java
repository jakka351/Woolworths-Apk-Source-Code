package com.google.firebase.firestore.core;

import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.model.DocumentSet;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class ViewSnapshot {

    /* renamed from: a, reason: collision with root package name */
    public final Query f15473a;
    public final DocumentSet b;
    public final DocumentSet c;
    public final ArrayList d;
    public final boolean e;
    public final ImmutableSortedSet f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SyncState {
        public static final SyncState d;
        public static final SyncState e;
        public static final SyncState f;
        public static final /* synthetic */ SyncState[] g;

        static {
            SyncState syncState = new SyncState("NONE", 0);
            d = syncState;
            SyncState syncState2 = new SyncState("LOCAL", 1);
            e = syncState2;
            SyncState syncState3 = new SyncState("SYNCED", 2);
            f = syncState3;
            g = new SyncState[]{syncState, syncState2, syncState3};
        }

        public static SyncState valueOf(String str) {
            return (SyncState) Enum.valueOf(SyncState.class, str);
        }

        public static SyncState[] values() {
            return (SyncState[]) g.clone();
        }
    }

    public ViewSnapshot(Query query, DocumentSet documentSet, DocumentSet documentSet2, ArrayList arrayList, boolean z, ImmutableSortedSet immutableSortedSet, boolean z2, boolean z3, boolean z4) {
        this.f15473a = query;
        this.b = documentSet;
        this.c = documentSet2;
        this.d = arrayList;
        this.e = z;
        this.f = immutableSortedSet;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewSnapshot)) {
            return false;
        }
        ViewSnapshot viewSnapshot = (ViewSnapshot) obj;
        if (this.e == viewSnapshot.e && this.g == viewSnapshot.g && this.h == viewSnapshot.h && this.f15473a.equals(viewSnapshot.f15473a) && this.f.equals(viewSnapshot.f) && this.b.equals(viewSnapshot.b) && this.c.equals(viewSnapshot.c) && this.i == viewSnapshot.i) {
            return this.d.equals(viewSnapshot.d);
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f.d.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f15473a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + (this.e ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewSnapshot(");
        sb.append(this.f15473a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", isFromCache=");
        sb.append(this.e);
        sb.append(", mutatedKeys=");
        sb.append(this.f.d.size());
        sb.append(", didSyncStateChange=");
        sb.append(this.g);
        sb.append(", excludesMetadataChanges=");
        sb.append(this.h);
        sb.append(", hasCachedResults=");
        return YU.a.k(")", sb, this.i);
    }
}
