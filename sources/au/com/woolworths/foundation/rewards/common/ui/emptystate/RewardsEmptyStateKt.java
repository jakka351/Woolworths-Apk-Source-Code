package au.com.woolworths.foundation.rewards.common.ui.emptystate;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.InlineTextContentKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import au.com.woolworths.compose.utils.layout.SpacerKt;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.component.button.SecondaryButtonKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.f;
import au.com.woolworths.foundation.rewards.common.ui.iconasset.IconAssetUiKt;
import au.com.woolworths.rewards.base.data.EmptyStateButtonData;
import au.com.woolworths.rewards.base.data.IconAsset;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"common-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RewardsEmptyStateKt {
    public static final void a(final RewardsEmptyStateSpec rewardsEmptyStateSpec, final Modifier modifier, final Function1 function1, Composer composer, int i, int i2) {
        int i3;
        ComposerImpl composerImplV = composer.v(1628246694);
        if ((i & 6) == 0) {
            i3 = (composerImplV.n(rewardsEmptyStateSpec) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerImplV.n(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= KyberEngine.KyberPolyBytes;
        } else if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(function1) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (i4 != 0) {
                modifier = Modifier.Companion.d;
            }
            if (i5 != 0) {
                function1 = null;
            }
            CoreThemeKt.b(6, composerImplV, ComposableLambdaKt.c(-1915419997, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.common.ui.emptystate.RewardsEmptyStateKt$RewardsEmptyState$1

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    static {
                        int[] iArr = new int[RewardsEmptyStateStyle.values().length];
                        try {
                            iArr[0] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            RewardsEmptyStateStyle rewardsEmptyStateStyle = RewardsEmptyStateStyle.d;
                            iArr[1] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            RewardsEmptyStateStyle rewardsEmptyStateStyle2 = RewardsEmptyStateStyle.d;
                            iArr[2] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        RewardsEmptyStateSpec rewardsEmptyStateSpec2 = rewardsEmptyStateSpec;
                        int iOrdinal = rewardsEmptyStateSpec2.i.ordinal();
                        Function1 function12 = function1;
                        Modifier modifier2 = modifier;
                        if (iOrdinal == 0) {
                            composer2.o(658453776);
                            RewardsEmptyStateKt.d(rewardsEmptyStateSpec2, modifier2, function12, composer2, 0);
                            composer2.l();
                        } else if (iOrdinal == 1) {
                            composer2.o(658707542);
                            RewardsEmptyStateKt.b(rewardsEmptyStateSpec2, modifier2, function12, composer2, 0);
                            composer2.l();
                        } else {
                            if (iOrdinal != 2) {
                                throw au.com.woolworths.android.onesite.a.x(composer2, 1822353979);
                            }
                            composer2.o(658957495);
                            RewardsEmptyStateKt.c(rewardsEmptyStateSpec2, modifier, function1, composer2, 0, 4);
                            composer2.l();
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        Modifier modifier2 = modifier;
        Function1 function12 = function1;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(rewardsEmptyStateSpec, modifier2, function12, i, i2, 0);
        }
    }

    public static final void b(RewardsEmptyStateSpec rewardsEmptyStateSpec, Modifier modifier, Function1 function1, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-28239494);
        int i2 = i | (composerImplV.n(rewardsEmptyStateSpec) ? 4 : 2) | (composerImplV.n(modifier) ? 32 : 16) | KyberEngine.KyberPolyBytes | (composerImplV.I(function1) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            c(rewardsEmptyStateSpec, PaddingKt.h(Modifier.Companion.d, 24, BitmapDescriptorFactory.HUE_RED, 2), function1, composerImplV, (i2 & 14) | 432 | (i2 & 7168), 0);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(rewardsEmptyStateSpec, modifier, function1, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.compose.ui.Modifier] */
    public static final void c(RewardsEmptyStateSpec rewardsEmptyStateSpec, Modifier modifier, Function1 function1, Composer composer, int i, int i2) {
        int i3;
        Function2 function2;
        Function2 function22;
        Function2 function23;
        Function2 function24;
        ComposerImpl composerImpl;
        Function0 function0;
        Arrangement$Top$1 arrangement$Top$1;
        int i4;
        Modifier.Companion companion;
        ColumnScopeInstance columnScopeInstance;
        boolean z;
        Modifier.Companion companionA;
        Function0 function02;
        Function2 function25;
        Function2 function26;
        Function2 function27;
        Function2 function28;
        Function0 function03;
        int i5;
        int i6;
        final Function1 function12;
        ComposerImpl composerImplV = composer.v(706362955);
        if ((i & 6) == 0) {
            i3 = (composerImplV.n(rewardsEmptyStateSpec) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i3 |= composerImplV.I(function1) ? 2048 : 1024;
        }
        if ((i3 & 1043) == 1042 && composerImplV.c()) {
            composerImplV.j();
            function12 = function1;
            composerImpl = composerImplV;
        } else {
            Arrangement$Top$1 arrangement$Top$12 = Arrangement.c;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.n;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$12, horizontal, composerImplV, 48);
            int i7 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
            ComposeUiNode.e3.getClass();
            Function0 function04 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function04);
            } else {
                composerImplV.e();
            }
            Function2 function29 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function29);
            Function2 function210 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function210);
            Function2 function211 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i7))) {
                androidx.camera.core.impl.b.B(i7, composerImplV, i7, function211);
            }
            Function2 function212 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function212);
            IconAsset iconAsset = rewardsEmptyStateSpec.b;
            Integer num = rewardsEmptyStateSpec.f8580a;
            Modifier.Companion companion2 = Modifier.Companion.d;
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f948a;
            if (iconAsset != null) {
                composerImplV.o(-131359956);
                Dp dp = rewardsEmptyStateSpec.c;
                function24 = function29;
                composerImpl = composerImplV;
                function23 = function211;
                function22 = function212;
                function2 = function210;
                IconAssetUiKt.b(rewardsEmptyStateSpec.b, Color.k, TestTagKt.a(SizeKt.q(companion2, dp != null ? dp.d : 48), "RewardsEmptyStateIcon"), composerImpl, 48, 0);
                SpacerKt.c(columnScopeInstance2, 12, composerImpl, 54);
                composerImpl.V(false);
                function0 = function04;
                arrangement$Top$1 = arrangement$Top$12;
                i4 = 54;
                companion = companion2;
                columnScopeInstance = columnScopeInstance2;
            } else {
                function2 = function210;
                function22 = function212;
                function23 = function211;
                function24 = function29;
                composerImpl = composerImplV;
                if (num == null || num.intValue() == 0) {
                    function0 = function04;
                    arrangement$Top$1 = arrangement$Top$12;
                    i4 = 54;
                    companion = companion2;
                    columnScopeInstance = columnScopeInstance2;
                    composerImpl.o(-130643763);
                    composerImpl.V(false);
                } else {
                    composerImpl.o(-130906426);
                    arrangement$Top$1 = arrangement$Top$12;
                    columnScopeInstance = columnScopeInstance2;
                    function0 = function04;
                    companion = companion2;
                    i4 = 54;
                    ImageKt.a(PainterResources_androidKt.a(num.intValue(), 0, composerImpl), null, SizeKt.q(companion2, 48), null, null, BitmapDescriptorFactory.HUE_RED, null, composerImpl, 432, 120);
                    composerImpl = composerImpl;
                    SpacerKt.c(columnScopeInstance, 12, composerImpl, 54);
                    composerImpl.V(false);
                }
            }
            String str = rewardsEmptyStateSpec.g;
            composerImpl.o(-4212458);
            if (str == null) {
                companionA = null;
                z = false;
            } else {
                composerImpl.o(5004770);
                boolean zN = composerImpl.n(str);
                Object objG = composerImpl.G();
                if (zN || objG == Composer.Companion.f1624a) {
                    objG = new au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.a(str, 17);
                    composerImpl.A(objG);
                }
                z = false;
                composerImpl.V(false);
                companionA = SemanticsModifierKt.a(companion, (Function1) objG);
            }
            Modifier.Companion companion3 = companionA;
            composerImpl.V(z);
            if (companion3 == null) {
                companion3 = companion;
            }
            ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, horizontal, composerImpl, 48);
            int i8 = composerImpl.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImpl.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImpl, companion3);
            composerImpl.i();
            if (composerImpl.O) {
                function02 = function0;
                composerImpl.K(function02);
            } else {
                function02 = function0;
                composerImpl.e();
            }
            Function2 function213 = function24;
            Updater.b(composerImpl, columnMeasurePolicyA2, function213);
            Function2 function214 = function2;
            Updater.b(composerImpl, persistentCompositionLocalMapQ2, function214);
            if (composerImpl.O || !Intrinsics.c(composerImpl.G(), Integer.valueOf(i8))) {
                function25 = function23;
                androidx.camera.core.impl.b.B(i8, composerImpl, i8, function25);
            } else {
                function25 = function23;
            }
            Function2 function215 = function22;
            Updater.b(composerImpl, modifierD2, function215);
            String str2 = rewardsEmptyStateSpec.d;
            composerImpl.o(340613860);
            if (str2 == null) {
                function28 = function215;
                function27 = function25;
                function03 = function02;
                function26 = function213;
                i6 = i4;
                i5 = 8;
            } else {
                ComposerImpl composerImpl2 = composerImpl;
                function26 = function213;
                function27 = function25;
                function28 = function215;
                function03 = function02;
                i5 = 8;
                TextKt.b(str2, TestTagKt.a(companion, "RewardsEmptyStateTitle"), CoreTheme.b(composerImpl).e.d.d, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, CoreTheme.f(composerImpl).e.f5133a.b, composerImpl2, 48, 0, 65016);
                composerImpl = composerImpl2;
                i6 = 54;
                SpacerKt.c(columnScopeInstance, 8, composerImpl, 54);
            }
            composerImpl.V(false);
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.e, Alignment.Companion.k, composerImpl, i6);
            int i9 = composerImpl.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImpl.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImpl, modifierE);
            composerImpl.i();
            if (composerImpl.O) {
                composerImpl.K(function03);
            } else {
                composerImpl.e();
            }
            Updater.b(composerImpl, rowMeasurePolicyA, function26);
            Updater.b(composerImpl, persistentCompositionLocalMapQ3, function214);
            if (composerImpl.O || !Intrinsics.c(composerImpl.G(), Integer.valueOf(i9))) {
                androidx.camera.core.impl.b.B(i9, composerImpl, i9, function27);
            }
            Updater.b(composerImpl, modifierD3, function28);
            String str3 = rewardsEmptyStateSpec.e;
            if (str3 != null && rewardsEmptyStateSpec.f != null) {
                composerImpl.o(2028815050);
                ComposerImpl composerImpl3 = composerImpl;
                e(rewardsEmptyStateSpec.e, CoreTheme.b(composerImpl).e.d.b, TextUnitKt.c(16), CoreTheme.f(composerImpl).f5120a.b.f5123a, rewardsEmptyStateSpec.f, TestTagKt.a(companion, "RewardsEmptyStateMessage"), new TextAlign(3), BitmapDescriptorFactory.HUE_RED, composerImpl3, 196992);
                composerImpl = composerImpl3;
                composerImpl.V(false);
            } else if (str3 != null) {
                composerImpl.o(2029392673);
                ComposerImpl composerImpl4 = composerImpl;
                TextKt.b(rewardsEmptyStateSpec.e, TestTagKt.a(companion, "RewardsEmptyStateMessage"), CoreTheme.b(composerImpl).e.d.b, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, CoreTheme.f(composerImpl).f5120a.b.f5123a, composerImpl4, 48, 0, 65016);
                composerImpl = composerImpl4;
                composerImpl.V(false);
            } else {
                composerImpl.o(2029816071);
                composerImpl.V(false);
            }
            composerImpl.V(true);
            composerImpl.V(true);
            final EmptyStateButtonData emptyStateButtonData = rewardsEmptyStateSpec.h;
            composerImpl.o(-4147818);
            if (emptyStateButtonData == null) {
                function12 = function1;
            } else {
                SpacerKt.c(columnScopeInstance, i5, composerImpl, 54);
                function12 = function1;
                ThemeKt.a(48, composerImpl, ComposableLambdaKt.c(1793058912, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.common.ui.emptystate.RewardsEmptyStateKt$RewardsEmptyStateContent$1$3$1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            EmptyStateButtonData emptyStateButtonData2 = emptyStateButtonData;
                            String title = emptyStateButtonData2.getTitle();
                            composer2.o(-1633490746);
                            Object obj3 = function12;
                            boolean zN2 = composer2.n(obj3) | composer2.I(emptyStateButtonData2);
                            Object objG2 = composer2.G();
                            if (zN2 || objG2 == Composer.Companion.f1624a) {
                                objG2 = new f(19, obj3, emptyStateButtonData2);
                                composer2.A(objG2);
                            }
                            composer2.l();
                            SecondaryButtonKt.b(title, (Function0) objG2, null, false, false, null, null, composer2, 0, 124);
                        }
                        return Unit.f24250a;
                    }
                }, composerImpl));
            }
            composerImpl.V(false);
            composerImpl.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(rewardsEmptyStateSpec, modifier, function12, i, i2, 1);
        }
    }

    public static final void d(RewardsEmptyStateSpec rewardsEmptyStateSpec, Modifier modifier, Function1 function1, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(2054927830);
        int i2 = i | (composerImplV.n(rewardsEmptyStateSpec) ? 4 : 2) | (composerImplV.n(modifier) ? 32 : 16) | KyberEngine.KyberPolyBytes | (composerImplV.I(function1) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierH = PaddingKt.h(modifier, BitmapDescriptorFactory.HUE_RED, 40, 1);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierH);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
            Modifier.Companion companion = Modifier.Companion.d;
            androidx.compose.foundation.layout.SpacerKt.a(composerImplV, rowScopeInstance.a(companion, 1.0f, true));
            c(rewardsEmptyStateSpec, rowScopeInstance.a(companion, 8.0f, true), function1, composerImplV, i2 & 8078, 0);
            androidx.compose.foundation.layout.SpacerKt.a(composerImplV, rowScopeInstance.a(companion, 1.0f, true));
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(rewardsEmptyStateSpec, modifier, function1, i, 1);
        }
    }

    public static final void e(final String str, final long j, final long j2, final TextStyle textStyle, final ImageVector imageVector, final Modifier modifier, final TextAlign textAlign, float f, Composer composer, final int i) {
        ComposerImpl composerImpl;
        final float f2;
        ComposerImpl composerImplV = composer.v(-369560498);
        int i2 = i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.s(j) ? 32 : 16) | (composerImplV.n(textStyle) ? 2048 : 1024) | (composerImplV.n(imageVector) ? 16384 : 8192) | (composerImplV.n(textAlign) ? 1048576 : 524288) | 12582912;
        if ((4793491 & i2) == 4793490 && composerImplV.c()) {
            composerImplV.j();
            f2 = f;
            composerImpl = composerImplV;
        } else {
            final float f3 = 4;
            AnnotatedString.Builder builder = new AnnotatedString.Builder();
            builder.e(str);
            InlineTextContentKt.a(builder, "inlineIcon", "�");
            composerImpl = composerImplV;
            TextKt.c(builder.m(), modifier, j, 0L, null, null, null, 0L, null, textAlign, 0L, 0, false, 0, 0, MapsKt.i(new Pair("inlineIcon", new InlineTextContent(new Placeholder(TextUnitKt.c((int) (TextUnit.c(j2) + f3)), j2, 7), ComposableLambdaKt.c(1277177122, new Function3<String, Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.common.ui.emptystate.RewardsEmptyStateKt$TextWithInlineIcon$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    String it = (String) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        IconKt.b(imageVector, null, PaddingKt.j(SizeKt.c, f3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), CoreTheme.b(composer2).e.c.f4854a, composer2, 48, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV)))), null, textStyle, composerImpl, ((i2 << 3) & 896) | 48 | ((i2 << 9) & 1879048192), (i2 << 12) & 29360128, 97784);
            f2 = f3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(str, j, j2, textStyle, imageVector, modifier, textAlign, f2, i) { // from class: au.com.woolworths.foundation.rewards.common.ui.emptystate.c
                public final /* synthetic */ String d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;
                public final /* synthetic */ TextStyle g;
                public final /* synthetic */ ImageVector h;
                public final /* synthetic */ Modifier i;
                public final /* synthetic */ TextAlign j;
                public final /* synthetic */ float k;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(196993);
                    RewardsEmptyStateKt.e(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
