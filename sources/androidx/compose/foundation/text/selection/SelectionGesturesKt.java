package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.ViewConfiguration;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SelectionGesturesKt {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.compose.ui.input.pointer.AwaitPointerEventScope r7, kotlin.coroutines.jvm.internal.BaseContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 r0 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = r0.p
            kotlin.ResultKt.b(r8)
            goto L41
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            kotlin.ResultKt.b(r8)
        L34:
            androidx.compose.ui.input.pointer.PointerEventPass r8 = androidx.compose.ui.input.pointer.PointerEventPass.e
            r0.p = r7
            r0.r = r3
            java.lang.Object r8 = r7.x1(r8, r0)
            if (r8 != r1) goto L41
            return r1
        L41:
            androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.ui.input.pointer.PointerEvent) r8
            java.lang.Object r2 = r8.f1851a
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
        L4d:
            if (r5 >= r4) goto L5f
            java.lang.Object r6 = r2.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
            boolean r6 = androidx.compose.ui.input.pointer.PointerEventKt.a(r6)
            if (r6 != 0) goto L5c
            goto L34
        L5c:
            int r5 = r5 + 1
            goto L4d
        L5f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.a(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, final androidx.compose.foundation.text.selection.MouseSelectionObserver r9, androidx.compose.foundation.text.selection.ClicksCounter r10, androidx.compose.ui.input.pointer.PointerEvent r11, kotlin.coroutines.jvm.internal.BaseContinuationImpl r12) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.b(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.selection.MouseSelectionObserver, androidx.compose.foundation.text.selection.ClicksCounter, androidx.compose.ui.input.pointer.PointerEvent, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e1 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x002f, B:46:0x00c6, B:48:0x00ce, B:50:0x00d2, B:52:0x00e1, B:54:0x00ed, B:42:0x009f), top: B:61:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, final androidx.compose.foundation.text.selection.MouseSelectionObserver r9, androidx.compose.foundation.text.selection.ClicksCounter r10, androidx.compose.ui.input.pointer.PointerEvent r11, kotlin.coroutines.jvm.internal.BaseContinuationImpl r12) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.c(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.selection.MouseSelectionObserver, androidx.compose.foundation.text.selection.ClicksCounter, androidx.compose.ui.input.pointer.PointerEvent, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
    
        if (r11 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, final androidx.compose.foundation.text.TextDragObserver r9, androidx.compose.ui.input.pointer.PointerEvent r10, kotlin.coroutines.jvm.internal.BaseContinuationImpl r11) {
        /*
            boolean r0 = r11 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1 r0 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.s
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            androidx.compose.foundation.text.TextDragObserver r9 = r0.q
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = r0.p
            kotlin.ResultKt.b(r11)     // Catch: java.util.concurrent.CancellationException -> L2e
            goto L8c
        L2e:
            r8 = move-exception
            goto Lc0
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            androidx.compose.ui.input.pointer.PointerInputChange r8 = r0.r
            androidx.compose.foundation.text.TextDragObserver r9 = r0.q
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = r0.p
            kotlin.ResultKt.b(r11)     // Catch: java.util.concurrent.CancellationException -> L2e
            r7 = r10
            r10 = r8
            r8 = r7
            goto L62
        L46:
            kotlin.ResultKt.b(r11)
            java.lang.Object r10 = r10.f1851a     // Catch: java.util.concurrent.CancellationException -> L2e
            java.lang.Object r10 = kotlin.collections.CollectionsKt.D(r10)     // Catch: java.util.concurrent.CancellationException -> L2e
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10     // Catch: java.util.concurrent.CancellationException -> L2e
            long r5 = r10.f1855a     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.p = r8     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.q = r9     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.r = r10     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.t = r4     // Catch: java.util.concurrent.CancellationException -> L2e
            java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.c(r8, r5, r0)     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r11 != r1) goto L62
            goto L8b
        L62:
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r11 == 0) goto Lbd
            androidx.compose.ui.platform.ViewConfiguration r2 = r8.getViewConfiguration()     // Catch: java.util.concurrent.CancellationException -> L2e
            boolean r10 = g(r2, r10, r11)     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r10 == 0) goto Lbd
            long r4 = r11.c     // Catch: java.util.concurrent.CancellationException -> L2e
            r9.c(r4)     // Catch: java.util.concurrent.CancellationException -> L2e
            long r10 = r11.f1855a     // Catch: java.util.concurrent.CancellationException -> L2e
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$2 r2 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$2     // Catch: java.util.concurrent.CancellationException -> L2e
            r2.<init>()     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.p = r8     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.q = r9     // Catch: java.util.concurrent.CancellationException -> L2e
            r4 = 0
            r0.r = r4     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.t = r3     // Catch: java.util.concurrent.CancellationException -> L2e
            java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.g(r8, r10, r2, r0)     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r11 != r1) goto L8c
        L8b:
            return r1
        L8c:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.util.concurrent.CancellationException -> L2e
            boolean r10 = r11.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r10 == 0) goto Lba
            androidx.compose.ui.input.pointer.PointerEvent r8 = r8.y1()     // Catch: java.util.concurrent.CancellationException -> L2e
            java.lang.Object r8 = r8.f1851a     // Catch: java.util.concurrent.CancellationException -> L2e
            r10 = r8
            java.util.Collection r10 = (java.util.Collection) r10     // Catch: java.util.concurrent.CancellationException -> L2e
            int r10 = r10.size()     // Catch: java.util.concurrent.CancellationException -> L2e
            r11 = 0
        La2:
            if (r11 >= r10) goto Lb6
            java.lang.Object r0 = r8.get(r11)     // Catch: java.util.concurrent.CancellationException -> L2e
            androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0     // Catch: java.util.concurrent.CancellationException -> L2e
            boolean r1 = androidx.compose.ui.input.pointer.PointerEventKt.b(r0)     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r1 == 0) goto Lb3
            r0.a()     // Catch: java.util.concurrent.CancellationException -> L2e
        Lb3:
            int r11 = r11 + 1
            goto La2
        Lb6:
            r9.onStop()     // Catch: java.util.concurrent.CancellationException -> L2e
            goto Lbd
        Lba:
            r9.onCancel()     // Catch: java.util.concurrent.CancellationException -> L2e
        Lbd:
            kotlin.Unit r8 = kotlin.Unit.f24250a
            return r8
        Lc0:
            r9.onCancel()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.d(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.TextDragObserver, androidx.compose.ui.input.pointer.PointerEvent, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
    
        if (r11 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, final androidx.compose.foundation.text.TextDragObserver r9, androidx.compose.ui.input.pointer.PointerEvent r10, kotlin.coroutines.jvm.internal.BaseContinuationImpl r11) {
        /*
            boolean r0 = r11 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1 r0 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.s
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            androidx.compose.foundation.text.TextDragObserver r9 = r0.q
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = r0.p
            kotlin.ResultKt.b(r11)     // Catch: java.util.concurrent.CancellationException -> L2e
            goto L8c
        L2e:
            r8 = move-exception
            goto Lc0
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            androidx.compose.ui.input.pointer.PointerInputChange r8 = r0.r
            androidx.compose.foundation.text.TextDragObserver r9 = r0.q
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = r0.p
            kotlin.ResultKt.b(r11)     // Catch: java.util.concurrent.CancellationException -> L2e
            r7 = r10
            r10 = r8
            r8 = r7
            goto L62
        L46:
            kotlin.ResultKt.b(r11)
            java.lang.Object r10 = r10.f1851a     // Catch: java.util.concurrent.CancellationException -> L2e
            java.lang.Object r10 = kotlin.collections.CollectionsKt.D(r10)     // Catch: java.util.concurrent.CancellationException -> L2e
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10     // Catch: java.util.concurrent.CancellationException -> L2e
            long r5 = r10.f1855a     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.p = r8     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.q = r9     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.r = r10     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.t = r4     // Catch: java.util.concurrent.CancellationException -> L2e
            java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.c(r8, r5, r0)     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r11 != r1) goto L62
            goto L8b
        L62:
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r11 == 0) goto Lbd
            androidx.compose.ui.platform.ViewConfiguration r2 = r8.getViewConfiguration()     // Catch: java.util.concurrent.CancellationException -> L2e
            boolean r10 = g(r2, r10, r11)     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r10 == 0) goto Lbd
            long r4 = r11.c     // Catch: java.util.concurrent.CancellationException -> L2e
            r9.c(r4)     // Catch: java.util.concurrent.CancellationException -> L2e
            long r10 = r11.f1855a     // Catch: java.util.concurrent.CancellationException -> L2e
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$dragCompletedWithUp$1 r2 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$dragCompletedWithUp$1     // Catch: java.util.concurrent.CancellationException -> L2e
            r2.<init>()     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.p = r8     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.q = r9     // Catch: java.util.concurrent.CancellationException -> L2e
            r4 = 0
            r0.r = r4     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.t = r3     // Catch: java.util.concurrent.CancellationException -> L2e
            java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.g(r8, r10, r2, r0)     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r11 != r1) goto L8c
        L8b:
            return r1
        L8c:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.util.concurrent.CancellationException -> L2e
            boolean r10 = r11.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r10 == 0) goto Lba
            androidx.compose.ui.input.pointer.PointerEvent r8 = r8.y1()     // Catch: java.util.concurrent.CancellationException -> L2e
            java.lang.Object r8 = r8.f1851a     // Catch: java.util.concurrent.CancellationException -> L2e
            r10 = r8
            java.util.Collection r10 = (java.util.Collection) r10     // Catch: java.util.concurrent.CancellationException -> L2e
            int r10 = r10.size()     // Catch: java.util.concurrent.CancellationException -> L2e
            r11 = 0
        La2:
            if (r11 >= r10) goto Lb6
            java.lang.Object r0 = r8.get(r11)     // Catch: java.util.concurrent.CancellationException -> L2e
            androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0     // Catch: java.util.concurrent.CancellationException -> L2e
            boolean r1 = androidx.compose.ui.input.pointer.PointerEventKt.b(r0)     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r1 == 0) goto Lb3
            r0.a()     // Catch: java.util.concurrent.CancellationException -> L2e
        Lb3:
            int r11 = r11 + 1
            goto La2
        Lb6:
            r9.onStop()     // Catch: java.util.concurrent.CancellationException -> L2e
            goto Lbd
        Lba:
            r9.onCancel()     // Catch: java.util.concurrent.CancellationException -> L2e
        Lbd:
            kotlin.Unit r8 = kotlin.Unit.f24250a
            return r8
        Lc0:
            r9.onCancel()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.e(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.TextDragObserver, androidx.compose.ui.input.pointer.PointerEvent, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0098 A[Catch: CancellationException -> 0x009b, TryCatch #2 {CancellationException -> 0x009b, blocks: (B:29:0x0094, B:31:0x0098, B:34:0x009d, B:37:0x00a2, B:39:0x00ab, B:41:0x00af, B:43:0x00b3, B:44:0x00b8), top: B:68:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2 A[Catch: CancellationException -> 0x009b, TryCatch #2 {CancellationException -> 0x009b, blocks: (B:29:0x0094, B:31:0x0098, B:34:0x009d, B:37:0x00a2, B:39:0x00ab, B:41:0x00af, B:43:0x00b3, B:44:0x00b8), top: B:68:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d8 A[Catch: CancellationException -> 0x0034, TryCatch #3 {CancellationException -> 0x0034, blocks: (B:13:0x002f, B:48:0x00d0, B:50:0x00d8, B:52:0x00e8, B:54:0x00f4, B:55:0x00f7, B:56:0x00fa, B:58:0x00fe), top: B:69:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fe A[Catch: CancellationException -> 0x0034, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x0034, blocks: (B:13:0x002f, B:48:0x00d0, B:50:0x00d8, B:52:0x00e8, B:54:0x00f4, B:55:0x00f7, B:56:0x00fa, B:58:0x00fe), top: B:69:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(androidx.compose.ui.input.pointer.AwaitPointerEventScope r14, androidx.compose.foundation.text.TextDragObserver r15, androidx.compose.ui.input.pointer.PointerEvent r16, kotlin.coroutines.jvm.internal.BaseContinuationImpl r17) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.f(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.TextDragObserver, androidx.compose.ui.input.pointer.PointerEvent, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    public static final boolean g(ViewConfiguration viewConfiguration, PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2) {
        return Offset.d(Offset.g(pointerInputChange.c, pointerInputChange2.c)) < DragGestureDetectorKt.j(viewConfiguration, pointerInputChange.i);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    public static final boolean h(PointerEvent pointerEvent) {
        ?? r5 = pointerEvent.f1851a;
        int size = ((Collection) r5).size();
        for (int i = 0; i < size; i++) {
            if (((PointerInputChange) r5.get(i)).i != 2) {
                return false;
            }
        }
        return true;
    }

    public static final Modifier i(Modifier modifier, final MouseSelectionObserver mouseSelectionObserver, final TextDragObserver textDragObserver) {
        PointerInputEventHandler pointerInputEventHandler = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1", f = "SelectionGestures.kt", l = {107, 113, 115}, m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1, reason: invalid class name */
            final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                public int q;
                public /* synthetic */ Object r;
                public final /* synthetic */ MouseSelectionObserver s;
                public final /* synthetic */ ClicksCounter t;
                public final /* synthetic */ TextDragObserver u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(TextDragObserver textDragObserver, ClicksCounter clicksCounter, MouseSelectionObserver mouseSelectionObserver, Continuation continuation) {
                    super(2, continuation);
                    this.s = mouseSelectionObserver;
                    this.t = clicksCounter;
                    this.u = textDragObserver;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.u, this.t, this.s, continuation);
                    anonymousClass1.r = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass1) create((AwaitPointerEventScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
                
                    if (androidx.compose.foundation.text.selection.SelectionGesturesKt.b(r1, r9.s, r9.t, r10, r9) == r0) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
                
                    if (androidx.compose.foundation.text.selection.SelectionGesturesKt.d(r1, r9.u, r10, r9) == r0) goto L32;
                 */
                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.List] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                    /*
                        r9 = this;
                        kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r1 = r9.q
                        r2 = 3
                        r3 = 2
                        r4 = 1
                        if (r1 == 0) goto L24
                        if (r1 == r4) goto L1c
                        if (r1 == r3) goto L18
                        if (r1 != r2) goto L10
                        goto L18
                    L10:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r0)
                        throw r10
                    L18:
                        kotlin.ResultKt.b(r10)
                        goto L84
                    L1c:
                        java.lang.Object r1 = r9.r
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                        kotlin.ResultKt.b(r10)
                        goto L37
                    L24:
                        kotlin.ResultKt.b(r10)
                        java.lang.Object r10 = r9.r
                        r1 = r10
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                        r9.r = r1
                        r9.q = r4
                        java.lang.Object r10 = androidx.compose.foundation.text.selection.SelectionGesturesKt.a(r1, r9)
                        if (r10 != r0) goto L37
                        goto L83
                    L37:
                        androidx.compose.ui.input.pointer.PointerEvent r10 = (androidx.compose.ui.input.pointer.PointerEvent) r10
                        boolean r4 = androidx.compose.foundation.text.selection.SelectionGesturesKt.h(r10)
                        r5 = 0
                        if (r4 == 0) goto L71
                        int r4 = r10.c
                        r4 = r4 & 33
                        if (r4 == 0) goto L71
                        java.lang.Object r4 = r10.f1851a
                        r6 = r4
                        java.util.Collection r6 = (java.util.Collection) r6
                        int r6 = r6.size()
                        r7 = 0
                    L50:
                        if (r7 >= r6) goto L62
                        java.lang.Object r8 = r4.get(r7)
                        androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
                        boolean r8 = r8.b()
                        if (r8 == 0) goto L5f
                        goto L71
                    L5f:
                        int r7 = r7 + 1
                        goto L50
                    L62:
                        r9.r = r5
                        r9.q = r3
                        androidx.compose.foundation.text.selection.MouseSelectionObserver r2 = r9.s
                        androidx.compose.foundation.text.selection.ClicksCounter r3 = r9.t
                        java.lang.Object r10 = androidx.compose.foundation.text.selection.SelectionGesturesKt.b(r1, r2, r3, r10, r9)
                        if (r10 != r0) goto L84
                        goto L83
                    L71:
                        boolean r3 = androidx.compose.foundation.text.selection.SelectionGesturesKt.h(r10)
                        if (r3 != 0) goto L84
                        r9.r = r5
                        r9.q = r2
                        androidx.compose.foundation.text.TextDragObserver r2 = r9.u
                        java.lang.Object r10 = androidx.compose.foundation.text.selection.SelectionGesturesKt.d(r1, r2, r10, r9)
                        if (r10 != r0) goto L84
                    L83:
                        return r0
                    L84:
                        kotlin.Unit r10 = kotlin.Unit.f24250a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                Object objC = ForEachGestureKt.c(pointerInputScope, new AnonymousClass1(textDragObserver, new ClicksCounter(pointerInputScope.getViewConfiguration()), mouseSelectionObserver, null), continuation);
                return objC == CoroutineSingletons.d ? objC : Unit.f24250a;
            }
        };
        PointerEvent pointerEvent = SuspendingPointerInputFilterKt.f1863a;
        return modifier.x0(new SuspendPointerInputElement(mouseSelectionObserver, textDragObserver, null, pointerInputEventHandler, 4));
    }

    public static final Object j(PointerInputScope pointerInputScope, MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver, Continuation continuation) {
        Object objC = ForEachGestureKt.c(pointerInputScope, new SelectionGesturesKt$selectionGesturePointerInputBtf2$2(textDragObserver, new ClicksCounter(pointerInputScope.getViewConfiguration()), mouseSelectionObserver, null), continuation);
        return objC == CoroutineSingletons.d ? objC : Unit.f24250a;
    }

    public static final Modifier k(Modifier modifier, final Function1 function1) {
        return SuspendingPointerInputFilterKt.d(modifier, 8675309, new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1", f = "SelectionGestures.kt", l = {94}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1, reason: invalid class name */
            final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                public int q;
                public /* synthetic */ Object r;
                public final /* synthetic */ Function1 s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(Function1 function1, Continuation continuation) {
                    super(2, continuation);
                    this.s = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.s, continuation);
                    anonymousClass1.r = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((AnonymousClass1) create((AwaitPointerEventScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                    return CoroutineSingletons.d;
                }

                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                /* JADX WARN: Removed duplicated region for block: B:11:0x002d A[RETURN] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:12:0x002e). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                    /*
                        r4 = this;
                        kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r1 = r4.q
                        r2 = 1
                        if (r1 == 0) goto L19
                        if (r1 != r2) goto L11
                        java.lang.Object r1 = r4.r
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                        kotlin.ResultKt.b(r5)
                        goto L2e
                    L11:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r0)
                        throw r5
                    L19:
                        kotlin.ResultKt.b(r5)
                        java.lang.Object r5 = r4.r
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
                        r1 = r5
                    L21:
                        androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.ui.input.pointer.PointerEventPass.d
                        r4.r = r1
                        r4.q = r2
                        java.lang.Object r5 = r1.x1(r5, r4)
                        if (r5 != r0) goto L2e
                        return r0
                    L2e:
                        androidx.compose.ui.input.pointer.PointerEvent r5 = (androidx.compose.ui.input.pointer.PointerEvent) r5
                        boolean r5 = androidx.compose.foundation.text.selection.SelectionGesturesKt.h(r5)
                        r5 = r5 ^ r2
                        java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                        kotlin.jvm.functions.Function1 r3 = r4.s
                        r3.invoke(r5)
                        goto L21
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                Object objC1 = pointerInputScope.c1(new AnonymousClass1(function1, null), continuation);
                return objC1 == CoroutineSingletons.d ? objC1 : Unit.f24250a;
            }
        });
    }
}
