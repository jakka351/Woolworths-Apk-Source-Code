package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005*\u0002H\u00022\u0006\u0010\u0006\u001a\u0002H\u00032\u0006\u0010\u0007\u001a\u0002H\u00042\u0006\u0010\b\u001a\u0002H\u0005H\u000b¢\u0006\u0004\b\t\u0010\n"}, d2 = {"<anonymous>", "", "R", "P1", "P2", "P3", "p1", "p2", "p3", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class MovableContentKt$movableContentWithReceiverOf$4 extends Lambda implements Function6<Object, Object, Object, Object, Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i;
        Composer composer = (Composer) obj5;
        int iIntValue = ((Number) obj6).intValue();
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
        if ((iIntValue & 3072) == 0) {
            i |= (iIntValue & 4096) == 0 ? composer.n(obj4) : composer.I(obj4) ? 2048 : 1024;
        }
        if (composer.z(i & 1, (i & 9363) != 9362)) {
            composer.B(null, new Object[]{obj, obj2, obj3, obj4});
        } else {
            composer.j();
        }
        return Unit.f24250a;
    }
}
