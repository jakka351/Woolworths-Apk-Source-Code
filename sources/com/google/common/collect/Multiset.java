package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Collection;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public interface Multiset<E> extends Collection<E> {

    public interface Entry<E> {
        Object a();

        int getCount();
    }

    boolean V1(int i, Object obj);

    int add(int i, Object obj);

    int b0(int i, Object obj);

    Set c();

    int e2(Object obj);

    Set entrySet();

    boolean equals(Object obj);

    int hashCode();

    int w2(Object obj);
}
