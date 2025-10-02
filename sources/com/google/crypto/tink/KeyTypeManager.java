package com.google.crypto.tink;

import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Alpha
/* loaded from: classes.dex */
public abstract class KeyTypeManager<KeyProtoT extends MessageLite> {

    /* renamed from: a, reason: collision with root package name */
    public final Class f14975a;
    public final Map b;
    public final Class c;

    /* loaded from: classes6.dex */
    public static abstract class KeyFactory<KeyFormatProtoT extends MessageLite, KeyT> {

        /* renamed from: a, reason: collision with root package name */
        public final Class f14976a;

        public KeyFactory(Class cls) {
            this.f14976a = cls;
        }

        public abstract Object a(MessageLite messageLite);

        public final Class b() {
            return this.f14976a;
        }

        public abstract MessageLite c(ByteString byteString);

        public abstract void d(MessageLite messageLite);
    }

    public static abstract class PrimitiveFactory<PrimitiveT, KeyT> {

        /* renamed from: a, reason: collision with root package name */
        public final Class f14977a;

        public PrimitiveFactory(Class cls) {
            this.f14977a = cls;
        }

        public abstract Object a(MessageLite messageLite);
    }

    public KeyTypeManager(Class cls, PrimitiveFactory... primitiveFactoryArr) {
        this.f14975a = cls;
        HashMap map = new HashMap();
        for (PrimitiveFactory primitiveFactory : primitiveFactoryArr) {
            Class cls2 = primitiveFactory.f14977a;
            if (map.containsKey(cls2)) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls2.getCanonicalName());
            }
            map.put(cls2, primitiveFactory);
        }
        if (primitiveFactoryArr.length > 0) {
            this.c = primitiveFactoryArr[0].f14977a;
        } else {
            this.c = Void.class;
        }
        this.b = Collections.unmodifiableMap(map);
    }

    public abstract String a();

    public final Object b(MessageLite messageLite, Class cls) {
        PrimitiveFactory primitiveFactory = (PrimitiveFactory) this.b.get(cls);
        if (primitiveFactory != null) {
            return primitiveFactory.a(messageLite);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public KeyFactory c() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract KeyData.KeyMaterialType d();

    public abstract MessageLite e(ByteString byteString);

    public abstract void f(MessageLite messageLite);
}
