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
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes.dex */
final class SqlTimeTypeAdapter extends TypeAdapter<Time> {
    public static final TypeAdapterFactory b = new TypeAdapterFactory() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // com.google.gson.TypeAdapterFactory
        public final TypeAdapter a(Gson gson, TypeToken typeToken) {
            if (typeToken.getRawType() == Time.class) {
                return new SqlTimeTypeAdapter(0);
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f15963a;

    public /* synthetic */ SqlTimeTypeAdapter(int i) {
        this();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        Time time;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String strNextString = jsonReader.nextString();
        try {
            synchronized (this) {
                time = new Time(this.f15963a.parse(strNextString).getTime());
            }
            return time;
        } catch (ParseException e) {
            StringBuilder sbU = a.u("Failed parsing '", strNextString, "' as SQL Time; at path ");
            sbU.append(jsonReader.getPreviousPath());
            throw new JsonSyntaxException(sbU.toString(), e);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this) {
            str = this.f15963a.format((Date) time);
        }
        jsonWriter.value(str);
    }

    private SqlTimeTypeAdapter() {
        this.f15963a = new SimpleDateFormat("hh:mm:ss a");
    }
}
