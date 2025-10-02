package androidx.compose.foundation.lazy;

import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.DefaultFlingBehavior;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LazyDslKt {
    public static final void a(final Modifier modifier, final LazyListState lazyListState, PaddingValues paddingValues, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, boolean z, final Function1 function1, Composer composer, final int i) {
        final PaddingValues paddingValues2;
        final Arrangement.Vertical vertical2;
        final Alignment.Horizontal horizontal2;
        final FlingBehavior flingBehavior2;
        final boolean z2;
        PaddingValues paddingValuesImpl;
        int i2;
        ComposerImpl composerImplV = composer.v(-740714857);
        int i3 = i | (composerImplV.n(modifier) ? 4 : 2) | (composerImplV.n(lazyListState) ? 32 : 16) | 13315456 | (composerImplV.I(function1) ? 67108864 : 33554432);
        if (composerImplV.z(i3 & 1, (38347923 & i3) != 38347922)) {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                float f = 0;
                paddingValuesImpl = new PaddingValuesImpl(f, f, f, f);
                Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
                DefaultFlingBehavior defaultFlingBehaviorA = ScrollableDefaults.a(composerImplV);
                i2 = i3 & (-3727361);
                horizontal2 = Alignment.Companion.m;
                z2 = true;
                flingBehavior2 = defaultFlingBehaviorA;
                vertical2 = arrangement$Top$1;
            } else {
                composerImplV.j();
                i2 = i3 & (-3727361);
                paddingValuesImpl = paddingValues;
                vertical2 = vertical;
                horizontal2 = horizontal;
                flingBehavior2 = flingBehavior;
                z2 = z;
            }
            composerImplV.W();
            b(modifier, lazyListState, paddingValuesImpl, false, vertical2, horizontal2, flingBehavior2, z2, OverscrollKt.a(composerImplV), function1, composerImplV, (33554430 & i2) | ((i2 << 3) & 1879048192), 0);
            paddingValues2 = paddingValuesImpl;
        } else {
            composerImplV.j();
            paddingValues2 = paddingValues;
            vertical2 = vertical;
            horizontal2 = horizontal;
            flingBehavior2 = flingBehavior;
            z2 = z;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(lazyListState, paddingValues2, vertical2, horizontal2, flingBehavior2, z2, function1, i) { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$2
                public final /* synthetic */ LazyListState i;
                public final /* synthetic */ PaddingValues j;
                public final /* synthetic */ Arrangement.Vertical k;
                public final /* synthetic */ Alignment.Horizontal l;
                public final /* synthetic */ FlingBehavior m;
                public final /* synthetic */ boolean n;
                public final /* synthetic */ Function1 o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(1);
                    LazyDslKt.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(androidx.compose.ui.Modifier r30, androidx.compose.foundation.lazy.LazyListState r31, androidx.compose.foundation.layout.PaddingValues r32, boolean r33, androidx.compose.foundation.layout.Arrangement.Vertical r34, androidx.compose.ui.Alignment.Horizontal r35, androidx.compose.foundation.gestures.FlingBehavior r36, boolean r37, androidx.compose.foundation.OverscrollEffect r38, final kotlin.jvm.functions.Function1 r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.b(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void c(final Modifier modifier, final LazyListState lazyListState, PaddingValues paddingValues, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, final FlingBehavior flingBehavior, boolean z, final Function1 function1, Composer composer, final int i) {
        final PaddingValues paddingValues2;
        final Arrangement.Horizontal horizontal2;
        final Alignment.Vertical vertical2;
        final boolean z2;
        PaddingValues paddingValuesImpl;
        int i2;
        ComposerImpl composerImplV = composer.v(-1724297413);
        int i3 = i | (composerImplV.n(modifier) ? 4 : 2) | (composerImplV.n(lazyListState) ? 32 : 16) | 208256 | (composerImplV.n(flingBehavior) ? 1048576 : 524288) | 12582912 | (composerImplV.I(function1) ? 67108864 : 33554432);
        if (composerImplV.z(i3 & 1, (38347923 & i3) != 38347922)) {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                float f = 0;
                paddingValuesImpl = new PaddingValuesImpl(f, f, f, f);
                i2 = i3 & (-57345);
                horizontal2 = Arrangement.f934a;
                vertical2 = Alignment.Companion.j;
                z2 = true;
            } else {
                composerImplV.j();
                i2 = i3 & (-57345);
                paddingValuesImpl = paddingValues;
                horizontal2 = horizontal;
                vertical2 = vertical;
                z2 = z;
            }
            composerImplV.W();
            d(modifier, lazyListState, paddingValuesImpl, false, horizontal2, vertical2, flingBehavior, z2, OverscrollKt.a(composerImplV), function1, composerImplV, (33554430 & i2) | ((i2 << 3) & 1879048192), 0);
            paddingValues2 = paddingValuesImpl;
        } else {
            composerImplV.j();
            paddingValues2 = paddingValues;
            horizontal2 = horizontal;
            vertical2 = vertical;
            z2 = z;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(lazyListState, paddingValues2, horizontal2, vertical2, flingBehavior, z2, function1, i) { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2
                public final /* synthetic */ LazyListState i;
                public final /* synthetic */ PaddingValues j;
                public final /* synthetic */ Arrangement.Horizontal k;
                public final /* synthetic */ Alignment.Vertical l;
                public final /* synthetic */ FlingBehavior m;
                public final /* synthetic */ boolean n;
                public final /* synthetic */ Function1 o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(1);
                    LazyDslKt.c(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(androidx.compose.ui.Modifier r30, androidx.compose.foundation.lazy.LazyListState r31, androidx.compose.foundation.layout.PaddingValues r32, boolean r33, androidx.compose.foundation.layout.Arrangement.Horizontal r34, androidx.compose.ui.Alignment.Vertical r35, androidx.compose.foundation.gestures.FlingBehavior r36, boolean r37, androidx.compose.foundation.OverscrollEffect r38, final kotlin.jvm.functions.Function1 r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.d(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }
}
