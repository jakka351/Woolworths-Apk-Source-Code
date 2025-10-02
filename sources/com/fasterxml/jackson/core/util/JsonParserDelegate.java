package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.util.ByteBufferBackedOutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes4.dex */
public class JsonParserDelegate extends JsonParser {
    public JsonParser f;

    @Override // com.fasterxml.jackson.core.JsonParser
    public double A() {
        return this.f.A();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final Object B0() {
        return this.f.B0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object C() {
        return this.f.C();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final boolean C1() {
        return this.f.C1();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public float F() {
        return this.f.F();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int G0() {
        return this.f.G0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int H() {
        return this.f.H();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int H0() {
        return this.f.H0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken N1() {
        return this.f.N1();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long O0() {
        return this.f.O0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long P0() {
        return this.f.P0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int P1(Base64Variant base64Variant, ByteBufferBackedOutputStream byteBufferBackedOutputStream) {
        return this.f.P1(base64Variant, byteBufferBackedOutputStream);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long R() {
        return this.f.R();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final boolean R1() {
        return this.f.R1();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser.NumberType T() {
        return this.f.T();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String T0() {
        return this.f.T0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Number U() {
        return this.f.U();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final void U1(Object obj) {
        this.f.U1(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String V0() {
        return this.f.V0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser V1() {
        this.f.V1();
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean W0() {
        return this.f.W0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final Number Y() {
        return this.f.Y();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final Object Z() {
        return this.f.Z();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final boolean a() {
        return this.f.a();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean a1(JsonToken jsonToken) {
        return this.f.a1(jsonToken);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final boolean b() {
        return this.f.b();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonStreamContext b0() {
        return this.f.b0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean b1() {
        return this.f.b1();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void c() {
        this.f.c();
    }

    @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f.close();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String d() {
        return this.f.d();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final JacksonFeatureSet d0() {
        return this.f.d0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken e() {
        return this.f.e();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int f() {
        return this.f.f();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigInteger g() {
        return this.f.g();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public byte[] h(Base64Variant base64Variant) {
        return this.f.h(base64Variant);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean i() {
        return this.f.i();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public short i0() {
        return this.f.i0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public byte j() {
        return this.f.j();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final ObjectCodec k() {
        return this.f.k();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String k0() {
        return this.f.k0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation l() {
        return this.f.l();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public char[] m0() {
        return this.f.m0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String p() {
        return this.f.p();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final boolean p1() {
        return this.f.p1();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken r() {
        return this.f.r();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int r0() {
        return this.f.r0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int t0() {
        return this.f.t0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int v() {
        return this.f.v();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigDecimal x() {
        return this.f.x();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean x1() {
        return this.f.x1();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean y1() {
        return this.f.y1();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation z0() {
        return this.f.z0();
    }
}
