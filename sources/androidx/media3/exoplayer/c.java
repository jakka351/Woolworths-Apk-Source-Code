package androidx.media3.exoplayer;

import android.content.Context;
import androidx.media3.common.audio.AudioManagerCompat;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import androidx.media3.extractor.DefaultExtractorsFactory;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Supplier {
    public final /* synthetic */ int d;
    public final /* synthetic */ Context e;

    public /* synthetic */ c(Context context, int i) {
        this.d = i;
        this.e = context;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        DefaultBandwidthMeter defaultBandwidthMeter;
        switch (this.d) {
            case 0:
                return AudioManagerCompat.a(this.e);
            case 1:
                return new DefaultRenderersFactory(this.e);
            case 2:
                Context context = this.e;
                return new DefaultMediaSourceFactory(new DefaultDataSource.Factory(context), new DefaultExtractorsFactory());
            case 3:
                return new DefaultTrackSelector(this.e);
            default:
                Context context2 = this.e;
                ImmutableList immutableList = DefaultBandwidthMeter.p;
                synchronized (DefaultBandwidthMeter.class) {
                    try {
                        if (DefaultBandwidthMeter.v == null) {
                            DefaultBandwidthMeter.Builder builder = new DefaultBandwidthMeter.Builder(context2);
                            DefaultBandwidthMeter.v = new DefaultBandwidthMeter(builder.f3180a, builder.b, builder.c, builder.d, builder.e);
                        }
                        defaultBandwidthMeter = DefaultBandwidthMeter.v;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return defaultBandwidthMeter;
        }
    }
}
