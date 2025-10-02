package androidx.compose.material;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
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
final class DrawerKt$BottomDrawer$1$1$4$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.DrawerKt$BottomDrawer$1$1$4$1$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ BottomDrawerState h;
        public final /* synthetic */ CoroutineScope i;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material.DrawerKt$BottomDrawer$1$1$4$1$1$1", f = "Drawer.kt", l = {681}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material.DrawerKt$BottomDrawer$1$1$4$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C00391 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int p;
            public final /* synthetic */ BottomDrawerState q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00391(BottomDrawerState bottomDrawerState, Continuation continuation) {
                super(2, continuation);
                this.q = bottomDrawerState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C00391(this.q, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((C00391) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                int i = this.p;
                Unit unit = Unit.f24250a;
                if (i == 0) {
                    ResultKt.b(obj);
                    this.p = 1;
                    Object objE = AnchoredDraggableKt.e(this.q.f1243a, BottomDrawerValue.d, this);
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
        public AnonymousClass1(BottomDrawerState bottomDrawerState, CoroutineScope coroutineScope) {
            super(0);
            this.h = bottomDrawerState;
            this.i = coroutineScope;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            BottomDrawerValue bottomDrawerValue = BottomDrawerValue.d;
            BottomDrawerState bottomDrawerState = this.h;
            bottomDrawerState.getClass();
            if (((Boolean) bottomDrawerState.f1243a.d.invoke(BottomDrawerValue.d)).booleanValue()) {
                BuildersKt.c(this.i, null, null, new C00391(bottomDrawerState, null), 3);
            }
            return Boolean.TRUE;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SemanticsPropertiesKt.o((SemanticsPropertyReceiver) obj, null);
        throw null;
    }
}
