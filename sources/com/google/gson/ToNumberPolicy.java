package com.google.gson;

import YU.a;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class ToNumberPolicy implements ToNumberStrategy {
    public static final ToNumberPolicy d;
    public static final ToNumberPolicy e;
    public static final /* synthetic */ ToNumberPolicy[] f;

    static {
        ToNumberPolicy toNumberPolicy = new ToNumberPolicy() { // from class: com.google.gson.ToNumberPolicy.1
            @Override // com.google.gson.ToNumberStrategy
            public final Number a(JsonReader jsonReader) {
                return Double.valueOf(jsonReader.nextDouble());
            }
        };
        d = toNumberPolicy;
        ToNumberPolicy toNumberPolicy2 = new ToNumberPolicy() { // from class: com.google.gson.ToNumberPolicy.2
            @Override // com.google.gson.ToNumberStrategy
            public final Number a(JsonReader jsonReader) {
                return new LazilyParsedNumber(jsonReader.nextString());
            }
        };
        e = toNumberPolicy2;
        f = new ToNumberPolicy[]{toNumberPolicy, toNumberPolicy2, new ToNumberPolicy() { // from class: com.google.gson.ToNumberPolicy.3
            @Override // com.google.gson.ToNumberStrategy
            public final Number a(JsonReader jsonReader) throws IOException, NumberFormatException {
                String strNextString = jsonReader.nextString();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(strNextString));
                    } catch (NumberFormatException e2) {
                        StringBuilder sbU = a.u("Cannot parse ", strNextString, "; at path ");
                        sbU.append(jsonReader.getPreviousPath());
                        throw new JsonParseException(sbU.toString(), e2);
                    }
                } catch (NumberFormatException unused) {
                    Double dValueOf = Double.valueOf(strNextString);
                    if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                        if (!jsonReader.isLenient()) {
                            throw new MalformedJsonException("JSON forbids NaN and infinities: " + dValueOf + "; at path " + jsonReader.getPreviousPath());
                        }
                    }
                    return dValueOf;
                }
            }
        }, new ToNumberPolicy() { // from class: com.google.gson.ToNumberPolicy.4
            @Override // com.google.gson.ToNumberStrategy
            public final Number a(JsonReader jsonReader) throws IOException {
                String strNextString = jsonReader.nextString();
                try {
                    return new BigDecimal(strNextString);
                } catch (NumberFormatException e2) {
                    StringBuilder sbU = a.u("Cannot parse ", strNextString, "; at path ");
                    sbU.append(jsonReader.getPreviousPath());
                    throw new JsonParseException(sbU.toString(), e2);
                }
            }
        }};
    }

    public static ToNumberPolicy valueOf(String str) {
        return (ToNumberPolicy) Enum.valueOf(ToNumberPolicy.class, str);
    }

    public static ToNumberPolicy[] values() {
        return (ToNumberPolicy[]) f.clone();
    }
}
