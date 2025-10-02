package com.fasterxml.jackson.databind.introspect;

import YU.a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public final class MemberKey {
    public static final Class[] c = new Class[0];

    /* renamed from: a, reason: collision with root package name */
    public final String f14276a;
    public final Class[] b;

    public MemberKey(Method method) {
        this(method.getName(), method.getParameterTypes());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != MemberKey.class) {
            return false;
        }
        MemberKey memberKey = (MemberKey) obj;
        if (!this.f14276a.equals(memberKey.f14276a)) {
            return false;
        }
        Class[] clsArr = memberKey.b;
        Class[] clsArr2 = this.b;
        int length = clsArr2.length;
        if (clsArr.length != length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (clsArr[i] != clsArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f14276a.hashCode() + this.b.length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f14276a);
        sb.append("(");
        return a.m(sb, this.b.length, "-args)");
    }

    public MemberKey(Constructor constructor) {
        this("", constructor.getParameterTypes());
    }

    public MemberKey(String str, Class[] clsArr) {
        this.f14276a = str;
        this.b = clsArr == null ? c : clsArr;
    }
}
