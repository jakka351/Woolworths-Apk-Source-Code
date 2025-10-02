package au.com.woolworths.shop.lists.ui.details.ui;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/ui/details/ui/ListDetailsBottomSheetCallback;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "Companion", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ListDetailsBottomSheetCallback extends BottomSheetBehavior.BottomSheetCallback {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f12315a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/lists/ui/details/ui/ListDetailsBottomSheetCallback$Companion;", "", "", "HALF_ROTATION", "F", "FULL_ROTATION", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ListDetailsBottomSheetCallback(Function1 function1) {
        this.f12315a = function1;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
    public final void b(View view, float f) {
        float f2 = f * 180.0f;
        if (f2 > 360.0f) {
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        ((ListDetailsView$initialiseBottomSheetBehaviour$1) this.f12315a).invoke(Float.valueOf(f2));
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
    public final void c(int i, View view) {
    }
}
