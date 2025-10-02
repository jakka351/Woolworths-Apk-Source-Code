package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3114a;
    public final /* synthetic */ MediaCodecAdapter.OnFrameRenderedListener b;

    public /* synthetic */ a(MediaCodecAdapter mediaCodecAdapter, MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, int i) {
        this.f3114a = i;
        this.b = onFrameRenderedListener;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        switch (this.f3114a) {
            case 0:
                this.b.a(j);
                break;
            default:
                this.b.a(j);
                break;
        }
    }
}
