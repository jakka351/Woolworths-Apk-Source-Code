package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@DoNotMock
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public interface Table<R, C, V> {

    public interface Cell<R, C, V> {
        Object a();

        Object b();

        Object getValue();
    }

    Set W0();

    Map d();

    boolean equals(Object obj);

    int hashCode();

    int size();
}
