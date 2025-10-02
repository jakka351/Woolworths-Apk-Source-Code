package au.com.woolworths.feature.shop.inbox.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.wx.component.DividerKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.shop.inbox.ui.ComposableSingletons$InboxScreenKt$lambda$-1646103603$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$InboxScreenKt$lambda$1646103603$1 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$InboxScreenKt$lambda$1646103603$1 d = new ComposableSingletons$InboxScreenKt$lambda$1646103603$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(item, "$this$item");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            DividerKt.a(0, 390, 2, 0L, composer, PaddingKt.h(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, 4, 1));
        }
        return Unit.f24250a;
    }
}
