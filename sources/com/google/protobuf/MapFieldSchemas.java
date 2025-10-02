package com.google.protobuf;

@CheckReturnValue
/* loaded from: classes.dex */
final class MapFieldSchemas {

    /* renamed from: a, reason: collision with root package name */
    public static final MapFieldSchema f16068a;
    public static final MapFieldSchemaLite b;

    static {
        MapFieldSchema mapFieldSchema = null;
        try {
            mapFieldSchema = (MapFieldSchema) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f16068a = mapFieldSchema;
        b = new MapFieldSchemaLite();
    }
}
