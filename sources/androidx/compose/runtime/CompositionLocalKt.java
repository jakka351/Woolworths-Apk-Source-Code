package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CompositionLocalKt {
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final androidx.compose.runtime.ProvidedValue r11, final kotlin.jvm.functions.Function2 r12, androidx.compose.runtime.Composer r13, final int r14) {
        /*
            r0 = -1350970552(0xffffffffaf79d348, float:-2.272148E-10)
            androidx.compose.runtime.ComposerImpl r13 = r13.v(r0)
            androidx.compose.runtime.IntStack r0 = r13.w
            androidx.compose.runtime.PersistentCompositionLocalMap r1 = r13.Q()
            r2 = 201(0xc9, float:2.82E-43)
            androidx.compose.runtime.OpaqueKey r3 = androidx.compose.runtime.ComposerKt.b
            r13.v0(r2, r3)
            java.lang.Object r2 = r13.G()
            androidx.compose.runtime.Composer$Companion$Empty$1 r3 = androidx.compose.runtime.Composer.Companion.f1624a
            boolean r3 = kotlin.jvm.internal.Intrinsics.c(r2, r3)
            r4 = 0
            if (r3 == 0) goto L23
            r2 = r4
            goto L2a
        L23:
            java.lang.String r3 = "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>"
            kotlin.jvm.internal.Intrinsics.f(r2, r3)
            androidx.compose.runtime.ValueHolder r2 = (androidx.compose.runtime.ValueHolder) r2
        L2a:
            androidx.compose.runtime.ProvidableCompositionLocal r3 = r11.f1655a
            androidx.compose.runtime.ValueHolder r5 = r3.c(r11, r2)
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L39
            r13.A(r5)
        L39:
            boolean r6 = r13.O
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L51
            boolean r2 = r11.h
            if (r2 != 0) goto L49
            boolean r2 = r1.containsKey(r3)
            if (r2 != 0) goto L4d
        L49:
            androidx.compose.runtime.internal.PersistentCompositionLocalHashMap r1 = r1.d0(r3, r5)
        L4d:
            r13.I = r7
        L4f:
            r2 = r8
            goto L8e
        L51:
            androidx.compose.runtime.SlotReader r6 = r13.F
            int r9 = r6.g
            int[] r10 = r6.b
            java.lang.Object r6 = r6.b(r9, r10)
            java.lang.String r9 = "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"
            kotlin.jvm.internal.Intrinsics.f(r6, r9)
            androidx.compose.runtime.PersistentCompositionLocalMap r6 = (androidx.compose.runtime.PersistentCompositionLocalMap) r6
            boolean r9 = r13.c()
            if (r9 == 0) goto L6a
            if (r2 != 0) goto L75
        L6a:
            boolean r9 = r11.h
            if (r9 != 0) goto L83
            boolean r9 = r1.containsKey(r3)
            if (r9 != 0) goto L75
            goto L83
        L75:
            if (r2 == 0) goto L7c
            boolean r2 = r13.v
            if (r2 != 0) goto L7c
            goto L81
        L7c:
            boolean r2 = r13.v
            if (r2 == 0) goto L81
            goto L87
        L81:
            r1 = r6
            goto L87
        L83:
            androidx.compose.runtime.internal.PersistentCompositionLocalHashMap r1 = r1.d0(r3, r5)
        L87:
            boolean r2 = r13.x
            if (r2 != 0) goto L8d
            if (r6 == r1) goto L4f
        L8d:
            r2 = r7
        L8e:
            if (r2 == 0) goto L97
            boolean r3 = r13.O
            if (r3 != 0) goto L97
            r13.l0(r1)
        L97:
            boolean r3 = r13.v
            r0.c(r3)
            r13.v = r2
            r13.J = r1
            r2 = 202(0xca, float:2.83E-43)
            androidx.compose.runtime.OpaqueKey r3 = androidx.compose.runtime.ComposerKt.c
            r13.t0(r3, r2, r8, r1)
            int r1 = r14 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12.invoke(r13, r1)
            r13.V(r8)
            r13.V(r8)
            int r0 = r0.b()
            if (r0 == 0) goto Lbf
            goto Lc0
        Lbf:
            r7 = r8
        Lc0:
            r13.v = r7
            r13.J = r4
            androidx.compose.runtime.RecomposeScopeImpl r13 = r13.X()
            if (r13 == 0) goto Ld1
            androidx.compose.runtime.CompositionLocalKt$CompositionLocalProvider$2 r0 = new androidx.compose.runtime.CompositionLocalKt$CompositionLocalProvider$2
            r0.<init>()
            r13.d = r0
        Ld1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionLocalKt.a(androidx.compose.runtime.ProvidedValue, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.runtime.PersistentCompositionLocalMap, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final androidx.compose.runtime.ProvidedValue[] r10, final kotlin.jvm.functions.Function2 r11, androidx.compose.runtime.Composer r12, final int r13) {
        /*
            r0 = -1390796515(0xffffffffad1a211d, float:-8.761239E-12)
            androidx.compose.runtime.ComposerImpl r12 = r12.v(r0)
            androidx.compose.runtime.IntStack r0 = r12.w
            androidx.compose.runtime.PersistentCompositionLocalMap r1 = r12.Q()
            r2 = 201(0xc9, float:2.82E-43)
            androidx.compose.runtime.OpaqueKey r3 = androidx.compose.runtime.ComposerKt.b
            r12.v0(r2, r3)
            boolean r2 = r12.O
            androidx.compose.runtime.OpaqueKey r3 = androidx.compose.runtime.ComposerKt.d
            r4 = 204(0xcc, float:2.86E-43)
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L45
            androidx.compose.runtime.internal.PersistentCompositionLocalHashMap r2 = androidx.compose.runtime.internal.PersistentCompositionLocalHashMap.i
            androidx.compose.runtime.PersistentCompositionLocalMap r2 = androidx.compose.runtime.CompositionLocalMapKt.b(r10, r1, r2)
            androidx.compose.runtime.internal.PersistentCompositionLocalHashMap$Builder r1 = r1.builder()
            r1.putAll(r2)
            androidx.compose.runtime.internal.PersistentCompositionLocalHashMap r1 = r1.build()
            r12.v0(r4, r3)
            r12.f0()
            r12.D0(r1)
            r12.f0()
            r12.D0(r2)
            r12.V(r6)
            r12.I = r5
        L43:
            r2 = r6
            goto Lab
        L45:
            androidx.compose.runtime.SlotReader r2 = r12.F
            int r7 = r2.g
            java.lang.Object r2 = r2.h(r7, r6)
            java.lang.String r7 = "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"
            kotlin.jvm.internal.Intrinsics.f(r2, r7)
            androidx.compose.runtime.PersistentCompositionLocalMap r2 = (androidx.compose.runtime.PersistentCompositionLocalMap) r2
            androidx.compose.runtime.SlotReader r8 = r12.F
            int r9 = r8.g
            java.lang.Object r8 = r8.h(r9, r5)
            kotlin.jvm.internal.Intrinsics.f(r8, r7)
            androidx.compose.runtime.PersistentCompositionLocalMap r8 = (androidx.compose.runtime.PersistentCompositionLocalMap) r8
            androidx.compose.runtime.PersistentCompositionLocalMap r7 = androidx.compose.runtime.CompositionLocalMapKt.b(r10, r1, r8)
            boolean r9 = r12.c()
            if (r9 == 0) goto L83
            boolean r9 = r12.x
            if (r9 != 0) goto L83
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L76
            goto L83
        L76:
            int r1 = r12.k
            androidx.compose.runtime.SlotReader r3 = r12.F
            int r3 = r3.q()
            int r3 = r3 + r1
            r12.k = r3
            r1 = r2
            goto L43
        L83:
            androidx.compose.runtime.internal.PersistentCompositionLocalHashMap$Builder r1 = r1.builder()
            r1.putAll(r7)
            androidx.compose.runtime.internal.PersistentCompositionLocalHashMap r1 = r1.build()
            r12.v0(r4, r3)
            r12.f0()
            r12.D0(r1)
            r12.f0()
            r12.D0(r7)
            r12.V(r6)
            boolean r3 = r12.x
            if (r3 != 0) goto Laa
            boolean r2 = kotlin.jvm.internal.Intrinsics.c(r1, r2)
            if (r2 != 0) goto L43
        Laa:
            r2 = r5
        Lab:
            if (r2 == 0) goto Lb4
            boolean r3 = r12.O
            if (r3 != 0) goto Lb4
            r12.l0(r1)
        Lb4:
            boolean r3 = r12.v
            r0.c(r3)
            r12.v = r2
            r12.J = r1
            r2 = 202(0xca, float:2.83E-43)
            androidx.compose.runtime.OpaqueKey r3 = androidx.compose.runtime.ComposerKt.c
            r12.t0(r3, r2, r6, r1)
            int r1 = r13 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11.invoke(r12, r1)
            r12.V(r6)
            r12.V(r6)
            int r0 = r0.b()
            if (r0 == 0) goto Ldc
            goto Ldd
        Ldc:
            r5 = r6
        Ldd:
            r12.v = r5
            r0 = 0
            r12.J = r0
            androidx.compose.runtime.RecomposeScopeImpl r12 = r12.X()
            if (r12 == 0) goto Lef
            androidx.compose.runtime.CompositionLocalKt$CompositionLocalProvider$1 r0 = new androidx.compose.runtime.CompositionLocalKt$CompositionLocalProvider$1
            r0.<init>()
            r12.d = r0
        Lef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionLocalKt.b(androidx.compose.runtime.ProvidedValue[], kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
    }
}
