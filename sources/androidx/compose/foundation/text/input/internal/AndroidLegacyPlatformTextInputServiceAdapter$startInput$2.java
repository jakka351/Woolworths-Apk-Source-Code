package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.view.View;
import androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.platform.PlatformTextInputSession;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/PlatformTextInputSession;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {125}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AndroidLegacyPlatformTextInputServiceAdapter$startInput$2 extends SuspendLambda implements Function2<PlatformTextInputSession, Continuation<?>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ Function1 r;
    public final /* synthetic */ AndroidLegacyPlatformTextInputServiceAdapter s;
    public final /* synthetic */ LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode t;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {149}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
        public int p;
        public /* synthetic */ Object q;
        public final /* synthetic */ PlatformTextInputSession r;
        public final /* synthetic */ Function1 s;
        public final /* synthetic */ AndroidLegacyPlatformTextInputServiceAdapter t;
        public final /* synthetic */ LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode u;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {140, 141}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1, reason: invalid class name and collision with other inner class name */
        final class C00271 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int p;
            public final /* synthetic */ AndroidLegacyPlatformTextInputServiceAdapter q;
            public final /* synthetic */ InputMethodManagerImpl r;

            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1$1, reason: invalid class name and collision with other inner class name */
            final class C00281 extends Lambda implements Function1<Long, Unit> {
                public static final C00281 h = new C00281(1);

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    ((Number) obj).longValue();
                    return Unit.f24250a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00271(AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter, InputMethodManagerImpl inputMethodManagerImpl, Continuation continuation) {
                super(2, continuation);
                this.q = androidLegacyPlatformTextInputServiceAdapter;
                this.r = inputMethodManagerImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C00271(this.q, this.r, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((C00271) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                int i = this.p;
                if (i == 0) {
                    ResultKt.b(obj);
                    this.p = 1;
                    if (MonotonicFrameClockKt.b(C00281.h, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        throw android.support.v4.media.session.a.v(obj);
                    }
                    ResultKt.b(obj);
                }
                MutableSharedFlow mutableSharedFlowK = this.q.k();
                if (mutableSharedFlowK == null) {
                    return Unit.f24250a;
                }
                final InputMethodManagerImpl inputMethodManagerImpl = this.r;
                FlowCollector flowCollector = new FlowCollector() { // from class: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter.startInput.2.1.1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        if (Build.VERSION.SDK_INT >= 34) {
                            InputMethodManagerImpl inputMethodManagerImpl2 = inputMethodManagerImpl;
                            inputMethodManagerImpl2.a().startStylusHandwriting(inputMethodManagerImpl2.f1161a);
                        }
                        return Unit.f24250a;
                    }
                };
                this.p = 2;
                SharedFlowImpl.m((SharedFlowImpl) mutableSharedFlowK, flowCollector, this);
                return coroutineSingletons;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlatformTextInputSession platformTextInputSession, Function1 function1, AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter, LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode, Continuation continuation) {
            super(2, continuation);
            this.r = platformTextInputSession;
            this.s = function1;
            this.t = androidLegacyPlatformTextInputServiceAdapter;
            this.u = legacyPlatformTextInputNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, this.s, this.t, this.u, continuation);
            anonymousClass1.q = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            return CoroutineSingletons.d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter = this.t;
            try {
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    throw new KotlinNothingValueException();
                }
                ResultKt.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.q;
                Function1 function1 = LegacyPlatformTextInputServiceAdapter_androidKt.f1164a;
                PlatformTextInputSession platformTextInputSession = this.r;
                View d = platformTextInputSession.getD();
                ((LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1) function1).getClass();
                InputMethodManagerImpl inputMethodManagerImpl = new InputMethodManagerImpl(d);
                LegacyTextInputMethodRequest legacyTextInputMethodRequest = new LegacyTextInputMethodRequest(platformTextInputSession.getD(), new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1(this.u), inputMethodManagerImpl);
                if (StylusHandwriting_androidKt.f1148a) {
                    BuildersKt.c(coroutineScope, null, null, new C00271(androidLegacyPlatformTextInputServiceAdapter, inputMethodManagerImpl, null), 3);
                }
                Function1 function12 = this.s;
                if (function12 != null) {
                    function12.invoke(legacyTextInputMethodRequest);
                }
                androidLegacyPlatformTextInputServiceAdapter.c = legacyTextInputMethodRequest;
                this.p = 1;
                platformTextInputSession.a(legacyTextInputMethodRequest, this);
                return coroutineSingletons;
            } catch (Throwable th) {
                androidLegacyPlatformTextInputServiceAdapter.c = null;
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(Function1 function1, AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter, LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode, Continuation continuation) {
        super(2, continuation);
        this.r = function1;
        this.s = androidLegacyPlatformTextInputServiceAdapter;
        this.t = legacyPlatformTextInputNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AndroidLegacyPlatformTextInputServiceAdapter$startInput$2 androidLegacyPlatformTextInputServiceAdapter$startInput$2 = new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(this.r, this.s, this.t, continuation);
        androidLegacyPlatformTextInputServiceAdapter$startInput$2.q = obj;
        return androidLegacyPlatformTextInputServiceAdapter$startInput$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((AndroidLegacyPlatformTextInputServiceAdapter$startInput$2) create((PlatformTextInputSession) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        return CoroutineSingletons.d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((PlatformTextInputSession) this.q, this.r, this.s, this.t, null);
            this.p = 1;
            if (CoroutineScopeKt.c(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
