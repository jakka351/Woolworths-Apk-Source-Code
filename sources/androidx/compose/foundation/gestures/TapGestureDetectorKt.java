package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import au.com.woolworths.foundation.ui.image.gallery.c;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class TapGestureDetectorKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Function3 f903a = new TapGestureDetectorKt$NoPressGesture$1(3, null);

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050 A[LOOP:0: B:19:0x004e->B:20:0x0050, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, kotlin.coroutines.jvm.internal.BaseContinuationImpl r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = r0.p
            kotlin.ResultKt.b(r9)
            goto L41
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            kotlin.ResultKt.b(r9)
        L34:
            r0.p = r8
            r0.r = r3
            androidx.compose.ui.input.pointer.PointerEventPass r9 = androidx.compose.ui.input.pointer.PointerEventPass.e
            java.lang.Object r9 = r8.x1(r9, r0)
            if (r9 != r1) goto L41
            return r1
        L41:
            androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.ui.input.pointer.PointerEvent) r9
            java.lang.Object r2 = r9.f1851a
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
            r6 = r5
        L4e:
            if (r6 >= r4) goto L5c
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            r7.a()
            int r6 = r6 + 1
            goto L4e
        L5c:
            java.lang.Object r9 = r9.f1851a
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
        L65:
            if (r5 >= r2) goto L75
            java.lang.Object r4 = r9.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
            boolean r4 = r4.d
            if (r4 == 0) goto L72
            goto L34
        L72:
            int r5 = r5 + 1
            goto L65
        L75:
            kotlin.Unit r8 = kotlin.Unit.f24250a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.a(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(androidx.compose.ui.input.pointer.AwaitPointerEventScope r6, boolean r7, androidx.compose.ui.input.pointer.PointerEventPass r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.s
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            boolean r6 = r0.r
            androidx.compose.ui.input.pointer.PointerEventPass r7 = r0.q
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = r0.p
            kotlin.ResultKt.b(r9)
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
            goto L4b
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            kotlin.ResultKt.b(r9)
        L3c:
            r0.p = r6
            r0.q = r8
            r0.r = r7
            r0.t = r3
            java.lang.Object r9 = r6.x1(r8, r0)
            if (r9 != r1) goto L4b
            return r1
        L4b:
            androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.ui.input.pointer.PointerEvent) r9
            r2 = 0
            boolean r4 = h(r9, r7, r2)
            if (r4 == 0) goto L3c
            java.lang.Object r6 = r9.f1851a
            java.lang.Object r6 = r6.get(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.b(androidx.compose.ui.input.pointer.AwaitPointerEventScope, boolean, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object c(AwaitPointerEventScope awaitPointerEventScope, boolean z, Continuation continuation, int i) {
        PointerEventPass pointerEventPass = PointerEventPass.d;
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            pointerEventPass = PointerEventPass.e;
        }
        return b(awaitPointerEventScope, z, pointerEventPass, continuation);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0043 -> B:18:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(androidx.compose.ui.input.pointer.AwaitPointerEventScope r6, androidx.compose.ui.input.pointer.PointerEventPass r7, kotlin.coroutines.jvm.internal.BaseContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            androidx.compose.ui.input.pointer.PointerEventPass r6 = r0.q
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = r0.p
            kotlin.ResultKt.b(r8)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L46
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.ResultKt.b(r8)
        L39:
            r0.p = r6
            r0.q = r7
            r0.s = r3
            java.lang.Object r8 = r6.x1(r7, r0)
            if (r8 != r1) goto L46
            return r1
        L46:
            androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.ui.input.pointer.PointerEvent) r8
            r2 = 0
            boolean r4 = h(r8, r2, r3)
            if (r4 == 0) goto L39
            java.lang.Object r6 = r8.f1851a
            java.lang.Object r6 = r6.get(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.d(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    public static final Object e(PointerInputScope pointerInputScope, Function3 function3, Function1 function1, Continuation continuation) {
        Object objC = CoroutineScopeKt.c(new TapGestureDetectorKt$detectTapAndPress$2(pointerInputScope, function3, function1, new PressGestureScopeImpl(pointerInputScope), null), continuation);
        return objC == CoroutineSingletons.d ? objC : Unit.f24250a;
    }

    public static final Object f(PointerInputScope pointerInputScope, Continuation continuation, Function1 function1, Function1 function12, Function1 function13, Function3 function3) {
        Object objC = CoroutineScopeKt.c(new TapGestureDetectorKt$detectTapGestures$2(pointerInputScope, null, function12, function1, function13, function3), continuation);
        return objC == CoroutineSingletons.d ? objC : Unit.f24250a;
    }

    public static /* synthetic */ Object g(PointerInputScope pointerInputScope, c cVar, Function1 function1, Function3 function3, Function1 function12, Continuation continuation, int i) {
        c cVar2;
        Continuation continuation2;
        Function3 function32;
        Function1 function13;
        if ((i & 1) != 0) {
            cVar = null;
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function3 = f903a;
        }
        if ((i & 8) != 0) {
            Function1 function14 = function1;
            cVar2 = cVar;
            continuation2 = continuation;
            function32 = function3;
            function13 = function14;
            function12 = null;
        } else {
            Function1 function15 = function1;
            cVar2 = cVar;
            continuation2 = continuation;
            function32 = function3;
            function13 = function15;
        }
        return f(pointerInputScope, continuation2, cVar2, function13, function12, function32);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.List] */
    public static final boolean h(PointerEvent pointerEvent, boolean z, boolean z2) {
        if (z2) {
            ?? r7 = pointerEvent.f1851a;
            int size = ((Collection) r7).size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (((PointerInputChange) r7.get(i)).i != 2) {
                        break;
                    }
                    i++;
                } else if ((pointerEvent.c & 33) == 0) {
                    return false;
                }
            }
        }
        ?? r5 = pointerEvent.f1851a;
        int size2 = ((Collection) r5).size();
        int i2 = 0;
        while (true) {
            boolean zA = true;
            if (i2 >= size2) {
                return true;
            }
            PointerInputChange pointerInputChange = (PointerInputChange) r5.get(i2);
            if (!z) {
                zA = PointerEventKt.a(pointerInputChange);
            } else if (pointerInputChange.b() || pointerInputChange.h || !pointerInputChange.d) {
                zA = false;
            }
            if (!zA) {
                return false;
            }
            i2++;
        }
    }

    public static Job i(CoroutineScope coroutineScope, Job job, Function2 function2) {
        return BuildersKt.c(coroutineScope, null, CoroutineStart.g, new TapGestureDetectorKt$launchAwaitingReset$1(job, function2, null), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(androidx.compose.ui.input.pointer.AwaitPointerEventScope r7, androidx.compose.ui.input.pointer.PointerEventPass r8, kotlin.coroutines.jvm.internal.BaseContinuationImpl r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.jvm.internal.Ref$ObjectRef r7 = r0.p
            kotlin.ResultKt.b(r9)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L56
            goto L53
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            kotlin.jvm.internal.Ref$ObjectRef r9 = androidx.camera.core.impl.b.x(r9)
            androidx.compose.foundation.gestures.LongPressResult$Canceled r2 = androidx.compose.foundation.gestures.LongPressResult.Canceled.f891a
            r9.d = r2
            androidx.compose.ui.platform.ViewConfiguration r2 = r7.getViewConfiguration()     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L56
            long r4 = r2.e()     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L56
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2 r2 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L56
            r6 = 0
            r2.<init>(r8, r9, r6)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L56
            r0.p = r9     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L56
            r0.r = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L56
            java.lang.Object r7 = r7.K1(r4, r2, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L56
            if (r7 != r1) goto L52
            return r1
        L52:
            r7 = r9
        L53:
            java.lang.Object r7 = r7.d
            return r7
        L56:
            androidx.compose.foundation.gestures.LongPressResult$Success r7 = androidx.compose.foundation.gestures.LongPressResult.Success.f893a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.j(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
    
        if (r15 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00a4 -> B:13:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object k(androidx.compose.ui.input.pointer.AwaitPointerEventScope r13, androidx.compose.ui.input.pointer.PointerEventPass r14, kotlin.coroutines.jvm.internal.BaseContinuationImpl r15) {
        /*
            boolean r0 = r15 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2
            if (r0 == 0) goto L13
            r0 = r15
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3b
            if (r2 != r3) goto L33
            androidx.compose.ui.input.pointer.PointerEventPass r13 = r0.q
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r14 = r0.p
            kotlin.ResultKt.b(r15)
        L2e:
            r12 = r14
            r14 = r13
            r13 = r12
            goto La7
        L33:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3b:
            androidx.compose.ui.input.pointer.PointerEventPass r13 = r0.q
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r14 = r0.p
            kotlin.ResultKt.b(r15)
            goto L56
        L43:
            kotlin.ResultKt.b(r15)
        L46:
            r0.p = r13
            r0.q = r14
            r0.s = r5
            java.lang.Object r15 = r13.x1(r14, r0)
            if (r15 != r1) goto L53
            goto La6
        L53:
            r12 = r14
            r14 = r13
            r13 = r12
        L56:
            androidx.compose.ui.input.pointer.PointerEvent r15 = (androidx.compose.ui.input.pointer.PointerEvent) r15
            java.lang.Object r15 = r15.f1851a
            r2 = r15
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r6 = r4
        L62:
            if (r6 >= r2) goto Lc9
            java.lang.Object r7 = r15.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            boolean r7 = androidx.compose.ui.input.pointer.PointerEventKt.b(r7)
            if (r7 != 0) goto Lc6
            r2 = r15
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r6 = r4
        L78:
            if (r6 >= r2) goto L98
            java.lang.Object r7 = r15.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            boolean r8 = r7.b()
            if (r8 != 0) goto Lc1
            long r8 = r14.a()
            long r10 = r14.n1()
            boolean r7 = androidx.compose.ui.input.pointer.PointerEventKt.d(r7, r8, r10)
            if (r7 == 0) goto L95
            goto Lc1
        L95:
            int r6 = r6 + 1
            goto L78
        L98:
            androidx.compose.ui.input.pointer.PointerEventPass r15 = androidx.compose.ui.input.pointer.PointerEventPass.f
            r0.p = r14
            r0.q = r13
            r0.s = r3
            java.lang.Object r15 = r14.x1(r15, r0)
            if (r15 != r1) goto L2e
        La6:
            return r1
        La7:
            androidx.compose.ui.input.pointer.PointerEvent r15 = (androidx.compose.ui.input.pointer.PointerEvent) r15
            java.lang.Object r15 = r15.f1851a
            r2 = r15
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r6 = r4
        Lb3:
            if (r6 >= r2) goto L46
            java.lang.Object r7 = r15.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            boolean r7 = r7.b()
            if (r7 == 0) goto Lc3
        Lc1:
            r13 = 0
            return r13
        Lc3:
            int r6 = r6 + 1
            goto Lb3
        Lc6:
            int r6 = r6 + 1
            goto L62
        Lc9:
            java.lang.Object r13 = r15.get(r4)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.k(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }
}
