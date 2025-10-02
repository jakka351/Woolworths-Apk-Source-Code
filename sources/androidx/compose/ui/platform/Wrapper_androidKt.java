package androidx.compose.ui.platform;

import android.view.ViewGroup;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Wrapper_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f1994a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.runtime.Composition a(androidx.compose.ui.platform.AbstractComposeView r6, androidx.compose.runtime.CompositionContext r7, androidx.compose.runtime.internal.ComposableLambdaImpl r8) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = androidx.compose.ui.platform.GlobalSnapshotManager.f1969a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L3f
            r0 = 6
            kotlinx.coroutines.channels.BufferedChannel r0 = kotlinx.coroutines.channels.ChannelKt.a(r2, r0, r3)
            kotlin.Lazy r2 = androidx.compose.ui.platform.AndroidUiDispatcher.p
            java.lang.Object r2 = r2.getD()
            kotlin.coroutines.CoroutineContext r2 = (kotlin.coroutines.CoroutineContext) r2
            kotlinx.coroutines.internal.ContextScope r2 = kotlinx.coroutines.CoroutineScopeKt.a(r2)
            androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1 r4 = new androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1
            r4.<init>(r0, r3)
            r5 = 3
            kotlinx.coroutines.BuildersKt.c(r2, r3, r3, r4, r5)
            androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$2 r2 = new androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$2
            r2.<init>()
            java.lang.Object r0 = androidx.compose.runtime.snapshots.SnapshotKt.c
            monitor-enter(r0)
            java.lang.Object r4 = androidx.compose.runtime.snapshots.SnapshotKt.i     // Catch: java.lang.Throwable -> L3c
            java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.Throwable -> L3c
            java.util.ArrayList r2 = kotlin.collections.CollectionsKt.d0(r2, r4)     // Catch: java.lang.Throwable -> L3c
            androidx.compose.runtime.snapshots.SnapshotKt.i = r2     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r0)
            androidx.compose.runtime.snapshots.SnapshotKt.a()
            goto L3f
        L3c:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L3f:
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L52
            android.view.View r0 = r6.getChildAt(r1)
            boolean r1 = r0 instanceof androidx.compose.ui.platform.AndroidComposeView
            if (r1 == 0) goto L50
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            goto L56
        L50:
            r0 = r3
            goto L56
        L52:
            r6.removeAllViews()
            goto L50
        L56:
            if (r0 != 0) goto L6e
            androidx.compose.ui.platform.AndroidComposeView r0 = new androidx.compose.ui.platform.AndroidComposeView
            android.content.Context r1 = r6.getContext()
            kotlin.coroutines.CoroutineContext r2 = r7.getW()
            r0.<init>(r1, r2)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r2 = androidx.compose.ui.platform.Wrapper_androidKt.f1994a
            r6.addView(r1, r2)
        L6e:
            kotlin.jvm.functions.Function1 r6 = androidx.compose.ui.platform.InspectableValueKt.f1971a
            android.view.View r6 = r0.getView()
            r1 = 2131364081(0x7f0a08f1, float:1.8347989E38)
            java.lang.Object r6 = r6.getTag(r1)
            boolean r2 = r6 instanceof androidx.compose.ui.platform.WrappedComposition
            if (r2 == 0) goto L82
            r3 = r6
            androidx.compose.ui.platform.WrappedComposition r3 = (androidx.compose.ui.platform.WrappedComposition) r3
        L82:
            if (r3 != 0) goto L9e
            androidx.compose.ui.platform.WrappedComposition r3 = new androidx.compose.ui.platform.WrappedComposition
            androidx.compose.ui.node.UiApplier r6 = new androidx.compose.ui.node.UiApplier
            androidx.compose.ui.node.LayoutNode r2 = r0.getRoot()
            r6.<init>(r2)
            androidx.compose.runtime.CompositionImpl r2 = new androidx.compose.runtime.CompositionImpl
            r2.<init>(r7, r6)
            r3.<init>(r0, r2)
            android.view.View r6 = r0.getView()
            r6.setTag(r1, r3)
        L9e:
            r3.d(r8)
            kotlin.coroutines.CoroutineContext r6 = r0.getCoroutineContext()
            kotlin.coroutines.CoroutineContext r8 = r7.getW()
            boolean r6 = kotlin.jvm.internal.Intrinsics.c(r6, r8)
            if (r6 != 0) goto Lb6
            kotlin.coroutines.CoroutineContext r6 = r7.getW()
            r0.setCoroutineContext(r6)
        Lb6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.Wrapper_androidKt.a(androidx.compose.ui.platform.AbstractComposeView, androidx.compose.runtime.CompositionContext, androidx.compose.runtime.internal.ComposableLambdaImpl):androidx.compose.runtime.Composition");
    }
}
