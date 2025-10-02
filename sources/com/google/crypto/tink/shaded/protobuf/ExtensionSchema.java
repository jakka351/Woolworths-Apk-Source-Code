package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.FieldSet;
import com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import java.util.Map;

/* loaded from: classes.dex */
abstract class ExtensionSchema<T extends FieldSet.FieldDescriptorLite<T>> {
    public abstract int a(Map.Entry entry);

    public abstract GeneratedMessageLite.GeneratedExtension b(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i);

    public abstract FieldSet c(Object obj);

    public abstract FieldSet d(Object obj);

    public abstract boolean e(MessageLite messageLite);

    public abstract void f(Object obj);

    public abstract Object g(Reader reader, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet, Object obj2, UnknownFieldSchema unknownFieldSchema);

    public abstract void h(Reader reader, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet);

    public abstract void i(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet);

    public abstract void j(Writer writer, Map.Entry entry);
}
