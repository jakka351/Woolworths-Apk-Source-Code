package coil3.util;

import coil3.annotation.InternalCoilApi;
import coil3.network.NetworkFetcher;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcoil3/util/FetcherServiceLoaderTarget;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@InternalCoilApi
/* loaded from: classes.dex */
public interface FetcherServiceLoaderTarget<T> {
    default int a() {
        return 0;
    }

    NetworkFetcher.Factory b();

    KClass type();
}
