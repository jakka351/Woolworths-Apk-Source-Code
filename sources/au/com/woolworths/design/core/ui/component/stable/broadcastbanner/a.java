package au.com.woolworths.design.core.ui.component.stable.broadcastbanner;

import androidx.compose.material.ScaffoldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerSpec;
import au.com.woolworths.design.core.ui.component.stable.corerow.CoreRowSpec;
import au.com.woolworths.design.core.ui.component.stable.corerow.SimpleRowKt;
import au.com.woolworths.design.core.ui.component.stable.corerow.impl.CoreRowImplKt;
import au.com.woolworths.dynamic.page.ui.DynamicPageContract;
import au.com.woolworths.dynamic.page.ui.content.DynamicPageScreenKt;
import au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsContractLegacy;
import au.com.woolworths.feature.rewards.offers.detail.composable.RewardsOfferDetailsScreenLegacyKt;
import au.com.woolworths.foundation.rewards.common.ui.iconlist.RewardsIconListModel;
import au.com.woolworths.foundation.rewards.common.ui.iconlist.internal.ItemUiKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public /* synthetic */ a(BroadcastBannerType broadcastBannerType, String str, String str2, Modifier modifier, Painter painter, BannerTagSpec bannerTagSpec, Function0 function0, String str3, BroadcastBannerSpec.Action action, int i, int i2) {
        this.d = 0;
        this.l = broadcastBannerType;
        this.e = str;
        this.h = str2;
        this.g = modifier;
        this.m = painter;
        this.n = bannerTagSpec;
        this.f = function0;
        this.i = str3;
        this.o = action;
        this.j = i;
        this.k = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                BroadcastBannerKt.a((BroadcastBannerType) this.l, (String) this.e, (String) this.h, this.g, (Painter) this.m, (BannerTagSpec) this.n, (Function0) this.f, (String) this.i, (BroadcastBannerSpec.Action) this.o, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1), this.k);
                break;
            case 1:
                ((Integer) obj2).getClass();
                SimpleRowKt.a((String) this.e, (Function0) this.f, this.g, (String) this.h, (String) this.i, (CoreRowSpec.Image) this.l, (CoreRowSpec.Image) this.m, (CoreRowSpec.TrailingDisplay) this.n, (CoreRowSpec.DividerType) this.o, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1), this.k);
                break;
            case 2:
                ((Integer) obj2).getClass();
                CoreRowImplKt.a((String) this.e, (Function0) this.f, this.g, (String) this.h, (String) this.i, (Function2) this.l, (Function2) this.m, (CoreRowSpec.TrailingDisplay) this.n, (CoreRowSpec.DividerType) this.o, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1), this.k);
                break;
            case 3:
                ((Integer) obj2).getClass();
                DynamicPageScreenKt.b((DynamicPageContract.ViewState) this.l, (Function2) this.e, (Function0) this.f, (Function0) this.h, (Function0) this.i, (Function0) this.m, (Function0) this.n, this.g, (Function0) this.o, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1), this.k);
                break;
            case 4:
                ((Integer) obj2).getClass();
                RewardsOfferDetailsScreenLegacyKt.f((RewardsOfferDetailsContractLegacy.ViewState) this.l, (Function1) this.e, (Function1) this.h, (Function0) this.f, (Function0) this.i, (Function0) this.m, (Function2) this.n, this.g, (ScaffoldState) this.o, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1), this.k);
                break;
            default:
                ((Integer) obj2).getClass();
                ItemUiKt.a((Function1) this.l, (Function2) this.m, this.g, (String) this.e, (String) this.h, (String) this.i, (String) this.n, (String) this.f, (RewardsIconListModel.ItemAction) this.o, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1), this.k);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(DynamicPageContract.ViewState viewState, Function2 function2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Modifier modifier, Function0 function06, int i, int i2) {
        this.d = 3;
        this.l = viewState;
        this.e = function2;
        this.f = function0;
        this.h = function02;
        this.i = function03;
        this.m = function04;
        this.n = function05;
        this.g = modifier;
        this.o = function06;
        this.j = i;
        this.k = i2;
    }

    public /* synthetic */ a(RewardsOfferDetailsContractLegacy.ViewState viewState, Function1 function1, Function1 function12, Function0 function0, Function0 function02, Function0 function03, Function2 function2, Modifier modifier, ScaffoldState scaffoldState, int i, int i2) {
        this.d = 4;
        this.l = viewState;
        this.e = function1;
        this.h = function12;
        this.f = function0;
        this.i = function02;
        this.m = function03;
        this.n = function2;
        this.g = modifier;
        this.o = scaffoldState;
        this.j = i;
        this.k = i2;
    }

    public /* synthetic */ a(String str, Function0 function0, Modifier modifier, String str2, String str3, Object obj, Object obj2, CoreRowSpec.TrailingDisplay trailingDisplay, CoreRowSpec.DividerType dividerType, int i, int i2, int i3) {
        this.d = i3;
        this.e = str;
        this.f = function0;
        this.g = modifier;
        this.h = str2;
        this.i = str3;
        this.l = obj;
        this.m = obj2;
        this.n = trailingDisplay;
        this.o = dividerType;
        this.j = i;
        this.k = i2;
    }

    public /* synthetic */ a(Function1 function1, Function2 function2, Modifier modifier, String str, String str2, String str3, String str4, String str5, RewardsIconListModel.ItemAction itemAction, int i, int i2) {
        this.d = 5;
        this.l = function1;
        this.m = function2;
        this.g = modifier;
        this.e = str;
        this.h = str2;
        this.i = str3;
        this.n = str4;
        this.f = str5;
        this.o = itemAction;
        this.j = i;
        this.k = i2;
    }
}
