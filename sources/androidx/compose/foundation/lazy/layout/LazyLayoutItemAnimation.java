package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.IntOffset;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimation {
    public static final long s;
    public static final /* synthetic */ int t = 0;

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f1037a;
    public final GraphicsContext b;
    public final Function0 c;
    public FiniteAnimationSpec d;
    public FiniteAnimationSpec e;
    public FiniteAnimationSpec f;
    public boolean g;
    public final MutableState h;
    public final MutableState i;
    public final MutableState j;
    public final MutableState k;
    public long l;
    public long m;
    public GraphicsLayer n;
    public final Animatable o;
    public final Animatable p;
    public final MutableState q;
    public long r;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Object invoke() {
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation$Companion;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public static void a() {
            int i = LazyLayoutItemAnimation.t;
        }
    }

    static {
        long j = Integer.MAX_VALUE;
        s = (j & 4294967295L) | (j << 32);
    }

    public LazyLayoutItemAnimation(CoroutineScope coroutineScope, GraphicsContext graphicsContext, Function0 function0) {
        this.f1037a = coroutineScope;
        this.b = graphicsContext;
        this.c = function0;
        Boolean bool = Boolean.FALSE;
        this.h = SnapshotStateKt.f(bool);
        this.i = SnapshotStateKt.f(bool);
        this.j = SnapshotStateKt.f(bool);
        this.k = SnapshotStateKt.f(bool);
        long j = s;
        this.l = j;
        this.m = 0L;
        Object obj = null;
        this.n = graphicsContext != null ? graphicsContext.a() : null;
        int i = 12;
        this.o = new Animatable(new IntOffset(0L), VectorConvertersKt.g, obj, i);
        this.p = new Animatable(Float.valueOf(1.0f), VectorConvertersKt.f788a, obj, i);
        this.q = SnapshotStateKt.f(new IntOffset(0L));
        this.r = j;
    }

    public final void a() {
        GraphicsLayer graphicsLayer = this.n;
        FiniteAnimationSpec finiteAnimationSpec = this.d;
        boolean zBooleanValue = ((Boolean) ((SnapshotMutableStateImpl) this.i).getD()).booleanValue();
        CoroutineScope coroutineScope = this.f1037a;
        if (zBooleanValue || finiteAnimationSpec == null || graphicsLayer == null) {
            if (c()) {
                if (graphicsLayer != null) {
                    graphicsLayer.f(1.0f);
                }
                BuildersKt.c(coroutineScope, null, null, new LazyLayoutItemAnimation$animateAppearance$1(this, null), 3);
                return;
            }
            return;
        }
        e(true);
        boolean zC = c();
        boolean z = !zC;
        if (!zC) {
            graphicsLayer.f(BitmapDescriptorFactory.HUE_RED);
        }
        BuildersKt.c(coroutineScope, null, null, new LazyLayoutItemAnimation$animateAppearance$2(z, this, finiteAnimationSpec, graphicsLayer, null), 3);
    }

    public final void b() {
        if (((Boolean) ((SnapshotMutableStateImpl) this.h).getD()).booleanValue()) {
            BuildersKt.c(this.f1037a, null, null, new LazyLayoutItemAnimation$cancelPlacementAnimation$1(this, null), 3);
        }
    }

    public final boolean c() {
        return ((Boolean) ((SnapshotMutableStateImpl) this.j).getD()).booleanValue();
    }

    public final void d() {
        GraphicsContext graphicsContext;
        boolean zBooleanValue = ((Boolean) ((SnapshotMutableStateImpl) this.h).getD()).booleanValue();
        CoroutineScope coroutineScope = this.f1037a;
        if (zBooleanValue) {
            g(false);
            BuildersKt.c(coroutineScope, null, null, new LazyLayoutItemAnimation$release$1(this, null), 3);
        }
        if (((Boolean) ((SnapshotMutableStateImpl) this.i).getD()).booleanValue()) {
            e(false);
            BuildersKt.c(coroutineScope, null, null, new LazyLayoutItemAnimation$release$2(this, null), 3);
        }
        if (c()) {
            f(false);
            BuildersKt.c(coroutineScope, null, null, new LazyLayoutItemAnimation$release$3(this, null), 3);
        }
        this.g = false;
        h(0L);
        this.l = s;
        GraphicsLayer graphicsLayer = this.n;
        if (graphicsLayer != null && (graphicsContext = this.b) != null) {
            graphicsContext.b(graphicsLayer);
        }
        this.n = null;
        this.d = null;
        this.f = null;
        this.e = null;
    }

    public final void e(boolean z) {
        ((SnapshotMutableStateImpl) this.i).setValue(Boolean.valueOf(z));
    }

    public final void f(boolean z) {
        ((SnapshotMutableStateImpl) this.j).setValue(Boolean.valueOf(z));
    }

    public final void g(boolean z) {
        ((SnapshotMutableStateImpl) this.h).setValue(Boolean.valueOf(z));
    }

    public final void h(long j) {
        ((SnapshotMutableStateImpl) this.q).setValue(new IntOffset(j));
    }
}
