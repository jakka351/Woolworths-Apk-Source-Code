package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/StringJsonLexer;", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class StringJsonLexer extends AbstractJsonLexer {
    public final String e;

    public StringJsonLexer(String source) {
        Intrinsics.h(source, "source");
        this.e = source;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public final int A(int i) {
        if (i < this.e.length()) {
            return i;
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int B() {
        char cCharAt;
        int i = this.f24849a;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = this.e;
            if (i >= str.length() || !((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i++;
        }
        this.f24849a = i;
        return i;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public boolean c() {
        int i = this.f24849a;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = this.e;
            if (i >= str.length()) {
                this.f24849a = i;
                return false;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f24849a = i;
                return AbstractJsonLexer.w(cCharAt);
            }
            i++;
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public final String e() {
        h('\"');
        int i = this.f24849a;
        String str = this.e;
        int iB = StringsKt.B(str, '\"', i, 4);
        if (iB == -1) {
            l();
            s((byte) 1, false);
            throw null;
        }
        for (int i2 = i; i2 < iB; i2++) {
            if (str.charAt(i2) == '\\') {
                return k(str, this.f24849a, i2);
            }
        }
        this.f24849a = iB + 1;
        String strSubstring = str.substring(i, iB);
        Intrinsics.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        r4.f24849a = r3.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        return 10;
     */
    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte f() {
        /*
            r4 = this;
            int r0 = r4.f24849a
        L2:
            r1 = -1
            r2 = 10
            java.lang.String r3 = r4.e
            if (r0 == r1) goto L2d
            int r1 = r3.length()
            if (r0 >= r1) goto L2d
            int r1 = r0 + 1
            char r0 = r3.charAt(r0)
            r3 = 32
            if (r0 == r3) goto L2b
            if (r0 == r2) goto L2b
            r2 = 13
            if (r0 == r2) goto L2b
            r2 = 9
            if (r0 != r2) goto L24
            goto L2b
        L24:
            r4.f24849a = r1
            byte r0 = kotlinx.serialization.json.internal.AbstractJsonLexerKt.a(r0)
            return r0
        L2b:
            r0 = r1
            goto L2
        L2d:
            int r0 = r3.length()
            r4.f24849a = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.StringJsonLexer.f():byte");
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public void h(char c) {
        int i = this.f24849a;
        if (i == -1) {
            F(c);
            throw null;
        }
        while (true) {
            String str = this.e;
            if (i >= str.length()) {
                this.f24849a = -1;
                F(c);
                throw null;
            }
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f24849a = i2;
                if (cCharAt == c) {
                    return;
                }
                F(c);
                throw null;
            }
            i = i2;
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public final CharSequence v() {
        return this.e;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public final String x(String keyToMatch, boolean z) {
        Intrinsics.h(keyToMatch, "keyToMatch");
        int i = this.f24849a;
        try {
            if (f() == 6 && Intrinsics.c(z(z), keyToMatch)) {
                this.c = null;
                if (f() == 5) {
                    return z(z);
                }
            }
            return null;
        } finally {
            this.f24849a = i;
            this.c = null;
        }
    }
}
