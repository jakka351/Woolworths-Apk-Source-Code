package androidx.datastore.preferences.protobuf;

@CheckReturnValue
/* loaded from: classes.dex */
interface Schema<T> {
    void a(Object obj, Object obj2);

    boolean b(Object obj);

    void c(Object obj);

    int d(AbstractMessageLite abstractMessageLite);

    void e(Object obj, Writer writer);

    boolean f(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2);

    void g(Object obj, Reader reader, ExtensionRegistryLite extensionRegistryLite);

    int h(GeneratedMessageLite generatedMessageLite);

    Object newInstance();
}
