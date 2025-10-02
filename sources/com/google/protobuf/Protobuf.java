package com.google.protobuf;

import com.google.protobuf.ListFieldSchema;
import java.util.concurrent.ConcurrentHashMap;

@CheckReturnValue
/* loaded from: classes.dex */
final class Protobuf {
    public static final Protobuf c = new Protobuf();
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final ManifestSchemaFactory f16077a = new ManifestSchemaFactory();

    public final Schema a(Class cls) {
        Class cls2;
        Internal.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        Schema schemaA = (Schema) concurrentHashMap.get(cls);
        if (schemaA == null) {
            ManifestSchemaFactory manifestSchemaFactory = this.f16077a;
            manifestSchemaFactory.getClass();
            Class cls3 = SchemaUtil.f16080a;
            if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = SchemaUtil.f16080a) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
            }
            MessageInfo messageInfoA = manifestSchemaFactory.f16063a.a(cls);
            if (messageInfoA.a()) {
                if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                    schemaA = MessageSetSchema.j(SchemaUtil.c, ExtensionSchemas.f16045a, messageInfoA.b());
                } else {
                    UnknownFieldSchema unknownFieldSchema = SchemaUtil.b;
                    ExtensionSchema extensionSchema = ExtensionSchemas.b;
                    if (extensionSchema == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                    schemaA = MessageSetSchema.j(unknownFieldSchema, extensionSchema, messageInfoA.b());
                }
            } else if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                schemaA = messageInfoA.c().ordinal() != 1 ? MessageSchema.A(messageInfoA, NewInstanceSchemas.b, ListFieldSchema.b, SchemaUtil.c, ExtensionSchemas.f16045a, MapFieldSchemas.b) : MessageSchema.A(messageInfoA, NewInstanceSchemas.b, ListFieldSchema.b, SchemaUtil.c, null, MapFieldSchemas.b);
            } else if (messageInfoA.c().ordinal() != 1) {
                NewInstanceSchema newInstanceSchema = NewInstanceSchemas.f16075a;
                ListFieldSchema.ListFieldSchemaFull listFieldSchemaFull = ListFieldSchema.f16061a;
                UnknownFieldSchema unknownFieldSchema2 = SchemaUtil.b;
                ExtensionSchema extensionSchema2 = ExtensionSchemas.b;
                if (extensionSchema2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                schemaA = MessageSchema.A(messageInfoA, newInstanceSchema, listFieldSchemaFull, unknownFieldSchema2, extensionSchema2, MapFieldSchemas.f16068a);
            } else {
                schemaA = MessageSchema.A(messageInfoA, NewInstanceSchemas.f16075a, ListFieldSchema.f16061a, SchemaUtil.b, null, MapFieldSchemas.f16068a);
            }
            Schema schema = (Schema) concurrentHashMap.putIfAbsent(cls, schemaA);
            if (schema != null) {
                return schema;
            }
        }
        return schemaA;
    }

    public final Schema b(Object obj) {
        return a(obj.getClass());
    }
}
