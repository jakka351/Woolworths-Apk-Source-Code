package au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.TabKt;
import androidx.compose.material.TabRowKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.shop.contentpage.ui.n;
import au.com.woolworths.feature.shop.instore.navigation.map.data.Floor;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "selectedFloorIndex", "instore-navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FloorSelectorKt {
    public static final void a(final List floors, final Floor floor, final Function1 onFloorSelected, final Modifier modifier, Composer composer, final int i) {
        final List list;
        Floor floor2;
        final Function1 function1;
        final Modifier modifier2;
        final int i2;
        Intrinsics.h(floors, "floors");
        Intrinsics.h(onFloorSelected, "onFloorSelected");
        ComposerImpl composerImplV = composer.v(-1598747366);
        int i3 = (composerImplV.I(floors) ? 4 : 2) | i | (composerImplV.n(floor) ? 32 : 16) | (composerImplV.I(onFloorSelected) ? 256 : 128);
        if ((i3 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            list = floors;
            floor2 = floor;
            function1 = onFloorSelected;
            modifier2 = modifier;
            i2 = i;
        } else {
            if (floors.size() < 2) {
                RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
                if (recomposeScopeImplX != null) {
                    final int i4 = 0;
                    recomposeScopeImplX.d = new Function2(floors, floor, onFloorSelected, modifier, i, i4) { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.b
                        public final /* synthetic */ int d;
                        public final /* synthetic */ List e;
                        public final /* synthetic */ Floor f;
                        public final /* synthetic */ Function1 g;
                        public final /* synthetic */ Modifier h;

                        {
                            this.d = i4;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.d) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iA = RecomposeScopeImplKt.a(3073);
                                    FloorSelectorKt.a(this.e, this.f, this.g, this.h, (Composer) obj, iA);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iA2 = RecomposeScopeImplKt.a(3073);
                                    FloorSelectorKt.a(this.e, this.f, this.g, this.h, (Composer) obj, iA2);
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    return;
                }
                return;
            }
            list = floors;
            floor2 = floor;
            function1 = onFloorSelected;
            modifier2 = modifier;
            i2 = i;
            composerImplV.o(5004770);
            boolean z = (i3 & 112) == 32;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = SnapshotStateKt.d(new n(14, floor2, list));
                composerImplV.A(objG);
            }
            final State state = (State) objG;
            composerImplV.V(false);
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(1526035262, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.FloorSelectorKt$FloorSelector$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        final State state2 = state;
                        int iIntValue = ((Number) state2.getD()).intValue();
                        long j = CoreTheme.b(composer2).e.f4848a.c;
                        long j2 = CoreTheme.b(composer2).e.d.f4856a;
                        final List list2 = list;
                        final Function1 function12 = function1;
                        TabRowKt.b(iIntValue, modifier2, j, j2, null, null, ComposableLambdaKt.c(-523702618, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.FloorSelectorKt$FloorSelector$2.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    int i5 = 0;
                                    for (Object obj5 : list2) {
                                        int i6 = i5 + 1;
                                        if (i5 < 0) {
                                            CollectionsKt.z0();
                                            throw null;
                                        }
                                        Floor floor3 = (Floor) obj5;
                                        boolean z2 = i5 == ((Number) state2.getD()).intValue();
                                        composer3.o(-1633490746);
                                        Function1 function13 = function12;
                                        boolean zN = composer3.n(function13) | composer3.n(floor3);
                                        Object objG2 = composer3.G();
                                        if (zN || objG2 == Composer.Companion.f1624a) {
                                            objG2 = new n(15, function13, floor3);
                                            composer3.A(objG2);
                                        }
                                        composer3.l();
                                        FloorSelectorKt.b(floor3, z2, (Function0) objG2, composer3, 0);
                                        i5 = i6;
                                    }
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 1572864, 48);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX2 = composerImplV.X();
        if (recomposeScopeImplX2 != null) {
            final Floor floor3 = floor2;
            final List list2 = list;
            final int i5 = 1;
            recomposeScopeImplX2.d = new Function2(list2, floor3, function1, modifier2, i2, i5) { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.b
                public final /* synthetic */ int d;
                public final /* synthetic */ List e;
                public final /* synthetic */ Floor f;
                public final /* synthetic */ Function1 g;
                public final /* synthetic */ Modifier h;

                {
                    this.d = i5;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.d) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iA = RecomposeScopeImplKt.a(3073);
                            FloorSelectorKt.a(this.e, this.f, this.g, this.h, (Composer) obj, iA);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iA2 = RecomposeScopeImplKt.a(3073);
                            FloorSelectorKt.a(this.e, this.f, this.g, this.h, (Composer) obj, iA2);
                            break;
                    }
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final Floor floor, final boolean z, Function0 function0, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1983625520);
        int i2 = (composerImplV.n(floor) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function0) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            int i3 = i2 >> 3;
            TabKt.b(z, function0, null, false, 0L, 0L, ComposableLambdaKt.c(1576663133, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.FloorSelectorKt$FloorTab$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    long jB;
                    ColumnScope Tab = (ColumnScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(Tab, "$this$Tab");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        String str = floor.b;
                        TextStyle textStyle = CoreTheme.f(composer2).f5120a.b.b;
                        if (z) {
                            composer2.o(-950178842);
                            jB = CoreTheme.b(composer2).e.d.f4856a;
                        } else {
                            composer2.o(-950177034);
                            jB = Color.b(CoreTheme.b(composer2).e.d.b, 0.6f);
                        }
                        composer2.l();
                        TextKt.b(str, PaddingKt.f(Modifier.Companion.d, 16), 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, TextStyle.a(textStyle, jB, 0L, null, null, 0L, 0L, null, null, 0, 16777214), composer2, 48, 3120, 55292);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, (i3 & 14) | 12582912 | (i3 & 112), 124);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.filter.b(floor, z, function0, i, 8);
        }
    }
}
