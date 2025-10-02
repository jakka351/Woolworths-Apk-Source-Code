package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.snapshots.ObserverHandle;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", l = {142, 146, 169}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 extends SuspendLambda implements Function2<FlowCollector<Object>, Continuation<? super Unit>, Object> {
    public MutableScatterSet p;
    public Function1 q;
    public Channel r;
    public ObserverHandle s;
    public Object t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ Function0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.w = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 snapshotStateKt__SnapshotFlowKt$snapshotFlow$1 = new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(this.w, continuation);
        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.v = obj;
        return snapshotStateKt__SnapshotFlowKt$snapshotFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        return CoroutineSingletons.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x018a, code lost:
    
        r3 = 3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cd A[Catch: all -> 0x002d, PHI: r2 r3 r5 r7 r8 r9 r10 r11 r12
  0x00cd: PHI (r2v8 java.lang.Object) = (r2v13 java.lang.Object), (r2v16 java.lang.Object) binds: [B:30:0x00c9, B:16:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x00cd: PHI (r3v1 kotlin.jvm.functions.Function0) = (r3v19 kotlin.jvm.functions.Function0), (r3v0 kotlin.jvm.functions.Function0) binds: [B:30:0x00c9, B:16:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x00cd: PHI (r5v1 int) = (r5v13 int), (r5v0 int) binds: [B:30:0x00c9, B:16:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x00cd: PHI (r7v3 androidx.compose.runtime.snapshots.ObserverHandle) = (r7v4 androidx.compose.runtime.snapshots.ObserverHandle), (r7v7 androidx.compose.runtime.snapshots.ObserverHandle) binds: [B:30:0x00c9, B:16:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x00cd: PHI (r8v2 ??) = (r8v11 ??), (r8v12 ??) binds: [B:30:0x00c9, B:16:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x00cd: PHI (r9v1 kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit>) = 
  (r9v2 kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit>)
  (r9v7 kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit>)
 binds: [B:30:0x00c9, B:16:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x00cd: PHI (r10v1 androidx.collection.MutableScatterSet) = (r10v2 androidx.collection.MutableScatterSet), (r10v5 androidx.collection.MutableScatterSet) binds: [B:30:0x00c9, B:16:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x00cd: PHI (r11v2 kotlinx.coroutines.flow.FlowCollector) = (r11v3 kotlinx.coroutines.flow.FlowCollector), (r11v8 kotlinx.coroutines.flow.FlowCollector) binds: [B:30:0x00c9, B:16:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x00cd: PHI (r12v1 java.lang.Object) = (r12v8 java.lang.Object), (r12v9 java.lang.Object) binds: [B:30:0x00c9, B:16:0x004b] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {all -> 0x002d, blocks: (B:8:0x0023, B:29:0x00b4, B:32:0x00cd, B:34:0x00d2, B:37:0x00e0, B:39:0x00f5, B:41:0x0103, B:43:0x010d, B:58:0x0142, B:61:0x0151, B:65:0x0167, B:67:0x0170, B:78:0x019b, B:79:0x019e, B:47:0x011e, B:53:0x0133, B:15:0x0048, B:18:0x005f, B:21:0x0087, B:25:0x009a, B:86:0x01ae, B:87:0x01b1, B:62:0x015c, B:64:0x0164, B:76:0x0197, B:77:0x019a, B:63:0x0160, B:22:0x008f, B:24:0x0097, B:84:0x01aa, B:85:0x01ad, B:23:0x0093), top: B:97:0x000b, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2 A[Catch: all -> 0x002d, TryCatch #4 {all -> 0x002d, blocks: (B:8:0x0023, B:29:0x00b4, B:32:0x00cd, B:34:0x00d2, B:37:0x00e0, B:39:0x00f5, B:41:0x0103, B:43:0x010d, B:58:0x0142, B:61:0x0151, B:65:0x0167, B:67:0x0170, B:78:0x019b, B:79:0x019e, B:47:0x011e, B:53:0x0133, B:15:0x0048, B:18:0x005f, B:21:0x0087, B:25:0x009a, B:86:0x01ae, B:87:0x01b1, B:62:0x015c, B:64:0x0164, B:76:0x0197, B:77:0x019a, B:63:0x0160, B:22:0x008f, B:24:0x0097, B:84:0x01aa, B:85:0x01ad, B:23:0x0093), top: B:97:0x000b, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0151 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #4 {all -> 0x002d, blocks: (B:8:0x0023, B:29:0x00b4, B:32:0x00cd, B:34:0x00d2, B:37:0x00e0, B:39:0x00f5, B:41:0x0103, B:43:0x010d, B:58:0x0142, B:61:0x0151, B:65:0x0167, B:67:0x0170, B:78:0x019b, B:79:0x019e, B:47:0x011e, B:53:0x0133, B:15:0x0048, B:18:0x005f, B:21:0x0087, B:25:0x009a, B:86:0x01ae, B:87:0x01b1, B:62:0x015c, B:64:0x0164, B:76:0x0197, B:77:0x019a, B:63:0x0160, B:22:0x008f, B:24:0x0097, B:84:0x01aa, B:85:0x01ad, B:23:0x0093), top: B:97:0x000b, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019f A[LOOP:0: B:33:0x00d0->B:80:0x019f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014f A[EDGE_INSN: B:99:0x014f->B:60:0x014f BREAK  A[LOOP:0: B:33:0x00d0->B:80:0x019f], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [kotlinx.coroutines.channels.Channel, kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [kotlinx.coroutines.channels.Channel] */
    /* JADX WARN: Type inference failed for: r8v7, types: [kotlinx.coroutines.channels.Channel] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0189 -> B:71:0x018a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
