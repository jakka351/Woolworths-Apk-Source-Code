package androidx.media3.exoplayer;

import android.content.Context;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.RendererCapabilitiesList;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.video.VideoRendererEventListener;

@UnstableApi
/* loaded from: classes2.dex */
public final class DefaultRendererCapabilitiesList implements RendererCapabilitiesList {

    public static final class Factory implements RendererCapabilitiesList.Factory {

        /* renamed from: androidx.media3.exoplayer.DefaultRendererCapabilitiesList$Factory$1, reason: invalid class name */
        class AnonymousClass1 implements VideoRendererEventListener {
        }

        /* renamed from: androidx.media3.exoplayer.DefaultRendererCapabilitiesList$Factory$2, reason: invalid class name */
        class AnonymousClass2 implements AudioRendererEventListener {
        }

        public Factory(Context context) {
            new DefaultRenderersFactory(context);
        }
    }
}
