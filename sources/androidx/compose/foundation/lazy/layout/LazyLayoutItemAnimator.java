package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSetKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "DisplayingDisappearingItemsElement", "DisplayingDisappearingItemsNode", "ItemInfo", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimator<T extends LazyLayoutMeasuredItem> {

    /* renamed from: a, reason: collision with root package name */
    public final MutableScatterMap f1039a;
    public LazyLayoutKeyIndexMap b;
    public int c;
    public final MutableScatterSet d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public DrawModifierNode j;
    public final Modifier k;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DisplayingDisappearingItemsElement extends ModifierNodeElement<DisplayingDisappearingItemsNode> {
        public final LazyLayoutItemAnimator d;

        public DisplayingDisappearingItemsElement(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
            this.d = lazyLayoutItemAnimator;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final Modifier.Node a() {
            DisplayingDisappearingItemsNode displayingDisappearingItemsNode = new DisplayingDisappearingItemsNode();
            displayingDisappearingItemsNode.r = this.d;
            return displayingDisappearingItemsNode;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final void b(Modifier.Node node) {
            DisplayingDisappearingItemsNode displayingDisappearingItemsNode = (DisplayingDisappearingItemsNode) node;
            LazyLayoutItemAnimator lazyLayoutItemAnimator = displayingDisappearingItemsNode.r;
            LazyLayoutItemAnimator lazyLayoutItemAnimator2 = this.d;
            if (Intrinsics.c(lazyLayoutItemAnimator, lazyLayoutItemAnimator2) || !displayingDisappearingItemsNode.d.q) {
                return;
            }
            LazyLayoutItemAnimator lazyLayoutItemAnimator3 = displayingDisappearingItemsNode.r;
            lazyLayoutItemAnimator3.e();
            lazyLayoutItemAnimator3.b = null;
            lazyLayoutItemAnimator3.c = -1;
            lazyLayoutItemAnimator2.j = displayingDisappearingItemsNode;
            displayingDisappearingItemsNode.r = lazyLayoutItemAnimator2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisplayingDisappearingItemsElement) && Intrinsics.c(this.d, ((DisplayingDisappearingItemsElement) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.d + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final /* data */ class DisplayingDisappearingItemsNode extends Modifier.Node implements DrawModifierNode {
        public LazyLayoutItemAnimator r;

        @Override // androidx.compose.ui.node.DrawModifierNode
        public final void I(LayoutNodeDrawScope layoutNodeDrawScope) {
            CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.d;
            ArrayList arrayList = this.r.i;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                LazyLayoutItemAnimation lazyLayoutItemAnimation = (LazyLayoutItemAnimation) arrayList.get(i);
                GraphicsLayer graphicsLayer = lazyLayoutItemAnimation.n;
                if (graphicsLayer != null) {
                    long j = lazyLayoutItemAnimation.m;
                    long j2 = graphicsLayer.t;
                    float f = ((int) (j >> 32)) - ((int) (j2 >> 32));
                    float f2 = ((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L));
                    canvasDrawScope.e.f1798a.f(f, f2);
                    try {
                        GraphicsLayerKt.a(layoutNodeDrawScope, graphicsLayer);
                    } finally {
                        canvasDrawScope.e.f1798a.f(-f, -f2);
                    }
                }
            }
            layoutNodeDrawScope.Q0();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisplayingDisappearingItemsNode) && Intrinsics.c(this.r, ((DisplayingDisappearingItemsNode) obj).r);
        }

        public final int hashCode() {
            return this.r.hashCode();
        }

        @Override // androidx.compose.ui.Modifier.Node
        public final void k2() {
            this.r.j = this;
        }

        @Override // androidx.compose.ui.Modifier.Node
        public final void l2() {
            LazyLayoutItemAnimator lazyLayoutItemAnimator = this.r;
            lazyLayoutItemAnimator.e();
            lazyLayoutItemAnimator.b = null;
            lazyLayoutItemAnimator.c = -1;
        }

        public final String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.r + ')';
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public final class ItemInfo {
        public Constraints b;
        public int c;
        public int d;
        public int f;
        public int g;

        /* renamed from: a, reason: collision with root package name */
        public LazyLayoutItemAnimation[] f1040a = LazyLayoutItemAnimatorKt.f1041a;
        public int e = 1;

        public ItemInfo() {
        }

        public static void b(ItemInfo itemInfo, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, CoroutineScope coroutineScope, GraphicsContext graphicsContext, int i, int i2) {
            LazyLayoutItemAnimator.this.getClass();
            long jN = lazyLayoutMeasuredItem.n(0);
            itemInfo.a(lazyLayoutMeasuredItem, coroutineScope, graphicsContext, i, i2, (int) (!lazyLayoutMeasuredItem.getC() ? jN & 4294967295L : jN >> 32));
        }

        public final void a(LazyLayoutMeasuredItem lazyLayoutMeasuredItem, CoroutineScope coroutineScope, GraphicsContext graphicsContext, int i, int i2, int i3) {
            LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr = this.f1040a;
            int length = lazyLayoutItemAnimationArr.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    this.f = i;
                    this.g = i2;
                    break;
                } else {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation = lazyLayoutItemAnimationArr[i4];
                    if (lazyLayoutItemAnimation != null && lazyLayoutItemAnimation.g) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            int length2 = this.f1040a.length;
            for (int iB = lazyLayoutMeasuredItem.b(); iB < length2; iB++) {
                LazyLayoutItemAnimation lazyLayoutItemAnimation2 = this.f1040a[iB];
                if (lazyLayoutItemAnimation2 != null) {
                    lazyLayoutItemAnimation2.d();
                }
            }
            if (this.f1040a.length != lazyLayoutMeasuredItem.b()) {
                Object[] objArrCopyOf = Arrays.copyOf(this.f1040a, lazyLayoutMeasuredItem.b());
                Intrinsics.g(objArrCopyOf, "copyOf(...)");
                this.f1040a = (LazyLayoutItemAnimation[]) objArrCopyOf;
            }
            this.b = new Constraints(lazyLayoutMeasuredItem.getM());
            this.c = i3;
            this.d = lazyLayoutMeasuredItem.getN();
            this.e = lazyLayoutMeasuredItem.getO();
            int iB2 = lazyLayoutMeasuredItem.b();
            for (int i5 = 0; i5 < iB2; i5++) {
                Object objM = lazyLayoutMeasuredItem.m(i5);
                LazyLayoutAnimationSpecsNode lazyLayoutAnimationSpecsNode = objM instanceof LazyLayoutAnimationSpecsNode ? (LazyLayoutAnimationSpecsNode) objM : null;
                if (lazyLayoutAnimationSpecsNode == null) {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation3 = this.f1040a[i5];
                    if (lazyLayoutItemAnimation3 != null) {
                        lazyLayoutItemAnimation3.d();
                    }
                    this.f1040a[i5] = null;
                } else {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation4 = this.f1040a[i5];
                    if (lazyLayoutItemAnimation4 == null) {
                        lazyLayoutItemAnimation4 = new LazyLayoutItemAnimation(coroutineScope, graphicsContext, new LazyLayoutItemAnimator$ItemInfo$updateAnimation$1$animation$1(LazyLayoutItemAnimator.this));
                        this.f1040a[i5] = lazyLayoutItemAnimation4;
                    }
                    lazyLayoutItemAnimation4.d = lazyLayoutAnimationSpecsNode.r;
                    lazyLayoutItemAnimation4.e = lazyLayoutAnimationSpecsNode.s;
                    lazyLayoutItemAnimation4.f = lazyLayoutAnimationSpecsNode.t;
                }
            }
        }
    }

    public LazyLayoutItemAnimator() {
        long[] jArr = ScatterMapKt.f699a;
        this.f1039a = new MutableScatterMap();
        int i = ScatterSetKt.f701a;
        this.d = new MutableScatterSet();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.k = new DisplayingDisappearingItemsElement(this);
    }

    public static void c(LazyLayoutMeasuredItem lazyLayoutMeasuredItem, int i, ItemInfo itemInfo) {
        int i2 = 0;
        long jN = lazyLayoutMeasuredItem.n(0);
        long jA = lazyLayoutMeasuredItem.getC() ? IntOffset.a(0, i, 1, jN) : IntOffset.a(i, 0, 2, jN);
        LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr = itemInfo.f1040a;
        int length = lazyLayoutItemAnimationArr.length;
        int i3 = 0;
        while (i2 < length) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = lazyLayoutItemAnimationArr[i2];
            int i4 = i3 + 1;
            if (lazyLayoutItemAnimation != null) {
                lazyLayoutItemAnimation.l = IntOffset.d(jA, IntOffset.c(lazyLayoutMeasuredItem.n(i3), jN));
            }
            i2++;
            i3 = i4;
        }
    }

    public static int h(int[] iArr, LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        int e = lazyLayoutMeasuredItem.getN();
        int f = lazyLayoutMeasuredItem.getO() + e;
        int iMax = 0;
        while (e < f) {
            int n = lazyLayoutMeasuredItem.getQ() + iArr[e];
            iArr[e] = n;
            iMax = Math.max(iMax, n);
            e++;
        }
        return iMax;
    }

    public final LazyLayoutItemAnimation a(int i, Object obj) {
        LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr;
        ItemInfo itemInfo = (ItemInfo) this.f1039a.e(obj);
        if (itemInfo == null || (lazyLayoutItemAnimationArr = itemInfo.f1040a) == null) {
            return null;
        }
        return lazyLayoutItemAnimationArr[i];
    }

    public final long b() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = (LazyLayoutItemAnimation) arrayList.get(i);
            GraphicsLayer graphicsLayer = lazyLayoutItemAnimation.n;
            if (graphicsLayer != null) {
                jMax = (Math.max((int) (jMax & 4294967295L), ((int) (lazyLayoutItemAnimation.l & 4294967295L)) + ((int) (graphicsLayer.u & 4294967295L))) & 4294967295L) | (Math.max((int) (jMax >> 32), ((int) (lazyLayoutItemAnimation.l >> 32)) + ((int) (graphicsLayer.u >> 32))) << 32);
            }
        }
        return jMax;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARN: Type inference failed for: r5v28, types: [kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(int r48, int r49, int r50, java.util.ArrayList r51, androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap r52, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider r53, boolean r54, boolean r55, int r56, boolean r57, int r58, int r59, kotlinx.coroutines.CoroutineScope r60, androidx.compose.ui.graphics.GraphicsContext r61) {
        /*
            Method dump skipped, instructions count: 1476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.d(int, int, int, java.util.ArrayList, androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider, boolean, boolean, int, boolean, int, int, kotlinx.coroutines.CoroutineScope, androidx.compose.ui.graphics.GraphicsContext):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            r15 = this;
            androidx.collection.MutableScatterMap r0 = r15.f1039a
            int r1 = r0.e
            if (r1 == 0) goto L5b
            java.lang.Object[] r1 = r0.c
            long[] r2 = r0.f698a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L58
            r4 = 0
            r5 = r4
        L11:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L53
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L2b:
            if (r10 >= r8) goto L51
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.32E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L4d
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$ItemInfo r11 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.ItemInfo) r11
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation[] r11 = r11.f1040a
            int r12 = r11.length
            r13 = r4
        L41:
            if (r13 >= r12) goto L4d
            r14 = r11[r13]
            if (r14 == 0) goto L4a
            r14.d()
        L4a:
            int r13 = r13 + 1
            goto L41
        L4d:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L2b
        L51:
            if (r8 != r9) goto L58
        L53:
            if (r5 == r3) goto L58
            int r5 = r5 + 1
            goto L11
        L58:
            r0.g()
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.e():void");
    }

    public final void f(Object obj) {
        LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr;
        ItemInfo itemInfo = (ItemInfo) this.f1039a.k(obj);
        if (itemInfo == null || (lazyLayoutItemAnimationArr = itemInfo.f1040a) == null) {
            return;
        }
        for (LazyLayoutItemAnimation lazyLayoutItemAnimation : lazyLayoutItemAnimationArr) {
            if (lazyLayoutItemAnimation != null) {
                lazyLayoutItemAnimation.d();
            }
        }
    }

    public final void g(LazyLayoutMeasuredItem lazyLayoutMeasuredItem, boolean z) {
        Object objE = this.f1039a.e(lazyLayoutMeasuredItem.getB());
        Intrinsics.e(objE);
        LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr = ((ItemInfo) objE).f1040a;
        int length = lazyLayoutItemAnimationArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = lazyLayoutItemAnimationArr[i];
            int i3 = i2 + 1;
            if (lazyLayoutItemAnimation != null) {
                long jN = lazyLayoutMeasuredItem.n(i2);
                long j = lazyLayoutItemAnimation.l;
                int i4 = LazyLayoutItemAnimation.t;
                LazyLayoutItemAnimation.Companion.a();
                if (!IntOffset.b(j, LazyLayoutItemAnimation.s) && !IntOffset.b(j, jN)) {
                    long jC = IntOffset.c(jN, j);
                    FiniteAnimationSpec finiteAnimationSpec = lazyLayoutItemAnimation.e;
                    if (finiteAnimationSpec != null) {
                        long jC2 = IntOffset.c(((IntOffset) ((SnapshotMutableStateImpl) lazyLayoutItemAnimation.q).getD()).f2200a, jC);
                        lazyLayoutItemAnimation.h(jC2);
                        lazyLayoutItemAnimation.g(true);
                        lazyLayoutItemAnimation.g = z;
                        BuildersKt.c(lazyLayoutItemAnimation.f1037a, null, null, new LazyLayoutItemAnimation$animatePlacementDelta$1(lazyLayoutItemAnimation, finiteAnimationSpec, jC2, null), 3);
                    }
                }
                lazyLayoutItemAnimation.l = jN;
            }
            i++;
            i2 = i3;
        }
    }
}
