package androidx.compose.ui.scrollcapture;

import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.text.input.internal.d;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.unit.IntRect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.internal.ContextScope;

@StabilityInferred
@RequiresApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback;", "Landroid/view/ScrollCaptureCallback;", "ScrollCaptureSessionListener", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposeScrollCaptureCallback implements ScrollCaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final SemanticsNode f2005a;
    public final IntRect b;
    public final ScrollCapture c;
    public final AndroidComposeView d;
    public final ContextScope e;
    public final RelativeScroller f;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$ScrollCaptureSessionListener;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface ScrollCaptureSessionListener {
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1", f = "ComposeScrollCaptureCallback.android.kt", l = {186}, m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ Runnable r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Runnable runnable, Continuation continuation) {
            super(2, continuation);
            this.r = runnable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ComposeScrollCaptureCallback.this.new AnonymousClass1(this.r, continuation);
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
            ComposeScrollCaptureCallback composeScrollCaptureCallback = ComposeScrollCaptureCallback.this;
            if (i == 0) {
                ResultKt.b(obj);
                RelativeScroller relativeScroller = composeScrollCaptureCallback.f;
                this.p = 1;
                Object objA = relativeScroller.a(BitmapDescriptorFactory.HUE_RED - relativeScroller.c, this);
                if (objA != coroutineSingletons) {
                    objA = unit;
                }
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            ((SnapshotMutableStateImpl) composeScrollCaptureCallback.c.f2007a).setValue(Boolean.FALSE);
            this.r.run();
            return unit;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1", f = "ComposeScrollCaptureCallback.android.kt", l = {119}, m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1, reason: invalid class name and case insensitive filesystem */
    final class C04391 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ ScrollCaptureSession r;
        public final /* synthetic */ Rect s;
        public final /* synthetic */ Consumer t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04391(ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer consumer, Continuation continuation) {
            super(2, continuation);
            this.r = scrollCaptureSession;
            this.s = rect;
            this.t = consumer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ComposeScrollCaptureCallback.this.new C04391(this.r, this.s, this.t, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((C04391) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                ScrollCaptureSession scrollCaptureSession = this.r;
                Rect rect = this.s;
                IntRect intRect = new IntRect(rect.left, rect.top, rect.right, rect.bottom);
                this.p = 1;
                obj = ComposeScrollCaptureCallback.a(ComposeScrollCaptureCallback.this, scrollCaptureSession, intRect, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            this.t.accept(RectHelper_androidKt.b((IntRect) obj));
            return Unit.f24250a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback", f = "ComposeScrollCaptureCallback.android.kt", l = {132, 135}, m = "onScrollCaptureImageRequest")
    /* renamed from: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2, reason: invalid class name */
    final class AnonymousClass2 extends ContinuationImpl {
        public ComposeScrollCaptureCallback p;
        public Object q;
        public IntRect r;
        public int s;
        public int t;
        public /* synthetic */ Object u;
        public int w;

        public AnonymousClass2(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return ComposeScrollCaptureCallback.a(ComposeScrollCaptureCallback.this, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$3, reason: invalid class name */
    final class AnonymousClass3 extends Lambda implements Function1<Long, Unit> {
        public static final AnonymousClass3 h = new AnonymousClass3(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            ((Number) obj).longValue();
            return Unit.f24250a;
        }
    }

    public ComposeScrollCaptureCallback(SemanticsNode semanticsNode, IntRect intRect, ContextScope contextScope, ScrollCapture scrollCapture, AndroidComposeView androidComposeView) {
        this.f2005a = semanticsNode;
        this.b = intRect;
        this.c = scrollCapture;
        this.d = androidComposeView;
        this.e = new ContextScope(contextScope.getE().plus(DisableAnimationMotionDurationScale.d));
        this.f = new RelativeScroller(intRect.b(), new ComposeScrollCaptureCallback$scrollTracker$1(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback r11, android.view.ScrollCaptureSession r12, androidx.compose.ui.unit.IntRect r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback.a(androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback, android.view.ScrollCaptureSession, androidx.compose.ui.unit.IntRect, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        BuildersKt.c(this.e, NonCancellable.e, null, new AnonymousClass1(runnable, null), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, final CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        Job jobC = BuildersKt.c(this.e, null, null, new C04391(scrollCaptureSession, rect, consumer, null), 3);
        ((JobSupport) jobC).invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback_androidKt$launchWithCancellationSignal$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                if (((Throwable) obj) != null) {
                    cancellationSignal.cancel();
                }
                return Unit.f24250a;
            }
        });
        cancellationSignal.setOnCancelListener(new d(jobC, 1));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(RectHelper_androidKt.b(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.c = BitmapDescriptorFactory.HUE_RED;
        ((SnapshotMutableStateImpl) this.c.f2007a).setValue(Boolean.TRUE);
        runnable.run();
    }
}
