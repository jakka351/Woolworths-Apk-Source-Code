package androidx.datastore.preferences.protobuf;

@CheckReturnValue
/* loaded from: classes.dex */
final class MapFieldSchemas {

    /* renamed from: a, reason: collision with root package name */
    public static final MapFieldSchema f2659a;
    public static final MapFieldSchemaLite b;

    static {
        Protobuf protobuf = Protobuf.c;
        MapFieldSchema mapFieldSchema = null;
        try {
            mapFieldSchema = (MapFieldSchema) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f2659a = mapFieldSchema;
        b = new MapFieldSchemaLite();
    }
}
