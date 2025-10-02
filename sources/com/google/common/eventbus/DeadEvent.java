package com.google.common.eventbus;

import com.google.common.base.MoreObjects;

@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public class DeadEvent {
    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(null, "source");
        toStringHelperB.c(null, "event");
        return toStringHelperB.toString();
    }
}
