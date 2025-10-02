package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.ArrayDecoders;

/* loaded from: classes.dex */
interface Schema<T> {
    void a(Object obj, byte[] bArr, int i, int i2, ArrayDecoders.Registers registers);

    boolean b(Object obj);

    void c(Object obj);

    boolean d(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2);

    int e(GeneratedMessageLite generatedMessageLite);

    int f(AbstractMessageLite abstractMessageLite);

    void g(Object obj, Reader reader, ExtensionRegistryLite extensionRegistryLite);

    void h(Object obj, Writer writer);

    void i(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2);

    Object newInstance();
}
