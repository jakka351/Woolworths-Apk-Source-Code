package me.oriient.ui.contentview.utils;

import android.animation.Animator;
import android.animation.FloatArrayEvaluator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ui.contentview.models.AnimationMode;
import me.oriient.ui.contentview.models.Degrees;
import me.oriient.ui.contentview.models.Pixel;
import me.oriient.ui.contentview.models.PixelCoordinate;
import me.oriient.ui.contentview.models.PixelMatrix;
import me.oriient.ui.contentview.models.c;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private int f26626a = 6;
    private final float[] b;
    private final float[] c;
    private final float[] d;
    private final FloatArrayEvaluator e;
    private final AccelerateDecelerateInterpolator f;
    private final LinearInterpolator g;
    private final ValueAnimator h;
    private c i;
    private final PixelMatrix j;
    private final List k;

    /* renamed from: me.oriient.ui.contentview.utils.a$a, reason: collision with other inner class name */
    public static final class C0419a implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator p0) {
            Intrinsics.h(p0, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator p0) {
            Intrinsics.h(p0, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator p0) {
            Intrinsics.h(p0, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator p0) {
            Intrinsics.h(p0, "p0");
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnimationMode.values().length];
            try {
                iArr[AnimationMode.Linear.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnimationMode.AccelerateDecelerate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a() {
        float[] fArr = new float[6];
        this.b = fArr;
        float[] fArr2 = new float[6];
        this.c = fArr2;
        float[] fArr3 = new float[6];
        this.d = fArr3;
        FloatArrayEvaluator floatArrayEvaluator = new FloatArrayEvaluator(fArr);
        this.e = floatArrayEvaluator;
        this.f = new AccelerateDecelerateInterpolator();
        this.g = new LinearInterpolator();
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(floatArrayEvaluator, fArr2, fArr3);
        this.h = valueAnimatorOfObject;
        this.j = new PixelMatrix();
        this.k = new ArrayList();
        valueAnimatorOfObject.addUpdateListener(new au.com.woolworths.shop.addtolist.utils.a(this, 6));
        valueAnimatorOfObject.addListener(new C0419a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a this$0, ValueAnimator it) {
        Intrinsics.h(this$0, "this$0");
        Intrinsics.h(it, "it");
        c cVar = this$0.i;
        if (cVar != null) {
            float f = cVar.f();
            float fB = cVar.b();
            float fM535constructorimpl = Pixel.m535constructorimpl(this$0.b[2]);
            float fM535constructorimpl2 = Pixel.m535constructorimpl(this$0.b[3]);
            float fM535constructorimpl3 = Pixel.m535constructorimpl(this$0.b[4]);
            float fM535constructorimpl4 = Pixel.m535constructorimpl(this$0.b[5]);
            PixelMatrix pixelMatrix = this$0.j;
            pixelMatrix.reset();
            pixelMatrix.m563postScaledlasf3w$ui_content_view_publishRelease(new me.oriient.ui.contentview.models.a(this$0.b[1]), new me.oriient.ui.contentview.models.a(this$0.b[1]), fM535constructorimpl, fM535constructorimpl2);
            pixelMatrix.m561postRotateMQmrOkI(new Degrees((this$0.b[0] % 360.0f) - 180.0f), fM535constructorimpl, fM535constructorimpl2);
            pixelMatrix.m564postTranslateoaYw5vM(Pixel.m543pluse6v528(Pixel.m542minuse6v528(ExtensionsKt.getPx(f / 2.0f), fM535constructorimpl), fM535constructorimpl3), Pixel.m543pluse6v528(Pixel.m542minuse6v528(ExtensionsKt.getPx(fB / 2.0f), fM535constructorimpl2), fM535constructorimpl4));
            Iterator it2 = ExtensionsKt.copyOf(this$0.k).iterator();
            while (it2.hasNext()) {
                ((Function1) it2.next()).invoke(this$0.j);
            }
        }
    }

    public final PixelCoordinate b() {
        return new PixelCoordinate(Pixel.m535constructorimpl(this.b[4]), Pixel.m535constructorimpl(this.b[5]), null);
    }

    public final void a(c source, c destination, long j, AnimationMode animationMode) {
        TimeInterpolator timeInterpolator;
        Intrinsics.h(source, "source");
        Intrinsics.h(destination, "destination");
        Intrinsics.h(animationMode, "animationMode");
        float value = source.d().getValue() + 180.0f;
        float value2 = destination.d().getValue() + 180.0f;
        float fAbs = Math.abs(value - value2);
        float f = value2 - 360.0f;
        float f2 = value - f;
        if (fAbs > Math.abs(f2)) {
            fAbs = Math.abs(f2);
        } else {
            f = value2;
        }
        float f3 = value2 + 360.0f;
        if (fAbs > Math.abs(value - f3)) {
            f = f3;
        }
        float[] fArr = new float[this.f26626a];
        fArr[0] = f;
        fArr[1] = destination.e().a();
        fArr[2] = destination.a().getX();
        fArr[3] = destination.a().getY();
        fArr[4] = destination.c().getX();
        fArr[5] = destination.c().getY();
        float[] fArr2 = new float[this.f26626a];
        fArr2[0] = value;
        fArr2[1] = source.e().a();
        fArr2[2] = source.a().getX();
        fArr2[3] = source.a().getY();
        fArr2[4] = source.c().getX();
        fArr2[5] = source.c().getY();
        this.i = destination;
        ArraysKt.w(fArr2, this.c, 14);
        ArraysKt.w(fArr, this.d, 14);
        this.h.setDuration(j);
        ValueAnimator valueAnimator = this.h;
        int i = b.$EnumSwitchMapping$0[animationMode.ordinal()];
        if (i == 1 || i != 2) {
            timeInterpolator = this.g;
        } else {
            timeInterpolator = this.f;
        }
        valueAnimator.setInterpolator(timeInterpolator);
        this.h.start();
    }

    public final void a(Function1 listener) {
        Intrinsics.h(listener, "listener");
        this.k.add(listener);
    }

    public final void a() {
        this.h.cancel();
    }
}
