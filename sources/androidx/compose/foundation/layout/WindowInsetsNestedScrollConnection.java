package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.a;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;

@RequiresApi
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroid/view/WindowInsetsAnimationControlListener;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class WindowInsetsNestedScrollConnection implements NestedScrollConnection, WindowInsetsAnimationControlListener {
    public final AndroidWindowInsets d;
    public final View e;
    public final SideCalculator f;
    public final Density g;
    public WindowInsetsAnimationController h;
    public boolean i;
    public final CancellationSignal j = new CancellationSignal();
    public float k;
    public Job l;
    public CancellableContinuationImpl m;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$onReady$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function1<Throwable, Unit> {
        public static final AnonymousClass1 h = new AnonymousClass1(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Unit.f24250a;
        }
    }

    public WindowInsetsNestedScrollConnection(AndroidWindowInsets androidWindowInsets, View view, SideCalculator sideCalculator, Density density) {
        this.d = androidWindowInsets;
        this.e = view;
        this.f = sideCalculator;
        this.g = density;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final Object J0(long j, Continuation continuation) {
        return b(j, this.f.b(Velocity.d(j), Velocity.e(j)), false, (ContinuationImpl) continuation);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final Object V(long j, long j2, Continuation continuation) {
        return b(j2, this.f.a(Velocity.d(j2), Velocity.e(j2)), true, (ContinuationImpl) continuation);
    }

    public final void a() throws DispatchException {
        WindowInsetsAnimationController windowInsetsAnimationController;
        WindowInsetsAnimationController windowInsetsAnimationController2 = this.h;
        if (windowInsetsAnimationController2 != null && windowInsetsAnimationController2.isReady() && (windowInsetsAnimationController = this.h) != null) {
            windowInsetsAnimationController.finish(((Boolean) ((SnapshotMutableStateImpl) this.d.d).getD()).booleanValue());
        }
        this.h = null;
        CancellableContinuationImpl cancellableContinuationImpl = this.m;
        if (cancellableContinuationImpl != null) {
            cancellableContinuationImpl.B(null, WindowInsetsNestedScrollConnection$animationEnded$1.h);
        }
        this.m = null;
        Job job = this.l;
        if (job != null) {
            ((JobSupport) job).E(new WindowInsetsAnimationCancelledException());
        }
        this.l = null;
        this.k = BitmapDescriptorFactory.HUE_RED;
        this.i = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(long r28, float r30, boolean r31, kotlin.coroutines.jvm.internal.ContinuationImpl r32) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.b(long, float, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long b0(int i, long j) {
        return d(j, this.f.b(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j))));
    }

    public final void c() {
        if (this.i) {
            return;
        }
        this.i = true;
        WindowInsetsController windowInsetsController = this.e.getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.controlWindowInsetsAnimation(this.d.f933a, -1L, null, this.j, a.i(this));
        }
    }

    public final long d(long j, float f) {
        Job job = this.l;
        if (job != null) {
            ((JobSupport) job).E(new WindowInsetsAnimationCancelledException());
            this.l = null;
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.h;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            if (((Boolean) ((SnapshotMutableStateImpl) this.d.d).getD()).booleanValue() != (f > BitmapDescriptorFactory.HUE_RED) || windowInsetsAnimationController != null) {
                if (windowInsetsAnimationController == null) {
                    this.k = BitmapDescriptorFactory.HUE_RED;
                    c();
                    return this.f.c(j);
                }
                int iF = this.f.f(windowInsetsAnimationController.getHiddenStateInsets());
                int iF2 = this.f.f(windowInsetsAnimationController.getShownStateInsets());
                Insets currentInsets = windowInsetsAnimationController.getCurrentInsets();
                int iF3 = this.f.f(currentInsets);
                if (iF3 == (f > BitmapDescriptorFactory.HUE_RED ? iF2 : iF)) {
                    this.k = BitmapDescriptorFactory.HUE_RED;
                    return 0L;
                }
                float f2 = iF3 + f + this.k;
                int iC = RangesKt.c(Math.round(f2), iF, iF2);
                this.k = f2 - Math.round(f2);
                if (iC != iF3) {
                    windowInsetsAnimationController.setInsetsAndAlpha(this.f.e(currentInsets, iC), 1.0f, BitmapDescriptorFactory.HUE_RED);
                }
                return this.f.c(j);
            }
        }
        return 0L;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long n0(int i, long j, long j2) {
        return d(j2, this.f.a(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (4294967295L & j2))));
    }

    public final void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) throws DispatchException {
        a();
    }

    public final void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) throws DispatchException {
        a();
    }

    public final void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i) throws DispatchException {
        this.h = windowInsetsAnimationController;
        this.i = false;
        CancellableContinuationImpl cancellableContinuationImpl = this.m;
        if (cancellableContinuationImpl != null) {
            cancellableContinuationImpl.B(windowInsetsAnimationController, AnonymousClass1.h);
        }
        this.m = null;
    }
}
