package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLite;

/* loaded from: classes6.dex */
public abstract class AbstractParser<MessageType extends MessageLite> implements Parser<MessageType> {
    static {
        ExtensionRegistryLite.b();
    }

    @Override // com.google.protobuf.Parser
    public final GeneratedMessageLite a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        GeneratedMessageLite generatedMessageLiteI = GeneratedMessageLite.I(((GeneratedMessageLite.DefaultInstanceBasedParser) this).f16055a, codedInputStream, extensionRegistryLite);
        if (generatedMessageLiteI.isInitialized()) {
            return generatedMessageLiteI;
        }
        throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
    }
}
