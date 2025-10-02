package com.apollographql.apollo.api.json;

import com.apollographql.apollo.api.json.JsonReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
/* renamed from: com.apollographql.apollo.api.json.-JsonReaders, reason: invalid class name */
/* loaded from: classes.dex */
public final class JsonReaders {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.apollographql.apollo.api.json.-JsonReaders$WhenMappings */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            try {
                iArr[9] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                JsonReader.Token token = JsonReader.Token.d;
                iArr[8] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                JsonReader.Token token2 = JsonReader.Token.d;
                iArr[7] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                JsonReader.Token token3 = JsonReader.Token.d;
                iArr[6] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                JsonReader.Token token4 = JsonReader.Token.d;
                iArr[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                JsonReader.Token token5 = JsonReader.Token.d;
                iArr[2] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                JsonReader.Token token6 = JsonReader.Token.d;
                iArr[0] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final BufferedSourceJsonReader a(BufferedSource bufferedSource) {
        Intrinsics.h(bufferedSource, "<this>");
        return new BufferedSourceJsonReader(bufferedSource);
    }

    public static final Object b(JsonReader jsonReader) {
        Intrinsics.h(jsonReader, "<this>");
        JsonReader.Token tokenPeek = jsonReader.peek();
        int iOrdinal = tokenPeek.ordinal();
        if (iOrdinal == 0) {
            jsonReader.y();
            ArrayList arrayList = new ArrayList();
            while (jsonReader.hasNext()) {
                arrayList.add(b(jsonReader));
            }
            jsonReader.w();
            return arrayList;
        }
        if (iOrdinal == 2) {
            jsonReader.G();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (jsonReader.hasNext()) {
                linkedHashMap.put(jsonReader.nextName(), b(jsonReader));
            }
            jsonReader.K();
            return linkedHashMap;
        }
        switch (iOrdinal) {
            case 5:
                return jsonReader.nextString();
            case 6:
            case 7:
                try {
                    try {
                        try {
                            return Integer.valueOf(jsonReader.nextInt());
                        } catch (Exception unused) {
                            return Long.valueOf(jsonReader.nextLong());
                        }
                    } catch (Exception unused2) {
                        return jsonReader.Q0();
                    }
                } catch (Exception unused3) {
                    return Double.valueOf(jsonReader.nextDouble());
                }
            case 8:
                return Boolean.valueOf(jsonReader.nextBoolean());
            case 9:
                jsonReader.nextNull();
                return null;
            default:
                throw new IllegalStateException(("unknown token " + tokenPeek).toString());
        }
    }
}
