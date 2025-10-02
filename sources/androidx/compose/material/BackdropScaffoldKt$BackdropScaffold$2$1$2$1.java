package androidx.compose.material;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BackdropScaffoldKt$BackdropScaffold$2$1$2$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$2$1$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ BackdropScaffoldState h;
        public final /* synthetic */ CoroutineScope i;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$2$1$1$1", f = "BackdropScaffold.kt", l = {443}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$2$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C00331 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int p;
            public final /* synthetic */ BackdropScaffoldState q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00331(BackdropScaffoldState backdropScaffoldState, Continuation continuation) {
                super(2, continuation);
                this.q = backdropScaffoldState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C00331(this.q, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((C00331) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                int i = this.p;
                Unit unit = Unit.f24250a;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    return unit;
                }
                ResultKt.b(obj);
                this.p = 1;
                Object objE = AnchoredDraggableKt.e(this.q.b, BackdropValue.e, this);
                if (objE != coroutineSingletons) {
                    objE = unit;
                }
                return objE == coroutineSingletons ? coroutineSingletons : unit;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BackdropScaffoldState backdropScaffoldState, CoroutineScope coroutineScope) {
            super(0);
            this.h = backdropScaffoldState;
            this.i = coroutineScope;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            BackdropScaffoldState backdropScaffoldState = this.h;
            if (((Boolean) backdropScaffoldState.f1241a.invoke(BackdropValue.e)).booleanValue()) {
                BuildersKt.c(this.i, null, null, new C00331(backdropScaffoldState, null), 3);
            }
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$2$1$2, reason: invalid class name */
    final class AnonymousClass2 extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ BackdropScaffoldState h;
        public final /* synthetic */ CoroutineScope i;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$2$1$2$1", f = "BackdropScaffold.kt", l = {450}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$2$1$2$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int p;
            public final /* synthetic */ BackdropScaffoldState q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation continuation) {
                super(2, continuation);
                this.q = backdropScaffoldState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.q, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                int i = this.p;
                Unit unit = Unit.f24250a;
                if (i == 0) {
                    ResultKt.b(obj);
                    this.p = 1;
                    Object objE = AnchoredDraggableKt.e(this.q.b, BackdropValue.d, this);
                    if (objE != coroutineSingletons) {
                        objE = unit;
                    }
                    if (objE == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                return unit;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BackdropScaffoldState backdropScaffoldState, CoroutineScope coroutineScope) {
            super(0);
            this.h = backdropScaffoldState;
            this.i = coroutineScope;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            BackdropScaffoldState backdropScaffoldState = this.h;
            if (((Boolean) backdropScaffoldState.f1241a.invoke(BackdropValue.d)).booleanValue()) {
                BuildersKt.c(this.i, null, null, new AnonymousClass1(backdropScaffoldState, null), 3);
            }
            return Boolean.TRUE;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        throw null;
    }
}
