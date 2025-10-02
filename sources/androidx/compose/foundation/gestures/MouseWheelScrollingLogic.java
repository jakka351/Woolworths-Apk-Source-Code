package androidx.compose.foundation.gestures;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Density;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlin.sequences.SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic;", "", "MouseWheelScrollDelta", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class MouseWheelScrollingLogic {

    /* renamed from: a, reason: collision with root package name */
    public final ScrollingLogic f895a;
    public final ScrollConfig b;
    public final Function2 c;
    public Density d;
    public boolean f;
    public Job g;
    public final BufferedChannel e = ChannelKt.a(Integer.MAX_VALUE, 6, null);
    public final MouseWheelVelocityTracker h = new MouseWheelVelocityTracker();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MouseWheelScrollDelta {

        /* renamed from: a, reason: collision with root package name */
        public final long f896a;
        public final long b;
        public final boolean c;

        public MouseWheelScrollDelta(long j, long j2, boolean z) {
            this.f896a = j;
            this.b = j2;
            this.c = z;
        }

        public final MouseWheelScrollDelta a(MouseWheelScrollDelta mouseWheelScrollDelta) {
            return new MouseWheelScrollDelta(Offset.h(this.f896a, mouseWheelScrollDelta.f896a), Math.max(this.b, mouseWheelScrollDelta.b), this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MouseWheelScrollDelta)) {
                return false;
            }
            MouseWheelScrollDelta mouseWheelScrollDelta = (MouseWheelScrollDelta) obj;
            return Offset.c(this.f896a, mouseWheelScrollDelta.f896a) && this.b == mouseWheelScrollDelta.b && this.c == mouseWheelScrollDelta.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + b.b(Long.hashCode(this.f896a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MouseWheelScrollDelta(value=");
            sb.append((Object) Offset.j(this.f896a));
            sb.append(", timeMillis=");
            sb.append(this.b);
            sb.append(", shouldApplyImmediately=");
            return b.s(sb, this.c, ')');
        }
    }

    public MouseWheelScrollingLogic(ScrollingLogic scrollingLogic, ScrollConfig scrollConfig, Function2 function2, Density density) {
        this.f895a = scrollingLogic;
        this.b = scrollConfig;
        this.c = function2;
        this.d = density;
    }

    public static final float a(MouseWheelScrollingLogic mouseWheelScrollingLogic, NestedScrollScope nestedScrollScope, float f) {
        ScrollingLogic scrollingLogic = mouseWheelScrollingLogic.f895a;
        return scrollingLogic.g(scrollingLogic.e(nestedScrollScope.b(scrollingLogic.h(scrollingLogic.d(f)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(androidx.compose.foundation.gestures.MouseWheelScrollingLogic r16, androidx.compose.foundation.gestures.ScrollingLogic r17, androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta r18, float r19, float r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.b(androidx.compose.foundation.gestures.MouseWheelScrollingLogic, androidx.compose.foundation.gestures.ScrollingLogic, androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta, float, float, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(androidx.compose.foundation.gestures.MouseWheelScrollingLogic r14, kotlin.jvm.internal.Ref.ObjectRef r15, kotlin.jvm.internal.Ref.FloatRef r16, androidx.compose.foundation.gestures.ScrollingLogic r17, kotlin.jvm.internal.Ref.ObjectRef r18, long r19, kotlin.coroutines.jvm.internal.ContinuationImpl r21) throws java.lang.Throwable {
        /*
            r0 = r19
            r2 = r21
            boolean r3 = r2 instanceof androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1
            if (r3 == 0) goto L17
            r3 = r2
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 r3 = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1) r3
            int r4 = r3.v
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L17
            int r4 = r4 - r5
            r3.v = r4
            goto L1c
        L17:
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 r3 = new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1
            r3.<init>(r2)
        L1c:
            java.lang.Object r2 = r3.u
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r5 = r3.v
            r6 = 1
            if (r5 == 0) goto L40
            if (r5 != r6) goto L38
            kotlin.jvm.internal.Ref$ObjectRef r14 = r3.t
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r3.s
            kotlin.jvm.internal.Ref$FloatRef r1 = r3.r
            kotlin.jvm.internal.Ref$ObjectRef r4 = r3.q
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic r3 = r3.p
            kotlin.ResultKt.b(r2)
            r9 = r14
            r8 = r0
            r14 = r3
            goto L6d
        L38:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L40:
            kotlin.ResultKt.b(r2)
            r7 = 0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 >= 0) goto L4c
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            return r14
        L4c:
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2 r2 = new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2
            r5 = 0
            r2.<init>(r14, r5)
            r3.p = r14
            r3.q = r15
            r7 = r16
            r3.r = r7
            r8 = r17
            r3.s = r8
            r9 = r18
            r3.t = r9
            r3.v = r6
            java.lang.Object r2 = kotlinx.coroutines.TimeoutKt.c(r0, r2, r3)
            if (r2 != r4) goto L6b
            return r4
        L6b:
            r4 = r15
            r1 = r7
        L6d:
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta r2 = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta) r2
            if (r2 == 0) goto La8
            java.lang.Object r0 = r4.d
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta r0 = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta) r0
            boolean r0 = r0.c
            long r10 = r2.f896a
            long r12 = r2.b
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta r3 = new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta
            r20 = r0
            r15 = r3
            r16 = r10
            r18 = r12
            r15.<init>(r16, r18, r20)
            r0 = r15
            r4.d = r0
            long r3 = r8.e(r10)
            float r0 = r8.g(r3)
            r1.d = r0
            r0 = 30
            r3 = 0
            androidx.compose.animation.core.AnimationState r0 = androidx.compose.animation.core.AnimationStateKt.a(r3, r3, r0)
            r9.d = r0
            r14.g(r2)
            float r14 = r1.d
            boolean r14 = androidx.compose.foundation.gestures.MouseWheelScrollableKt.a(r14)
            r14 = r14 ^ r6
            goto La9
        La8:
            r14 = 0
        La9:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.c(androidx.compose.foundation.gestures.MouseWheelScrollingLogic, kotlin.jvm.internal.Ref$ObjectRef, kotlin.jvm.internal.Ref$FloatRef, androidx.compose.foundation.gestures.ScrollingLogic, kotlin.jvm.internal.Ref$ObjectRef, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.coroutines.jvm.internal.RestrictedSuspendLambda, kotlin.jvm.functions.Function2] */
    public static MouseWheelScrollDelta f(BufferedChannel bufferedChannel) {
        MouseWheelScrollDelta mouseWheelScrollDelta = null;
        Iterator itO = SequencesKt.o(new SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1(new MouseWheelScrollingLogic$untilNull$1(new MouseWheelScrollingLogic$sumOrNull$1(bufferedChannel), null)).f24663a);
        while (itO.hasNext()) {
            MouseWheelScrollDelta mouseWheelScrollDeltaA = (MouseWheelScrollDelta) itO.next();
            if (mouseWheelScrollDelta != null) {
                mouseWheelScrollDeltaA = mouseWheelScrollDelta.a(mouseWheelScrollDeltaA);
            }
            mouseWheelScrollDelta = mouseWheelScrollDeltaA;
        }
        return mouseWheelScrollDelta;
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.List] */
    public final void d(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        if (pointerEventPass == PointerEventPass.e) {
            int i = pointerEvent.e;
            ?? r10 = pointerEvent.f1851a;
            if (i == 6) {
                Collection collection = (Collection) r10;
                int size = collection.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (((PointerInputChange) r10.get(i2)).b()) {
                        return;
                    }
                }
                long jA = ((AndroidConfig) this.b).a(pointerEvent);
                ScrollingLogic scrollingLogic = this.f895a;
                float fG = scrollingLogic.g(scrollingLogic.e(jA));
                if ((fG > BitmapDescriptorFactory.HUE_RED ? 1 : (fG == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) == 0 ? false : (fG > BitmapDescriptorFactory.HUE_RED ? 1 : (fG == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) > 0 ? scrollingLogic.f900a.b() : scrollingLogic.f900a.d() ? !(this.e.k(new MouseWheelScrollDelta(jA, ((PointerInputChange) CollectionsKt.D(r10)).b, false)) instanceof ChannelResult.Failed) : this.f) {
                    int size2 = collection.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((PointerInputChange) r10.get(i3)).a();
                    }
                }
            }
        }
    }

    public final void e(CoroutineScope coroutineScope) {
        if (this.g == null) {
            this.g = BuildersKt.c(coroutineScope, null, null, new MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1(this, null), 3);
        }
    }

    public final void g(MouseWheelScrollDelta mouseWheelScrollDelta) {
        long j = mouseWheelScrollDelta.b;
        long j2 = mouseWheelScrollDelta.f896a;
        MouseWheelVelocityTracker mouseWheelVelocityTracker = this.h;
        mouseWheelVelocityTracker.f897a.a(j, Float.intBitsToFloat((int) (j2 >> 32)));
        mouseWheelVelocityTracker.b.a(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public final void h(Density density) {
        this.d = density;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(androidx.compose.foundation.gestures.ScrollingLogic r5, kotlin.jvm.functions.Function2 r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1 r0 = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1 r0 = new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic r5 = r0.p
            kotlin.ResultKt.b(r7)
            goto L48
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r7)
            r4.f = r3
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$2 r7 = new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$2
            r2 = 0
            r7.<init>(r5, r2, r6)
            r0.p = r4
            r0.s = r3
            java.lang.Object r5 = kotlinx.coroutines.SupervisorKt.c(r7, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            r5 = r4
        L48:
            r6 = 0
            r5.f = r6
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.i(androidx.compose.foundation.gestures.ScrollingLogic, kotlin.jvm.functions.Function2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
