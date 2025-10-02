package au.com.woolworths.feature.shop.brandedshop.ui;

import androidx.compose.foundation.lazy.LazyListScope;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"brandedshop_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InvisibleStickyHeaderKt {
    public static final void a(LazyListScope lazyListScope, String key) {
        Intrinsics.h(lazyListScope, "<this>");
        Intrinsics.h(key, "key");
        LazyListScope.e(lazyListScope, "inv-header-".concat(key), ComposableSingletons$InvisibleStickyHeaderKt.f6708a, 2);
    }
}
