package com.fasterxml.jackson.core.json;

import java.util.HashSet;

/* loaded from: classes4.dex */
public class DupDetector {

    /* renamed from: a, reason: collision with root package name */
    public final Object f14211a;
    public String b;
    public String c;
    public HashSet d;

    public DupDetector(Object obj) {
        this.f14211a = obj;
    }

    public final DupDetector a() {
        return new DupDetector(this.f14211a);
    }

    public final boolean b(String str) {
        String str2 = this.b;
        if (str2 == null) {
            this.b = str;
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        String str3 = this.c;
        if (str3 == null) {
            this.c = str;
            return false;
        }
        if (str.equals(str3)) {
            return true;
        }
        if (this.d == null) {
            HashSet hashSet = new HashSet(16);
            this.d = hashSet;
            hashSet.add(this.b);
            this.d.add(this.c);
        }
        return !this.d.add(str);
    }
}
