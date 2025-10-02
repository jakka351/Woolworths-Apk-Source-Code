package au.com.woolworths.shop.product.details.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.shop.product.details.ui.ComposableSingletons$ProductNameKt$lambda$-1059120821$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductNameKt$lambda$1059120821$1 implements Function3<PaddingValues, Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductNameKt$lambda$1059120821$1 d = new ComposableSingletons$ProductNameKt$lambda$1059120821$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PaddingValues it = (PaddingValues) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(it, "it");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            ProductNameKt.a(54, composer, PaddingKt.h(Modifier.Companion.d, 16, BitmapDescriptorFactory.HUE_RED, 2), "This is an example of an article name that wraps over multiple lines but cannot exceed three lines that is the limit and will be cut off with ellipses following");
        }
        return Unit.f24250a;
    }
}
