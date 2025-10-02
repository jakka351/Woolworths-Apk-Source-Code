package au.com.woolworths.design.core.ui.component.experimental.topbar;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TopNavBarKt$PreviewTopNavBar_Woolworths$1 implements Function2<Composer, Integer, Unit> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt$PreviewTopNavBar_Woolworths$1$1, reason: invalid class name */
    final class AnonymousClass1 implements Function3<RowScope, Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            RowScope TopNavBar = (RowScope) obj;
            Composer composer = (Composer) obj2;
            int iIntValue = ((Number) obj3).intValue();
            Intrinsics.h(TopNavBar, "$this$TopNavBar");
            if ((iIntValue & 17) != 16 || !composer.c()) {
                throw null;
            }
            composer.j();
            return Unit.f24250a;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) != 2 || !composer.c()) {
            throw null;
        }
        composer.j();
        return Unit.f24250a;
    }
}
