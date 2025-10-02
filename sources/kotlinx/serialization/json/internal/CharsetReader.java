package kotlinx.serialization.json.internal;

import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/CharsetReader;", "", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CharsetReader {

    /* renamed from: a, reason: collision with root package name */
    public final ByteArrayInputStream f24856a;
    public final CharsetDecoder b;
    public final ByteBuffer c;
    public boolean d;
    public char e;

    public CharsetReader(ByteArrayInputStream byteArrayInputStream, Charset charset) {
        byte[] bArr;
        Intrinsics.h(charset, "charset");
        this.f24856a = byteArrayInputStream;
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        this.b = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        ByteArrayPool8k byteArrayPool8k = ByteArrayPool8k.c;
        synchronized (byteArrayPool8k) {
            ArrayDeque arrayDeque = byteArrayPool8k.f24853a;
            bArr = null;
            byte[] bArr2 = (byte[]) (arrayDeque.isEmpty() ? null : arrayDeque.removeLast());
            if (bArr2 != null) {
                byteArrayPool8k.b -= bArr2.length / 2;
                bArr = bArr2;
            }
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr == null ? new byte[8196] : bArr);
        this.c = byteBufferWrap;
        byteBufferWrap.flip();
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e5, code lost:
    
        r2 = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(char[] r11, int r12, int r13) throws java.nio.charset.CharacterCodingException {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.CharsetReader.a(char[], int, int):int");
    }
}
