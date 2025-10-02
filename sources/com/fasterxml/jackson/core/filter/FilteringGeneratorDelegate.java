package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.util.JsonGeneratorDelegate;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes4.dex */
public class FilteringGeneratorDelegate extends JsonGeneratorDelegate {
    public TokenFilterContext e;
    public TokenFilter f;

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public final void A(boolean z) {
        TokenFilter tokenFilter = this.f;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f14194a;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterJ = this.e.j(tokenFilter);
            if (tokenFilterJ == null) {
                return;
            }
            if (tokenFilterJ != tokenFilter2 && !tokenFilterJ.a()) {
                return;
            } else {
                U1();
            }
        }
        throw null;
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public final void B0() {
        if (this.f != null) {
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public final void C1(SerializableString serializableString) {
        TokenFilter tokenFilter = this.f;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f14194a;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterJ = this.e.j(tokenFilter);
            if (tokenFilterJ == null) {
                return;
            }
            if (tokenFilterJ != tokenFilter2) {
                serializableString.getClass();
                if (!tokenFilterJ.a()) {
                    return;
                }
            }
            U1();
        }
        throw null;
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public final void F() {
        TokenFilterContext tokenFilterContext = this.e;
        if (tokenFilterContext.g) {
            throw null;
        }
        TokenFilterContext tokenFilterContext2 = tokenFilterContext.c;
        this.e = tokenFilterContext2;
        if (tokenFilterContext2 != null) {
            this.f = tokenFilterContext2.f;
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public final void G0(char c) {
        if (V1()) {
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public final void H() {
        TokenFilterContext tokenFilterContext = this.e;
        if (tokenFilterContext.g) {
            throw null;
        }
        TokenFilterContext tokenFilterContext2 = tokenFilterContext.c;
        this.e = tokenFilterContext2;
        if (tokenFilterContext2 != null) {
            this.f = tokenFilterContext2.f;
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public final void H0(SerializableString serializableString) {
        if (V1()) {
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public final void J1(String str) {
        TokenFilter tokenFilter = this.f;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f14194a;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterJ = this.e.j(tokenFilter);
            if (tokenFilterJ == null) {
                return;
            }
            if (tokenFilterJ != tokenFilter2 && !tokenFilterJ.a()) {
                return;
            } else {
                U1();
            }
        }
        throw null;
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public final void K1(char[] cArr, int i, int i2) {
        TokenFilter tokenFilter = this.f;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f14194a;
        if (tokenFilter != tokenFilter2) {
            new String(cArr, i, i2);
            TokenFilter tokenFilterJ = this.e.j(this.f);
            if (tokenFilterJ == null) {
                return;
            }
            if (tokenFilterJ != tokenFilter2 && !tokenFilterJ.a()) {
                return;
            } else {
                U1();
            }
        }
        throw null;
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public final void N1(Object obj) {
        if (this.f != null) {
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public final void O0(String str) {
        if (V1()) {
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public final void P0(char[] cArr, int i) {
        if (V1()) {
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public final void R(long j) {
        U(Long.toString(j));
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public final void T(SerializableString serializableString) {
        TokenFilter tokenFilterN = this.e.n(serializableString.getValue());
        if (tokenFilterN == null) {
            this.f = null;
            return;
        }
        TokenFilter tokenFilter = TokenFilter.f14194a;
        if (tokenFilterN == tokenFilter) {
            this.f = tokenFilterN;
            throw null;
        }
        TokenFilter tokenFilterE = tokenFilterN.e(serializableString.getValue());
        this.f = tokenFilterE;
        if (tokenFilterE == tokenFilter) {
            TokenFilterContext tokenFilterContext = this.e;
            tokenFilterContext.f = null;
            TokenFilterContext tokenFilterContext2 = tokenFilterContext.c;
            for (TokenFilterContext tokenFilterContext3 = tokenFilterContext2; tokenFilterContext3 != null; tokenFilterContext3 = tokenFilterContext3.c) {
                tokenFilterContext2.f = null;
            }
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public final void U(String str) {
        TokenFilter tokenFilterN = this.e.n(str);
        if (tokenFilterN == null) {
            this.f = null;
            return;
        }
        TokenFilter tokenFilter = TokenFilter.f14194a;
        if (tokenFilterN == tokenFilter) {
            this.f = tokenFilterN;
            throw null;
        }
        TokenFilter tokenFilterE = tokenFilterN.e(str);
        this.f = tokenFilterE;
        if (tokenFilterE == tokenFilter) {
            TokenFilterContext tokenFilterContext = this.e;
            tokenFilterContext.f = null;
            TokenFilterContext tokenFilterContext2 = tokenFilterContext.c;
            for (TokenFilterContext tokenFilterContext3 = tokenFilterContext2; tokenFilterContext3 != null; tokenFilterContext3 = tokenFilterContext3.c) {
                tokenFilterContext2.f = null;
            }
        }
    }

    public final void U1() {
        TokenFilterContext tokenFilterContext = this.e;
        tokenFilterContext.f = null;
        TokenFilterContext tokenFilterContext2 = tokenFilterContext.c;
        for (TokenFilterContext tokenFilterContext3 = tokenFilterContext2; tokenFilterContext3 != null; tokenFilterContext3 = tokenFilterContext3.c) {
            tokenFilterContext2.f = null;
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public final void V0(String str) {
        if (V1()) {
            throw null;
        }
    }

    public final boolean V1() {
        TokenFilter tokenFilter = this.f;
        if (tokenFilter == null) {
            return false;
        }
        if (tokenFilter == TokenFilter.f14194a) {
            return true;
        }
        if (!tokenFilter.a()) {
            return false;
        }
        U1();
        return true;
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public final void W0() {
        TokenFilter tokenFilter = this.f;
        if (tokenFilter == null) {
            this.e = this.e.k(null, false);
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f14194a;
        if (tokenFilter == tokenFilter2) {
            this.e = this.e.k(tokenFilter, true);
            throw null;
        }
        TokenFilter tokenFilterJ = this.e.j(tokenFilter);
        this.f = tokenFilterJ;
        if (tokenFilterJ == null) {
            this.e = this.e.k(null, false);
            return;
        }
        if (tokenFilterJ != tokenFilter2) {
            this.f = tokenFilterJ.b();
        }
        TokenFilter tokenFilter3 = this.f;
        if (tokenFilter3 != tokenFilter2) {
            this.e = this.e.k(tokenFilter3, false);
        } else {
            U1();
            this.e = this.e.k(this.f, true);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public final void Y() {
        TokenFilter tokenFilter = this.f;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f14194a;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterJ = this.e.j(tokenFilter);
            if (tokenFilterJ == null) {
                return;
            }
            if (tokenFilterJ != tokenFilter2 && !tokenFilterJ.a()) {
                return;
            } else {
                U1();
            }
        }
        throw null;
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public final void Z(double d) {
        TokenFilter tokenFilter = this.f;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f14194a;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterJ = this.e.j(tokenFilter);
            if (tokenFilterJ == null) {
                return;
            }
            if (tokenFilterJ != tokenFilter2 && !tokenFilterJ.a()) {
                return;
            } else {
                U1();
            }
        }
        throw null;
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public final void a1(int i, Object obj) {
        TokenFilter tokenFilter = this.f;
        if (tokenFilter == null) {
            this.e = this.e.k(null, false);
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f14194a;
        if (tokenFilter == tokenFilter2) {
            this.e = this.e.k(tokenFilter, true);
            throw null;
        }
        TokenFilter tokenFilterJ = this.e.j(tokenFilter);
        this.f = tokenFilterJ;
        if (tokenFilterJ == null) {
            this.e = this.e.k(null, false);
            return;
        }
        if (tokenFilterJ != tokenFilter2) {
            this.f = tokenFilterJ.b();
        }
        TokenFilter tokenFilter3 = this.f;
        if (tokenFilter3 != tokenFilter2) {
            this.e = this.e.k(tokenFilter3, false);
        } else {
            U1();
            this.e = this.e.k(this.f, true);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public final void b0(float f) {
        TokenFilter tokenFilter = this.f;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f14194a;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterJ = this.e.j(tokenFilter);
            if (tokenFilterJ == null) {
                return;
            }
            if (tokenFilterJ != tokenFilter2 && !tokenFilterJ.a()) {
                return;
            } else {
                U1();
            }
        }
        throw null;
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public final void b1(Object obj) {
        TokenFilter tokenFilter = this.f;
        if (tokenFilter == null) {
            this.e = this.e.k(null, false);
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f14194a;
        if (tokenFilter == tokenFilter2) {
            this.e = this.e.k(tokenFilter, true);
            throw null;
        }
        TokenFilter tokenFilterJ = this.e.j(tokenFilter);
        this.f = tokenFilterJ;
        if (tokenFilterJ == null) {
            this.e = this.e.k(null, false);
            return;
        }
        if (tokenFilterJ != tokenFilter2) {
            this.f = tokenFilterJ.b();
        }
        TokenFilter tokenFilter3 = this.f;
        if (tokenFilter3 != tokenFilter2) {
            this.e = this.e.k(tokenFilter3, false);
        } else {
            U1();
            this.e = this.e.k(this.f, true);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public final void d0(int i) {
        TokenFilter tokenFilter = this.f;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f14194a;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterJ = this.e.j(tokenFilter);
            if (tokenFilterJ == null) {
                return;
            }
            if (tokenFilterJ != tokenFilter2 && !tokenFilterJ.a()) {
                return;
            } else {
                U1();
            }
        }
        throw null;
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public final JsonStreamContext f() {
        return this.e;
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public final void i0(long j) {
        TokenFilter tokenFilter = this.f;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f14194a;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterJ = this.e.j(tokenFilter);
            if (tokenFilterJ == null) {
                return;
            }
            if (tokenFilterJ != tokenFilter2 && !tokenFilterJ.a()) {
                return;
            } else {
                U1();
            }
        }
        throw null;
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public final void k0(String str) {
        TokenFilter tokenFilter = this.f;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f14194a;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterJ = this.e.j(tokenFilter);
            if (tokenFilterJ == null) {
                return;
            }
            if (tokenFilterJ != tokenFilter2 && !tokenFilterJ.a()) {
                return;
            } else {
                U1();
            }
        }
        throw null;
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public final void m0(BigDecimal bigDecimal) {
        TokenFilter tokenFilter = this.f;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f14194a;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterJ = this.e.j(tokenFilter);
            if (tokenFilterJ == null) {
                return;
            }
            if (tokenFilterJ != tokenFilter2 && !tokenFilterJ.a()) {
                return;
            } else {
                U1();
            }
        }
        throw null;
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public final void m1() {
        TokenFilter tokenFilter = this.f;
        if (tokenFilter == null) {
            this.e = this.e.k(null, false);
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f14194a;
        if (tokenFilter == tokenFilter2) {
            this.e = this.e.k(tokenFilter, true);
            throw null;
        }
        TokenFilter tokenFilterJ = this.e.j(tokenFilter);
        this.f = tokenFilterJ;
        if (tokenFilterJ == null) {
            this.e = this.e.k(null, false);
            return;
        }
        if (tokenFilterJ != tokenFilter2) {
            this.f = tokenFilterJ.b();
        }
        TokenFilter tokenFilter3 = this.f;
        if (tokenFilter3 != tokenFilter2) {
            this.e = this.e.k(tokenFilter3, false);
        } else {
            U1();
            this.e = this.e.k(this.f, true);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public final void p1() {
        TokenFilter tokenFilter = this.f;
        if (tokenFilter == null) {
            this.e = this.e.l(tokenFilter, false);
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f14194a;
        if (tokenFilter == tokenFilter2) {
            this.e = this.e.l(tokenFilter, true);
            throw null;
        }
        TokenFilter tokenFilterJ = this.e.j(tokenFilter);
        if (tokenFilterJ == null) {
            this.e = this.e.l(null, false);
            return;
        }
        if (tokenFilterJ != tokenFilter2) {
            tokenFilterJ = tokenFilterJ.c();
        }
        if (tokenFilterJ != tokenFilter2) {
            this.e = this.e.l(tokenFilterJ, false);
        } else {
            U1();
            this.e = this.e.l(tokenFilterJ, true);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public final void r0(BigInteger bigInteger) {
        TokenFilter tokenFilter = this.f;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f14194a;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterJ = this.e.j(tokenFilter);
            if (tokenFilterJ == null) {
                return;
            }
            if (tokenFilterJ != tokenFilter2 && !tokenFilterJ.a()) {
                return;
            } else {
                U1();
            }
        }
        throw null;
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public final void t0(short s) {
        TokenFilter tokenFilter = this.f;
        if (tokenFilter == null) {
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f14194a;
        if (tokenFilter != tokenFilter2) {
            TokenFilter tokenFilterJ = this.e.j(tokenFilter);
            if (tokenFilterJ == null) {
                return;
            }
            if (tokenFilterJ != tokenFilter2 && !tokenFilterJ.a()) {
                return;
            } else {
                U1();
            }
        }
        throw null;
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public final int v(Base64Variant base64Variant, InputStream inputStream, int i) {
        TokenFilter tokenFilter = this.f;
        if (tokenFilter == null) {
            return -1;
        }
        if (tokenFilter != TokenFilter.f14194a) {
            if (!tokenFilter.a()) {
                return -1;
            }
            U1();
        }
        throw null;
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public final void x(Base64Variant base64Variant, byte[] bArr, int i, int i2) {
        TokenFilter tokenFilter = this.f;
        if (tokenFilter == null) {
            return;
        }
        if (tokenFilter != TokenFilter.f14194a) {
            if (!tokenFilter.a()) {
                return;
            } else {
                U1();
            }
        }
        throw null;
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public final void x1(Object obj) {
        TokenFilter tokenFilter = this.f;
        if (tokenFilter == null) {
            this.e = this.e.l(tokenFilter, false);
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f14194a;
        if (tokenFilter == tokenFilter2) {
            this.e = this.e.l(tokenFilter, true);
            throw null;
        }
        TokenFilter tokenFilterJ = this.e.j(tokenFilter);
        if (tokenFilterJ == null) {
            this.e = this.e.l(null, false);
            return;
        }
        if (tokenFilterJ != tokenFilter2) {
            tokenFilterJ = tokenFilterJ.c();
        }
        if (tokenFilterJ != tokenFilter2) {
            this.e = this.e.l(tokenFilterJ, false);
        } else {
            U1();
            this.e = this.e.l(tokenFilterJ, true);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public final void y1(Object obj) {
        TokenFilter tokenFilter = this.f;
        if (tokenFilter == null) {
            this.e = this.e.l(tokenFilter, false);
            return;
        }
        TokenFilter tokenFilter2 = TokenFilter.f14194a;
        if (tokenFilter == tokenFilter2) {
            this.e = this.e.l(tokenFilter, true);
            throw null;
        }
        TokenFilter tokenFilterJ = this.e.j(tokenFilter);
        if (tokenFilterJ == null) {
            this.e = this.e.l(null, false);
            return;
        }
        if (tokenFilterJ != tokenFilter2) {
            tokenFilterJ = tokenFilterJ.c();
        }
        if (tokenFilterJ != tokenFilter2) {
            this.e = this.e.l(tokenFilterJ, false);
        } else {
            U1();
            this.e = this.e.l(tokenFilterJ, true);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonGeneratorDelegate, com.fasterxml.jackson.core.JsonGenerator
    public final void z0(Object obj) {
        if (this.f != null) {
            throw null;
        }
    }
}
