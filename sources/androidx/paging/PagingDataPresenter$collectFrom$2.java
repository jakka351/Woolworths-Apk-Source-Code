package androidx.paging;

import androidx.paging.PagingDataPresenter;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PagingDataPresenter$collectFrom$2", f = "PagingDataPresenter.kt", l = {121}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PagingDataPresenter$collectFrom$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ PagingDataPresenter q;
    public final /* synthetic */ PagingData r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagingDataPresenter$collectFrom$2(PagingDataPresenter pagingDataPresenter, PagingData pagingData, Continuation continuation) {
        super(1, continuation);
        this.q = pagingDataPresenter;
        this.r = pagingData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PagingDataPresenter$collectFrom$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((PagingDataPresenter$collectFrom$2) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final PagingData pagingData = this.r;
            UiReceiver uiReceiver = pagingData.b;
            final PagingDataPresenter pagingDataPresenter = this.q;
            UiReceiver uiReceiver2 = pagingDataPresenter.c;
            pagingDataPresenter.c = uiReceiver;
            if (uiReceiver2 instanceof PagingDataPresenter.InitialUiReceiver) {
                PagingDataPresenter.InitialUiReceiver initialUiReceiver = (PagingDataPresenter.InitialUiReceiver) uiReceiver2;
                if (initialUiReceiver.f3580a) {
                    uiReceiver.g();
                }
                if (initialUiReceiver.b) {
                    uiReceiver.h();
                }
            }
            Flow flow = pagingData.f3573a;
            FlowCollector flowCollector = new FlowCollector() { // from class: androidx.paging.PagingDataPresenter$collectFrom$2.1

                @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.paging.PagingDataPresenter$collectFrom$2$1$2", f = "PagingDataPresenter.kt", l = {141, 158, 170, 173, 225, 228}, m = "invokeSuspend")
                @SourceDebugExtension
                /* renamed from: androidx.paging.PagingDataPresenter$collectFrom$2$1$2, reason: invalid class name */
                final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public int p;
                    public final /* synthetic */ PageEvent q;
                    public final /* synthetic */ PagingDataPresenter r;
                    public final /* synthetic */ PagingData s;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(PageEvent pageEvent, PagingDataPresenter pagingDataPresenter, PagingData pagingData, Continuation continuation) {
                        super(2, continuation);
                        this.q = pageEvent;
                        this.r = pagingDataPresenter;
                        this.s = pagingData;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new AnonymousClass2(this.q, this.r, this.s, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:14:0x0069, code lost:
                    
                        if (androidx.paging.PagingDataPresenter.a(r3, r4, 0, 0, false, null, null, r10, r12) == r0) goto L83;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:21:0x0094, code lost:
                    
                        if (androidx.paging.PagingDataPresenter.a(r1, r2, r3, r4, true, r6, r7, r8, r9) == r0) goto L83;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c6, code lost:
                    
                        if (r13.d(r1, r12) != r0) goto L32;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:82:0x01af, code lost:
                    
                        if (r13.d(r1, r12) != r0) goto L84;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
                    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5 A[PHI: r9
  0x00b5: PHI (r9v4 androidx.paging.PagingDataPresenter$collectFrom$2$1$2) = 
  (r9v0 androidx.paging.PagingDataPresenter$collectFrom$2$1$2)
  (r9v0 androidx.paging.PagingDataPresenter$collectFrom$2$1$2)
  (r9v5 androidx.paging.PagingDataPresenter$collectFrom$2$1$2)
 binds: [B:25:0x00a8, B:27:0x00b1, B:9:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Removed duplicated region for block: B:69:0x0166  */
                    /* JADX WARN: Removed duplicated region for block: B:74:0x0180  */
                    /* JADX WARN: Removed duplicated region for block: B:81:0x019e A[PHI: r9
  0x019e: PHI (r9v8 androidx.paging.PagingDataPresenter$collectFrom$2$1$2) = 
  (r9v0 androidx.paging.PagingDataPresenter$collectFrom$2$1$2)
  (r9v0 androidx.paging.PagingDataPresenter$collectFrom$2$1$2)
  (r9v9 androidx.paging.PagingDataPresenter$collectFrom$2$1$2)
 binds: [B:77:0x0192, B:79:0x019b, B:7:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Removed duplicated region for block: B:90:0x01e8  */
                    /* JADX WARN: Removed duplicated region for block: B:94:0x01f0  */
                    /* JADX WARN: Removed duplicated region for block: B:97:0x01fe A[LOOP:0: B:95:0x01f8->B:97:0x01fe, LOOP_END] */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                        /*
                            Method dump skipped, instructions count: 542
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PagingDataPresenter$collectFrom$2.AnonymousClass1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) throws Throwable {
                    PageEvent pageEvent = (PageEvent) obj2;
                    if (PagingLogger.a(2)) {
                        PagingLogger.b(2, "Collected " + pageEvent);
                    }
                    PagingDataPresenter pagingDataPresenter2 = pagingDataPresenter;
                    Object objF = BuildersKt.f(pagingDataPresenter2.f3579a, new AnonymousClass2(pageEvent, pagingDataPresenter2, pagingData, null), continuation);
                    return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
                }
            };
            this.p = 1;
            if (flow.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
