package com.dynatrace.android.lifecycle.callback;

import YU.a;

/* loaded from: classes.dex */
public class ComponentIdentity {

    /* renamed from: a, reason: collision with root package name */
    public final String f14170a;
    public final int b;

    public ComponentIdentity(String str, int i) {
        this.f14170a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ComponentIdentity componentIdentity = (ComponentIdentity) obj;
            String str = componentIdentity.f14170a;
            if (this.b != componentIdentity.b) {
                return false;
            }
            String str2 = this.f14170a;
            if (str2 != null) {
                return str2.equals(str);
            }
            if (str == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f14170a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ComponentIdentity{componentName='");
        sb.append(this.f14170a);
        sb.append("', uniqueId=");
        return a.l(sb, this.b, '}');
    }
}
