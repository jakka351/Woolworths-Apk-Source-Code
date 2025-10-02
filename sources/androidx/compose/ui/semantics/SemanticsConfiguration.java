package androidx.compose.ui.semantics;

import androidx.camera.core.impl.b;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.Map;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0002¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsConfiguration;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SemanticsConfiguration implements SemanticsPropertyReceiver, Iterable<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>>, KMappedMarker {
    public final MutableScatterMap d;
    public Map e;
    public boolean f;
    public boolean g;

    public SemanticsConfiguration() {
        long[] jArr = ScatterMapKt.f699a;
        this.d = new MutableScatterMap();
    }

    @Override // androidx.compose.ui.semantics.SemanticsPropertyReceiver
    public final void b(SemanticsPropertyKey semanticsPropertyKey, Object obj) {
        boolean z = obj instanceof AccessibilityAction;
        MutableScatterMap mutableScatterMap = this.d;
        if (!z || !mutableScatterMap.c(semanticsPropertyKey)) {
            mutableScatterMap.m(semanticsPropertyKey, obj);
            return;
        }
        Object objE = mutableScatterMap.e(semanticsPropertyKey);
        Intrinsics.f(objE, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        AccessibilityAction accessibilityAction = (AccessibilityAction) objE;
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) obj;
        String str = accessibilityAction2.f2009a;
        if (str == null) {
            str = accessibilityAction.f2009a;
        }
        Function function = accessibilityAction2.b;
        if (function == null) {
            function = accessibilityAction.b;
        }
        mutableScatterMap.m(semanticsPropertyKey, new AccessibilityAction(str, function));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.ui.semantics.SemanticsConfiguration d() {
        /*
            r18 = this;
            r0 = r18
            androidx.compose.ui.semantics.SemanticsConfiguration r1 = new androidx.compose.ui.semantics.SemanticsConfiguration
            r1.<init>()
            boolean r2 = r0.f
            r1.f = r2
            boolean r2 = r0.g
            r1.g = r2
            androidx.collection.MutableScatterMap r2 = r1.d
            r2.getClass()
            java.lang.String r3 = "from"
            androidx.collection.MutableScatterMap r4 = r0.d
            kotlin.jvm.internal.Intrinsics.h(r4, r3)
            java.lang.Object[] r3 = r4.b
            java.lang.Object[] r5 = r4.c
            long[] r4 = r4.f698a
            int r6 = r4.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L62
            r7 = 0
            r8 = r7
        L28:
            r9 = r4[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L5d
            int r11 = r8 - r6
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r7
        L42:
            if (r13 >= r11) goto L5b
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L57
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            r2.m(r15, r14)
        L57:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L42
        L5b:
            if (r11 != r12) goto L62
        L5d:
            if (r8 == r6) goto L62
            int r8 = r8 + 1
            goto L28
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.semantics.SemanticsConfiguration.d():androidx.compose.ui.semantics.SemanticsConfiguration");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SemanticsConfiguration)) {
            return false;
        }
        SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) obj;
        return Intrinsics.c(this.d, semanticsConfiguration.d) && this.f == semanticsConfiguration.f && this.g == semanticsConfiguration.g;
    }

    public final Object g(SemanticsPropertyKey semanticsPropertyKey) {
        Object objE = this.d.e(semanticsPropertyKey);
        if (objE != null) {
            return objE;
        }
        throw new IllegalStateException("Key not present: " + semanticsPropertyKey + " - consider getOrElse or getOrNull");
    }

    public final Object h(SemanticsPropertyKey semanticsPropertyKey, Function0 function0) {
        Object objE = this.d.e(semanticsPropertyKey);
        return objE == null ? function0.invoke() : objE;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + b.e(this.d.hashCode() * 31, 31, this.f);
    }

    public final void i(SemanticsConfiguration semanticsConfiguration) {
        MutableScatterMap mutableScatterMap = semanticsConfiguration.d;
        Object[] objArr = mutableScatterMap.b;
        Object[] objArr2 = mutableScatterMap.c;
        long[] jArr = mutableScatterMap.f698a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) obj;
                        MutableScatterMap mutableScatterMap2 = this.d;
                        Object objE = mutableScatterMap2.e(semanticsPropertyKey);
                        Intrinsics.f(semanticsPropertyKey, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object objInvoke = semanticsPropertyKey.b.invoke(objE, obj2);
                        if (objInvoke != null) {
                            mutableScatterMap2.m(semanticsPropertyKey, objInvoke);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> iterator() {
        Map mapA = this.e;
        if (mapA == null) {
            mapA = this.d.a();
            this.e = mapA;
        }
        return mapA.entrySet().iterator();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[PHI: r2
  0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r19 = this;
            r0 = r19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r0.f
            java.lang.String r3 = ", "
            if (r2 == 0) goto L14
            java.lang.String r2 = "mergeDescendants=true"
            r1.append(r2)
            r2 = r3
            goto L16
        L14:
            java.lang.String r2 = ""
        L16:
            boolean r4 = r0.g
            if (r4 == 0) goto L23
            r1.append(r2)
            java.lang.String r2 = "isClearingSemantics=true"
            r1.append(r2)
            r2 = r3
        L23:
            androidx.collection.MutableScatterMap r4 = r0.d
            java.lang.Object[] r5 = r4.b
            java.lang.Object[] r6 = r4.c
            long[] r4 = r4.f698a
            int r7 = r4.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7d
            r9 = 0
        L31:
            r10 = r4[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L78
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L4b:
            if (r14 >= r12) goto L76
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.32E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L72
            int r15 = r9 << 3
            int r15 = r15 + r14
            r16 = r5[r15]
            r15 = r6[r15]
            r8 = r16
            androidx.compose.ui.semantics.SemanticsPropertyKey r8 = (androidx.compose.ui.semantics.SemanticsPropertyKey) r8
            r1.append(r2)
            java.lang.String r2 = r8.f2024a
            r1.append(r2)
            java.lang.String r2 = " : "
            r1.append(r2)
            r1.append(r15)
            r2 = r3
        L72:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L4b
        L76:
            if (r12 != r13) goto L7d
        L78:
            if (r9 == r7) goto L7d
            int r9 = r9 + 1
            goto L31
        L7d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = androidx.compose.ui.platform.JvmActuals_jvmKt.a(r0)
            r2.append(r3)
            java.lang.String r3 = "{ "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " }"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.semantics.SemanticsConfiguration.toString():java.lang.String");
    }
}
