package au.com.woolworths.feature.shop.onboarding.sdui.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$SpaceEvenly$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.lifecycle.compose.FlowExtKt;
import au.com.woolworths.base.shopapp.modules.button.ButtonStyleApiData;
import au.com.woolworths.compose.utils.layout.SpacerKt;
import au.com.woolworths.design.core.ui.component.experimental.progressindicator.CircularProgressIndicatorKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.button.DestructiveButtonKt;
import au.com.woolworths.design.core.ui.component.stable.button.PrimaryButtonKt;
import au.com.woolworths.design.core.ui.component.stable.button.SecondaryButtonKt;
import au.com.woolworths.design.core.ui.component.stable.button.TertiaryButtonKt;
import au.com.woolworths.design.core.ui.component.stable.textbutton.TextButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.shop.onboarding.sdui.OnboardingSduiContract;
import au.com.woolworths.feature.shop.onboarding.sdui.OnboardingSduiViewModel;
import au.com.woolworths.feature.shop.onboarding.sdui.data.ButtonData;
import au.com.woolworths.feature.shop.onboarding.sdui.data.OnboardingContentData;
import au.com.woolworths.feature.shop.onboarding.sdui.data.OnboardingContentPageData;
import au.com.woolworths.feature.shop.onboarding.sdui.data.OnboardingFooterData;
import au.com.woolworths.feature.shop.onboarding.sdui.data.OnboardingHeaderData;
import au.com.woolworths.feature.shop.onboarding.sdui.data.RowData;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/sdui/OnboardingSduiContract$ViewState;", "viewState", "onboarding-sdui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class OnboardingSduiScreenKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7982a;

        static {
            int[] iArr = new int[ButtonStyleApiData.values().length];
            try {
                iArr[ButtonStyleApiData.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonStyleApiData.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonStyleApiData.TERTIARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonStyleApiData.DESTRUCTIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ButtonStyleApiData.INFO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f7982a = iArr;
        }
    }

    public static final void a(ButtonData button, Function0 onClick, Composer composer, int i) {
        Intrinsics.h(button, "button");
        String str = button.b;
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(1584585611);
        int i2 = (composerImplV.I(button) ? 4 : 2) | i | (composerImplV.I(onClick) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ButtonStyleApiData buttonStyleApiData = button.f;
            int i3 = buttonStyleApiData == null ? -1 : WhenMappings.f7982a[buttonStyleApiData.ordinal()];
            Modifier.Companion companion = Modifier.Companion.d;
            if (i3 == 1) {
                composerImplV.o(45796);
                PrimaryButtonKt.a(str, onClick, SizeKt.e(companion, 1.0f), button.c, null, null, null, null, composerImplV, (i2 & 112) | KyberEngine.KyberPolyBytes, 240);
                composerImplV.V(false);
            } else if (i3 == 2) {
                composerImplV.o(271042);
                SecondaryButtonKt.a(str, onClick, SizeKt.e(companion, 1.0f), button.c, null, null, null, null, composerImplV, (i2 & 112) | KyberEngine.KyberPolyBytes, 240);
                composerImplV.V(false);
            } else if (i3 == 3) {
                composerImplV.o(497187);
                TertiaryButtonKt.a(str, onClick, SizeKt.e(companion, 1.0f), button.c, null, null, null, composerImplV, (i2 & 112) | KyberEngine.KyberPolyBytes, 240);
                composerImplV = composerImplV;
                composerImplV.V(false);
            } else if (i3 == 4) {
                composerImplV.o(724355);
                DestructiveButtonKt.a(str, onClick, SizeKt.e(companion, 1.0f), null, null, null, composerImplV, (i2 & 112) | KyberEngine.KyberPolyBytes, 120);
                composerImplV = composerImplV;
                composerImplV.V(false);
            } else if (i3 != 5) {
                composerImplV.o(1072919);
                composerImplV.V(false);
            } else {
                composerImplV.o(913610);
                TextButtonKt.a(onClick, str, SizeKt.e(companion, 1.0f), false, null, null, null, null, composerImplV, ((i2 >> 3) & 14) | KyberEngine.KyberPolyBytes, 504);
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.wx.foundation.a(button, i, 1, onClick);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final au.com.woolworths.sdui.common.IconAsset r20, final int r21, final androidx.compose.ui.Modifier r22, androidx.compose.runtime.Composer r23, final int r24) {
        /*
            r0 = r20
            r1 = r21
            r2 = r24
            r3 = 964572483(0x397e3543, float:2.4243169E-4)
            r4 = r23
            androidx.compose.runtime.ComposerImpl r3 = r4.v(r3)
            boolean r4 = r3.I(r0)
            if (r4 == 0) goto L17
            r4 = 4
            goto L18
        L17:
            r4 = 2
        L18:
            r4 = r4 | r2
            boolean r5 = r3.r(r1)
            if (r5 == 0) goto L22
            r5 = 32
            goto L24
        L22:
            r5 = 16
        L24:
            r4 = r4 | r5
            r5 = r4 & 147(0x93, float:2.06E-43)
            r6 = 146(0x92, float:2.05E-43)
            if (r5 != r6) goto L38
            boolean r5 = r3.c()
            if (r5 != 0) goto L32
            goto L38
        L32:
            r3.j()
        L35:
            r16 = r3
            goto L70
        L38:
            boolean r5 = r0 instanceof au.com.woolworths.sdui.common.IconAsset.CoreIcon
            if (r5 != 0) goto L35
            boolean r5 = r0 instanceof au.com.woolworths.sdui.common.IconAsset.HostedIcon
            if (r5 == 0) goto L65
            r5 = r0
            au.com.woolworths.sdui.common.IconAsset$HostedIcon r5 = (au.com.woolworths.sdui.common.IconAsset.HostedIcon) r5
            java.lang.String r5 = r5.d
            int r4 = r4 >> 3
            r4 = r4 & 14
            androidx.compose.ui.graphics.painter.Painter r8 = androidx.compose.ui.res.PainterResources_androidKt.a(r1, r4, r3)
            r18 = 0
            r19 = 32744(0x7fe8, float:4.5884E-41)
            r4 = r5
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 432(0x1b0, float:6.05E-43)
            r6 = r22
            r16 = r3
            coil3.compose.SingletonAsyncImageKt.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L70
        L65:
            r16 = r3
            if (r0 != 0) goto L6a
            goto L70
        L6a:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L70:
            androidx.compose.runtime.RecomposeScopeImpl r3 = r16.X()
            if (r3 == 0) goto L7f
            au.com.woolworths.feature.shop.onboarding.sdui.ui.b r4 = new au.com.woolworths.feature.shop.onboarding.sdui.ui.b
            r6 = r22
            r4.<init>(r1, r6, r2)
            r3.d = r4
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.onboarding.sdui.ui.OnboardingSduiScreenKt.b(au.com.woolworths.sdui.common.IconAsset, int, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    public static final void c(Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-398325332);
        if ((((composerImplV.n(modifier) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierA = TestTagKt.a(modifier.x0(SizeKt.c), "onboarding_loading");
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierA);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            CircularProgressIndicatorKt.b(null, 0L, BitmapDescriptorFactory.HUE_RED, 0, composerImplV, 0, 15);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.compose.utils.layout.a(i, 20, modifier);
        }
    }

    public static final void d(OnboardingFooterData onboardingFooterData, Modifier modifier, final Function1 onButtonClick, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Intrinsics.h(onButtonClick, "onButtonClick");
        ComposerImpl composerImplV = composer.v(-1941706080);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(onboardingFooterData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(onButtonClick) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            modifier2 = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(modifier2, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i4 = composerImplV.P;
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
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            ButtonData buttonData = onboardingFooterData.f7979a;
            composerImplV.o(-1633490746);
            int i5 = i3 & 896;
            boolean zI = (i5 == 256) | composerImplV.I(onboardingFooterData);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                objG = new f(0, onButtonClick, onboardingFooterData);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            a(buttonData, (Function0) objG, composerImplV, 0);
            float f = 8;
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f948a;
            SpacerKt.c(columnScopeInstance, f, composerImplV, 54);
            final ButtonData buttonData2 = onboardingFooterData.b;
            composerImplV.o(1563640573);
            if (buttonData2 != null) {
                composerImplV.o(-1633490746);
                boolean zI2 = (i5 == 256) | composerImplV.I(buttonData2);
                Object objG2 = composerImplV.G();
                if (zI2 || objG2 == composer$Companion$Empty$1) {
                    final int i6 = 0;
                    objG2 = new Function0() { // from class: au.com.woolworths.feature.shop.onboarding.sdui.ui.g
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i6) {
                                case 0:
                                    onButtonClick.invoke(buttonData2.d);
                                    break;
                                default:
                                    onButtonClick.invoke(buttonData2.d);
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                a(buttonData2, (Function0) objG2, composerImplV, 0);
                SpacerKt.c(columnScopeInstance, f, composerImplV, 54);
            }
            composerImplV.V(false);
            final ButtonData buttonData3 = onboardingFooterData.c;
            composerImplV.o(1563646717);
            if (buttonData3 != null) {
                composerImplV.o(-1633490746);
                boolean zI3 = (i5 == 256) | composerImplV.I(buttonData3);
                Object objG3 = composerImplV.G();
                if (zI3 || objG3 == composer$Companion$Empty$1) {
                    final int i7 = 1;
                    objG3 = new Function0() { // from class: au.com.woolworths.feature.shop.onboarding.sdui.ui.g
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i7) {
                                case 0:
                                    onButtonClick.invoke(buttonData3.d);
                                    break;
                                default:
                                    onButtonClick.invoke(buttonData3.d);
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG3);
                }
                composerImplV.V(false);
                a(buttonData3, (Function0) objG3, composerImplV, 0);
                SpacerKt.c(columnScopeInstance, f, composerImplV, 54);
            }
            composerImplV.V(false);
            composerImplV.V(true);
            SpacerKt.a(f, composerImplV, 6);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(onboardingFooterData, modifier2, onButtonClick, i);
        }
    }

    public static final void e(OnboardingHeaderData header, Composer composer, int i) {
        Intrinsics.h(header, "header");
        ComposerImpl composerImplV = composer.v(803501359);
        if ((((composerImplV.I(header) ? 4 : 2) | i) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composerImplV, 48);
            int i2 = composerImplV.P;
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
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            float f = 24;
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f948a;
            SpacerKt.c(columnScopeInstance, f, composerImplV, 54);
            b(header.f7980a, R.drawable.onboarding_header, SizeKt.u(companion, 110), composerImplV, KyberEngine.KyberPolyBytes);
            SpacerKt.c(columnScopeInstance, f, composerImplV, 54);
            TextKt.a(header.b, CoreTheme.f(composerImplV).d.c.d, null, 0L, null, 0, 0, false, 0, null, composerImplV, 0, 1020);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(i, 0, header);
        }
    }

    public static final void f(RowData rowData, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-584498489);
        if (((i | (composerImplV.I(rowData) ? 4 : 2)) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            float f = 8;
            Modifier modifierG = PaddingKt.g(SizeKt.e(companion, 1.0f), f, 12);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.android.onesite.analytics.a11y.a(7);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierB = SemanticsModifierKt.b(modifierG, true, (Function1) objG);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 54);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            float f2 = 60;
            b(rowData.f7981a, R.drawable.wapple, SizeKt.l(companion, f2, f2), composerImplV, KyberEngine.KyberPolyBytes);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
            SpacerKt.d(rowScopeInstance, 16, composerImplV, 54);
            Modifier modifierA = rowScopeInstance.a(companion, 1.0f, true);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierA);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            TextKt.a(rowData.b, CoreTheme.f(composerImplV).e.b.f5135a, null, 0L, null, 0, 0, false, 0, null, composerImplV, 0, 1020);
            SpacerKt.c(ColumnScopeInstance.f948a, f, composerImplV, 54);
            TextKt.a(rowData.c, CoreTheme.f(composerImplV).f5120a.c.f5124a, null, CoreTheme.b(composerImplV).f4782a.d.d.d, null, 0, 0, false, 0, null, composerImplV, 0, 1012);
            composerImplV.V(true);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(i, 1, rowData);
        }
    }

    public static final void g(final OnboardingSduiContract.ViewState.OnboardingContent content, final Function1 onButtonClick, final Modifier modifier, Composer composer, final int i) {
        Intrinsics.h(content, "content");
        OnboardingContentPageData onboardingContentPageData = content.f7971a;
        OnboardingContentData onboardingContentData = onboardingContentPageData.b;
        Intrinsics.h(onButtonClick, "onButtonClick");
        ComposerImpl composerImplV = composer.v(2033745163);
        int i2 = (composerImplV.I(content) ? 4 : 2) | i | (composerImplV.I(onButtonClick) ? 32 : 16) | (composerImplV.n(modifier) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            float f = 16;
            Modifier modifierG = PaddingKt.g(modifier.x0(SizeKt.c), f, 8);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierG);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            OnboardingHeaderData onboardingHeaderData = onboardingContentPageData.f7978a;
            composerImplV.o(-1543169056);
            if (onboardingHeaderData != null) {
                e(onboardingHeaderData, composerImplV, 48);
            }
            composerImplV.V(false);
            composerImplV.o(-1543162893);
            if (!(onboardingContentData instanceof OnboardingContentData.VerticalContentData)) {
                throw new NoWhenBranchMatchedException();
            }
            j((OnboardingContentData.VerticalContentData) onboardingContentData, PaddingKt.h(ColumnScopeInstance.f948a.a(SizeKt.e(Modifier.Companion.d, 1.0f), 1.0f, true), BitmapDescriptorFactory.HUE_RED, f, 1), composerImplV, 0);
            composerImplV.V(false);
            d(onboardingContentPageData.c, null, onButtonClick, composerImplV, (i2 << 3) & 896);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(onButtonClick, modifier, i) { // from class: au.com.woolworths.feature.shop.onboarding.sdui.ui.d
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Modifier f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    OnboardingSduiScreenKt.g(this.d, this.e, this.f, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void h(final OnboardingSduiContract.ViewState viewState, final Function1 onFooterButtonClick, final Function0 onErrorRetry, Composer composer, int i) {
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(onFooterButtonClick, "onFooterButtonClick");
        Intrinsics.h(onErrorRetry, "onErrorRetry");
        ComposerImpl composerImplV = composer.v(-1483778842);
        int i2 = (composerImplV.n(viewState) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onFooterButtonClick) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onErrorRetry) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ScaffoldKt.a(SizeKt.c, null, null, null, 0L, null, ComposableLambdaKt.c(-287233415, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.onboarding.sdui.ui.OnboardingSduiScreenKt$OnboardingSduiScreen$5
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues paddingValues = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(paddingValues, "paddingValues");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(paddingValues) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        OnboardingSduiContract.ViewState viewState2 = viewState;
                        boolean z = viewState2 instanceof OnboardingSduiContract.ViewState.OnboardingContent;
                        Modifier.Companion companion = Modifier.Companion.d;
                        if (z) {
                            composer2.o(-1395679455);
                            OnboardingSduiScreenKt.g((OnboardingSduiContract.ViewState.OnboardingContent) viewState2, onFooterButtonClick, PaddingKt.e(companion, paddingValues), composer2, 0);
                            composer2.l();
                        } else if (Intrinsics.c(viewState2, OnboardingSduiContract.ViewState.Loading.f7970a)) {
                            composer2.o(-1395396332);
                            OnboardingSduiScreenKt.c(PaddingKt.e(companion, paddingValues), composer2, 0);
                            composer2.l();
                        } else {
                            if (!(viewState2 instanceof OnboardingSduiContract.ViewState.Error)) {
                                composer2.o(-1153402927);
                                composer2.l();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer2.o(-1395239503);
                            FullPageMessageUiKt.a(FullPageMessageSpec.Companion.a(FullPageMessage.Error.ConnectionError.f8915a, StringResources_androidKt.c(composer2, R.string.generic_server_error_subtitle), StringResources_androidKt.c(composer2, R.string.generic_network_error_subtitle), onErrorRetry, composer2, 1572864, 6), PaddingKt.e(companion, paddingValues), null, composer2, 0, 4);
                            composer2.l();
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 12582918, 126);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(viewState, onFooterButtonClick, onErrorRetry, i);
        }
    }

    public static final void i(OnboardingSduiViewModel viewModel, Function1 onContinueAsGuest, Function0 onLaunchLogin, Function0 onLaunchSignup, Function1 onNavigateToBranchLink, Function0 onNavigateToCollectionMode, Function0 onNavigateToHomePage, Composer composer, int i) {
        Object onboardingSduiScreenKt$OnboardingSduiScreen$1$1;
        int i2;
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(onContinueAsGuest, "onContinueAsGuest");
        Intrinsics.h(onLaunchLogin, "onLaunchLogin");
        Intrinsics.h(onLaunchSignup, "onLaunchSignup");
        Intrinsics.h(onNavigateToBranchLink, "onNavigateToBranchLink");
        Intrinsics.h(onNavigateToCollectionMode, "onNavigateToCollectionMode");
        Intrinsics.h(onNavigateToHomePage, "onNavigateToHomePage");
        ComposerImpl composerImplV = composer.v(-234560977);
        int i3 = i | (composerImplV.n(viewModel) ? 4 : 2) | (composerImplV.I(onContinueAsGuest) ? 32 : 16) | (composerImplV.I(onLaunchLogin) ? 256 : 128) | (composerImplV.I(onLaunchSignup) ? 2048 : 1024) | (composerImplV.I(onNavigateToBranchLink) ? 16384 : 8192) | (composerImplV.I(onNavigateToCollectionMode) ? 131072 : 65536) | (composerImplV.I(onNavigateToHomePage) ? 1048576 : 524288);
        if ((599187 & i3) == 599186 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Flow flow = viewModel.j;
            composerImplV.o(-1224400529);
            int i4 = i3 & 14;
            boolean z = ((i3 & 3670016) == 1048576) | (i4 == 4) | ((i3 & 112) == 32) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z || objG == composer$Companion$Empty$1) {
                i2 = i4;
                onboardingSduiScreenKt$OnboardingSduiScreen$1$1 = new OnboardingSduiScreenKt$OnboardingSduiScreen$1$1(viewModel, onContinueAsGuest, onLaunchLogin, onLaunchSignup, onNavigateToBranchLink, onNavigateToCollectionMode, onNavigateToHomePage, null);
                composerImplV.A(onboardingSduiScreenKt$OnboardingSduiScreen$1$1);
            } else {
                onboardingSduiScreenKt$OnboardingSduiScreen$1$1 = objG;
                i2 = i4;
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, flow, (Function2) onboardingSduiScreenKt$OnboardingSduiScreen$1$1);
            OnboardingSduiContract.ViewState viewState = (OnboardingSduiContract.ViewState) FlowExtKt.a(viewModel.l, composerImplV).getD();
            composerImplV.o(5004770);
            boolean z2 = i2 == 4;
            Object objG2 = composerImplV.G();
            if (z2 || objG2 == composer$Companion$Empty$1) {
                OnboardingSduiScreenKt$OnboardingSduiScreen$2$1 onboardingSduiScreenKt$OnboardingSduiScreen$2$1 = new OnboardingSduiScreenKt$OnboardingSduiScreen$2$1(1, viewModel, OnboardingSduiViewModel.class, "onFooterButtonClick", "onFooterButtonClick(Lau/com/woolworths/feature/shop/onboarding/sdui/data/ButtonActionData;)V", 0);
                composerImplV.A(onboardingSduiScreenKt$OnboardingSduiScreen$2$1);
                objG2 = onboardingSduiScreenKt$OnboardingSduiScreen$2$1;
            }
            composerImplV.V(false);
            Function1 function1 = (Function1) ((KFunction) objG2);
            composerImplV.o(5004770);
            boolean z3 = i2 == 4;
            Object objG3 = composerImplV.G();
            if (z3 || objG3 == composer$Companion$Empty$1) {
                objG3 = new OnboardingSduiScreenKt$OnboardingSduiScreen$3$1(0, viewModel, OnboardingSduiViewModel.class, "onTryAgainTapped", "onTryAgainTapped()V", 0);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            h(viewState, function1, (Function0) ((KFunction) objG3), composerImplV, 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.login.ui.a(viewModel, onContinueAsGuest, onLaunchLogin, onLaunchSignup, onNavigateToBranchLink, onNavigateToCollectionMode, onNavigateToHomePage, i);
        }
    }

    public static final void j(final OnboardingContentData.VerticalContentData verticalContentData, Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1279068639);
        int i2 = (composerImplV.I(verticalContentData) ? 4 : 2) | i | (composerImplV.n(modifier) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composerImplV);
            Arrangement$SpaceEvenly$1 arrangement$SpaceEvenly$1 = Arrangement.f;
            composerImplV.o(5004770);
            boolean zI = composerImplV.I(verticalContentData);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new Function1() { // from class: au.com.woolworths.feature.shop.onboarding.sdui.ui.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LazyListScope LazyColumn = (LazyListScope) obj;
                        Intrinsics.h(LazyColumn, "$this$LazyColumn");
                        final OnboardingContentData.VerticalContentData verticalContentData2 = verticalContentData;
                        List list = verticalContentData2.f7977a;
                        LazyListScope.g(LazyColumn, list != null ? list.size() : 0, null, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.onboarding.sdui.ui.OnboardingSduiScreenKt$OnboardingVerticalContentUi$1$1$1
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                LazyItemScope items = (LazyItemScope) obj2;
                                int iIntValue = ((Number) obj3).intValue();
                                Composer composer2 = (Composer) obj4;
                                int iIntValue2 = ((Number) obj5).intValue();
                                Intrinsics.h(items, "$this$items");
                                if ((iIntValue2 & 48) == 0) {
                                    iIntValue2 |= composer2.r(iIntValue) ? 32 : 16;
                                }
                                if ((iIntValue2 & 145) == 144 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    List list2 = verticalContentData2.f7977a;
                                    RowData rowData = list2 != null ? (RowData) list2.get(iIntValue) : null;
                                    if (rowData != null) {
                                        OnboardingSduiScreenKt.f(rowData, composer2, 0);
                                    }
                                }
                                return Unit.f24250a;
                            }
                        }, true, 1706105345), 6);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            LazyDslKt.b(modifier, lazyListStateA, null, false, arrangement$SpaceEvenly$1, null, null, false, null, (Function1) objG, composerImplV, ((i2 >> 3) & 14) | 24576, 492);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.wx.foundation.a(verticalContentData, i, 2, modifier);
        }
    }
}
