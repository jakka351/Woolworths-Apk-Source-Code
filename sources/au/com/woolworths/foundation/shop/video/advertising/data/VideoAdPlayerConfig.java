package au.com.woolworths.foundation.shop.video.advertising.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/video/advertising/data/VideoAdPlayerConfig;", "", "video-advertising_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class VideoAdPlayerConfig {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoAdPlayerConfig) && Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Float.hashCode(BitmapDescriptorFactory.HUE_RED) * 31);
    }

    public final String toString() {
        return "VideoAdPlayerConfig(volume=0.0, showDefaultController=false)";
    }
}
