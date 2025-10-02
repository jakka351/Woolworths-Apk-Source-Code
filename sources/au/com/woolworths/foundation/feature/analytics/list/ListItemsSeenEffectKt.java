package au.com.woolworths.foundation.feature.analytics.list;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import au.com.woolworths.feature.shop.homepage.presentation.marketplace.a;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002¨\u0006\u0007²\u0006\u001e\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00008\nX\u008a\u0084\u0002²\u0006\"\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0000\"\b\b\u0000\u0010\u0006*\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function1;", "", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "", "currentOnItemsSeen", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "feature_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ListItemsSeenEffectKt {
    public static final void a(ItemsSeenState state, Composer composer, int i) {
        Intrinsics.h(state, "state");
        ComposerImpl composerImplV = composer.v(251925942);
        int i2 = (composerImplV.n(state) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            MutableState mutableStateL = SnapshotStateKt.l(state.c, composerImplV);
            composerImplV.o(-1633490746);
            boolean zN = ((i2 & 14) == 4) | composerImplV.n(mutableStateL);
            Object objG = composerImplV.G();
            if (zN || objG == Composer.Companion.f1624a) {
                objG = new ListItemsSeenEffectKt$ListItemsSeenEffect$1$1(state, mutableStateL, null);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, state, (Function2) objG);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(i, 15, state);
        }
    }

    public static final void b(ListItemsTrackerState listItemsTrackerState, Composer composer, int i) {
        Intrinsics.h(listItemsTrackerState, "listItemsTrackerState");
        ComposerImpl composerImplV = composer.v(663483649);
        int i2 = (composerImplV.n(listItemsTrackerState) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            MutableState mutableStateL = SnapshotStateKt.l(listItemsTrackerState.b, composerImplV);
            LazyListState lazyListState = listItemsTrackerState.f8493a;
            composerImplV.o(-1633490746);
            boolean zN = ((i2 & 14) == 4) | composerImplV.n(mutableStateL);
            Object objG = composerImplV.G();
            if (zN || objG == Composer.Companion.f1624a) {
                objG = new ListItemsSeenEffectKt$ListItemsSeenEffect$3$1(listItemsTrackerState, mutableStateL, null);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            EffectsKt.f(lazyListState, listItemsTrackerState, (Function2) objG, composerImplV);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(i, 14, listItemsTrackerState);
        }
    }

    public static final ArrayList c(LazyListLayoutInfo lazyListLayoutInfo, float f) {
        Intrinsics.h(lazyListLayoutInfo, "<this>");
        List listF = lazyListLayoutInfo.f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF) {
            LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) obj;
            float q = lazyListItemInfo.getQ() * f;
            if (lazyListItemInfo.getQ() + lazyListItemInfo.getP() + q >= lazyListLayoutInfo.getL() && lazyListItemInfo.getP() + q <= lazyListLayoutInfo.getM()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final boolean d(LazyListLayoutInfo lazyListLayoutInfo, LazyListItemInfo lazyListItemInfo) {
        Intrinsics.h(lazyListLayoutInfo, "<this>");
        return ((float) ((lazyListItemInfo.getQ() - Math.max(0, lazyListLayoutInfo.getL() - lazyListItemInfo.getP())) - Math.max(0, (lazyListItemInfo.getQ() + lazyListItemInfo.getP()) - lazyListLayoutInfo.getM()))) / ((float) lazyListItemInfo.getQ()) > 0.5f;
    }

    public static final ItemsSeenState e(LazyListState lazyListState, float f, Function1 onItemsSeen, Composer composer, int i, int i2) {
        Intrinsics.h(onItemsSeen, "onItemsSeen");
        composer.o(-837515039);
        if ((i2 & 2) != 0) {
            f = 1.0f;
        }
        composer.o(-1746271574);
        boolean z = ((((i & 14) ^ 6) > 4 && composer.n(lazyListState)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.q(f)) || (i & 48) == 32) | ((((i & 896) ^ KyberEngine.KyberPolyBytes) > 256 && composer.n(onItemsSeen)) || (i & KyberEngine.KyberPolyBytes) == 256);
        Object objG = composer.G();
        if (z || objG == Composer.Companion.f1624a) {
            objG = new ItemsSeenState(f, lazyListState, onItemsSeen);
            composer.A(objG);
        }
        ItemsSeenState itemsSeenState = (ItemsSeenState) objG;
        composer.l();
        composer.l();
        return itemsSeenState;
    }
}
