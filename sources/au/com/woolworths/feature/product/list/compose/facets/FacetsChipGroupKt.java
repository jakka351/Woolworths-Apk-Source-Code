package au.com.woolworths.feature.product.list.compose.facets;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import au.com.woolworths.feature.product.list.data.ChipText;
import au.com.woolworths.feature.product.list.data.ProductListChip;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FacetsChipGroupKt {
    public static final void a(int i, Composer composer, List list, Function0 onFacetScroll, Function1 onFacetsChipClick, boolean z) {
        boolean z2;
        ComposerImpl composerImpl;
        Intrinsics.h(onFacetsChipClick, "onFacetsChipClick");
        Intrinsics.h(onFacetScroll, "onFacetScroll");
        ComposerImpl composerImplV = composer.v(-1309373559);
        int i2 = (composerImplV.I(list) ? 32 : 16) | i;
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onFacetsChipClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onFacetScroll) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            z2 = z;
            composerImpl = composerImplV;
        } else {
            LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composerImplV);
            Ref.IntRef intRef = new Ref.IntRef();
            PaddingValuesImpl paddingValuesImplA = PaddingKt.a(16, BitmapDescriptorFactory.HUE_RED, 2);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(8);
            composerImplV.o(-1746271574);
            boolean zI = ((i2 & 896) == 256) | composerImplV.I(list);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                z2 = z;
                objG = new a(list, z2, onFacetsChipClick, 0);
                composerImplV.A(objG);
            } else {
                z2 = z;
            }
            composerImplV.V(false);
            LazyDslKt.d(null, lazyListStateA, paddingValuesImplA, false, spacedAlignedG, null, null, false, null, (Function1) objG, composerImplV, 24960, 489);
            composerImpl = composerImplV;
            EffectsKt.e(composerImpl, lazyListStateA, new FacetsChipGroupKt$FacetsChipGroup$2(lazyListStateA, intRef, onFacetScroll, null));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(z2, list, onFacetsChipClick, onFacetScroll, i, 0);
        }
    }

    public static final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ProductListChip("1", true, new ChipText("View All", "View All"), null));
        arrayList.add(new ProductListChip("2", false, new ChipText("Chocolate Milk", "Chocolate Milk"), null));
        arrayList.add(new ProductListChip("3", false, new ChipText("Almond Milk", "Almond Milk"), null));
        arrayList.add(new ProductListChip("4", false, new ChipText("Skimmed Milk", "Skimmed Milk"), null));
        arrayList.add(new ProductListChip("5", false, new ChipText("A2 Milk", "A2 Milk"), null));
        return arrayList;
    }
}
