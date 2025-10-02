package au.com.woolworths.feature.shop.myorders.details.location;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import au.com.woolworths.base.shopapp.modules.button.ButtonStyleApiData;
import au.com.woolworths.design.wx.component.ScaffoldKt;
import au.com.woolworths.design.wx.component.SurfaceKt;
import au.com.woolworths.design.wx.foundation.TintColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shop.marketplace.ui.categories.d;
import au.com.woolworths.feature.shop.modeselector.ui.c;
import au.com.woolworths.feature.shop.myorders.details.models.LocationImage;
import au.com.woolworths.markdown.compat.MarkdownCompatKt;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RequestLocationPermissionPrimingDialogContentKt {
    public static final void a(String str, LocationImage locationImage, boolean z, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-919865859);
        int i3 = i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.r(locationImage.ordinal()) ? 32 : 16) | (composerImplV.p(z) ? 256 : 128);
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            long j = z ? TintColors.e : Color.f;
            RoundedCornerShape roundedCornerShapeB = RoundedCornerShapeKt.b(z ? 100 : 0);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierG = PaddingKt.g(BackgroundKt.b(companion, j, roundedCornerShapeB), PrimitiveResources_androidKt.a(composerImplV, R.dimen.default_padding), PrimitiveResources_androidKt.a(composerImplV, R.dimen.default_padding));
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 0);
            int i4 = composerImplV.P;
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
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            Modifier modifierB = BackgroundKt.b(SizeKt.q(companion, 48), TintColors.e, RoundedCornerShapeKt.b(100));
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierB);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            int iOrdinal = locationImage.ordinal();
            if (iOrdinal == 0) {
                i2 = R.drawable.ic_rationale_default;
            } else if (iOrdinal == 1) {
                i2 = R.drawable.ic_my_location;
            } else if (iOrdinal == 2) {
                i2 = R.drawable.ic_location_off;
            } else {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R.drawable.ic_app_settings;
            }
            ImageKt.a(PainterResources_androidKt.a(i2, 0, composerImplV), null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 48, 124);
            composerImplV.V(true);
            SpacerKt.a(composerImplV, SizeKt.u(companion, 10));
            MarkdownCompatKt.b(str, R.layout.rationale_row_text_markdown, null, null, null, null, composerImplV, i3 & 14, 252);
            composerImplV = composerImplV;
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.account.authentication.ui.a(str, locationImage, z, i, 3);
        }
    }

    public static final void b(String str, List list, Composer composer, int i) {
        List list2 = list;
        ComposerImpl composerImplV = composer.v(92442385);
        int i2 = i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.I(list2) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ImageKt.a(PainterResources_androidKt.a(R.drawable.location_notification, 0, composerImplV), null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 48, 124);
            Modifier.Companion companion = Modifier.Companion.d;
            SpacerKt.a(composerImplV, SizeKt.g(companion, 25));
            TextKt.b(str, PaddingKt.h(companion, PrimitiveResources_androidKt.a(composerImplV, R.dimen.default_padding), BitmapDescriptorFactory.HUE_RED, 2), 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).w, composerImplV, i2 & 14, 0, 65020);
            composerImplV = composerImplV;
            SpacerKt.a(composerImplV, SizeKt.g(companion, PrimitiveResources_androidKt.a(composerImplV, R.dimen.default_margin)));
            Modifier modifierH = PaddingKt.h(companion, PrimitiveResources_androidKt.a(composerImplV, R.dimen.default_padding), BitmapDescriptorFactory.HUE_RED, 2);
            composerImplV.o(5004770);
            list2 = list;
            boolean zI = composerImplV.I(list2);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new d(list2, 1);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            LazyDslKt.b(modifierH, null, null, false, null, null, null, false, null, (Function1) objG, composerImplV, 0, 510);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shared.receipt.details.compose.a(str, i, 15, list2);
        }
    }

    public static final void c(final String str, final List list, final List list2, final String str2, Function1 function1, Composer composer, int i, int i2) {
        int i3;
        Function1 function12;
        int i4;
        final Function1 function13;
        ComposerImpl composerImpl;
        Function1 function14;
        ComposerImpl composerImplV = composer.v(-726173046);
        if ((i & 6) == 0) {
            i3 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | (composerImplV.I(list) ? 32 : 16) | (composerImplV.I(list2) ? 256 : 128);
        if ((i & 3072) == 0) {
            i5 |= composerImplV.n(str2) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i4 = i5 | 24576;
            function12 = function1;
        } else {
            function12 = function1;
            i4 = i5 | (composerImplV.I(function12) ? 16384 : 8192);
        }
        if ((i4 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            function14 = function12;
        } else {
            if (i6 != 0) {
                composerImplV.o(1849434622);
                Object objG = composerImplV.G();
                if (objG == Composer.Companion.f1624a) {
                    objG = new c(13);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                function13 = (Function1) objG;
            } else {
                function13 = function12;
            }
            composerImpl = composerImplV;
            ScaffoldKt.a(null, null, null, null, null, 0, 0L, 0L, null, null, ComposableLambdaKt.c(-1628210047, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.location.RequestLocationPermissionPrimingDialogContentKt$RequestLocationPermissionPrimingDialogContent$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues it = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierX0 = PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 40, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13).x0(SizeKt.c);
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composer2, 48);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierX0);
                        ComposeUiNode.e3.getClass();
                        Function0 function0 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function0);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        RequestLocationPermissionPrimingDialogContentKt.b(str, list, composer2, 0);
                        SpacerKt.a(composer2, ColumnScopeInstance.f948a.a(companion, 1.0f, true));
                        RequestLocationPermissionPrimingDialogContentKt.d(0, composer2, str2, list2, function13);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 0, 1023);
            function14 = function13;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.chip.a(str, list, list2, str2, function14, i, i2, 3);
        }
    }

    public static final void d(int i, Composer composer, final String str, final List list, final Function1 function1) {
        ComposerImpl composerImplV = composer.v(-996280163);
        if (((i | (composerImplV.I(list) ? 4 : 2) | (composerImplV.n(str) ? 32 : 16) | (composerImplV.I(function1) ? 256 : 128)) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            SurfaceKt.a(null, null, 0L, 0L, null, 24, ComposableLambdaKt.c(1651523041, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.location.RequestLocationPermissionPrimingDialogContentKt$RequestLocationPermissionPrimingDialogFooter$2

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {

                    /* renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f7743a;

                    static {
                        int[] iArr = new int[ButtonStyleApiData.values().length];
                        try {
                            iArr[ButtonStyleApiData.SECONDARY.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[ButtonStyleApiData.TERTIARY.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        f7743a = iArr;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierD = ComposedModifierKt.d(composer2, companion);
                        ComposeUiNode.e3.getClass();
                        Function0 function0 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function0);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        Modifier modifierJ = PaddingKt.j(companion, PrimitiveResources_androidKt.a(composer2, R.dimen.default_padding), 16, PrimitiveResources_androidKt.a(composer2, R.dimen.default_padding), BitmapDescriptorFactory.HUE_RED, 8);
                        composer2.o(-1633490746);
                        List list2 = list;
                        boolean zI = composer2.I(list2);
                        Function1 function12 = function1;
                        boolean zN = zI | composer2.n(function12);
                        Object objG = composer2.G();
                        if (zN || objG == Composer.Companion.f1624a) {
                            objG = new au.com.woolworths.feature.shop.editorder.review.components.a(1, list2, function12);
                            composer2.A(objG);
                        }
                        composer2.l();
                        LazyDslKt.b(modifierJ, null, null, false, null, null, null, false, null, (Function1) objG, composer2, 0, 510);
                        SpacerKt.a(composer2, SizeKt.q(companion, 10));
                        TextKt.b(str, AlphaKt.a(PaddingKt.j(ColumnScopeInstance.f948a.b(companion, Alignment.Companion.n), PrimitiveResources_androidKt.a(composer2, R.dimen.default_padding), BitmapDescriptorFactory.HUE_RED, PrimitiveResources_androidKt.a(composer2, R.dimen.default_padding), 24, 2), 0.6f), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer2).r, composer2, 0, 0, 65532);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1769472, 31);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.marketplace.ui.personalised.b(list, str, function1, i, 2);
        }
    }
}
