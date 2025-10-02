package io.grpc.internal;

import com.google.common.base.Preconditions;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
public final class JsonParser {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f24032a = Logger.getLogger(JsonParser.class.getName());

    /* renamed from: io.grpc.internal.JsonParser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24033a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f24033a = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24033a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24033a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24033a[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24033a[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24033a[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static Object a(JsonReader jsonReader) throws IOException {
        Preconditions.q("unexpected end of JSON", jsonReader.hasNext());
        switch (AnonymousClass1.f24033a[jsonReader.peek().ordinal()]) {
            case 1:
                jsonReader.beginArray();
                ArrayList arrayList = new ArrayList();
                while (jsonReader.hasNext()) {
                    arrayList.add(a(jsonReader));
                }
                Preconditions.q("Bad token: " + jsonReader.getPath(), jsonReader.peek() == JsonToken.END_ARRAY);
                jsonReader.endArray();
                return Collections.unmodifiableList(arrayList);
            case 2:
                jsonReader.beginObject();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (jsonReader.hasNext()) {
                    linkedHashMap.put(jsonReader.nextName(), a(jsonReader));
                }
                Preconditions.q("Bad token: " + jsonReader.getPath(), jsonReader.peek() == JsonToken.END_OBJECT);
                jsonReader.endObject();
                return Collections.unmodifiableMap(linkedHashMap);
            case 3:
                return jsonReader.nextString();
            case 4:
                return Double.valueOf(jsonReader.nextDouble());
            case 5:
                return Boolean.valueOf(jsonReader.nextBoolean());
            case 6:
                jsonReader.nextNull();
                return null;
            default:
                throw new IllegalStateException("Bad token: " + jsonReader.getPath());
        }
    }
}
