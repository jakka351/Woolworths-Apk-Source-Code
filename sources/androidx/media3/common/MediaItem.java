package androidx.media3.common;

import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class MediaItem {

    /* renamed from: a, reason: collision with root package name */
    public final String f2857a;
    public final LocalConfiguration b;
    public final LiveConfiguration c;
    public final MediaMetadata d;
    public final ClippingProperties e;
    public final RequestMetadata f;

    public static final class AdsConfiguration {

        public static final class Builder {
        }

        static {
            Util.E(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AdsConfiguration) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }
    }

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f2858a;
        public Uri b;
        public String c;
        public String g;
        public long i;
        public MediaMetadata j;
        public LiveConfiguration.Builder k;
        public RequestMetadata l;
        public ClippingConfiguration.Builder d = new ClippingConfiguration.Builder();
        public DrmConfiguration.Builder e = new DrmConfiguration.Builder();
        public List f = Collections.EMPTY_LIST;
        public ImmutableList h = ImmutableList.t();

        public Builder() {
            LiveConfiguration.Builder builder = new LiveConfiguration.Builder();
            builder.f2862a = -9223372036854775807L;
            builder.b = -9223372036854775807L;
            builder.c = -9223372036854775807L;
            builder.d = -3.4028235E38f;
            builder.e = -3.4028235E38f;
            this.k = builder;
            this.l = RequestMetadata.f2864a;
            this.i = -9223372036854775807L;
        }

        public final MediaItem a() {
            LocalConfiguration localConfiguration;
            this.e.getClass();
            Uri uri = this.b;
            if (uri != null) {
                String str = this.c;
                this.e.getClass();
                localConfiguration = new LocalConfiguration(uri, str, null, this.f, this.g, this.h, this.i);
            } else {
                localConfiguration = null;
            }
            String str2 = this.f2858a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            ClippingConfiguration.Builder builder = this.d;
            builder.getClass();
            ClippingProperties clippingProperties = new ClippingProperties(builder);
            LiveConfiguration.Builder builder2 = this.k;
            builder2.getClass();
            LiveConfiguration liveConfiguration = new LiveConfiguration(builder2);
            MediaMetadata mediaMetadata = this.j;
            if (mediaMetadata == null) {
                mediaMetadata = MediaMetadata.B;
            }
            return new MediaItem(str3, clippingProperties, localConfiguration, liveConfiguration, mediaMetadata, this.l);
        }
    }

    public static class ClippingConfiguration {

        /* renamed from: a, reason: collision with root package name */
        public final long f2859a;

        public static final class Builder {

            /* renamed from: a, reason: collision with root package name */
            public long f2860a = Long.MIN_VALUE;
        }

        static {
            new ClippingConfiguration(new Builder());
            Util.E(0);
            Util.E(1);
            Util.E(2);
            Util.E(3);
            Util.E(4);
            Util.E(5);
            Util.E(6);
        }

        public ClippingConfiguration(Builder builder) {
            int i = Util.f2928a;
            this.f2859a = builder.f2860a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClippingConfiguration) && this.f2859a == ((ClippingConfiguration) obj).f2859a;
        }

        public final int hashCode() {
            long j = this.f2859a;
            return ((((int) 0) * 31) + ((int) (j ^ (j >>> 32)))) * 29791;
        }
    }

    @UnstableApi
    @Deprecated
    public static final class ClippingProperties extends ClippingConfiguration {
        static {
            new ClippingProperties(new ClippingConfiguration.Builder());
        }
    }

    public static final class DrmConfiguration {

        public static final class Builder {
            public Builder() {
                ImmutableList.t();
            }
        }

        static {
            androidx.compose.ui.input.pointer.a.r(0, 1, 2, 3, 4);
            Util.E(5);
            Util.E(6);
            Util.E(7);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof DrmConfiguration) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }
    }

    public static final class LiveConfiguration {

        /* renamed from: a, reason: collision with root package name */
        public final long f2861a;
        public final long b;
        public final long c;
        public final float d;
        public final float e;

        public static final class Builder {

            /* renamed from: a, reason: collision with root package name */
            public long f2862a;
            public long b;
            public long c;
            public float d;
            public float e;
        }

        static {
            androidx.compose.ui.input.pointer.a.r(0, 1, 2, 3, 4);
        }

        public LiveConfiguration(Builder builder) {
            long j = builder.f2862a;
            long j2 = builder.b;
            long j3 = builder.c;
            float f = builder.d;
            float f2 = builder.e;
            this.f2861a = j;
            this.b = j2;
            this.c = j3;
            this.d = f;
            this.e = f2;
        }

        public final Builder a() {
            Builder builder = new Builder();
            builder.f2862a = this.f2861a;
            builder.b = this.b;
            builder.c = this.c;
            builder.d = this.d;
            builder.e = this.e;
            return builder;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LiveConfiguration)) {
                return false;
            }
            LiveConfiguration liveConfiguration = (LiveConfiguration) obj;
            return this.f2861a == liveConfiguration.f2861a && this.b == liveConfiguration.b && this.c == liveConfiguration.c && this.d == liveConfiguration.d && this.e == liveConfiguration.e;
        }

        public final int hashCode() {
            long j = this.f2861a;
            long j2 = this.b;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.c;
            int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
            float f = this.d;
            int iFloatToIntBits = (i2 + (f != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f) : 0)) * 31;
            float f2 = this.e;
            return iFloatToIntBits + (f2 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f2) : 0);
        }
    }

    public static final class LocalConfiguration {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f2863a;
        public final String b;
        public final DrmConfiguration c;
        public final List d;
        public final String e;
        public final ImmutableList f;
        public final long g;

        static {
            androidx.compose.ui.input.pointer.a.r(0, 1, 2, 3, 4);
            Util.E(5);
            Util.E(6);
            Util.E(7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LocalConfiguration(Uri uri, String str, DrmConfiguration drmConfiguration, List list, String str2, ImmutableList immutableList, long j) {
            this.f2863a = uri;
            this.b = MimeTypes.m(str);
            this.c = drmConfiguration;
            this.d = list;
            this.e = str2;
            this.f = immutableList;
            ImmutableList.Builder builderM = ImmutableList.m();
            for (int i = 0; i < immutableList.size(); i++) {
                ((SubtitleConfiguration) immutableList.get(i)).getClass();
                builderM.h(new Subtitle());
            }
            builderM.j();
            this.g = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocalConfiguration)) {
                return false;
            }
            LocalConfiguration localConfiguration = (LocalConfiguration) obj;
            return this.f2863a.equals(localConfiguration.f2863a) && Objects.equals(this.b, localConfiguration.b) && Objects.equals(this.c, localConfiguration.c) && this.d.equals(localConfiguration.d) && Objects.equals(this.e, localConfiguration.e) && this.f.equals(localConfiguration.f) && this.g == localConfiguration.g;
        }

        public final int hashCode() {
            int iHashCode = this.f2863a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = iHashCode + (str == null ? 0 : str.hashCode());
            if (this.c != null) {
                throw null;
            }
            int iHashCode3 = (this.d.hashCode() + (iHashCode2 * 29791)) * 31;
            return (int) (((this.f.hashCode() + ((iHashCode3 + (this.e != null ? r0.hashCode() : 0)) * 31)) * 31 * 31) + this.g);
        }
    }

    public static final class RequestMetadata {

        /* renamed from: a, reason: collision with root package name */
        public static final RequestMetadata f2864a = new RequestMetadata();

        public static final class Builder {
        }

        static {
            Util.E(0);
            Util.E(1);
            Util.E(2);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RequestMetadata);
        }

        public final int hashCode() {
            return 0;
        }
    }

    @UnstableApi
    @Deprecated
    public static final class Subtitle extends SubtitleConfiguration {
    }

    public static class SubtitleConfiguration {

        public static final class Builder {
        }

        static {
            androidx.compose.ui.input.pointer.a.r(0, 1, 2, 3, 4);
            Util.E(5);
            Util.E(6);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SubtitleConfiguration) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }
    }

    static {
        new Builder().a();
        androidx.compose.ui.input.pointer.a.r(0, 1, 2, 3, 4);
        Util.E(5);
    }

    public MediaItem(String str, ClippingProperties clippingProperties, LocalConfiguration localConfiguration, LiveConfiguration liveConfiguration, MediaMetadata mediaMetadata, RequestMetadata requestMetadata) {
        this.f2857a = str;
        this.b = localConfiguration;
        this.c = liveConfiguration;
        this.d = mediaMetadata;
        this.e = clippingProperties;
        this.f = requestMetadata;
    }

    public static MediaItem a(String str) {
        Builder builder = new Builder();
        builder.b = str == null ? null : Uri.parse(str);
        return builder.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaItem)) {
            return false;
        }
        MediaItem mediaItem = (MediaItem) obj;
        return Objects.equals(this.f2857a, mediaItem.f2857a) && this.e.equals(mediaItem.e) && Objects.equals(this.b, mediaItem.b) && this.c.equals(mediaItem.c) && Objects.equals(this.d, mediaItem.d) && Objects.equals(this.f, mediaItem.f);
    }

    public final int hashCode() {
        int iHashCode = this.f2857a.hashCode() * 31;
        LocalConfiguration localConfiguration = this.b;
        int iHashCode2 = (this.d.hashCode() + ((this.e.hashCode() + ((this.c.hashCode() + ((iHashCode + (localConfiguration != null ? localConfiguration.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f.getClass();
        return iHashCode2;
    }
}
