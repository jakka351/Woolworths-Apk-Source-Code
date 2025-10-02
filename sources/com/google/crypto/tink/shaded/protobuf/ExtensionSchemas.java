package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes6.dex */
final class ExtensionSchemas {

    /* renamed from: a, reason: collision with root package name */
    public static final ExtensionSchemaLite f15094a = new ExtensionSchemaLite();
    public static final ExtensionSchema b;

    static {
        ExtensionSchema extensionSchema = null;
        try {
            extensionSchema = (ExtensionSchema) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = extensionSchema;
    }

    public static ExtensionSchema a() {
        ExtensionSchema extensionSchema = b;
        if (extensionSchema != null) {
            return extensionSchema;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
