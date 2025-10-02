package com.google.zxing.oned.rss;

import YU.a;

/* loaded from: classes6.dex */
public class DataCharacter {

    /* renamed from: a, reason: collision with root package name */
    public final int f16186a;
    public final int b;

    public DataCharacter(int i, int i2) {
        this.f16186a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DataCharacter)) {
            return false;
        }
        DataCharacter dataCharacter = (DataCharacter) obj;
        return this.f16186a == dataCharacter.f16186a && this.b == dataCharacter.b;
    }

    public final int hashCode() {
        return this.f16186a ^ this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16186a);
        sb.append("(");
        return a.l(sb, this.b, ')');
    }
}
