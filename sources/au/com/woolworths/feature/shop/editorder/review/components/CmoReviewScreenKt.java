package au.com.woolworths.feature.shop.editorder.review.components;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.SurfaceKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState;
import au.com.woolworths.feature.product.list.v2.ui.f;
import au.com.woolworths.feature.shop.editorder.review.CmoReviewContract;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"edit-order_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CmoReviewScreenKt {
    public static final void a(final CmoReviewContract.ViewState viewState, Flow actionFlow, final Function1 onEvent, Function1 onNavigation, Composer composer, int i) {
        Flow flow;
        final SnackbarHostState snackbarHostState;
        ComposerImpl composerImpl;
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(actionFlow, "actionFlow");
        Intrinsics.h(onEvent, "onEvent");
        Intrinsics.h(onNavigation, "onNavigation");
        ComposerImpl composerImplV = composer.v(903029623);
        int i2 = (composerImplV.n(viewState) ? 4 : 2) | i | (composerImplV.I(actionFlow) ? 32 : 16);
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onEvent) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onNavigation) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            flow = actionFlow;
            composerImpl = composerImplV;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new SnackbarHostState();
                composerImplV.A(objG);
            }
            SnackbarHostState snackbarHostState2 = (SnackbarHostState) objG;
            composerImplV.V(false);
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            composerImplV.o(-1224400529);
            boolean zI = ((i2 & 7168) == 2048) | composerImplV.I(actionFlow) | composerImplV.I(context);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                flow = actionFlow;
                snackbarHostState = snackbarHostState2;
                CmoReviewScreenKt$CmoReviewScreen$1$1 cmoReviewScreenKt$CmoReviewScreen$1$1 = new CmoReviewScreenKt$CmoReviewScreen$1$1(flow, snackbarHostState, context, onNavigation, null);
                composerImplV.A(cmoReviewScreenKt$CmoReviewScreen$1$1);
                objG2 = cmoReviewScreenKt$CmoReviewScreen$1$1;
            } else {
                flow = actionFlow;
                snackbarHostState = snackbarHostState2;
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, flow, (Function2) objG2);
            composerImpl = composerImplV;
            ScaffoldKt.a(SizeKt.c, ComposableLambdaKt.c(-1915982029, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.editorder.review.components.CmoReviewScreenKt$CmoReviewScreen$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String strC = StringResources_androidKt.c(composer2, R.string.cmo_review_screen_title);
                        final Function1 function1 = onEvent;
                        TopNavBarKt.a(strC, null, 0L, 0L, 0L, null, null, ComposableLambdaKt.c(596698113, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.editorder.review.components.CmoReviewScreenKt$CmoReviewScreen$2.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    ImageVector imageVectorA = ArrowBackKt.a();
                                    composer3.o(5004770);
                                    Function1 function12 = function1;
                                    boolean zN = composer3.n(function12);
                                    Object objG3 = composer3.G();
                                    if (zN || objG3 == Composer.Companion.f1624a) {
                                        objG3 = new f(18, function12);
                                        composer3.A(objG3);
                                    }
                                    composer3.l();
                                    IconButtonKt.c(imageVectorA, "back button", (Function0) objG3, null, false, null, 0L, composer3, 48, 120);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null, composer2, 100663296, 766);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, ComposableLambdaKt.c(-1345710223, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.editorder.review.components.CmoReviewScreenKt$CmoReviewScreen$3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        SnackbarHostKt.b(snackbarHostState, null, composer2, 6, 2);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), 0L, null, ComposableLambdaKt.c(776599434, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.editorder.review.components.CmoReviewScreenKt$CmoReviewScreen$4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues it = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(it) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierE = PaddingKt.e(Modifier.Companion.d, it);
                        final CmoReviewContract.ViewState viewState2 = viewState;
                        final Function1 function1 = onEvent;
                        SurfaceKt.b(modifierE, null, 0L, 0L, null, null, ComposableLambdaKt.c(100302790, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.editorder.review.components.CmoReviewScreenKt$CmoReviewScreen$4.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                Composer composer3 = (Composer) obj4;
                                if ((((Number) obj5).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    CmoReviewContract.ViewState.Loading loading = CmoReviewContract.ViewState.Loading.f7097a;
                                    CmoReviewContract.ViewState viewState3 = viewState2;
                                    if (Intrinsics.c(viewState3, loading)) {
                                        composer3.o(1901703509);
                                        CmoReviewOtherScreenKt.b(false, composer3, 0, 1);
                                        composer3.l();
                                    } else {
                                        boolean z = viewState3 instanceof CmoReviewContract.ViewState.Error;
                                        Function1 function12 = function1;
                                        if (z) {
                                            composer3.o(1901705995);
                                            FullPageMessage.Error error = ((CmoReviewContract.ViewState.Error) viewState3).f7096a;
                                            composer3.o(5004770);
                                            boolean zN = composer3.n(function12);
                                            Object objG3 = composer3.G();
                                            if (zN || objG3 == Composer.Companion.f1624a) {
                                                objG3 = new f(19, function12);
                                                composer3.A(objG3);
                                            }
                                            composer3.l();
                                            CmoReviewOtherScreenKt.a(error, (Function0) objG3, composer3, 0);
                                            composer3.l();
                                        } else {
                                            if (!(viewState3 instanceof CmoReviewContract.ViewState.Content)) {
                                                throw au.com.woolworths.android.onesite.a.x(composer3, 1901701666);
                                            }
                                            composer3.o(1901714145);
                                            CmoReviewContentScreenKt.e((CmoReviewContract.ViewState.Content) viewState3, function12, composer3, 0);
                                            composer3.l();
                                        }
                                    }
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 62);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 12586038, 116);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.d(viewState, flow, onEvent, onNavigation, i, 16);
        }
    }
}
