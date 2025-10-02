package au.com.woolworths.shop.receipts.ui;

import androidx.compose.material.SnackbarData;
import androidx.compose.material.SnackbarKt;
import androidx.compose.runtime.Composer;
import au.com.woolworths.design.wx.foundation.WxTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.shop.receipts.ui.ComposableSingletons$ReceiptListScreenKt$lambda$-179940203$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ReceiptListScreenKt$lambda$179940203$1 implements Function3<SnackbarData, Composer, Integer, Unit> {
    public static final ComposableSingletons$ReceiptListScreenKt$lambda$179940203$1 d = new ComposableSingletons$ReceiptListScreenKt$lambda$179940203$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SnackbarData snackbarData = (SnackbarData) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(snackbarData, "snackbarData");
        SnackbarKt.b(snackbarData, null, null, 0L, 0L, WxTheme.a(composer).h(), BitmapDescriptorFactory.HUE_RED, composer, iIntValue & 14, 190);
        return Unit.f24250a;
    }
}
