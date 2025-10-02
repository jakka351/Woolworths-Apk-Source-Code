package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.unit.Density;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "Landroidx/compose/foundation/OverscrollEffect;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidEdgeEffectOverscrollEffect implements OverscrollEffect {

    /* renamed from: a, reason: collision with root package name */
    public final Density f824a;
    public long b = 9205357640488583168L;
    public final EdgeEffectWrapper c;
    public final MutableState d;
    public final boolean e;
    public boolean f;
    public long g;
    public long h;
    public final DelegatingNode i;

    public AndroidEdgeEffectOverscrollEffect(Context context, Density density, long j, PaddingValues paddingValues) {
        this.f824a = density;
        EdgeEffectWrapper edgeEffectWrapper = new EdgeEffectWrapper(context, ColorKt.j(j));
        this.c = edgeEffectWrapper;
        this.d = SnapshotStateKt.e(Unit.f24250a, SnapshotStateKt.g());
        this.e = true;
        this.g = 0L;
        this.h = -1L;
        SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImplA = SuspendingPointerInputFilterKt.a(new PointerInputEventHandler() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1", f = "AndroidOverscroll.android.kt", l = {783, 787}, m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1, reason: invalid class name */
            /* loaded from: classes2.dex */
            final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                public int q;
                public /* synthetic */ Object r;
                public final /* synthetic */ AndroidEdgeEffectOverscrollEffect s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, Continuation continuation) {
                    super(2, continuation);
                    this.s = androidEdgeEffectOverscrollEffect;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.s, continuation);
                    anonymousClass1.r = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass1) create((AwaitPointerEventScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
                
                    if (r13 == r0) goto L16;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
                
                    if (r13 != r0) goto L17;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, java.util.List] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004e -> B:17:0x0051). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                    /*
                        r12 = this;
                        kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r1 = r12.q
                        r2 = 0
                        r3 = 2
                        androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r4 = r12.s
                        r5 = 1
                        if (r1 == 0) goto L27
                        if (r1 == r5) goto L1f
                        if (r1 != r3) goto L17
                        java.lang.Object r1 = r12.r
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                        kotlin.ResultKt.b(r13)
                        goto L51
                    L17:
                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r13.<init>(r0)
                        throw r13
                    L1f:
                        java.lang.Object r1 = r12.r
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                        kotlin.ResultKt.b(r13)
                        goto L3a
                    L27:
                        kotlin.ResultKt.b(r13)
                        java.lang.Object r13 = r12.r
                        r1 = r13
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                        r12.r = r1
                        r12.q = r5
                        java.lang.Object r13 = androidx.compose.foundation.gestures.TapGestureDetectorKt.c(r1, r2, r12, r3)
                        if (r13 != r0) goto L3a
                        goto L50
                    L3a:
                        androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
                        long r5 = r13.f1855a
                        r4.h = r5
                        long r5 = r13.c
                        r4.b = r5
                    L44:
                        r12.r = r1
                        r12.q = r3
                        androidx.compose.ui.input.pointer.PointerEventPass r13 = androidx.compose.ui.input.pointer.PointerEventPass.e
                        java.lang.Object r13 = r1.x1(r13, r12)
                        if (r13 != r0) goto L51
                    L50:
                        return r0
                    L51:
                        androidx.compose.ui.input.pointer.PointerEvent r13 = (androidx.compose.ui.input.pointer.PointerEvent) r13
                        java.lang.Object r13 = r13.f1851a
                        java.util.ArrayList r5 = new java.util.ArrayList
                        int r6 = r13.size()
                        r5.<init>(r6)
                        r6 = r13
                        java.util.Collection r6 = (java.util.Collection) r6
                        int r6 = r6.size()
                        r7 = r2
                    L66:
                        if (r7 >= r6) goto L79
                        java.lang.Object r8 = r13.get(r7)
                        r9 = r8
                        androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9
                        boolean r9 = r9.d
                        if (r9 == 0) goto L76
                        r5.add(r8)
                    L76:
                        int r7 = r7 + 1
                        goto L66
                    L79:
                        int r13 = r5.size()
                        r6 = r2
                    L7e:
                        if (r6 >= r13) goto L95
                        java.lang.Object r7 = r5.get(r6)
                        r8 = r7
                        androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
                        long r8 = r8.f1855a
                        long r10 = r4.h
                        boolean r8 = androidx.compose.ui.input.pointer.PointerId.a(r8, r10)
                        if (r8 == 0) goto L92
                        goto L96
                    L92:
                        int r6 = r6 + 1
                        goto L7e
                    L95:
                        r7 = 0
                    L96:
                        androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
                        if (r7 != 0) goto La1
                        java.lang.Object r13 = kotlin.collections.CollectionsKt.F(r5)
                        r7 = r13
                        androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
                    La1:
                        if (r7 == 0) goto Lab
                        long r8 = r7.f1855a
                        r4.h = r8
                        long r6 = r7.c
                        r4.b = r6
                    Lab:
                        boolean r13 = r5.isEmpty()
                        if (r13 == 0) goto L44
                        r0 = -1
                        r4.h = r0
                        kotlin.Unit r13 = kotlin.Unit.f24250a
                        return r13
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                Object objC = ForEachGestureKt.c(pointerInputScope, new AnonymousClass1(this.d, null), continuation);
                return objC == CoroutineSingletons.d ? objC : Unit.f24250a;
            }
        });
        this.i = Build.VERSION.SDK_INT >= 31 ? new StretchOverscrollNode(suspendingPointerInputModifierNodeImplA, this, edgeEffectWrapper) : new GlowOverscrollNode(suspendingPointerInputModifierNodeImplA, this, edgeEffectWrapper, paddingValues);
    }

    public final void a() {
        boolean z;
        EdgeEffectWrapper edgeEffectWrapper = this.c;
        EdgeEffect edgeEffect = edgeEffectWrapper.d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = edgeEffectWrapper.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = edgeEffectWrapper.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = edgeEffectWrapper.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            c();
        }
    }

    public final long b() {
        long jB = this.b;
        if ((9223372034707292159L & jB) == 9205357640488583168L) {
            jB = SizeKt.b(this.g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jB >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jB & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void c() {
        if (this.e) {
            ((SnapshotMutableStateImpl) this.d).setValue(Unit.f24250a);
        }
    }

    public final float d(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (b() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectB = this.c.b();
        return EdgeEffectCompat.c(edgeEffectB) == BitmapDescriptorFactory.HUE_RED ? Float.intBitsToFloat((int) (this.g & 4294967295L)) * (-EdgeEffectCompat.e(edgeEffectB, -fIntBitsToFloat2, 1 - fIntBitsToFloat)) : Float.intBitsToFloat(i);
    }

    public final float e(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (b() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectC = this.c.c();
        return EdgeEffectCompat.c(edgeEffectC) == BitmapDescriptorFactory.HUE_RED ? Float.intBitsToFloat((int) (this.g >> 32)) * EdgeEffectCompat.e(edgeEffectC, fIntBitsToFloat2, 1 - fIntBitsToFloat) : Float.intBitsToFloat(i);
    }

    public final float f(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (b() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectD = this.c.d();
        return EdgeEffectCompat.c(edgeEffectD) == BitmapDescriptorFactory.HUE_RED ? Float.intBitsToFloat((int) (this.g >> 32)) * (-EdgeEffectCompat.e(edgeEffectD, -fIntBitsToFloat2, fIntBitsToFloat)) : Float.intBitsToFloat(i);
    }

    public final float g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (b() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectE = this.c.e();
        return EdgeEffectCompat.c(edgeEffectE) == BitmapDescriptorFactory.HUE_RED ? Float.intBitsToFloat((int) (this.g & 4294967295L)) * EdgeEffectCompat.e(edgeEffectE, fIntBitsToFloat2, fIntBitsToFloat) : Float.intBitsToFloat(i);
    }

    public final void h(long j) {
        boolean zA = Size.a(this.g, 0L);
        boolean zA2 = Size.a(j, this.g);
        this.g = j;
        if (!zA2) {
            long jB = (MathKt.b(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (MathKt.b(Float.intBitsToFloat((int) (j >> 32))) << 32);
            EdgeEffectWrapper edgeEffectWrapper = this.c;
            edgeEffectWrapper.c = jB;
            EdgeEffect edgeEffect = edgeEffectWrapper.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jB >> 32), (int) (jB & 4294967295L));
            }
            EdgeEffect edgeEffect2 = edgeEffectWrapper.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jB >> 32), (int) (jB & 4294967295L));
            }
            EdgeEffect edgeEffect3 = edgeEffectWrapper.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jB & 4294967295L), (int) (jB >> 32));
            }
            EdgeEffect edgeEffect4 = edgeEffectWrapper.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jB & 4294967295L), (int) (jB >> 32));
            }
            EdgeEffect edgeEffect5 = edgeEffectWrapper.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jB >> 32), (int) (jB & 4294967295L));
            }
            EdgeEffect edgeEffect6 = edgeEffectWrapper.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jB >> 32), (int) (jB & 4294967295L));
            }
            EdgeEffect edgeEffect7 = edgeEffectWrapper.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jB & 4294967295L), (int) (jB >> 32));
            }
            EdgeEffect edgeEffect8 = edgeEffectWrapper.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jB), (int) (jB >> 32));
            }
        }
        if (zA || zA2) {
            return;
        }
        a();
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public final DelegatableNode i() {
        return this.i;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public final boolean j() {
        EdgeEffectWrapper edgeEffectWrapper = this.c;
        EdgeEffect edgeEffect = edgeEffectWrapper.d;
        if (edgeEffect != null && EdgeEffectCompat.c(edgeEffect) != BitmapDescriptorFactory.HUE_RED) {
            return true;
        }
        EdgeEffect edgeEffect2 = edgeEffectWrapper.e;
        if (edgeEffect2 != null && EdgeEffectCompat.c(edgeEffect2) != BitmapDescriptorFactory.HUE_RED) {
            return true;
        }
        EdgeEffect edgeEffect3 = edgeEffectWrapper.f;
        if (edgeEffect3 != null && EdgeEffectCompat.c(edgeEffect3) != BitmapDescriptorFactory.HUE_RED) {
            return true;
        }
        EdgeEffect edgeEffect4 = edgeEffectWrapper.g;
        return (edgeEffect4 == null || EdgeEffectCompat.c(edgeEffect4) == BitmapDescriptorFactory.HUE_RED) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0231 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012b A[PHI: r7
  0x012b: PHI (r7v9 float) = (r7v8 float), (r7v12 float) binds: [B:73:0x0159, B:62:0x0124] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e5  */
    @Override // androidx.compose.foundation.OverscrollEffect
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long k(long r20, int r22, kotlin.jvm.functions.Function1 r23) {
        /*
            Method dump skipped, instructions count: 750
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.k(long, int, kotlin.jvm.functions.Function1):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // androidx.compose.foundation.OverscrollEffect
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(long r15, kotlin.jvm.functions.Function2 r17, kotlin.coroutines.Continuation r18) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.l(long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
