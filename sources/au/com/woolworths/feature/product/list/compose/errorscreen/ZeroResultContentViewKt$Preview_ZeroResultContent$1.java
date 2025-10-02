package au.com.woolworths.feature.product.list.compose.errorscreen;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.feature.product.list.c0;
import au.com.woolworths.product.tile.ProductClickListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class ZeroResultContentViewKt$Preview_ZeroResultContent$1 implements Function2<Composer, Integer, Unit> {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/product/list/compose/errorscreen/ZeroResultContentViewKt$Preview_ZeroResultContent$1$1", "Lau/com/woolworths/product/tile/ProductClickListener;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.product.list.compose.errorscreen.ZeroResultContentViewKt$Preview_ZeroResultContent$1$1, reason: invalid class name */
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
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
        if (objG == composer$Companion$Empty$1) {
            objG = new c0(18);
            composer.A(objG);
        }
        Function1 function1 = (Function1) objG;
        Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
        if (objE == composer$Companion$Empty$1) {
            objE = new c0(19);
            composer.A(objE);
        }
        Function1 function12 = (Function1) objE;
        Object objE2 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
        if (objE2 == composer$Companion$Empty$1) {
            objE2 = new h(20);
            composer.A(objE2);
        }
        Function0 function0 = (Function0) objE2;
        Object objE3 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
        if (objE3 == composer$Companion$Empty$1) {
            objE3 = new c0(20);
            composer.A(objE3);
        }
        Function1 function13 = (Function1) objE3;
        Object objE4 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
        if (objE4 == composer$Companion$Empty$1) {
            objE4 = new c0(21);
            composer.A(objE4);
        }
        composer.l();
        ZeroResultContentViewKt.b(null, false, anonymousClass1, function1, function12, function0, function13, true, (Function1) objE4, null, composer, 115043376, 512);
        throw null;
    }
}
