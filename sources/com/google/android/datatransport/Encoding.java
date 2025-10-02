package com.google.android.datatransport;

import YU.a;

/* loaded from: classes.dex */
public final class Encoding {

    /* renamed from: a, reason: collision with root package name */
    public final String f14388a;

    public Encoding(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f14388a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Encoding)) {
            return false;
        }
        return this.f14388a.equals(((Encoding) obj).f14388a);
    }

    public final int hashCode() {
        return this.f14388a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a.o(new StringBuilder("Encoding{name=\""), this.f14388a, "\"}");
    }
}
