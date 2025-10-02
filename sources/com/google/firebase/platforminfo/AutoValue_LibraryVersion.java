package com.google.firebase.platforminfo;

/* loaded from: classes.dex */
final class AutoValue_LibraryVersion extends LibraryVersion {

    /* renamed from: a, reason: collision with root package name */
    public final String f15751a;
    public final String b;

    public AutoValue_LibraryVersion(String str, String str2) {
        this.f15751a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.b = str2;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersion
    public final String a() {
        return this.f15751a;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersion
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LibraryVersion)) {
            return false;
        }
        LibraryVersion libraryVersion = (LibraryVersion) obj;
        return this.f15751a.equals(libraryVersion.a()) && this.b.equals(libraryVersion.b());
    }

    public final int hashCode() {
        return ((this.f15751a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f15751a);
        sb.append(", version=");
        return YU.a.o(sb, this.b, "}");
    }
}
