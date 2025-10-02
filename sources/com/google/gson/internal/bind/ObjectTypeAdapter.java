package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.ToNumberPolicy;
import com.google.gson.ToNumberStrategy;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class ObjectTypeAdapter extends TypeAdapter<Object> {
    public static final TypeAdapterFactory c = new AnonymousClass1(ToNumberPolicy.d);

    /* renamed from: a, reason: collision with root package name */
    public final Gson f15947a;
    public final ToNumberStrategy b;

    /* renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$1, reason: invalid class name */
    class AnonymousClass1 implements TypeAdapterFactory {
        public final /* synthetic */ ToNumberStrategy d;

        public AnonymousClass1(ToNumberStrategy toNumberStrategy) {
            this.d = toNumberStrategy;
        }

        @Override // com.google.gson.TypeAdapterFactory
        public final TypeAdapter a(Gson gson, TypeToken typeToken) {
            if (typeToken.getRawType() == Object.class) {
                return new ObjectTypeAdapter(gson, this.d);
            }
            return null;
        }
    }

    /* renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$2, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15948a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f15948a = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15948a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15948a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15948a[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15948a[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15948a[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ObjectTypeAdapter(Gson gson, ToNumberStrategy toNumberStrategy) {
        this.f15947a = gson;
        this.b = toNumberStrategy;
    }

    public static TypeAdapterFactory a(ToNumberStrategy toNumberStrategy) {
        return toNumberStrategy == ToNumberPolicy.d ? c : new AnonymousClass1(toNumberStrategy);
    }

    public static Serializable c(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i = AnonymousClass2.f15948a[jsonToken.ordinal()];
        if (i == 1) {
            jsonReader.beginArray();
            return new ArrayList();
        }
        if (i != 2) {
            return null;
        }
        jsonReader.beginObject();
        return new LinkedTreeMap();
    }

    public final Serializable b(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i = AnonymousClass2.f15948a[jsonToken.ordinal()];
        if (i == 3) {
            return jsonReader.nextString();
        }
        if (i == 4) {
            return this.b.a(jsonReader);
        }
        if (i == 5) {
            return Boolean.valueOf(jsonReader.nextBoolean());
        }
        if (i == 6) {
            jsonReader.nextNull();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + jsonToken);
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        Object objC = c(jsonReader, jsonTokenPeek);
        if (objC == null) {
            return b(jsonReader, jsonTokenPeek);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (jsonReader.hasNext()) {
                String strNextName = objC instanceof Map ? jsonReader.nextName() : null;
                JsonToken jsonTokenPeek2 = jsonReader.peek();
                Serializable serializableC = c(jsonReader, jsonTokenPeek2);
                boolean z = serializableC != null;
                if (serializableC == null) {
                    serializableC = b(jsonReader, jsonTokenPeek2);
                }
                if (objC instanceof List) {
                    ((List) objC).add(serializableC);
                } else {
                    ((Map) objC).put(strNextName, serializableC);
                }
                if (z) {
                    arrayDeque.addLast(objC);
                    objC = serializableC;
                }
            } else {
                if (objC instanceof List) {
                    jsonReader.endArray();
                } else {
                    jsonReader.endObject();
                }
                if (arrayDeque.isEmpty()) {
                    return objC;
                }
                objC = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        TypeAdapter typeAdapterG = this.f15947a.g(TypeToken.get((Class) obj.getClass()));
        if (!(typeAdapterG instanceof ObjectTypeAdapter)) {
            typeAdapterG.write(jsonWriter, obj);
        } else {
            jsonWriter.beginObject();
            jsonWriter.endObject();
        }
    }
}
