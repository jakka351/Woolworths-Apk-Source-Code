package coil.compose;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
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
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.BitmapPainterKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import coil.ImageLoader;
import coil.request.DefaultRequestOptions;
import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.SuccessResult;
import coil.util.Requests;
import com.google.accompanist.drawablepainter.DrawablePainter;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Stable
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcoil/compose/AsyncImagePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/runtime/RememberObserver;", "Companion", "State", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class AsyncImagePainter extends Painter implements RememberObserver {
    public static final Function1 x = null;
    public ContextScope i;
    public final MutableStateFlow j = StateFlowKt.a(new Size(0));
    public final MutableState k = SnapshotStateKt.f(null);
    public final MutableFloatState l = PrimitiveSnapshotStateKt.a(1.0f);
    public final MutableState m = SnapshotStateKt.f(null);
    public State n;
    public Painter o;
    public Function1 p;
    public Function1 q;
    public ContentScale r;
    public int s;
    public boolean t;
    public final MutableState u;
    public final MutableState v;
    public final MutableState w;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/compose/AsyncImagePainter$Companion;", "", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcoil/compose/AsyncImagePainter$State;", "", "Empty", "Error", "Loading", "Success", "Lcoil/compose/AsyncImagePainter$State$Empty;", "Lcoil/compose/AsyncImagePainter$State$Error;", "Lcoil/compose/AsyncImagePainter$State$Loading;", "Lcoil/compose/AsyncImagePainter$State$Success;", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class State {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/compose/AsyncImagePainter$State$Empty;", "Lcoil/compose/AsyncImagePainter$State;", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Empty extends State {

            /* renamed from: a, reason: collision with root package name */
            public static final Empty f12966a = new Empty();

            @Override // coil.compose.AsyncImagePainter.State
            /* renamed from: a */
            public final Painter getF12969a() {
                return null;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Empty);
            }

            public final int hashCode() {
                return -1515560141;
            }

            public final String toString() {
                return "Empty";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/compose/AsyncImagePainter$State$Error;", "Lcoil/compose/AsyncImagePainter$State;", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Error extends State {

            /* renamed from: a, reason: collision with root package name */
            public final Painter f12967a;
            public final ErrorResult b;

            public Error(Painter painter, ErrorResult errorResult) {
                this.f12967a = painter;
                this.b = errorResult;
            }

            @Override // coil.compose.AsyncImagePainter.State
            /* renamed from: a, reason: from getter */
            public final Painter getF12969a() {
                return this.f12967a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Error)) {
                    return false;
                }
                Error error = (Error) obj;
                return Intrinsics.c(this.f12967a, error.f12967a) && Intrinsics.c(this.b, error.b);
            }

            public final int hashCode() {
                Painter painter = this.f12967a;
                return this.b.hashCode() + ((painter == null ? 0 : painter.hashCode()) * 31);
            }

            public final String toString() {
                return "Error(painter=" + this.f12967a + ", result=" + this.b + ')';
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/compose/AsyncImagePainter$State$Loading;", "Lcoil/compose/AsyncImagePainter$State;", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Loading extends State {

            /* renamed from: a, reason: collision with root package name */
            public final Painter f12968a;

            public Loading(Painter painter) {
                this.f12968a = painter;
            }

            @Override // coil.compose.AsyncImagePainter.State
            /* renamed from: a, reason: from getter */
            public final Painter getF12969a() {
                return this.f12968a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Loading) && Intrinsics.c(this.f12968a, ((Loading) obj).f12968a);
            }

            public final int hashCode() {
                Painter painter = this.f12968a;
                if (painter == null) {
                    return 0;
                }
                return painter.hashCode();
            }

            public final String toString() {
                return "Loading(painter=" + this.f12968a + ')';
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/compose/AsyncImagePainter$State$Success;", "Lcoil/compose/AsyncImagePainter$State;", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Success extends State {

            /* renamed from: a, reason: collision with root package name */
            public final Painter f12969a;
            public final SuccessResult b;

            public Success(Painter painter, SuccessResult successResult) {
                this.f12969a = painter;
                this.b = successResult;
            }

            @Override // coil.compose.AsyncImagePainter.State
            /* renamed from: a, reason: from getter */
            public final Painter getF12969a() {
                return this.f12969a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Success)) {
                    return false;
                }
                Success success = (Success) obj;
                return Intrinsics.c(this.f12969a, success.f12969a) && Intrinsics.c(this.b, success.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f12969a.hashCode() * 31);
            }

            public final String toString() {
                return "Success(painter=" + this.f12969a + ", result=" + this.b + ')';
            }
        }

        /* renamed from: a */
        public abstract Painter getF12969a();
    }

    public AsyncImagePainter(ImageRequest imageRequest, ImageLoader imageLoader) {
        State.Empty empty = State.Empty.f12966a;
        this.n = empty;
        this.p = AsyncImagePainter$Companion$DefaultTransform$1.h;
        this.r = ContentScale.Companion.b;
        this.s = 1;
        this.u = SnapshotStateKt.f(empty);
        this.v = SnapshotStateKt.f(imageRequest);
        this.w = SnapshotStateKt.f(imageLoader);
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
        if (this.i != null) {
            return;
        }
        Job jobB = SupervisorKt.b();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        ContextScope contextScopeA = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c((JobSupport) jobB, MainDispatcherLoader.f24726a.T()));
        this.i = contextScopeA;
        Object obj = this.o;
        RememberObserver rememberObserver = obj instanceof RememberObserver ? (RememberObserver) obj : null;
        if (rememberObserver != null) {
            rememberObserver.c();
        }
        if (!this.t) {
            BuildersKt.c(contextScopeA, null, null, new AsyncImagePainter$onRemembered$1(this, null), 3);
            return;
        }
        ImageRequest.Builder builderA = ImageRequest.a((ImageRequest) ((SnapshotMutableStateImpl) this.v).getD());
        builderA.b = ((ImageLoader) ((SnapshotMutableStateImpl) this.w).getD()).getF12964a();
        builderA.q = null;
        builderA.a().z.getClass();
        DefaultRequestOptions defaultRequestOptions = Requests.f13032a;
        k(new State.Loading(null));
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
        ContextScope contextScope = this.i;
        if (contextScope != null) {
            CoroutineScopeKt.b(contextScope, null);
        }
        this.i = null;
        Object obj = this.o;
        RememberObserver rememberObserver = obj instanceof RememberObserver ? (RememberObserver) obj : null;
        if (rememberObserver != null) {
            rememberObserver.g();
        }
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void h(DrawScope drawScope) {
        this.j.setValue(new Size(drawScope.h()));
        Painter painter = (Painter) ((SnapshotMutableStateImpl) this.k).getD();
        if (painter != null) {
            painter.e(drawScope, drawScope.h(), ((SnapshotMutableFloatStateImpl) this.l).a(), (ColorFilter) ((SnapshotMutableStateImpl) this.m).getD());
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void i() {
        ContextScope contextScope = this.i;
        if (contextScope != null) {
            CoroutineScopeKt.b(contextScope, null);
        }
        this.i = null;
        Object obj = this.o;
        RememberObserver rememberObserver = obj instanceof RememberObserver ? (RememberObserver) obj : null;
        if (rememberObserver != null) {
            rememberObserver.i();
        }
    }

    public final Painter j(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? BitmapPainterKt.a(new AndroidImageBitmap(((BitmapDrawable) drawable).getBitmap()), this.s) : new DrawablePainter(drawable.mutate());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(coil.compose.AsyncImagePainter.State r13) {
        /*
            r12 = this;
            coil.compose.AsyncImagePainter$State r0 = r12.n
            kotlin.jvm.functions.Function1 r1 = r12.p
            java.lang.Object r13 = r1.invoke(r13)
            coil.compose.AsyncImagePainter$State r13 = (coil.compose.AsyncImagePainter.State) r13
            r12.n = r13
            androidx.compose.runtime.MutableState r1 = r12.u
            androidx.compose.runtime.SnapshotMutableStateImpl r1 = (androidx.compose.runtime.SnapshotMutableStateImpl) r1
            r1.setValue(r13)
            boolean r1 = r13 instanceof coil.compose.AsyncImagePainter.State.Success
            r2 = 0
            if (r1 == 0) goto L1e
            r1 = r13
            coil.compose.AsyncImagePainter$State$Success r1 = (coil.compose.AsyncImagePainter.State.Success) r1
            coil.request.SuccessResult r1 = r1.b
            goto L27
        L1e:
            boolean r1 = r13 instanceof coil.compose.AsyncImagePainter.State.Error
            if (r1 == 0) goto L62
            r1 = r13
            coil.compose.AsyncImagePainter$State$Error r1 = (coil.compose.AsyncImagePainter.State.Error) r1
            coil.request.ErrorResult r1 = r1.b
        L27:
            coil.request.ImageRequest r3 = r1.getB()
            coil.transition.Transition$Factory r3 = r3.g
            coil.compose.AsyncImagePainterKt$fakeTransitionTarget$1 r4 = coil.compose.AsyncImagePainterKt.f12970a
            coil.transition.Transition r3 = r3.a(r4, r1)
            boolean r4 = r3 instanceof coil.transition.CrossfadeTransition
            if (r4 == 0) goto L62
            androidx.compose.ui.graphics.painter.Painter r4 = r0.getF12969a()
            boolean r5 = r0 instanceof coil.compose.AsyncImagePainter.State.Loading
            if (r5 == 0) goto L41
            r7 = r4
            goto L42
        L41:
            r7 = r2
        L42:
            androidx.compose.ui.graphics.painter.Painter r8 = r13.getF12969a()
            androidx.compose.ui.layout.ContentScale r9 = r12.r
            coil.transition.CrossfadeTransition r3 = (coil.transition.CrossfadeTransition) r3
            int r10 = r3.c
            boolean r3 = r1 instanceof coil.request.SuccessResult
            if (r3 == 0) goto L5a
            coil.request.SuccessResult r1 = (coil.request.SuccessResult) r1
            boolean r1 = r1.g
            if (r1 != 0) goto L57
            goto L5a
        L57:
            r1 = 0
        L58:
            r11 = r1
            goto L5c
        L5a:
            r1 = 1
            goto L58
        L5c:
            coil.compose.CrossfadePainter r6 = new coil.compose.CrossfadePainter
            r6.<init>(r7, r8, r9, r10, r11)
            goto L63
        L62:
            r6 = r2
        L63:
            if (r6 == 0) goto L66
            goto L6a
        L66:
            androidx.compose.ui.graphics.painter.Painter r6 = r13.getF12969a()
        L6a:
            r12.o = r6
            androidx.compose.runtime.MutableState r1 = r12.k
            androidx.compose.runtime.SnapshotMutableStateImpl r1 = (androidx.compose.runtime.SnapshotMutableStateImpl) r1
            r1.setValue(r6)
            kotlinx.coroutines.internal.ContextScope r1 = r12.i
            if (r1 == 0) goto La2
            androidx.compose.ui.graphics.painter.Painter r1 = r0.getF12969a()
            androidx.compose.ui.graphics.painter.Painter r3 = r13.getF12969a()
            if (r1 == r3) goto La2
            androidx.compose.ui.graphics.painter.Painter r0 = r0.getF12969a()
            boolean r1 = r0 instanceof androidx.compose.runtime.RememberObserver
            if (r1 == 0) goto L8c
            androidx.compose.runtime.RememberObserver r0 = (androidx.compose.runtime.RememberObserver) r0
            goto L8d
        L8c:
            r0 = r2
        L8d:
            if (r0 == 0) goto L92
            r0.i()
        L92:
            androidx.compose.ui.graphics.painter.Painter r0 = r13.getF12969a()
            boolean r1 = r0 instanceof androidx.compose.runtime.RememberObserver
            if (r1 == 0) goto L9d
            r2 = r0
            androidx.compose.runtime.RememberObserver r2 = (androidx.compose.runtime.RememberObserver) r2
        L9d:
            if (r2 == 0) goto La2
            r2.c()
        La2:
            kotlin.jvm.functions.Function1 r0 = r12.q
            if (r0 == 0) goto La9
            r0.invoke(r13)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.compose.AsyncImagePainter.k(coil.compose.AsyncImagePainter$State):void");
    }
}
