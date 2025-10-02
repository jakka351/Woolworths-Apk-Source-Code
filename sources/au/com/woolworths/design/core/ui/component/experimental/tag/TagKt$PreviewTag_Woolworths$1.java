package au.com.woolworths.design.core.ui.component.experimental.tag;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import au.com.woolworths.design.core.ui.component.stable.SurfaceKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TagKt$PreviewTag_Woolworths$1 implements Function2<Composer, Integer, Unit> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.design.core.ui.component.experimental.tag.TagKt$PreviewTag_Woolworths$1$1, reason: invalid class name */
    final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
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

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            SurfaceKt.b(null, null, 0L, 0L, null, null, ComposableLambdaKt.c(-161968328, new AnonymousClass1(), composer), composer, 63);
        }
        return Unit.f24250a;
    }
}
