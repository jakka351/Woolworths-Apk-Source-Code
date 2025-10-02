package net.engawapg.lib.zoomable;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScopeKt;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnet/engawapg/lib/zoomable/ZoomState;", "", "zoomable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class ZoomState {

    /* renamed from: a, reason: collision with root package name */
    public long f26629a = 0;
    public final DecayAnimationSpec b;
    public final Animatable c;
    public final Animatable d;
    public final Animatable e;
    public long f;
    public long g;
    public Boolean h;
    public final VelocityTracker i;

    public ZoomState(DecayAnimationSpec decayAnimationSpec) {
        this.b = decayAnimationSpec;
        Animatable animatableA = AnimatableKt.a(1.0f);
        animatableA.j(Float.valueOf(0.9f), Float.valueOf(3.0f));
        this.c = animatableA;
        this.d = AnimatableKt.a(BitmapDescriptorFactory.HUE_RED);
        this.e = AnimatableKt.a(BitmapDescriptorFactory.HUE_RED);
        this.f = 0L;
        this.g = 0L;
        this.i = new VelocityTracker();
    }

    public static final Rect a(ZoomState zoomState, float f) {
        long jF = Size.f(zoomState.g, f);
        float fMax = Float.max(Size.d(jF) - Size.d(zoomState.f), BitmapDescriptorFactory.HUE_RED) * 0.5f;
        float fMax2 = Float.max(Size.b(jF) - Size.b(zoomState.f), BitmapDescriptorFactory.HUE_RED) * 0.5f;
        return new Rect(-fMax, -fMax2, fMax, fMax2);
    }

    public static final long b(ZoomState zoomState, float f, long j, long j2) {
        long jF = Size.f(zoomState.g, zoomState.c());
        long jF2 = Size.f(zoomState.g, f);
        float fD = Size.d(jF2) - Size.d(jF);
        float fB = Size.b(jF2) - Size.b(jF);
        float fE = Offset.e(j);
        Animatable animatable = zoomState.d;
        float fD2 = ((Size.d(jF) - Size.d(zoomState.f)) * 0.5f) + (fE - ((Number) animatable.f()).floatValue());
        float f2 = Offset.f(j);
        Animatable animatable2 = zoomState.e;
        float fB2 = ((Size.b(jF) - Size.b(zoomState.f)) * 0.5f) + (f2 - ((Number) animatable2.f()).floatValue());
        float fD3 = (fD * 0.5f) - ((fD * fD2) / Size.d(jF));
        float fB3 = (0.5f * fB) - ((fB * fB2) / Size.b(jF));
        return OffsetKt.a(Offset.e(j2) + ((Number) animatable.f()).floatValue() + fD3, Offset.f(j2) + ((Number) animatable2.f()).floatValue() + fB3);
    }

    public final float c() {
        return ((Number) this.c.f()).floatValue();
    }

    public final Object d(Continuation continuation) {
        return CoroutineScopeKt.c(new ZoomState$reset$2(this, null), continuation);
    }

    public final void e() {
        if (Size.a(this.f, 0L)) {
            this.g = 0L;
        } else if (Size.a(this.f26629a, 0L)) {
            this.g = this.f;
        } else {
            this.g = Size.d(this.f26629a) / Size.b(this.f26629a) > Size.d(this.f) / Size.b(this.f) ? Size.f(this.f26629a, Size.d(this.f) / Size.d(this.f26629a)) : Size.f(this.f26629a, Size.b(this.f) / Size.b(this.f26629a));
        }
    }
}
