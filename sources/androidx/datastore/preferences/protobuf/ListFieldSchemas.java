package androidx.datastore.preferences.protobuf;

@CheckReturnValue
/* loaded from: classes.dex */
final class ListFieldSchemas {

    /* renamed from: a, reason: collision with root package name */
    public static final ListFieldSchema f2652a;
    public static final ListFieldSchemaLite b;

    static {
        Protobuf protobuf = Protobuf.c;
        ListFieldSchema listFieldSchema = null;
        try {
            listFieldSchema = (ListFieldSchema) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f2652a = listFieldSchema;
        b = new ListFieldSchemaLite();
    }
}
