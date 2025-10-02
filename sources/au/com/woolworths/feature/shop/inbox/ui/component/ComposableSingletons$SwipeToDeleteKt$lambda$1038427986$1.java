package au.com.woolworths.feature.shop.inbox.ui.component;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$SwipeToDeleteKt$lambda$1038427986$1 implements Function3<RowScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$SwipeToDeleteKt$lambda$1038427986$1 d = new ComposableSingletons$SwipeToDeleteKt$lambda$1038427986$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RowScope SwipeToDelete = (RowScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(SwipeToDelete, "$this$SwipeToDelete");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            BoxKt.a(SizeKt.e(SizeKt.g(Modifier.Companion.d, 80), 1.0f), composer, 6);
        }
        return Unit.f24250a;
    }
}
