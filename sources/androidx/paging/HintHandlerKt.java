package androidx.paging;

import androidx.annotation.RestrictTo;
import androidx.paging.ViewportHint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"paging-common_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes2.dex */
public final class HintHandlerKt {
    public static final boolean a(ViewportHint viewportHint, ViewportHint viewportHint2, LoadType loadType) {
        Intrinsics.h(viewportHint, "<this>");
        if (viewportHint2 == null || ((viewportHint2 instanceof ViewportHint.Initial) && (viewportHint instanceof ViewportHint.Access))) {
            return true;
        }
        if ((viewportHint instanceof ViewportHint.Initial) && (viewportHint2 instanceof ViewportHint.Access)) {
            return false;
        }
        return (viewportHint.c == viewportHint2.c && viewportHint.d == viewportHint2.d && viewportHint2.a(loadType) <= viewportHint.a(loadType)) ? false : true;
    }
}
