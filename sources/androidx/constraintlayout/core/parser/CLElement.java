package androidx.constraintlayout.core.parser;

import android.support.v4.media.session.a;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public class CLElement implements Cloneable {
    public final char[] d;
    public long e = -1;
    public long f = Long.MAX_VALUE;
    public CLContainer g;

    public CLElement(char[] cArr) {
        this.d = cArr;
    }

    @Override // 
    /* renamed from: b */
    public CLElement clone() {
        try {
            return (CLElement) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public final String d() {
        String str = new String(this.d);
        if (str.length() < 1) {
            return "";
        }
        long j = this.f;
        if (j != Long.MAX_VALUE) {
            long j2 = this.e;
            if (j >= j2) {
                return str.substring((int) j2, ((int) j) + 1);
            }
        }
        long j3 = this.e;
        return str.substring((int) j3, ((int) j3) + 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CLElement)) {
            return false;
        }
        CLElement cLElement = (CLElement) obj;
        if (this.e == cLElement.e && this.f == cLElement.f && Arrays.equals(this.d, cLElement.d)) {
            return Objects.equals(this.g, cLElement.g);
        }
        return false;
    }

    public float g() {
        if (this instanceof CLNumber) {
            return ((CLNumber) this).g();
        }
        return Float.NaN;
    }

    public int h() {
        if (this instanceof CLNumber) {
            return ((CLNumber) this).h();
        }
        return 0;
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.d) * 31;
        long j = this.e;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        CLContainer cLContainer = this.g;
        return ((i2 + (cLContainer != null ? cLContainer.hashCode() : 0)) * 31) + 0;
    }

    public final String i() {
        String string = getClass().toString();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    public final void j(long j) {
        if (this.f != Long.MAX_VALUE) {
            return;
        }
        this.f = j;
        CLContainer cLContainer = this.g;
        if (cLContainer != null) {
            cLContainer.k(this);
        }
    }

    public String toString() {
        long j = this.e;
        long j2 = this.f;
        if (j > j2 || j2 == Long.MAX_VALUE) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass());
            sb.append(" (INVALID, ");
            sb.append(this.e);
            sb.append("-");
            return a.l(this.f, ")", sb);
        }
        return i() + " (" + this.e + " : " + this.f + ") <<" + new String(this.d).substring((int) this.e, ((int) this.f) + 1) + ">>";
    }
}
