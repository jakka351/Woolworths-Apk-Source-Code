package au.com.woolworths.foundation.shop.video.advertising.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/video/advertising/data/VideoAdPlayerState;", "", "Companion", "video-advertising_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class VideoAdPlayerState {
    public static final VideoAdPlayerState g = new VideoAdPlayerState(true, false, 0, false, false, BitmapDescriptorFactory.HUE_RED);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8889a;
    public final boolean b;
    public final long c;
    public final boolean d;
    public final boolean e;
    public final float f;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/video/advertising/data/VideoAdPlayerState$Companion;", "", "video-advertising_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public VideoAdPlayerState(boolean z, boolean z2, long j, boolean z3, boolean z4, float f) {
        this.f8889a = z;
        this.b = z2;
        this.c = j;
        this.d = z3;
        this.e = z4;
        this.f = f;
    }

    public static VideoAdPlayerState a(VideoAdPlayerState videoAdPlayerState, boolean z, boolean z2, long j, boolean z3, boolean z4, float f, int i) {
        if ((i & 1) != 0) {
            z = videoAdPlayerState.f8889a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = videoAdPlayerState.b;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            j = videoAdPlayerState.c;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            z3 = videoAdPlayerState.d;
        }
        boolean z7 = z3;
        if ((i & 16) != 0) {
            z4 = videoAdPlayerState.e;
        }
        boolean z8 = z4;
        if ((i & 32) != 0) {
            f = videoAdPlayerState.f;
        }
        videoAdPlayerState.getClass();
        return new VideoAdPlayerState(z5, z6, j2, z7, z8, f);
    }

    public final boolean b() {
        return !this.d && this.f8889a && this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAdPlayerState)) {
            return false;
        }
        VideoAdPlayerState videoAdPlayerState = (VideoAdPlayerState) obj;
        return this.f8889a == videoAdPlayerState.f8889a && this.b == videoAdPlayerState.b && this.c == videoAdPlayerState.c && this.d == videoAdPlayerState.d && this.e == videoAdPlayerState.e && Float.compare(this.f, videoAdPlayerState.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + b.e(b.e(b.b(b.e(Boolean.hashCode(this.f8889a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbV = b.v("VideoAdPlayerState(playState=", ", videoAdVisibleInViewport=", ", currentPlayPosition=", this.f8889a, this.b);
        sbV.append(this.c);
        sbV.append(", pauseVideoAdOnExternalEvent=");
        sbV.append(this.d);
        sbV.append(", showLastFrame=");
        sbV.append(this.e);
        sbV.append(", vauYOffset=");
        sbV.append(this.f);
        sbV.append(")");
        return sbV.toString();
    }
}
