package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.config.EncoderConfig;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ProtobufEncoder {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f15419a;
    public final HashMap b;
    public final ObjectEncoder c;

    public static final class Builder implements EncoderConfig<Builder> {
        public static final a d = new a(1);

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f15420a = new HashMap();
        public final HashMap b = new HashMap();
        public final a c = d;

        @Override // com.google.firebase.encoders.config.EncoderConfig
        public final EncoderConfig registerEncoder(Class cls, ObjectEncoder objectEncoder) {
            this.f15420a.put(cls, objectEncoder);
            this.b.remove(cls);
            return this;
        }
    }

    public ProtobufEncoder(HashMap map, HashMap map2, a aVar) {
        this.f15419a = map;
        this.b = map2;
        this.c = aVar;
    }

    public final void a(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = this.b;
        ObjectEncoder objectEncoder = this.c;
        HashMap map2 = this.f15419a;
        ProtobufDataEncoderContext protobufDataEncoderContext = new ProtobufDataEncoderContext(byteArrayOutputStream, map2, map, objectEncoder);
        if (obj == null) {
            return;
        }
        ObjectEncoder objectEncoder2 = (ObjectEncoder) map2.get(obj.getClass());
        if (objectEncoder2 != null) {
            objectEncoder2.encode(obj, protobufDataEncoderContext);
        } else {
            throw new EncodingException("No encoder for " + obj.getClass());
        }
    }
}
