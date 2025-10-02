package au.com.woolworths.feature.shop.video;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.aem.components.model.video.VideoData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/video/FullPageVideoPlayerContract;", "", "ViewState", "video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FullPageVideoPlayerContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/video/FullPageVideoPlayerContract$ViewState;", "", "Companion", "video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {
        public static final ViewState c = new ViewState(null, 0);

        /* renamed from: a, reason: collision with root package name */
        public final VideoData f8214a;
        public final long b;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/video/FullPageVideoPlayerContract$ViewState$Companion;", "", "video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        public ViewState(VideoData videoData, long j) {
            this.f8214a = videoData;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.c(this.f8214a, viewState.f8214a) && this.b == viewState.b;
        }

        public final int hashCode() {
            VideoData videoData = this.f8214a;
            return Long.hashCode(this.b) + ((videoData == null ? 0 : videoData.hashCode()) * 31);
        }

        public final String toString() {
            return "ViewState(videoData=" + this.f8214a + ", videoProgress=" + this.b + ")";
        }
    }
}
