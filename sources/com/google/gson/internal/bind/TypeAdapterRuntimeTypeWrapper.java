package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Gson f15953a;
    public final TypeAdapter b;
    public final Type c;

    public TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter typeAdapter, Type type) {
        this.f15953a = gson;
        this.b = typeAdapter;
        this.c = type;
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) {
        return this.b.read(jsonReader);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.reflect.Type] */
    @Override // com.google.gson.TypeAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void write(com.google.gson.stream.JsonWriter r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.reflect.Type r0 = r4.c
            if (r6 == 0) goto L11
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 != 0) goto Lc
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L11
        Lc:
            java.lang.Class r1 = r6.getClass()
            goto L12
        L11:
            r1 = r0
        L12:
            com.google.gson.TypeAdapter r2 = r4.b
            if (r1 == r0) goto L3c
            com.google.gson.Gson r0 = r4.f15953a
            com.google.gson.reflect.TypeToken r1 = com.google.gson.reflect.TypeToken.get(r1)
            com.google.gson.TypeAdapter r0 = r0.g(r1)
            boolean r1 = r0 instanceof com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
            if (r1 != 0) goto L25
            goto L3b
        L25:
            r1 = r2
        L26:
            boolean r3 = r1 instanceof com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
            if (r3 == 0) goto L36
            r3 = r1
            com.google.gson.internal.bind.SerializationDelegatingTypeAdapter r3 = (com.google.gson.internal.bind.SerializationDelegatingTypeAdapter) r3
            com.google.gson.TypeAdapter r3 = r3.a()
            if (r3 != r1) goto L34
            goto L36
        L34:
            r1 = r3
            goto L26
        L36:
            boolean r1 = r1 instanceof com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
            if (r1 != 0) goto L3b
            goto L3c
        L3b:
            r2 = r0
        L3c:
            r2.write(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper.write(com.google.gson.stream.JsonWriter, java.lang.Object):void");
    }
}
