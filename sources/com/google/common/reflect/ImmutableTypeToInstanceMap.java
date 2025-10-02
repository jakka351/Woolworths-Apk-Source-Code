package com.google.common.reflect;

import com.google.common.collect.ForwardingMap;
import java.util.Map;

@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class ImmutableTypeToInstanceMap<B> extends ForwardingMap<TypeToken<? extends B>, B> implements TypeToInstanceMap<B> {

    public static final class Builder<B> {
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public final /* bridge */ /* synthetic */ Object P1() {
        return null;
    }

    @Override // com.google.common.collect.ForwardingMap
    /* renamed from: R1 */
    public final Map P1() {
        return null;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }
}
