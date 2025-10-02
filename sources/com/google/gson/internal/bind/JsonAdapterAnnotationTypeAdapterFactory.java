package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.reflect.TypeToken;

/* loaded from: classes.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements TypeAdapterFactory {
    public final ConstructorConstructor d;

    public JsonAdapterAnnotationTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
        this.d = constructorConstructor;
    }

    public static TypeAdapter b(ConstructorConstructor constructorConstructor, Gson gson, TypeToken typeToken, JsonAdapter jsonAdapter) {
        TypeAdapter typeAdapterA;
        Object objA = constructorConstructor.b(TypeToken.get(jsonAdapter.value())).a();
        boolean zNullSafe = jsonAdapter.nullSafe();
        if (objA instanceof TypeAdapter) {
            typeAdapterA = (TypeAdapter) objA;
        } else if (objA instanceof TypeAdapterFactory) {
            typeAdapterA = ((TypeAdapterFactory) objA).a(gson, typeToken);
        } else {
            boolean z = objA instanceof JsonSerializer;
            if (!z && !(objA instanceof JsonDeserializer)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objA.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            TreeTypeAdapter treeTypeAdapter = new TreeTypeAdapter(z ? (JsonSerializer) objA : null, objA instanceof JsonDeserializer ? (JsonDeserializer) objA : null, gson, typeToken, null, zNullSafe);
            zNullSafe = false;
            typeAdapterA = treeTypeAdapter;
        }
        return (typeAdapterA == null || !zNullSafe) ? typeAdapterA : typeAdapterA.nullSafe();
    }

    @Override // com.google.gson.TypeAdapterFactory
    public final TypeAdapter a(Gson gson, TypeToken typeToken) {
        JsonAdapter jsonAdapter = (JsonAdapter) typeToken.getRawType().getAnnotation(JsonAdapter.class);
        if (jsonAdapter == null) {
            return null;
        }
        return b(this.d, gson, typeToken, jsonAdapter);
    }
}
