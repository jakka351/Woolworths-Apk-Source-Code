package androidx.media3.exoplayer;

import android.os.Handler;
import android.os.Message;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.BaseMediaSource;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SequenceableLoader;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

@UnstableApi
/* loaded from: classes2.dex */
public final class MetadataRetriever {

    public static final class MetadataRetrieverInternal {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f3019a = 0;

        public final class MediaSourceHandlerCallback implements Handler.Callback {

            public final class MediaSourceCaller implements MediaSource.MediaSourceCaller {

                public final class MediaPeriodCallback implements MediaPeriod.Callback {
                    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
                    public final void f(MediaPeriod mediaPeriod) {
                        throw null;
                    }

                    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
                    public final void g(SequenceableLoader sequenceableLoader) {
                        throw null;
                    }
                }

                @Override // androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller
                public final void C(BaseMediaSource baseMediaSource, Timeline timeline) {
                }
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    int i2 = MetadataRetrieverInternal.f3019a;
                    throw null;
                }
                if (i == 2) {
                    try {
                        throw null;
                    } catch (Exception unused) {
                        int i3 = MetadataRetrieverInternal.f3019a;
                        throw null;
                    }
                }
                if (i == 3 || i == 4) {
                    throw null;
                }
                return false;
            }
        }

        static {
            new ArrayDeque();
        }
    }

    public static final class SharedWorkerThread {
        static {
            new AtomicInteger(5);
        }
    }
}
