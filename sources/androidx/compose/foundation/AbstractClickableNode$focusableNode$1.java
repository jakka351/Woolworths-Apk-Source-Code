package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class AbstractClickableNode$focusableNode$1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m(((Boolean) obj).booleanValue());
        return Unit.f24250a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(boolean r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = r0.receiver
            androidx.compose.foundation.AbstractClickableNode r1 = (androidx.compose.foundation.AbstractClickableNode) r1
            androidx.collection.MutableLongObjectMap r2 = r1.E
            if (r18 == 0) goto Le
            r1.y2()
            return
        Le:
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = r1.t
            if (r3 == 0) goto L61
            java.lang.Object[] r3 = r2.c
            long[] r4 = r2.f685a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L61
            r7 = 0
        L1c:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L5c
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L36:
            if (r12 >= r10) goto L5a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L56
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            androidx.compose.foundation.interaction.PressInteraction$Press r13 = (androidx.compose.foundation.interaction.PressInteraction.Press) r13
            kotlinx.coroutines.CoroutineScope r14 = r1.g2()
            androidx.compose.foundation.AbstractClickableNode$onFocusChange$1$1 r15 = new androidx.compose.foundation.AbstractClickableNode$onFocusChange$1$1
            r6 = 0
            r15.<init>(r1, r13, r6)
            r13 = 3
            kotlinx.coroutines.BuildersKt.c(r14, r6, r6, r15, r13)
        L56:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L36
        L5a:
            if (r10 != r11) goto L61
        L5c:
            if (r7 == r5) goto L61
            int r7 = r7 + 1
            goto L1c
        L61:
            r2.c()
            r1.z2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode$focusableNode$1.m(boolean):void");
    }
}
