package au.com.woolworths.shop.buyagain.ui.composable;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.wx.component.DividerKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.shop.buyagain.ui.composable.ComposableSingletons$ProductTileSkeletonKt$lambda$-899840785$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductTileSkeletonKt$lambda$899840785$1 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductTileSkeletonKt$lambda$899840785$1 d = new ComposableSingletons$ProductTileSkeletonKt$lambda$899840785$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(item, "$this$item");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            ProductTileSkeletonKt.c(null, composer, 0);
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, KyberEngine.KyberPolyBytes, 0, CoreTheme.b(composer).e.b.e, composer, BreathingShimmerKt.a(Modifier.Companion.d));
        }
        return Unit.f24250a;
    }
}
