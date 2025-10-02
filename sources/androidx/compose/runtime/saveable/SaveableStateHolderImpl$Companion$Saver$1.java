package androidx.compose.runtime.saveable;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a$\u0012\u0004\u0012\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00050\u0003\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "", "", "", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SaveableStateHolderImpl$Companion$Saver$1 extends Lambda implements Function2<SaverScope, SaveableStateHolderImpl, Map<Object, Map<String, ? extends List<? extends Object>>>> {
    public static final SaveableStateHolderImpl$Companion$Saver$1 h = new SaveableStateHolderImpl$Companion$Saver$1(2);

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r17, java.lang.Object r18) {
        /*
            r16 = this;
            r0 = r17
            androidx.compose.runtime.saveable.SaverScope r0 = (androidx.compose.runtime.saveable.SaverScope) r0
            r0 = r18
            androidx.compose.runtime.saveable.SaveableStateHolderImpl r0 = (androidx.compose.runtime.saveable.SaveableStateHolderImpl) r0
            java.util.Map r1 = r0.f1696a
            androidx.collection.MutableScatterMap r0 = r0.b
            java.lang.Object[] r2 = r0.b
            java.lang.Object[] r3 = r0.c
            long[] r0 = r0.f698a
            int r4 = r0.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L63
            r5 = 0
            r6 = r5
        L19:
            r7 = r0[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L5e
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = r5
        L33:
            if (r11 >= r9) goto L5c
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.32E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L58
            int r12 = r6 << 3
            int r12 = r12 + r11
            r13 = r2[r12]
            r12 = r3[r12]
            androidx.compose.runtime.saveable.SaveableStateRegistry r12 = (androidx.compose.runtime.saveable.SaveableStateRegistry) r12
            java.util.Map r12 = r12.c()
            boolean r14 = r12.isEmpty()
            if (r14 == 0) goto L55
            r1.remove(r13)
            goto L58
        L55:
            r1.put(r13, r12)
        L58:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L33
        L5c:
            if (r9 != r10) goto L63
        L5e:
            if (r6 == r4) goto L63
            int r6 = r6 + 1
            goto L19
        L63:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L6b
            r0 = 0
            return r0
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.saveable.SaveableStateHolderImpl$Companion$Saver$1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
