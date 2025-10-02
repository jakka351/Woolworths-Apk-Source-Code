package com.google.firebase.firestore.model;

import com.google.firebase.firestore.model.BasePath;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Util;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class BasePath<B extends BasePath<B>> implements Comparable<B> {
    public final List d;

    public BasePath(List list) {
        this.d = list;
    }

    public final BasePath a(String str) {
        ArrayList arrayList = new ArrayList(this.d);
        arrayList.add(str);
        return d(arrayList);
    }

    public abstract String b();

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(BasePath basePath) {
        int size = this.d.size();
        int size2 = basePath.d.size();
        for (int i = 0; i < size && i < size2; i++) {
            String strF = f(i);
            String strF2 = basePath.f(i);
            int iCompare = 1;
            boolean z = strF.startsWith("__id") && strF.endsWith(lqlqqlq.m006D006D006Dm006Dm);
            boolean z2 = strF2.startsWith("__id") && strF2.endsWith(lqlqqlq.m006D006D006Dm006Dm);
            if (z && !z2) {
                iCompare = -1;
            } else if (z || !z2) {
                iCompare = (z && z2) ? Long.compare(Long.parseLong(strF.substring(4, strF.length() - 2)), Long.parseLong(strF2.substring(4, strF2.length() - 2))) : Util.e(strF, strF2);
            }
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return Integer.compare(size, size2);
    }

    public abstract BasePath d(List list);

    public final String e() {
        return (String) this.d.get(r0.size() - 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BasePath) && compareTo((BasePath) obj) == 0;
    }

    public final String f(int i) {
        return (String) this.d.get(i);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((getClass().hashCode() + 37) * 37);
    }

    public final boolean l() {
        return this.d.size() == 0;
    }

    public final boolean m(BasePath basePath) {
        List list = this.d;
        if (list.size() <= basePath.d.size()) {
            for (int i = 0; i < list.size(); i++) {
                if (f(i).equals(basePath.f(i))) {
                }
            }
            return true;
        }
        return false;
    }

    public final BasePath n() {
        List list = this.d;
        int size = list.size();
        Assert.b(size >= 5, "Can't call popFirst with count > length() (%d > %d)", 5, Integer.valueOf(size));
        return new ResourcePath(list.subList(5, size));
    }

    public final BasePath o() {
        return d(this.d.subList(0, r0.size() - 1));
    }

    public final String toString() {
        return b();
    }
}
