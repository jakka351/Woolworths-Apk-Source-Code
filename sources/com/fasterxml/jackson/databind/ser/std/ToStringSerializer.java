package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes4.dex */
public class ToStringSerializer extends ToStringSerializerBase {
    public static final ToStringSerializer f = new ToStringSerializer(Object.class, 0);

    @Override // com.fasterxml.jackson.databind.ser.std.ToStringSerializerBase
    public final String o(Object obj) {
        return obj.toString();
    }
}
