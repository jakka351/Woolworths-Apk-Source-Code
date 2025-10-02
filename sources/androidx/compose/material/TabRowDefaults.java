package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0005²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u0004\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material/TabRowDefaults;", "", "Landroidx/compose/ui/unit/Dp;", "currentTabWidth", "indicatorOffset", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TabRowDefaults {

    /* renamed from: a, reason: collision with root package name */
    public static final TabRowDefaults f1337a = new TabRowDefaults();
    public static final float b = 1;
    public static final float c = 2;

    public static Modifier c(final TabPosition tabPosition) {
        return ComposedModifierKt.a(Modifier.Companion.d, InspectableValueKt.a(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material.TabRowDefaults$tabIndicatorOffset$2
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Composer composer = (Composer) obj2;
                ((Number) obj3).intValue();
                composer.o(-398757863);
                TabPosition tabPosition2 = tabPosition;
                float f = tabPosition2.b;
                CubicBezierEasing cubicBezierEasing = EasingKt.f756a;
                State stateA = AnimateAsStateKt.a(f, AnimationSpecKt.e(250, 0, cubicBezierEasing, 2), null, null, composer, 0, 12);
                final State stateA2 = AnimateAsStateKt.a(tabPosition2.f1336a, AnimationSpecKt.e(250, 0, cubicBezierEasing, 2), null, null, composer, 0, 12);
                Modifier modifierZ = SizeKt.z(SizeKt.e((Modifier) obj, 1.0f), Alignment.Companion.g, 2);
                boolean zN = composer.n(stateA2);
                Object objG = composer.G();
                if (zN || objG == Composer.Companion.f1624a) {
                    objG = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.TabRowDefaults$tabIndicatorOffset$2$1$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            return new IntOffset(IntOffsetKt.a(((Density) obj4).r1(((Dp) stateA2.getD()).d), 0));
                        }
                    };
                    composer.A(objG);
                }
                Modifier modifierU = SizeKt.u(OffsetKt.a(modifierZ, (Function1) objG), ((Dp) stateA.getD()).d);
                composer.l();
                return modifierU;
            }
        });
    }

    public final void a(Modifier modifier, float f, long j, Composer composer, final int i) {
        final Modifier modifier2;
        final float f2;
        final long j2;
        long j3;
        float f3;
        ComposerImpl composerImplV = composer.v(910934799);
        int i2 = i | 150;
        if (composerImplV.z(i2 & 1, (i2 & 1171) != 1170)) {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                long jB = Color.b(((Color) composerImplV.x(ContentColorKt.f1261a)).f1766a, 0.12f);
                modifier = Modifier.Companion.d;
                j3 = jB;
                f3 = b;
            } else {
                composerImplV.j();
                f3 = f;
                j3 = j;
            }
            Modifier modifier3 = modifier;
            composerImplV.W();
            DividerKt.a(modifier3, j3, f3, BitmapDescriptorFactory.HUE_RED, composerImplV, 6);
            modifier2 = modifier3;
            j2 = j3;
            f2 = f3;
        } else {
            composerImplV.j();
            modifier2 = modifier;
            f2 = f;
            j2 = j;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(modifier2, f2, j2, i) { // from class: androidx.compose.material.TabRowDefaults$Divider$1
                public final /* synthetic */ Modifier i;
                public final /* synthetic */ float j;
                public final /* synthetic */ long k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(3073);
                    this.h.a(this.i, this.j, this.k, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public final void b(float f, final int i, final int i2, long j, Composer composer, final Modifier modifier) {
        final long j2;
        long j3;
        ComposerImpl composerImplV = composer.v(1499002201);
        int i3 = (composerImplV.n(modifier) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && composerImplV.q(f)) ? 32 : 16;
        }
        int i4 = i3 | (((i2 & 4) == 0 && composerImplV.s(j)) ? 256 : 128);
        if ((i & 3072) == 0) {
            i4 |= composerImplV.n(this) ? 2048 : 1024;
        }
        if (composerImplV.z(i4 & 1, (i4 & 1171) != 1170)) {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                if ((i2 & 2) != 0) {
                    f = c;
                }
                if ((i2 & 4) != 0) {
                    j3 = ((Color) composerImplV.x(ContentColorKt.f1261a)).f1766a;
                }
                composerImplV.W();
                BoxKt.a(BackgroundKt.b(SizeKt.g(SizeKt.e(modifier, 1.0f), f), j3, RectangleShapeKt.f1779a), composerImplV, 0);
                j2 = j3;
            } else {
                composerImplV.j();
            }
            j3 = j;
            composerImplV.W();
            BoxKt.a(BackgroundKt.b(SizeKt.g(SizeKt.e(modifier, 1.0f), f), j3, RectangleShapeKt.f1779a), composerImplV, 0);
            j2 = j3;
        } else {
            composerImplV.j();
            j2 = j;
        }
        final float f2 = f;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowDefaults$Indicator$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    int i5 = i2;
                    this.h.b(f2, iA, i5, j2, (Composer) obj, modifier);
                    return Unit.f24250a;
                }
            };
        }
    }
}
