package com.google.firebase.firestore.local;

import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldIndex;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.SnapshotVersion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
interface RemoteDocumentCache {
    MutableDocument a(DocumentKey documentKey);

    Map b(String str, FieldIndex.IndexOffset indexOffset, int i);

    HashMap c(Query query, FieldIndex.IndexOffset indexOffset, Set set, QueryContext queryContext);

    void d(MutableDocument mutableDocument, SnapshotVersion snapshotVersion);

    HashMap e(Iterable iterable);

    void f(ArrayList arrayList);

    void g(IndexManager indexManager);
}
