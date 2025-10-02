package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.internal.InlineClassDescriptor;
import kotlinx.serialization.internal.InlineClassDescriptorKt;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.StringJsonLexer;
import kotlinx.serialization.json.internal.StringOpsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class JsonElementKt {

    /* renamed from: a, reason: collision with root package name */
    public static final InlineClassDescriptor f24841a = InlineClassDescriptorKt.a("kotlinx.serialization.json.JsonUnquotedLiteral", StringSerializer.f24821a);

    public static final JsonPrimitive a(Number number) {
        return number == null ? JsonNull.INSTANCE : new JsonLiteral(number, false, null);
    }

    public static final JsonPrimitive b(String str) {
        return str == null ? JsonNull.INSTANCE : new JsonLiteral(str, true, null);
    }

    public static final void c(String str, JsonElement jsonElement) {
        throw new IllegalArgumentException("Element " + Reflection.f24268a.b(jsonElement.getClass()) + " is not a " + str);
    }

    public static final Boolean d(JsonPrimitive jsonPrimitive) {
        Intrinsics.h(jsonPrimitive, "<this>");
        String f = jsonPrimitive.getF();
        String[] strArr = StringOpsKt.f24873a;
        Intrinsics.h(f, "<this>");
        if (f.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (f.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final String e(JsonPrimitive jsonPrimitive) {
        if (jsonPrimitive instanceof JsonNull) {
            return null;
        }
        return jsonPrimitive.getF();
    }

    public static final double f(JsonPrimitive jsonPrimitive) {
        return Double.parseDouble(jsonPrimitive.getF());
    }

    public static final int g(JsonPrimitive jsonPrimitive) {
        try {
            long jI = new StringJsonLexer(jsonPrimitive.getF()).i();
            if (-2147483648L <= jI && jI <= 2147483647L) {
                return (int) jI;
            }
            throw new NumberFormatException(jsonPrimitive.getF() + " is not an Int");
        } catch (JsonDecodingException e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    public static final Integer h(JsonPrimitive jsonPrimitive) {
        Long lValueOf;
        Intrinsics.h(jsonPrimitive, "<this>");
        try {
            lValueOf = Long.valueOf(new StringJsonLexer(jsonPrimitive.getF()).i());
        } catch (JsonDecodingException unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            if (-2147483648L <= jLongValue && jLongValue <= 2147483647L) {
                return Integer.valueOf((int) jLongValue);
            }
        }
        return null;
    }

    public static final JsonArray i(JsonElement jsonElement) {
        Intrinsics.h(jsonElement, "<this>");
        JsonArray jsonArray = jsonElement instanceof JsonArray ? (JsonArray) jsonElement : null;
        if (jsonArray != null) {
            return jsonArray;
        }
        c("JsonArray", jsonElement);
        throw null;
    }

    public static final JsonObject j(JsonElement jsonElement) {
        Intrinsics.h(jsonElement, "<this>");
        JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        if (jsonObject != null) {
            return jsonObject;
        }
        c("JsonObject", jsonElement);
        throw null;
    }

    public static final JsonPrimitive k(JsonElement jsonElement) {
        Intrinsics.h(jsonElement, "<this>");
        JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        c("JsonPrimitive", jsonElement);
        throw null;
    }
}
