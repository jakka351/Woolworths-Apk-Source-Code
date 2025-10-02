package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class Recomposer$performRecompose$1$1 extends Lambda implements Function0<Unit> {
    public final /* synthetic */ MutableScatterSet h;
    public final /* synthetic */ ControlledComposition i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$performRecompose$1$1(MutableScatterSet mutableScatterSet, ControlledComposition controlledComposition) {
        super(0);
        this.h = mutableScatterSet;
        this.i = controlledComposition;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke() {
        /*
            r14 = this;
            androidx.collection.MutableScatterSet r0 = r14.h
            java.lang.Object[] r1 = r0.b
            long[] r0 = r0.f700a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L47
            r3 = 0
            r4 = r3
        Ld:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L42
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L27:
            if (r9 >= r7) goto L40
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3c
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            androidx.compose.runtime.ControlledComposition r11 = r14.i
            r11.p(r10)
        L3c:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L27
        L40:
            if (r7 != r8) goto L47
        L42:
            if (r4 == r2) goto L47
            int r4 = r4 + 1
            goto Ld
        L47:
            kotlin.Unit r0 = kotlin.Unit.f24250a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$performRecompose$1$1.invoke():java.lang.Object");
    }
}
