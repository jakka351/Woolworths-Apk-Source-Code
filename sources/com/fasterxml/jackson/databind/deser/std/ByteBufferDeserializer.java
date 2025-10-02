package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.ByteBufferBackedOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class ByteBufferDeserializer extends StdScalarDeserializer<ByteBuffer> {
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) {
        jsonParser.getClass();
        return ByteBuffer.wrap(jsonParser.h(Base64Variants.b));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final Object f(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        ByteBufferBackedOutputStream byteBufferBackedOutputStream = new ByteBufferBackedOutputStream(byteBuffer);
        jsonParser.P1(deserializationContext.f.e.j, byteBufferBackedOutputStream);
        byteBufferBackedOutputStream.close();
        return byteBuffer;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final LogicalType n() {
        return LogicalType.n;
    }
}
