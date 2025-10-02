package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
class GeneratedMessageInfoFactory implements MessageInfoFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final GeneratedMessageInfoFactory f15099a = new GeneratedMessageInfoFactory();

    @Override // com.google.crypto.tink.shaded.protobuf.MessageInfoFactory
    public final MessageInfo a(Class cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (MessageInfo) GeneratedMessageLite.getDefaultInstance(cls.asSubclass(GeneratedMessageLite.class)).buildMessageInfo();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageInfoFactory
    public final boolean b(Class cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}
