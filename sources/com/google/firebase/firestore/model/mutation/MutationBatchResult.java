package com.google.firebase.firestore.model.mutation;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.protobuf.ByteString;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class MutationBatchResult {

    /* renamed from: a, reason: collision with root package name */
    public final MutationBatch f15545a;
    public final SnapshotVersion b;
    public final ArrayList c;
    public final ByteString d;
    public final ImmutableSortedMap e;

    public MutationBatchResult(MutationBatch mutationBatch, SnapshotVersion snapshotVersion, ArrayList arrayList, ByteString byteString, ImmutableSortedMap immutableSortedMap) {
        this.f15545a = mutationBatch;
        this.b = snapshotVersion;
        this.c = arrayList;
        this.d = byteString;
        this.e = immutableSortedMap;
    }
}
