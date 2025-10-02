package au.com.woolworths.shop.aem.components.ui.herobanner;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import au.com.woolworths.compose.utils.extensions.ColorExtKt;
import au.com.woolworths.design.wx.foundation.RewardsColors;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WoolworthsColors;
import au.com.woolworths.shop.aem.components.model.herobanner.HeroBanner;
import au.com.woolworths.shop.aem.components.model.herobanner.HeroBannerTitleSize;
import au.com.woolworths.shop.aem.components.ui.chatentrycard.b;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "fullyVisibleIndices", "shop-aem-components_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class HeroBannerKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10220a;

        static {
            int[] iArr = new int[HeroBannerTitleSize.values().length];
            try {
                HeroBannerTitleSize heroBannerTitleSize = HeroBannerTitleSize.d;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f10220a = iArr;
        }
    }

    public static final void a(final HeroBanner heroBanner, Function1 onClick, final Function1 onTermsAndConditionClick, Composer composer, int i) {
        long jA;
        Intrinsics.h(heroBanner, "heroBanner");
        String str = heroBanner.e;
        Intrinsics.h(onClick, "onClick");
        Intrinsics.h(onTermsAndConditionClick, "onTermsAndConditionClick");
        ComposerImpl composerImplV = composer.v(-1257993842);
        int i2 = (composerImplV.I(heroBanner) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onClick) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onTermsAndConditionClick) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(5004770);
            boolean zN = composerImplV.n(str);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zN || objG == composer$Companion$Empty$1) {
                int i3 = Color.l;
                Color color = new Color(ColorExtKt.a(WoolworthsColors.b, str));
                composerImplV.A(color);
                objG = color;
            }
            final long j = ((Color) objG).f1766a;
            composerImplV.V(false);
            composerImplV.o(-2046258236);
            String str2 = heroBanner.f;
            if (str2 != null) {
                int i4 = Color.l;
                jA = ColorExtKt.a(((double) ColorKt.i(j)) > 0.5d ? RewardsColors.c : ToneColors.k, str2);
            } else {
                composerImplV.o(5004770);
                boolean zN2 = composerImplV.n(str);
                Object objG2 = composerImplV.G();
                if (zN2 || objG2 == composer$Companion$Empty$1) {
                    objG2 = new Color(((double) ColorKt.i(j)) > 0.5d ? RewardsColors.c : ToneColors.k);
                    composerImplV.A(objG2);
                }
                jA = ((Color) objG2).f1766a;
                composerImplV.V(false);
            }
            composerImplV.V(false);
            composerImplV.o(1849434622);
            Object objG3 = composerImplV.G();
            if (objG3 == composer$Companion$Empty$1) {
                objG3 = new b(28);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            Modifier modifierA = ClipKt.a(AspectRatioKt.a(SizeKt.g(TestTagKt.a(SemanticsModifierKt.b(Modifier.Companion.d, true, (Function1) objG3), "hero banner card"), 280), 1.1f), RoundedCornerShapeKt.b(12));
            composerImplV.o(-1633490746);
            boolean zI = ((i2 & 112) == 32) | composerImplV.I(heroBanner);
            Object objG4 = composerImplV.G();
            if (zI || objG4 == composer$Companion$Empty$1) {
                objG4 = new au.com.woolworths.sdui.common.alert.a(13, onClick, heroBanner);
                composerImplV.A(objG4);
            }
            composerImplV.V(false);
            Modifier modifierA2 = FocusableKt.a(BackgroundKt.b(ClickableKt.d(modifierA, false, null, null, (Function0) objG4, 7), j, RectangleShapeKt.f1779a), true, null);
            composerImplV.o(-1003410150);
            composerImplV.o(212064437);
            composerImplV.V(false);
            Density density = (Density) composerImplV.x(CompositionLocalsKt.h);
            Object objG5 = composerImplV.G();
            if (objG5 == composer$Companion$Empty$1) {
                objG5 = new Measurer2(density);
                composerImplV.A(objG5);
            }
            final Measurer2 measurer2 = (Measurer2) objG5;
            Object objG6 = composerImplV.G();
            if (objG6 == composer$Companion$Empty$1) {
                objG6 = new ConstraintLayoutScope();
                composerImplV.A(objG6);
            }
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objG6;
            Object objG7 = composerImplV.G();
            if (objG7 == composer$Companion$Empty$1) {
                objG7 = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objG7);
            }
            final MutableState mutableState = (MutableState) objG7;
            Object objG8 = composerImplV.G();
            if (objG8 == composer$Companion$Empty$1) {
                objG8 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                composerImplV.A(objG8);
            }
            final ConstraintSetForInlineDsl constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objG8;
            Object objG9 = composerImplV.G();
            if (objG9 == composer$Companion$Empty$1) {
                objG9 = SnapshotStateKt.e(Unit.f24250a, SnapshotStateKt.g());
                composerImplV.A(objG9);
            }
            final MutableState mutableState2 = (MutableState) objG9;
            boolean zR = composerImplV.r(257) | composerImplV.I(measurer2);
            Object objG10 = composerImplV.G();
            if (zR || objG10 == composer$Companion$Empty$1) {
                objG10 = new MeasurePolicy() { // from class: au.com.woolworths.shop.aem.components.ui.herobanner.HeroBannerKt$HeroBanner$$inlined$ConstraintLayout$2
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final MeasureResult c(MeasureScope measureScope, final List list, long j2) throws NumberFormatException {
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        mutableState2.getD();
                        long jH = measurer2.h(j2, measureScope.getD(), constraintSetForInlineDsl, list, linkedHashMap);
                        mutableState.getD();
                        final Measurer2 measurer22 = measurer2;
                        return measureScope.L0((int) (jH >> 32), (int) (jH & 4294967295L), EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: au.com.woolworths.shop.aem.components.ui.herobanner.HeroBannerKt$HeroBanner$$inlined$ConstraintLayout$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                List list2 = list;
                                LinkedHashMap linkedHashMap2 = linkedHashMap;
                                measurer22.g((Placeable.PlacementScope) obj, list2, linkedHashMap2);
                                return Unit.f24250a;
                            }
                        });
                    }
                };
                composerImplV.A(objG10);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objG10;
            Object objG11 = composerImplV.G();
            if (objG11 == composer$Companion$Empty$1) {
                objG11 = new Function0<Unit>() { // from class: au.com.woolworths.shop.aem.components.ui.herobanner.HeroBannerKt$HeroBanner$$inlined$ConstraintLayout$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        mutableState.setValue(Boolean.valueOf(!((Boolean) r0.getD()).booleanValue()));
                        constraintSetForInlineDsl.g = true;
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG11);
            }
            final Function0 function0 = (Function0) objG11;
            boolean zI2 = composerImplV.I(measurer2);
            Object objG12 = composerImplV.G();
            if (zI2 || objG12 == composer$Companion$Empty$1) {
                objG12 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: au.com.woolworths.shop.aem.components.ui.herobanner.HeroBannerKt$HeroBanner$$inlined$ConstraintLayout$4
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ToolingUtilsKt.a((SemanticsPropertyReceiver) obj, measurer2);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG12);
            }
            final long j2 = jA;
            LayoutKt.a(SemanticsModifierKt.b(modifierA2, false, (Function1) objG12), ComposableLambdaKt.c(1200550679, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.aem.components.ui.herobanner.HeroBannerKt$HeroBanner$$inlined$ConstraintLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                /* JADX WARN: Removed duplicated region for block: B:168:0x0774  */
                /* JADX WARN: Removed duplicated region for block: B:188:0x081d  */
                @Override // kotlin.jvm.functions.Function2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r87, java.lang.Object r88) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instructions count: 2206
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.aem.components.ui.herobanner.HeroBannerKt$HeroBanner$$inlined$ConstraintLayout$5.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, composerImplV), measurePolicy, composerImplV, 48);
            composerImplV.V(false);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.trafficdrivers.ui.a(heroBanner, onClick, onTermsAndConditionClick, i, 16);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final java.util.List r26, final kotlin.jvm.functions.Function1 r27, final kotlin.jvm.functions.Function1 r28, androidx.compose.ui.Modifier r29, int r30, kotlin.jvm.functions.Function1 r31, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.aem.components.ui.herobanner.HeroBannerKt.b(java.util.List, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, int, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }
}
