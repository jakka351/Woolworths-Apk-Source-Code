package com.google.gson;

import com.google.gson.internal.C$Gson$Preconditions;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class GsonBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final Excluder f15919a = Excluder.f;
    public final LongSerializationPolicy b = LongSerializationPolicy.d;
    public FieldNamingPolicy c = FieldNamingPolicy.d;
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public String g = null;
    public final int h = 2;
    public final int i = 2;
    public final boolean j = true;
    public final boolean k = true;
    public final ToNumberStrategy l = ToNumberPolicy.d;
    public final ToNumberStrategy m = ToNumberPolicy.e;
    public final LinkedList n = new LinkedList();

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b A[PHI: r4
  0x004b: PHI (r4v2 com.google.gson.TypeAdapterFactory) = (r4v1 com.google.gson.TypeAdapterFactory), (r4v6 com.google.gson.TypeAdapterFactory) binds: [B:15:0x005a, B:7:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.gson.Gson a() {
        /*
            r13 = this;
            java.util.ArrayList r9 = new java.util.ArrayList
            java.util.ArrayList r0 = r13.e
            int r1 = r0.size()
            java.util.ArrayList r2 = r13.f
            int r3 = r2.size()
            int r3 = r3 + r1
            int r3 = r3 + 3
            r9.<init>(r3)
            r9.addAll(r0)
            java.util.Collections.reverse(r9)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r2)
            java.util.Collections.reverse(r1)
            r9.addAll(r1)
            java.lang.String r1 = r13.g
            boolean r3 = com.google.gson.internal.sql.SqlTypesSupport.f15965a
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType r4 = com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType.b
            r5 = 0
            if (r1 == 0) goto L4d
            java.lang.String r6 = r1.trim()
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L4d
            com.google.gson.TypeAdapterFactory r4 = r4.b(r1)
            if (r3 == 0) goto L4b
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType r5 = com.google.gson.internal.sql.SqlTypesSupport.c
            com.google.gson.TypeAdapterFactory r5 = r5.b(r1)
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType r6 = com.google.gson.internal.sql.SqlTypesSupport.b
            com.google.gson.TypeAdapterFactory r1 = r6.b(r1)
            goto L68
        L4b:
            r1 = r5
            goto L68
        L4d:
            int r1 = r13.h
            r6 = 2
            if (r1 == r6) goto L73
            int r7 = r13.i
            if (r7 == r6) goto L73
            com.google.gson.TypeAdapterFactory r4 = r4.a(r1, r7)
            if (r3 == 0) goto L4b
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType r5 = com.google.gson.internal.sql.SqlTypesSupport.c
            com.google.gson.TypeAdapterFactory r5 = r5.a(r1, r7)
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType r6 = com.google.gson.internal.sql.SqlTypesSupport.b
            com.google.gson.TypeAdapterFactory r1 = r6.a(r1, r7)
        L68:
            r9.add(r4)
            if (r3 == 0) goto L73
            r9.add(r5)
            r9.add(r1)
        L73:
            r1 = r0
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r3 = r2
            com.google.gson.FieldNamingPolicy r2 = r13.c
            r4 = r3
            java.util.HashMap r3 = new java.util.HashMap
            java.util.HashMap r5 = r13.d
            r3.<init>(r5)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r1)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r4)
            java.util.ArrayList r12 = new java.util.ArrayList
            java.util.LinkedList r1 = r13.n
            r12.<init>(r1)
            com.google.gson.internal.Excluder r1 = r13.f15919a
            boolean r4 = r13.j
            boolean r5 = r13.k
            com.google.gson.LongSerializationPolicy r6 = r13.b
            com.google.gson.ToNumberStrategy r10 = r13.l
            com.google.gson.ToNumberStrategy r11 = r13.m
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.GsonBuilder.a():com.google.gson.Gson");
    }

    public final void b(Object obj, Type type) {
        Objects.requireNonNull(type);
        boolean z = obj instanceof JsonSerializer;
        C$Gson$Preconditions.a(z || (obj instanceof JsonDeserializer) || (obj instanceof InstanceCreator) || (obj instanceof TypeAdapter));
        if (obj instanceof InstanceCreator) {
            this.d.put(type, (InstanceCreator) obj);
        }
        ArrayList arrayList = this.e;
        if (z || (obj instanceof JsonDeserializer)) {
            arrayList.add(TreeTypeAdapter.b(TypeToken.get(type), obj));
        }
        if (obj instanceof TypeAdapter) {
            arrayList.add(TypeAdapters.a(TypeToken.get(type), (TypeAdapter) obj));
        }
    }
}
