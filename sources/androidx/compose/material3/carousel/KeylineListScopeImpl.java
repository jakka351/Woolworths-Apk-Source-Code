package androidx.compose.material3.carousel;

import androidx.camera.core.impl.b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/carousel/KeylineListScopeImpl;", "Landroidx/compose/material3/carousel/KeylineListScope;", "TmpKeyline", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class KeylineListScopeImpl implements KeylineListScope {
    public float b;

    /* renamed from: a, reason: collision with root package name */
    public int f1539a = -1;
    public final ArrayList c = new ArrayList();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/carousel/KeylineListScopeImpl$TmpKeyline;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class TmpKeyline {

        /* renamed from: a, reason: collision with root package name */
        public final float f1540a;
        public final boolean b;

        public TmpKeyline(float f, boolean z) {
            this.f1540a = f;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TmpKeyline)) {
                return false;
            }
            TmpKeyline tmpKeyline = (TmpKeyline) obj;
            return Float.compare(this.f1540a, tmpKeyline.f1540a) == 0 && this.b == tmpKeyline.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Float.hashCode(this.f1540a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TmpKeyline(size=");
            sb.append(this.f1540a);
            sb.append(", isAnchor=");
            return b.s(sb, this.b, ')');
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList b(int r25, float r26, int r27, int r28, float r29, float r30, float r31, java.util.List r32) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.carousel.KeylineListScopeImpl.b(int, float, int, int, float, float, float, java.util.List):java.util.ArrayList");
    }

    @Override // androidx.compose.material3.carousel.KeylineListScope
    public final void a(float f, boolean z) {
        TmpKeyline tmpKeyline = new TmpKeyline(f, z);
        ArrayList arrayList = this.c;
        arrayList.add(tmpKeyline);
        if (f > this.b) {
            this.f1539a = CollectionsKt.I(arrayList);
            this.b = f;
        }
    }

    public final int c() {
        int i = this.f1539a;
        while (true) {
            ArrayList arrayList = this.c;
            if (i >= CollectionsKt.I(arrayList)) {
                break;
            }
            int i2 = i + 1;
            if (((TmpKeyline) arrayList.get(i2)).f1540a != this.b) {
                break;
            }
            i = i2;
        }
        return i;
    }
}
