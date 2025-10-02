package au.com.woolworths.feature.shop.account.ui.details.components;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.SurfaceKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.product.list.compose.d;
import au.com.woolworths.feature.shop.account.viewmodel.details.AccountDetailsContract;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"account_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AccountDetailsScreenKt {
    public static final void a(final AccountDetailsContract.ViewState viewState, final Function0 onBackClicked, final Function1 onButtonClick, final Function0 onRetryClick, Composer composer, int i) {
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(onBackClicked, "onBackClicked");
        Intrinsics.h(onButtonClick, "onButtonClick");
        Intrinsics.h(onRetryClick, "onRetryClick");
        ComposerImpl composerImplV = composer.v(151925233);
        int i2 = (composerImplV.n(viewState) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onBackClicked) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onButtonClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onRetryClick) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ScaffoldKt.a(SizeKt.c, ComposableLambdaKt.c(-1701423691, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.account.ui.details.components.AccountDetailsScreenKt$AccountDetailsScreen$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        AccountDetailsScreenKt.b(onBackClicked, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0L, null, ComposableLambdaKt.c(-1318214082, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.account.ui.details.components.AccountDetailsScreenKt$AccountDetailsScreen$2
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
                        long j = CoreTheme.b(composer2).e.f4848a.c;
                        final Function1 function1 = onButtonClick;
                        final Function0 function0 = onRetryClick;
                        final AccountDetailsContract.ViewState viewState2 = viewState;
                        SurfaceKt.b(modifierE, null, j, 0L, null, null, ComposableLambdaKt.c(-1039196798, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.account.ui.details.components.AccountDetailsScreenKt$AccountDetailsScreen$2.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                Composer composer3 = (Composer) obj4;
                                if ((((Number) obj5).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    AccountDetailsContract.ViewState viewState3 = viewState2;
                                    if (viewState3 instanceof AccountDetailsContract.ViewState.Content) {
                                        composer3.o(-587438650);
                                        AccountDetailsContentKt.a(((AccountDetailsContract.ViewState.Content) viewState3).f6597a, function1, composer3, 0);
                                        composer3.l();
                                    } else if (viewState3 instanceof AccountDetailsContract.ViewState.Error) {
                                        composer3.o(-587192107);
                                        AccountDetailsOtherScreenKt.a(((AccountDetailsContract.ViewState.Error) viewState3).f6598a, function0, composer3, 0);
                                        composer3.l();
                                    } else {
                                        if (!Intrinsics.c(viewState3, AccountDetailsContract.ViewState.Loading.f6599a)) {
                                            throw au.com.woolworths.android.onesite.a.x(composer3, 2059258171);
                                        }
                                        composer3.o(-586964567);
                                        AccountDetailsOtherScreenKt.b(composer3, 0);
                                        composer3.l();
                                    }
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 58);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 12582966, 124);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(viewState, onBackClicked, onButtonClick, onRetryClick, i, 14);
        }
    }

    public static final void b(final Function0 function0, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(595165560);
        if ((((composerImplV.I(function0) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            TopNavBarKt.a(StringResources_androidKt.c(composerImplV, R.string.account_details_title), null, 0L, 0L, 0L, null, null, ComposableLambdaKt.c(-1281285014, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.account.ui.details.components.AccountDetailsScreenKt$AccountDetailsTopBar$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        IconButtonKt.c(ArrowBackKt.a(), "back button", function0, null, false, null, 0L, composer2, 48, 120);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, composerImplV, 100663296, 766);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.account.authentication.ui.b(i, 1, function0);
        }
    }
}
