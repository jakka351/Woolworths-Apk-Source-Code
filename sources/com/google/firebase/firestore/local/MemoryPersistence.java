package com.google.firebase.firestore.local;

import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.model.DocumentCollections;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Supplier;
import com.google.protobuf.ByteString;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class MemoryPersistence extends Persistence {

    /* renamed from: a, reason: collision with root package name */
    public final MemoryGlobalsCache f15500a;
    public final HashMap b;
    public final HashMap c;
    public final MemoryIndexManager d;
    public final MemoryTargetCache e;
    public final MemoryBundleCache f;
    public final MemoryRemoteDocumentCache g;
    public ReferenceDelegate h;
    public boolean i;

    public MemoryPersistence() {
        MemoryGlobalsCache memoryGlobalsCache = new MemoryGlobalsCache();
        ByteString byteString = ByteString.e;
        this.f15500a = memoryGlobalsCache;
        this.b = new HashMap();
        this.d = new MemoryIndexManager();
        this.e = new MemoryTargetCache(this);
        MemoryBundleCache memoryBundleCache = new MemoryBundleCache();
        new HashMap();
        new HashMap();
        this.f = memoryBundleCache;
        MemoryRemoteDocumentCache memoryRemoteDocumentCache = new MemoryRemoteDocumentCache();
        memoryRemoteDocumentCache.f15501a = DocumentCollections.f15533a;
        this.g = memoryRemoteDocumentCache;
        this.c = new HashMap();
    }

    public static MemoryPersistence n() {
        MemoryPersistence memoryPersistence = new MemoryPersistence();
        memoryPersistence.h = new MemoryEagerReferenceDelegate(memoryPersistence);
        return memoryPersistence;
    }

    @Override // com.google.firebase.firestore.local.Persistence
    public final BundleCache a() {
        return this.f;
    }

    @Override // com.google.firebase.firestore.local.Persistence
    public final DocumentOverlayCache b(User user) {
        HashMap map = this.c;
        MemoryDocumentOverlayCache memoryDocumentOverlayCache = (MemoryDocumentOverlayCache) map.get(user);
        if (memoryDocumentOverlayCache != null) {
            return memoryDocumentOverlayCache;
        }
        MemoryDocumentOverlayCache memoryDocumentOverlayCache2 = new MemoryDocumentOverlayCache();
        map.put(user, memoryDocumentOverlayCache2);
        return memoryDocumentOverlayCache2;
    }

    @Override // com.google.firebase.firestore.local.Persistence
    public final GlobalsCache c() {
        return this.f15500a;
    }

    @Override // com.google.firebase.firestore.local.Persistence
    public final IndexManager d(User user) {
        return this.d;
    }

    @Override // com.google.firebase.firestore.local.Persistence
    public final MutationQueue e(User user, IndexManager indexManager) {
        HashMap map = this.b;
        MemoryMutationQueue memoryMutationQueue = (MemoryMutationQueue) map.get(user);
        if (memoryMutationQueue != null) {
            return memoryMutationQueue;
        }
        MemoryMutationQueue memoryMutationQueue2 = new MemoryMutationQueue(this);
        map.put(user, memoryMutationQueue2);
        return memoryMutationQueue2;
    }

    @Override // com.google.firebase.firestore.local.Persistence
    public final OverlayMigrationManager f() {
        return new MemoryOverlayMigrationManager();
    }

    @Override // com.google.firebase.firestore.local.Persistence
    public final ReferenceDelegate g() {
        return this.h;
    }

    @Override // com.google.firebase.firestore.local.Persistence
    public final RemoteDocumentCache h() {
        return this.g;
    }

    @Override // com.google.firebase.firestore.local.Persistence
    public final TargetCache i() {
        return this.e;
    }

    @Override // com.google.firebase.firestore.local.Persistence
    public final boolean j() {
        return this.i;
    }

    @Override // com.google.firebase.firestore.local.Persistence
    public final Object k(String str, Supplier supplier) {
        this.h.c();
        try {
            return supplier.get();
        } finally {
            this.h.onTransactionCommitted();
        }
    }

    @Override // com.google.firebase.firestore.local.Persistence
    public final void l(Runnable runnable, String str) {
        this.h.c();
        try {
            runnable.run();
        } finally {
            this.h.onTransactionCommitted();
        }
    }

    @Override // com.google.firebase.firestore.local.Persistence
    public final void m() {
        Assert.b(!this.i, "MemoryPersistence double-started!", new Object[0]);
        this.i = true;
    }
}
