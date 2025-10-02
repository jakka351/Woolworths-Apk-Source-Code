package au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.RippleKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.icon.CoreIcons;
import au.com.woolworths.design.core.ui.foundation.icon.IconKeyMapperKt;
import au.com.woolworths.shop.lists.ui.snapalist.ui.SnapAListLottieKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SnapAListBottomSheetScreenKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[SnapAListBottomSheetType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SnapAListBottomSheetType snapAListBottomSheetType = SnapAListBottomSheetType.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final void a(final SnapAListMenuOption snapAListMenuOption, final Function1 function1, Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(1716182326);
        int i2 = (composerImplV.n(snapAListMenuOption) ? 4 : 2) | i | (composerImplV.I(function1) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = InteractionSourceKt.a();
                composerImplV.A(objG);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objG;
            composerImplV.V(false);
            IndicationNodeFactory indicationNodeFactoryB = RippleKt.b(BitmapDescriptorFactory.HUE_RED, 3, CoreTheme.b(composerImplV).f4782a.f4783a.b.b, false);
            composerImplV.o(-1633490746);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objG2 = composerImplV.G();
            if (z || objG2 == composer$Companion$Empty$1) {
                objG2 = new Function0() { // from class: au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(snapAListMenuOption);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            Modifier modifierH = PaddingKt.h(ClickableKt.b(modifierE, mutableInteractionSource, indicationNodeFactoryB, false, null, null, (Function0) objG2, 28), BitmapDescriptorFactory.HUE_RED, 14, 1);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
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
            CoreIcons coreIconsE = CoreTheme.e(composerImplV);
            String str = snapAListMenuOption.b;
            int i4 = snapAListMenuOption.f12465a;
            ImageVector imageVectorA = IconKeyMapperKt.a(coreIconsE, str);
            if (imageVectorA == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            IconKt.b(imageVectorA, StringResources_androidKt.c(composerImplV, i4), PaddingKt.j(companion, 16, BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, 10), CoreTheme.b(composerImplV).e.c.f4854a, composerImplV, KyberEngine.KyberPolyBytes, 0);
            TextKt.b(StringResources_androidKt.c(composerImplV, i4), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).f5120a.f5121a.f5122a, composerImplV, 0, 0, 65534);
            composerImplV = composerImplV;
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(function1, i) { // from class: au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet.c
                public final /* synthetic */ Function1 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    SnapAListBottomSheetScreenKt.a(this.d, this.e, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final List list, final Function1 function1, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(1377931349);
        if ((i & 48) == 0) {
            i2 = (composerImplV.I(function1) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(-1633490746);
            boolean zI = ((i2 & 112) == 32) | composerImplV.I(list);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new Function1() { // from class: au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LazyListScope LazyColumn = (LazyListScope) obj;
                        Intrinsics.h(LazyColumn, "$this$LazyColumn");
                        final List list2 = list;
                        int size = list2.size();
                        final Function1 function12 = function1;
                        LazyListScope.g(LazyColumn, size, null, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet.SnapAListBottomSheetScreenKt$Options$1$1$1
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
                                    SnapAListBottomSheetScreenKt.a((SnapAListMenuOption) list2.get(iIntValue), function12, composer2, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, true, 164726135), 6);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            LazyDslKt.b(null, null, null, false, null, null, null, false, null, (Function1) objG, composerImplV, 0, 511);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.editorder.review.components.b(list, function1, i, 2);
        }
    }

    public static final void c(SnapAListBottomSheetType type, Function1 onSelected, Composer composer, int i) {
        int i2;
        boolean z;
        Intrinsics.h(type, "type");
        Intrinsics.h(onSelected, "onSelected");
        ComposerImpl composerImplV = composer.v(872273255);
        if ((i & 6) == 0) {
            i2 = (composerImplV.r(type.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onSelected) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            float f = 16;
            Modifier modifierH = PaddingKt.h(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, f, 1);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
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
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            int iOrdinal = type.ordinal();
            ImageMenuOption imageMenuOption = ImageMenuOption.c;
            CameraMenuOption cameraMenuOption = CameraMenuOption.c;
            if (iOrdinal == 0) {
                z = true;
                composerImplV.o(-2144688248);
                SnapAListLottieKt.a(null, composerImplV, 0);
                d(StringResources_androidKt.c(composerImplV, R.string.shop_lists_snap_menu_title), composerImplV, 0);
                b(CollectionsKt.R(cameraMenuOption, imageMenuOption), onSelected, composerImplV, (i2 & 112) | 6);
                composerImplV.V(false);
            } else {
                if (iOrdinal != 1) {
                    throw au.com.woolworths.android.onesite.a.w(2009025095, composerImplV, false);
                }
                composerImplV.o(-2144345481);
                z = true;
                ImageKt.a(PainterResources_androidKt.a(R.drawable.ic_shop_lists_snap_new_list, 0, composerImplV), null, ColumnScopeInstance.f948a.b(PaddingKt.f(companion, f), Alignment.Companion.n), null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 48, 120);
                d(StringResources_androidKt.c(composerImplV, R.string.shop_lists_add_list), composerImplV, 0);
                b(CollectionsKt.R(cameraMenuOption, imageMenuOption, WriteMenuOption.c), onSelected, composerImplV, (i2 & 112) | 6);
                composerImplV.V(false);
            }
            composerImplV.V(z);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.lists.ui.details.ui.compose.b(type, i, 5, onSelected);
        }
    }

    public static final void d(String str, Composer composer, int i) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-1799795135);
        int i2 = i | (composerImplV.n(str) ? 4 : 2);
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImpl = composerImplV;
            TextKt.b(str, SizeKt.z(SizeKt.e(PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 8, 7), 1.0f), Alignment.Companion.e, 2), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).d.c.b, composerImpl, (i2 & 14) | 48, 0, 65532);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.corerow.impl.b(str, i, 11);
        }
    }
}
