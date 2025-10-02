package au.com.woolworths.foundation.shop.video.advertising.ui;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"video-advertising_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VideoAdUtilKt {
    public static final boolean a(float f, float f2, float f3, float f4) {
        return (Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(f + f2, f3) - Math.max(f, f4)) / f2) * ((float) 100) >= 50.0f;
    }
}
