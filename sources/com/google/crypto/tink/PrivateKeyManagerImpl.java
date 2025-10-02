package com.google.crypto.tink;

import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.shaded.protobuf.MessageLite;

@Alpha
/* loaded from: classes6.dex */
public class PrivateKeyManagerImpl<PrimitiveT, KeyProtoT extends MessageLite, PublicKeyProtoT extends MessageLite> extends KeyManagerImpl<PrimitiveT, KeyProtoT> implements PrivateKeyManager<PrimitiveT> {
    public PrivateKeyManagerImpl(PrivateKeyTypeManager privateKeyTypeManager, Class cls) {
        super(privateKeyTypeManager, cls);
    }
}
