package androidx.compose.ui.spatial;

import android.os.Handler;
import android.os.Trace;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Actual_androidKt;
import androidx.compose.ui.a;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.BERTags;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/spatial/RectManager;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RectManager {

    /* renamed from: a, reason: collision with root package name */
    public final RectList f2026a;
    public final ThrottledCallbacks b;
    public final MutableObjectList c;
    public boolean d;
    public boolean e;
    public boolean f;
    public a g;
    public long h;
    public final Function0 i;
    public final MutableRect j;

    public RectManager() {
        RectList rectList = new RectList();
        rectList.f2025a = new long[BERTags.PRIVATE];
        rectList.b = new long[BERTags.PRIVATE];
        this.f2026a = rectList;
        this.b = new ThrottledCallbacks();
        this.c = new MutableObjectList();
        this.h = -1L;
        this.i = new Function0<Unit>() { // from class: androidx.compose.ui.spatial.RectManager$dispatchLambda$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RectManager rectManager = this.h;
                rectManager.g = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    rectManager.a();
                    Trace.endSection();
                    return Unit.f24250a;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
        };
        this.j = new MutableRect();
    }

    public static long g(LayoutNode layoutNode) {
        float[] fArrMo2getUnderlyingMatrixsQKQjiQ;
        int iA;
        NodeChain nodeChain = layoutNode.K;
        NodeCoordinator nodeCoordinator = nodeChain.c;
        NodeCoordinator nodeCoordinator2 = nodeChain.b;
        long jB = 0;
        while (nodeCoordinator2 != null && nodeCoordinator2 != nodeCoordinator) {
            OwnedLayer ownedLayer = nodeCoordinator2.L;
            jB = IntOffsetKt.b(jB, nodeCoordinator2.C);
            nodeCoordinator2 = nodeCoordinator2.t;
            if (ownedLayer != null && (iA = RectManagerKt.a((fArrMo2getUnderlyingMatrixsQKQjiQ = ownedLayer.mo2getUnderlyingMatrixsQKQjiQ()))) != 3) {
                if ((iA & 2) == 0) {
                    return 9223372034707292159L;
                }
                jB = Matrix.b(fArrMo2getUnderlyingMatrixsQKQjiQ, jB);
            }
        }
        return IntOffsetKt.c(jB);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.spatial.RectManager.a():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(androidx.compose.ui.node.LayoutNode r20, long r21, boolean r23) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.spatial.RectManager.b(androidx.compose.ui.node.LayoutNode, long, boolean):void");
    }

    public final void c(LayoutNode layoutNode) {
        MutableVector mutableVectorN = layoutNode.N();
        Object[] objArr = mutableVectorN.d;
        int i = mutableVectorN.f;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            b(layoutNode2, layoutNode2.K.c.C, false);
            c(layoutNode2);
        }
    }

    public final void d(LayoutNode layoutNode) {
        this.d = true;
        int i = layoutNode.e & 67108863;
        RectList rectList = this.f2026a;
        long[] jArr = rectList.f2025a;
        int i2 = rectList.c;
        int i3 = 0;
        while (true) {
            if (i3 >= jArr.length - 2 || i3 >= i2) {
                break;
            }
            int i4 = i3 + 2;
            long j = jArr[i4];
            if ((((int) j) & 67108863) == i) {
                jArr[i4] = llqqqql.a00610061a00610061a | j;
                break;
            }
            i3 += 3;
        }
        a aVar = this.g;
        boolean z = aVar != null;
        long j2 = this.b.c;
        if (j2 >= 0 || !z) {
            if (this.h == j2 && z) {
                return;
            }
            if (aVar != null) {
                Handler handler = Actual_androidKt.f1718a;
                Actual_androidKt.f1718a.removeCallbacks(aVar);
            }
            Handler handler2 = Actual_androidKt.f1718a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j2, 16 + jCurrentTimeMillis);
            this.h = jMax;
            a aVar2 = new a(0, this.i);
            Actual_androidKt.f1718a.postDelayed(aVar2, jMax - jCurrentTimeMillis);
            this.g = aVar2;
        }
    }

    public final void e(LayoutNode layoutNode) {
        long jG = g(layoutNode);
        if (IntOffset.b(jG, 9223372034707292159L)) {
            c(layoutNode);
            return;
        }
        layoutNode.h = jG;
        layoutNode.i = false;
        MutableVector mutableVectorN = layoutNode.N();
        Object[] objArr = mutableVectorN.d;
        int i = mutableVectorN.f;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            f(layoutNode2, layoutNode2.K.c.C, false);
        }
        d(layoutNode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020d  */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(androidx.compose.ui.node.LayoutNode r29, long r30, boolean r32) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.spatial.RectManager.f(androidx.compose.ui.node.LayoutNode, long, boolean):void");
    }

    public final void h(LayoutNode layoutNode) {
        int i = layoutNode.e & 67108863;
        RectList rectList = this.f2026a;
        long[] jArr = rectList.f2025a;
        int i2 = rectList.c;
        int i3 = 0;
        while (true) {
            if (i3 >= jArr.length - 2 || i3 >= i2) {
                break;
            }
            int i4 = i3 + 2;
            if ((((int) jArr[i4]) & 67108863) == i) {
                jArr[i3] = -1;
                jArr[i3 + 1] = -1;
                jArr[i4] = 2305843009213693951L;
                break;
            }
            i3 += 3;
        }
        this.d = true;
        this.f = true;
    }
}
