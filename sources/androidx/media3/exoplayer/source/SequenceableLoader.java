package androidx.media3.exoplayer.source;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.LoadingInfo;

@UnstableApi
/* loaded from: classes2.dex */
public interface SequenceableLoader {

    public interface Callback<T extends SequenceableLoader> {
        void g(SequenceableLoader sequenceableLoader);
    }

    boolean b();

    long k();

    void l(long j);

    boolean n(LoadingInfo loadingInfo);

    long o();
}
