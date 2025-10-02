package androidx.compose.foundation.layout;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsHolder;", "", "Companion", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WindowInsetsHolder {
    public static final WeakHashMap x = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final AndroidWindowInsets f984a = Companion.a(4, "captionBar");
    public final AndroidWindowInsets b;
    public final AndroidWindowInsets c;
    public final AndroidWindowInsets d;
    public final AndroidWindowInsets e;
    public final AndroidWindowInsets f;
    public final AndroidWindowInsets g;
    public final AndroidWindowInsets h;
    public final AndroidWindowInsets i;
    public final ValueInsets j;
    public final WindowInsets k;
    public final WindowInsets l;
    public final WindowInsets m;
    public final ValueInsets n;
    public final ValueInsets o;
    public final ValueInsets p;
    public final ValueInsets q;
    public final ValueInsets r;
    public final ValueInsets s;
    public final ValueInsets t;
    public final boolean u;
    public int v;
    public final InsetsListener w;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsHolder$Companion;", "", "", "testInsets", "Z", "Ljava/util/WeakHashMap;", "Landroid/view/View;", "Landroidx/compose/foundation/layout/WindowInsetsHolder;", "viewMap", "Ljava/util/WeakHashMap;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static final AndroidWindowInsets a(int i, String str) {
            WeakHashMap weakHashMap = WindowInsetsHolder.x;
            return new AndroidWindowInsets(i, str);
        }

        public static final ValueInsets b(int i, String str) {
            WeakHashMap weakHashMap = WindowInsetsHolder.x;
            return new ValueInsets(WindowInsets_androidKt.d(Insets.e), str);
        }

        public static WindowInsetsHolder c(Composer composer) {
            final WindowInsetsHolder windowInsetsHolder;
            final View view = (View) composer.x(AndroidCompositionLocals_androidKt.f);
            WeakHashMap weakHashMap = WindowInsetsHolder.x;
            synchronized (weakHashMap) {
                try {
                    Object windowInsetsHolder2 = weakHashMap.get(view);
                    if (windowInsetsHolder2 == null) {
                        windowInsetsHolder2 = new WindowInsetsHolder(view);
                        weakHashMap.put(view, windowInsetsHolder2);
                    }
                    windowInsetsHolder = (WindowInsetsHolder) windowInsetsHolder2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            boolean zI = composer.I(windowInsetsHolder) | composer.I(view);
            Object objG = composer.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.layout.WindowInsetsHolder$Companion$current$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        final WindowInsetsHolder windowInsetsHolder3 = windowInsetsHolder;
                        InsetsListener insetsListener = windowInsetsHolder3.w;
                        int i = windowInsetsHolder3.v;
                        final View view2 = view;
                        if (i == 0) {
                            ViewCompat.I(view2, insetsListener);
                            if (view2.isAttachedToWindow()) {
                                view2.requestApplyInsets();
                            }
                            view2.addOnAttachStateChangeListener(insetsListener);
                            ViewCompat.P(view2, insetsListener);
                        }
                        windowInsetsHolder3.v++;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.layout.WindowInsetsHolder$Companion$current$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public final void dispose() {
                                WindowInsetsHolder windowInsetsHolder4 = windowInsetsHolder3;
                                int i2 = windowInsetsHolder4.v - 1;
                                windowInsetsHolder4.v = i2;
                                if (i2 == 0) {
                                    View view3 = view2;
                                    ViewCompat.I(view3, null);
                                    ViewCompat.P(view3, null);
                                    view3.removeOnAttachStateChangeListener(windowInsetsHolder4.w);
                                }
                            }
                        };
                    }
                };
                composer.A(objG);
            }
            EffectsKt.c(windowInsetsHolder, (Function1) objG, composer);
            return windowInsetsHolder;
        }
    }

    public WindowInsetsHolder(View view) {
        AndroidWindowInsets androidWindowInsetsA = Companion.a(128, "displayCutout");
        this.b = androidWindowInsetsA;
        AndroidWindowInsets androidWindowInsetsA2 = Companion.a(8, "ime");
        this.c = androidWindowInsetsA2;
        AndroidWindowInsets androidWindowInsetsA3 = Companion.a(32, "mandatorySystemGestures");
        this.d = androidWindowInsetsA3;
        this.e = Companion.a(2, "navigationBars");
        this.f = Companion.a(1, "statusBars");
        AndroidWindowInsets androidWindowInsetsA4 = Companion.a(519, "systemBars");
        this.g = androidWindowInsetsA4;
        AndroidWindowInsets androidWindowInsetsA5 = Companion.a(16, "systemGestures");
        this.h = androidWindowInsetsA5;
        AndroidWindowInsets androidWindowInsetsA6 = Companion.a(64, "tappableElement");
        this.i = androidWindowInsetsA6;
        ValueInsets valueInsets = new ValueInsets(WindowInsets_androidKt.d(Insets.e), "waterfall");
        this.j = valueInsets;
        UnionInsets unionInsets = new UnionInsets(new UnionInsets(androidWindowInsetsA4, androidWindowInsetsA2), androidWindowInsetsA);
        this.k = unionInsets;
        UnionInsets unionInsets2 = new UnionInsets(new UnionInsets(new UnionInsets(androidWindowInsetsA6, androidWindowInsetsA3), androidWindowInsetsA5), valueInsets);
        this.l = unionInsets2;
        this.m = new UnionInsets(unionInsets, unionInsets2);
        this.n = Companion.b(4, "captionBarIgnoringVisibility");
        this.o = Companion.b(2, "navigationBarsIgnoringVisibility");
        this.p = Companion.b(1, "statusBarsIgnoringVisibility");
        this.q = Companion.b(519, "systemBarsIgnoringVisibility");
        this.r = Companion.b(64, "tappableElementIgnoringVisibility");
        this.s = Companion.b(8, "imeAnimationTarget");
        this.t = Companion.b(8, "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(com.woolworths.R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.u = bool != null ? bool.booleanValue() : true;
        this.w = new InsetsListener(this);
    }

    public static void a(WindowInsetsHolder windowInsetsHolder, WindowInsetsCompat windowInsetsCompat) {
        windowInsetsHolder.f984a.f(windowInsetsCompat, 0);
        windowInsetsHolder.c.f(windowInsetsCompat, 0);
        windowInsetsHolder.b.f(windowInsetsCompat, 0);
        windowInsetsHolder.e.f(windowInsetsCompat, 0);
        windowInsetsHolder.f.f(windowInsetsCompat, 0);
        windowInsetsHolder.g.f(windowInsetsCompat, 0);
        windowInsetsHolder.h.f(windowInsetsCompat, 0);
        windowInsetsHolder.i.f(windowInsetsCompat, 0);
        windowInsetsHolder.d.f(windowInsetsCompat, 0);
        windowInsetsHolder.n.f(WindowInsets_androidKt.d(windowInsetsCompat.f(4)));
        windowInsetsHolder.o.f(WindowInsets_androidKt.d(windowInsetsCompat.f(2)));
        windowInsetsHolder.p.f(WindowInsets_androidKt.d(windowInsetsCompat.f(1)));
        windowInsetsHolder.q.f(WindowInsets_androidKt.d(windowInsetsCompat.f(519)));
        windowInsetsHolder.r.f(WindowInsets_androidKt.d(windowInsetsCompat.f(64)));
        DisplayCutoutCompat displayCutoutCompatD = windowInsetsCompat.d();
        if (displayCutoutCompatD != null) {
            windowInsetsHolder.j.f(WindowInsets_androidKt.d(displayCutoutCompatD.a()));
        }
        Snapshot.Companion.f();
    }
}
