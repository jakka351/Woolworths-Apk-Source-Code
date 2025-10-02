package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
final class Protobuf {
    public static final Protobuf c = new Protobuf();
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final ManifestSchemaFactory f15114a = new ManifestSchemaFactory();

    public final Schema a(Class cls) {
        Class cls2;
        Internal.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        Schema schemaX = (Schema) concurrentHashMap.get(cls);
        if (schemaX == null) {
            ManifestSchemaFactory manifestSchemaFactory = this.f15114a;
            manifestSchemaFactory.getClass();
            Class cls3 = SchemaUtil.f15116a;
            if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = SchemaUtil.f15116a) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            MessageInfo messageInfoA = manifestSchemaFactory.f15106a.a(cls);
            if (messageInfoA.a()) {
                schemaX = GeneratedMessageLite.class.isAssignableFrom(cls) ? MessageSetSchema.j(SchemaUtil.d, ExtensionSchemas.f15094a, messageInfoA.b()) : MessageSetSchema.j(SchemaUtil.b, ExtensionSchemas.a(), messageInfoA.b());
            } else {
                boolean zIsAssignableFrom = GeneratedMessageLite.class.isAssignableFrom(cls);
                ProtoSyntax protoSyntax = ProtoSyntax.d;
                schemaX = zIsAssignableFrom ? messageInfoA.c() == protoSyntax ? MessageSchema.x(messageInfoA, NewInstanceSchemas.b, ListFieldSchema.b, SchemaUtil.d, ExtensionSchemas.f15094a, MapFieldSchemas.b) : MessageSchema.x(messageInfoA, NewInstanceSchemas.b, ListFieldSchema.b, SchemaUtil.d, null, MapFieldSchemas.b) : messageInfoA.c() == protoSyntax ? MessageSchema.x(messageInfoA, NewInstanceSchemas.f15113a, ListFieldSchema.f15105a, SchemaUtil.b, ExtensionSchemas.a(), MapFieldSchemas.f15109a) : MessageSchema.x(messageInfoA, NewInstanceSchemas.f15113a, ListFieldSchema.f15105a, SchemaUtil.c, null, MapFieldSchemas.f15109a);
            }
            Schema schema = (Schema) concurrentHashMap.putIfAbsent(cls, schemaX);
            if (schema != null) {
                return schema;
            }
        }
        return schemaX;
    }

    public final Schema b(Object obj) {
        return a(obj.getClass());
    }
}
