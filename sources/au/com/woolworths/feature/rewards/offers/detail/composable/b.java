package au.com.woolworths.feature.rewards.offers.detail.composable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.SheetState;
import au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsViewModel;
import au.com.woolworths.shop.checkout.ui.content.ModalBottomSheetData;
import au.com.woolworths.shop.checkout.ui.summary.storecredit.StoreCreditModalKt;
import au.com.woolworths.shop.receipts.ShopReceiptListViewModel;
import au.com.woolworths.shop.receipts.ui.ReceiptListScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ Function1 h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ b(RewardsOfferDetailsViewModel rewardsOfferDetailsViewModel, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Function0 function02, Function0 function03, Modifier modifier, int i) {
        this.k = rewardsOfferDetailsViewModel;
        this.e = function0;
        this.g = function1;
        this.h = function12;
        this.l = function13;
        this.f = function02;
        this.i = function03;
        this.j = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(1);
                RewardsOfferDetailsScreenLegacyKt.g((RewardsOfferDetailsViewModel) this.k, this.e, this.g, this.h, (Function1) this.l, this.f, this.i, (Modifier) this.j, (Composer) obj, iA);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(1);
                StoreCreditModalKt.a((ModalBottomSheetData.StoreCredit) this.k, this.e, this.f, this.g, this.h, this.i, (Modifier) this.j, (SheetState) this.l, (Composer) obj, iA2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA3 = RecomposeScopeImplKt.a(1);
                ReceiptListScreenKt.f((ShopReceiptListViewModel) this.k, this.g, this.e, this.f, this.i, (Function0) this.l, this.h, (Function0) this.j, (Composer) obj, iA3);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ b(ModalBottomSheetData.StoreCredit storeCredit, Function0 function0, Function0 function02, Function1 function1, Function1 function12, Function0 function03, Modifier modifier, SheetState sheetState, int i) {
        this.k = storeCredit;
        this.e = function0;
        this.f = function02;
        this.g = function1;
        this.h = function12;
        this.i = function03;
        this.j = modifier;
        this.l = sheetState;
    }

    public /* synthetic */ b(ShopReceiptListViewModel shopReceiptListViewModel, Function1 function1, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function1 function12, Function0 function05, int i) {
        this.k = shopReceiptListViewModel;
        this.g = function1;
        this.e = function0;
        this.f = function02;
        this.i = function03;
        this.l = function04;
        this.h = function12;
        this.j = function05;
    }
}
