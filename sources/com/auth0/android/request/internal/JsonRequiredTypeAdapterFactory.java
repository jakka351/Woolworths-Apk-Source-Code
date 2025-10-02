package com.auth0.android.request.internal;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
class JsonRequiredTypeAdapterFactory implements TypeAdapterFactory {
    @Override // com.google.gson.TypeAdapterFactory
    public final TypeAdapter a(Gson gson, TypeToken typeToken) {
        final TypeAdapter typeAdapterH = gson.h(this, typeToken);
        return new TypeAdapter<Object>() { // from class: com.auth0.android.request.internal.JsonRequiredTypeAdapterFactory.1
            @Override // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader) throws SecurityException {
                Object obj = typeAdapterH.read(jsonReader);
                for (Field field : obj.getClass().getDeclaredFields()) {
                    if (field != null && field.getAnnotation(JsonRequired.class) != null) {
                        try {
                            field.setAccessible(true);
                            if (field.get(obj) == null) {
                                throw new JsonParseException("Missing required attribute " + field.getName());
                            }
                        } catch (IllegalAccessException unused) {
                            throw new JsonParseException(YU.a.A("Missing required attribute ", field.getName()));
                        }
                    }
                }
                return obj;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Object obj) {
                typeAdapterH.write(jsonWriter, obj);
            }
        }.nullSafe();
    }
}
