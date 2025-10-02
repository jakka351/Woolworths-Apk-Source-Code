package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes4.dex */
public class JsonGeneratorDelegate extends JsonGenerator {
    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void A(boolean z) {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void B0() {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void C(Object obj) {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void C1(SerializableString serializableString) {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void F() {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void G0(char c) {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void H() {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void H0(SerializableString serializableString) {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void J1(String str) {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void K1(char[] cArr, int i, int i2) {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void N1(Object obj) {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void O0(String str) {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void P0(char[] cArr, int i) {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void R(long j) {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void T(SerializableString serializableString) {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void U(String str) {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void V0(String str) {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void W0() {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void Y() {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void Z(double d) {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void a1(int i, Object obj) {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void b0(float f) {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void b1(Object obj) {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final boolean c() {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final boolean d() {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void d0(int i) {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final boolean e() {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonStreamContext f() {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public final void flush() {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final PrettyPrinter g() {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final boolean h(JsonGenerator.Feature feature) {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void i(Object obj) {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void i0(long j) {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void k(PrettyPrinter prettyPrinter) {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void k0(String str) {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void l(int i, int[] iArr) {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void m0(BigDecimal bigDecimal) {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void m1() {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void p(double[] dArr, int i) {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void p1() {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void r(long[] jArr, int i) {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void r0(BigInteger bigInteger) {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void t0(short s) {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int v(Base64Variant base64Variant, InputStream inputStream, int i) {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeObject(Object obj) {
        if (obj != null) {
            throw null;
        }
        Y();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void x(Base64Variant base64Variant, byte[] bArr, int i, int i2) {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void x1(Object obj) {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void y1(Object obj) {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void z0(Object obj) {
        throw null;
    }
}
