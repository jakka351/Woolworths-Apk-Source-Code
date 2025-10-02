package com.google.protobuf;

import com.google.protobuf.ArrayDecoders;

@CheckReturnValue
/* loaded from: classes.dex */
interface Schema<T> {
    void a(Object obj, Object obj2);

    boolean b(Object obj);

    void c(Object obj);

    void d(Object obj, Writer writer);

    int e(AbstractMessageLite abstractMessageLite);

    void f(Object obj, byte[] bArr, int i, int i2, ArrayDecoders.Registers registers);

    int g(GeneratedMessageLite generatedMessageLite);

    void h(Object obj, Reader reader, ExtensionRegistryLite extensionRegistryLite);

    boolean i(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2);

    Object newInstance();
}
