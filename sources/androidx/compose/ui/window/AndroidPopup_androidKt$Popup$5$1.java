package androidx.compose.ui.window;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1", f = "AndroidPopup.android.kt", l = {371}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AndroidPopup_androidKt$Popup$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ PopupLayout r;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function1<Long, Unit> {
        public static final AnonymousClass1 h = new AnonymousClass1(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            ((Number) obj).longValue();
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$5$1(PopupLayout popupLayout, Continuation continuation) {
        super(2, continuation);
        this.r = popupLayout;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AndroidPopup_androidKt$Popup$5$1 androidPopup_androidKt$Popup$5$1 = new AndroidPopup_androidKt$Popup$5$1(this.r, continuation);
        androidPopup_androidKt$Popup$5$1.q = obj;
        return androidPopup_androidKt$Popup$5$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AndroidPopup_androidKt$Popup$5$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Path cross not found for [B:16:0x0046, B:18:0x004a], limit reached: 21 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0031 -> B:14:0x0034). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r8.p
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r1 = r8.q
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.b(r9)
            goto L34
        L11:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L19:
            kotlin.ResultKt.b(r9)
            java.lang.Object r9 = r8.q
            kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
            r1 = r9
        L21:
            boolean r9 = kotlinx.coroutines.CoroutineScopeKt.d(r1)
            if (r9 == 0) goto L4e
            r8.q = r1
            r8.p = r2
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1$1 r9 = androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1.AnonymousClass1.h
            java.lang.Object r9 = androidx.compose.ui.platform.InfiniteAnimationPolicyKt.a(r9, r8)
            if (r9 != r0) goto L34
            return r0
        L34:
            androidx.compose.ui.window.PopupLayout r9 = r8.r
            int[] r3 = r9.D
            r4 = 0
            r5 = r3[r4]
            r6 = r3[r2]
            android.view.View r7 = r9.o
            r7.getLocationOnScreen(r3)
            r4 = r3[r4]
            if (r5 != r4) goto L4a
            r3 = r3[r2]
            if (r6 == r3) goto L21
        L4a:
            r9.l()
            goto L21
        L4e:
            kotlin.Unit r9 = kotlin.Unit.f24250a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
