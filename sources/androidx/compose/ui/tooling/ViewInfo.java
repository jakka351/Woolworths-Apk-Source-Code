package androidx.compose.ui.tooling;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import androidx.compose.ui.tooling.data.SourceLocation;
import androidx.compose.ui.unit.IntRect;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/tooling/ViewInfo;", "", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class ViewInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f2170a;
    public final int b;
    public final IntRect c;
    public final SourceLocation d;
    public final ArrayList e;
    public final Object f;

    public ViewInfo(String str, int i, IntRect intRect, SourceLocation sourceLocation, ArrayList arrayList, Object obj) {
        this.f2170a = str;
        this.b = i;
        this.c = intRect;
        this.d = sourceLocation;
        this.e = arrayList;
        this.f = obj;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.e;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            CollectionsKt.h(((ViewInfo) it.next()).a(), arrayList);
        }
        return CollectionsKt.c0(arrayList, arrayList2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewInfo)) {
            return false;
        }
        ViewInfo viewInfo = (ViewInfo) obj;
        return this.f2170a.equals(viewInfo.f2170a) && this.b == viewInfo.b && Intrinsics.c(this.c, viewInfo.c) && Intrinsics.c(this.d, viewInfo.d) && this.e.equals(viewInfo.e) && Intrinsics.c(this.f, viewInfo.f);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + b.a(this.b, this.f2170a.hashCode() * 31, 31)) * 31;
        SourceLocation sourceLocation = this.d;
        int iB = a.b((iHashCode + (sourceLocation == null ? 0 : sourceLocation.hashCode())) * 31, 31, this.e);
        Object obj = this.f;
        return iB + (obj != null ? obj.hashCode() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            java.lang.String r2 = r5.f2170a
            r0.append(r2)
            r2 = 58
            r0.append(r2)
            int r2 = r5.b
            r0.append(r2)
            java.lang.String r2 = ",\n            |bounds=(top="
            r0.append(r2)
            androidx.compose.ui.unit.IntRect r2 = r5.c
            int r3 = r2.b
            r0.append(r3)
            java.lang.String r3 = ", left="
            r0.append(r3)
            int r3 = r2.f2201a
            r0.append(r3)
            java.lang.String r3 = ",\n            |location="
            r0.append(r3)
            androidx.compose.ui.tooling.data.SourceLocation r3 = r5.d
            if (r3 == 0) goto L4f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            int r1 = r3.b
            r4.append(r1)
            r1 = 76
            r4.append(r1)
            int r1 = r3.c
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            if (r1 != 0) goto L51
        L4f:
            java.lang.String r1 = "<none>"
        L51:
            r0.append(r1)
            java.lang.String r1 = "\n            |bottom="
            r0.append(r1)
            int r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", right="
            r0.append(r1)
            int r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = "),\n            |childrenCount="
            r0.append(r1)
            java.util.ArrayList r1 = r5.e
            int r1 = r1.size()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = kotlin.text.StringsKt.n0(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.tooling.ViewInfo.toString():java.lang.String");
    }
}
