package coil3.compose;

import android.os.Trace;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import coil3.Image;
import coil3.ImageLoader;
import coil3.compose.AsyncImagePainter;
import coil3.compose.internal.UtilsKt;
import coil3.request.ErrorResult;
import coil3.request.ImageRequest;
import coil3.request.SuccessResult;
import coil3.size.Precision;
import coil3.size.Scale;
import coil3.size.SizeResolver;
import coil3.target.Target;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Stable
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcoil3/compose/AsyncImagePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/runtime/RememberObserver;", "Input", "State", "Companion", "coil-compose-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AsyncImagePainter extends Painter implements RememberObserver {
    public static final au.com.woolworths.android.onesite.analytics.a11y.a y = new au.com.woolworths.android.onesite.analytics.a11y.a(16);
    public final SharedFlowImpl i;
    public final SharedFlowImpl j;
    public final MutableState k;
    public final MutableFloatState l;
    public final MutableState m;
    public Job n;
    public CoroutineScope o;
    public Function1 p;
    public Function1 q;
    public ContentScale r;
    public int s;
    public AsyncImagePreviewHandler t;
    public final MutableStateFlow u;
    public final StateFlow v;
    public final MutableStateFlow w;
    public final StateFlow x;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/compose/AsyncImagePainter$Companion;", "", "coil-compose-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/compose/AsyncImagePainter$Input;", "", "coil-compose-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Input {

        /* renamed from: a, reason: collision with root package name */
        public final ImageLoader f13058a;
        public final ImageRequest b;
        public final AsyncImageModelEqualityDelegate c;

        public Input(ImageLoader imageLoader, ImageRequest imageRequest, AsyncImageModelEqualityDelegate asyncImageModelEqualityDelegate) {
            this.f13058a = imageLoader;
            this.b = imageRequest;
            this.c = asyncImageModelEqualityDelegate;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Input)) {
                return false;
            }
            Input input = (Input) obj;
            if (!Intrinsics.c(this.f13058a, input.f13058a)) {
                return false;
            }
            AsyncImageModelEqualityDelegate asyncImageModelEqualityDelegate = input.c;
            AsyncImageModelEqualityDelegate asyncImageModelEqualityDelegate2 = this.c;
            return Intrinsics.c(asyncImageModelEqualityDelegate2, asyncImageModelEqualityDelegate) && asyncImageModelEqualityDelegate2.equals(this.b, input.b);
        }

        public final int hashCode() {
            int iHashCode = this.f13058a.hashCode() * 31;
            AsyncImageModelEqualityDelegate asyncImageModelEqualityDelegate = this.c;
            return asyncImageModelEqualityDelegate.hashCode(this.b) + ((asyncImageModelEqualityDelegate.hashCode() + iHashCode) * 31);
        }

        public final String toString() {
            return "Input(imageLoader=" + this.f13058a + ", request=" + this.b + ", modelEqualityDelegate=" + this.c + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcoil3/compose/AsyncImagePainter$State;", "", "Empty", "Loading", "Success", "Error", "Lcoil3/compose/AsyncImagePainter$State$Empty;", "Lcoil3/compose/AsyncImagePainter$State$Error;", "Lcoil3/compose/AsyncImagePainter$State$Loading;", "Lcoil3/compose/AsyncImagePainter$State$Success;", "coil-compose-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface State {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/compose/AsyncImagePainter$State$Empty;", "Lcoil3/compose/AsyncImagePainter$State;", "coil-compose-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Empty implements State {

            /* renamed from: a, reason: collision with root package name */
            public static final Empty f13059a = new Empty();

            @Override // coil3.compose.AsyncImagePainter.State
            /* renamed from: b */
            public final Painter getF13062a() {
                return null;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Empty);
            }

            public final int hashCode() {
                return -1625786264;
            }

            public final String toString() {
                return "Empty";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/compose/AsyncImagePainter$State$Error;", "Lcoil3/compose/AsyncImagePainter$State;", "coil-compose-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error implements State {

            /* renamed from: a, reason: collision with root package name */
            public final Painter f13060a;
            public final ErrorResult b;

            public Error(Painter painter, ErrorResult errorResult) {
                this.f13060a = painter;
                this.b = errorResult;
            }

            @Override // coil3.compose.AsyncImagePainter.State
            /* renamed from: b, reason: from getter */
            public final Painter getF13062a() {
                return this.f13060a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Error)) {
                    return false;
                }
                Error error = (Error) obj;
                return Intrinsics.c(this.f13060a, error.f13060a) && Intrinsics.c(this.b, error.b);
            }

            public final int hashCode() {
                Painter painter = this.f13060a;
                return this.b.hashCode() + ((painter == null ? 0 : painter.hashCode()) * 31);
            }

            public final String toString() {
                return "Error(painter=" + this.f13060a + ", result=" + this.b + ')';
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/compose/AsyncImagePainter$State$Loading;", "Lcoil3/compose/AsyncImagePainter$State;", "coil-compose-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Loading implements State {

            /* renamed from: a, reason: collision with root package name */
            public final Painter f13061a;

            public Loading(Painter painter) {
                this.f13061a = painter;
            }

            @Override // coil3.compose.AsyncImagePainter.State
            /* renamed from: b, reason: from getter */
            public final Painter getF13062a() {
                return this.f13061a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Loading) && Intrinsics.c(this.f13061a, ((Loading) obj).f13061a);
            }

            public final int hashCode() {
                Painter painter = this.f13061a;
                if (painter == null) {
                    return 0;
                }
                return painter.hashCode();
            }

            public final String toString() {
                return "Loading(painter=" + this.f13061a + ')';
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/compose/AsyncImagePainter$State$Success;", "Lcoil3/compose/AsyncImagePainter$State;", "coil-compose-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success implements State {

            /* renamed from: a, reason: collision with root package name */
            public final Painter f13062a;
            public final SuccessResult b;

            public Success(Painter painter, SuccessResult successResult) {
                this.f13062a = painter;
                this.b = successResult;
            }

            @Override // coil3.compose.AsyncImagePainter.State
            /* renamed from: b, reason: from getter */
            public final Painter getF13062a() {
                return this.f13062a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Success)) {
                    return false;
                }
                Success success = (Success) obj;
                return Intrinsics.c(this.f13062a, success.f13062a) && Intrinsics.c(this.b, success.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f13062a.hashCode() * 31);
            }

            public final String toString() {
                return "Success(painter=" + this.f13062a + ", result=" + this.b + ')';
            }
        }

        /* renamed from: b */
        Painter getF13062a();
    }

    public AsyncImagePainter(Input input) {
        BufferOverflow bufferOverflow = BufferOverflow.e;
        this.i = SharedFlowKt.b(1, 0, bufferOverflow, 2);
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(1, 0, bufferOverflow, 2);
        sharedFlowImplB.f(Unit.f24250a);
        this.j = sharedFlowImplB;
        this.k = SnapshotStateKt.f(null);
        this.l = PrimitiveSnapshotStateKt.a(1.0f);
        this.m = SnapshotStateKt.f(null);
        this.p = y;
        this.r = ContentScale.Companion.b;
        this.s = 1;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(input);
        this.u = mutableStateFlowA;
        this.v = FlowKt.b(mutableStateFlowA);
        MutableStateFlow mutableStateFlowA2 = StateFlowKt.a(State.Empty.f13059a);
        this.w = mutableStateFlowA2;
        this.x = FlowKt.b(mutableStateFlowA2);
    }

    public static final ImageRequest j(final AsyncImagePainter asyncImagePainter, final ImageRequest imageRequest, boolean z) {
        SizeResolver sizeResolver = imageRequest.p;
        ImageRequest.Defined defined = imageRequest.t;
        if (sizeResolver instanceof DrawScopeSizeResolver) {
            ((DrawScopeSizeResolver) sizeResolver).connect();
            throw null;
        }
        ImageRequest.Builder builderA = ImageRequest.a(imageRequest);
        builderA.d = new Target() { // from class: coil3.compose.AsyncImagePainter$updateRequest$$inlined$target$default$1
            @Override // coil3.target.Target
            public final void b(Image image) {
                AsyncImagePainter asyncImagePainter2 = asyncImagePainter;
                AsyncImagePainter.k(asyncImagePainter2, new AsyncImagePainter.State.Loading(image != null ? ImagePainter_androidKt.a(image, imageRequest.f13137a, asyncImagePainter2.s) : null));
            }

            @Override // coil3.target.Target
            public final void c(Image image) {
            }

            @Override // coil3.target.Target
            public final void d(Image image) {
            }
        };
        if (defined.h == null) {
            builderA.n = SizeResolver.q3;
        }
        if (defined.i == null) {
            ContentScale contentScale = asyncImagePainter.r;
            CoroutineDispatcher coroutineDispatcher = UtilsKt.f13070a;
            builderA.o = (Intrinsics.c(contentScale, ContentScale.Companion.b) || Intrinsics.c(contentScale, ContentScale.Companion.e)) ? Scale.e : Scale.d;
        }
        if (defined.j == null) {
            builderA.p = Precision.e;
        }
        if (z) {
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.d;
            builderA.g = emptyCoroutineContext;
            builderA.h = emptyCoroutineContext;
            builderA.i = emptyCoroutineContext;
        }
        return builderA.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void k(coil3.compose.AsyncImagePainter r9, coil3.compose.AsyncImagePainter.State r10) {
        /*
            kotlinx.coroutines.flow.MutableStateFlow r0 = r9.w
            java.lang.Object r1 = r0.getValue()
            coil3.compose.AsyncImagePainter$State r1 = (coil3.compose.AsyncImagePainter.State) r1
            kotlin.jvm.functions.Function1 r2 = r9.p
            java.lang.Object r10 = r2.invoke(r10)
            coil3.compose.AsyncImagePainter$State r10 = (coil3.compose.AsyncImagePainter.State) r10
            r0.setValue(r10)
            androidx.compose.ui.layout.ContentScale r5 = r9.r
            boolean r0 = r10 instanceof coil3.compose.AsyncImagePainter.State.Success
            r8 = 0
            if (r0 == 0) goto L20
            r0 = r10
            coil3.compose.AsyncImagePainter$State$Success r0 = (coil3.compose.AsyncImagePainter.State.Success) r0
            coil3.request.SuccessResult r0 = r0.b
            goto L29
        L20:
            boolean r0 = r10 instanceof coil3.compose.AsyncImagePainter.State.Error
            if (r0 == 0) goto L67
            r0 = r10
            coil3.compose.AsyncImagePainter$State$Error r0 = (coil3.compose.AsyncImagePainter.State.Error) r0
            coil3.request.ErrorResult r0 = r0.b
        L29:
            coil3.request.ImageRequest r2 = r0.getB()
            coil3.Extras$Key r3 = coil3.request.ImageRequests_androidKt.b
            java.lang.Object r2 = coil3.ExtrasKt.a(r2, r3)
            coil3.transition.Transition$Factory r2 = (coil3.transition.Transition.Factory) r2
            coil3.compose.AsyncImagePainter_androidKt$fakeTransitionTarget$1 r3 = coil3.compose.AsyncImagePainter_androidKt.f13063a
            coil3.transition.Transition r2 = r2.a(r3, r0)
            boolean r3 = r2 instanceof coil3.transition.CrossfadeTransition
            if (r3 == 0) goto L67
            androidx.compose.ui.graphics.painter.Painter r3 = r1.getF13062a()
            boolean r4 = r1 instanceof coil3.compose.AsyncImagePainter.State.Loading
            if (r4 == 0) goto L48
            goto L49
        L48:
            r3 = r8
        L49:
            androidx.compose.ui.graphics.painter.Painter r4 = r10.getF13062a()
            coil3.transition.CrossfadeTransition r2 = (coil3.transition.CrossfadeTransition) r2
            int r6 = r2.c
            boolean r2 = r0 instanceof coil3.request.SuccessResult
            if (r2 == 0) goto L5f
            coil3.request.SuccessResult r0 = (coil3.request.SuccessResult) r0
            boolean r0 = r0.g
            if (r0 != 0) goto L5c
            goto L5f
        L5c:
            r0 = 0
        L5d:
            r7 = r0
            goto L61
        L5f:
            r0 = 1
            goto L5d
        L61:
            coil3.compose.internal.CrossfadePainter r2 = new coil3.compose.internal.CrossfadePainter
            r2.<init>(r3, r4, r5, r6, r7)
            goto L68
        L67:
            r2 = r8
        L68:
            if (r2 == 0) goto L6b
            goto L6f
        L6b:
            androidx.compose.ui.graphics.painter.Painter r2 = r10.getF13062a()
        L6f:
            androidx.compose.runtime.MutableState r0 = r9.k
            androidx.compose.runtime.SnapshotMutableStateImpl r0 = (androidx.compose.runtime.SnapshotMutableStateImpl) r0
            r0.setValue(r2)
            androidx.compose.ui.graphics.painter.Painter r0 = r1.getF13062a()
            androidx.compose.ui.graphics.painter.Painter r2 = r10.getF13062a()
            if (r0 == r2) goto La1
            androidx.compose.ui.graphics.painter.Painter r0 = r1.getF13062a()
            boolean r1 = r0 instanceof androidx.compose.runtime.RememberObserver
            if (r1 == 0) goto L8b
            androidx.compose.runtime.RememberObserver r0 = (androidx.compose.runtime.RememberObserver) r0
            goto L8c
        L8b:
            r0 = r8
        L8c:
            if (r0 == 0) goto L91
            r0.i()
        L91:
            androidx.compose.ui.graphics.painter.Painter r0 = r10.getF13062a()
            boolean r1 = r0 instanceof androidx.compose.runtime.RememberObserver
            if (r1 == 0) goto L9c
            r8 = r0
            androidx.compose.runtime.RememberObserver r8 = (androidx.compose.runtime.RememberObserver) r8
        L9c:
            if (r8 == 0) goto La1
            r8.c()
        La1:
            kotlin.jvm.functions.Function1 r9 = r9.q
            if (r9 == 0) goto La8
            r9.invoke(r10)
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.compose.AsyncImagePainter.k(coil3.compose.AsyncImagePainter, coil3.compose.AsyncImagePainter$State):void");
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean a(float f) {
        ((SnapshotMutableFloatStateImpl) this.l).p(f);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean b(ColorFilter colorFilter) {
        ((SnapshotMutableStateImpl) this.m).setValue(colorFilter);
        return true;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void c() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            Object obj = (Painter) ((SnapshotMutableStateImpl) this.k).getD();
            RememberObserver rememberObserver = obj instanceof RememberObserver ? (RememberObserver) obj : null;
            if (rememberObserver != null) {
                rememberObserver.c();
            }
            CoroutineScope coroutineScope = this.o;
            if (coroutineScope == null) {
                Intrinsics.p("scope");
                throw null;
            }
            Job jobC = BuildersKt.c(coroutineScope, null, null, new AsyncImagePainter$onRemembered$1$1(this, null), 3);
            Job job = this.n;
            if (job != null) {
                job.cancel((CancellationException) null);
            }
            this.n = jobC;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: f */
    public final long getL() {
        Painter painter = (Painter) ((SnapshotMutableStateImpl) this.k).getD();
        if (painter != null) {
            return painter.getL();
        }
        return 9205357640488583168L;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void g() {
        Job job = this.n;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        this.n = null;
        Object obj = (Painter) ((SnapshotMutableStateImpl) this.k).getD();
        RememberObserver rememberObserver = obj instanceof RememberObserver ? (RememberObserver) obj : null;
        if (rememberObserver != null) {
            rememberObserver.g();
        }
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void h(DrawScope drawScope) {
        this.i.f(new Size(drawScope.h()));
        Painter painter = (Painter) ((SnapshotMutableStateImpl) this.k).getD();
        if (painter != null) {
            painter.e(drawScope, drawScope.h(), ((SnapshotMutableFloatStateImpl) this.l).a(), (ColorFilter) ((SnapshotMutableStateImpl) this.m).getD());
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void i() {
        Job job = this.n;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        this.n = null;
        Object obj = (Painter) ((SnapshotMutableStateImpl) this.k).getD();
        RememberObserver rememberObserver = obj instanceof RememberObserver ? (RememberObserver) obj : null;
        if (rememberObserver != null) {
            rememberObserver.i();
        }
    }
}
