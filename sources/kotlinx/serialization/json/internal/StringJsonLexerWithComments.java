package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/StringJsonLexerWithComments;", "Lkotlinx/serialization/json/internal/StringJsonLexer;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class StringJsonLexerWithComments extends StringJsonLexer {
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        r8.f24849a = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
    
        return r0;
     */
    @Override // kotlinx.serialization.json.internal.StringJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int B() {
        /*
            r8 = this;
            int r0 = r8.f24849a
            r1 = -1
            if (r0 != r1) goto L6
            return r0
        L6:
            java.lang.String r2 = r8.e
            int r3 = r2.length()
            if (r0 >= r3) goto L67
            char r3 = r2.charAt(r0)
            r4 = 32
            if (r3 == r4) goto L64
            r4 = 10
            if (r3 == r4) goto L64
            r5 = 13
            if (r3 == r5) goto L64
            r5 = 9
            if (r3 != r5) goto L23
            goto L64
        L23:
            r5 = 47
            if (r3 != r5) goto L67
            int r3 = r0 + 1
            int r6 = r2.length()
            if (r3 >= r6) goto L67
            char r3 = r2.charAt(r3)
            r6 = 42
            r7 = 4
            if (r3 == r6) goto L48
            if (r3 == r5) goto L3b
            goto L67
        L3b:
            int r0 = r0 + 2
            int r0 = kotlin.text.StringsKt.B(r2, r4, r0, r7)
            if (r0 != r1) goto L64
            int r0 = r2.length()
            goto L6
        L48:
            int r0 = r0 + 2
        */
        //  java.lang.String r3 = "*/"
        /*
            r4 = 0
            int r0 = kotlin.text.StringsKt.C(r2, r3, r0, r4, r7)
            if (r0 == r1) goto L56
            int r0 = r0 + 2
            goto L6
        L56:
            int r0 = r2.length()
            r8.f24849a = r0
        */
        //  java.lang.String r0 = "Expected end of the block comment: \"*/\", but had EOF instead"
        /*
            r1 = 6
            r2 = 0
            kotlinx.serialization.json.internal.AbstractJsonLexer.r(r8, r0, r4, r2, r1)
            throw r2
        L64:
            int r0 = r0 + 1
            goto L6
        L67:
            r8.f24849a = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.StringJsonLexerWithComments.B():int");
    }

    @Override // kotlinx.serialization.json.internal.StringJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public final boolean c() {
        int iB = B();
        String str = this.e;
        if (iB >= str.length() || iB == -1) {
            return false;
        }
        return AbstractJsonLexer.w(str.charAt(iB));
    }

    @Override // kotlinx.serialization.json.internal.StringJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public final byte f() {
        int iB = B();
        String str = this.e;
        if (iB >= str.length() || iB == -1) {
            return (byte) 10;
        }
        this.f24849a = iB + 1;
        return AbstractJsonLexerKt.a(str.charAt(iB));
    }

    @Override // kotlinx.serialization.json.internal.StringJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public final void h(char c) {
        int iB = B();
        String str = this.e;
        if (iB >= str.length() || iB == -1) {
            this.f24849a = -1;
            F(c);
            throw null;
        }
        char cCharAt = str.charAt(iB);
        this.f24849a = iB + 1;
        if (cCharAt == c) {
            return;
        }
        F(c);
        throw null;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public final byte y() {
        int iB = B();
        String str = this.e;
        if (iB >= str.length() || iB == -1) {
            return (byte) 10;
        }
        this.f24849a = iB;
        return AbstractJsonLexerKt.a(str.charAt(iB));
    }
}
