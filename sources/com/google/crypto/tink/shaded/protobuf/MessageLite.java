package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractMessageLite;

/* loaded from: classes.dex */
public interface MessageLite extends MessageLiteOrBuilder {

    public interface Builder extends MessageLiteOrBuilder, Cloneable {
        AbstractMessageLite.Builder W0();

        Builder Y1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        AbstractMessageLite.Builder a1(ByteString byteString, ExtensionRegistryLite extensionRegistryLite);

        AbstractMessageLite.Builder f2(MessageLite messageLite);

        MessageLite l();

        GeneratedMessageLite p1();
    }

    int getSerializedSize();

    Builder newBuilderForType();

    Builder toBuilder();

    byte[] toByteArray();

    ByteString toByteString();

    void writeTo(CodedOutputStream codedOutputStream);
}
