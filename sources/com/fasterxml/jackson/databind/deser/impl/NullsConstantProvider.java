package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class NullsConstantProvider implements NullValueProvider, Serializable {
    public static final NullsConstantProvider e = new NullsConstantProvider(null);
    public static final NullsConstantProvider f = new NullsConstantProvider(null);
    public final Object d;

    public NullsConstantProvider(Object obj) {
        this.d = obj;
    }

    public static boolean a(NullValueProvider nullValueProvider) {
        return nullValueProvider == e;
    }

    @Override // com.fasterxml.jackson.databind.deser.NullValueProvider
    public final Object c(DeserializationContext deserializationContext) {
        return this.d;
    }
}
