package au.com.woolworths.feature.product.list.v2.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.product.tile.ProductClickListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class ZeroResultContentViewKt$Preview_ZeroResultContent$1 implements Function2<Composer, Integer, Unit> {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/product/list/v2/ui/ZeroResultContentViewKt$Preview_ZeroResultContent$1$1", "Lau/com/woolworths/product/tile/ProductClickListener;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.product.list.v2.ui.ZeroResultContentViewKt$Preview_ZeroResultContent$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements ProductClickListener {
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
            return Unit.f24250a;
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        composer.o(1849434622);
        Object objG = composer.G();
        if (objG == Composer.Companion.f1624a) {
            objG = new d(12);
            composer.A(objG);
        }
        composer.l();
        ZeroResultContentViewKt.b(null, false, anonymousClass1, true, (Function1) objG, null, composer, 27696, 32);
        throw null;
    }
}
