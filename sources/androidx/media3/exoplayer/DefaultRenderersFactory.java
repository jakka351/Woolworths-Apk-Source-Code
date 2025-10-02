package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.DefaultAudioOffloadSupportProvider;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.audio.MediaCodecAudioRenderer;
import androidx.media3.exoplayer.image.ImageDecoder;
import androidx.media3.exoplayer.image.ImageRenderer;
import androidx.media3.exoplayer.mediacodec.DefaultMediaCodecAdapterFactory;
import androidx.media3.exoplayer.mediacodec.MediaCodecSelector;
import androidx.media3.exoplayer.metadata.MetadataOutput;
import androidx.media3.exoplayer.metadata.MetadataRenderer;
import androidx.media3.exoplayer.text.TextOutput;
import androidx.media3.exoplayer.text.TextRenderer;
import androidx.media3.exoplayer.video.MediaCodecVideoRenderer;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import androidx.media3.exoplayer.video.spherical.CameraMotionRenderer;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;

@UnstableApi
/* loaded from: classes2.dex */
public class DefaultRenderersFactory implements RenderersFactory {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2998a;
    public final DefaultMediaCodecAdapterFactory b;
    public final long c = 5000;
    public final androidx.media3.exoplayer.mediacodec.d d = MediaCodecSelector.b;
    public final long e = -9223372036854775807L;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ExtensionRendererMode {
    }

    public DefaultRenderersFactory(Context context) {
        this.f2998a = context;
        this.b = new DefaultMediaCodecAdapterFactory(context);
    }

    @Override // androidx.media3.exoplayer.RenderersFactory
    public final Renderer[] a(Handler handler, VideoRendererEventListener videoRendererEventListener, AudioRendererEventListener audioRendererEventListener, TextOutput textOutput, MetadataOutput metadataOutput) {
        ArrayList arrayList = new ArrayList();
        Context context = this.f2998a;
        MediaCodecVideoRenderer.Builder builder = new MediaCodecVideoRenderer.Builder(context);
        builder.d = this.b;
        androidx.media3.exoplayer.mediacodec.d dVar = this.d;
        builder.c = dVar;
        builder.e = this.c;
        builder.f = handler;
        builder.g = videoRendererEventListener;
        builder.h = 50;
        builder.j = this.e;
        Assertions.f(!builder.b);
        Handler handler2 = builder.f;
        Assertions.f((handler2 == null && builder.g == null) || !(handler2 == null || builder.g == null));
        builder.b = true;
        arrayList.add(new MediaCodecVideoRenderer(builder));
        DefaultAudioSink.Builder builder2 = new DefaultAudioSink.Builder(context);
        Assertions.f(!builder2.d);
        builder2.d = true;
        if (builder2.c == null) {
            builder2.c = new DefaultAudioSink.DefaultAudioProcessorChain(new AudioProcessor[0]);
        }
        if (builder2.g == null) {
            builder2.g = new DefaultAudioOffloadSupportProvider(builder2.f3057a);
        }
        arrayList.add(new MediaCodecAudioRenderer(this.f2998a, this.b, dVar, handler, audioRendererEventListener, new DefaultAudioSink(builder2)));
        arrayList.add(new TextRenderer(textOutput, handler.getLooper()));
        Looper looper = handler.getLooper();
        arrayList.add(new MetadataRenderer(metadataOutput, looper));
        arrayList.add(new MetadataRenderer(metadataOutput, looper));
        arrayList.add(new CameraMotionRenderer());
        arrayList.add(new ImageRenderer(ImageDecoder.Factory.f3091a));
        return (Renderer[]) arrayList.toArray(new Renderer[0]);
    }

    @Override // androidx.media3.exoplayer.RenderersFactory
    public final void b(Renderer renderer) {
        renderer.e();
    }
}
