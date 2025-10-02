package androidx.window.layout;

import android.app.Activity;
import androidx.core.util.Consumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Landroidx/window/layout/WindowLayoutInfo;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", l = {54, 55}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class WindowInfoTrackerImpl$windowLayoutInfo$1 extends SuspendLambda implements Function2<FlowCollector<? super WindowLayoutInfo>, Continuation<? super Unit>, Object> {
    public Consumer p;
    public ChannelIterator q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ WindowInfoTrackerImpl t;
    public final /* synthetic */ Activity u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoTrackerImpl$windowLayoutInfo$1(WindowInfoTrackerImpl windowInfoTrackerImpl, Activity activity, Continuation continuation) {
        super(2, continuation);
        this.t = windowInfoTrackerImpl;
        this.u = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WindowInfoTrackerImpl$windowLayoutInfo$1 windowInfoTrackerImpl$windowLayoutInfo$1 = new WindowInfoTrackerImpl$windowLayoutInfo$1(this.t, this.u, continuation);
        windowInfoTrackerImpl$windowLayoutInfo$1.s = obj;
        return windowInfoTrackerImpl$windowLayoutInfo$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WindowInfoTrackerImpl$windowLayoutInfo$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        if (r6.emit(r10, r9) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071 A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #0 {all -> 0x001d, blocks: (B:7:0x0018, B:18:0x0057, B:22:0x0069, B:24:0x0071, B:14:0x002f, B:17:0x0053), top: B:31:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0083 -> B:8:0x001b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            androidx.window.layout.WindowInfoTrackerImpl r0 = r9.t
            androidx.window.layout.WindowBackend r0 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r9.r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 == r4) goto L27
            if (r2 != r3) goto L1f
            kotlinx.coroutines.channels.ChannelIterator r2 = r9.q
            androidx.core.util.Consumer r5 = r9.p
            java.lang.Object r6 = r9.s
            kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
            kotlin.ResultKt.b(r10)     // Catch: java.lang.Throwable -> L1d
        L1b:
            r10 = r6
            goto L57
        L1d:
            r10 = move-exception
            goto L8c
        L1f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L27:
            kotlinx.coroutines.channels.ChannelIterator r2 = r9.q
            androidx.core.util.Consumer r5 = r9.p
            java.lang.Object r6 = r9.s
            kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
            kotlin.ResultKt.b(r10)     // Catch: java.lang.Throwable -> L1d
            goto L69
        L33:
            kotlin.ResultKt.b(r10)
            java.lang.Object r10 = r9.s
            kotlinx.coroutines.flow.FlowCollector r10 = (kotlinx.coroutines.flow.FlowCollector) r10
            kotlinx.coroutines.channels.BufferOverflow r2 = kotlinx.coroutines.channels.BufferOverflow.e
            r5 = 4
            r6 = 10
            kotlinx.coroutines.channels.BufferedChannel r2 = kotlinx.coroutines.channels.ChannelKt.a(r6, r5, r2)
            androidx.window.layout.a r5 = new androidx.window.layout.a
            r5.<init>(r2)
            androidx.arch.core.executor.a r6 = new androidx.arch.core.executor.a
            r7 = 2
            r6.<init>(r7)
            android.app.Activity r7 = r9.u
            r0.a(r7, r6, r5)
            kotlinx.coroutines.channels.ChannelIterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L1d
        L57:
            r9.s = r10     // Catch: java.lang.Throwable -> L1d
            r9.p = r5     // Catch: java.lang.Throwable -> L1d
            r9.q = r2     // Catch: java.lang.Throwable -> L1d
            r9.r = r4     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r6 = r2.b(r9)     // Catch: java.lang.Throwable -> L1d
            if (r6 != r1) goto L66
            goto L85
        L66:
            r8 = r6
            r6 = r10
            r10 = r8
        L69:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L1d
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L1d
            if (r10 == 0) goto L86
            java.lang.Object r10 = r2.next()     // Catch: java.lang.Throwable -> L1d
            androidx.window.layout.WindowLayoutInfo r10 = (androidx.window.layout.WindowLayoutInfo) r10     // Catch: java.lang.Throwable -> L1d
            r9.s = r6     // Catch: java.lang.Throwable -> L1d
            r9.p = r5     // Catch: java.lang.Throwable -> L1d
            r9.q = r2     // Catch: java.lang.Throwable -> L1d
            r9.r = r3     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r10 = r6.emit(r10, r9)     // Catch: java.lang.Throwable -> L1d
            if (r10 != r1) goto L1b
        L85:
            return r1
        L86:
            r0.b(r5)
            kotlin.Unit r10 = kotlin.Unit.f24250a
            return r10
        L8c:
            r0.b(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
