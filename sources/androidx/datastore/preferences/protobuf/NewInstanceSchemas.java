package androidx.datastore.preferences.protobuf;

@CheckReturnValue
/* loaded from: classes.dex */
final class NewInstanceSchemas {

    /* renamed from: a, reason: collision with root package name */
    public static final NewInstanceSchema f2666a;
    public static final NewInstanceSchemaLite b;

    static {
        Protobuf protobuf = Protobuf.c;
        NewInstanceSchema newInstanceSchema = null;
        try {
            newInstanceSchema = (NewInstanceSchema) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f2666a = newInstanceSchema;
        b = new NewInstanceSchemaLite();
    }
}
