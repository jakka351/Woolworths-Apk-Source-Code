package androidx.media3.exoplayer.mediacodec;

import android.content.Context;
import android.os.HandlerThread;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter;
import com.google.common.base.Supplier;

@UnstableApi
/* loaded from: classes2.dex */
public final class DefaultMediaCodecAdapterFactory implements MediaCodecAdapter.Factory {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3101a;

    public DefaultMediaCodecAdapterFactory(Context context) {
        this.f3101a = context;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.media3.exoplayer.mediacodec.b] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.media3.exoplayer.mediacodec.b] */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory
    public final MediaCodecAdapter a(MediaCodecAdapter.Configuration configuration) {
        Context context;
        int i = Util.f2928a;
        if (i < 23 || (i < 31 && ((context = this.f3101a) == null || i < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            return new SynchronousMediaCodecAdapter.Factory().a(configuration);
        }
        final int iH = MimeTypes.h(configuration.c.n);
        Log.f("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + Util.z(iH));
        final int i2 = 0;
        final int i3 = 1;
        return new AsynchronousMediaCodecAdapter.Factory(new Supplier() { // from class: androidx.media3.exoplayer.mediacodec.b
            @Override // com.google.common.base.Supplier
            public final Object get() {
                switch (i2) {
                    case 0:
                        return new HandlerThread(AsynchronousMediaCodecAdapter.q(iH, "ExoPlayer:MediaCodecAsyncAdapter:"));
                    default:
                        return new HandlerThread(AsynchronousMediaCodecAdapter.q(iH, "ExoPlayer:MediaCodecQueueingThread:"));
                }
            }
        }, new Supplier() { // from class: androidx.media3.exoplayer.mediacodec.b
            @Override // com.google.common.base.Supplier
            public final Object get() {
                switch (i3) {
                    case 0:
                        return new HandlerThread(AsynchronousMediaCodecAdapter.q(iH, "ExoPlayer:MediaCodecAsyncAdapter:"));
                    default:
                        return new HandlerThread(AsynchronousMediaCodecAdapter.q(iH, "ExoPlayer:MediaCodecQueueingThread:"));
                }
            }
        }).a(configuration);
    }
}
