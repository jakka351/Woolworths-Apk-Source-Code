package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
final class MapFieldSchemas {

    /* renamed from: a, reason: collision with root package name */
    public static final MapFieldSchema f15109a;
    public static final MapFieldSchemaLite b;

    static {
        MapFieldSchema mapFieldSchema = null;
        try {
            mapFieldSchema = (MapFieldSchema) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f15109a = mapFieldSchema;
        b = new MapFieldSchemaLite();
    }
}
