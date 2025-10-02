package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* loaded from: classes.dex */
class GeneratedMessageInfoFactory implements MessageInfoFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final GeneratedMessageInfoFactory f2643a = new GeneratedMessageInfoFactory();

    @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
    public final MessageInfo a(Class cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (MessageInfo) GeneratedMessageLite.j(cls.asSubclass(GeneratedMessageLite.class)).h(GeneratedMessageLite.MethodToInvoke.f, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
    public final boolean b(Class cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}
