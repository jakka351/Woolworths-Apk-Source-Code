package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.modules.SerializersModule;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/json/internal/StreamingJsonEncoder;", "Lkotlinx/serialization/json/JsonEncoder;", "Lkotlinx/serialization/encoding/AbstractEncoder;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class StreamingJsonEncoder extends AbstractEncoder implements JsonEncoder {

    /* renamed from: a, reason: collision with root package name */
    public final Composer f24871a;
    public final Json b;
    public final WriteMode c;
    public final JsonEncoder[] d;
    public final SerializersModule e;
    public final JsonConfiguration f;
    public boolean g;
    public String h;
    public String i;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[WriteMode.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                WriteMode writeMode = WriteMode.f;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                WriteMode writeMode2 = WriteMode.f;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public StreamingJsonEncoder(Composer composer, Json json, WriteMode writeMode, JsonEncoder[] jsonEncoderArr) {
        Intrinsics.h(composer, "composer");
        this.f24871a = composer;
        this.b = json;
        this.c = writeMode;
        this.d = jsonEncoderArr;
        this.e = json.b;
        this.f = json.f24836a;
        int iOrdinal = writeMode.ordinal();
        if (jsonEncoderArr != null) {
            JsonEncoder jsonEncoder = jsonEncoderArr[iOrdinal];
            if (jsonEncoder == null && jsonEncoder == this) {
                return;
            }
            jsonEncoderArr[iOrdinal] = this;
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void D(char c) {
        u(String.valueOf(c));
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder
    public final boolean H(SerialDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        int iOrdinal = this.c.ordinal();
        Composer composer = this.f24871a;
        if (iOrdinal == 1) {
            if (!composer.b) {
                composer.e(',');
            }
            composer.b();
            return true;
        }
        boolean z = false;
        if (iOrdinal == 2) {
            if (composer.b) {
                this.g = true;
                composer.b();
                return true;
            }
            if (i % 2 == 0) {
                composer.e(',');
                composer.b();
                z = true;
            } else {
                composer.e(':');
                composer.k();
            }
            this.g = z;
            return true;
        }
        if (iOrdinal != 3) {
            if (!composer.b) {
                composer.e(',');
            }
            composer.b();
            u(JsonNamesMapKt.b(descriptor, this.b, i));
            composer.e(':');
            composer.k();
            return true;
        }
        if (i == 0) {
            this.g = true;
        }
        if (i == 1) {
            composer.e(',');
            composer.k();
            this.g = false;
        }
        return true;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: a, reason: from getter */
    public final SerializersModule getF24851a() {
        return this.e;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final CompositeEncoder b(SerialDescriptor descriptor) {
        JsonEncoder jsonEncoder;
        Intrinsics.h(descriptor, "descriptor");
        Json json = this.b;
        WriteMode writeModeB = WriteModeKt.b(descriptor, json);
        char c = writeModeB.d;
        Composer composer = this.f24871a;
        composer.e(c);
        composer.a();
        String str = this.h;
        if (str != null) {
            String b = this.i;
            if (b == null) {
                b = descriptor.getF24814a();
            }
            composer.b();
            u(str);
            composer.e(':');
            composer.k();
            u(b);
            this.h = null;
            this.i = null;
        }
        if (this.c == writeModeB) {
            return this;
        }
        JsonEncoder[] jsonEncoderArr = this.d;
        return (jsonEncoderArr == null || (jsonEncoder = jsonEncoderArr[writeModeB.ordinal()]) == null) ? new StreamingJsonEncoder(composer, json, writeModeB, jsonEncoderArr) : jsonEncoder;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public final void c(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        Composer composer = this.f24871a;
        composer.l();
        composer.c();
        composer.e(this.c.e);
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    /* renamed from: d, reason: from getter */
    public final Json getB() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(kotlinx.serialization.SerializationStrategy r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.String r0 = "serializer"
            kotlin.jvm.internal.Intrinsics.h(r5, r0)
            kotlinx.serialization.json.Json r0 = r4.b
            kotlinx.serialization.json.JsonConfiguration r1 = r0.f24836a
            boolean r2 = r5 instanceof kotlinx.serialization.internal.AbstractPolymorphicSerializer
            if (r2 == 0) goto L14
            kotlinx.serialization.json.ClassDiscriminatorMode r1 = r1.i
            kotlinx.serialization.json.ClassDiscriminatorMode r3 = kotlinx.serialization.json.ClassDiscriminatorMode.d
            if (r1 == r3) goto L4a
            goto L41
        L14:
            kotlinx.serialization.json.ClassDiscriminatorMode r1 = r1.i
            int r1 = r1.ordinal()
            if (r1 == 0) goto L4a
            r3 = 1
            if (r1 == r3) goto L29
            r0 = 2
            if (r1 != r0) goto L23
            goto L4a
        L23:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L29:
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r5.getB()
            kotlinx.serialization.descriptors.SerialKind r1 = r1.getB()
            kotlinx.serialization.descriptors.StructureKind$CLASS r3 = kotlinx.serialization.descriptors.StructureKind.CLASS.f24774a
            boolean r3 = kotlin.jvm.internal.Intrinsics.c(r1, r3)
            if (r3 != 0) goto L41
            kotlinx.serialization.descriptors.StructureKind$OBJECT r3 = kotlinx.serialization.descriptors.StructureKind.OBJECT.f24777a
            boolean r1 = kotlin.jvm.internal.Intrinsics.c(r1, r3)
            if (r1 == 0) goto L4a
        L41:
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r5.getB()
            java.lang.String r0 = kotlinx.serialization.json.internal.PolymorphicKt.c(r1, r0)
            goto L4b
        L4a:
            r0 = 0
        L4b:
            if (r2 == 0) goto L89
            r1 = r5
            kotlinx.serialization.internal.AbstractPolymorphicSerializer r1 = (kotlinx.serialization.internal.AbstractPolymorphicSerializer) r1
            if (r6 == 0) goto L68
            kotlinx.serialization.SerializationStrategy r1 = kotlinx.serialization.PolymorphicSerializerKt.b(r1, r4, r6)
            if (r0 == 0) goto L5b
            kotlinx.serialization.json.internal.PolymorphicKt.a(r5, r1, r0)
        L5b:
            kotlinx.serialization.descriptors.SerialDescriptor r5 = r1.getB()
            kotlinx.serialization.descriptors.SerialKind r5 = r5.getB()
            kotlinx.serialization.json.internal.PolymorphicKt.b(r5)
            r5 = r1
            goto L89
        L68:
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
        L89:
            if (r0 == 0) goto L97
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r5.getB()
            java.lang.String r1 = r1.getF24814a()
            r4.h = r0
            r4.i = r1
        L97:
            r5.serialize(r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.StreamingJsonEncoder.e(kotlinx.serialization.SerializationStrategy, java.lang.Object):void");
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void g(byte b) {
        if (this.g) {
            u(String.valueOf((int) b));
        } else {
            this.f24871a.d(b);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void i(SerialDescriptor enumDescriptor, int i) {
        Intrinsics.h(enumDescriptor, "enumDescriptor");
        u(enumDescriptor.g(i));
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final Encoder j(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        boolean zB = StreamingJsonEncoderKt.b(descriptor);
        WriteMode writeMode = this.c;
        Json json = this.b;
        Composer composerForUnquotedLiterals = this.f24871a;
        if (zB) {
            if (!(composerForUnquotedLiterals instanceof ComposerForUnsignedNumbers)) {
                composerForUnquotedLiterals = new ComposerForUnsignedNumbers(composerForUnquotedLiterals.f24857a, this.g);
            }
            return new StreamingJsonEncoder(composerForUnquotedLiterals, json, writeMode, null);
        }
        if (StreamingJsonEncoderKt.a(descriptor)) {
            if (!(composerForUnquotedLiterals instanceof ComposerForUnquotedLiterals)) {
                composerForUnquotedLiterals = new ComposerForUnquotedLiterals(composerForUnquotedLiterals.f24857a, this.g);
            }
            return new StreamingJsonEncoder(composerForUnquotedLiterals, json, writeMode, null);
        }
        if (this.h != null) {
            this.i = descriptor.getF24814a();
        }
        return this;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void l(short s) {
        if (this.g) {
            u(String.valueOf((int) s));
        } else {
            this.f24871a.i(s);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void m(boolean z) {
        if (this.g) {
            u(String.valueOf(z));
        } else {
            this.f24871a.f24857a.b(String.valueOf(z));
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void n(float f) {
        boolean z = this.g;
        Composer composer = this.f24871a;
        if (z) {
            u(String.valueOf(f));
        } else {
            composer.f24857a.b(String.valueOf(f));
        }
        if (this.f.g) {
            return;
        }
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            throw JsonExceptionsKt.a(Float.valueOf(f), composer.f24857a.toString());
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public final boolean q(SerialDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        return false;
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    public final void r(JsonElement jsonElement) {
        if (this.h == null || (jsonElement instanceof JsonObject)) {
            e(JsonElementSerializer.f24842a, jsonElement);
        } else {
            PolymorphicKt.d(this.i, jsonElement);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void s(int i) {
        if (this.g) {
            u(String.valueOf(i));
        } else {
            this.f24871a.f(i);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void u(String value) {
        Intrinsics.h(value, "value");
        this.f24871a.j(value);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void v(double d) {
        boolean z = this.g;
        Composer composer = this.f24871a;
        if (z) {
            u(String.valueOf(d));
        } else {
            composer.f24857a.b(String.valueOf(d));
        }
        if (this.f.g) {
            return;
        }
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw JsonExceptionsKt.a(Double.valueOf(d), composer.f24857a.toString());
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public final void w(SerialDescriptor descriptor, int i, SerializationStrategy serializer, Object obj) {
        Intrinsics.h(descriptor, "descriptor");
        Intrinsics.h(serializer, "serializer");
        if (obj != null || this.f.c) {
            super.w(descriptor, i, serializer, obj);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void y(long j) {
        if (this.g) {
            u(String.valueOf(j));
        } else {
            this.f24871a.g(j);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void z() {
        this.f24871a.h("null");
    }
}
