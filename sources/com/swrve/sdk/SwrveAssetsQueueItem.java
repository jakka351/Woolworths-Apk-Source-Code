package com.swrve.sdk;

/* loaded from: classes6.dex */
public class SwrveAssetsQueueItem {

    /* renamed from: a, reason: collision with root package name */
    public final int f19040a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public int f;

    public SwrveAssetsQueueItem(String str, String str2, boolean z, int i, boolean z2) {
        this.f19040a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
    }

    public final int a() {
        return this.f19040a;
    }

    public final String b() {
        return this.c;
    }

    public final int c() {
        return this.f;
    }

    public final String d() {
        return this.b;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwrveAssetsQueueItem swrveAssetsQueueItem = (SwrveAssetsQueueItem) obj;
        String str = swrveAssetsQueueItem.c;
        String str2 = swrveAssetsQueueItem.b;
        if (this.d != swrveAssetsQueueItem.d) {
            return false;
        }
        String str3 = this.b;
        if (str3 != null) {
            if (!str3.equals(str2)) {
                return false;
            }
        } else if (str2 != null) {
            return false;
        }
        String str4 = this.c;
        return str4 != null ? str4.equals(str) : str == null;
    }

    public final boolean f() {
        return this.d;
    }

    public final void g(int i) {
        this.f = i;
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.c;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.d ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SwrveAssetsQueueItem{campaignId='");
        sb.append(this.f19040a);
        sb.append("', name='");
        sb.append(this.b);
        sb.append("', digest='");
        sb.append(this.c);
        sb.append("', isImage=");
        sb.append(this.d);
        sb.append(", isExternalSource=");
        return androidx.camera.core.impl.b.s(sb, this.e, '}');
    }
}
