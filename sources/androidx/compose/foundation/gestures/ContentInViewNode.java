package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.relocation.BringIntoViewResponder;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineStart;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/gestures/ContentInViewNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Request", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ContentInViewNode extends Modifier.Node implements BringIntoViewResponder, LayoutAwareModifierNode, CompositionLocalConsumerModifierNode {
    public boolean A;
    public Orientation r;
    public final ScrollingLogic s;
    public boolean t;
    public BringIntoViewSpec u;
    public LayoutCoordinates w;
    public boolean x;
    public boolean y;
    public final BringIntoViewRequestPriorityQueue v = new BringIntoViewRequestPriorityQueue();
    public long z = 0;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/ContentInViewNode$Request;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Request {

        /* renamed from: a, reason: collision with root package name */
        public final Function0 f876a;

        /* renamed from: b, reason: from toString */
        public final CancellableContinuationImpl continuation;

        public Request(Function0 function0, CancellableContinuationImpl cancellableContinuationImpl) {
            this.f876a = function0;
            this.continuation = cancellableContinuationImpl;
        }

        public final String toString() {
            CancellableContinuationImpl cancellableContinuationImpl = this.continuation;
            StringBuilder sb = new StringBuilder("Request@");
            int iHashCode = hashCode();
            CharsKt.b(16);
            String string = Integer.toString(iHashCode, 16);
            Intrinsics.g(string, "toString(...)");
            sb.append(string);
            sb.append("(currentBounds()=");
            sb.append(this.f876a.invoke());
            sb.append(", continuation=");
            sb.append(cancellableContinuationImpl);
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Orientation orientation = Orientation.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ContentInViewNode(Orientation orientation, ScrollingLogic scrollingLogic, boolean z, BringIntoViewSpec bringIntoViewSpec) {
        this.r = orientation;
        this.s = scrollingLogic;
        this.t = z;
        this.u = bringIntoViewSpec;
    }

    public static final float s2(ContentInViewNode contentInViewNode, BringIntoViewSpec bringIntoViewSpec) {
        Rect rect;
        int iCompare;
        if (IntSize.b(contentInViewNode.z, 0L)) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        MutableVector mutableVector = contentInViewNode.v.f872a;
        int i = mutableVector.f - 1;
        Object[] objArr = mutableVector.d;
        if (i < objArr.length) {
            rect = null;
            while (true) {
                if (i < 0) {
                    break;
                }
                Rect rect2 = (Rect) ((Request) objArr[i]).f876a.invoke();
                if (rect2 != null) {
                    long jE = rect2.e();
                    long jD = IntSizeKt.d(contentInViewNode.z);
                    int iOrdinal = contentInViewNode.r.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jE & 4294967295L)), Float.intBitsToFloat((int) (jD & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jE >> 32)), Float.intBitsToFloat((int) (jD >> 32)));
                    }
                    if (iCompare <= 0) {
                        rect = rect2;
                    } else if (rect == null) {
                        rect = rect2;
                    }
                }
                i--;
            }
        } else {
            rect = null;
        }
        if (rect == null) {
            Rect rectT2 = contentInViewNode.x ? contentInViewNode.t2() : null;
            if (rectT2 == null) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            rect = rectT2;
        }
        long jD2 = IntSizeKt.d(contentInViewNode.z);
        int iOrdinal2 = contentInViewNode.r.ordinal();
        if (iOrdinal2 == 0) {
            float f = rect.b;
            return bringIntoViewSpec.a(f, rect.d - f, Float.intBitsToFloat((int) (jD2 & 4294967295L)));
        }
        if (iOrdinal2 != 1) {
            throw new NoWhenBranchMatchedException();
        }
        float f2 = rect.f1752a;
        return bringIntoViewSpec.a(f2, rect.c - f2, Float.intBitsToFloat((int) (jD2 >> 32)));
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void G(long j) {
        int iJ;
        Rect rectT2;
        long j2 = this.z;
        this.z = j;
        int iOrdinal = this.r.ordinal();
        if (iOrdinal == 0) {
            iJ = Intrinsics.j((int) (j & 4294967295L), (int) (4294967295L & j2));
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            iJ = Intrinsics.j((int) (j >> 32), (int) (j2 >> 32));
        }
        if (iJ >= 0 || this.A || this.x || (rectT2 = t2()) == null || !u2(j2, rectT2)) {
            return;
        }
        this.y = true;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public final Rect L1(Rect rect) {
        if (IntSize.b(this.z, 0L)) {
            InlineClassHelperKt.c("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        return rect.k(w2(this.z, rect) ^ (-9223372034707292160L));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object U1(kotlin.jvm.functions.Function0 r11, kotlin.coroutines.Continuation r12) throws kotlinx.coroutines.DispatchException {
        /*
            r10 = this;
            java.lang.Object r0 = r11.invoke()
            androidx.compose.ui.geometry.Rect r0 = (androidx.compose.ui.geometry.Rect) r0
            kotlin.Unit r1 = kotlin.Unit.f24250a
            if (r0 == 0) goto La3
            long r2 = r10.z
            boolean r0 = r10.u2(r2, r0)
            if (r0 != 0) goto La3
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.b(r12)
            r2 = 1
            r0.<init>(r2, r12)
            r0.o()
            androidx.compose.foundation.gestures.ContentInViewNode$Request r12 = new androidx.compose.foundation.gestures.ContentInViewNode$Request
            r12.<init>(r11, r0)
            androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue r3 = r10.v
            androidx.compose.runtime.collection.MutableVector r4 = r3.f872a
            java.lang.Object r11 = r11.invoke()
            androidx.compose.ui.geometry.Rect r11 = (androidx.compose.ui.geometry.Rect) r11
            if (r11 != 0) goto L34
            r0.resumeWith(r1)
            goto L9a
        L34:
            androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue$enqueue$1 r5 = new androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue$enqueue$1
            r5.<init>()
            r0.r(r5)
            int r3 = r4.f
            r5 = 0
            kotlin.ranges.IntRange r3 = kotlin.ranges.RangesKt.o(r5, r3)
            int r6 = r3.d
            int r3 = r3.e
            if (r6 > r3) goto L90
        L49:
            java.lang.Object[] r7 = r4.d
            r7 = r7[r3]
            androidx.compose.foundation.gestures.ContentInViewNode$Request r7 = (androidx.compose.foundation.gestures.ContentInViewNode.Request) r7
            kotlin.jvm.functions.Function0 r7 = r7.f876a
            java.lang.Object r7 = r7.invoke()
            androidx.compose.ui.geometry.Rect r7 = (androidx.compose.ui.geometry.Rect) r7
            if (r7 != 0) goto L5a
            goto L8b
        L5a:
            androidx.compose.ui.geometry.Rect r8 = r11.g(r7)
            boolean r9 = r8.equals(r11)
            if (r9 == 0) goto L69
            int r3 = r3 + r2
            r4.b(r3, r12)
            goto L93
        L69:
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L8b
            java.util.concurrent.CancellationException r7 = new java.util.concurrent.CancellationException
            java.lang.String r8 = "bringIntoView call interrupted by a newer, non-overlapping call"
            r7.<init>(r8)
            int r8 = r4.f
            int r8 = r8 - r2
            if (r8 > r3) goto L8b
        L7b:
            java.lang.Object[] r9 = r4.d
            r9 = r9[r3]
            androidx.compose.foundation.gestures.ContentInViewNode$Request r9 = (androidx.compose.foundation.gestures.ContentInViewNode.Request) r9
            kotlinx.coroutines.CancellableContinuationImpl r9 = r9.continuation
            r9.cancel(r7)
            if (r8 == r3) goto L8b
            int r8 = r8 + 1
            goto L7b
        L8b:
            if (r3 == r6) goto L90
            int r3 = r3 + (-1)
            goto L49
        L90:
            r4.b(r5, r12)
        L93:
            boolean r11 = r10.A
            if (r11 != 0) goto L9a
            r10.v2()
        L9a:
            java.lang.Object r11 = r0.n()
            kotlin.coroutines.intrinsics.CoroutineSingletons r12 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            if (r11 != r12) goto La3
            return r11
        La3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ContentInViewNode.U1(kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean h2() {
        return false;
    }

    public final Rect t2() {
        if (this.q) {
            NodeCoordinator nodeCoordinatorF = DelegatableNodeKt.f(this);
            LayoutCoordinates layoutCoordinates = this.w;
            if (layoutCoordinates != null) {
                if (!layoutCoordinates.q()) {
                    layoutCoordinates = null;
                }
                if (layoutCoordinates != null) {
                    return nodeCoordinatorF.D(layoutCoordinates, false);
                }
            }
        }
        return null;
    }

    public final boolean u2(long j, Rect rect) {
        long jW2 = w2(j, rect);
        return Math.abs(Float.intBitsToFloat((int) (jW2 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jW2 & 4294967295L))) <= 0.5f;
    }

    public final void v2() {
        BringIntoViewSpec bringIntoViewSpec = this.u;
        if (bringIntoViewSpec == null) {
            bringIntoViewSpec = (BringIntoViewSpec) CompositionLocalConsumerModifierNodeKt.a(this, BringIntoViewSpec_androidKt.a());
        }
        if (this.A) {
            InlineClassHelperKt.c("launchAnimation called when previous animation was running");
        }
        BringIntoViewSpec.f873a.getClass();
        BuildersKt.c(g2(), null, CoroutineStart.g, new ContentInViewNode$launchAnimation$2(this, new UpdatableAnimationState(BringIntoViewSpec.Companion.b()), bringIntoViewSpec, null), 1);
    }

    public final long w2(long j, Rect rect) {
        long jFloatToRawIntBits;
        long j2;
        long jD = IntSizeKt.d(j);
        int iOrdinal = this.r.ordinal();
        if (iOrdinal == 0) {
            BringIntoViewSpec bringIntoViewSpec = this.u;
            if (bringIntoViewSpec == null) {
                bringIntoViewSpec = (BringIntoViewSpec) CompositionLocalConsumerModifierNodeKt.a(this, BringIntoViewSpec_androidKt.a());
            }
            float f = rect.b;
            float fA = bringIntoViewSpec.a(f, rect.d - f, Float.intBitsToFloat((int) (jD & 4294967295L)));
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED);
            jFloatToRawIntBits = Float.floatToRawIntBits(fA);
            j2 = jFloatToRawIntBits2 << 32;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            BringIntoViewSpec bringIntoViewSpec2 = this.u;
            if (bringIntoViewSpec2 == null) {
                bringIntoViewSpec2 = (BringIntoViewSpec) CompositionLocalConsumerModifierNodeKt.a(this, BringIntoViewSpec_androidKt.a());
            }
            float f2 = rect.f1752a;
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(bringIntoViewSpec2.a(f2, rect.c - f2, Float.intBitsToFloat((int) (jD >> 32))));
            jFloatToRawIntBits = Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED);
            j2 = jFloatToRawIntBits3 << 32;
        }
        return j2 | (jFloatToRawIntBits & 4294967295L);
    }
}
