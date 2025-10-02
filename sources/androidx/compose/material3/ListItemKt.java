package androidx.compose.material3;

import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyImpl;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ListItemKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1455a = 8;
    public static final float b = 12;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;

    static {
        float f2 = 16;
        c = f2;
        d = f2;
        e = f2;
        f = f2;
    }

    public static final void a(final Function2 function2, final Function2 function22, final ComposableLambdaImpl composableLambdaImpl, final Function2 function23, final Function2 function24, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(2052297037);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function22) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(function23) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(function24) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new ListItemMeasurePolicy();
                composerImplV.A(objG);
            }
            ListItemMeasurePolicy listItemMeasurePolicy = (ListItemMeasurePolicy) objG;
            ComposableLambdaImpl composableLambdaImplB = LayoutKt.b(CollectionsKt.R(composableLambdaImpl, function23 == null ? ComposableSingletons$ListItemKt.f1419a : function23, function24 == null ? ComposableSingletons$ListItemKt.b : function24, function2 == null ? ComposableSingletons$ListItemKt.c : function2, function22 == null ? ComposableSingletons$ListItemKt.d : function22));
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new MultiContentMeasurePolicyImpl(listItemMeasurePolicy);
                composerImplV.A(objG2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objG2;
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, Modifier.Companion.d);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicy, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function25 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function25);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            android.support.v4.media.session.a.y(0, composableLambdaImplB, composerImplV, true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItemLayout$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    ListItemKt.a(function2, function22, composableLambdaImpl, function23, function24, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(long j, final TypographyKeyTokens typographyKeyTokens, Function2 function2, Composer composer, final int i) {
        int i2;
        long j2;
        final Function2 function22;
        ComposerImpl composerImplV = composer.v(1133967795);
        if ((i & 6) == 0) {
            i2 = (composerImplV.s(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(typographyKeyTokens) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function2) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            j2 = j;
            function22 = function2;
        } else {
            j2 = j;
            ProvideContentColorTextStyleKt.a(j2, TypographyKt.a(typographyKeyTokens, composerImplV), function2, composerImplV, i2 & 910);
            function22 = function2;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            final long j3 = j2;
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ProvideTextStyleFromToken$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    ListItemKt.b(j3, typographyKeyTokens, function22, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final int c(IntrinsicMeasureScope intrinsicMeasureScope, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        int iMax = Math.max(Math.max(Constraints.i(j), intrinsicMeasureScope.r1(i6 == 1 ? ListTokens.b : i6 == 2 ? ListTokens.h : ListTokens.e)), Math.max(i, Math.max(i3 + i4 + i5, i2)) + i7);
        int iG = Constraints.g(j);
        return iMax > iG ? iG : iMax;
    }
}
