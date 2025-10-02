package au.com.woolworths.shop.checkout.ui.contactdetails;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.component.stable.textbutton.TextButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.shop.checkout.ui.compose.k;
import au.com.woolworths.shop.checkout.ui.contactdetails.ContactDetailsContract;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ContactDetailsScreenKt {
    public static final void a(final ContactDetailsContract.ViewState viewState, final Function1 onPhoneNumberChange, final Function0 onSaveClick, final Function0 onBackButtonClick, Composer composer, int i) {
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(onPhoneNumberChange, "onPhoneNumberChange");
        Intrinsics.h(onSaveClick, "onSaveClick");
        Intrinsics.h(onBackButtonClick, "onBackButtonClick");
        ComposerImpl composerImplV = composer.v(-1214462128);
        if (((i | (composerImplV.n(viewState) ? 4 : 2) | (composerImplV.I(onPhoneNumberChange) ? 32 : 16) | (composerImplV.I(onSaveClick) ? 256 : 128) | (composerImplV.I(onBackButtonClick) ? 2048 : 1024)) & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ScaffoldKt.a(SizeKt.c, ComposableLambdaKt.c(-1119529460, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.contactdetails.ContactDetailsScreenKt$ContactDetailsScreen$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String strC = StringResources_androidKt.c(composer2, R.string.checkout_contact_details_page_title);
                        final Function0 function0 = onBackButtonClick;
                        ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-735676326, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.contactdetails.ContactDetailsScreenKt$ContactDetailsScreen$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    IconButtonKt.c(CoreTheme.e(composer3).f4879a.G, StringResources_androidKt.c(composer3, R.string.checkout_contact_details_close_content_description), function0, null, false, null, 0L, composer3, 0, 120);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2);
                        final Function0 function02 = onSaveClick;
                        TopNavBarKt.a(strC, null, 0L, 0L, 0L, null, null, composableLambdaImplC, ComposableLambdaKt.c(-19323965, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.contactdetails.ContactDetailsScreenKt$ContactDetailsScreen$1.2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                RowScope TopNavBar = (RowScope) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(TopNavBar, "$this$TopNavBar");
                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    TextButtonKt.a(function02, StringResources_androidKt.c(composer3, R.string.checkout_contact_details_save_button_label), null, false, null, null, null, null, composer3, 0, 508);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 905969664, 254);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0L, null, ComposableLambdaKt.c(-1782906589, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.contactdetails.ContactDetailsScreenKt$ContactDetailsScreen$2
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
                        ContactDetailsContentKt.a(viewState, onPhoneNumberChange, onSaveClick, PaddingKt.e(SizeKt.c, paddingValues), composer2, 0, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 12582966, 124);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new k((Object) viewState, (Object) onPhoneNumberChange, onSaveClick, onBackButtonClick, i, 1);
        }
    }
}
