package kotlinx.serialization.json.internal;

import androidx.compose.ui.platform.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.UStringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.modules.SerializersModule;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/JsonDecoderForUnsignedTypes;", "Lkotlinx/serialization/encoding/AbstractDecoder;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class JsonDecoderForUnsignedTypes extends AbstractDecoder {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractJsonLexer f24861a;
    public final SerializersModule b;

    public JsonDecoderForUnsignedTypes(AbstractJsonLexer abstractJsonLexer, Json json) {
        Intrinsics.h(json, "json");
        this.f24861a = abstractJsonLexer;
        this.b = json.b;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final byte F() {
        AbstractJsonLexer abstractJsonLexer = this.f24861a;
        String strL = abstractJsonLexer.l();
        try {
            return UStringsKt.a(strL);
        } catch (IllegalArgumentException unused) {
            AbstractJsonLexer.r(abstractJsonLexer, i.a('\'', "Failed to parse type 'UByte' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    /* renamed from: a, reason: from getter */
    public final SerializersModule getB() {
        return this.b;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final long i() {
        AbstractJsonLexer abstractJsonLexer = this.f24861a;
        String strL = abstractJsonLexer.l();
        try {
            return UStringsKt.d(strL);
        } catch (IllegalArgumentException unused) {
            AbstractJsonLexer.r(abstractJsonLexer, i.a('\'', "Failed to parse type 'ULong' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final short l() {
        AbstractJsonLexer abstractJsonLexer = this.f24861a;
        String strL = abstractJsonLexer.l();
        try {
            return UStringsKt.f(strL);
        } catch (IllegalArgumentException unused) {
            AbstractJsonLexer.r(abstractJsonLexer, i.a('\'', "Failed to parse type 'UShort' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final int t() {
        AbstractJsonLexer abstractJsonLexer = this.f24861a;
        String strL = abstractJsonLexer.l();
        try {
            return UStringsKt.b(strL);
        } catch (IllegalArgumentException unused) {
            AbstractJsonLexer.r(abstractJsonLexer, i.a('\'', "Failed to parse type 'UInt' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final int u(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }
}
