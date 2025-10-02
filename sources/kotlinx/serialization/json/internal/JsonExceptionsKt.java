package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class JsonExceptionsKt {
    public static final JsonEncodingException a(Number number, String output) {
        Intrinsics.h(output, "output");
        return new JsonEncodingException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) g(-1, output)));
    }

    public static final JsonEncodingException b(SerialDescriptor keyDescriptor) {
        Intrinsics.h(keyDescriptor, "keyDescriptor");
        return new JsonEncodingException("Value of type '" + keyDescriptor.getB() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.getB() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final JsonDecodingException c(int i, CharSequence input, String message) {
        Intrinsics.h(message, "message");
        Intrinsics.h(input, "input");
        return d(i, message + "\nJSON input: " + ((Object) g(i, input)));
    }

    public static final JsonDecodingException d(int i, String message) {
        Intrinsics.h(message, "message");
        if (i >= 0) {
            message = "Unexpected JSON token at offset " + i + ": " + message;
        }
        Intrinsics.h(message, "message");
        return new JsonDecodingException(message);
    }

    public static final void e(AbstractJsonLexer abstractJsonLexer, String str) {
        abstractJsonLexer.q(abstractJsonLexer.f24849a - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static /* synthetic */ void f(AbstractJsonLexer abstractJsonLexer) {
        e(abstractJsonLexer, "object");
        throw null;
    }

    public static final CharSequence g(int i, CharSequence charSequence) {
        Intrinsics.h(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? "" : ".....";
                String str2 = i3 >= charSequence.length() ? "" : ".....";
                StringBuilder sbS = YU.a.s(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                sbS.append(charSequence.subSequence(i2, i3).toString());
                sbS.append(str2);
                return sbS.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final void h(AbstractJsonLexer abstractJsonLexer, Number number) {
        AbstractJsonLexer.r(abstractJsonLexer, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final String i(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) g(-1, str2));
    }
}
