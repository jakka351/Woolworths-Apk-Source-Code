package au.com.woolworths.shop.cart.ui.cart;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.wx.foundation.WxTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-cart_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CartProductPromoInfoKt {
    public static final void a(long j, int i, String title, String subtitle, boolean z, Modifier modifier, Composer composer, int i2) {
        Intrinsics.h(title, "title");
        Intrinsics.h(subtitle, "subtitle");
        ComposerImpl composerImplV = composer.v(1541183648);
        int i3 = (composerImplV.s(j) ? 4 : 2) | i2 | (composerImplV.r(i) ? 32 : 16) | (composerImplV.n(title) ? 256 : 128);
        if ((i2 & 3072) == 0) {
            i3 |= composerImplV.n(subtitle) ? 2048 : 1024;
        }
        int i4 = i3 | (composerImplV.p(z) ? 16384 : 8192);
        if ((i4 & 74899) == 74898 && composerImplV.c()) {
            composerImplV.j();
        } else {
            float f = 4;
            Modifier modifierE = SizeKt.e(PaddingKt.g(BackgroundKt.b(modifier, j, RoundedCornerShapeKt.b(f)), 12, f), 1.0f);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierE);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            int i6 = i4 >> 6;
            c(i, j, z, composerImplV, ((i4 >> 3) & 14) | ((i4 << 3) & 112) | (i6 & 896));
            Modifier.Companion companion = Modifier.Companion.d;
            TextKt.b(title, PaddingKt.j(companion, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).o, composerImplV, (i6 & 14) | 48, 0, 65532);
            SpacerKt.a(composerImplV, RowScopeInstance.f974a.a(companion, 1.0f, true));
            TextKt.b(subtitle, PaddingKt.j(companion, 6, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).n, composerImplV, ((i4 >> 9) & 14) | 48, 0, 65532);
            composerImplV = composerImplV;
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shared.ui.compose.progressstepper.a(j, i, title, subtitle, z, modifier, i2);
        }
    }

    public static final void b(final long j, final int i, final String str, final String str2, final boolean z, final Function0 onClicked, final Modifier modifier, Composer composer, final int i2) {
        Intrinsics.h(onClicked, "onClicked");
        ComposerImpl composerImplV = composer.v(935723876);
        int i3 = i2 | (composerImplV.s(j) ? 4 : 2) | (composerImplV.r(i) ? 32 : 16) | (composerImplV.n(str) ? 256 : 128) | (composerImplV.n(str2) ? 2048 : 1024) | (composerImplV.p(z) ? 16384 : 8192) | (composerImplV.I(onClicked) ? 131072 : 65536);
        if ((i3 & 599187) == 599186 && composerImplV.c()) {
            composerImplV.j();
        } else {
            float f = 4;
            float f2 = 12;
            Modifier modifierE = SizeKt.e(PaddingKt.g(BackgroundKt.b(modifier, j, RoundedCornerShapeKt.b(f)), f2, f2), 1.0f);
            composerImplV.o(5004770);
            boolean z2 = (i3 & 458752) == 131072;
            Object objG = composerImplV.G();
            if (z2 || objG == Composer.Companion.f1624a) {
                objG = new e(onClicked, 1);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierD = ClickableKt.d(modifierE, false, null, null, (Function0) objG, 7);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierD);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD2, ComposeUiNode.Companion.d);
            int i5 = i3 >> 6;
            c(i, j, z, composerImplV, ((i3 >> 3) & 14) | ((i3 << 3) & 112) | (i5 & 896));
            Modifier.Companion companion = Modifier.Companion.d;
            TextKt.b(str, PaddingKt.j(companion, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).f5120a.b.b, composerImplV, (i5 & 14) | 48, 0, 65532);
            SpacerKt.a(composerImplV, RowScopeInstance.f974a.a(companion, 1.0f, true));
            TextKt.b(str2, PaddingKt.j(companion, 6, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), CoreTheme.b(composerImplV).f4782a.d.b.f4798a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).f5120a.c.f5124a, composerImplV, ((i3 >> 9) & 14) | 48, 0, 65528);
            ImageVector imageVector = CoreTheme.e(composerImplV).e.n;
            long j2 = CoreTheme.b(composerImplV).e.b.b.b;
            composerImplV = composerImplV;
            IconKt.b(imageVector, null, null, j2, composerImplV, 48, 4);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(j, i, str, str2, z, onClicked, modifier, i2) { // from class: au.com.woolworths.shop.cart.ui.cart.m
                public final /* synthetic */ long d;
                public final /* synthetic */ int e;
                public final /* synthetic */ String f;
                public final /* synthetic */ String g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ Modifier j;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1572865);
                    CartProductPromoInfoKt.b(this.d, this.e, this.f, this.g, this.h, this.i, this.j, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void c(final int i, final long j, final boolean z, Composer composer, final int i2) {
        int i3;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(1451169935);
        if ((i2 & 6) == 0) {
            i3 = (composerImplV.r(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerImplV.s(j) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.p(z) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            ImageKt.a(PainterResources_androidKt.a(i, i3 & 14, composerImplV), "", SizeKt.k(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 6, BitmapDescriptorFactory.HUE_RED, 11), 24), null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 432, 120);
            AnimatedVisibilityKt.d(z, BoxScopeInstance.f944a.g(companion, Alignment.Companion.i), null, null, null, ComposableLambdaKt.c(-218075023, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.cart.CartProductPromoInfoKt$ImagePromo$1$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
                    Composer composer2 = (Composer) obj2;
                    ((Number) obj3).intValue();
                    Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
                    ImageKt.a(PainterResources_androidKt.a(R.drawable.ic_cart_ticked, 0, composer2), "", SizeKt.q(PaddingKt.f(BackgroundKt.b(Modifier.Companion.d, j, RoundedCornerShapeKt.f1100a), 1), 10), null, null, BitmapDescriptorFactory.HUE_RED, null, composer2, 48, 120);
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i3 >> 6) & 14) | 196608, 28);
            composerImpl = composerImplV;
            composerImpl.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.shop.cart.ui.cart.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    CartProductPromoInfoKt.c(i, j, z, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                    return Unit.f24250a;
                }
            };
        }
    }
}
