package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", l = {114, 121}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 extends SuspendLambda implements Function2<FlowCollector<? super Float>, Continuation<? super Unit>, Object> {
    public ChannelIterator p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ ContentResolver s;
    public final /* synthetic */ Uri t;
    public final /* synthetic */ WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 u;
    public final /* synthetic */ BufferedChannel v;
    public final /* synthetic */ Context w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(ContentResolver contentResolver, Uri uri, WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1, BufferedChannel bufferedChannel, Context context, Continuation continuation) {
        super(2, continuation);
        this.s = contentResolver;
        this.t = uri;
        this.u = windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1;
        this.v = bufferedChannel;
        this.w = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 = new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(this.s, this.t, this.u, this.v, this.w, continuation);
        windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.r = obj;
        return windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        if (r6.emit(r7, r10) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0016, B:18:0x0042, B:22:0x0052, B:24:0x005a, B:14:0x002b, B:17:0x003c), top: B:31:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007a -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r10.q
            r2 = 2
            r3 = 1
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r4 = r10.u
            android.content.ContentResolver r5 = r10.s
            if (r1 == 0) goto L2f
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1d
            kotlinx.coroutines.channels.ChannelIterator r1 = r10.p
            java.lang.Object r6 = r10.r
            kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
            kotlin.ResultKt.b(r11)     // Catch: java.lang.Throwable -> L1b
        L19:
            r11 = r6
            goto L42
        L1b:
            r11 = move-exception
            goto L83
        L1d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L25:
            kotlinx.coroutines.channels.ChannelIterator r1 = r10.p
            java.lang.Object r6 = r10.r
            kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
            kotlin.ResultKt.b(r11)     // Catch: java.lang.Throwable -> L1b
            goto L52
        L2f:
            kotlin.ResultKt.b(r11)
            java.lang.Object r11 = r10.r
            kotlinx.coroutines.flow.FlowCollector r11 = (kotlinx.coroutines.flow.FlowCollector) r11
            android.net.Uri r1 = r10.t
            r6 = 0
            r5.registerContentObserver(r1, r6, r4)
            kotlinx.coroutines.channels.BufferedChannel r1 = r10.v     // Catch: java.lang.Throwable -> L1b
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1b
        L42:
            r10.r = r11     // Catch: java.lang.Throwable -> L1b
            r10.p = r1     // Catch: java.lang.Throwable -> L1b
            r10.q = r3     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r6 = r1.b(r10)     // Catch: java.lang.Throwable -> L1b
            if (r6 != r0) goto L4f
            goto L7c
        L4f:
            r9 = r6
            r6 = r11
            r11 = r9
        L52:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L1b
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L1b
            if (r11 == 0) goto L7d
            r1.next()     // Catch: java.lang.Throwable -> L1b
            android.content.Context r11 = r10.w     // Catch: java.lang.Throwable -> L1b
            android.content.ContentResolver r11 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r7 = "animator_duration_scale"
            r8 = 1065353216(0x3f800000, float:1.0)
            float r11 = android.provider.Settings.Global.getFloat(r11, r7, r8)     // Catch: java.lang.Throwable -> L1b
            java.lang.Float r7 = new java.lang.Float     // Catch: java.lang.Throwable -> L1b
            r7.<init>(r11)     // Catch: java.lang.Throwable -> L1b
            r10.r = r6     // Catch: java.lang.Throwable -> L1b
            r10.p = r1     // Catch: java.lang.Throwable -> L1b
            r10.q = r2     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r11 = r6.emit(r7, r10)     // Catch: java.lang.Throwable -> L1b
            if (r11 != r0) goto L19
        L7c:
            return r0
        L7d:
            r5.unregisterContentObserver(r4)
            kotlin.Unit r11 = kotlin.Unit.f24250a
            return r11
        L83:
            r5.unregisterContentObserver(r4)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
