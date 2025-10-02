package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.Map;

@Immutable
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class ImmutableClassToInstanceMap<B> extends ForwardingMap<Class<? extends B>, B> implements ClassToInstanceMap<B>, Serializable {
    public static final ImmutableClassToInstanceMap e = new ImmutableClassToInstanceMap();
    public final ImmutableMap d = RegularImmutableMap.j;

    public static final class Builder<B> {
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public final Object P1() {
        return RegularImmutableMap.j;
    }

    @Override // com.google.common.collect.ForwardingMap
    /* renamed from: R1 */
    public final Map P1() {
        return this.d;
    }

    public Object readResolve() {
        return isEmpty() ? e : this;
    }
}
