package com.google.firebase.components;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Set;

/* loaded from: classes.dex */
public interface ComponentContainer {
    default Object a(Class cls) {
        return h(Qualified.a(cls));
    }

    default Set b(Class cls) {
        return f(Qualified.a(cls));
    }

    default Provider c(Class cls) {
        return e(Qualified.a(cls));
    }

    Deferred d(Qualified qualified);

    Provider e(Qualified qualified);

    default Set f(Qualified qualified) {
        return (Set) g(qualified).get();
    }

    Provider g(Qualified qualified);

    default Object h(Qualified qualified) {
        Provider providerE = e(qualified);
        if (providerE == null) {
            return null;
        }
        return providerE.get();
    }

    default Deferred i(Class cls) {
        return d(Qualified.a(cls));
    }
}
