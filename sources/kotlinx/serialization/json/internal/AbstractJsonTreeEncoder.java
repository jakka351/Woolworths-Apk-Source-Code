package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.InlineClassDescriptor;
import kotlinx.serialization.internal.NamedValueEncoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.modules.SerializersModule;
import org.bouncycastle.crypto.hpke.HPKE;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b3\u0018\u00002\u00020\u00012\u00020\u0002\u0082\u0001\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/json/internal/AbstractJsonTreeEncoder;", "Lkotlinx/serialization/internal/NamedValueEncoder;", "Lkotlinx/serialization/json/JsonEncoder;", "Lkotlinx/serialization/json/internal/JsonPrimitiveEncoder;", "Lkotlinx/serialization/json/internal/JsonTreeEncoder;", "Lkotlinx/serialization/json/internal/JsonTreeListEncoder;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ExperimentalSerializationApi
@SourceDebugExtension
/* loaded from: classes7.dex */
abstract class AbstractJsonTreeEncoder extends NamedValueEncoder implements JsonEncoder {
    public final Json b;
    public final Function1 c;
    public final JsonConfiguration d;
    public String e;
    public String f;

    public AbstractJsonTreeEncoder(Json json, Function1 function1) {
        this.b = json;
        this.c = function1;
        this.d = json.f24836a;
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public final void E() {
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public final void H(Object obj, boolean z) {
        String tag = (String) obj;
        Intrinsics.h(tag, "tag");
        Boolean boolValueOf = Boolean.valueOf(z);
        InlineClassDescriptor inlineClassDescriptor = JsonElementKt.f24841a;
        a0(tag, new JsonLiteral(boolValueOf, false, null));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public final void I(Object obj, byte b) {
        String tag = (String) obj;
        Intrinsics.h(tag, "tag");
        a0(tag, JsonElementKt.a(Byte.valueOf(b)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public final void J(Object obj, char c) {
        String tag = (String) obj;
        Intrinsics.h(tag, "tag");
        a0(tag, JsonElementKt.b(String.valueOf(c)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public final void K(Object obj, double d) {
        String tag = (String) obj;
        Intrinsics.h(tag, "tag");
        a0(tag, JsonElementKt.a(Double.valueOf(d)));
        if (this.d.g) {
            return;
        }
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            Double dValueOf = Double.valueOf(d);
            String output = Z().toString();
            Intrinsics.h(output, "output");
            throw new JsonEncodingException(JsonExceptionsKt.i(dValueOf, tag, output));
        }
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public final void L(Object obj, SerialDescriptor enumDescriptor, int i) {
        String tag = (String) obj;
        Intrinsics.h(tag, "tag");
        Intrinsics.h(enumDescriptor, "enumDescriptor");
        a0(tag, JsonElementKt.b(enumDescriptor.g(i)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public final void M(Object obj, float f) {
        String tag = (String) obj;
        Intrinsics.h(tag, "tag");
        a0(tag, JsonElementKt.a(Float.valueOf(f)));
        if (this.d.g) {
            return;
        }
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            Float fValueOf = Float.valueOf(f);
            String output = Z().toString();
            Intrinsics.h(output, "output");
            throw new JsonEncodingException(JsonExceptionsKt.i(fValueOf, tag, output));
        }
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public final Encoder N(Object obj, final SerialDescriptor inlineDescriptor) {
        final String tag = (String) obj;
        Intrinsics.h(tag, "tag");
        Intrinsics.h(inlineDescriptor, "inlineDescriptor");
        if (StreamingJsonEncoderKt.b(inlineDescriptor)) {
            return new AbstractEncoder() { // from class: kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1

                /* renamed from: a, reason: collision with root package name */
                public final SerializersModule f24851a;

                {
                    this.f24851a = this.b.b.b;
                }

                public final void J(String s) {
                    Intrinsics.h(s, "s");
                    this.b.a0(tag, new JsonLiteral(s, false, null));
                }

                @Override // kotlinx.serialization.encoding.Encoder
                /* renamed from: a, reason: from getter */
                public final SerializersModule getF24851a() {
                    return this.f24851a;
                }

                @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
                public final void g(byte b) {
                    J(String.valueOf(b & 255));
                }

                @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
                public final void l(short s) {
                    J(String.valueOf(s & HPKE.aead_EXPORT_ONLY));
                }

                @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
                public final void s(int i) {
                    J(Integer.toUnsignedString(i));
                }

                @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
                public final void y(long j) {
                    J(Long.toUnsignedString(j));
                }
            };
        }
        if (StreamingJsonEncoderKt.a(inlineDescriptor)) {
            return new AbstractEncoder() { // from class: kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$inlineUnquotedLiteralEncoder$1
                @Override // kotlinx.serialization.encoding.Encoder
                /* renamed from: a */
                public final SerializersModule getF24851a() {
                    return this.f24850a.b.b;
                }

                @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
                public final void u(String value) {
                    Intrinsics.h(value, "value");
                    this.f24850a.a0(tag, new JsonLiteral(value, false, inlineDescriptor));
                }
            };
        }
        this.f24823a.add(tag);
        return this;
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public final void O(int i, Object obj) {
        String tag = (String) obj;
        Intrinsics.h(tag, "tag");
        a0(tag, JsonElementKt.a(Integer.valueOf(i)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public final void P(long j, Object obj) {
        String tag = (String) obj;
        Intrinsics.h(tag, "tag");
        a0(tag, JsonElementKt.a(Long.valueOf(j)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public final void Q(Object obj) {
        String tag = (String) obj;
        Intrinsics.h(tag, "tag");
        a0(tag, JsonNull.INSTANCE);
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public final void R(Object obj, short s) {
        String tag = (String) obj;
        Intrinsics.h(tag, "tag");
        a0(tag, JsonElementKt.a(Short.valueOf(s)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public final void S(Object obj, String value) {
        String tag = (String) obj;
        Intrinsics.h(tag, "tag");
        Intrinsics.h(value, "value");
        a0(tag, JsonElementKt.b(value));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public final void T(Object obj, Object value) {
        String tag = (String) obj;
        Intrinsics.h(tag, "tag");
        Intrinsics.h(value, "value");
        a0(tag, JsonElementKt.b(value.toString()));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public final void U(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        this.c.invoke(Z());
    }

    @Override // kotlinx.serialization.internal.NamedValueEncoder
    public final String X(String str, String str2) {
        return str2;
    }

    @Override // kotlinx.serialization.internal.NamedValueEncoder
    public String Y(SerialDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        return JsonNamesMapKt.b(descriptor, this.b, i);
    }

    public abstract JsonElement Z();

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    /* renamed from: a */
    public final SerializersModule getF24851a() {
        return this.b.b;
    }

    public abstract void a0(String str, JsonElement jsonElement);

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public final CompositeEncoder b(SerialDescriptor descriptor) {
        AbstractJsonTreeEncoder jsonTreeListEncoder;
        Intrinsics.h(descriptor, "descriptor");
        Function1 nodeConsumer = CollectionsKt.P(this.f24823a) == null ? this.c : new a(this, 0);
        SerialKind b = descriptor.getB();
        boolean zC = Intrinsics.c(b, StructureKind.LIST.f24775a);
        Json json = this.b;
        if (zC || (b instanceof PolymorphicKind)) {
            jsonTreeListEncoder = new JsonTreeListEncoder(json, nodeConsumer);
        } else if (Intrinsics.c(b, StructureKind.MAP.f24776a)) {
            SerialDescriptor serialDescriptorA = WriteModeKt.a(descriptor.d(0), json.b);
            SerialKind b2 = serialDescriptorA.getB();
            if (!(b2 instanceof PrimitiveKind) && !Intrinsics.c(b2, SerialKind.ENUM.f24773a)) {
                throw JsonExceptionsKt.b(serialDescriptorA);
            }
            Intrinsics.h(nodeConsumer, "nodeConsumer");
            JsonTreeMapEncoder jsonTreeMapEncoder = new JsonTreeMapEncoder(json, nodeConsumer);
            jsonTreeMapEncoder.i = true;
            jsonTreeListEncoder = jsonTreeMapEncoder;
        } else {
            jsonTreeListEncoder = new JsonTreeEncoder(json, nodeConsumer);
        }
        String str = this.e;
        if (str != null) {
            if (jsonTreeListEncoder instanceof JsonTreeMapEncoder) {
                JsonTreeMapEncoder jsonTreeMapEncoder2 = (JsonTreeMapEncoder) jsonTreeListEncoder;
                jsonTreeMapEncoder2.a0("key", JsonElementKt.b(str));
                String f24814a = this.f;
                if (f24814a == null) {
                    f24814a = descriptor.getF24814a();
                }
                jsonTreeMapEncoder2.a0("value", JsonElementKt.b(f24814a));
            } else {
                String f24814a2 = this.f;
                if (f24814a2 == null) {
                    f24814a2 = descriptor.getF24814a();
                }
                jsonTreeListEncoder.a0(str, JsonElementKt.b(f24814a2));
            }
            this.e = null;
            this.f = null;
        }
        return jsonTreeListEncoder;
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    /* renamed from: d, reason: from getter */
    public final Json getB() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(kotlinx.serialization.SerializationStrategy r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.String r0 = "serializer"
            kotlin.jvm.internal.Intrinsics.h(r5, r0)
            java.util.ArrayList r0 = r4.f24823a
            java.lang.Object r0 = kotlin.collections.CollectionsKt.P(r0)
            kotlinx.serialization.json.Json r1 = r4.b
            if (r0 != 0) goto L34
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r5.getB()
            kotlinx.serialization.modules.SerializersModule r2 = r1.b
            kotlinx.serialization.descriptors.SerialDescriptor r0 = kotlinx.serialization.json.internal.WriteModeKt.a(r0, r2)
            kotlinx.serialization.descriptors.SerialKind r2 = r0.getB()
            boolean r2 = r2 instanceof kotlinx.serialization.descriptors.PrimitiveKind
            if (r2 != 0) goto L29
            kotlinx.serialization.descriptors.SerialKind r0 = r0.getB()
            kotlinx.serialization.descriptors.SerialKind$ENUM r2 = kotlinx.serialization.descriptors.SerialKind.ENUM.f24773a
            if (r0 != r2) goto L34
        L29:
            kotlinx.serialization.json.internal.JsonPrimitiveEncoder r0 = new kotlinx.serialization.json.internal.JsonPrimitiveEncoder
            kotlin.jvm.functions.Function1 r2 = r4.c
            r0.<init>(r1, r2)
            r0.e(r5, r6)
            return
        L34:
            kotlinx.serialization.json.JsonConfiguration r0 = r1.f24836a
            boolean r2 = r5 instanceof kotlinx.serialization.internal.AbstractPolymorphicSerializer
            if (r2 == 0) goto L41
            kotlinx.serialization.json.ClassDiscriminatorMode r0 = r0.i
            kotlinx.serialization.json.ClassDiscriminatorMode r3 = kotlinx.serialization.json.ClassDiscriminatorMode.d
            if (r0 == r3) goto L77
            goto L6e
        L41:
            kotlinx.serialization.json.ClassDiscriminatorMode r0 = r0.i
            int r0 = r0.ordinal()
            if (r0 == 0) goto L77
            r3 = 1
            if (r0 == r3) goto L56
            r1 = 2
            if (r0 != r1) goto L50
            goto L77
        L50:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L56:
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r5.getB()
            kotlinx.serialization.descriptors.SerialKind r0 = r0.getB()
            kotlinx.serialization.descriptors.StructureKind$CLASS r3 = kotlinx.serialization.descriptors.StructureKind.CLASS.f24774a
            boolean r3 = kotlin.jvm.internal.Intrinsics.c(r0, r3)
            if (r3 != 0) goto L6e
            kotlinx.serialization.descriptors.StructureKind$OBJECT r3 = kotlinx.serialization.descriptors.StructureKind.OBJECT.f24777a
            boolean r0 = kotlin.jvm.internal.Intrinsics.c(r0, r3)
            if (r0 == 0) goto L77
        L6e:
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r5.getB()
            java.lang.String r0 = kotlinx.serialization.json.internal.PolymorphicKt.c(r0, r1)
            goto L78
        L77:
            r0 = 0
        L78:
            if (r2 == 0) goto Lb6
            r1 = r5
            kotlinx.serialization.internal.AbstractPolymorphicSerializer r1 = (kotlinx.serialization.internal.AbstractPolymorphicSerializer) r1
            if (r6 == 0) goto L95
            kotlinx.serialization.SerializationStrategy r1 = kotlinx.serialization.PolymorphicSerializerKt.b(r1, r4, r6)
            if (r0 == 0) goto L88
            kotlinx.serialization.json.internal.PolymorphicKt.a(r5, r1, r0)
        L88:
            kotlinx.serialization.descriptors.SerialDescriptor r5 = r1.getB()
            kotlinx.serialization.descriptors.SerialKind r5 = r5.getB()
            kotlinx.serialization.json.internal.PolymorphicKt.b(r5)
            r5 = r1
            goto Lb6
        L95:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Value for serializer "
            r5.<init>(r6)
            kotlinx.serialization.descriptors.SerialDescriptor r6 = r1.getB()
            r5.append(r6)
            java.lang.String r6 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        Lb6:
            if (r0 == 0) goto Lc4
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r5.getB()
            java.lang.String r1 = r1.getF24814a()
            r4.e = r0
            r4.f = r1
        Lc4:
            r5.serialize(r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.AbstractJsonTreeEncoder.e(kotlinx.serialization.SerializationStrategy, java.lang.Object):void");
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public final Encoder j(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        if (CollectionsKt.P(this.f24823a) == null) {
            return new JsonPrimitiveEncoder(this.b, this.c).j(descriptor);
        }
        if (this.e != null) {
            this.f = descriptor.getF24814a();
        }
        return super.j(descriptor);
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public final boolean q(SerialDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        this.d.getClass();
        return false;
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    public final void r(JsonElement jsonElement) {
        if (this.e == null || (jsonElement instanceof JsonObject)) {
            e(JsonElementSerializer.f24842a, jsonElement);
        } else {
            PolymorphicKt.d(this.f, jsonElement);
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public final void z() {
        String str = (String) CollectionsKt.P(this.f24823a);
        if (str == null) {
            this.c.invoke(JsonNull.INSTANCE);
        } else {
            a0(str, JsonNull.INSTANCE);
        }
    }
}
