package androidx.media3.extractor.text;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.DecoderOutputBuffer;
import androidx.media3.decoder.SimpleDecoder;
import java.nio.ByteBuffer;

@UnstableApi
/* loaded from: classes2.dex */
public abstract class SimpleSubtitleDecoder extends SimpleDecoder<SubtitleInputBuffer, SubtitleOutputBuffer, SubtitleDecoderException> implements SubtitleDecoder {
    public final String o;

    public SimpleSubtitleDecoder(String str) {
        super(new SubtitleInputBuffer[2], new SubtitleOutputBuffer[2]);
        this.o = str;
        int i = this.g;
        DecoderInputBuffer[] decoderInputBufferArr = this.e;
        Assertions.f(i == decoderInputBufferArr.length);
        for (DecoderInputBuffer decoderInputBuffer : decoderInputBufferArr) {
            decoderInputBuffer.n(1024);
        }
    }

    @Override // androidx.media3.extractor.text.SubtitleDecoder
    public final void f(long j) {
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    public final DecoderInputBuffer g() {
        return new SubtitleInputBuffer(1);
    }

    @Override // androidx.media3.decoder.Decoder
    public final String getName() {
        return this.o;
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    public final DecoderOutputBuffer h() {
        return new SubtitleOutputBuffer() { // from class: androidx.media3.extractor.text.SimpleSubtitleDecoder.1
            @Override // androidx.media3.decoder.DecoderOutputBuffer
            public final void m() {
                SimpleSubtitleDecoder.this.m(this);
            }
        };
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    public final DecoderException i(Throwable th) {
        return new SubtitleDecoderException("Unexpected decode error", th);
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    public final DecoderException j(DecoderInputBuffer decoderInputBuffer, DecoderOutputBuffer decoderOutputBuffer, boolean z) {
        SubtitleInputBuffer subtitleInputBuffer = (SubtitleInputBuffer) decoderInputBuffer;
        SubtitleOutputBuffer subtitleOutputBuffer = (SubtitleOutputBuffer) decoderOutputBuffer;
        try {
            ByteBuffer byteBuffer = subtitleInputBuffer.g;
            byteBuffer.getClass();
            Subtitle subtitleN = n(byteBuffer.array(), byteBuffer.limit(), z);
            long j = subtitleInputBuffer.i;
            long j2 = subtitleInputBuffer.l;
            subtitleOutputBuffer.e = j;
            subtitleOutputBuffer.h = subtitleN;
            if (j2 != Long.MAX_VALUE) {
                j = j2;
            }
            subtitleOutputBuffer.i = j;
            subtitleOutputBuffer.g = false;
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }

    public abstract Subtitle n(byte[] bArr, int i, boolean z);
}
