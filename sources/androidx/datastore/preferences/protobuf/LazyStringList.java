package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: classes.dex */
public interface LazyStringList extends ProtocolStringList {
    void B0(ByteString byteString);

    List e();

    Object getRaw(int i);
}
