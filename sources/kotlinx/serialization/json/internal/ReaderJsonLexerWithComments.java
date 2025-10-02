package kotlinx.serialization.json.internal;

import java.nio.charset.CharacterCodingException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/ReaderJsonLexerWithComments;", "Lkotlinx/serialization/json/internal/ReaderJsonLexer;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ReaderJsonLexerWithComments extends ReaderJsonLexer {
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d4, code lost:
    
        r9.f24849a = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d6, code lost:
    
        return r0;
     */
    @Override // kotlinx.serialization.json.internal.ReaderJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int B() throws java.nio.charset.CharacterCodingException {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.ReaderJsonLexerWithComments.B():int");
    }

    @Override // kotlinx.serialization.json.internal.ReaderJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public final boolean c() throws CharacterCodingException {
        o();
        int iB = B();
        ArrayAsSequence arrayAsSequence = this.h;
        if (iB >= arrayAsSequence.e || iB == -1) {
            return false;
        }
        return AbstractJsonLexer.w(arrayAsSequence.d[iB]);
    }

    @Override // kotlinx.serialization.json.internal.ReaderJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public final byte f() throws CharacterCodingException {
        o();
        int iB = B();
        ArrayAsSequence arrayAsSequence = this.h;
        if (iB >= arrayAsSequence.e || iB == -1) {
            return (byte) 10;
        }
        this.f24849a = iB + 1;
        return AbstractJsonLexerKt.a(arrayAsSequence.d[iB]);
    }

    @Override // kotlinx.serialization.json.internal.ReaderJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public final void h(char c) throws CharacterCodingException {
        o();
        int iB = B();
        ArrayAsSequence arrayAsSequence = this.h;
        if (iB >= arrayAsSequence.e || iB == -1) {
            this.f24849a = -1;
            F(c);
            throw null;
        }
        char c2 = arrayAsSequence.d[iB];
        this.f24849a = iB + 1;
        if (c2 == c) {
            return;
        }
        F(c);
        throw null;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public final byte y() throws CharacterCodingException {
        o();
        int iB = B();
        ArrayAsSequence arrayAsSequence = this.h;
        if (iB >= arrayAsSequence.e || iB == -1) {
            return (byte) 10;
        }
        this.f24849a = iB;
        return AbstractJsonLexerKt.a(arrayAsSequence.d[iB]);
    }
}
