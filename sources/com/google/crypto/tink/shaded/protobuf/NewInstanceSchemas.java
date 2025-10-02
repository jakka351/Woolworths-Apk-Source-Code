package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
final class NewInstanceSchemas {

    /* renamed from: a, reason: collision with root package name */
    public static final NewInstanceSchema f15113a;
    public static final NewInstanceSchemaLite b;

    static {
        NewInstanceSchema newInstanceSchema = null;
        try {
            newInstanceSchema = (NewInstanceSchema) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f15113a = newInstanceSchema;
        b = new NewInstanceSchemaLite();
    }
}
