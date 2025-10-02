package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/animation/core/AnimationScope;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AnimationScope<T, V extends AnimationVector> {

    /* renamed from: a, reason: collision with root package name */
    public final TwoWayConverter f744a;
    public final Object b;
    public final long c;
    public final Lambda d;
    public final MutableState e;
    public AnimationVector f;
    public long g;
    public long h = Long.MIN_VALUE;
    public final MutableState i = SnapshotStateKt.f(Boolean.TRUE);

    /* JADX WARN: Multi-variable type inference failed */
    public AnimationScope(Object obj, TwoWayConverter twoWayConverter, AnimationVector animationVector, long j, Object obj2, long j2, Function0 function0) {
        this.f744a = twoWayConverter;
        this.b = obj2;
        this.c = j2;
        this.d = (Lambda) function0;
        this.e = SnapshotStateKt.f(obj);
        this.f = AnimationVectorsKt.a(animationVector);
        this.g = j;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    public final void a() {
        k();
        this.d.invoke();
    }

    /* renamed from: b, reason: from getter */
    public final long getH() {
        return this.h;
    }

    /* renamed from: c, reason: from getter */
    public final long getG() {
        return this.g;
    }

    /* renamed from: d, reason: from getter */
    public final long getC() {
        return this.c;
    }

    public final Object e() {
        return ((SnapshotMutableStateImpl) this.e).getD();
    }

    public final Object f() {
        return this.f744a.b().invoke(this.f);
    }

    /* renamed from: g, reason: from getter */
    public final AnimationVector getF() {
        return this.f;
    }

    public final boolean h() {
        return ((Boolean) ((SnapshotMutableStateImpl) this.i).getD()).booleanValue();
    }

    public final void i(long j) {
        this.h = j;
    }

    public final void j(long j) {
        this.g = j;
    }

    public final void k() {
        ((SnapshotMutableStateImpl) this.i).setValue(Boolean.FALSE);
    }

    public final void l(Object obj) {
        ((SnapshotMutableStateImpl) this.e).setValue(obj);
    }

    public final void m(AnimationVector animationVector) {
        this.f = animationVector;
    }
}
