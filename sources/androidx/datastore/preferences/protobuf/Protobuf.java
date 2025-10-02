package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

@CheckReturnValue
/* loaded from: classes.dex */
final class Protobuf {
    public static final Protobuf c = new Protobuf();
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final ManifestSchemaFactory f2668a = new ManifestSchemaFactory();

    public final Schema a(Class cls) {
        ExtensionSchema extensionSchema;
        Schema schemaX;
        Class cls2;
        Internal.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        Schema schema = (Schema) concurrentHashMap.get(cls);
        if (schema != null) {
            return schema;
        }
        ManifestSchemaFactory manifestSchemaFactory = this.f2668a;
        manifestSchemaFactory.getClass();
        Class cls3 = SchemaUtil.f2670a;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = SchemaUtil.f2670a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        MessageInfo messageInfoA = manifestSchemaFactory.f2654a.a(cls);
        if (messageInfoA.a()) {
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                schemaX = MessageSetSchema.i(SchemaUtil.c, ExtensionSchemas.f2635a, messageInfoA.b());
            } else {
                UnknownFieldSchema unknownFieldSchema = SchemaUtil.b;
                ExtensionSchema extensionSchema2 = ExtensionSchemas.b;
                if (extensionSchema2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                schemaX = MessageSetSchema.i(unknownFieldSchema, extensionSchema2, messageInfoA.b());
            }
        } else if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            NewInstanceSchemaLite newInstanceSchemaLite = NewInstanceSchemas.b;
            ListFieldSchemaLite listFieldSchemaLite = ListFieldSchemas.b;
            UnknownFieldSetLiteSchema unknownFieldSetLiteSchema = SchemaUtil.c;
            ExtensionSchemaLite extensionSchemaLite = messageInfoA.c().ordinal() != 1 ? ExtensionSchemas.f2635a : null;
            MapFieldSchemaLite mapFieldSchemaLite = MapFieldSchemas.b;
            if (!(messageInfoA instanceof RawMessageInfo)) {
                int[] iArr = MessageSchema.p;
                throw null;
            }
            schemaX = MessageSchema.x((RawMessageInfo) messageInfoA, newInstanceSchemaLite, listFieldSchemaLite, unknownFieldSetLiteSchema, extensionSchemaLite, mapFieldSchemaLite);
        } else {
            NewInstanceSchema newInstanceSchema = NewInstanceSchemas.f2666a;
            ListFieldSchema listFieldSchema = ListFieldSchemas.f2652a;
            UnknownFieldSchema unknownFieldSchema2 = SchemaUtil.b;
            if (messageInfoA.c().ordinal() != 1) {
                ExtensionSchema extensionSchema3 = ExtensionSchemas.b;
                if (extensionSchema3 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                extensionSchema = extensionSchema3;
            } else {
                extensionSchema = null;
            }
            MapFieldSchema mapFieldSchema = MapFieldSchemas.f2659a;
            if (!(messageInfoA instanceof RawMessageInfo)) {
                int[] iArr2 = MessageSchema.p;
                throw null;
            }
            schemaX = MessageSchema.x((RawMessageInfo) messageInfoA, newInstanceSchema, listFieldSchema, unknownFieldSchema2, extensionSchema, mapFieldSchema);
        }
        Schema schema2 = (Schema) concurrentHashMap.putIfAbsent(cls, schemaX);
        return schema2 != null ? schema2 : schemaX;
    }
}
