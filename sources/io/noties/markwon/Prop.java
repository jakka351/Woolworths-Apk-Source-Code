package io.noties.markwon;

import YU.a;

/* loaded from: classes7.dex */
public class Prop<T> {

    /* renamed from: a, reason: collision with root package name */
    public final String f24195a;

    public Prop(String str) {
        this.f24195a = str;
    }

    public final Object a(RenderProps renderProps) {
        Object objB = renderProps.b(this);
        if (objB != null) {
            return objB;
        }
        throw new NullPointerException(this.f24195a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f24195a.equals(((Prop) obj).f24195a);
    }

    public final int hashCode() {
        return this.f24195a.hashCode();
    }

    public final String toString() {
        return a.o(new StringBuilder("Prop{name='"), this.f24195a, "'}");
    }
}
