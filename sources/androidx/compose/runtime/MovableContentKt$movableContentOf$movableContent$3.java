package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0006H\u000b¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "P1", "P2", "P3", "it", "Lkotlin/Triple;", "invoke", "(Lkotlin/Triple;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class MovableContentKt$movableContentOf$movableContent$3 extends Lambda implements Function3<Triple<Object, Object, Object>, Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Triple triple = (Triple) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? composer.n(triple) : composer.I(triple) ? 4 : 2;
        }
        if (composer.z(iIntValue & 1, (iIntValue & 19) != 18)) {
            Object obj4 = triple.d;
            throw null;
        }
        composer.j();
        return Unit.f24250a;
    }
}
