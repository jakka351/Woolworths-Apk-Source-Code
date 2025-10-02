package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.errorprone.annotations.Immutable;
import java.util.Arrays;

@Immutable
@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class ElementOrder<T> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        public static final /* synthetic */ Type[] d = {new Type("UNORDERED", 0), new Type("STABLE", 1), new Type("INSERTION", 2), new Type("SORTED", 3)};

        /* JADX INFO: Fake field, exist only in values array */
        Type EF5;

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) d.clone();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ElementOrder) && Objects.a(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, null});
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(null, "type");
        return toStringHelperB.toString();
    }
}
