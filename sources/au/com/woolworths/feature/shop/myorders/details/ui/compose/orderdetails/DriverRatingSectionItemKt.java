package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.VectorResources_androidKt;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.component.stable.alert.AlertKt;
import au.com.woolworths.design.core.ui.component.stable.alert.AlertStyle;
import au.com.woolworths.design.core.ui.component.stable.button.PrimaryButtonKt;
import au.com.woolworths.design.core.ui.component.stable.button.TertiaryButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsContract;
import au.com.woolworths.feature.shop.myorders.details.models.DriverRating;
import au.com.woolworths.feature.shop.myorders.details.models.DriverRatingStarsSurvey;
import au.com.woolworths.feature.shop.myorders.details.models.DriverRatingThankYou;
import au.com.woolworths.feature.shop.myorders.details.models.StarCount;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class DriverRatingSectionItemKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[OrderDetailsContract.DriverRatingState.ThankYou.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OrderDetailsContract.DriverRatingState.ThankYou thankYou = OrderDetailsContract.DriverRatingState.ThankYou.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                OrderDetailsContract.DriverRatingState.ThankYou thankYou2 = OrderDetailsContract.DriverRatingState.ThankYou.d;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final void a(OrderDetailsContract.DriverRatingState driverRatingState, DriverRating driverRating, Function1 onStarSelected, Function1 onStarRatingButtonClick, Function1 onChipToggled, Function1 onInputFeedbackTextChange, Function1 onInputFeedbackButtonClick, Function1 onMessageUsClick, Composer composer, int i) {
        Intrinsics.h(driverRatingState, "driverRatingState");
        Intrinsics.h(driverRating, "driverRating");
        Intrinsics.h(onStarSelected, "onStarSelected");
        Intrinsics.h(onStarRatingButtonClick, "onStarRatingButtonClick");
        Intrinsics.h(onChipToggled, "onChipToggled");
        Intrinsics.h(onInputFeedbackTextChange, "onInputFeedbackTextChange");
        Intrinsics.h(onInputFeedbackButtonClick, "onInputFeedbackButtonClick");
        Intrinsics.h(onMessageUsClick, "onMessageUsClick");
        ComposerImpl composerImplV = composer.v(822274721);
        int i2 = (composerImplV.n(driverRatingState) ? 4 : 2) | i | (composerImplV.I(driverRating) ? 32 : 16);
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onStarSelected) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onStarRatingButtonClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(onChipToggled) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(onInputFeedbackTextChange) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.I(onInputFeedbackButtonClick) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.I(onMessageUsClick) ? 8388608 : 4194304;
        }
        if ((4793491 & i2) == 4793490 && composerImplV.c()) {
            composerImplV.j();
        } else if (driverRatingState instanceof OrderDetailsContract.DriverRatingState.StarRating) {
            composerImplV.o(-2106698401);
            c(driverRatingState, driverRating, onStarSelected, onStarRatingButtonClick, composerImplV, i2 & 8176);
            composerImplV.V(false);
        } else if (driverRatingState instanceof OrderDetailsContract.DriverRatingState.FeedbackInput) {
            composerImplV.o(-2106436234);
            int i3 = i2;
            int i4 = i3 & 112;
            int i5 = i3 >> 6;
            b((OrderDetailsContract.DriverRatingState.FeedbackInput) driverRatingState, driverRating, onChipToggled, onInputFeedbackTextChange, onInputFeedbackButtonClick, composerImplV, (i5 & 57344) | i4 | (i5 & 896) | (i5 & 7168));
            composerImplV = composerImplV;
            composerImplV.V(false);
        } else {
            int i6 = i2;
            if (!(driverRatingState instanceof OrderDetailsContract.DriverRatingState.ThankYou)) {
                throw au.com.woolworths.android.onesite.a.w(-67960408, composerImplV, false);
            }
            composerImplV.o(-2106144338);
            f((OrderDetailsContract.DriverRatingState.ThankYou) driverRatingState, driverRating, onMessageUsClick, composerImplV, ((i6 >> 15) & 896) | (i6 & 112));
            composerImplV.V(false);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.broadcastbanner.b(driverRatingState, driverRating, onStarSelected, onStarRatingButtonClick, onChipToggled, onInputFeedbackTextChange, onInputFeedbackButtonClick, onMessageUsClick, i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0395  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final au.com.woolworths.feature.shop.myorders.details.OrderDetailsContract.DriverRatingState.FeedbackInput r53, final au.com.woolworths.feature.shop.myorders.details.models.DriverRating r54, final kotlin.jvm.functions.Function1 r55, final kotlin.jvm.functions.Function1 r56, final kotlin.jvm.functions.Function1 r57, androidx.compose.runtime.Composer r58, final int r59) {
        /*
            Method dump skipped, instructions count: 985
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.DriverRatingSectionItemKt.b(au.com.woolworths.feature.shop.myorders.details.OrderDetailsContract$DriverRatingState$FeedbackInput, au.com.woolworths.feature.shop.myorders.details.models.DriverRating, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    public static final void c(OrderDetailsContract.DriverRatingState driverRatingState, DriverRating driverRating, Function1 function1, Function1 function12, Composer composer, int i) {
        Modifier.Companion companion;
        Function1 function13;
        boolean z;
        DriverRating driverRating2 = driverRating;
        ComposerImpl composerImplV = composer.v(-857220395);
        int i2 = (composerImplV.n(driverRatingState) ? 4 : 2) | i | (composerImplV.I(driverRating2) ? 32 : 16);
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(function12) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            function13 = function12;
        } else {
            StarCount starCount = driverRatingState instanceof OrderDetailsContract.DriverRatingState.StarRating.SelectedStar ? ((OrderDetailsContract.DriverRatingState.StarRating.SelectedStar) driverRatingState).e : StarCount.g;
            float f = 24;
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifierH = PaddingKt.h(companion2, BitmapDescriptorFactory.HUE_RED, f, 1);
            Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, 0);
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
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            StarCount starCount2 = starCount;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            composerImplV.o(-1896192673);
            DriverRatingStarsSurvey driverRatingStarsSurvey = driverRating2.b;
            if (driverRatingStarsSurvey == null) {
                composerImplV.V(false);
                function13 = function12;
                z = true;
            } else {
                float f2 = 16;
                int i4 = i2;
                Modifier modifierH2 = PaddingKt.h(companion2, f2, BitmapDescriptorFactory.HUE_RED, 2);
                ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, 0);
                int i5 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
                Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierH2);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, columnMeasurePolicyA2, function2);
                Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                    androidx.camera.core.impl.b.B(i5, composerImplV, i5, function23);
                }
                Updater.b(composerImplV, modifierD2, function24);
                TextKt.b(driverRatingStarsSurvey.f7756a, null, CoreTheme.b(composerImplV).e.d.d, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).d.c.b, composerImplV, 0, 0, 65530);
                float f3 = 4;
                SpacerKt.a(composerImplV, SizeKt.g(companion2, f3));
                TextKt.b(driverRatingStarsSurvey.b, null, CoreTheme.b(composerImplV).e.d.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).f5120a.c.c, composerImplV, 0, 0, 65530);
                SpacerKt.a(composerImplV, SizeKt.g(companion2, f2));
                TextKt.b(driverRatingStarsSurvey.c, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).f5120a.b.f5123a, composerImplV, 0, 0, 65534);
                composerImplV = composerImplV;
                float f4 = 8;
                SpacerKt.a(composerImplV, SizeKt.g(companion2, f4));
                e(starCount2, function1, composerImplV, (i4 >> 3) & 112);
                composerImplV.V(true);
                composerImplV.o(1739976414);
                if (Intrinsics.c(driverRatingState, OrderDetailsContract.DriverRatingState.StarRating.NoStarAlert.e)) {
                    SpacerKt.a(composerImplV, SizeKt.g(companion2, f4));
                    AlertStyle alertStyleA = driverRatingStarsSurvey.d.getStyle().a();
                    String description = driverRatingStarsSurvey.d.getDescription();
                    if (description == null) {
                        description = "";
                    }
                    companion = companion2;
                    AlertKt.b(alertStyleA, description, PaddingKt.j(companion, f3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), composerImplV, KyberEngine.KyberPolyBytes);
                } else {
                    companion = companion2;
                }
                composerImplV.V(false);
                SpacerKt.a(composerImplV, SizeKt.g(companion, f));
                Modifier modifierH3 = PaddingKt.h(companion, f2, BitmapDescriptorFactory.HUE_RED, 2);
                RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 0);
                int i6 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
                Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierH3);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, rowMeasurePolicyA, function2);
                Updater.b(composerImplV, persistentCompositionLocalMapQ3, function22);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                    androidx.camera.core.impl.b.B(i6, composerImplV, i6, function23);
                }
                Updater.b(composerImplV, modifierD3, function24);
                SpacerKt.a(composerImplV, RowScopeInstance.f974a.a(companion, 1.0f, true));
                String str = driverRatingStarsSurvey.e.e;
                composerImplV.o(-1746271574);
                driverRating2 = driverRating;
                boolean zI = composerImplV.I(driverRating2) | ((i4 & 7168) == 2048) | composerImplV.r(starCount2.ordinal());
                Object objG = composerImplV.G();
                if (zI || objG == Composer.Companion.f1624a) {
                    function13 = function12;
                    objG = new androidx.work.impl.utils.c(13, function13, driverRating2, starCount2);
                    composerImplV.A(objG);
                } else {
                    function13 = function12;
                }
                composerImplV.V(false);
                PrimaryButtonKt.a(str, (Function0) objG, null, false, null, null, null, null, composerImplV, 0, 252);
                z = true;
                composerImplV.V(true);
                composerImplV.V(false);
            }
            composerImplV.V(z);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.d(driverRatingState, driverRating2, function1, function13, i, 21);
        }
    }

    public static final void d(final long j, final ImageVector imageVector, final long j2, final Function0 function0, Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(-834468399);
        int i2 = i | (composerImplV.s(j) ? 4 : 2) | (composerImplV.n(imageVector) ? 32 : 16) | (composerImplV.s(j2) ? 256 : 128) | (composerImplV.I(function0) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierB = BackgroundKt.b(ClipKt.a(SizeKt.q(companion, 40), RoundedCornerShapeKt.b(8)), j, RectangleShapeKt.f1779a);
            composerImplV.o(5004770);
            boolean z = (i2 & 7168) == 2048;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.shop.homepage.presentation.lists.b(25, function0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierD = ClickableKt.d(modifierB, false, null, null, (Function0) objG, 7);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierD);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD2, ComposeUiNode.Companion.d);
            IconKt.b(imageVector, null, SizeKt.q(companion, 20), j2, composerImplV, ((i2 >> 3) & 14) | 432 | ((i2 << 3) & 7168), 0);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(j, imageVector, j2, function0, i) { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.g
                public final /* synthetic */ long d;
                public final /* synthetic */ ImageVector e;
                public final /* synthetic */ long f;
                public final /* synthetic */ Function0 g;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    DriverRatingSectionItemKt.d(this.d, this.e, this.f, this.g, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void e(StarCount starCount, Function1 function1, Composer composer, int i) {
        int i2;
        long j;
        ImageVector imageVectorB;
        int i3;
        long j2;
        ComposerImpl composerImplV = composer.v(-754230771);
        if ((i & 6) == 0) {
            i2 = (composerImplV.r(starCount.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = 32;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function1) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 0);
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
            composerImplV.o(-1562600703);
            int i6 = OrderDetailsContract.DriverRatingState.StarRating.d;
            boolean z = true;
            if (1 <= i6) {
                int i7 = 1;
                while (true) {
                    boolean z2 = i7 <= starCount.d ? z : false;
                    composerImplV.o(1434077722);
                    if (z2) {
                        composerImplV.o(-535805375);
                        j = CoreTheme.b(composerImplV).f4782a.f4783a.b.b;
                    } else {
                        composerImplV.o(-535803551);
                        j = CoreTheme.b(composerImplV).f4782a.f4783a.d.b;
                    }
                    composerImplV.V(false);
                    if (z2) {
                        composerImplV.o(-535798939);
                        imageVectorB = CoreTheme.e(composerImplV).i.h;
                    } else {
                        composerImplV.o(-535797931);
                        imageVectorB = VectorResources_androidKt.b(R.drawable.ic_driver_ratings_star, 6, composerImplV);
                    }
                    composerImplV.V(false);
                    if (z2) {
                        composerImplV.o(-535793087);
                        i3 = i7;
                        j2 = CoreTheme.b(composerImplV).f4782a.c.b.f4793a;
                    } else {
                        i3 = i7;
                        composerImplV.o(-535791455);
                        j2 = CoreTheme.b(composerImplV).f4782a.c.d.f4795a;
                    }
                    composerImplV.V(false);
                    composerImplV.V(false);
                    composerImplV.o(-1633490746);
                    boolean zR = ((i2 & 112) == i4) | composerImplV.r(i3);
                    Object objG = composerImplV.G();
                    if (zR || objG == Composer.Companion.f1624a) {
                        objG = new au.com.woolworths.design.core.ui.component.experimental.segmentedbuttons.b(i3, 1, function1);
                        composerImplV.A(objG);
                    }
                    composerImplV.V(false);
                    int i8 = i3;
                    d(j, imageVectorB, j2, (Function0) objG, composerImplV, 0);
                    SpacerKt.a(composerImplV, SizeKt.u(companion, 8));
                    if (i8 == i6) {
                        break;
                    }
                    i7 = i8 + 1;
                    z = true;
                    i4 = 32;
                }
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(starCount, i, 3, function1);
        }
    }

    public static final void f(final OrderDetailsContract.DriverRatingState.ThankYou thankYou, final DriverRating driverRating, final Function1 function1, Composer composer, final int i) {
        Function1 function12;
        ComposerImpl composerImplV = composer.v(-1207324077);
        int i2 = (composerImplV.r(thankYou.ordinal()) ? 4 : 2) | i | (composerImplV.I(driverRating) ? 32 : 16);
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function1) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            function12 = function1;
        } else {
            DriverRatingThankYou driverRatingThankYou = driverRating.d;
            if (driverRatingThankYou == null) {
                RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
                if (recomposeScopeImplX != null) {
                    final int i3 = 0;
                    recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.i
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = i3;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    DriverRatingSectionItemKt.f(thankYou, driverRating, function1, composer2, RecomposeScopeImplKt.a(i | 1));
                                    break;
                                default:
                                    DriverRatingSectionItemKt.f(thankYou, driverRating, function1, composer2, RecomposeScopeImplKt.a(i | 1));
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    return;
                }
                return;
            }
            float f = 16;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierG = PaddingKt.g(companion, f, 24);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
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
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            int i5 = i2;
            TextKt.b(driverRatingThankYou.f7758a, null, CoreTheme.b(composerImplV).e.d.d, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).d.c.b, composerImplV, 0, 0, 65530);
            SpacerKt.a(composerImplV, SizeKt.g(companion, f));
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierE);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            SingletonAsyncImageKt.a(driverRatingThankYou.c, null, SizeKt.e(companion, 0.75f), null, ContentScale.Companion.d, composerImplV, 1573296, 1976);
            composerImplV.V(true);
            SpacerKt.a(composerImplV, SizeKt.g(companion, f));
            TextKt.b(driverRatingThankYou.b, null, CoreTheme.b(composerImplV).e.d.d, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).f5120a.f5121a.b, composerImplV, 0, 0, 65530);
            SpacerKt.a(composerImplV, SizeKt.g(companion, 4));
            int iOrdinal = thankYou.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    composerImplV.o(640194651);
                    TextKt.b(driverRatingThankYou.g, null, CoreTheme.b(composerImplV).e.d.d, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).f5120a.b.f5123a, composerImplV, 0, 0, 65530);
                    composerImplV = composerImplV;
                    composerImplV.V(false);
                } else {
                    if (iOrdinal != 2) {
                        throw au.com.woolworths.android.onesite.a.w(-1364833872, composerImplV, false);
                    }
                    composerImplV.o(639873150);
                    TextKt.b(driverRatingThankYou.h, null, CoreTheme.b(composerImplV).e.d.d, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).f5120a.b.f5123a, composerImplV, 0, 0, 65530);
                    composerImplV = composerImplV;
                    composerImplV.V(false);
                }
                function12 = function1;
            } else {
                composerImplV.o(640540487);
                TextKt.b(driverRatingThankYou.d, null, CoreTheme.b(composerImplV).e.d.d, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).f5120a.b.f5123a, composerImplV, 0, 0, 65530);
                SpacerKt.a(composerImplV, SizeKt.g(companion, f));
                TextKt.b(driverRatingThankYou.e, null, CoreTheme.b(composerImplV).e.d.d, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).f5120a.b.b, composerImplV, 0, 0, 65530);
                SpacerKt.a(composerImplV, SizeKt.g(companion, 8));
                String str = driverRatingThankYou.f.e;
                composerImplV.o(-1633490746);
                boolean zI = ((i5 & 896) == 256) | composerImplV.I(driverRatingThankYou);
                Object objG = composerImplV.G();
                if (zI || objG == Composer.Companion.f1624a) {
                    function12 = function1;
                    objG = new f(1, function12, driverRatingThankYou);
                    composerImplV.A(objG);
                } else {
                    function12 = function1;
                }
                composerImplV.V(false);
                TertiaryButtonKt.a(str, (Function0) objG, SizeKt.e(companion, 1.0f), false, null, null, null, composerImplV, KyberEngine.KyberPolyBytes, 248);
                composerImplV = composerImplV;
                composerImplV.V(false);
            }
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX2 = composerImplV.X();
        if (recomposeScopeImplX2 != null) {
            final int i7 = 1;
            final Function1 function13 = function12;
            recomposeScopeImplX2.d = new Function2() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = i7;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i42) {
                        case 0:
                            DriverRatingSectionItemKt.f(thankYou, driverRating, function13, composer2, RecomposeScopeImplKt.a(i | 1));
                            break;
                        default:
                            DriverRatingSectionItemKt.f(thankYou, driverRating, function13, composer2, RecomposeScopeImplKt.a(i | 1));
                            break;
                    }
                    return Unit.f24250a;
                }
            };
        }
    }
}
