package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.remote.TestingHooks;

/* loaded from: classes6.dex */
final class AutoValue_TestingHooks_ExistenceFilterMismatchInfo extends TestingHooks.ExistenceFilterMismatchInfo {

    /* renamed from: a, reason: collision with root package name */
    public final int f15564a;
    public final int b;
    public final String c;
    public final String d;
    public final TestingHooks.ExistenceFilterBloomFilterInfo e;

    public AutoValue_TestingHooks_ExistenceFilterMismatchInfo(int i, int i2, String str, String str2, AutoValue_TestingHooks_ExistenceFilterBloomFilterInfo autoValue_TestingHooks_ExistenceFilterBloomFilterInfo) {
        this.f15564a = i;
        this.b = i2;
        if (str == null) {
            throw new NullPointerException("Null projectId");
        }
        this.c = str;
        if (str2 == null) {
            throw new NullPointerException("Null databaseId");
        }
        this.d = str2;
        this.e = autoValue_TestingHooks_ExistenceFilterBloomFilterInfo;
    }

    @Override // com.google.firebase.firestore.remote.TestingHooks.ExistenceFilterMismatchInfo
    public final TestingHooks.ExistenceFilterBloomFilterInfo a() {
        return this.e;
    }

    @Override // com.google.firebase.firestore.remote.TestingHooks.ExistenceFilterMismatchInfo
    public final String b() {
        return this.d;
    }

    @Override // com.google.firebase.firestore.remote.TestingHooks.ExistenceFilterMismatchInfo
    public final int c() {
        return this.b;
    }

    @Override // com.google.firebase.firestore.remote.TestingHooks.ExistenceFilterMismatchInfo
    public final int d() {
        return this.f15564a;
    }

    @Override // com.google.firebase.firestore.remote.TestingHooks.ExistenceFilterMismatchInfo
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TestingHooks.ExistenceFilterMismatchInfo)) {
            return false;
        }
        TestingHooks.ExistenceFilterMismatchInfo existenceFilterMismatchInfo = (TestingHooks.ExistenceFilterMismatchInfo) obj;
        if (this.f15564a != existenceFilterMismatchInfo.d() || this.b != existenceFilterMismatchInfo.c() || !this.c.equals(existenceFilterMismatchInfo.e()) || !this.d.equals(existenceFilterMismatchInfo.b())) {
            return false;
        }
        TestingHooks.ExistenceFilterBloomFilterInfo existenceFilterBloomFilterInfo = this.e;
        return existenceFilterBloomFilterInfo == null ? existenceFilterMismatchInfo.a() == null : existenceFilterBloomFilterInfo.equals(existenceFilterMismatchInfo.a());
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f15564a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        TestingHooks.ExistenceFilterBloomFilterInfo existenceFilterBloomFilterInfo = this.e;
        return iHashCode ^ (existenceFilterBloomFilterInfo == null ? 0 : existenceFilterBloomFilterInfo.hashCode());
    }

    public final String toString() {
        return "ExistenceFilterMismatchInfo{localCacheCount=" + this.f15564a + ", existenceFilterCount=" + this.b + ", projectId=" + this.c + ", databaseId=" + this.d + ", bloomFilter=" + this.e + "}";
    }
}
