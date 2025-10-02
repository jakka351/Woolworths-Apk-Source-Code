package au.com.woolworths.feature.shop.modeselector.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.Modifier;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class ShoppingModeOptionKt$ShoppingModeOption$1$2$1$2$3$2$1 implements Function1<Modifier, Modifier> {
    public static final ShoppingModeOptionKt$ShoppingModeOption$1$2$1$2$3$2$1 d = new ShoppingModeOptionKt$ShoppingModeOption$1$2$1$2$3$2$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Modifier conditional = (Modifier) obj;
        Intrinsics.h(conditional, "$this$conditional");
        return PaddingKt.j(conditional, BitmapDescriptorFactory.HUE_RED, 8, 16, BitmapDescriptorFactory.HUE_RED, 9);
    }
}
