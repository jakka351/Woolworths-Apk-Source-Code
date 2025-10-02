package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class NavigationItemKt$NavigationItem$iconWithBadge$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            final Function2 function2 = null;
            final ComposableLambdaImpl composableLambdaImpl = null;
            BadgeKt.a(ComposableLambdaKt.c(870803363, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$iconWithBadge$1.1
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    Composer composer2 = (Composer) obj4;
                    if ((((Number) obj5).intValue() & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        function2.invoke(composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composer), null, ComposableLambdaKt.c(-1365557663, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$iconWithBadge$1.2
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    Composer composer2 = (Composer) obj4;
                    if ((((Number) obj5).intValue() & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        composableLambdaImpl.invoke(composer2, 6);
                    }
                    return Unit.f24250a;
                }
            }, composer), composer, 390);
        }
        return Unit.f24250a;
    }
}
