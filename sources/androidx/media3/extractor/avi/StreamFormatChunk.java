package androidx.media3.extractor.avi;

import androidx.media3.common.Format;

/* loaded from: classes2.dex */
final class StreamFormatChunk implements AviChunk {

    /* renamed from: a, reason: collision with root package name */
    public final Format f3267a;

    public StreamFormatChunk(Format format) {
        this.f3267a = format;
    }

    @Override // androidx.media3.extractor.avi.AviChunk
    public final int getType() {
        return 1718776947;
    }
}
