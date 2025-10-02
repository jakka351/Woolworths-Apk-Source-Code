package androidx.media3.exoplayer.source;

import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.source.MediaSourceEventListener;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Consumer {
    public final /* synthetic */ int d;
    public final /* synthetic */ MediaSourceEventListener.EventDispatcher e;
    public final /* synthetic */ LoadEventInfo f;
    public final /* synthetic */ MediaLoadData g;

    public /* synthetic */ g(MediaSourceEventListener.EventDispatcher eventDispatcher, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
        this.d = i;
        this.e = eventDispatcher;
        this.f = loadEventInfo;
        this.g = mediaLoadData;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(Object obj) {
        MediaSourceEventListener mediaSourceEventListener = (MediaSourceEventListener) obj;
        switch (this.d) {
            case 0:
                MediaSourceEventListener.EventDispatcher eventDispatcher = this.e;
                mediaSourceEventListener.j0(eventDispatcher.f3131a, eventDispatcher.b, this.f, this.g);
                break;
            default:
                MediaSourceEventListener.EventDispatcher eventDispatcher2 = this.e;
                mediaSourceEventListener.J(eventDispatcher2.f3131a, eventDispatcher2.b, this.f, this.g);
                break;
        }
    }
}
