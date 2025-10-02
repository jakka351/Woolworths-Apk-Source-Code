package au.com.woolworths.shop.checkout.ui.timeselector.compose.dateselector;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.navigation.internal.d;
import au.com.woolworths.compose.utils.layout.SpacerKt;
import au.com.woolworths.compose.utils.modifier.ConditionalModifierKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.product.list.compose.filter.e;
import au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.ui.f;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003¨\u0006\u0003²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0002\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "background", "textColor", "shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class DateSelectorItemKt {
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [boolean, int] */
    public static final void a(final String str, final String str2, final String str3, final String str4, final boolean z, final boolean z2, final boolean z3, final Function0 onClick, final Modifier modifier, Composer composer, final int i) {
        long j;
        long j2;
        long j3;
        Object dVar;
        Function2 function2;
        BiasAlignment.Horizontal horizontal;
        Function2 function22;
        Function2 function23;
        Modifier.Companion companion;
        int i2;
        BiasAlignment biasAlignment;
        long j4;
        ?? r7;
        boolean z4;
        Function0 function0;
        int i3;
        TextStyle textStyle;
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(-684555533);
        int i4 = i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.n(str2) ? 32 : 16) | (composerImplV.n(str3) ? 256 : 128) | (composerImplV.n(str4) ? 2048 : 1024) | (composerImplV.p(z) ? 16384 : 8192) | (composerImplV.p(z2) ? 131072 : 65536) | (composerImplV.p(z3) ? 1048576 : 524288) | (composerImplV.I(onClick) ? 8388608 : 4194304) | (composerImplV.n(modifier) ? 67108864 : 33554432);
        if ((i4 & 38347923) == 38347922 && composerImplV.c()) {
            composerImplV.j();
        } else {
            boolean z5 = z2 && !z3;
            if (z3) {
                composerImplV.o(-727853286);
                j = CoreTheme.b(composerImplV).c.f4812a.b.b.f4819a;
                composerImplV.V(false);
            } else if (z) {
                composerImplV.o(-727850438);
                j = CoreTheme.b(composerImplV).c.f4812a.b.f4817a.f4818a;
                composerImplV.V(false);
            } else {
                composerImplV.o(-727848292);
                j = CoreTheme.b(composerImplV).e.f4848a.d;
                composerImplV.V(false);
            }
            State stateB = SingleValueAnimationKt.b(j, null, "backgroundAnimation", composerImplV, KyberEngine.KyberPolyBytes, 10);
            if (z3) {
                composerImplV.o(-727841893);
                j2 = CoreTheme.b(composerImplV).f4782a.d.d.c;
                composerImplV.V(false);
            } else if (z) {
                composerImplV.o(-727839367);
                j2 = CoreTheme.b(composerImplV).e.d.c.b;
                composerImplV.V(false);
            } else {
                composerImplV.o(-727837447);
                j2 = CoreTheme.b(composerImplV).e.d.d;
                composerImplV.V(false);
            }
            State stateB2 = SingleValueAnimationKt.b(j2, null, "textAnimation", composerImplV, KyberEngine.KyberPolyBytes, 10);
            if (z) {
                composerImplV.o(-727832136);
                j3 = CoreTheme.b(composerImplV).c.f4812a.b.f4817a.c;
                composerImplV.V(false);
            } else {
                composerImplV.o(-727830118);
                j3 = CoreTheme.a(composerImplV).f4774a.f4777a.c;
                composerImplV.V(false);
            }
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(8);
            BiasAlignment.Horizontal horizontal2 = Alignment.Companion.n;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(spacedAlignedG, horizontal2, composerImplV, 54);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Function2 function24 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function24);
            Function2 function25 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function25);
            Function2 function26 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function26);
            }
            Function2 function27 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function27);
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifierB = SizeKt.b(companion2, BitmapDescriptorFactory.HUE_RED, 20, 1);
            BiasAlignment biasAlignment2 = Alignment.Companion.e;
            MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment2, false);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierB);
            composerImplV.i();
            long j5 = j3;
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, function24);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function25);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function26);
            }
            Object objF = au.com.woolworths.android.onesite.a.f(composerImplV, modifierD2, function27, 1849434622);
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objF == composer$Companion$Empty$1) {
                objF = new a(1);
                composerImplV.A(objF);
            }
            composerImplV.V(false);
            int i7 = i4 & 14;
            TextKt.a(str, CoreTheme.f(composerImplV).f5120a.b.f5123a, SemanticsModifierKt.b(companion2, false, (Function1) objF), CoreTheme.b(composerImplV).e.d.d, null, 0, 0, false, 0, null, composerImplV, i7, 1008);
            composerImplV.V(true);
            Arrangement$Center$1 arrangement$Center$1 = Arrangement.e;
            composerImplV.o(-1224400529);
            boolean z6 = (i7 == 4) | ((i4 & 112) == 32) | ((i4 & 896) == 256) | ((i4 & 7168) == 2048) | ((57344 & i4) == 16384);
            Object objG = composerImplV.G();
            if (z6 || objG == composer$Companion$Empty$1) {
                function2 = function24;
                horizontal = horizontal2;
                function22 = function26;
                function23 = function27;
                companion = companion2;
                i2 = i4;
                biasAlignment = biasAlignment2;
                j4 = j5;
                r7 = 1;
                z4 = false;
                dVar = new d(str, str2, str3, str4, z);
                composerImplV.A(dVar);
            } else {
                i2 = i4;
                horizontal = horizontal2;
                function22 = function26;
                function23 = function27;
                companion = companion2;
                dVar = objG;
                biasAlignment = biasAlignment2;
                j4 = j5;
                r7 = 1;
                z4 = false;
                function2 = function24;
            }
            composerImplV.V(z4);
            Modifier.Companion companion3 = companion;
            float f = 72;
            Modifier modifierF = PaddingKt.f(BackgroundKt.b(SizeKt.a(ClipKt.a(SemanticsModifierKt.b(companion3, r7, (Function1) dVar), RoundedCornerShapeKt.a(100)), f, f), ((Color) stateB.getD()).f1766a, RectangleShapeKt.f1779a), 10);
            boolean z7 = !z3;
            composerImplV.o(5004770);
            boolean z8 = (i2 & 29360128) == 8388608 ? r7 : z4;
            Object objG2 = composerImplV.G();
            if (z8 || objG2 == composer$Companion$Empty$1) {
                objG2 = new f(20, onClick);
                composerImplV.A(objG2);
            }
            composerImplV.V(z4);
            Modifier modifierD3 = ClickableKt.d(modifierF, z7, null, null, (Function0) objG2, 6);
            ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Center$1, horizontal, composerImplV, 54);
            int i8 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD4 = ComposedModifierKt.d(composerImplV, modifierD3);
            composerImplV.i();
            if (composerImplV.O) {
                function0 = function02;
                composerImplV.K(function0);
            } else {
                function0 = function02;
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA2, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function25);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i8))) {
                androidx.camera.core.impl.b.B(i8, composerImplV, i8, function22);
            }
            Object objF2 = au.com.woolworths.android.onesite.a.f(composerImplV, modifierD4, function23, 1849434622);
            if (objF2 == composer$Companion$Empty$1) {
                objF2 = new a(2);
                composerImplV.A(objF2);
            }
            composerImplV.V(z4);
            float f2 = 18;
            Modifier modifierB2 = SizeKt.b(SemanticsModifierKt.b(companion3, z4, (Function1) objF2), BitmapDescriptorFactory.HUE_RED, f2, r7);
            BiasAlignment biasAlignment3 = biasAlignment;
            MeasurePolicy measurePolicyD2 = BoxKt.d(biasAlignment3, z4);
            int p = composerImplV.getP();
            PersistentCompositionLocalMap persistentCompositionLocalMapQ4 = composerImplV.Q();
            Modifier modifierD5 = ComposedModifierKt.d(composerImplV, modifierB2);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD2, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ4, function25);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(p))) {
                androidx.camera.core.impl.b.B(p, composerImplV, p, function22);
            }
            Updater.b(composerImplV, modifierD5, function23);
            Function2 function28 = function23;
            Function2 function29 = function2;
            Function2 function210 = function22;
            TextKt.a(str2, CoreTheme.f(composerImplV).f5120a.f5121a.b, null, ((Color) stateB2.getD()).f1766a, null, 0, 0, false, 0, null, composerImplV, (i2 >> 3) & 14, 1012);
            Object objD = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, true);
            if (objD == composer$Companion$Empty$1) {
                objD = new a(3);
                composerImplV.A(objD);
            }
            composerImplV.V(false);
            Modifier modifierB3 = SizeKt.b(SemanticsModifierKt.b(companion3, false, (Function1) objD), BitmapDescriptorFactory.HUE_RED, 16, 1);
            MeasurePolicy measurePolicyD3 = BoxKt.d(biasAlignment3, false);
            int p2 = composerImplV.getP();
            PersistentCompositionLocalMap persistentCompositionLocalMapQ5 = composerImplV.Q();
            Modifier modifierD6 = ComposedModifierKt.d(composerImplV, modifierB3);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD3, function29);
            Updater.b(composerImplV, persistentCompositionLocalMapQ5, function25);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(p2))) {
                androidx.camera.core.impl.b.B(p2, composerImplV, p2, function210);
            }
            Updater.b(composerImplV, modifierD6, function28);
            TextKt.a(str3, CoreTheme.f(composerImplV).f5120a.c.f5124a, null, ((Color) stateB2.getD()).f1766a, null, 0, 0, false, 0, null, composerImplV, (i2 >> 6) & 14, 1012);
            composerImplV.V(true);
            composerImplV.o(-673562599);
            boolean z9 = z5;
            if (z9) {
                SpacerKt.c(ColumnScopeInstance.f948a, 2, composerImplV, 54);
            }
            Object objD2 = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD2 == composer$Companion$Empty$1) {
                i3 = 4;
                objD2 = new a(4);
                composerImplV.A(objD2);
            } else {
                i3 = 4;
            }
            composerImplV.V(false);
            Modifier modifierB4 = SizeKt.b(SemanticsModifierKt.b(companion3, false, (Function1) objD2), BitmapDescriptorFactory.HUE_RED, f2 - (z9 ? 2 : 0), 1);
            composerImplV.o(5004770);
            long j6 = j4;
            boolean zS = composerImplV.s(j6);
            Object objG3 = composerImplV.G();
            if (zS || objG3 == composer$Companion$Empty$1) {
                objG3 = new e(j6, 7);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            Modifier modifierB5 = ConditionalModifierKt.b(modifierB4, z9, (Function1) objG3, null, i3);
            MeasurePolicy measurePolicyD4 = BoxKt.d(biasAlignment3, false);
            int p3 = composerImplV.getP();
            PersistentCompositionLocalMap persistentCompositionLocalMapQ6 = composerImplV.Q();
            Modifier modifierD7 = ComposedModifierKt.d(composerImplV, modifierB5);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD4, function29);
            Updater.b(composerImplV, persistentCompositionLocalMapQ6, function25);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(p3))) {
                androidx.camera.core.impl.b.B(p3, composerImplV, p3, function210);
            }
            Updater.b(composerImplV, modifierD7, function28);
            if (z2) {
                composerImplV.o(-1016236894);
                textStyle = CoreTheme.f(composerImplV).b.f5125a.f5126a;
                composerImplV.V(false);
            } else {
                composerImplV.o(-1016144731);
                textStyle = CoreTheme.f(composerImplV).f5120a.c.f5124a;
                composerImplV.V(false);
            }
            TextKt.a(str4, textStyle, null, ((Color) stateB2.getD()).f1766a, null, 0, 0, false, 0, null, composerImplV, (i2 >> 9) & 14, 1012);
            composerImplV = composerImplV;
            android.support.v4.media.session.a.C(composerImplV, true, true, true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(str, str2, str3, str4, z, z2, z3, onClick, modifier, i) { // from class: au.com.woolworths.shop.checkout.ui.timeselector.compose.dateselector.b
                public final /* synthetic */ String d;
                public final /* synthetic */ String e;
                public final /* synthetic */ String f;
                public final /* synthetic */ String g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ Function0 k;
                public final /* synthetic */ Modifier l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    DateSelectorItemKt.a(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
