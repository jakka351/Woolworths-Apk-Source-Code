package com.airbnb.lottie.model;

import androidx.annotation.RestrictTo;
import androidx.core.util.Pair;

@RestrictTo
/* loaded from: classes4.dex */
public class MutablePair<T> {

    /* renamed from: a, reason: collision with root package name */
    public String f13396a;
    public String b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.f2463a;
        String str = this.f13396a;
        if (obj2 != str && (obj2 == null || !obj2.equals(str))) {
            return false;
        }
        Object obj3 = pair.b;
        String str2 = this.b;
        if (obj3 != str2) {
            return obj3 != null && obj3.equals(str2);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f13396a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + ((Object) this.f13396a) + " " + ((Object) this.b) + "}";
    }
}
