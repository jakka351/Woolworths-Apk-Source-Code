package androidx.media3.exoplayer.source;

import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import java.io.IOException;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Consumer {
    public final /* synthetic */ MediaSourceEventListener.EventDispatcher d;
    public final /* synthetic */ LoadEventInfo e;
    public final /* synthetic */ MediaLoadData f;
    public final /* synthetic */ IOException g;
    public final /* synthetic */ boolean h;

    public /* synthetic */ h(MediaSourceEventListener.EventDispatcher eventDispatcher, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        this.d = eventDispatcher;
        this.e = loadEventInfo;
        this.f = mediaLoadData;
        this.g = iOException;
        this.h = z;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(Object obj) {
        MediaSourceEventListener mediaSourceEventListener = (MediaSourceEventListener) obj;
        MediaSourceEventListener.EventDispatcher eventDispatcher = this.d;
        mediaSourceEventListener.H(eventDispatcher.f3131a, eventDispatcher.b, this.e, this.f, this.g, this.h);
    }
}
