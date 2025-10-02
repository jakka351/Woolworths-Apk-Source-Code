package com.google.common.net;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.Arrays;

@Immutable
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class HostAndPort implements Serializable {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HostAndPort) && Objects.a(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, 0});
    }

    public final String toString() {
        throw null;
    }
}
