package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

@CheckReturnValue
/* loaded from: classes.dex */
final class ManifestSchemaFactory implements SchemaFactory {
    public static final AnonymousClass1 b = new AnonymousClass1();

    /* renamed from: a, reason: collision with root package name */
    public final CompositeMessageInfoFactory f2654a;

    /* renamed from: androidx.datastore.preferences.protobuf.ManifestSchemaFactory$1, reason: invalid class name */
    public class AnonymousClass1 implements MessageInfoFactory {
        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public final MessageInfo a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public final boolean b(Class cls) {
            return false;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.ManifestSchemaFactory$2, reason: invalid class name */
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
        public MessageInfoFactory[] f2655a;

        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public final MessageInfo a(Class cls) {
            for (MessageInfoFactory messageInfoFactory : this.f2655a) {
                if (messageInfoFactory.b(cls)) {
                    return messageInfoFactory.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }

        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public final boolean b(Class cls) {
            for (MessageInfoFactory messageInfoFactory : this.f2655a) {
                if (messageInfoFactory.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public ManifestSchemaFactory() {
        MessageInfoFactory messageInfoFactory;
        Protobuf protobuf = Protobuf.c;
        try {
            messageInfoFactory = (MessageInfoFactory) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            messageInfoFactory = b;
        }
        MessageInfoFactory[] messageInfoFactoryArr = {GeneratedMessageInfoFactory.f2643a, messageInfoFactory};
        CompositeMessageInfoFactory compositeMessageInfoFactory = new CompositeMessageInfoFactory();
        compositeMessageInfoFactory.f2655a = messageInfoFactoryArr;
        Charset charset = Internal.f2648a;
        this.f2654a = compositeMessageInfoFactory;
    }
}
