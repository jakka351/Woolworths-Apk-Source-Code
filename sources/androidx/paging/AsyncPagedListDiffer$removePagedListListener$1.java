package androidx.paging;

import androidx.paging.AsyncPagedListDiffer;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u0002H\u0002 \u0006*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00050\u0005H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "it", "Landroidx/paging/AsyncPagedListDiffer$PagedListListener;", "kotlin.jvm.PlatformType", "invoke", "(Landroidx/paging/AsyncPagedListDiffer$PagedListListener;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AsyncPagedListDiffer$removePagedListListener$1 extends Lambda implements Function1<AsyncPagedListDiffer.PagedListListener<Object>, Boolean> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AsyncPagedListDiffer.PagedListListener pagedListListener = (AsyncPagedListDiffer.PagedListListener) obj;
        return Boolean.valueOf((pagedListListener instanceof AsyncPagedListDiffer.OnCurrentListChangedWrapper) && ((AsyncPagedListDiffer.OnCurrentListChangedWrapper) pagedListListener).f3525a == null);
    }
}
