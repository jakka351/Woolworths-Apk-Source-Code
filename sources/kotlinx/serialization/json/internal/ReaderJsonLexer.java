package kotlinx.serialization.json.internal;

import java.nio.charset.CharacterCodingException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/ReaderJsonLexer;", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public class ReaderJsonLexer extends AbstractJsonLexer {
    public final JavaStreamSerialReader e;
    public final char[] f;
    public int g = 128;
    public final ArrayAsSequence h;

    public ReaderJsonLexer(JavaStreamSerialReader javaStreamSerialReader, char[] cArr) throws CharacterCodingException {
        this.e = javaStreamSerialReader;
        this.f = cArr;
        this.h = new ArrayAsSequence(cArr);
        G(0);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public final int A(int i) throws CharacterCodingException {
        ArrayAsSequence arrayAsSequence = this.h;
        if (i < arrayAsSequence.e) {
            return i;
        }
        this.f24849a = i;
        o();
        return (this.f24849a != 0 || arrayAsSequence.length() == 0) ? -1 : 0;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int B() throws CharacterCodingException {
        int iA;
        char c;
        int i = this.f24849a;
        while (true) {
            iA = A(i);
            if (iA == -1 || !((c = this.h.d[iA]) == ' ' || c == '\n' || c == '\r' || c == '\t')) {
                break;
            }
            i = iA + 1;
        }
        this.f24849a = iA;
        return iA;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public final String C(int i, int i2) {
        ArrayAsSequence arrayAsSequence = this.h;
        return StringsKt.n(arrayAsSequence.d, i, Math.min(i2, arrayAsSequence.e));
    }

    public final void G(int i) throws CharacterCodingException {
        ArrayAsSequence arrayAsSequence = this.h;
        char[] cArr = arrayAsSequence.d;
        if (i != 0) {
            int i2 = this.f24849a;
            ArraysKt.s(cArr, cArr, 0, i2, i2 + i);
        }
        int i3 = arrayAsSequence.e;
        while (true) {
            if (i == i3) {
                break;
            }
            int iA = this.e.f24860a.a(cArr, i, i3 - i);
            if (iA == -1) {
                arrayAsSequence.e = Math.min(arrayAsSequence.d.length, i);
                this.g = -1;
                break;
            }
            i += iA;
        }
        this.f24849a = 0;
    }

    public final void H() {
        CharArrayPoolBatchSize charArrayPoolBatchSize = CharArrayPoolBatchSize.c;
        charArrayPoolBatchSize.getClass();
        char[] array = this.f;
        Intrinsics.h(array, "array");
        if (array.length == 16384) {
            charArrayPoolBatchSize.a(array);
        } else {
            throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + array.length).toString());
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public final void b(int i, int i2) {
        this.d.append(this.h.d, i, i2 - i);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public boolean c() throws CharacterCodingException {
        o();
        int i = this.f24849a;
        while (true) {
            int iA = A(i);
            if (iA == -1) {
                this.f24849a = iA;
                return false;
            }
            char c = this.h.d[iA];
            if (c != ' ' && c != '\n' && c != '\r' && c != '\t') {
                this.f24849a = iA;
                return AbstractJsonLexer.w(c);
            }
            i = iA + 1;
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public final String e() throws CharacterCodingException {
        h('\"');
        int i = this.f24849a;
        ArrayAsSequence arrayAsSequence = this.h;
        int i2 = arrayAsSequence.e;
        char[] cArr = arrayAsSequence.d;
        int i3 = i;
        while (true) {
            if (i3 >= i2) {
                i3 = -1;
                break;
            }
            if (cArr[i3] == '\"') {
                break;
            }
            i3++;
        }
        if (i3 == -1) {
            int iA = A(i);
            if (iA != -1) {
                return k(arrayAsSequence, this.f24849a, iA);
            }
            AbstractJsonLexer.t(this, (byte) 1);
            throw null;
        }
        for (int i4 = i; i4 < i3; i4++) {
            if (cArr[i4] == '\\') {
                return k(arrayAsSequence, this.f24849a, i4);
            }
        }
        this.f24849a = i3 + 1;
        return StringsKt.n(cArr, i, Math.min(i3, arrayAsSequence.e));
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public byte f() throws CharacterCodingException {
        o();
        int i = this.f24849a;
        while (true) {
            int iA = A(i);
            if (iA == -1) {
                this.f24849a = iA;
                return (byte) 10;
            }
            int i2 = iA + 1;
            byte bA = AbstractJsonLexerKt.a(this.h.d[iA]);
            if (bA != 3) {
                this.f24849a = i2;
                return bA;
            }
            i = i2;
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public void h(char c) throws CharacterCodingException {
        o();
        int i = this.f24849a;
        while (true) {
            int iA = A(i);
            if (iA == -1) {
                this.f24849a = iA;
                F(c);
                throw null;
            }
            int i2 = iA + 1;
            char c2 = this.h.d[iA];
            if (c2 != ' ' && c2 != '\n' && c2 != '\r' && c2 != '\t') {
                this.f24849a = i2;
                if (c2 == c) {
                    return;
                }
                F(c);
                throw null;
            }
            i = i2;
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public final void o() throws CharacterCodingException {
        int i = this.h.e - this.f24849a;
        if (i > this.g) {
            return;
        }
        G(i);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public final CharSequence v() {
        return this.h;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public final String x(String keyToMatch, boolean z) {
        Intrinsics.h(keyToMatch, "keyToMatch");
        return null;
    }
}
