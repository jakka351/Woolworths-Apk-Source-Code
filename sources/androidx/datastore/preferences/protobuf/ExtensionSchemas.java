package androidx.datastore.preferences.protobuf;

@CheckReturnValue
/* loaded from: classes.dex */
final class ExtensionSchemas {

    /* renamed from: a, reason: collision with root package name */
    public static final ExtensionSchemaLite f2635a = new ExtensionSchemaLite();
    public static final ExtensionSchema b;

    static {
        Protobuf protobuf = Protobuf.c;
        ExtensionSchema extensionSchema = null;
        try {
            extensionSchema = (ExtensionSchema) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = extensionSchema;
    }
}
