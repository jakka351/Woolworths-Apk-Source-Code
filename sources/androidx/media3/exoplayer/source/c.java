package androidx.media3.exoplayer.source;

import androidx.media3.common.Format;
import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.text.SubtitleExtractor;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements ExtractorsFactory, Consumer {
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(Object obj, Object obj2) {
        this.d = obj;
        this.e = obj2;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        MediaSourceEventListener.EventDispatcher eventDispatcher = (MediaSourceEventListener.EventDispatcher) this.d;
        ((MediaSourceEventListener) obj).M(eventDispatcher.f3131a, eventDispatcher.b, (MediaLoadData) this.e);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] c() {
        DefaultMediaSourceFactory defaultMediaSourceFactory = (DefaultMediaSourceFactory) this.d;
        Format format = (Format) this.e;
        return new Extractor[]{defaultMediaSourceFactory.e.a(format) ? new SubtitleExtractor(defaultMediaSourceFactory.e.c(format)) : new DefaultMediaSourceFactory.UnknownSubtitlesExtractor(format)};
    }
}
