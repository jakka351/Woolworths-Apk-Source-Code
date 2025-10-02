package com.fasterxml.jackson.databind.jsontype;

import androidx.constraintlayout.core.state.a;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class NamedType implements Serializable {
    public final Class d;
    public final int e;
    public final String f;

    public NamedType(Class cls, String str) {
        this.d = cls;
        this.e = cls.getName().hashCode() + (str == null ? 0 : str.hashCode());
        this.f = (str == null || str.isEmpty()) ? null : str;
    }

    public final boolean a() {
        return this.f != null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != NamedType.class) {
            return false;
        }
        NamedType namedType = (NamedType) obj;
        return this.d == namedType.d && Objects.equals(this.f, namedType.f);
    }

    public final int hashCode() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[NamedType, class ");
        a.x(this.d, sb, ", name: ");
        return YU.a.o(sb, this.f == null ? "null" : YU.a.o(new StringBuilder("'"), this.f, "'"), "]");
    }
}
