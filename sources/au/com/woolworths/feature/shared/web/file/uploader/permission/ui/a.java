package au.com.woolworths.feature.shared.web.file.uploader.permission.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.product.cartpreauth.CartPreAuthScreenKt;
import au.com.woolworths.shop.lists.ui.watchlist.bottomsheet.WatchlistBottomSheetScreenKt;
import au.com.woolworths.shop.receipts.ui.ReceiptListScreenKt;
import com.woolworths.scanlibrary.ui.message.Messages;
import com.woolworths.scanlibrary.util.composable.SngPermissionRequiredKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ int g;

    public /* synthetic */ a(Function0 function0, Function0 function02, int i) {
        this.d = 5;
        Messages.Companion companion = Messages.h;
        this.e = function0;
        this.f = function02;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        int i2 = this.g;
        Function0 function0 = this.f;
        Function0 function02 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                RewardsCameraAccessRequiredKt.a(function02, function0, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ShopCameraAccessRequiredKt.a(function02, function0, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                CartPreAuthScreenKt.a(function02, function0, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                WatchlistBottomSheetScreenKt.a(function02, function0, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ReceiptListScreenKt.d(function02, function0, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            default:
                Messages.Companion companion = Messages.h;
                ((Integer) obj2).getClass();
                SngPermissionRequiredKt.a(function02, function0, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
        }
        return unit;
    }

    public /* synthetic */ a(Function0 function0, Function0 function02, int i, int i2) {
        this.d = i2;
        this.e = function0;
        this.f = function02;
        this.g = i;
    }
}
