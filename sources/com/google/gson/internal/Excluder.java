package com.google.gson.internal;

import com.google.gson.ExclusionStrategy;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class Excluder implements TypeAdapterFactory, Cloneable {
    public static final Excluder f = new Excluder();
    public final List d;
    public final List e;

    public Excluder() {
        List list = Collections.EMPTY_LIST;
        this.d = list;
        this.e = list;
    }

    public static boolean c(Class cls) {
        if (Enum.class.isAssignableFrom(cls) || (cls.getModifiers() & 8) != 0) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    @Override // com.google.gson.TypeAdapterFactory
    public final TypeAdapter a(final Gson gson, final TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        boolean zC = c(rawType);
        final boolean z = zC || b(rawType, true);
        final boolean z2 = zC || b(rawType, false);
        if (z || z2) {
            return new TypeAdapter<Object>() { // from class: com.google.gson.internal.Excluder.1

                /* renamed from: a, reason: collision with root package name */
                public TypeAdapter f15934a;

                @Override // com.google.gson.TypeAdapter
                public final Object read(JsonReader jsonReader) throws IOException {
                    if (z2) {
                        jsonReader.skipValue();
                        return null;
                    }
                    TypeAdapter typeAdapterH = this.f15934a;
                    if (typeAdapterH == null) {
                        typeAdapterH = gson.h(Excluder.this, typeToken);
                        this.f15934a = typeAdapterH;
                    }
                    return typeAdapterH.read(jsonReader);
                }

                @Override // com.google.gson.TypeAdapter
                public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
                    if (z) {
                        jsonWriter.nullValue();
                        return;
                    }
                    TypeAdapter typeAdapterH = this.f15934a;
                    if (typeAdapterH == null) {
                        typeAdapterH = gson.h(Excluder.this, typeToken);
                        this.f15934a = typeAdapterH;
                    }
                    typeAdapterH.write(jsonWriter, obj);
                }
            };
        }
        return null;
    }

    public final boolean b(Class cls, boolean z) {
        Iterator it = (z ? this.d : this.e).iterator();
        while (it.hasNext()) {
            if (((ExclusionStrategy) it.next()).a()) {
                return true;
            }
        }
        return false;
    }

    public final Object clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
