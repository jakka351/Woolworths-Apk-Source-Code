package au.com.woolworths.compose.utils.list;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"compose-utils_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ItemUniqueInScreenKt {
    public static void a(LazyListScope lazyListScope, String str, UniqueIdValidator uniqueIdValidator, ComposableLambdaImpl composableLambdaImpl) {
        Intrinsics.h(lazyListScope, "<this>");
        Intrinsics.h(uniqueIdValidator, "uniqueIdValidator");
        lazyListScope.a(uniqueIdValidator.a(str), null, composableLambdaImpl);
    }
}
