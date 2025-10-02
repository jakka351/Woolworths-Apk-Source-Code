package androidx.media3.exoplayer.source;

import android.content.Context;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.exoplayer.source.ClippingMediaSource;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.exoplayer.source.SingleSampleMediaSource;
import androidx.media3.exoplayer.source.ads.AdsLoader;
import androidx.media3.extractor.DefaultExtractorsFactory;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.DefaultSubtitleParserFactory;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.GenericDeclaration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class DefaultMediaSourceFactory implements MediaSourceFactory {
    public static final /* synthetic */ int l = 0;
    public final DelegateFactoryLoader c;
    public final DefaultDataSource.Factory d;
    public DefaultSubtitleParserFactory e;
    public final long f;
    public final long g;
    public final long h;
    public final float i;
    public final float j;
    public boolean k;

    @UnstableApi
    @Deprecated
    public interface AdsLoaderProvider extends AdsLoader.Provider {
    }

    public static final class DelegateFactoryLoader {

        /* renamed from: a, reason: collision with root package name */
        public final DefaultExtractorsFactory f3122a;
        public DefaultDataSource.Factory d;
        public DefaultSubtitleParserFactory f;
        public final HashMap b = new HashMap();
        public final HashMap c = new HashMap();
        public boolean e = true;

        public DelegateFactoryLoader(DefaultExtractorsFactory defaultExtractorsFactory, DefaultSubtitleParserFactory defaultSubtitleParserFactory) {
            this.f3122a = defaultExtractorsFactory;
            this.f = defaultSubtitleParserFactory;
        }

        public final Supplier a(int i) {
            Supplier supplier;
            Supplier supplier2;
            Integer numValueOf = Integer.valueOf(i);
            HashMap map = this.b;
            Supplier supplier3 = (Supplier) map.get(numValueOf);
            if (supplier3 != null) {
                return supplier3;
            }
            final DefaultDataSource.Factory factory = this.d;
            factory.getClass();
            if (i != 0) {
                final int i2 = 1;
                if (i != 1) {
                    final int i3 = 2;
                    if (i != 2) {
                        final int i4 = 3;
                        if (i == 3) {
                            final Class<? extends U> clsAsSubclass = Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(MediaSource.Factory.class);
                            supplier = new Supplier() { // from class: androidx.media3.exoplayer.source.e
                                @Override // com.google.common.base.Supplier
                                public final Object get() {
                                    Class cls = clsAsSubclass;
                                    int i5 = DefaultMediaSourceFactory.l;
                                    try {
                                        return (MediaSource.Factory) cls.getConstructor(null).newInstance(null);
                                    } catch (Exception e) {
                                        throw new IllegalStateException(e);
                                    }
                                }
                            };
                        } else {
                            if (i != 4) {
                                throw new IllegalArgumentException(YU.a.d(i, "Unrecognized contentType: "));
                            }
                            supplier = new Supplier() { // from class: androidx.media3.exoplayer.source.d
                                @Override // com.google.common.base.Supplier
                                public final Object get() {
                                    switch (i4) {
                                        case 0:
                                            return DefaultMediaSourceFactory.e((Class) this, factory);
                                        case 1:
                                            return DefaultMediaSourceFactory.e((Class) this, factory);
                                        case 2:
                                            return DefaultMediaSourceFactory.e((Class) this, factory);
                                        default:
                                            return new ProgressiveMediaSource.Factory(factory, ((DefaultMediaSourceFactory.DelegateFactoryLoader) this).f3122a);
                                    }
                                }
                            };
                        }
                    } else {
                        final GenericDeclaration genericDeclarationAsSubclass = Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(MediaSource.Factory.class);
                        supplier2 = new Supplier() { // from class: androidx.media3.exoplayer.source.d
                            @Override // com.google.common.base.Supplier
                            public final Object get() {
                                switch (i3) {
                                    case 0:
                                        return DefaultMediaSourceFactory.e((Class) genericDeclarationAsSubclass, factory);
                                    case 1:
                                        return DefaultMediaSourceFactory.e((Class) genericDeclarationAsSubclass, factory);
                                    case 2:
                                        return DefaultMediaSourceFactory.e((Class) genericDeclarationAsSubclass, factory);
                                    default:
                                        return new ProgressiveMediaSource.Factory(factory, ((DefaultMediaSourceFactory.DelegateFactoryLoader) genericDeclarationAsSubclass).f3122a);
                                }
                            }
                        };
                    }
                } else {
                    final GenericDeclaration genericDeclarationAsSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(MediaSource.Factory.class);
                    supplier2 = new Supplier() { // from class: androidx.media3.exoplayer.source.d
                        @Override // com.google.common.base.Supplier
                        public final Object get() {
                            switch (i2) {
                                case 0:
                                    return DefaultMediaSourceFactory.e((Class) genericDeclarationAsSubclass2, factory);
                                case 1:
                                    return DefaultMediaSourceFactory.e((Class) genericDeclarationAsSubclass2, factory);
                                case 2:
                                    return DefaultMediaSourceFactory.e((Class) genericDeclarationAsSubclass2, factory);
                                default:
                                    return new ProgressiveMediaSource.Factory(factory, ((DefaultMediaSourceFactory.DelegateFactoryLoader) genericDeclarationAsSubclass2).f3122a);
                            }
                        }
                    };
                }
                supplier = supplier2;
            } else {
                final GenericDeclaration genericDeclarationAsSubclass3 = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(MediaSource.Factory.class);
                final int i5 = 0;
                supplier = new Supplier() { // from class: androidx.media3.exoplayer.source.d
                    @Override // com.google.common.base.Supplier
                    public final Object get() {
                        switch (i5) {
                            case 0:
                                return DefaultMediaSourceFactory.e((Class) genericDeclarationAsSubclass3, factory);
                            case 1:
                                return DefaultMediaSourceFactory.e((Class) genericDeclarationAsSubclass3, factory);
                            case 2:
                                return DefaultMediaSourceFactory.e((Class) genericDeclarationAsSubclass3, factory);
                            default:
                                return new ProgressiveMediaSource.Factory(factory, ((DefaultMediaSourceFactory.DelegateFactoryLoader) genericDeclarationAsSubclass3).f3122a);
                        }
                    }
                };
            }
            map.put(Integer.valueOf(i), supplier);
            return supplier;
        }
    }

    public static final class UnknownSubtitlesExtractor implements Extractor {

        /* renamed from: a, reason: collision with root package name */
        public final Format f3123a;

        public UnknownSubtitlesExtractor(Format format) {
            this.f3123a = format;
        }

        @Override // androidx.media3.extractor.Extractor
        public final void a(long j, long j2) {
        }

        @Override // androidx.media3.extractor.Extractor
        public final int f(ExtractorInput extractorInput, PositionHolder positionHolder) {
            return extractorInput.f(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // androidx.media3.extractor.Extractor
        public final boolean i(ExtractorInput extractorInput) {
            return true;
        }

        @Override // androidx.media3.extractor.Extractor
        public final void j(ExtractorOutput extractorOutput) {
            TrackOutput trackOutputJ = extractorOutput.j(0, 3);
            extractorOutput.q(new SeekMap.Unseekable(-9223372036854775807L));
            extractorOutput.h();
            Format format = this.f3123a;
            Format.Builder builderA = format.a();
            builderA.m = MimeTypes.m("text/x-unknown");
            builderA.j = format.n;
            trackOutputJ.e(new Format(builderA));
        }

        @Override // androidx.media3.extractor.Extractor
        public final void release() {
        }
    }

    public DefaultMediaSourceFactory(Context context) {
        this(new DefaultDataSource.Factory(context), new DefaultExtractorsFactory());
    }

    public static MediaSource.Factory e(Class cls, DataSource.Factory factory) {
        try {
            return (MediaSource.Factory) cls.getConstructor(DataSource.Factory.class).newInstance(factory);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public final void a(boolean z) {
        this.k = z;
        DelegateFactoryLoader delegateFactoryLoader = this.c;
        delegateFactoryLoader.e = z;
        DefaultExtractorsFactory defaultExtractorsFactory = delegateFactoryLoader.f3122a;
        synchronized (defaultExtractorsFactory) {
            defaultExtractorsFactory.e = z;
        }
        Iterator it = delegateFactoryLoader.c.values().iterator();
        while (it.hasNext()) {
            ((MediaSource.Factory) it.next()).a(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public final MediaSource b(MediaItem mediaItem) {
        MediaItem.DrmConfiguration.Builder builder;
        mediaItem.b.getClass();
        String scheme = mediaItem.b.f2863a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (Objects.equals(mediaItem.b.b, "application/x-image-uri")) {
            long j = mediaItem.b.g;
            int i = Util.f2928a;
            throw null;
        }
        MediaItem.LocalConfiguration localConfiguration = mediaItem.b;
        int iC = Util.C(localConfiguration.f2863a, localConfiguration.b);
        if (mediaItem.b.g != -9223372036854775807L) {
            DefaultExtractorsFactory defaultExtractorsFactory = this.c.f3122a;
            synchronized (defaultExtractorsFactory) {
                defaultExtractorsFactory.g = 1;
            }
        }
        try {
            DelegateFactoryLoader delegateFactoryLoader = this.c;
            HashMap map = delegateFactoryLoader.c;
            MediaSource.Factory factory = (MediaSource.Factory) map.get(Integer.valueOf(iC));
            if (factory == null) {
                factory = (MediaSource.Factory) delegateFactoryLoader.a(iC).get();
                factory.d(delegateFactoryLoader.f);
                factory.a(delegateFactoryLoader.e);
                factory.c();
                map.put(Integer.valueOf(iC), factory);
            }
            MediaItem.LiveConfiguration.Builder builderA = mediaItem.c.a();
            MediaItem.LiveConfiguration liveConfiguration = mediaItem.c;
            if (liveConfiguration.f2861a == -9223372036854775807L) {
                builderA.f2862a = this.f;
            }
            if (liveConfiguration.d == -3.4028235E38f) {
                builderA.d = this.i;
            }
            if (liveConfiguration.e == -3.4028235E38f) {
                builderA.e = this.j;
            }
            if (liveConfiguration.b == -9223372036854775807L) {
                builderA.b = this.g;
            }
            if (liveConfiguration.c == -9223372036854775807L) {
                builderA.c = this.h;
            }
            MediaItem.LiveConfiguration liveConfiguration2 = new MediaItem.LiveConfiguration(builderA);
            if (!liveConfiguration2.equals(mediaItem.c)) {
                mediaItem.getClass();
                MediaItem.Builder builder2 = new MediaItem.Builder();
                MediaItem.ClippingProperties clippingProperties = mediaItem.e;
                MediaItem.ClippingConfiguration.Builder builder3 = new MediaItem.ClippingConfiguration.Builder();
                builder3.f2860a = clippingProperties.f2859a;
                builder2.d = builder3;
                builder2.f2858a = mediaItem.f2857a;
                builder2.j = mediaItem.d;
                builder2.k = mediaItem.c.a();
                builder2.l = mediaItem.f;
                MediaItem.LocalConfiguration localConfiguration2 = mediaItem.b;
                if (localConfiguration2 != null) {
                    builder2.g = localConfiguration2.e;
                    builder2.c = localConfiguration2.b;
                    builder2.b = localConfiguration2.f2863a;
                    builder2.f = localConfiguration2.d;
                    builder2.h = localConfiguration2.f;
                    MediaItem.DrmConfiguration drmConfiguration = localConfiguration2.c;
                    if (drmConfiguration != null) {
                        drmConfiguration.getClass();
                        builder = new MediaItem.DrmConfiguration.Builder();
                    } else {
                        builder = new MediaItem.DrmConfiguration.Builder();
                    }
                    builder2.e = builder;
                    builder2.i = localConfiguration2.g;
                }
                builder2.k = liveConfiguration2.a();
                mediaItem = builder2.a();
            }
            MediaSource mediaSourceB = factory.b(mediaItem);
            ImmutableList immutableList = mediaItem.b.f;
            if (!immutableList.isEmpty()) {
                MediaSource[] mediaSourceArr = new MediaSource[immutableList.size() + 1];
                mediaSourceArr[0] = mediaSourceB;
                if (immutableList.size() > 0) {
                    if (!this.k) {
                        DefaultDataSource.Factory factory2 = this.d;
                        new SingleSampleMediaSource((MediaItem.SubtitleConfiguration) immutableList.get(0), factory2, new SingleSampleMediaSource.Factory(factory2).b);
                        throw null;
                    }
                    Format.Builder builder4 = new Format.Builder();
                    ((MediaItem.SubtitleConfiguration) immutableList.get(0)).getClass();
                    ArrayList arrayList = MimeTypes.f2869a;
                    builder4.m = null;
                    ((MediaItem.SubtitleConfiguration) immutableList.get(0)).getClass();
                    builder4.d = null;
                    ((MediaItem.SubtitleConfiguration) immutableList.get(0)).getClass();
                    builder4.e = 0;
                    ((MediaItem.SubtitleConfiguration) immutableList.get(0)).getClass();
                    builder4.f = 0;
                    ((MediaItem.SubtitleConfiguration) immutableList.get(0)).getClass();
                    builder4.b = null;
                    ((MediaItem.SubtitleConfiguration) immutableList.get(0)).getClass();
                    builder4.f2855a = null;
                    Format format = new Format(builder4);
                    ProgressiveMediaSource.Factory factory3 = new ProgressiveMediaSource.Factory(this.d, new c(this, format));
                    if (this.e.a(format)) {
                        Format.Builder builderA2 = format.a();
                        builderA2.m = MimeTypes.m("application/x-media3-cues");
                        builderA2.j = format.n;
                        builderA2.I = this.e.b(format);
                        format = new Format(builderA2);
                    }
                    factory3.h = format;
                    ((MediaItem.SubtitleConfiguration) immutableList.get(0)).getClass();
                    throw null;
                }
                mediaSourceB = new MergingMediaSource(mediaSourceArr);
            }
            MediaItem.ClippingProperties clippingProperties2 = mediaItem.e;
            if (clippingProperties2.f2859a != Long.MIN_VALUE) {
                ClippingMediaSource.Builder builder5 = new ClippingMediaSource.Builder(mediaSourceB);
                Assertions.f(!builder5.d);
                long j2 = clippingProperties2.f2859a;
                Assertions.f(!builder5.d);
                builder5.b = j2;
                Assertions.f(!builder5.d);
                builder5.c = true;
                Assertions.f(!builder5.d);
                Assertions.f(!builder5.d);
                builder5.d = true;
                mediaSourceB = new ClippingMediaSource(builder5);
            }
            mediaItem.b.getClass();
            mediaItem.b.getClass();
            return mediaSourceB;
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public final void c() {
        DelegateFactoryLoader delegateFactoryLoader = this.c;
        delegateFactoryLoader.getClass();
        synchronized (delegateFactoryLoader.f3122a) {
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public final void d(DefaultSubtitleParserFactory defaultSubtitleParserFactory) {
        this.e = defaultSubtitleParserFactory;
        DelegateFactoryLoader delegateFactoryLoader = this.c;
        delegateFactoryLoader.f = defaultSubtitleParserFactory;
        DefaultExtractorsFactory defaultExtractorsFactory = delegateFactoryLoader.f3122a;
        synchronized (defaultExtractorsFactory) {
            defaultExtractorsFactory.f = defaultSubtitleParserFactory;
        }
        Iterator it = delegateFactoryLoader.c.values().iterator();
        while (it.hasNext()) {
            ((MediaSource.Factory) it.next()).d(defaultSubtitleParserFactory);
        }
    }

    public DefaultMediaSourceFactory(DefaultDataSource.Factory factory, DefaultExtractorsFactory defaultExtractorsFactory) {
        this.d = factory;
        DefaultSubtitleParserFactory defaultSubtitleParserFactory = new DefaultSubtitleParserFactory();
        this.e = defaultSubtitleParserFactory;
        DelegateFactoryLoader delegateFactoryLoader = new DelegateFactoryLoader(defaultExtractorsFactory, defaultSubtitleParserFactory);
        this.c = delegateFactoryLoader;
        if (factory != delegateFactoryLoader.d) {
            delegateFactoryLoader.d = factory;
            delegateFactoryLoader.b.clear();
            delegateFactoryLoader.c.clear();
        }
        this.f = -9223372036854775807L;
        this.g = -9223372036854775807L;
        this.h = -9223372036854775807L;
        this.i = -3.4028235E38f;
        this.j = -3.4028235E38f;
        this.k = true;
    }
}
