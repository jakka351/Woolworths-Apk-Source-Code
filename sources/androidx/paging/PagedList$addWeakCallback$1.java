package androidx.paging;

import androidx.paging.PagedList;
import com.google.android.gms.ads.RequestConfiguration;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "it", "Ljava/lang/ref/WeakReference;", "Landroidx/paging/PagedList$Callback;", "invoke", "(Ljava/lang/ref/WeakReference;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PagedList$addWeakCallback$1 extends Lambda implements Function1<WeakReference<PagedList.Callback>, Boolean> {
    public static final PagedList$addWeakCallback$1 h = new PagedList$addWeakCallback$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WeakReference it = (WeakReference) obj;
        Intrinsics.h(it, "it");
        return Boolean.valueOf(it.get() == null);
    }
}
