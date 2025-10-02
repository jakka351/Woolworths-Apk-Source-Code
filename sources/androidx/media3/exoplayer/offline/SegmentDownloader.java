package androidx.media3.exoplayer.offline;

import androidx.media3.common.util.RunnableFutureTask;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.cache.CacheWriter;
import androidx.media3.exoplayer.offline.FilterableManifest;
import java.io.IOException;

@UnstableApi
/* loaded from: classes2.dex */
public abstract class SegmentDownloader<M extends FilterableManifest<M>> implements Downloader {

    /* renamed from: androidx.media3.exoplayer.offline.SegmentDownloader$1, reason: invalid class name */
    class AnonymousClass1 extends RunnableFutureTask<FilterableManifest<Object>, IOException> {
        @Override // androidx.media3.common.util.RunnableFutureTask
        public final Object b() {
            throw null;
        }
    }

    public static final class ProgressNotifier implements CacheWriter.ProgressListener {
    }

    public static class Segment implements Comparable<Segment> {
        @Override // java.lang.Comparable
        public final int compareTo(Segment segment) {
            throw null;
        }
    }

    public static final class SegmentDownloadRunnable extends RunnableFutureTask<Void, IOException> {
        @Override // androidx.media3.common.util.RunnableFutureTask
        public final void a() {
            throw null;
        }

        @Override // androidx.media3.common.util.RunnableFutureTask
        public final Object b() {
            throw null;
        }
    }
}
