package au.com.woolworths.base.shopapp.utils;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageButton;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/base/shopapp/utils/DetailsBottomSheetCallback;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "Companion", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public class DetailsBottomSheetCallback extends BottomSheetBehavior.BottomSheetCallback {

    /* renamed from: a, reason: collision with root package name */
    public final ImageButton f4632a;
    public float b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/base/shopapp/utils/DetailsBottomSheetCallback$Companion;", "", "", "HALF_ROTATION", "F", "FULL_ROTATION", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public DetailsBottomSheetCallback(ImageButton expandImageButton) {
        Intrinsics.h(expandImageButton, "expandImageButton");
        this.f4632a = expandImageButton;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
    public final void b(View view, float f) {
        float f2 = f * 180.0f;
        ObjectAnimator.ofFloat(this.f4632a, (Property<ImageButton, Float>) View.ROTATION, this.b, f2).start();
        if (f2 > 360.0f) {
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        this.b = f2;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
    public final void c(int i, View view) {
    }
}
