package androidx.media3.exoplayer.audio;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.audio.DefaultAudioSink;

@UnstableApi
/* loaded from: classes2.dex */
public final class DefaultAudioOffloadSupportProvider implements DefaultAudioSink.AudioOffloadSupportProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3053a;
    public Boolean b;

    @RequiresApi
    public static final class Api29 {
    }

    @RequiresApi
    public static final class Api31 {
    }

    public DefaultAudioOffloadSupportProvider(@Nullable Context context) {
        this.f3053a = context;
    }
}
