package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Rect;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", l = {215}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ContentInViewNode$launchAnimation$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ContentInViewNode r;
    public final /* synthetic */ UpdatableAnimationState s;
    public final /* synthetic */ BringIntoViewSpec t;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/NestedScrollScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", l = {221}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<NestedScrollScope, Continuation<? super Unit>, Object> {
        public int p;
        public /* synthetic */ Object q;
        public final /* synthetic */ UpdatableAnimationState r;
        public final /* synthetic */ ContentInViewNode s;
        public final /* synthetic */ BringIntoViewSpec t;
        public final /* synthetic */ Job u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UpdatableAnimationState updatableAnimationState, ContentInViewNode contentInViewNode, BringIntoViewSpec bringIntoViewSpec, Job job, Continuation continuation) {
            super(2, continuation);
            this.r = updatableAnimationState;
            this.s = contentInViewNode;
            this.t = bringIntoViewSpec;
            this.u = job;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, this.s, this.t, this.u, continuation);
            anonymousClass1.q = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((NestedScrollScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.q;
                final ContentInViewNode contentInViewNode = this.s;
                final BringIntoViewSpec bringIntoViewSpec = this.t;
                float fS2 = ContentInViewNode.s2(contentInViewNode, bringIntoViewSpec);
                final UpdatableAnimationState updatableAnimationState = this.r;
                updatableAnimationState.e = fS2;
                final Job job = this.u;
                Function1<Float, Unit> function1 = new Function1<Float, Unit>() { // from class: androidx.compose.foundation.gestures.ContentInViewNode.launchAnimation.2.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        float fFloatValue = ((Number) obj2).floatValue();
                        ContentInViewNode contentInViewNode2 = contentInViewNode;
                        float f = contentInViewNode2.t ? 1.0f : -1.0f;
                        ScrollingLogic scrollingLogic = contentInViewNode2.s;
                        float fG = scrollingLogic.g(scrollingLogic.e(nestedScrollScope.b(scrollingLogic.e(scrollingLogic.h(f * fFloatValue))))) * f;
                        if (Math.abs(fG) < Math.abs(fFloatValue)) {
                            job.cancel(ExceptionsKt.a("Scroll animation cancelled because scroll was not consumed (" + fG + " < " + fFloatValue + ')', null));
                        }
                        return Unit.f24250a;
                    }
                };
                Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.ContentInViewNode.launchAnimation.2.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        ContentInViewNode contentInViewNode2 = contentInViewNode;
                        BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue = contentInViewNode2.v;
                        while (true) {
                            MutableVector mutableVector = bringIntoViewRequestPriorityQueue.f872a;
                            int i2 = mutableVector.f;
                            unit = Unit.f24250a;
                            if (i2 == 0) {
                                break;
                            }
                            if (i2 == 0) {
                                throw new NoSuchElementException("MutableVector is empty.");
                            }
                            Rect rect = (Rect) ((ContentInViewNode.Request) mutableVector.d[i2 - 1]).f876a.invoke();
                            if (!(rect == null ? true : contentInViewNode2.u2(contentInViewNode2.z, rect))) {
                                break;
                            }
                            MutableVector mutableVector2 = bringIntoViewRequestPriorityQueue.f872a;
                            ((ContentInViewNode.Request) mutableVector2.l(mutableVector2.f - 1)).continuation.resumeWith(unit);
                        }
                        if (contentInViewNode2.x) {
                            Rect rectT2 = contentInViewNode2.t2();
                            if (rectT2 != null && contentInViewNode2.u2(contentInViewNode2.z, rectT2)) {
                                contentInViewNode2.x = false;
                            }
                        }
                        updatableAnimationState.e = ContentInViewNode.s2(contentInViewNode2, bringIntoViewSpec);
                        return unit;
                    }
                };
                this.p = 1;
                if (updatableAnimationState.a(function1, function0, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentInViewNode$launchAnimation$2(ContentInViewNode contentInViewNode, UpdatableAnimationState updatableAnimationState, BringIntoViewSpec bringIntoViewSpec, Continuation continuation) {
        super(2, continuation);
        this.r = contentInViewNode;
        this.s = updatableAnimationState;
        this.t = bringIntoViewSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ContentInViewNode$launchAnimation$2 contentInViewNode$launchAnimation$2 = new ContentInViewNode$launchAnimation$2(this.r, this.s, this.t, continuation);
        contentInViewNode$launchAnimation$2.q = obj;
        return contentInViewNode$launchAnimation$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ContentInViewNode$launchAnimation$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ContentInViewNode contentInViewNode = this.r;
        BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue = contentInViewNode.v;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            try {
                if (i == 0) {
                    ResultKt.b(obj);
                    Job jobF = JobKt.f(((CoroutineScope) this.q).getE());
                    contentInViewNode.A = true;
                    ScrollingLogic scrollingLogic = contentInViewNode.s;
                    MutatePriority mutatePriority = MutatePriority.d;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.s, contentInViewNode, this.t, jobF, null);
                    this.p = 1;
                    if (scrollingLogic.f(mutatePriority, anonymousClass1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                bringIntoViewRequestPriorityQueue.b();
                contentInViewNode.A = false;
                bringIntoViewRequestPriorityQueue.a(null);
                contentInViewNode.x = false;
                return Unit.f24250a;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            contentInViewNode.A = false;
            bringIntoViewRequestPriorityQueue.a(null);
            contentInViewNode.x = false;
            throw th;
        }
    }
}
