package com.google.firebase.components;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class Component<T> {

    /* renamed from: a, reason: collision with root package name */
    public final String f15222a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final ComponentFactory f;
    public final Set g;

    public Component(String str, Set set, Set set2, int i, int i2, ComponentFactory componentFactory, Set set3) {
        this.f15222a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = componentFactory;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static Builder a(Qualified qualified) {
        return new Builder(qualified, new Qualified[0]);
    }

    public static Builder b(Class cls) {
        return new Builder(cls, new Class[0]);
    }

    public static Component c(Object obj, Class cls, Class... clsArr) {
        Builder builder = new Builder(cls, clsArr);
        builder.f = new androidx.compose.runtime.snapshots.a(obj, 6);
        return builder.b();
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }

    public static class Builder<T> {

        /* renamed from: a, reason: collision with root package name */
        public String f15223a = null;
        public final HashSet b;
        public final HashSet c;
        public int d;
        public int e;
        public ComponentFactory f;
        public final HashSet g;

        public Builder(Class cls, Class[] clsArr) {
            HashSet hashSet = new HashSet();
            this.b = hashSet;
            this.c = new HashSet();
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            hashSet.add(Qualified.a(cls));
            for (Class cls2 : clsArr) {
                Preconditions.a(cls2, "Null interface");
                this.b.add(Qualified.a(cls2));
            }
        }

        public final void a(Dependency dependency) {
            if (this.b.contains(dependency.f15230a)) {
                throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
            }
            this.c.add(dependency);
        }

        public final Component b() {
            if (this.f != null) {
                return new Component(this.f15223a, new HashSet(this.b), new HashSet(this.c), this.d, this.e, this.f, this.g);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        public final void c(int i) {
            if (!(this.d == 0)) {
                throw new IllegalStateException("Instantiation type has already been set.");
            }
            this.d = i;
        }

        public Builder(Qualified qualified, Qualified[] qualifiedArr) {
            HashSet hashSet = new HashSet();
            this.b = hashSet;
            this.c = new HashSet();
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            hashSet.add(qualified);
            for (Qualified qualified2 : qualifiedArr) {
                Preconditions.a(qualified2, "Null interface");
            }
            Collections.addAll(this.b, qualifiedArr);
        }
    }
}
