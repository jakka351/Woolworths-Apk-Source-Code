package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", l = {388}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ Ref.ObjectRef r;
    public final /* synthetic */ Recomposer s;
    public final /* synthetic */ LifecycleOwner t;
    public final /* synthetic */ WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 u;
    public final /* synthetic */ View v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(Ref.ObjectRef objectRef, Recomposer recomposer, LifecycleOwner lifecycleOwner, WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2, View view, Continuation continuation) {
        super(2, continuation);
        this.r = objectRef;
        this.s = recomposer;
        this.t = lifecycleOwner;
        this.u = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
        this.v = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 = new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(this.r, this.s, this.t, this.u, this.v, continuation);
        windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1.q = obj;
        return windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r10.p
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r2 = r10.u
            androidx.lifecycle.LifecycleOwner r3 = r10.t
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L20
            if (r1 != r4) goto L18
            java.lang.Object r0 = r10.q
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            kotlin.ResultKt.b(r11)     // Catch: java.lang.Throwable -> L16
            goto L6b
        L16:
            r11 = move-exception
            goto L7e
        L18:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L20:
            kotlin.ResultKt.b(r11)
            java.lang.Object r11 = r10.q
            kotlinx.coroutines.CoroutineScope r11 = (kotlinx.coroutines.CoroutineScope) r11
            kotlin.jvm.internal.Ref$ObjectRef r1 = r10.r     // Catch: java.lang.Throwable -> L59
            java.lang.Object r1 = r1.d     // Catch: java.lang.Throwable -> L59
            androidx.compose.ui.platform.MotionDurationScaleImpl r1 = (androidx.compose.ui.platform.MotionDurationScaleImpl) r1     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto L5c
            android.view.View r6 = r10.v     // Catch: java.lang.Throwable -> L59
            android.content.Context r6 = r6.getContext()     // Catch: java.lang.Throwable -> L59
            android.content.Context r6 = r6.getApplicationContext()     // Catch: java.lang.Throwable -> L59
            kotlinx.coroutines.flow.StateFlow r6 = androidx.compose.ui.platform.WindowRecomposer_androidKt.a(r6)     // Catch: java.lang.Throwable -> L59
            java.lang.Object r7 = r6.getValue()     // Catch: java.lang.Throwable -> L59
            java.lang.Number r7 = (java.lang.Number) r7     // Catch: java.lang.Throwable -> L59
            float r7 = r7.floatValue()     // Catch: java.lang.Throwable -> L59
            androidx.compose.runtime.MutableFloatState r8 = r1.d     // Catch: java.lang.Throwable -> L59
            androidx.compose.runtime.SnapshotMutableFloatStateImpl r8 = (androidx.compose.runtime.SnapshotMutableFloatStateImpl) r8     // Catch: java.lang.Throwable -> L59
            r8.p(r7)     // Catch: java.lang.Throwable -> L59
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1 r7 = new androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1     // Catch: java.lang.Throwable -> L59
            r7.<init>(r6, r1, r5)     // Catch: java.lang.Throwable -> L59
            r1 = 3
            kotlinx.coroutines.Job r11 = kotlinx.coroutines.BuildersKt.c(r11, r5, r5, r7, r1)     // Catch: java.lang.Throwable -> L59
            goto L5d
        L59:
            r11 = move-exception
            r0 = r5
            goto L7e
        L5c:
            r11 = r5
        L5d:
            androidx.compose.runtime.Recomposer r1 = r10.s     // Catch: java.lang.Throwable -> L7a
            r10.q = r11     // Catch: java.lang.Throwable -> L7a
            r10.p = r4     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r1 = r1.J(r10)     // Catch: java.lang.Throwable -> L7a
            if (r1 != r0) goto L6a
            return r0
        L6a:
            r0 = r11
        L6b:
            if (r0 == 0) goto L70
            r0.cancel(r5)
        L70:
            androidx.lifecycle.Lifecycle r11 = r3.getD()
            r11.c(r2)
            kotlin.Unit r11 = kotlin.Unit.f24250a
            return r11
        L7a:
            r0 = move-exception
            r9 = r0
            r0 = r11
            r11 = r9
        L7e:
            if (r0 == 0) goto L83
            r0.cancel(r5)
        L83:
            androidx.lifecycle.Lifecycle r0 = r3.getD()
            r0.c(r2)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
