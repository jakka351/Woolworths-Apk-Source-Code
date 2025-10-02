package au.com.woolworths.foundation.advertising.data.google;

import android.util.LruCache;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, d2 = {"au/com/woolworths/foundation/advertising/data/google/GoogleAdManagerRepository$cache$1", "Landroid/util/LruCache;", "Lau/com/woolworths/foundation/advertising/data/google/CacheKey;", "Lcom/google/android/gms/ads/nativead/NativeCustomFormatAd;", "advertising-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GoogleAdManagerRepository$cache$1 extends LruCache<CacheKey, NativeCustomFormatAd> {
    @Override // android.util.LruCache
    public final void entryRemoved(boolean z, CacheKey cacheKey, NativeCustomFormatAd nativeCustomFormatAd, NativeCustomFormatAd nativeCustomFormatAd2) {
        NativeCustomFormatAd nativeCustomFormatAd3 = nativeCustomFormatAd;
        if (nativeCustomFormatAd3 != null) {
            nativeCustomFormatAd3.destroy();
        }
    }
}
