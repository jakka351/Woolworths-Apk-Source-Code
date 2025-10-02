package kotlinx.serialization.json.internal;

import io.jsonwebtoken.JwtParser;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.internal.InlineClassDescriptor;
import kotlinx.serialization.internal.NamedValueDecoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.modules.SerializersModule;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u00012\u00020\u0002\u0082\u0001\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/json/internal/AbstractJsonTreeDecoder;", "Lkotlinx/serialization/internal/NamedValueDecoder;", "Lkotlinx/serialization/json/JsonDecoder;", "Lkotlinx/serialization/json/internal/JsonPrimitiveDecoder;", "Lkotlinx/serialization/json/internal/JsonTreeDecoder;", "Lkotlinx/serialization/json/internal/JsonTreeListDecoder;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
abstract class AbstractJsonTreeDecoder extends NamedValueDecoder implements JsonDecoder {
    public final Json c;
    public final JsonElement d;
    public final String e;
    public final JsonConfiguration f;

    public AbstractJsonTreeDecoder(Json json, JsonElement jsonElement, String str) {
        this.c = json;
        this.d = jsonElement;
        this.e = str;
        this.f = json.f24836a;
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public boolean C() {
        return !(a0() instanceof JsonNull);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public final Object E(DeserializationStrategy deserializer) {
        Intrinsics.h(deserializer, "deserializer");
        if (!(deserializer instanceof AbstractPolymorphicSerializer)) {
            return deserializer.deserialize(this);
        }
        Json json = this.c;
        JsonConfiguration jsonConfiguration = json.f24836a;
        AbstractPolymorphicSerializer abstractPolymorphicSerializer = (AbstractPolymorphicSerializer) deserializer;
        String strC = PolymorphicKt.c(abstractPolymorphicSerializer.getB(), json);
        JsonElement jsonElementA0 = a0();
        String f24814a = abstractPolymorphicSerializer.getB().getF24814a();
        if (!(jsonElementA0 instanceof JsonObject)) {
            StringBuilder sb = new StringBuilder("Expected ");
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            sb.append(reflectionFactory.b(JsonObject.class).B());
            sb.append(", but had ");
            sb.append(reflectionFactory.b(jsonElementA0.getClass()).B());
            sb.append(" as the serialized body of ");
            sb.append(f24814a);
            sb.append(" at element: ");
            sb.append(Y());
            throw JsonExceptionsKt.c(-1, jsonElementA0.toString(), sb.toString());
        }
        JsonObject jsonObject = (JsonObject) jsonElementA0;
        JsonElement jsonElement = (JsonElement) jsonObject.get(strC);
        String f = null;
        if (jsonElement != null) {
            JsonPrimitive jsonPrimitiveK = JsonElementKt.k(jsonElement);
            if (!(jsonPrimitiveK instanceof JsonNull)) {
                f = jsonPrimitiveK.getF();
            }
        }
        try {
            return TreeJsonDecoderKt.b(json, strC, jsonObject, PolymorphicSerializerKt.a((AbstractPolymorphicSerializer) deserializer, this, f));
        } catch (SerializationException e) {
            String message = e.getMessage();
            Intrinsics.e(message);
            throw JsonExceptionsKt.c(-1, jsonObject.toString(), message);
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final boolean G(Object obj) {
        String tag = (String) obj;
        Intrinsics.h(tag, "tag");
        JsonElement jsonElementZ = Z(tag);
        if (jsonElementZ instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementZ;
            try {
                Boolean boolD = JsonElementKt.d(jsonPrimitive);
                if (boolD != null) {
                    return boolD.booleanValue();
                }
                d0(jsonPrimitive, "boolean", tag);
                throw null;
            } catch (IllegalArgumentException unused) {
                d0(jsonPrimitive, "boolean", tag);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        sb.append(reflectionFactory.b(JsonPrimitive.class).B());
        sb.append(", but had ");
        sb.append(reflectionFactory.b(jsonElementZ.getClass()).B());
        sb.append(" as the serialized body of boolean at element: ");
        sb.append(c0(tag));
        throw JsonExceptionsKt.c(-1, jsonElementZ.toString(), sb.toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final byte H(Object obj) {
        String tag = (String) obj;
        Intrinsics.h(tag, "tag");
        JsonElement jsonElementZ = Z(tag);
        if (!(jsonElementZ instanceof JsonPrimitive)) {
            StringBuilder sb = new StringBuilder("Expected ");
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            sb.append(reflectionFactory.b(JsonPrimitive.class).B());
            sb.append(", but had ");
            sb.append(reflectionFactory.b(jsonElementZ.getClass()).B());
            sb.append(" as the serialized body of byte at element: ");
            sb.append(c0(tag));
            throw JsonExceptionsKt.c(-1, jsonElementZ.toString(), sb.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementZ;
        try {
            int iG = JsonElementKt.g(jsonPrimitive);
            Byte bValueOf = (-128 > iG || iG > 127) ? null : Byte.valueOf((byte) iG);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            d0(jsonPrimitive, "byte", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            d0(jsonPrimitive, "byte", tag);
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final char I(Object obj) {
        String tag = (String) obj;
        Intrinsics.h(tag, "tag");
        JsonElement jsonElementZ = Z(tag);
        if (!(jsonElementZ instanceof JsonPrimitive)) {
            StringBuilder sb = new StringBuilder("Expected ");
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            sb.append(reflectionFactory.b(JsonPrimitive.class).B());
            sb.append(", but had ");
            sb.append(reflectionFactory.b(jsonElementZ.getClass()).B());
            sb.append(" as the serialized body of char at element: ");
            sb.append(c0(tag));
            throw JsonExceptionsKt.c(-1, jsonElementZ.toString(), sb.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementZ;
        try {
            String f = jsonPrimitive.getF();
            Intrinsics.h(f, "<this>");
            int length = f.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return f.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            d0(jsonPrimitive, "char", tag);
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final double J(Object obj) throws NumberFormatException {
        String tag = (String) obj;
        Intrinsics.h(tag, "tag");
        JsonElement jsonElementZ = Z(tag);
        if (!(jsonElementZ instanceof JsonPrimitive)) {
            StringBuilder sb = new StringBuilder("Expected ");
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            sb.append(reflectionFactory.b(JsonPrimitive.class).B());
            sb.append(", but had ");
            sb.append(reflectionFactory.b(jsonElementZ.getClass()).B());
            sb.append(" as the serialized body of double at element: ");
            sb.append(c0(tag));
            throw JsonExceptionsKt.c(-1, jsonElementZ.toString(), sb.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementZ;
        try {
            InlineClassDescriptor inlineClassDescriptor = JsonElementKt.f24841a;
            double d = Double.parseDouble(jsonPrimitive.getF());
            if (this.c.f24836a.g || !(Double.isInfinite(d) || Double.isNaN(d))) {
                return d;
            }
            Double dValueOf = Double.valueOf(d);
            String output = a0().toString();
            Intrinsics.h(output, "output");
            throw JsonExceptionsKt.d(-1, JsonExceptionsKt.i(dValueOf, tag, output));
        } catch (IllegalArgumentException unused) {
            d0(jsonPrimitive, "double", tag);
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final int K(Object obj, SerialDescriptor enumDescriptor) {
        String tag = (String) obj;
        Intrinsics.h(tag, "tag");
        Intrinsics.h(enumDescriptor, "enumDescriptor");
        JsonElement jsonElementZ = Z(tag);
        String f24814a = enumDescriptor.getF24814a();
        if (jsonElementZ instanceof JsonPrimitive) {
            return JsonNamesMapKt.d(enumDescriptor, this.c, ((JsonPrimitive) jsonElementZ).getF(), "");
        }
        StringBuilder sb = new StringBuilder("Expected ");
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        sb.append(reflectionFactory.b(JsonPrimitive.class).B());
        sb.append(", but had ");
        sb.append(reflectionFactory.b(jsonElementZ.getClass()).B());
        androidx.compose.ui.input.pointer.a.w(sb, " as the serialized body of ", f24814a, " at element: ");
        sb.append(c0(tag));
        throw JsonExceptionsKt.c(-1, jsonElementZ.toString(), sb.toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final float L(Object obj) throws NumberFormatException {
        String tag = (String) obj;
        Intrinsics.h(tag, "tag");
        JsonElement jsonElementZ = Z(tag);
        if (!(jsonElementZ instanceof JsonPrimitive)) {
            StringBuilder sb = new StringBuilder("Expected ");
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            sb.append(reflectionFactory.b(JsonPrimitive.class).B());
            sb.append(", but had ");
            sb.append(reflectionFactory.b(jsonElementZ.getClass()).B());
            sb.append(" as the serialized body of float at element: ");
            sb.append(c0(tag));
            throw JsonExceptionsKt.c(-1, jsonElementZ.toString(), sb.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementZ;
        try {
            InlineClassDescriptor inlineClassDescriptor = JsonElementKt.f24841a;
            float f = Float.parseFloat(jsonPrimitive.getF());
            if (this.c.f24836a.g || !(Float.isInfinite(f) || Float.isNaN(f))) {
                return f;
            }
            Float fValueOf = Float.valueOf(f);
            String output = a0().toString();
            Intrinsics.h(output, "output");
            throw JsonExceptionsKt.d(-1, JsonExceptionsKt.i(fValueOf, tag, output));
        } catch (IllegalArgumentException unused) {
            d0(jsonPrimitive, "float", tag);
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final Decoder M(Object obj, SerialDescriptor inlineDescriptor) {
        String tag = (String) obj;
        Intrinsics.h(tag, "tag");
        Intrinsics.h(inlineDescriptor, "inlineDescriptor");
        if (!StreamingJsonEncoderKt.b(inlineDescriptor)) {
            this.f24822a.add(tag);
            return this;
        }
        JsonElement jsonElementZ = Z(tag);
        String f24814a = inlineDescriptor.getF24814a();
        if (jsonElementZ instanceof JsonPrimitive) {
            String source = ((JsonPrimitive) jsonElementZ).getF();
            Json json = this.c;
            Intrinsics.h(json, "json");
            Intrinsics.h(source, "source");
            return new JsonDecoderForUnsignedTypes(new StringJsonLexer(source), json);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        sb.append(reflectionFactory.b(JsonPrimitive.class).B());
        sb.append(", but had ");
        sb.append(reflectionFactory.b(jsonElementZ.getClass()).B());
        androidx.compose.ui.input.pointer.a.w(sb, " as the serialized body of ", f24814a, " at element: ");
        sb.append(c0(tag));
        throw JsonExceptionsKt.c(-1, jsonElementZ.toString(), sb.toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final int N(Object obj) {
        String tag = (String) obj;
        Intrinsics.h(tag, "tag");
        JsonElement jsonElementZ = Z(tag);
        if (jsonElementZ instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementZ;
            try {
                return JsonElementKt.g(jsonPrimitive);
            } catch (IllegalArgumentException unused) {
                d0(jsonPrimitive, "int", tag);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        sb.append(reflectionFactory.b(JsonPrimitive.class).B());
        sb.append(", but had ");
        sb.append(reflectionFactory.b(jsonElementZ.getClass()).B());
        sb.append(" as the serialized body of int at element: ");
        sb.append(c0(tag));
        throw JsonExceptionsKt.c(-1, jsonElementZ.toString(), sb.toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final long O(Object obj) {
        String tag = (String) obj;
        Intrinsics.h(tag, "tag");
        JsonElement jsonElementZ = Z(tag);
        if (jsonElementZ instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementZ;
            try {
                InlineClassDescriptor inlineClassDescriptor = JsonElementKt.f24841a;
                try {
                    return new StringJsonLexer(jsonPrimitive.getF()).i();
                } catch (JsonDecodingException e) {
                    throw new NumberFormatException(e.getMessage());
                }
            } catch (IllegalArgumentException unused) {
                d0(jsonPrimitive, "long", tag);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        sb.append(reflectionFactory.b(JsonPrimitive.class).B());
        sb.append(", but had ");
        sb.append(reflectionFactory.b(jsonElementZ.getClass()).B());
        sb.append(" as the serialized body of long at element: ");
        sb.append(c0(tag));
        throw JsonExceptionsKt.c(-1, jsonElementZ.toString(), sb.toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final boolean P(Object obj) {
        return Z((String) obj) != JsonNull.INSTANCE;
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final short Q(Object obj) {
        String tag = (String) obj;
        Intrinsics.h(tag, "tag");
        JsonElement jsonElementZ = Z(tag);
        if (!(jsonElementZ instanceof JsonPrimitive)) {
            StringBuilder sb = new StringBuilder("Expected ");
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            sb.append(reflectionFactory.b(JsonPrimitive.class).B());
            sb.append(", but had ");
            sb.append(reflectionFactory.b(jsonElementZ.getClass()).B());
            sb.append(" as the serialized body of short at element: ");
            sb.append(c0(tag));
            throw JsonExceptionsKt.c(-1, jsonElementZ.toString(), sb.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementZ;
        try {
            int iG = JsonElementKt.g(jsonPrimitive);
            Short shValueOf = (-32768 > iG || iG > 32767) ? null : Short.valueOf((short) iG);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            d0(jsonPrimitive, "short", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            d0(jsonPrimitive, "short", tag);
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final String R(Object obj) {
        String tag = (String) obj;
        Intrinsics.h(tag, "tag");
        JsonElement jsonElementZ = Z(tag);
        if (!(jsonElementZ instanceof JsonPrimitive)) {
            StringBuilder sb = new StringBuilder("Expected ");
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            sb.append(reflectionFactory.b(JsonPrimitive.class).B());
            sb.append(", but had ");
            sb.append(reflectionFactory.b(jsonElementZ.getClass()).B());
            sb.append(" as the serialized body of string at element: ");
            sb.append(c0(tag));
            throw JsonExceptionsKt.c(-1, jsonElementZ.toString(), sb.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementZ;
        if (!(jsonPrimitive instanceof JsonLiteral)) {
            StringBuilder sbU = YU.a.u("Expected string value for a non-null key '", tag, "', got null literal instead at element: ");
            sbU.append(c0(tag));
            throw JsonExceptionsKt.c(-1, a0().toString(), sbU.toString());
        }
        JsonLiteral jsonLiteral = (JsonLiteral) jsonPrimitive;
        if (jsonLiteral.d || this.c.f24836a.b) {
            return jsonLiteral.f;
        }
        throw JsonExceptionsKt.c(-1, a0().toString(), YU.a.o(YU.a.u("String literal for key '", tag, "' should be quoted at element: "), c0(tag), ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON."));
    }

    @Override // kotlinx.serialization.internal.NamedValueDecoder
    public final String V(String str, String str2) {
        return str2;
    }

    public abstract JsonElement Z(String str);

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    /* renamed from: a */
    public final SerializersModule getB() {
        return this.c.b;
    }

    public final JsonElement a0() {
        JsonElement jsonElementZ;
        String str = (String) CollectionsKt.P(this.f24822a);
        return (str == null || (jsonElementZ = Z(str)) == null) ? getD() : jsonElementZ;
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public CompositeDecoder b(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        JsonElement jsonElementA0 = a0();
        SerialKind b = descriptor.getB();
        boolean zC = Intrinsics.c(b, StructureKind.LIST.f24775a);
        Json json = this.c;
        if (zC || (b instanceof PolymorphicKind)) {
            String f24814a = descriptor.getF24814a();
            if (jsonElementA0 instanceof JsonArray) {
                return new JsonTreeListDecoder(json, (JsonArray) jsonElementA0);
            }
            StringBuilder sb = new StringBuilder("Expected ");
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            sb.append(reflectionFactory.b(JsonArray.class).B());
            sb.append(", but had ");
            sb.append(reflectionFactory.b(jsonElementA0.getClass()).B());
            sb.append(" as the serialized body of ");
            sb.append(f24814a);
            sb.append(" at element: ");
            sb.append(Y());
            throw JsonExceptionsKt.c(-1, jsonElementA0.toString(), sb.toString());
        }
        if (!Intrinsics.c(b, StructureKind.MAP.f24776a)) {
            String f24814a2 = descriptor.getF24814a();
            if (jsonElementA0 instanceof JsonObject) {
                return new JsonTreeDecoder(json, (JsonObject) jsonElementA0, this.e, 8);
            }
            StringBuilder sb2 = new StringBuilder("Expected ");
            ReflectionFactory reflectionFactory2 = Reflection.f24268a;
            sb2.append(reflectionFactory2.b(JsonObject.class).B());
            sb2.append(", but had ");
            sb2.append(reflectionFactory2.b(jsonElementA0.getClass()).B());
            sb2.append(" as the serialized body of ");
            sb2.append(f24814a2);
            sb2.append(" at element: ");
            sb2.append(Y());
            throw JsonExceptionsKt.c(-1, jsonElementA0.toString(), sb2.toString());
        }
        SerialDescriptor serialDescriptorA = WriteModeKt.a(descriptor.d(0), json.b);
        SerialKind b2 = serialDescriptorA.getB();
        if (!(b2 instanceof PrimitiveKind) && !Intrinsics.c(b2, SerialKind.ENUM.f24773a)) {
            throw JsonExceptionsKt.b(serialDescriptorA);
        }
        String f24814a3 = descriptor.getF24814a();
        if (jsonElementA0 instanceof JsonObject) {
            return new JsonTreeMapDecoder(json, (JsonObject) jsonElementA0);
        }
        StringBuilder sb3 = new StringBuilder("Expected ");
        ReflectionFactory reflectionFactory3 = Reflection.f24268a;
        sb3.append(reflectionFactory3.b(JsonObject.class).B());
        sb3.append(", but had ");
        sb3.append(reflectionFactory3.b(jsonElementA0.getClass()).B());
        sb3.append(" as the serialized body of ");
        sb3.append(f24814a3);
        sb3.append(" at element: ");
        sb3.append(Y());
        throw JsonExceptionsKt.c(-1, jsonElementA0.toString(), sb3.toString());
    }

    /* renamed from: b0, reason: from getter */
    public JsonElement getD() {
        return this.d;
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void c(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
    }

    public final String c0(String currentTag) {
        Intrinsics.h(currentTag, "currentTag");
        return Y() + JwtParser.SEPARATOR_CHAR + currentTag;
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    /* renamed from: d, reason: from getter */
    public final Json getC() {
        return this.c;
    }

    public final void d0(JsonPrimitive jsonPrimitive, String str, String str2) {
        throw JsonExceptionsKt.c(-1, a0().toString(), "Failed to parse literal '" + jsonPrimitive + "' as " + (StringsKt.W(str, "i", false) ? "an " : "a ").concat(str) + " value at element: " + c0(str2));
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    public final JsonElement s() {
        return a0();
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public final Decoder v(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        if (CollectionsKt.P(this.f24822a) != null) {
            return super.v(descriptor);
        }
        return new JsonPrimitiveDecoder(this.c, getD(), this.e).v(descriptor);
    }
}
