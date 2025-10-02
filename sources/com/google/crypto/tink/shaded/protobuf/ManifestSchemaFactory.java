package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
final class ManifestSchemaFactory implements SchemaFactory {
    public static final AnonymousClass1 b = new AnonymousClass1();

    /* renamed from: a, reason: collision with root package name */
    public final CompositeMessageInfoFactory f15106a;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.ManifestSchemaFactory$1, reason: invalid class name */
    public class AnonymousClass1 implements MessageInfoFactory {
        @Override // com.google.crypto.tink.shaded.protobuf.MessageInfoFactory
        public final MessageInfo a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageInfoFactory
        public final boolean b(Class cls) {
            return false;
        }
    }

    public static class CompositeMessageInfoFactory implements MessageInfoFactory {

        /* renamed from: a, reason: collision with root package name */
        public MessageInfoFactory[] f15107a;

        @Override // com.google.crypto.tink.shaded.protobuf.MessageInfoFactory
        public final MessageInfo a(Class cls) {
            for (MessageInfoFactory messageInfoFactory : this.f15107a) {
                if (messageInfoFactory.b(cls)) {
                    return messageInfoFactory.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageInfoFactory
        public final boolean b(Class cls) {
            for (MessageInfoFactory messageInfoFactory : this.f15107a) {
                if (messageInfoFactory.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public ManifestSchemaFactory() {
        MessageInfoFactory messageInfoFactory;
        try {
            messageInfoFactory = (MessageInfoFactory) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            messageInfoFactory = b;
        }
        MessageInfoFactory[] messageInfoFactoryArr = {GeneratedMessageInfoFactory.f15099a, messageInfoFactory};
        CompositeMessageInfoFactory compositeMessageInfoFactory = new CompositeMessageInfoFactory();
        compositeMessageInfoFactory.f15107a = messageInfoFactoryArr;
        Charset charset = Internal.f15103a;
        this.f15106a = compositeMessageInfoFactory;
    }
}
