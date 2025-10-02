package au.com.woolworths.shop.specials.ui;

import androidx.compose.material.SnackbarData;
import androidx.compose.material.SnackbarKt;
import androidx.compose.runtime.Composer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.shop.specials.ui.ComposableSingletons$SpecialsHomeScreenKt$lambda$-518911965$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$SpecialsHomeScreenKt$lambda$518911965$1 implements Function3<SnackbarData, Composer, Integer, Unit> {
    public static final ComposableSingletons$SpecialsHomeScreenKt$lambda$518911965$1 d = new ComposableSingletons$SpecialsHomeScreenKt$lambda$518911965$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SnackbarData data = (SnackbarData) obj;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(data, "data");
        SnackbarKt.b(data, null, null, 0L, 0L, 0L, BitmapDescriptorFactory.HUE_RED, (Composer) obj2, iIntValue & 14, 254);
        return Unit.f24250a;
    }
}
