package androidx.paging.compose;

import au.com.woolworths.shop.ratingsandreviews.ui.shared.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"paging-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LazyFoundationExtensionsKt {
    public static final Function1 a(final LazyPagingItems lazyPagingItems, final a aVar) {
        return new Function1<Integer, Object>() { // from class: androidx.paging.compose.LazyFoundationExtensionsKt$itemKey$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int iIntValue = ((Number) obj).intValue();
                Object obj2 = lazyPagingItems.c().get(iIntValue);
                return obj2 == null ? new PagingPlaceholderKey(iIntValue) : aVar.invoke(obj2);
            }
        };
    }
}
