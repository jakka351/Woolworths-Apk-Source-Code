package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\u0006\u0010\u0006\u001a\u0002H\u00032\u0006\u0010\u0007\u001a\u0002H\u0004H\u000b¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "P1", "P2", "P3", "p1", "p2", "p3", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class MovableContentKt$movableContentOf$4 extends Lambda implements Function5<Object, Object, Object, Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        Composer composer = (Composer) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 6) == 0) {
            i = ((iIntValue & 8) == 0 ? composer.n(obj) : composer.I(obj) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= (iIntValue & 64) == 0 ? composer.n(obj2) : composer.I(obj2) ? 32 : 16;
        }
        if ((iIntValue & KyberEngine.KyberPolyBytes) == 0) {
            i |= (iIntValue & 512) == 0 ? composer.n(obj3) : composer.I(obj3) ? 256 : 128;
        }
        if (composer.z(i & 1, (i & 1171) != 1170)) {
            composer.B(null, new Triple(obj, obj2, obj3));
        } else {
            composer.j();
        }
        return Unit.f24250a;
    }
}
