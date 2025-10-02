package androidx.paging;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "loadType", "Landroidx/paging/LoadType;", "loadState", "Landroidx/paging/LoadState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PagedListAdapter$withLoadStateFooter$1 extends Lambda implements Function2<LoadType, LoadState, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        LoadType loadType = (LoadType) obj;
        LoadState loadState = (LoadState) obj2;
        Intrinsics.h(loadType, "loadType");
        Intrinsics.h(loadState, "loadState");
        if (loadType != LoadType.f) {
            return Unit.f24250a;
        }
        throw null;
    }
}
