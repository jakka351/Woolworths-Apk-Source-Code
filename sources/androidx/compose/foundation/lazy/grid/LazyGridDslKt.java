package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LazyGridDslKt {
    public static final void a(final GridCells.Fixed fixed, final Modifier modifier, final LazyGridState lazyGridState, PaddingValues paddingValues, final Arrangement.Vertical vertical, final Arrangement.Horizontal horizontal, FlingBehavior flingBehavior, boolean z, final Function1 function1, Composer composer, final int i) {
        final PaddingValues paddingValues2;
        final FlingBehavior flingBehavior2;
        final boolean z2;
        int i2;
        FlingBehavior flingBehaviorA;
        boolean z3;
        ComposerImpl composerImplV = composer.v(1485410512);
        int i3 = i | (composerImplV.n(fixed) ? 4 : 2) | (composerImplV.n(modifier) ? 32 : 16) | (composerImplV.n(lazyGridState) ? 256 : 128) | 104885248 | (composerImplV.I(function1) ? 536870912 : 268435456);
        if (composerImplV.z(i3 & 1, (306783379 & i3) != 306783378)) {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                float f = 0;
                PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(f, f, f, f);
                i2 = i3 & (-29360129);
                flingBehaviorA = ScrollableDefaults.a(composerImplV);
                paddingValues2 = paddingValuesImpl;
                z3 = true;
            } else {
                composerImplV.j();
                i2 = i3 & (-29360129);
                paddingValues2 = paddingValues;
                flingBehaviorA = flingBehavior;
                z3 = z;
            }
            composerImplV.W();
            b(fixed, modifier, lazyGridState, paddingValues2, false, vertical, horizontal, flingBehaviorA, z3, OverscrollKt.a(composerImplV), function1, composerImplV, i2 & 268435454, (i2 >> 27) & 14, 0);
            flingBehavior2 = flingBehaviorA;
            z2 = z3;
        } else {
            composerImplV.j();
            paddingValues2 = paddingValues;
            flingBehavior2 = flingBehavior;
            z2 = z;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(modifier, lazyGridState, paddingValues2, vertical, horizontal, flingBehavior2, z2, function1, i) { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$2
                public final /* synthetic */ Modifier i;
                public final /* synthetic */ LazyGridState j;
                public final /* synthetic */ PaddingValues k;
                public final /* synthetic */ Arrangement.Vertical l;
                public final /* synthetic */ Arrangement.Horizontal m;
                public final /* synthetic */ FlingBehavior n;
                public final /* synthetic */ boolean o;
                public final /* synthetic */ Function1 p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(1769473);
                    LazyGridDslKt.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final androidx.compose.foundation.lazy.grid.GridCells r30, androidx.compose.ui.Modifier r31, androidx.compose.foundation.lazy.grid.LazyGridState r32, androidx.compose.foundation.layout.PaddingValues r33, boolean r34, androidx.compose.foundation.layout.Arrangement.Vertical r35, androidx.compose.foundation.layout.Arrangement.Horizontal r36, androidx.compose.foundation.gestures.FlingBehavior r37, boolean r38, androidx.compose.foundation.OverscrollEffect r39, final kotlin.jvm.functions.Function1 r40, androidx.compose.runtime.Composer r41, final int r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 737
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridDslKt.b(androidx.compose.foundation.lazy.grid.GridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final ArrayList c(int i, int i2, int i3) {
        int i4 = i - ((i2 - 1) * i3);
        int i5 = i4 / i2;
        int i6 = i4 % i2;
        ArrayList arrayList = new ArrayList(i2);
        int i7 = 0;
        while (i7 < i2) {
            arrayList.add(Integer.valueOf((i7 < i6 ? 1 : 0) + i5));
            i7++;
        }
        return arrayList;
    }
}
