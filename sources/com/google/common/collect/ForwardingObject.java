package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class ForwardingObject {
    public abstract Object P1();

    public String toString() {
        return P1().toString();
    }
}
