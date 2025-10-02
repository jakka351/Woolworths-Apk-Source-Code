package com.google.firebase.firestore.model.mutation;

import com.google.firebase.firestore.model.SnapshotVersion;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class MutationResult {

    /* renamed from: a, reason: collision with root package name */
    public final SnapshotVersion f15546a;
    public final ArrayList b;

    public MutationResult(SnapshotVersion snapshotVersion, ArrayList arrayList) {
        snapshotVersion.getClass();
        this.f15546a = snapshotVersion;
        this.b = arrayList;
    }
}
