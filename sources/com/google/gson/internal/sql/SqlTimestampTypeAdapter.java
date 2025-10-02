package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes.dex */
class SqlTimestampTypeAdapter extends TypeAdapter<Timestamp> {
    public static final TypeAdapterFactory b = new TypeAdapterFactory() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // com.google.gson.TypeAdapterFactory
        public final TypeAdapter a(Gson gson, TypeToken typeToken) {
            if (typeToken.getRawType() == Timestamp.class) {
                return new SqlTimestampTypeAdapter(gson.g(TypeToken.get(Date.class)));
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final TypeAdapter f15964a;

    public SqlTimestampTypeAdapter(TypeAdapter typeAdapter) {
        this.f15964a = typeAdapter;
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) {
        Date date = (Date) this.f15964a.read(jsonReader);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) {
        this.f15964a.write(jsonWriter, (Timestamp) obj);
    }
}
