package au.com.woolworths.feature.shop.myorders.details.help;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
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
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.compose.utils.layout.SpacerKt;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.corerow.CoreRowSpec;
import au.com.woolworths.design.core.ui.component.stable.corerow.SimpleRowKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.ui.e;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.c;
import au.com.woolworths.feature.shop.contentpage.ui.n;
import au.com.woolworths.feature.shop.myorders.details.help.models.ContactItem;
import au.com.woolworths.feature.shop.myorders.details.help.models.OrderHelpContactTimes;
import au.com.woolworths.feature.shop.myorders.details.help.models.OrderHelpDataList;
import au.com.woolworths.feature.shop.myorders.details.help.models.OrderHelpItemData;
import au.com.woolworths.feature.shop.myorders.details.help.models.OrderHelpItemType;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.wallet.WalletConstants;
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
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class HelpAndSupportScreenKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7715a;

        static {
            int[] iArr = new int[OrderHelpItemType.values().length];
            try {
                iArr[OrderHelpItemType.FAQ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderHelpItemType.CALL_US.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderHelpItemType.CHAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderHelpItemType.e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f7715a = iArr;
        }
    }

    public static final void a(List list, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1645161168);
        int i2 = 2;
        if (((i | (composerImplV.I(list) ? 4 : 2)) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(-451913331);
            float fB = ((Density) composerImplV.x(CompositionLocalsKt.h)).B((int) (((WindowInfo) composerImplV.x(CompositionLocalsKt.t)).a() >> 32));
            boolean z = false;
            composerImplV.V(false);
            float f = 0.33f * fB;
            float f2 = fB * 0.04f;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
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
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(-1757152431);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ContactItem contactItem = (ContactItem) it.next();
                Modifier modifierE = SizeKt.e(companion, 1.0f);
                RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
                int i4 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
                Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierE);
                ComposeUiNode.e3.getClass();
                Function0 function02 = ComposeUiNode.Companion.b;
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function02);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                Updater.b(composerImplV, persistentCompositionLocalMapQ2, ComposeUiNode.Companion.f);
                Function2 function22 = ComposeUiNode.Companion.j;
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                    b.B(i4, composerImplV, i4, function22);
                }
                Updater.b(composerImplV, modifierD2, ComposeUiNode.Companion.d);
                float f3 = i2;
                Modifier.Companion companion2 = companion;
                TextKt.a(contactItem.d, CoreTheme.f(composerImplV).f5120a.b.f5123a, PaddingKt.h(SizeKt.u(companion, f), BitmapDescriptorFactory.HUE_RED, f3, 1), CoreTheme.b(composerImplV).e.d.d, null, 0, 0, false, 0, null, composerImplV, 0, 1008);
                SpacerKt.d(RowScopeInstance.f974a, f2, composerImplV, 6);
                TextKt.a(contactItem.e, CoreTheme.f(composerImplV).f5120a.b.f5123a, PaddingKt.h(companion2, BitmapDescriptorFactory.HUE_RED, f3, 1), CoreTheme.b(composerImplV).e.d.d, null, 0, 0, false, 0, null, composerImplV, KyberEngine.KyberPolyBytes, 1008);
                composerImplV.V(true);
                z = false;
                companion = companion2;
                i2 = 2;
                f = f;
            }
            composerImplV.V(z);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new e(i, 1, list);
        }
    }

    public static final void b(OrderHelpContactTimes orderHelpContactTimes, Composer composer, int i) {
        boolean z;
        ComposerImpl composerImplV = composer.v(1350092188);
        if (((i | (composerImplV.I(orderHelpContactTimes) ? 4 : 2)) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            float f = 8;
            Modifier modifierG = PaddingKt.g(Modifier.Companion.d, 16, f);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i2 = composerImplV.P;
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(1012433708);
            if (orderHelpContactTimes == null) {
                z = false;
            } else {
                z = false;
                TextKt.a(orderHelpContactTimes.d, CoreTheme.f(composerImplV).e.f5133a.b, null, CoreTheme.b(composerImplV).e.d.d, null, 0, 0, false, 0, null, composerImplV, 0, 1012);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f948a;
                SpacerKt.c(columnScopeInstance, f, composerImplV, 54);
                a(orderHelpContactTimes.f, composerImplV, 0);
                SpacerKt.c(columnScopeInstance, f, composerImplV, 54);
                TextKt.a(orderHelpContactTimes.e, CoreTheme.f(composerImplV).f5120a.b.f5123a, null, CoreTheme.b(composerImplV).e.d.d, null, 0, 0, false, 0, null, composerImplV, 0, 1012);
            }
            composerImplV.V(z);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.homepage.presentation.marketplace.a(i, 7, orderHelpContactTimes);
        }
    }

    public static final void c(OrderHelpDataList orderHelpDataList, Composer composer, int i) {
        boolean z;
        ComposerImpl composerImplV = composer.v(542392467);
        if ((((composerImplV.I(orderHelpDataList) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            float f = 8;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierG = PaddingKt.g(companion, 16, f);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i2 = composerImplV.P;
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            String str = orderHelpDataList.d;
            composerImplV.o(289003350);
            if (str != null) {
                SingletonAsyncImageKt.a(orderHelpDataList.d, null, SizeKt.q(companion, 64), null, ContentScale.Companion.b, composerImplV, 1573296, 1976);
            }
            composerImplV.V(false);
            SpacerKt.c(ColumnScopeInstance.f948a, f, composerImplV, 54);
            String str2 = orderHelpDataList.e;
            composerImplV.o(289012780);
            if (str2 == null) {
                z = false;
            } else {
                z = false;
                TextKt.a(str2, CoreTheme.f(composerImplV).e.f5133a.b, null, CoreTheme.b(composerImplV).e.d.d, null, 0, 0, false, 0, null, composerImplV, 0, 1012);
            }
            composerImplV.V(z);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.homepage.presentation.marketplace.a(i, 6, orderHelpDataList);
        }
    }

    public static final void d(OrderHelpDataList orderHelpDataList, Function1 function1, Composer composer, int i) {
        ImageVector imageVector;
        ComposerImpl composerImplV = composer.v(442995713);
        int i2 = 2;
        int i3 = 4;
        int i4 = 32;
        int i5 = (composerImplV.I(orderHelpDataList) ? 4 : 2) | i | (composerImplV.I(function1) ? 32 : 16);
        if ((i5 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            List<OrderHelpItemData> list = orderHelpDataList.g;
            if (list != null) {
                for (OrderHelpItemData orderHelpItemData : list) {
                    int i6 = WhenMappings.f7715a[orderHelpItemData.h.ordinal()];
                    if (i6 == 1 || i6 == i2) {
                        composerImplV.o(-724361257);
                        imageVector = CoreTheme.e(composerImplV).e.p;
                        composerImplV.V(false);
                    } else if (i6 == 3) {
                        composerImplV.o(-724358766);
                        imageVector = CoreTheme.e(composerImplV).e.q;
                        composerImplV.V(false);
                    } else {
                        if (i6 != i3) {
                            throw au.com.woolworths.android.onesite.a.w(-724364665, composerImplV, false);
                        }
                        composerImplV.o(-980239726);
                        composerImplV.V(false);
                        imageVector = null;
                    }
                    CoreRowSpec.Image.RemoteImage remoteImage = new CoreRowSpec.Image.RemoteImage(orderHelpItemData.d, null, CoreRowSpec.ImageSize.c, i2);
                    String str = orderHelpItemData.e;
                    CoreRowSpec.Image.LocalImage localImage = imageVector != null ? new CoreRowSpec.Image.LocalImage(imageVector, null, CoreRowSpec.ImageSize.f4756a, i2) : null;
                    composerImplV.o(-1633490746);
                    boolean zN = composerImplV.n(orderHelpItemData) | ((i5 & 112) == i4);
                    Object objG = composerImplV.G();
                    if (zN || objG == Composer.Companion.f1624a) {
                        objG = new n(28, function1, orderHelpItemData);
                        composerImplV.A(objG);
                    }
                    composerImplV.V(false);
                    SimpleRowKt.a(str, (Function0) objG, null, null, null, remoteImage, localImage, null, null, composerImplV, 262144, WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION);
                    i2 = i2;
                    i4 = i4;
                    i3 = 4;
                }
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(orderHelpDataList, function1, i, 0);
        }
    }

    public static final void e(final OrderHelpDataList helpData, final Function0 onBackPressed, final Function1 onHelpItemClicked, Composer composer, int i) {
        Intrinsics.h(helpData, "helpData");
        Intrinsics.h(onBackPressed, "onBackPressed");
        Intrinsics.h(onHelpItemClicked, "onHelpItemClicked");
        ComposerImpl composerImplV = composer.v(227851355);
        int i2 = (composerImplV.I(helpData) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onBackPressed) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onHelpItemClicked) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ScaffoldKt.a(SizeKt.c, ComposableLambdaKt.c(-1124203233, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.help.HelpAndSupportScreenKt$HelpAndSupportScreen$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String strC = StringResources_androidKt.c(composer2, R.string.help_and_support_title);
                        final Function0 function0 = onBackPressed;
                        TopNavBarKt.a(strC, null, 0L, 0L, 0L, null, null, ComposableLambdaKt.c(-2109657967, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.help.HelpAndSupportScreenKt$HelpAndSupportScreen$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    IconButtonKt.c(ArrowBackKt.a(), "Back", function0, null, false, null, 0L, composer3, 48, 120);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null, composer2, 100663296, 766);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0L, null, ComposableLambdaKt.c(-214057752, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.help.HelpAndSupportScreenKt$HelpAndSupportScreen$2
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
                        Modifier modifierE = PaddingKt.e(Modifier.Companion.d, paddingValues);
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierE);
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
                            b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        OrderHelpDataList orderHelpDataList = helpData;
                        HelpAndSupportScreenKt.c(orderHelpDataList, composer2, 0);
                        HelpAndSupportScreenKt.d(orderHelpDataList, onHelpItemClicked, composer2, 0);
                        HelpAndSupportScreenKt.b(orderHelpDataList.h, composer2, 0);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 12582966, 124);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(helpData, onBackPressed, onHelpItemClicked, i, 20);
        }
    }
}
