package kotlin.reflect.jvm.internal.impl.protobuf;

/* loaded from: classes.dex */
public interface MessageLite extends MessageLiteOrBuilder {

    public interface Builder extends Cloneable, MessageLiteOrBuilder {
        Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        MessageLite build();
    }

    void a(CodedOutputStream codedOutputStream);

    int getSerializedSize();

    Builder newBuilderForType();

    Builder toBuilder();
}
