package au.com.woolworths.shop.checkout.ui.compose;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.fragment.app.Fragment;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabel;
import au.com.woolworths.base.shopapp.modules.badge.BadgeApiData;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.component.stable.RadioButtonKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.button.PrimaryButtonKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconKeyMapperKt;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentSlotSelectionOption;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentSlotSelectionOptionId;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentSlotSelectionOptionsInfo;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsSlot;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsViewModel;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/FulfilmentSlotSelectionOptionsInfo;", "optionsInfo", "Lau/com/woolworths/shop/checkout/domain/model/FulfilmentSlotSelectionOptionId;", "selectionId", "shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class FulfilmentSelectionOptionsUiKt {
    public static final void a(BrandLabel brandLabel, Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-408901104);
        if ((((composerImplV.I(brandLabel) ? 4 : 2) | i) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            float f = 2;
            Modifier modifierG = PaddingKt.g(BackgroundKt.b(modifier, CoreTheme.b(composerImplV).e.f4848a.d, RoundedCornerShapeKt.b(f)), 4, f);
            composerImplV.o(-1633490746);
            boolean zI = composerImplV.I(brandLabel) | composerImplV.I(context);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new f(2, brandLabel, context);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierB = SemanticsModifierKt.b(modifierG, false, (Function1) objG);
            Text text = brandLabel.getText();
            composerImpl = composerImplV;
            TextKt.b(String.valueOf(text != null ? text.getText(context) : null), modifierB, CoreTheme.b(composerImplV).e.d.d, 0L, null, 0L, null, null, 0L, 3, false, 0, 0, null, CoreTheme.f(composerImplV).b.f5125a.b, composerImpl, 0, 48, 63480);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new h(brandLabel, modifier, i, 0);
        }
    }

    public static final void b(FulfilmentSlotSelectionOption fulfilmentSlotSelectionOption, final Function1 function1, Modifier modifier, Composer composer, final int i) {
        boolean z;
        float f;
        long j;
        float f2;
        long j2;
        RowScopeInstance rowScopeInstance;
        Function0 function0;
        boolean z2;
        final FulfilmentSlotSelectionOption fulfilmentSlotSelectionOption2;
        final Modifier modifier2;
        ImageVector imageVectorA;
        ComposerImpl composerImplV = composer.v(-1639604520);
        int i2 = i | (composerImplV.I(fulfilmentSlotSelectionOption) ? 4 : 2) | (composerImplV.I(function1) ? 32 : 16) | KyberEngine.KyberPolyBytes;
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            fulfilmentSlotSelectionOption2 = fulfilmentSlotSelectionOption;
        } else {
            boolean z3 = fulfilmentSlotSelectionOption.j;
            boolean z4 = fulfilmentSlotSelectionOption.i;
            if (z3) {
                composerImplV.o(1205199386);
                f = 2;
                j = CoreTheme.b(composerImplV).f4782a.b.f4789a.f4790a;
                f2 = 0;
                z = z4;
                j2 = CoreTheme.b(composerImplV).e.d.d;
                composerImplV.V(false);
            } else {
                z = z4;
                if (z) {
                    composerImplV.o(1205444472);
                    f = 1;
                    j = CoreTheme.b(composerImplV).f4782a.b.f4789a.c;
                    f2 = 0;
                    j2 = CoreTheme.b(composerImplV).e.d.b;
                    composerImplV.V(false);
                } else {
                    composerImplV.o(1205670648);
                    f = 1;
                    j = CoreTheme.b(composerImplV).f4782a.b.f4789a.c;
                    f2 = 9;
                    j2 = CoreTheme.b(composerImplV).e.d.b;
                    composerImplV.V(false);
                }
            }
            float f3 = f2;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierJ = PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f3, 7);
            boolean z5 = fulfilmentSlotSelectionOption.i;
            composerImplV.o(-1633490746);
            boolean zI = ((i2 & 112) == 32) | composerImplV.I(fulfilmentSlotSelectionOption);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new i(1, function1, fulfilmentSlotSelectionOption);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierD = ClickableKt.d(modifierJ, z5, null, null, (Function0) objG, 6);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierD);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            long j3 = j2;
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, measurePolicyD, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD2, function24);
            float f4 = 12;
            Modifier modifierF = PaddingKt.f(BorderKt.a(OffsetKt.c(companion, BitmapDescriptorFactory.HUE_RED, f3, 1), f, j, RoundedCornerShapeKt.b(f4)), 16);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(f4);
            BiasAlignment.Vertical vertical = Alignment.Companion.k;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(spacedAlignedG, vertical, composerImplV, 54);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierF);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Updater.b(composerImplV, modifierD3, function24);
            composerImplV.o(-610572456);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.f974a;
            if (!z || (imageVectorA = IconKeyMapperKt.a(CoreTheme.e(composerImplV), fulfilmentSlotSelectionOption.c.d)) == null) {
                rowScopeInstance = rowScopeInstance2;
                function0 = function02;
                z2 = true;
            } else {
                rowScopeInstance = rowScopeInstance2;
                function0 = function02;
                z2 = true;
                IconKt.b(imageVectorA, null, rowScopeInstance2.b(SizeKt.k(companion, 24), vertical), 0L, composerImplV, 48, 8);
                composerImplV = composerImplV;
            }
            composerImplV.V(false);
            Modifier modifierA = rowScopeInstance.a(companion, 1.0f, z2);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD4 = ComposedModifierKt.d(composerImplV, modifierA);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function23);
            }
            Updater.b(composerImplV, modifierD4, function24);
            fulfilmentSlotSelectionOption2 = fulfilmentSlotSelectionOption;
            ComposerImpl composerImpl = composerImplV;
            boolean z6 = z;
            modifier2 = companion;
            TextKt.b(fulfilmentSlotSelectionOption2.k, SizeKt.e(companion, 1.0f), j3, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).f5120a.b.b, composerImpl, 48, 0, 65528);
            composerImplV = composerImpl;
            composerImplV.o(1289693188);
            if (fulfilmentSlotSelectionOption2.n) {
                TextKt.b(fulfilmentSlotSelectionOption2.l, PaddingKt.j(SizeKt.e(modifier2, 1.0f), BitmapDescriptorFactory.HUE_RED, 2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), CoreTheme.b(composerImplV).e.d.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).f5120a.c.f5124a, composerImplV, 48, 0, 65528);
                composerImplV = composerImplV;
            }
            composerImplV.V(false);
            composerImplV.o(1289708715);
            if (fulfilmentSlotSelectionOption2.m) {
                float f5 = 8;
                FlowLayoutKt.b(PaddingKt.j(SizeKt.e(modifier2, 1.0f), BitmapDescriptorFactory.HUE_RED, f5, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), Arrangement.g(f5), Arrangement.g(4), null, 0, 0, ComposableLambdaKt.c(70113647, new Function3<FlowRowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.compose.FulfilmentSelectionOptionsUiKt$FulfilmentSelectionOptionItemUi$2$1$2$1
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        FlowRowScope FlowRow = (FlowRowScope) obj;
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Intrinsics.h(FlowRow, "$this$FlowRow");
                        if ((iIntValue & 17) == 16 && composer2.c()) {
                            composer2.j();
                        } else {
                            Iterator it = fulfilmentSlotSelectionOption2.e.iterator();
                            while (it.hasNext()) {
                                FulfilmentSelectionOptionsUiKt.a((BadgeApiData) it.next(), SizeKt.g(Modifier.Companion.d, 20), composer2, 48);
                            }
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), composerImplV, 1573302, 56);
            }
            composerImplV.V(false);
            composerImplV.V(true);
            RadioButtonKt.a(fulfilmentSlotSelectionOption2.j, null, SizeKt.k(modifier2, 24), fulfilmentSlotSelectionOption2.i, composerImplV, 432, 0);
            composerImplV.V(true);
            composerImplV.o(1439678953);
            if (!z6) {
                e(fulfilmentSlotSelectionOption2.f, OffsetKt.c(SizeKt.g(modifier2, 18), (float) 16.5d, BitmapDescriptorFactory.HUE_RED, 2), composerImplV, 48);
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(function1, modifier2, i) { // from class: au.com.woolworths.shop.checkout.ui.compose.g
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Modifier f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    FulfilmentSelectionOptionsUiKt.b(this.d, this.e, this.f, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void c(String str, boolean z, List list, Function0 function0, Function1 function1, Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-392941332);
        int i2 = i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.p(z) ? 32 : 16) | (composerImplV.I(list) ? 256 : 128) | (composerImplV.I(function0) ? 2048 : 1024) | (composerImplV.I(function1) ? 16384 : 8192) | (composerImplV.n(modifier) ? 131072 : 65536);
        if ((74899 & i2) == 74898 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierX0 = modifier.x0(SizeKt.c);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierX0);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
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
            float f = 16;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierA = ColumnScopeInstance.f948a.a(PaddingKt.f(companion, f), 1.0f, true);
            Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(8);
            composerImplV.o(-1633490746);
            boolean zI = ((i2 & 57344) == 16384) | composerImplV.I(list);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new f(list, function1);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            LazyDslKt.b(modifierA, null, null, false, spacedAlignedG, null, null, false, null, (Function1) objG, composerImplV, 24576, 494);
            composerImplV = composerImplV;
            PrimaryButtonKt.a(str, function0, PaddingKt.g(SizeKt.e(companion, 1.0f), f, 12), z, null, null, null, null, composerImplV, (i2 & 14) | KyberEngine.KyberPolyBytes | ((i2 >> 6) & 112) | ((i2 << 6) & 7168), 240);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.loadingbutton.a(str, z, list, function0, function1, modifier, i, 6);
        }
    }

    public static final void d(final String str, boolean z, final FulfilmentSlotSelectionOptionsInfo fulfilmentSlotSelectionOptionsInfo, final Function0 function0, Function0 function02, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        final boolean z2;
        final Function0 function03;
        final Function1 function12;
        ComposerImpl composerImpl;
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-1110458836);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= composerImplV.p(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        int i3 = i2 | (composerImplV.I(fulfilmentSlotSelectionOptionsInfo) ? 256 : 128);
        if ((i & 3072) == 0) {
            i3 |= composerImplV.I(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function03 = function02;
            i3 |= composerImplV.I(function03) ? 16384 : 8192;
        } else {
            function03 = function02;
        }
        if ((196608 & i) == 0) {
            function12 = function1;
            i3 |= composerImplV.I(function12) ? 131072 : 65536;
        } else {
            function12 = function1;
        }
        if (((i3 | 1572864) & 599187) == 599186 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            modifier2 = modifier;
        } else {
            composerImpl = composerImplV;
            ScaffoldKt.a(WindowInsetsPaddingKt.d(SizeKt.c, WindowInsets_androidKt.c(composerImplV)), ComposableLambdaKt.c(-24303128, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.compose.FulfilmentSelectionOptionsUiKt$FulfilmentSelectionOptionsUi$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String str2 = fulfilmentSlotSelectionOptionsInfo.f10606a;
                        final Function0 function04 = function0;
                        TopNavBarKt.a(str2, null, 0L, 0L, 0L, null, null, ComposableLambdaKt.c(-960221514, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.compose.FulfilmentSelectionOptionsUiKt$FulfilmentSelectionOptionsUi$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    IconButtonKt.c(CoreTheme.e(composer3).e.b, StringResources_androidKt.c(composer3, R.string.back), function04, null, false, null, CoreTheme.b(composer3).e.c.f4854a, composer3, 0, 56);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null, composer2, 100663296, 766);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0L, null, ComposableLambdaKt.c(1524398655, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.compose.FulfilmentSelectionOptionsUiKt$FulfilmentSelectionOptionsUi$2
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
                        FulfilmentSelectionOptionsUiKt.c(str, z2, fulfilmentSlotSelectionOptionsInfo.b, function03, function12, PaddingKt.e(Modifier.Companion.d, paddingValues).x0(SizeKt.c), composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 12582960, 124);
            modifier2 = Modifier.Companion.d;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.legacy.compose.productsearch.a(str, z, fulfilmentSlotSelectionOptionsInfo, function0, function02, function1, modifier2, i);
        }
    }

    public static final void e(BrandLabel brandLabel, Modifier modifier, Composer composer, int i) {
        Modifier modifierB;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(113633852);
        if ((((composerImplV.I(brandLabel) ? 4 : 2) | i) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            Modifier modifierX = SizeKt.x(PaddingKt.h(BorderKt.a(BackgroundKt.b(modifier, Color.f, RectangleShapeKt.f1779a), 1, CoreTheme.b(composerImplV).c.c.f4824a.b.f4827a, RoundedCornerShapeKt.b(4)), 8, BitmapDescriptorFactory.HUE_RED, 2), Alignment.Companion.k, false);
            Text accessibilityText = brandLabel.getAccessibilityText();
            composerImplV.o(1827968511);
            Modifier modifier2 = Modifier.Companion.d;
            if (accessibilityText == null) {
                modifierB = null;
            } else {
                composerImplV.o(-1633490746);
                boolean zI = composerImplV.I(accessibilityText) | composerImplV.I(context);
                Object objG = composerImplV.G();
                if (zI || objG == Composer.Companion.f1624a) {
                    objG = new f(4, accessibilityText, context);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                modifierB = SemanticsModifierKt.b(modifier2, false, (Function1) objG);
            }
            composerImplV.V(false);
            if (modifierB != null) {
                modifier2 = modifierB;
            }
            Modifier modifierX0 = modifierX.x0(modifier2);
            Text text = brandLabel.getText();
            composerImpl = composerImplV;
            TextKt.b(String.valueOf(text != null ? text.getText(context) : null), modifierX0, CoreTheme.b(composerImplV).c.d.b.b.f4837a, 0L, null, TextUnitKt.c(0), null, null, TextUnitKt.c(8), 3, false, 0, 0, null, CoreTheme.f(composerImplV).b.f5125a.b, composerImpl, 12582912, 54, 62328);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new h(brandLabel, modifier, i, 1);
        }
    }

    public static final void f(Fragment fragment2, final FulfilmentWindowsViewModel viewModel, final String str, final FulfilmentWindowsSlot slot, final FulfilmentSlotSelectionOptionsInfo selectionOptionsInfo) {
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(slot, "slot");
        Intrinsics.h(selectionOptionsInfo, "selectionOptionsInfo");
        View viewFindViewById = fragment2.requireActivity().findViewById(android.R.id.content);
        Intrinsics.f(viewFindViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        final ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        Context context = viewGroup.getContext();
        Intrinsics.g(context, "getContext(...)");
        final ComposeView composeView = new ComposeView(context, null, 6, 0);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.compose.FulfilmentSelectionOptionsUiKt$showFulfilmentSelectionOptionsUi$composeView$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue() & 3;
                Unit unit = Unit.f24250a;
                if (iIntValue == 2 && composer.c()) {
                    composer.j();
                    return unit;
                }
                composer.o(1849434622);
                Object objG = composer.G();
                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                if (objG == composer$Companion$Empty$1) {
                    objG = SnapshotStateKt.f(selectionOptionsInfo);
                    composer.A(objG);
                }
                final MutableState mutableState = (MutableState) objG;
                Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
                if (objE == composer$Companion$Empty$1) {
                    objE = SnapshotStateKt.f(null);
                    composer.A(objE);
                }
                final MutableState mutableState2 = (MutableState) objE;
                composer.l();
                composer.o(-1224400529);
                boolean zI = composer.I(viewModel) | composer.I(slot);
                Object objG2 = composer.G();
                if (zI || objG2 == composer$Companion$Empty$1) {
                    FulfilmentSelectionOptionsUiKt$showFulfilmentSelectionOptionsUi$composeView$1$1$1$1 fulfilmentSelectionOptionsUiKt$showFulfilmentSelectionOptionsUi$composeView$1$1$1$1 = new FulfilmentSelectionOptionsUiKt$showFulfilmentSelectionOptionsUi$composeView$1$1$1$1(viewModel, slot, mutableState, mutableState2, null);
                    composer.A(fulfilmentSelectionOptionsUiKt$showFulfilmentSelectionOptionsUi$composeView$1$1$1$1);
                    objG2 = fulfilmentSelectionOptionsUiKt$showFulfilmentSelectionOptionsUi$composeView$1$1$1$1;
                }
                composer.l();
                EffectsKt.e(composer, unit, (Function2) objG2);
                final FulfilmentWindowsViewModel fulfilmentWindowsViewModel = viewModel;
                final FulfilmentWindowsSlot fulfilmentWindowsSlot = slot;
                final String str2 = str;
                final ViewGroup viewGroup2 = viewGroup;
                final ComposeView composeView2 = composeView;
                CoreThemeKt.c(6, composer, ComposableLambdaKt.c(284357785, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.compose.FulfilmentSelectionOptionsUiKt$showFulfilmentSelectionOptionsUi$composeView$1$1.2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        Object obj5;
                        Composer composer2 = (Composer) obj3;
                        if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            boolean z = ((FulfilmentSlotSelectionOptionId) mutableState2.getD()) != null;
                            FulfilmentSlotSelectionOptionsInfo fulfilmentSlotSelectionOptionsInfo = (FulfilmentSlotSelectionOptionsInfo) mutableState.getD();
                            composer2.o(-1633490746);
                            ViewGroup viewGroup3 = viewGroup2;
                            boolean zI2 = composer2.I(viewGroup3);
                            ComposeView composeView3 = composeView2;
                            boolean zI3 = zI2 | composer2.I(composeView3);
                            Object objG3 = composer2.G();
                            Object obj6 = Composer.Companion.f1624a;
                            if (zI3 || objG3 == obj6) {
                                objG3 = new FulfilmentSelectionOptionsUiKt$showFulfilmentSelectionOptionsUi$composeView$1$1$2$1$1(viewGroup3, composeView3);
                                composer2.A(objG3);
                            }
                            composer2.l();
                            Function0 function0 = (Function0) ((KFunction) objG3);
                            composer2.o(-1224400529);
                            Object obj7 = fulfilmentWindowsViewModel;
                            boolean zI4 = composer2.I(obj7);
                            Object obj8 = fulfilmentWindowsSlot;
                            boolean zI5 = zI4 | composer2.I(obj8) | composer2.I(viewGroup3) | composer2.I(composeView3);
                            Object objG4 = composer2.G();
                            if (zI5 || objG4 == obj6) {
                                obj5 = obj8;
                                Object fVar = new au.com.woolworths.android.onesite.deeplink.f(fulfilmentWindowsViewModel, fulfilmentWindowsSlot, mutableState2, viewGroup3, composeView3, 4);
                                composer2.A(fVar);
                                objG4 = fVar;
                            } else {
                                obj5 = obj8;
                            }
                            Function0 function02 = (Function0) objG4;
                            composer2.l();
                            composer2.o(-1633490746);
                            boolean zI6 = composer2.I(obj7) | composer2.I(obj5);
                            Object objG5 = composer2.G();
                            if (zI6 || objG5 == obj6) {
                                objG5 = new f(5, obj7, obj5);
                                composer2.A(objG5);
                            }
                            composer2.l();
                            FulfilmentSelectionOptionsUiKt.d(str2, z, fulfilmentSlotSelectionOptionsInfo, function0, function02, (Function1) objG5, null, composer2, 0);
                        }
                        return Unit.f24250a;
                    }
                }, composer));
                return unit;
            }
        }, true, -2121714115));
        viewGroup.addView(composeView);
        OnBackPressedDispatcherKt.a(fragment2.requireActivity().getF(), fragment2.getViewLifecycleOwner(), new f(1, viewGroup, composeView), 2);
    }
}
