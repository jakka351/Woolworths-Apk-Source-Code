package com.google.firebase.firestore.local;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.firestore.core.Target;
import com.google.firebase.firestore.local.IndexManager;
import com.google.firebase.firestore.model.FieldIndex;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes6.dex */
class MemoryIndexManager implements IndexManager {

    /* renamed from: a, reason: collision with root package name */
    public final MemoryCollectionParentIndex f15496a = new MemoryCollectionParentIndex();

    public static class MemoryCollectionParentIndex {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f15497a = new HashMap();

        public final boolean a(ResourcePath resourcePath) {
            Assert.b(resourcePath.d.size() % 2 == 1, "Expected a collection path.", new Object[0]);
            String strE = resourcePath.e();
            ResourcePath resourcePath2 = (ResourcePath) resourcePath.o();
            HashMap map = this.f15497a;
            HashSet hashSet = (HashSet) map.get(strE);
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(strE, hashSet);
            }
            return hashSet.add(resourcePath2);
        }
    }

    @Override // com.google.firebase.firestore.local.IndexManager
    public final void a(ImmutableSortedMap immutableSortedMap) {
    }

    @Override // com.google.firebase.firestore.local.IndexManager
    public final FieldIndex.IndexOffset b(Target target) {
        return FieldIndex.IndexOffset.d;
    }

    @Override // com.google.firebase.firestore.local.IndexManager
    public final FieldIndex.IndexOffset c(String str) {
        return FieldIndex.IndexOffset.d;
    }

    @Override // com.google.firebase.firestore.local.IndexManager
    public final void d(ResourcePath resourcePath) {
        this.f15496a.a(resourcePath);
    }

    @Override // com.google.firebase.firestore.local.IndexManager
    public final void e(String str, FieldIndex.IndexOffset indexOffset) {
    }

    @Override // com.google.firebase.firestore.local.IndexManager
    public final List f(String str) {
        HashSet hashSet = (HashSet) this.f15496a.f15497a.get(str);
        return hashSet != null ? new ArrayList(hashSet) : Collections.EMPTY_LIST;
    }

    @Override // com.google.firebase.firestore.local.IndexManager
    public final String g() {
        return null;
    }

    @Override // com.google.firebase.firestore.local.IndexManager
    public final IndexManager.IndexType h(Target target) {
        return IndexManager.IndexType.d;
    }

    @Override // com.google.firebase.firestore.local.IndexManager
    public final List i(Target target) {
        return null;
    }

    @Override // com.google.firebase.firestore.local.IndexManager
    public final void start() {
    }
}
