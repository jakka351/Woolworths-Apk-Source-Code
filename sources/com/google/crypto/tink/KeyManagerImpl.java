package com.google.crypto.tink;

import YU.a;
import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.security.GeneralSecurityException;

@Alpha
/* loaded from: classes.dex */
public class KeyManagerImpl<PrimitiveT, KeyProtoT extends MessageLite> implements KeyManager<PrimitiveT> {

    /* renamed from: a, reason: collision with root package name */
    public final KeyTypeManager f14971a;
    public final Class b;

    /* loaded from: classes6.dex */
    public static class KeyFactoryHelper<KeyFormatProtoT extends MessageLite, KeyProtoT extends MessageLite> {

        /* renamed from: a, reason: collision with root package name */
        public final KeyTypeManager.KeyFactory f14972a;

        public KeyFactoryHelper(KeyTypeManager.KeyFactory keyFactory) {
            this.f14972a = keyFactory;
        }

        public final MessageLite a(ByteString byteString) {
            KeyTypeManager.KeyFactory keyFactory = this.f14972a;
            MessageLite messageLiteC = keyFactory.c(byteString);
            keyFactory.d(messageLiteC);
            return (MessageLite) keyFactory.a(messageLiteC);
        }
    }

    public KeyManagerImpl(KeyTypeManager keyTypeManager, Class cls) {
        if (!keyTypeManager.b.keySet().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(a.i("Given internalKeyMananger ", keyTypeManager.toString(), " does not support primitive class ", cls.getName()));
        }
        this.f14971a = keyTypeManager;
        this.b = cls;
    }

    @Override // com.google.crypto.tink.KeyManager
    public final Object a(ByteString byteString) throws GeneralSecurityException {
        KeyTypeManager keyTypeManager = this.f14971a;
        try {
            MessageLite messageLiteE = keyTypeManager.e(byteString);
            Class cls = this.b;
            if (Void.class.equals(cls)) {
                throw new GeneralSecurityException("Cannot create a primitive for Void");
            }
            keyTypeManager.f(messageLiteE);
            return keyTypeManager.b(messageLiteE, cls);
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(keyTypeManager.f14975a.getName()), e);
        }
    }

    public final KeyData b(ByteString byteString) throws GeneralSecurityException {
        KeyTypeManager keyTypeManager = this.f14971a;
        try {
            MessageLite messageLiteA = new KeyFactoryHelper(keyTypeManager.c()).a(byteString);
            KeyData.Builder builderNewBuilder = KeyData.newBuilder();
            builderNewBuilder.o(keyTypeManager.a());
            builderNewBuilder.p(messageLiteA.toByteString());
            builderNewBuilder.m(keyTypeManager.d());
            return (KeyData) builderNewBuilder.p1();
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }
}
