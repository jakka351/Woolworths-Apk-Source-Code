package com.google.firebase.components;

import com.google.firebase.events.Publisher;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
final class RestrictedComponentContainer implements ComponentContainer {

    /* renamed from: a, reason: collision with root package name */
    public final Set f15236a;
    public final Set b;
    public final Set c;
    public final Set d;
    public final Set e;
    public final Set f;
    public final ComponentContainer g;

    /* loaded from: classes6.dex */
    public static class RestrictedPublisher implements Publisher {

        /* renamed from: a, reason: collision with root package name */
        public final Set f15237a;
        public final Publisher b;

        public RestrictedPublisher(Set set, Publisher publisher) {
            this.f15237a = set;
            this.b = publisher;
        }
    }

    public RestrictedComponentContainer(Component component, ComponentContainer componentContainer) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<Dependency> set = component.c;
        Set set2 = component.g;
        for (Dependency dependency : set) {
            int i = dependency.c;
            int i2 = dependency.b;
            boolean z = i == 0;
            Qualified qualified = dependency.f15230a;
            if (z) {
                if (i2 == 2) {
                    hashSet4.add(qualified);
                } else {
                    hashSet.add(qualified);
                }
            } else if (i == 2) {
                hashSet3.add(qualified);
            } else if (i2 == 2) {
                hashSet5.add(qualified);
            } else {
                hashSet2.add(qualified);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(Qualified.a(Publisher.class));
        }
        this.f15236a = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        this.c = Collections.unmodifiableSet(hashSet3);
        this.d = Collections.unmodifiableSet(hashSet4);
        this.e = Collections.unmodifiableSet(hashSet5);
        this.f = set2;
        this.g = componentContainer;
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final Object a(Class cls) {
        if (!this.f15236a.contains(Qualified.a(cls))) {
            throw new DependencyException(androidx.constraintlayout.core.state.a.e(cls, "Attempting to request an undeclared dependency ", "."));
        }
        Object objA = this.g.a(cls);
        return !cls.equals(Publisher.class) ? objA : new RestrictedPublisher(this.f, (Publisher) objA);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final Provider c(Class cls) {
        return e(Qualified.a(cls));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final Deferred d(Qualified qualified) {
        if (this.c.contains(qualified)) {
            return this.g.d(qualified);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Deferred<" + qualified + ">.");
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final Provider e(Qualified qualified) {
        if (this.b.contains(qualified)) {
            return this.g.e(qualified);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Provider<" + qualified + ">.");
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final Set f(Qualified qualified) {
        if (this.d.contains(qualified)) {
            return this.g.f(qualified);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Set<" + qualified + ">.");
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final Provider g(Qualified qualified) {
        if (this.e.contains(qualified)) {
            return this.g.g(qualified);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Provider<Set<" + qualified + ">>.");
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final Object h(Qualified qualified) {
        if (this.f15236a.contains(qualified)) {
            return this.g.h(qualified);
        }
        throw new DependencyException("Attempting to request an undeclared dependency " + qualified + ".");
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final Deferred i(Class cls) {
        return d(Qualified.a(cls));
    }
}
