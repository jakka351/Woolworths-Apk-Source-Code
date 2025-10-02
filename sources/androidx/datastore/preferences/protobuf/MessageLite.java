package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

@CheckReturnValue
/* loaded from: classes.dex */
public interface MessageLite extends MessageLiteOrBuilder {

    public interface Builder extends MessageLiteOrBuilder, Cloneable {
        MessageLite l();
    }

    void b(CodedOutputStream codedOutputStream);

    int getSerializedSize();

    GeneratedMessageLite.Builder newBuilderForType();

    GeneratedMessageLite.Builder toBuilder();

    ByteString toByteString();
}
