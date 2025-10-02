package kotlinx.serialization.json.internal;

import androidx.compose.ui.platform.i;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.encoding.ChunkedDecoder;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.internal.JsonPath;
import kotlinx.serialization.modules.SerializersModule;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/json/internal/StreamingJsonDecoder;", "Lkotlinx/serialization/json/JsonDecoder;", "Lkotlinx/serialization/encoding/ChunkedDecoder;", "Lkotlinx/serialization/encoding/AbstractDecoder;", "DiscriminatorHolder", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class StreamingJsonDecoder extends AbstractDecoder implements JsonDecoder, ChunkedDecoder {

    /* renamed from: a, reason: collision with root package name */
    public final Json f24869a;
    public final WriteMode b;
    public final AbstractJsonLexer c;
    public final SerializersModule d;
    public int e;
    public DiscriminatorHolder f;
    public final JsonConfiguration g;
    public final JsonElementMarker h;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/StreamingJsonDecoder$DiscriminatorHolder;", "", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DiscriminatorHolder {

        /* renamed from: a, reason: collision with root package name */
        public String f24870a;
    }

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
            try {
                WriteMode writeMode3 = WriteMode.f;
                iArr[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public StreamingJsonDecoder(Json json, WriteMode writeMode, AbstractJsonLexer abstractJsonLexer, SerialDescriptor descriptor, DiscriminatorHolder discriminatorHolder) {
        Intrinsics.h(descriptor, "descriptor");
        this.f24869a = json;
        this.b = writeMode;
        this.c = abstractJsonLexer;
        this.d = json.b;
        this.e = -1;
        this.f = discriminatorHolder;
        JsonConfiguration jsonConfiguration = json.f24836a;
        this.g = jsonConfiguration;
        this.h = jsonConfiguration.c ? null : new JsonElementMarker(descriptor);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final boolean C() {
        JsonElementMarker jsonElementMarker = this.h;
        return ((jsonElementMarker != null ? jsonElementMarker.b : false) || this.c.E(true)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011a  */
    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object E(kotlinx.serialization.DeserializationStrategy r11) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.StreamingJsonDecoder.E(kotlinx.serialization.DeserializationStrategy):java.lang.Object");
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final byte F() {
        AbstractJsonLexer abstractJsonLexer = this.c;
        long jI = abstractJsonLexer.i();
        byte b = (byte) jI;
        if (jI == b) {
            return b;
        }
        AbstractJsonLexer.r(abstractJsonLexer, "Failed to parse byte for input '" + jI + '\'', 0, null, 6);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    /* renamed from: a, reason: from getter */
    public final SerializersModule getB() {
        return this.d;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final CompositeDecoder b(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        Json json = this.f24869a;
        WriteMode writeModeB = WriteModeKt.b(descriptor, json);
        AbstractJsonLexer abstractJsonLexer = this.c;
        JsonPath jsonPath = abstractJsonLexer.b;
        int i = jsonPath.c + 1;
        jsonPath.c = i;
        Object[] objArr = jsonPath.f24864a;
        if (i == objArr.length) {
            int i2 = i * 2;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i2);
            Intrinsics.g(objArrCopyOf, "copyOf(...)");
            jsonPath.f24864a = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(jsonPath.b, i2);
            Intrinsics.g(iArrCopyOf, "copyOf(...)");
            jsonPath.b = iArrCopyOf;
        }
        jsonPath.f24864a[i] = descriptor;
        abstractJsonLexer.h(writeModeB.d);
        if (abstractJsonLexer.y() != 4) {
            int iOrdinal = writeModeB.ordinal();
            return (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) ? new StreamingJsonDecoder(json, writeModeB, abstractJsonLexer, descriptor, this.f) : (this.b == writeModeB && json.f24836a.c) ? this : new StreamingJsonDecoder(json, writeModeB, abstractJsonLexer, descriptor, this.f);
        }
        AbstractJsonLexer.r(abstractJsonLexer, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public final void c(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        if (this.f24869a.f24836a.f24840a && descriptor.getC() == 0) {
            while (u(descriptor) != -1) {
            }
        }
        AbstractJsonLexer abstractJsonLexer = this.c;
        if (abstractJsonLexer.D()) {
            JsonExceptionsKt.e(abstractJsonLexer, "");
            throw null;
        }
        abstractJsonLexer.h(this.b.e);
        JsonPath jsonPath = abstractJsonLexer.b;
        int i = jsonPath.c;
        int[] iArr = jsonPath.b;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            jsonPath.c = i - 1;
        }
        int i2 = jsonPath.c;
        if (i2 != -1) {
            jsonPath.c = i2 - 1;
        }
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    /* renamed from: d, reason: from getter */
    public final Json getC() {
        return this.f24869a;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final void h() {
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final long i() {
        return this.c.i();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final short l() {
        AbstractJsonLexer abstractJsonLexer = this.c;
        long jI = abstractJsonLexer.i();
        short s = (short) jI;
        if (jI == s) {
            return s;
        }
        AbstractJsonLexer.r(abstractJsonLexer, "Failed to parse short for input '" + jI + '\'', 0, null, 6);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final double m() throws NumberFormatException {
        AbstractJsonLexer abstractJsonLexer = this.c;
        String strL = abstractJsonLexer.l();
        try {
            double d = Double.parseDouble(strL);
            if (this.f24869a.f24836a.g || !(Double.isInfinite(d) || Double.isNaN(d))) {
                return d;
            }
            JsonExceptionsKt.h(abstractJsonLexer, Double.valueOf(d));
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractJsonLexer.r(abstractJsonLexer, i.a('\'', "Failed to parse type 'double' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final char n() {
        AbstractJsonLexer abstractJsonLexer = this.c;
        String strL = abstractJsonLexer.l();
        if (strL.length() == 1) {
            return strL.charAt(0);
        }
        AbstractJsonLexer.r(abstractJsonLexer, i.a('\'', "Expected single char, but got '", strL), 0, null, 6);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public final Object o(SerialDescriptor descriptor, int i, DeserializationStrategy deserializer, Object obj) {
        JsonPath jsonPath = this.c.b;
        Intrinsics.h(descriptor, "descriptor");
        Intrinsics.h(deserializer, "deserializer");
        boolean z = this.b == WriteMode.h && (i & 1) == 0;
        if (z) {
            int[] iArr = jsonPath.b;
            int i2 = jsonPath.c;
            if (iArr[i2] == -2) {
                jsonPath.f24864a[i2] = JsonPath.Tombstone.f24865a;
            }
        }
        Object objO = super.o(descriptor, i, deserializer, obj);
        if (z) {
            int[] iArr2 = jsonPath.b;
            int i3 = jsonPath.c;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                jsonPath.c = i4;
                Object[] objArr = jsonPath.f24864a;
                if (i4 == objArr.length) {
                    int i5 = i4 * 2;
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, i5);
                    Intrinsics.g(objArrCopyOf, "copyOf(...)");
                    jsonPath.f24864a = objArrCopyOf;
                    int[] iArrCopyOf = Arrays.copyOf(jsonPath.b, i5);
                    Intrinsics.g(iArrCopyOf, "copyOf(...)");
                    jsonPath.b = iArrCopyOf;
                }
            }
            Object[] objArr2 = jsonPath.f24864a;
            int i6 = jsonPath.c;
            objArr2[i6] = objO;
            jsonPath.b[i6] = -2;
        }
        return objO;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final String p() {
        boolean z = this.g.b;
        AbstractJsonLexer abstractJsonLexer = this.c;
        return z ? abstractJsonLexer.m() : abstractJsonLexer.j();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final int r(SerialDescriptor enumDescriptor) {
        Intrinsics.h(enumDescriptor, "enumDescriptor");
        return JsonNamesMapKt.d(enumDescriptor, this.f24869a, p(), " at path ".concat(this.c.b.a()));
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    public final JsonElement s() {
        return new JsonTreeReader(this.f24869a.f24836a, this.c).b();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final int t() {
        AbstractJsonLexer abstractJsonLexer = this.c;
        long jI = abstractJsonLexer.i();
        int i = (int) jI;
        if (jI == i) {
            return i;
        }
        AbstractJsonLexer.r(abstractJsonLexer, "Failed to parse int for input '" + jI + '\'', 0, null, 6);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0150, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0114, code lost:
    
        if (r13 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0116, code lost:
    
        r13.f24862a.a(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x011b, code lost:
    
        r10 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0136, code lost:
    
        r2.q(kotlin.text.StringsKt.F(0, 6, r2.C(0, r2.f24849a), r14), androidx.compose.ui.platform.i.a('\'', "Encountered an unknown key '", r14), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
     */
    @Override // kotlinx.serialization.encoding.CompositeDecoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int u(kotlinx.serialization.descriptors.SerialDescriptor r19) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.StreamingJsonDecoder.u(kotlinx.serialization.descriptors.SerialDescriptor):int");
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final Decoder v(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        return StreamingJsonEncoderKt.b(descriptor) ? new JsonDecoderForUnsignedTypes(this.c, this.f24869a) : this;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final float w() throws NumberFormatException {
        AbstractJsonLexer abstractJsonLexer = this.c;
        String strL = abstractJsonLexer.l();
        try {
            float f = Float.parseFloat(strL);
            if (this.f24869a.f24836a.g || !(Float.isInfinite(f) || Float.isNaN(f))) {
                return f;
            }
            JsonExceptionsKt.h(abstractJsonLexer, Float.valueOf(f));
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractJsonLexer.r(abstractJsonLexer, i.a('\'', "Failed to parse type 'float' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final boolean z() {
        boolean z;
        boolean z2;
        AbstractJsonLexer abstractJsonLexer = this.c;
        int iB = abstractJsonLexer.B();
        if (iB == abstractJsonLexer.v().length()) {
            AbstractJsonLexer.r(abstractJsonLexer, "EOF", 0, null, 6);
            throw null;
        }
        if (abstractJsonLexer.v().charAt(iB) == '\"') {
            iB++;
            z = true;
        } else {
            z = false;
        }
        int iA = abstractJsonLexer.A(iB);
        if (iA >= abstractJsonLexer.v().length() || iA == -1) {
            AbstractJsonLexer.r(abstractJsonLexer, "EOF", 0, null, 6);
            throw null;
        }
        int i = iA + 1;
        int iCharAt = abstractJsonLexer.v().charAt(iA) | ' ';
        if (iCharAt == 102) {
            abstractJsonLexer.d(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                AbstractJsonLexer.r(abstractJsonLexer, "Expected valid boolean literal prefix, but had '" + abstractJsonLexer.l() + '\'', 0, null, 6);
                throw null;
            }
            abstractJsonLexer.d(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (abstractJsonLexer.f24849a == abstractJsonLexer.v().length()) {
            AbstractJsonLexer.r(abstractJsonLexer, "EOF", 0, null, 6);
            throw null;
        }
        if (abstractJsonLexer.v().charAt(abstractJsonLexer.f24849a) == '\"') {
            abstractJsonLexer.f24849a++;
            return z2;
        }
        AbstractJsonLexer.r(abstractJsonLexer, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }
}
