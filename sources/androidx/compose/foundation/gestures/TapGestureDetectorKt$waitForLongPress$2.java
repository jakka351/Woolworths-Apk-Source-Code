package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import com.google.android.gms.wallet.WalletConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2", f = "TapGestureDetector.kt", l = {386, WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class TapGestureDetectorKt$waitForLongPress$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ PointerEventPass s;
    public final /* synthetic */ Ref.ObjectRef t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$waitForLongPress$2(PointerEventPass pointerEventPass, Ref.ObjectRef objectRef, Continuation continuation) {
        super(2, continuation);
        this.s = pointerEventPass;
        this.t = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TapGestureDetectorKt$waitForLongPress$2 tapGestureDetectorKt$waitForLongPress$2 = new TapGestureDetectorKt$waitForLongPress$2(this.s, this.t, continuation);
        tapGestureDetectorKt$waitForLongPress$2.r = obj;
        return tapGestureDetectorKt$waitForLongPress$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TapGestureDetectorKt$waitForLongPress$2) create((AwaitPointerEventScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (androidx.compose.foundation.gestures.TapGestureDetector_androidKt.a(r8) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        r5.d = androidx.compose.foundation.gestures.LongPressResult.Success.f893a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        r8 = ((java.util.Collection) r9).size();
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        if (r10 >= r8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r9.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        if (r11.b() != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
    
        if (androidx.compose.ui.input.pointer.PointerEventKt.d(r11, r2.a(), r2.n1()) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
    
        r5.d = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0095, code lost:
    
        r8 = androidx.compose.ui.input.pointer.PointerEventPass.f;
        r16.r = r2;
        r16.q = 2;
        r8 = r2.x1(r8, r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009f, code lost:
    
        if (r8 != r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bc, code lost:
    
        r5.d = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[PHI: r2 r8
  0x0044: PHI (r2v3 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
  (r2v6 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
  (r2v9 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
 binds: [B:12:0x0041, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x0044: PHI (r8v0 java.lang.Object) = (r8v9 java.lang.Object), (r8v13 java.lang.Object) binds: [B:12:0x0041, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x009f -> B:33:0x00a2). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.q
            androidx.compose.foundation.gestures.LongPressResult$Canceled r3 = androidx.compose.foundation.gestures.LongPressResult.Canceled.f891a
            r4 = 2
            kotlin.jvm.internal.Ref$ObjectRef r5 = r0.t
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L30
            if (r2 == r7) goto L26
            if (r2 != r4) goto L1e
            java.lang.Object r2 = r0.r
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r2
            kotlin.ResultKt.b(r17)
            r8 = r17
            goto La2
        L1e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L26:
            java.lang.Object r2 = r0.r
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r2
            kotlin.ResultKt.b(r17)
            r8 = r17
            goto L44
        L30:
            kotlin.ResultKt.b(r17)
            java.lang.Object r2 = r0.r
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r2
        L37:
            r0.r = r2
            r0.q = r7
            androidx.compose.ui.input.pointer.PointerEventPass r8 = r0.s
            java.lang.Object r8 = r2.x1(r8, r0)
            if (r8 != r1) goto L44
            goto La1
        L44:
            androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.ui.input.pointer.PointerEvent) r8
            java.lang.Object r9 = r8.f1851a
            r10 = r9
            java.util.Collection r10 = (java.util.Collection) r10
            int r10 = r10.size()
            r11 = r6
        L50:
            if (r11 >= r10) goto Lc5
            java.lang.Object r12 = r9.get(r11)
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
            boolean r12 = androidx.compose.ui.input.pointer.PointerEventKt.b(r12)
            if (r12 != 0) goto Lc2
            boolean r8 = androidx.compose.foundation.gestures.TapGestureDetector_androidKt.a(r8)
            if (r8 == 0) goto L6a
            androidx.compose.foundation.gestures.LongPressResult$Success r1 = androidx.compose.foundation.gestures.LongPressResult.Success.f893a
            r5.d = r1
            goto Ld2
        L6a:
            r8 = r9
            java.util.Collection r8 = (java.util.Collection) r8
            int r8 = r8.size()
            r10 = r6
        L72:
            if (r10 >= r8) goto L95
            java.lang.Object r11 = r9.get(r10)
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
            boolean r12 = r11.b()
            if (r12 != 0) goto L92
            long r12 = r2.a()
            long r14 = r2.n1()
            boolean r11 = androidx.compose.ui.input.pointer.PointerEventKt.d(r11, r12, r14)
            if (r11 == 0) goto L8f
            goto L92
        L8f:
            int r10 = r10 + 1
            goto L72
        L92:
            r5.d = r3
            goto Ld2
        L95:
            androidx.compose.ui.input.pointer.PointerEventPass r8 = androidx.compose.ui.input.pointer.PointerEventPass.f
            r0.r = r2
            r0.q = r4
            java.lang.Object r8 = r2.x1(r8, r0)
            if (r8 != r1) goto La2
        La1:
            return r1
        La2:
            androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.ui.input.pointer.PointerEvent) r8
            java.lang.Object r8 = r8.f1851a
            r9 = r8
            java.util.Collection r9 = (java.util.Collection) r9
            int r9 = r9.size()
            r10 = r6
        Lae:
            if (r10 >= r9) goto L37
            java.lang.Object r11 = r8.get(r10)
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
            boolean r11 = r11.b()
            if (r11 == 0) goto Lbf
            r5.d = r3
            goto Ld2
        Lbf:
            int r10 = r10 + 1
            goto Lae
        Lc2:
            int r11 = r11 + 1
            goto L50
        Lc5:
            androidx.compose.foundation.gestures.LongPressResult$Released r1 = new androidx.compose.foundation.gestures.LongPressResult$Released
            java.lang.Object r2 = r9.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r2 = (androidx.compose.ui.input.pointer.PointerInputChange) r2
            r1.<init>(r2)
            r5.d = r1
        Ld2:
            kotlin.Unit r1 = kotlin.Unit.f24250a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
