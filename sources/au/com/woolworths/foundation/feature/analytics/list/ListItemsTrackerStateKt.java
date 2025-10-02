package au.com.woolworths.foundation.feature.analytics.list;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"feature_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ListItemsTrackerStateKt {
    public static final ListItemsTrackerState a(LazyListState lazyListState, Function1 onItemSeen, Composer composer, int i) {
        Intrinsics.h(onItemSeen, "onItemSeen");
        composer.o(-633708465);
        composer.o(-1746271574);
        boolean z = ((((i & 14) ^ 6) > 4 && composer.n(lazyListState)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.q(1.0f)) || (i & 48) == 32) | ((((i & 896) ^ KyberEngine.KyberPolyBytes) > 256 && composer.n(onItemSeen)) || (i & KyberEngine.KyberPolyBytes) == 256);
        Object objG = composer.G();
        if (z || objG == Composer.Companion.f1624a) {
            objG = new ListItemsTrackerState(lazyListState, onItemSeen);
            composer.A(objG);
        }
        ListItemsTrackerState listItemsTrackerState = (ListItemsTrackerState) objG;
        composer.l();
        composer.l();
        return listItemsTrackerState;
    }
}
