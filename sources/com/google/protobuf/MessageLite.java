package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import java.io.OutputStream;

@CheckReturnValue
/* loaded from: classes.dex */
public interface MessageLite extends MessageLiteOrBuilder {

    public interface Builder extends MessageLiteOrBuilder, Cloneable {
        MessageLite l();
    }

    void c(CodedOutputStream codedOutputStream);

    int getSerializedSize();

    Parser j();

    GeneratedMessageLite.Builder newBuilderForType();

    GeneratedMessageLite.Builder toBuilder();

    byte[] toByteArray();

    ByteString toByteString();

    void writeTo(OutputStream outputStream);
}
