package com.google.firebase.firestore.local;

import android.util.SparseArray;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.util.Assert;

/* loaded from: classes6.dex */
class MemoryLruReferenceDelegate implements ReferenceDelegate, LruDelegate {

    /* renamed from: a, reason: collision with root package name */
    public long f15498a;

    @Override // com.google.firebase.firestore.local.LruDelegate
    public final LruGarbageCollector a() {
        throw null;
    }

    @Override // com.google.firebase.firestore.local.ReferenceDelegate
    public final void b(DocumentKey documentKey) {
        f();
        throw null;
    }

    @Override // com.google.firebase.firestore.local.ReferenceDelegate
    public final void c() {
        Assert.b(this.f15498a == -1, "Starting a transaction without committing the previous one", new Object[0]);
        throw null;
    }

    @Override // com.google.firebase.firestore.local.ReferenceDelegate
    public final void d(DocumentKey documentKey) {
        f();
        throw null;
    }

    @Override // com.google.firebase.firestore.local.LruDelegate
    public final long e() {
        throw null;
    }

    @Override // com.google.firebase.firestore.local.ReferenceDelegate
    public final long f() {
        Assert.b(this.f15498a != -1, "Attempting to get a sequence number outside of a transaction", new Object[0]);
        return this.f15498a;
    }

    @Override // com.google.firebase.firestore.local.LruDelegate
    public final void g(k kVar) {
        throw null;
    }

    @Override // com.google.firebase.firestore.local.LruDelegate
    public final int h(long j) {
        throw null;
    }

    @Override // com.google.firebase.firestore.local.LruDelegate
    public final void i(k kVar) {
        throw null;
    }

    @Override // com.google.firebase.firestore.local.LruDelegate
    public final int j(long j, SparseArray sparseArray) {
        throw null;
    }

    @Override // com.google.firebase.firestore.local.ReferenceDelegate
    public final void k(TargetData targetData) {
        targetData.b(f());
        throw null;
    }

    @Override // com.google.firebase.firestore.local.LruDelegate
    public final long l() {
        throw null;
    }

    @Override // com.google.firebase.firestore.local.ReferenceDelegate
    public final void m(ReferenceSet referenceSet) {
    }

    @Override // com.google.firebase.firestore.local.ReferenceDelegate
    public final void n(DocumentKey documentKey) {
        f();
        throw null;
    }

    @Override // com.google.firebase.firestore.local.ReferenceDelegate
    public final void o(DocumentKey documentKey) {
        f();
        throw null;
    }

    @Override // com.google.firebase.firestore.local.ReferenceDelegate
    public final void onTransactionCommitted() {
        Assert.b(this.f15498a != -1, "Committing a transaction without having started one", new Object[0]);
        this.f15498a = -1L;
    }
}
