package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.remote.TestingHooks;

/* loaded from: classes6.dex */
final class AutoValue_TestingHooks_ExistenceFilterBloomFilterInfo extends TestingHooks.ExistenceFilterBloomFilterInfo {

    /* renamed from: a, reason: collision with root package name */
    public final BloomFilter f15563a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;

    public AutoValue_TestingHooks_ExistenceFilterBloomFilterInfo(BloomFilter bloomFilter, boolean z, int i, int i2, int i3) {
        this.f15563a = bloomFilter;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    @Override // com.google.firebase.firestore.remote.TestingHooks.ExistenceFilterBloomFilterInfo
    public final boolean a() {
        return this.b;
    }

    @Override // com.google.firebase.firestore.remote.TestingHooks.ExistenceFilterBloomFilterInfo
    public final int b() {
        return this.d;
    }

    @Override // com.google.firebase.firestore.remote.TestingHooks.ExistenceFilterBloomFilterInfo
    public final BloomFilter c() {
        return this.f15563a;
    }

    @Override // com.google.firebase.firestore.remote.TestingHooks.ExistenceFilterBloomFilterInfo
    public final int d() {
        return this.c;
    }

    @Override // com.google.firebase.firestore.remote.TestingHooks.ExistenceFilterBloomFilterInfo
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TestingHooks.ExistenceFilterBloomFilterInfo)) {
            return false;
        }
        TestingHooks.ExistenceFilterBloomFilterInfo existenceFilterBloomFilterInfo = (TestingHooks.ExistenceFilterBloomFilterInfo) obj;
        BloomFilter bloomFilter = this.f15563a;
        if (bloomFilter == null) {
            if (existenceFilterBloomFilterInfo.c() != null) {
                return false;
            }
        } else if (!bloomFilter.equals(existenceFilterBloomFilterInfo.c())) {
            return false;
        }
        return this.b == existenceFilterBloomFilterInfo.a() && this.c == existenceFilterBloomFilterInfo.d() && this.d == existenceFilterBloomFilterInfo.b() && this.e == existenceFilterBloomFilterInfo.e();
    }

    public final int hashCode() {
        BloomFilter bloomFilter = this.f15563a;
        return (((((((((bloomFilter == null ? 0 : bloomFilter.hashCode()) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExistenceFilterBloomFilterInfo{bloomFilter=");
        sb.append(this.f15563a);
        sb.append(", applied=");
        sb.append(this.b);
        sb.append(", hashCount=");
        sb.append(this.c);
        sb.append(", bitmapLength=");
        sb.append(this.d);
        sb.append(", padding=");
        return YU.a.m(sb, this.e, "}");
    }
}
