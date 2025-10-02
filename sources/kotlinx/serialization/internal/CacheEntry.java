package kotlinx.serialization.internal;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/CacheEntry;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class CacheEntry<T> {

    /* renamed from: a, reason: collision with root package name */
    public final KSerializer f24782a;

    public CacheEntry(KSerializer kSerializer) {
        this.f24782a = kSerializer;
    }
}
