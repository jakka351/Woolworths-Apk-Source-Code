package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.util.ByteBufferBackedInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class ByteBufferSerializer extends StdScalarSerializer<ByteBuffer> {
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (byteBuffer.hasArray()) {
            int iPosition = byteBuffer.position();
            byte[] bArrArray = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset() + iPosition;
            int iLimit = byteBuffer.limit() - iPosition;
            jsonGenerator.getClass();
            jsonGenerator.x(Base64Variants.b, bArrArray, iArrayOffset, iLimit);
            return;
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        if (byteBufferAsReadOnlyBuffer.position() > 0) {
            byteBufferAsReadOnlyBuffer.rewind();
        }
        ByteBufferBackedInputStream byteBufferBackedInputStream = new ByteBufferBackedInputStream(byteBufferAsReadOnlyBuffer);
        int iRemaining = byteBufferAsReadOnlyBuffer.remaining();
        jsonGenerator.getClass();
        jsonGenerator.v(Base64Variants.b, byteBufferBackedInputStream, iRemaining);
        byteBufferBackedInputStream.close();
    }
}
