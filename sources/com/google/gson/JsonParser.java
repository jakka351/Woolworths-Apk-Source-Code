package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;

/* loaded from: classes6.dex */
public final class JsonParser {
    public static JsonElement a(JsonReader jsonReader) {
        boolean zIsLenient = jsonReader.isLenient();
        jsonReader.setLenient(true);
        try {
            try {
                return Streams.a(jsonReader);
            } catch (OutOfMemoryError e) {
                throw new JsonParseException("Failed parsing JSON source: " + jsonReader + " to Json", e);
            } catch (StackOverflowError e2) {
                throw new JsonParseException("Failed parsing JSON source: " + jsonReader + " to Json", e2);
            }
        } finally {
            jsonReader.setLenient(zIsLenient);
        }
    }
}
