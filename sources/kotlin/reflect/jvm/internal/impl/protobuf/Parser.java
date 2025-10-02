package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.ByteArrayInputStream;

/* loaded from: classes.dex */
public interface Parser<MessageType> {
    MessageLite a(ByteArrayInputStream byteArrayInputStream, ExtensionRegistryLite extensionRegistryLite);

    Object b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
}
