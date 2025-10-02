package com.google.firebase.firestore.remote;

/* loaded from: classes6.dex */
public final class ExistenceFilter {

    /* renamed from: a, reason: collision with root package name */
    public final int f15568a;
    public final com.google.firestore.v1.BloomFilter b;

    public ExistenceFilter(int i, com.google.firestore.v1.BloomFilter bloomFilter) {
        this.f15568a = i;
        this.b = bloomFilter;
    }

    public final String toString() {
        return "ExistenceFilter{count=" + this.f15568a + ", unchangedNames=" + this.b + '}';
    }
}
