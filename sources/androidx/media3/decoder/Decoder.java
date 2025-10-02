package androidx.media3.decoder;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderException;

@UnstableApi
/* loaded from: classes2.dex */
public interface Decoder<I, O, E extends DecoderException> {
    Object a();

    void b(Object obj);

    void c(long j);

    Object d();

    void flush();

    String getName();

    void release();
}
