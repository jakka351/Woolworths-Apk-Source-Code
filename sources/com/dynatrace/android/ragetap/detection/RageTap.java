package com.dynatrace.android.ragetap.detection;

import YU.a;

/* loaded from: classes4.dex */
public class RageTap {

    /* renamed from: a, reason: collision with root package name */
    public final TapData f14172a;
    public final TapData b;
    public final int c;

    public RageTap(TapData tapData, TapData tapData2, int i) {
        this.f14172a = tapData;
        this.b = tapData2;
        this.c = i;
    }

    public final TapData a() {
        return this.f14172a;
    }

    public final TapData b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            RageTap rageTap = (RageTap) obj;
            if (this.c == rageTap.c && this.f14172a.equals(rageTap.f14172a) && this.b.equals(rageTap.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (this.f14172a.hashCode() * 31)) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RageTap{firstTap=");
        sb.append(this.f14172a);
        sb.append(", lastTap=");
        sb.append(this.b);
        sb.append(", numOfTaps=");
        return a.l(sb, this.c, '}');
    }
}
