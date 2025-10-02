package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

/* loaded from: classes4.dex */
public abstract class ContainerSerializer<T> extends StdSerializer<T> {
    public abstract ContainerSerializer o(TypeSerializer typeSerializer);

    public abstract boolean p(Object obj);
}
