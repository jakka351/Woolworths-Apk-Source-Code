package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.util.JacksonFeatureSet;
import com.fasterxml.jackson.core.util.VersionUtil;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.NodeCursor;
import com.fasterxml.jackson.databind.util.ByteBufferBackedOutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes4.dex */
public class TreeTraversingParser extends ParserMinimalBase {
    public final ObjectCodec p;
    public NodeCursor q;
    public boolean r;

    /* renamed from: com.fasterxml.jackson.databind.node.TreeTraversingParser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14300a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f14300a = iArr;
            try {
                iArr[JsonToken.START_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14300a[JsonToken.START_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14300a[JsonToken.END_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14300a[JsonToken.END_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14300a[JsonToken.FIELD_NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14300a[JsonToken.VALUE_STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14300a[JsonToken.VALUE_NUMBER_INT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14300a[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14300a[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public TreeTraversingParser(JsonNode jsonNode, ObjectCodec objectCodec) {
        super(0);
        this.p = objectCodec;
        NodeCursor.RootCursor rootCursor = new NodeCursor.RootCursor(0, null);
        rootCursor.g = false;
        rootCursor.f = jsonNode;
        this.q = rootCursor;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final double A() {
        return H2().s();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final Object C() {
        JsonNode jsonNodeG2;
        if (this.r || (jsonNodeG2 = G2()) == null) {
            return null;
        }
        if (jsonNodeG2.x() == JsonNodeType.k) {
            return ((POJONode) jsonNodeG2).d;
        }
        if (jsonNodeG2.x() == JsonNodeType.e) {
            return ((BinaryNode) jsonNodeG2).d;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final boolean C1() {
        if (this.r) {
            return false;
        }
        JsonNode jsonNodeG2 = G2();
        if (jsonNodeG2 instanceof NumericNode) {
            return ((NumericNode) jsonNodeG2).E();
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final float F() {
        return (float) H2().s();
    }

    public final JsonNode G2() {
        NodeCursor nodeCursor;
        if (this.r || (nodeCursor = this.q) == null) {
            return null;
        }
        return nodeCursor.i();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int H() {
        NumericNode numericNode = (NumericNode) H2();
        if (numericNode.C()) {
            return numericNode.D();
        }
        D2();
        throw null;
    }

    public final JsonNode H2() throws JsonParseException {
        JsonNode jsonNodeG2 = G2();
        if (jsonNodeG2 != null && jsonNodeG2.x() == JsonNodeType.i) {
            return jsonNodeG2;
        }
        throw new JsonParseException(this, "Current token (" + (jsonNodeG2 == null ? null : jsonNodeG2.d()) + ") not numeric, cannot use numeric value accessors");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    @Override // com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.core.JsonToken N1() {
        /*
            r2 = this;
            com.fasterxml.jackson.databind.node.NodeCursor r0 = r2.q
            com.fasterxml.jackson.core.JsonToken r0 = r0.j()
            r2.f = r0
            r1 = 1
            if (r0 != 0) goto Lf
            r2.r = r1
            r0 = 0
            return r0
        Lf:
            int r0 = r0.ordinal()
            if (r0 == r1) goto L2f
            r1 = 2
            if (r0 == r1) goto L28
            r1 = 3
            if (r0 == r1) goto L1f
            r1 = 4
            if (r0 == r1) goto L28
            goto L37
        L1f:
            com.fasterxml.jackson.databind.node.NodeCursor r0 = r2.q
            com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor r0 = r0.k()
            r2.q = r0
            goto L37
        L28:
            com.fasterxml.jackson.databind.node.NodeCursor r0 = r2.q
            com.fasterxml.jackson.databind.node.NodeCursor r0 = r0.c
            r2.q = r0
            goto L37
        L2f:
            com.fasterxml.jackson.databind.node.NodeCursor r0 = r2.q
            com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor r0 = r0.l()
            r2.q = r0
        L37:
            com.fasterxml.jackson.core.JsonToken r0 = r2.f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.node.TreeTraversingParser.N1():com.fasterxml.jackson.core.JsonToken");
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int P1(Base64Variant base64Variant, ByteBufferBackedOutputStream byteBufferBackedOutputStream) {
        byte[] bArrH = h(base64Variant);
        if (bArrH == null) {
            return 0;
        }
        byteBufferBackedOutputStream.write(bArrH, 0, bArrH.length);
        return bArrH.length;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final long R() {
        NumericNode numericNode = (NumericNode) H2();
        if (numericNode.o()) {
            return numericNode.F();
        }
        E2();
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final JsonParser.NumberType T() {
        return H2().b();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final Number U() {
        return H2().z();
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final JsonParser V1() {
        JsonToken jsonToken = this.f;
        if (jsonToken == JsonToken.START_OBJECT) {
            this.q = this.q.c;
            this.f = JsonToken.END_OBJECT;
            return this;
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            this.q = this.q.c;
            this.f = JsonToken.END_ARRAY;
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final boolean W0() {
        return false;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final JsonStreamContext b0() {
        return this.q;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase
    public final void b2() {
        VersionUtil.c();
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.r) {
            return;
        }
        this.r = true;
        this.q = null;
        this.f = null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final JacksonFeatureSet d0() {
        return JsonParser.e;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final BigInteger g() {
        return H2().m();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final byte[] h(Base64Variant base64Variant) {
        JsonNode jsonNodeG2 = G2();
        if (jsonNodeG2 != null) {
            return jsonNodeG2 instanceof TextNode ? ((TextNode) jsonNodeG2).C(base64Variant) : jsonNodeG2.n();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final ObjectCodec k() {
        return this.p;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final String k0() {
        JsonToken jsonToken = this.f;
        if (jsonToken == null) {
            return null;
        }
        switch (jsonToken.ordinal()) {
            case 5:
                return this.q.d;
            case 6:
                JsonNode jsonNodeG2 = G2();
                if (jsonNodeG2 != null && jsonNodeG2.x() == JsonNodeType.e) {
                    return jsonNodeG2.k();
                }
                break;
            case 7:
                return G2().B();
            case 8:
            case 9:
                return String.valueOf(G2().z());
        }
        return this.f.d;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final JsonLocation l() {
        return JsonLocation.j;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final char[] m0() {
        return k0().toCharArray();
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final String p() {
        NodeCursor nodeCursor = this.q;
        JsonToken jsonToken = this.f;
        if (jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) {
            nodeCursor = nodeCursor.c;
        }
        if (nodeCursor == null) {
            return null;
        }
        return nodeCursor.d;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int r0() {
        return k0().length();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int t0() {
        return 0;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final BigDecimal x() {
        return H2().q();
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final JsonLocation z0() {
        return JsonLocation.j;
    }
}
