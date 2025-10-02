package com.fasterxml.jackson.databind.node;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class JsonNodeType {
    public static final JsonNodeType d;
    public static final JsonNodeType e;
    public static final JsonNodeType f;
    public static final JsonNodeType g;
    public static final JsonNodeType h;
    public static final JsonNodeType i;
    public static final JsonNodeType j;
    public static final JsonNodeType k;
    public static final JsonNodeType l;
    public static final /* synthetic */ JsonNodeType[] m;

    static {
        JsonNodeType jsonNodeType = new JsonNodeType("ARRAY", 0);
        d = jsonNodeType;
        JsonNodeType jsonNodeType2 = new JsonNodeType("BINARY", 1);
        e = jsonNodeType2;
        JsonNodeType jsonNodeType3 = new JsonNodeType("BOOLEAN", 2);
        f = jsonNodeType3;
        JsonNodeType jsonNodeType4 = new JsonNodeType("MISSING", 3);
        g = jsonNodeType4;
        JsonNodeType jsonNodeType5 = new JsonNodeType("NULL", 4);
        h = jsonNodeType5;
        JsonNodeType jsonNodeType6 = new JsonNodeType("NUMBER", 5);
        i = jsonNodeType6;
        JsonNodeType jsonNodeType7 = new JsonNodeType("OBJECT", 6);
        j = jsonNodeType7;
        JsonNodeType jsonNodeType8 = new JsonNodeType("POJO", 7);
        k = jsonNodeType8;
        JsonNodeType jsonNodeType9 = new JsonNodeType("STRING", 8);
        l = jsonNodeType9;
        m = new JsonNodeType[]{jsonNodeType, jsonNodeType2, jsonNodeType3, jsonNodeType4, jsonNodeType5, jsonNodeType6, jsonNodeType7, jsonNodeType8, jsonNodeType9};
    }

    public static JsonNodeType valueOf(String str) {
        return (JsonNodeType) Enum.valueOf(JsonNodeType.class, str);
    }

    public static JsonNodeType[] values() {
        return (JsonNodeType[]) m.clone();
    }
}
