package com.skydoves.balloon;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBindings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.skydoves.balloon.BalloonPersistence;
import com.skydoves.balloon.IconForm;
import com.skydoves.balloon.TextForm;
import com.skydoves.balloon.databinding.BalloonLayoutBodyBinding;
import com.skydoves.balloon.databinding.BalloonLayoutOverlayBinding;
import com.skydoves.balloon.extensions.TextViewExtensionKt;
import com.skydoves.balloon.extensions.ViewExtensionKt;
import com.skydoves.balloon.overlay.BalloonAnchorOverlayView;
import com.skydoves.balloon.overlay.BalloonOverlayAnimation;
import com.skydoves.balloon.overlay.BalloonOverlayOval;
import com.skydoves.balloon.overlay.BalloonOverlayShape;
import com.skydoves.balloon.radius.RadiusLayout;
import com.skydoves.balloon.vectortext.VectorTextView;
import com.skydoves.balloon.vectortext.VectorTextViewParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/skydoves/balloon/Balloon;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Builder", "Factory", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class Balloon implements DefaultLifecycleObserver {
    public final Context d;
    public final Builder e;
    public final BalloonLayoutBodyBinding f;
    public final BalloonLayoutOverlayBinding g;
    public final PopupWindow h;
    public final PopupWindow i;
    public boolean j;
    public boolean k;
    public OnBalloonInitializedListener l;
    public final Object m;
    public final Object n;
    public final Object o;

    @BalloonInlineDsl
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/skydoves/balloon/Balloon$Builder;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Builder {
        public final int A;
        public final int B;
        public final float C;
        public final float D;
        public View E;
        public boolean F;
        public int G;
        public float H;
        public BalloonOverlayShape I;
        public final int J;
        public OnBalloonDismissListener K;
        public OnBalloonOverlayClickListener L;
        public final boolean M;
        public final boolean N;
        public final long O;
        public LifecycleOwner P;
        public final int Q;
        public final int R;
        public BalloonAnimation S;
        public BalloonOverlayAnimation T;
        public final long U;
        public final BalloonHighlightAnimation V;
        public final int W;
        public final boolean X;
        public final boolean Y;
        public final boolean Z;

        /* renamed from: a, reason: collision with root package name */
        public final Context f19012a;
        public final boolean a0;
        public int b;
        public final int c;
        public float d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public int i;
        public int j;
        public float k;
        public ArrowPositionRules l;
        public ArrowOrientationRules m;
        public ArrowOrientation n;
        public Drawable o;
        public final float p;
        public int q;
        public GradientDrawable r;
        public float s;
        public final String t;
        public final int u;
        public final float v;
        public final int w;
        public final IconGravity x;
        public final int y;
        public final int z;

        public Builder(@NotNull Context context) {
            Intrinsics.h(context, "context");
            this.f19012a = context;
            this.b = Integer.MIN_VALUE;
            this.c = new Point(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels).x;
            this.e = Integer.MIN_VALUE;
            this.h = true;
            this.i = Integer.MIN_VALUE;
            this.j = MathKt.b(TypedValue.applyDimension(1, 12, Resources.getSystem().getDisplayMetrics()));
            this.k = 0.5f;
            this.l = ArrowPositionRules.d;
            this.m = ArrowOrientationRules.d;
            this.n = ArrowOrientation.d;
            this.p = 2.5f;
            this.q = -16777216;
            this.s = TypedValue.applyDimension(1, 5.0f, Resources.getSystem().getDisplayMetrics());
            this.t = "";
            this.u = -1;
            this.v = 12.0f;
            this.w = 17;
            this.x = IconGravity.d;
            float f = 28;
            this.y = MathKt.b(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
            this.z = MathKt.b(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
            this.A = MathKt.b(TypedValue.applyDimension(1, 8, Resources.getSystem().getDisplayMetrics()));
            this.B = Integer.MIN_VALUE;
            this.C = 1.0f;
            this.D = TypedValue.applyDimension(1, 2.0f, Resources.getSystem().getDisplayMetrics());
            this.I = BalloonOverlayOval.f19022a;
            this.J = 17;
            this.M = true;
            this.N = true;
            this.O = -1L;
            this.Q = Integer.MIN_VALUE;
            this.R = Integer.MIN_VALUE;
            this.S = BalloonAnimation.d;
            this.T = BalloonOverlayAnimation.d;
            this.U = 500L;
            this.V = BalloonHighlightAnimation.d;
            this.W = Integer.MIN_VALUE;
            this.X = context.getResources().getConfiguration().getLayoutDirection() == 1;
            this.Y = true;
            this.Z = true;
            this.a0 = true;
        }

        public final /* synthetic */ void a(Function0 block) {
            Intrinsics.h(block, "block");
            this.K = new BalloonKt$sam$com_skydoves_balloon_OnBalloonDismissListener$0(block);
        }

        public final void b(Function0 block) {
            Intrinsics.h(block, "block");
            this.L = new BalloonKt$sam$com_skydoves_balloon_OnBalloonOverlayClickListener$0(block);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/skydoves/balloon/Balloon$Factory;", "", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Factory {
        public abstract Balloon a();
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19013a;

        static {
            int[] iArr = new int[ArrowOrientation.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ArrowPositionRules.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[BalloonAnimation.values().length];
            try {
                iArr3[1] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[3] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[4] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[0] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr4 = new int[BalloonOverlayAnimation.values().length];
            try {
                iArr4[1] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            f19013a = iArr4;
            int[] iArr5 = new int[BalloonHighlightAnimation.values().length];
            try {
                iArr5[1] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr5[2] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[3] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[4] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            int[] iArr6 = new int[BalloonCenterAlign.values().length];
            try {
                iArr6[2] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr6[3] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr6[0] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr6[1] = 4;
            } catch (NoSuchFieldError unused20) {
            }
            int[] iArr7 = new int[BalloonAlign.values().length];
            try {
                iArr7[2] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr7[3] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr7[1] = 3;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr7[0] = 4;
            } catch (NoSuchFieldError unused24) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Balloon(Context context, Builder builder) {
        Lifecycle d;
        this.d = context;
        this.e = builder;
        View viewInflate = LayoutInflater.from(context).inflate(com.woolworths.R.layout.balloon_layout_body, (ViewGroup) null, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        int i = com.woolworths.R.id.balloon_arrow;
        ImageView imageView = (ImageView) ViewBindings.a(com.woolworths.R.id.balloon_arrow, viewInflate);
        if (imageView != null) {
            i = com.woolworths.R.id.balloon_card;
            RadiusLayout radiusLayout = (RadiusLayout) ViewBindings.a(com.woolworths.R.id.balloon_card, viewInflate);
            if (radiusLayout != null) {
                i = com.woolworths.R.id.balloon_content;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.a(com.woolworths.R.id.balloon_content, viewInflate);
                if (frameLayout2 != null) {
                    i = com.woolworths.R.id.balloon_text;
                    VectorTextView vectorTextView = (VectorTextView) ViewBindings.a(com.woolworths.R.id.balloon_text, viewInflate);
                    if (vectorTextView != null) {
                        i = com.woolworths.R.id.balloon_wrapper;
                        FrameLayout frameLayout3 = (FrameLayout) ViewBindings.a(com.woolworths.R.id.balloon_wrapper, viewInflate);
                        if (frameLayout3 != null) {
                            this.f = new BalloonLayoutBodyBinding(frameLayout, frameLayout, imageView, radiusLayout, frameLayout2, vectorTextView, frameLayout3);
                            View viewInflate2 = LayoutInflater.from(context).inflate(com.woolworths.R.layout.balloon_layout_overlay, (ViewGroup) null, false);
                            if (viewInflate2 == null) {
                                throw new NullPointerException("rootView");
                            }
                            BalloonAnchorOverlayView balloonAnchorOverlayView = (BalloonAnchorOverlayView) viewInflate2;
                            this.g = new BalloonLayoutOverlayBinding(balloonAnchorOverlayView, balloonAnchorOverlayView);
                            PopupWindow popupWindow = new PopupWindow(frameLayout, -2, -2);
                            this.h = popupWindow;
                            PopupWindow popupWindow2 = new PopupWindow(balloonAnchorOverlayView, -1, -1);
                            this.i = popupWindow2;
                            this.l = null;
                            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.e;
                            this.m = LazyKt.a(lazyThreadSafetyMode, Balloon$handler$2.h);
                            this.n = LazyKt.a(lazyThreadSafetyMode, new Function0<AutoDismissRunnable>() { // from class: com.skydoves.balloon.Balloon$autoDismissRunnable$2
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return new AutoDismissRunnable(this.h);
                                }
                            });
                            this.o = LazyKt.a(lazyThreadSafetyMode, new Function0<BalloonPersistence>() { // from class: com.skydoves.balloon.Balloon$balloonPersistence$2
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    BalloonPersistence balloonPersistence;
                                    BalloonPersistence.Companion companion = BalloonPersistence.f19014a;
                                    Context context2 = this.h.d;
                                    BalloonPersistence balloonPersistence2 = BalloonPersistence.b;
                                    if (balloonPersistence2 != null) {
                                        return balloonPersistence2;
                                    }
                                    synchronized (companion) {
                                        balloonPersistence = BalloonPersistence.b;
                                        if (balloonPersistence == null) {
                                            balloonPersistence = new BalloonPersistence();
                                            BalloonPersistence.b = balloonPersistence;
                                            Intrinsics.g(context2.getSharedPreferences("com.skydoves.balloon", 0), "context.getSharedPrefere…n\", Context.MODE_PRIVATE)");
                                        }
                                    }
                                    return balloonPersistence;
                                }
                            });
                            float f = builder.C;
                            float f2 = builder.D;
                            radiusLayout.setAlpha(f);
                            radiusLayout.setRadius(builder.s);
                            ViewCompat.F(radiusLayout, f2);
                            GradientDrawable gradientDrawable = builder.r;
                            if (gradientDrawable == null) {
                                gradientDrawable = new GradientDrawable();
                                gradientDrawable.setColor(builder.q);
                                gradientDrawable.setCornerRadius(builder.s);
                            }
                            radiusLayout.setBackground(gradientDrawable);
                            radiusLayout.setPadding(0, 0, 0, 0);
                            ViewGroup.LayoutParams layoutParams = frameLayout3.getLayoutParams();
                            Intrinsics.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(builder.g, 0, builder.f, 0);
                            popupWindow.setOutsideTouchable(true);
                            popupWindow.setFocusable(builder.Y);
                            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                            popupWindow.setElevation(f2);
                            popupWindow.setAttachedInDecor(builder.a0);
                            if (h()) {
                                View view = builder.E;
                                if (view == null) {
                                    throw new IllegalArgumentException("The custom layout is null.");
                                }
                                ViewParent parent = view.getParent();
                                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                                if (viewGroup != null) {
                                    viewGroup.removeView(view);
                                }
                                radiusLayout.removeAllViews();
                                radiusLayout.addView(view);
                                q(radiusLayout);
                            } else {
                                Context context2 = vectorTextView.getContext();
                                Intrinsics.g(context2, "context");
                                new IconForm.Builder(context2);
                                Intrinsics.h(builder.x, "value");
                                boolean z = builder.X;
                                VectorTextViewParams vectorTextViewParams = vectorTextView.drawableTextViewParams;
                                if (vectorTextViewParams != null) {
                                    vectorTextViewParams.e = z;
                                    TextViewExtensionKt.a(vectorTextView, vectorTextViewParams);
                                }
                                Context context3 = vectorTextView.getContext();
                                Intrinsics.g(context3, "context");
                                TextForm.Builder builder2 = new TextForm.Builder(context3);
                                String value = builder.t;
                                Intrinsics.h(value, "value");
                                builder2.f19017a = value;
                                builder2.b = builder.v;
                                builder2.c = builder.u;
                                builder2.d = builder.w;
                                vectorTextView.setMovementMethod(null);
                                TextForm textForm = new TextForm(builder2);
                                vectorTextView.setText(textForm.f19016a);
                                vectorTextView.setTextSize(textForm.b);
                                vectorTextView.setGravity(textForm.d);
                                vectorTextView.setTextColor(textForm.c);
                                vectorTextView.setTypeface(vectorTextView.getTypeface(), 0);
                                j(vectorTextView, radiusLayout);
                            }
                            i();
                            if (builder.F) {
                                balloonAnchorOverlayView.setOverlayColor(builder.G);
                                balloonAnchorOverlayView.setOverlayPadding(builder.H);
                                balloonAnchorOverlayView.setOverlayPosition(null);
                                balloonAnchorOverlayView.setBalloonOverlayShape(builder.I);
                                balloonAnchorOverlayView.setOverlayPaddingColor(0);
                                popupWindow2.setClippingEnabled(false);
                            }
                            popupWindow.setOnDismissListener(new b(this, builder.K));
                            popupWindow.setTouchInterceptor(new Balloon$setOnBalloonOutsideTouchListener$1(this, null));
                            balloonAnchorOverlayView.setOnClickListener(new androidx.navigation.ui.a(21, builder.L, this));
                            Intrinsics.g(frameLayout, "binding.root");
                            a(frameLayout);
                            LifecycleOwner lifecycleOwner = builder.P;
                            if (lifecycleOwner == null && (context instanceof LifecycleOwner)) {
                                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) context;
                                builder.P = lifecycleOwner2;
                                lifecycleOwner2.getD().a(this);
                                return;
                            } else {
                                if (lifecycleOwner == null || (d = lifecycleOwner.getD()) == null) {
                                    return;
                                }
                                d.a(this);
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    public static void a(ViewGroup viewGroup) {
        viewGroup.setFitsSystemWindows(false);
        IntRange intRangeO = RangesKt.o(0, viewGroup.getChildCount());
        ArrayList arrayList = new ArrayList(CollectionsKt.s(intRangeO, 10));
        IntProgressionIterator it = intRangeO.iterator();
        while (it.f) {
            arrayList.add(viewGroup.getChildAt(it.nextInt()));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            View view = (View) it2.next();
            view.setFitsSystemWindows(false);
            if (view instanceof ViewGroup) {
                a((ViewGroup) view);
            }
        }
    }

    public final boolean b(View view) {
        if (this.j || this.k) {
            return false;
        }
        Context context = this.d;
        if (((context instanceof Activity) && ((Activity) context).isFinishing()) || this.h.getContentView().getParent() != null) {
            return false;
        }
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        return view.isAttachedToWindow();
    }

    public final void c() {
        if (this.j) {
            final Function0<Unit> function0 = new Function0<Unit>() { // from class: com.skydoves.balloon.Balloon$dismiss$dismissWindow$1
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
                /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Balloon balloon = this.h;
                    balloon.j = false;
                    balloon.h.dismiss();
                    balloon.i.dismiss();
                    ((Handler) balloon.m.getD()).removeCallbacks((AutoDismissRunnable) balloon.n.getD());
                    return Unit.f24250a;
                }
            };
            Builder builder = this.e;
            if (builder.S != BalloonAnimation.e) {
                function0.invoke();
                return;
            }
            final View contentView = this.h.getContentView();
            Intrinsics.g(contentView, "this.bodyWindow.contentView");
            final long j = builder.U;
            contentView.post(new Runnable() { // from class: com.skydoves.balloon.Balloon$dismiss$$inlined$circularUnRevealed$1
                @Override // java.lang.Runnable
                public final void run() {
                    View view = contentView;
                    if (view.isAttachedToWindow()) {
                        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, (view.getRight() + view.getLeft()) / 2, (view.getBottom() + view.getTop()) / 2, Math.max(view.getWidth(), view.getHeight()), BitmapDescriptorFactory.HUE_RED);
                        animatorCreateCircularReveal.setDuration(j);
                        animatorCreateCircularReveal.start();
                        final Function0 function02 = function0;
                        animatorCreateCircularReveal.addListener(new AnimatorListenerAdapter() { // from class: com.skydoves.balloon.Balloon$dismiss$$inlined$circularUnRevealed$1.1
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animation) {
                                Intrinsics.h(animation, "animation");
                                super.onAnimationEnd(animation);
                                function02.invoke();
                            }
                        });
                    }
                }
            });
        }
    }

    public final float d(View view) {
        int i = ViewExtensionKt.a(this.f.h).x;
        int i2 = ViewExtensionKt.a(view).x;
        Builder builder = this.e;
        float f = (builder.j * builder.p) + 0;
        float fG = ((g() - f) - builder.f) - builder.g;
        int iOrdinal = builder.l.ordinal();
        if (iOrdinal == 0) {
            return (r0.j.getWidth() * builder.k) - (builder.j * 0.5f);
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        if (view.getWidth() + i2 >= i) {
            if (g() + i >= i2) {
                float width = (((view.getWidth() * builder.k) + i2) - i) - (builder.j * 0.5f);
                if (width > builder.j * 2) {
                    if (width <= g() - (builder.j * 2)) {
                        return width;
                    }
                }
            }
            return fG;
        }
        return f;
    }

    public final float e(View view) {
        int i;
        Builder builder = this.e;
        boolean z = builder.Z;
        Intrinsics.h(view, "<this>");
        Rect rect = new Rect();
        Context context = view.getContext();
        if ((context instanceof Activity) && z) {
            ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            i = rect.top;
        } else {
            i = 0;
        }
        int i2 = ViewExtensionKt.a(this.f.h).y - i;
        int i3 = ViewExtensionKt.a(view).y - i;
        float f = 0;
        float f2 = (builder.j * builder.p) + f;
        float f3 = ((f() - f2) - f) - f;
        int i4 = builder.j / 2;
        int iOrdinal = builder.l.ordinal();
        if (iOrdinal == 0) {
            return (r2.j.getHeight() * builder.k) - i4;
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        if (view.getHeight() + i3 >= i2) {
            if (f() + i2 >= i3) {
                float height = (((view.getHeight() * builder.k) + i3) - i2) - i4;
                if (height > builder.j * 2) {
                    if (height <= f() - (builder.j * 2)) {
                        return height;
                    }
                }
            }
            return f3;
        }
        return f2;
    }

    public final int f() {
        int i = this.e.e;
        return i != Integer.MIN_VALUE ? i : this.f.d.getMeasuredHeight();
    }

    public final int g() {
        int i = new Point(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels).x;
        Builder builder = this.e;
        float f = builder.d;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            return (int) (i * f);
        }
        builder.getClass();
        builder.getClass();
        int i2 = builder.b;
        if (i2 != Integer.MIN_VALUE) {
            return i2 > i ? i : i2;
        }
        int measuredWidth = this.f.d.getMeasuredWidth();
        builder.getClass();
        return RangesKt.c(measuredWidth, 0, builder.c);
    }

    public final boolean h() {
        Builder builder = this.e;
        builder.getClass();
        return builder.E != null;
    }

    public final void i() {
        Builder builder = this.e;
        int i = builder.j - 1;
        int i2 = (int) builder.D;
        FrameLayout frameLayout = this.f.h;
        int iOrdinal = builder.n.ordinal();
        if (iOrdinal == 0) {
            frameLayout.setPadding(i2, i, i2, i < i2 ? i2 : i);
            return;
        }
        if (iOrdinal == 1) {
            frameLayout.setPadding(i2, i, i2, i < i2 ? i2 : i);
        } else if (iOrdinal == 2) {
            frameLayout.setPadding(i, i2, i, i2);
        } else {
            if (iOrdinal != 3) {
                return;
            }
            frameLayout.setPadding(i, i2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(android.widget.TextView r7, android.view.View r8) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.skydoves.balloon.Balloon.j(android.widget.TextView, android.view.View):void");
    }

    public final void k(OnBalloonClickListener onBalloonClickListener) {
        if (onBalloonClickListener == null) {
            return;
        }
        this.f.j.setOnClickListener(new au.com.woolworths.base.shopapp.customviews.a(onBalloonClickListener, this));
    }

    public final /* synthetic */ void l(Function1 function1) {
        k(new BalloonKt$sam$com_skydoves_balloon_OnBalloonClickListener$0(function1));
    }

    public final void m(Function0 function0) {
        this.h.setOnDismissListener(new b(this, new BalloonKt$sam$com_skydoves_balloon_OnBalloonDismissListener$0(function0)));
    }

    public final void n(Function1 function1) {
        this.l = new BalloonKt$sam$com_skydoves_balloon_OnBalloonInitializedListener$0(function1);
    }

    public final void o(Function2 function2) {
        this.h.setTouchInterceptor(new Balloon$setOnBalloonOutsideTouchListener$1(this, new BalloonKt$sam$com_skydoves_balloon_OnBalloonOutsideTouchListener$0(function2)));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        Lifecycle d;
        this.k = true;
        this.i.dismiss();
        this.h.dismiss();
        LifecycleOwner lifecycleOwner2 = this.e.P;
        if (lifecycleOwner2 == null || (d = lifecycleOwner2.getD()) == null) {
            return;
        }
        d.c(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
    }

    public final void p(Function0 function0) {
        this.g.d.setOnClickListener(new androidx.navigation.ui.a(21, new BalloonKt$sam$com_skydoves_balloon_OnBalloonOverlayClickListener$0(function0), this));
    }

    public final void q(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.g(childAt, "getChildAt(index)");
            if (childAt instanceof TextView) {
                j((TextView) childAt, viewGroup);
            } else if (childAt instanceof ViewGroup) {
                q((ViewGroup) childAt);
            }
        }
    }
}
