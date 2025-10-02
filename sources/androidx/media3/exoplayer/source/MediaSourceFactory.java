package androidx.media3.exoplayer.source;

import androidx.media3.common.MediaItem;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.MediaSource;

@UnstableApi
@Deprecated
/* loaded from: classes2.dex */
public interface MediaSourceFactory extends MediaSource.Factory {
    public static final MediaSourceFactory b = new AnonymousClass1();

    /* renamed from: androidx.media3.exoplayer.source.MediaSourceFactory$1, reason: invalid class name */
    public class AnonymousClass1 implements MediaSourceFactory {
        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public final MediaSource b(MediaItem mediaItem) {
            throw new UnsupportedOperationException();
        }
    }
}
