package com.google.protobuf;

@CheckReturnValue
/* loaded from: classes.dex */
final class ExtensionSchemas {

    /* renamed from: a, reason: collision with root package name */
    public static final ExtensionSchemaLite f16045a = new ExtensionSchemaLite();
    public static final ExtensionSchema b;

    static {
        ExtensionSchema extensionSchema = null;
        try {
            extensionSchema = (ExtensionSchema) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = extensionSchema;
    }
}
