package coil3.compose;

import coil3.compose.AsyncImagePainter;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil3.compose.AsyncImagePainter$onRemembered$1$1", f = "AsyncImagePainter.kt", l = {232}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes.dex */
final class AsyncImagePainter$onRemembered$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ AsyncImagePainter q;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcoil3/compose/AsyncImagePainter$State;", "input", "Lcoil3/compose/AsyncImagePainter$Input;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "coil3.compose.AsyncImagePainter$onRemembered$1$1$2", f = "AsyncImagePainter.kt", l = {225, 229}, m = "invokeSuspend")
    /* renamed from: coil3.compose.AsyncImagePainter$onRemembered$1$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<AsyncImagePainter.Input, Continuation<? super AsyncImagePainter.State>, Object> {
        public int p;
        public /* synthetic */ Object q;
        public final /* synthetic */ AsyncImagePainter r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AsyncImagePainter asyncImagePainter, Continuation continuation) {
            super(2, continuation);
            this.r = asyncImagePainter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.r, continuation);
            anonymousClass2.q = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((AsyncImagePainter.Input) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        
            if (r6 == r0) goto L19;
         */
        /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r1 = r5.p
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r0 = r5.q
                coil3.compose.AsyncImagePainter r0 = (coil3.compose.AsyncImagePainter) r0
                kotlin.ResultKt.b(r6)
                goto L56
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                kotlin.ResultKt.b(r6)
                goto L3e
            L20:
                kotlin.ResultKt.b(r6)
                java.lang.Object r6 = r5.q
                coil3.compose.AsyncImagePainter$Input r6 = (coil3.compose.AsyncImagePainter.Input) r6
                coil3.compose.AsyncImagePainter r1 = r5.r
                coil3.compose.AsyncImagePreviewHandler r4 = r1.t
                if (r4 == 0) goto L41
                coil3.request.ImageRequest r2 = r6.b
                coil3.request.ImageRequest r1 = coil3.compose.AsyncImagePainter.j(r1, r2, r3)
                coil3.ImageLoader r6 = r6.f13058a
                r5.p = r3
                java.lang.Object r6 = r4.a(r6, r1, r5)
                if (r6 != r0) goto L3e
                goto L54
            L3e:
                coil3.compose.AsyncImagePainter$State r6 = (coil3.compose.AsyncImagePainter.State) r6
                return r6
            L41:
                coil3.request.ImageRequest r3 = r6.b
                r4 = 0
                coil3.request.ImageRequest r3 = coil3.compose.AsyncImagePainter.j(r1, r3, r4)
                coil3.ImageLoader r6 = r6.f13058a
                r5.q = r1
                r5.p = r2
                java.lang.Object r6 = r6.a(r3, r5)
                if (r6 != r0) goto L55
            L54:
                return r0
            L55:
                r0 = r1
            L56:
                coil3.request.ImageResult r6 = (coil3.request.ImageResult) r6
                r0.getClass()
                boolean r1 = r6 instanceof coil3.request.SuccessResult
                if (r1 == 0) goto L73
                coil3.compose.AsyncImagePainter$State$Success r1 = new coil3.compose.AsyncImagePainter$State$Success
                coil3.request.SuccessResult r6 = (coil3.request.SuccessResult) r6
                coil3.Image r2 = r6.f13146a
                coil3.request.ImageRequest r3 = r6.b
                android.content.Context r3 = r3.f13137a
                int r0 = r0.s
                androidx.compose.ui.graphics.painter.Painter r0 = coil3.compose.ImagePainter_androidKt.a(r2, r3, r0)
                r1.<init>(r0, r6)
                return r1
            L73:
                boolean r1 = r6 instanceof coil3.request.ErrorResult
                if (r1 == 0) goto L93
                coil3.compose.AsyncImagePainter$State$Error r1 = new coil3.compose.AsyncImagePainter$State$Error
                coil3.request.ErrorResult r6 = (coil3.request.ErrorResult) r6
                coil3.Image r2 = r6.getF13146a()
                if (r2 == 0) goto L8e
                coil3.request.ImageRequest r3 = r6.getB()
                android.content.Context r3 = r3.f13137a
                int r0 = r0.s
                androidx.compose.ui.graphics.painter.Painter r0 = coil3.compose.ImagePainter_androidKt.a(r2, r3, r0)
                goto L8f
            L8e:
                r0 = 0
            L8f:
                r1.<init>(r0, r6)
                return r1
            L93:
                kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: coil3.compose.AsyncImagePainter$onRemembered$1$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: coil3.compose.AsyncImagePainter$onRemembered$1$1$3, reason: invalid class name */
    final /* synthetic */ class AnonymousClass3 implements FlowCollector, FunctionAdapter {
        public final /* synthetic */ AsyncImagePainter d;

        public AnonymousClass3(AsyncImagePainter asyncImagePainter) {
            this.d = asyncImagePainter;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function b() {
            return new AdaptedFunctionReference(2, this.d, AsyncImagePainter.class, "updateState", "updateState(Lcoil3/compose/AsyncImagePainter$State;)V", 4);
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            AsyncImagePainter.k(this.d, (AsyncImagePainter.State) obj);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            return Unit.f24250a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.c(b(), ((FunctionAdapter) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncImagePainter$onRemembered$1$1(AsyncImagePainter asyncImagePainter, Continuation continuation) {
        super(2, continuation);
        this.q = asyncImagePainter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AsyncImagePainter$onRemembered$1$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AsyncImagePainter$onRemembered$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            AsyncImagePainter asyncImagePainter = this.q;
            ChannelFlowTransformLatest channelFlowTransformLatestF = FlowKt.F(new AnonymousClass2(asyncImagePainter, null), FlowKt.Q(asyncImagePainter.j, new AsyncImagePainter$onRemembered$1$1$invokeSuspend$$inlined$flatMapLatest$1(asyncImagePainter, null)));
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(asyncImagePainter);
            this.p = 1;
            if (channelFlowTransformLatestF.collect(anonymousClass3, this) == coroutineSingletons) {
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
