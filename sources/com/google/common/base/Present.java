package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.FluentIterable;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes.dex */
final class Present<T> extends Optional<T> {
    public final Object d;

    public Present(Object obj) {
        this.d = obj;
    }

    @Override // com.google.common.base.Optional
    public final Object b() {
        return this.d;
    }

    @Override // com.google.common.base.Optional
    public final boolean c() {
        return true;
    }

    @Override // com.google.common.base.Optional
    public final Object e(FluentIterable fluentIterable) {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Present) {
            return this.d.equals(((Present) obj).d);
        }
        return false;
    }

    @Override // com.google.common.base.Optional
    public final Object f() {
        return this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + 1502476572;
    }

    public final String toString() {
        return android.support.v4.media.session.a.o(this.d, ")", new StringBuilder("Optional.of("));
    }
}
