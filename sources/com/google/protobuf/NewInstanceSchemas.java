package com.google.protobuf;

@CheckReturnValue
/* loaded from: classes.dex */
final class NewInstanceSchemas {

    /* renamed from: a, reason: collision with root package name */
    public static final NewInstanceSchema f16075a;
    public static final NewInstanceSchemaLite b;

    static {
        NewInstanceSchema newInstanceSchema = null;
        try {
            newInstanceSchema = (NewInstanceSchema) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f16075a = newInstanceSchema;
        b = new NewInstanceSchemaLite();
    }
}
