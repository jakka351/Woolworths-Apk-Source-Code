package androidx.paging;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/paging/MulticastedPagingData;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class MulticastedPagingData<T> {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f3548a;
    public final PagingData b;
    public final CachedPageEventFlow c;

    public MulticastedPagingData(CoroutineScope scope, PagingData parent) {
        Intrinsics.h(scope, "scope");
        Intrinsics.h(parent, "parent");
        this.f3548a = scope;
        this.b = parent;
        this.c = new CachedPageEventFlow(parent.f3573a, scope);
    }
}
