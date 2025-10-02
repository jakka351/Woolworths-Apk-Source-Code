package com.google.gson.internal.sql;

import YU.a;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* loaded from: classes.dex */
final class SqlDateTypeAdapter extends TypeAdapter<Date> {
    public static final TypeAdapterFactory b = new TypeAdapterFactory() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // com.google.gson.TypeAdapterFactory
        public final TypeAdapter a(Gson gson, TypeToken typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new SqlDateTypeAdapter(0);
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f15962a;

    public /* synthetic */ SqlDateTypeAdapter(int i) {
        this();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        java.util.Date date;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String strNextString = jsonReader.nextString();
        try {
            synchronized (this) {
                date = this.f15962a.parse(strNextString);
            }
            return new Date(date.getTime());
        } catch (ParseException e) {
            StringBuilder sbU = a.u("Failed parsing '", strNextString, "' as SQL Date; at path ");
            sbU.append(jsonReader.getPreviousPath());
            throw new JsonSyntaxException(sbU.toString(), e);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this) {
            str = this.f15962a.format((java.util.Date) date);
        }
        jsonWriter.value(str);
    }

    private SqlDateTypeAdapter() {
        this.f15962a = new SimpleDateFormat("MMM d, yyyy");
    }
}
