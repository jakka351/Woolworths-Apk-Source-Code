package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.SeekMap;

@UnstableApi
/* loaded from: classes2.dex */
public class ForwardingSeekMap implements SeekMap {

    /* renamed from: a, reason: collision with root package name */
    public final SeekMap f3241a;

    public ForwardingSeekMap(SeekMap seekMap) {
        this.f3241a = seekMap;
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints b(long j) {
        return this.f3241a.b(j);
    }

    @Override // androidx.media3.extractor.SeekMap
    public final boolean d() {
        return this.f3241a.d();
    }

    @Override // androidx.media3.extractor.SeekMap
    public long l() {
        return this.f3241a.l();
    }
}
