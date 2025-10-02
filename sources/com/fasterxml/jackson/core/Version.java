package com.fasterxml.jackson.core;

import io.jsonwebtoken.JwtParser;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class Version implements Comparable<Version>, Serializable {
    public static final Version j = new Version(0, 0, 0, null, null, null);
    public final int d;
    public final int e;
    public final int f;
    public final String g;
    public final String h;
    public final String i;

    public Version(int i, int i2, int i3, String str, String str2, String str3) {
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.i = str;
        this.g = str2 == null ? "" : str2;
        this.h = str3 == null ? "" : str3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Version version) {
        Version version2 = version;
        if (version2 == this) {
            return 0;
        }
        int iCompareTo = this.g.compareTo(version2.g);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = this.h.compareTo(version2.h);
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        int i = this.d - version2.d;
        if (i != 0) {
            return i;
        }
        int i2 = this.e - version2.e;
        return i2 == 0 ? this.f - version2.f : i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Version version = (Version) obj;
        return version.d == this.d && version.e == this.e && version.f == this.f && version.h.equals(this.h) && version.g.equals(this.g);
    }

    public final int hashCode() {
        return this.h.hashCode() ^ (((this.g.hashCode() + this.d) - this.e) + this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        sb.append(JwtParser.SEPARATOR_CHAR);
        sb.append(this.e);
        sb.append(JwtParser.SEPARATOR_CHAR);
        sb.append(this.f);
        String str = this.i;
        if (str != null && str.length() > 0) {
            sb.append('-');
            sb.append(str);
        }
        return sb.toString();
    }
}
