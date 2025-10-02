package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;

/* loaded from: classes.dex */
class GeneratedMessageInfoFactory implements MessageInfoFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final GeneratedMessageInfoFactory f16053a = new GeneratedMessageInfoFactory();

    @Override // com.google.protobuf.MessageInfoFactory
    public final MessageInfo a(Class cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (MessageInfo) GeneratedMessageLite.x(cls.asSubclass(GeneratedMessageLite.class)).s(GeneratedMessageLite.MethodToInvoke.f, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // com.google.protobuf.MessageInfoFactory
    public final boolean b(Class cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}
