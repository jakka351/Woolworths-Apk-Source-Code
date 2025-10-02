package com.behaviosec.rl;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import java.util.Objects;

@SuppressLint
/* loaded from: classes4.dex */
public class yllylyl<F, S, T> {
    public static int c006300630063c00630063c = 2;
    public static int c0063c0063c00630063c = 95;
    public static int cc00630063c00630063c = 1;
    public final F first;
    public final S second;
    public final T third;

    public yllylyl(F f, S s, T t) {
        this.first = f;
        this.second = s;
        this.third = t;
    }

    public static int c0063cc006300630063c() {
        return 0;
    }

    public static int cccc006300630063c() {
        return 33;
    }

    @NonNull
    public static <A, B, C> yllylyl<A, B, C> r007200720072r0072r(A a2, B b, C c) {
        int i = c0063c0063c00630063c;
        if (((cc00630063c00630063c + i) * i) % c006300630063c00630063c != 0) {
            c0063c0063c00630063c = cccc006300630063c();
            cc00630063c00630063c = 82;
        }
        return new yllylyl<>(a2, b, c);
    }

    @SuppressLint
    public boolean equals(Object obj) {
        if (!(obj instanceof yllylyl)) {
            return false;
        }
        yllylyl yllylylVar = (yllylyl) obj;
        int i = c0063c0063c00630063c;
        if (((cc00630063c00630063c + i) * i) % c006300630063c00630063c != 0) {
            c0063c0063c00630063c = 52;
            cc00630063c00630063c = cccc006300630063c();
        }
        return Objects.equals(yllylylVar.first, this.first) && Objects.equals(yllylylVar.second, this.second) && Objects.equals(yllylylVar.third, this.third);
    }

    public int hashCode() {
        int iHashCode;
        F f = this.first;
        if (f == null) {
            int i = c0063c0063c00630063c;
            if (((cc00630063c00630063c + i) * i) % c006300630063c00630063c != c0063cc006300630063c()) {
                c0063c0063c00630063c = cccc006300630063c();
                cc00630063c00630063c = 19;
            }
            iHashCode = 0;
        } else {
            iHashCode = f.hashCode();
        }
        S s = this.second;
        int iHashCode2 = iHashCode ^ (s == null ? 0 : s.hashCode());
        T t = this.third;
        return iHashCode2 ^ (t != null ? t.hashCode() : 0);
    }
}
