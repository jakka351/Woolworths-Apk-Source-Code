package com.google.gson;

/* loaded from: classes6.dex */
public final class JsonNull extends JsonElement {
    public static final JsonNull d = new JsonNull();

    public final boolean equals(Object obj) {
        return obj instanceof JsonNull;
    }

    public final int hashCode() {
        return JsonNull.class.hashCode();
    }
}
