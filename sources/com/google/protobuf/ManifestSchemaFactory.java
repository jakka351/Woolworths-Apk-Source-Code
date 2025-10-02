package com.google.protobuf;

import java.nio.charset.Charset;

@CheckReturnValue
/* loaded from: classes.dex */
final class ManifestSchemaFactory implements SchemaFactory {
    public static final AnonymousClass1 b = new AnonymousClass1();

    /* renamed from: a, reason: collision with root package name */
    public final CompositeMessageInfoFactory f16063a;

    /* renamed from: com.google.protobuf.ManifestSchemaFactory$1, reason: invalid class name */
    public class AnonymousClass1 implements MessageInfoFactory {
        @Override // com.google.protobuf.MessageInfoFactory
        public final MessageInfo a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.protobuf.MessageInfoFactory
        public final boolean b(Class cls) {
            return false;
        }
    }

    /* renamed from: com.google.protobuf.ManifestSchemaFactory$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static {
            try {
                new int[ProtoSyntax.values().length][1] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static class CompositeMessageInfoFactory implements MessageInfoFactory {

        /* renamed from: a, reason: collision with root package name */
        public MessageInfoFactory[] f16064a;

        @Override // com.google.protobuf.MessageInfoFactory
        public final MessageInfo a(Class cls) {
            for (MessageInfoFactory messageInfoFactory : this.f16064a) {
                if (messageInfoFactory.b(cls)) {
                    return messageInfoFactory.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }

        @Override // com.google.protobuf.MessageInfoFactory
        public final boolean b(Class cls) {
            for (MessageInfoFactory messageInfoFactory : this.f16064a) {
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
            messageInfoFactory = (MessageInfoFactory) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            messageInfoFactory = b;
        }
        MessageInfoFactory[] messageInfoFactoryArr = {GeneratedMessageInfoFactory.f16053a, messageInfoFactory};
        CompositeMessageInfoFactory compositeMessageInfoFactory = new CompositeMessageInfoFactory();
        compositeMessageInfoFactory.f16064a = messageInfoFactoryArr;
        Charset charset = Internal.f16059a;
        this.f16063a = compositeMessageInfoFactory;
    }
}
