package au.com.woolworths.base.shopapp.customviews;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.activity.ComponentActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.camera.core.processing.g;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.c;
import androidx.navigation.compose.h;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.modules.customviews.coachmark.CoachMarkBuilder;
import au.com.woolworths.base.shopapp.databinding.SimpleCoachMarkContentBinding;
import com.google.android.material.color.MaterialColors;
import com.skydoves.balloon.ArrowOrientation;
import com.skydoves.balloon.ArrowOrientationRules;
import com.skydoves.balloon.ArrowPositionRules;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.BalloonAnimation;
import com.skydoves.balloon.databinding.BalloonLayoutBodyBinding;
import com.skydoves.balloon.databinding.BalloonLayoutOverlayBinding;
import com.skydoves.balloon.overlay.BalloonOverlayAnimation;
import com.skydoves.balloon.overlay.BalloonOverlayShape;
import com.woolworths.R;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base-shop-app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SimpleCoachMarkSettingsKt {

    /* renamed from: a, reason: collision with root package name */
    public static final h f4616a = new h(6, 0);

    public static void a(final ComponentActivity componentActivity, ViewGroup parentView, final View anchorView, final SimpleCoachMarkSettings simpleCoachMarkSettings, Function2 function2, final Function1 function1, Function0 function0, int i, int i2, int i3) {
        final Function2 function22 = (i3 & 8) != 0 ? f4616a : function2;
        final Function0 function02 = (i3 & 32) != 0 ? null : function0;
        final int i4 = (i3 & 64) != 0 ? 0 : i;
        final int i5 = (i3 & 128) != 0 ? 0 : i2;
        long j = (i3 & 256) != 0 ? 0L : 500L;
        Intrinsics.h(componentActivity, "<this>");
        Intrinsics.h(parentView, "parentView");
        Intrinsics.h(anchorView, "anchorView");
        LayoutInflater layoutInflater = componentActivity.getLayoutInflater();
        int i6 = SimpleCoachMarkContentBinding.C;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        final SimpleCoachMarkContentBinding simpleCoachMarkContentBinding = (SimpleCoachMarkContentBinding) ViewDataBinding.q(layoutInflater, R.layout.simple_coach_mark_content, parentView, false, null);
        simpleCoachMarkContentBinding.L(simpleCoachMarkSettings);
        Integer num = simpleCoachMarkSettings.d;
        if (num != null) {
            simpleCoachMarkContentBinding.z.setTextColor(num.intValue());
        }
        simpleCoachMarkContentBinding.l();
        View rootView = parentView.getRootView();
        Intrinsics.g(rootView, "getRootView(...)");
        rootView.postDelayed(new Runnable() { // from class: au.com.woolworths.base.shopapp.customviews.SimpleCoachMarkSettingsKt$showSimpleCoachMark$$inlined$postDelayed$1
            @Override // java.lang.Runnable
            public final void run() {
                final SimpleCoachMarkContentBinding simpleCoachMarkContentBinding2 = simpleCoachMarkContentBinding;
                View view = simpleCoachMarkContentBinding2.h;
                Intrinsics.g(view, "getRoot(...)");
                SimpleCoachMarkSettings simpleCoachMarkSettings2 = simpleCoachMarkSettings;
                int i7 = simpleCoachMarkSettings2.e;
                ComponentActivity componentActivity2 = componentActivity;
                CoachMarkBuilder coachMarkBuilder = new CoachMarkBuilder(componentActivity2, componentActivity2, view, simpleCoachMarkSettings2);
                coachMarkBuilder.d = function1;
                final Function2 function23 = function22;
                coachMarkBuilder.e = new Function1<Balloon, Unit>() { // from class: au.com.woolworths.base.shopapp.customviews.SimpleCoachMarkSettingsKt$showSimpleCoachMark$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Balloon it = (Balloon) obj;
                        Intrinsics.h(it, "it");
                        function23.invoke(simpleCoachMarkContentBinding2, it);
                        return Unit.f24250a;
                    }
                };
                coachMarkBuilder.f = function02;
                BalloonOverlayShape overlayShape = simpleCoachMarkSettings2.j;
                boolean z = simpleCoachMarkSettings2.i;
                final View anchorView2 = anchorView;
                Intrinsics.h(anchorView2, "anchorView");
                Intrinsics.h(overlayShape, "overlayShape");
                Balloon.Builder builder = new Balloon.Builder(componentActivity2);
                builder.E = view;
                builder.P = componentActivity2;
                builder.b = Integer.MIN_VALUE;
                builder.e = Integer.MIN_VALUE;
                builder.h = true;
                ArrowOrientationRules arrowOrientationRules = simpleCoachMarkSettings2.f;
                Intrinsics.h(arrowOrientationRules, "<set-?>");
                builder.m = arrowOrientationRules;
                ArrowOrientation arrowOrientation = simpleCoachMarkSettings2.g;
                Intrinsics.h(arrowOrientation, "<set-?>");
                builder.n = arrowOrientation;
                builder.l = ArrowPositionRules.e;
                builder.k = simpleCoachMarkSettings2.h;
                builder.j = componentActivity2.getResources().getDimensionPixelSize(R.dimen.coach_mark_arrow_size);
                Context context = builder.f19012a;
                Drawable drawableB = AppCompatResources.b(R.drawable.coach_mark_arrow, context);
                builder.o = drawableB != null ? drawableB.mutate() : null;
                if (drawableB != null && builder.j == Integer.MIN_VALUE) {
                    builder.j = Math.max(drawableB.getIntrinsicWidth(), drawableB.getIntrinsicHeight());
                }
                if (i7 != 0) {
                    builder.i = context.getColor(i7);
                    builder.q = context.getColor(i7);
                } else {
                    int iC = MaterialColors.c(componentActivity2, R.attr.colorSurface, -1);
                    builder.i = iC;
                    builder.q = iC;
                }
                builder.F = z;
                builder.I = overlayShape;
                if (z) {
                    builder.G = context.getColor(R.color.color_black_900_alpha_30);
                }
                builder.H = context.getResources().getDimension(R.dimen.eighth_default_padding);
                builder.S = BalloonAnimation.d;
                builder.T = BalloonOverlayAnimation.d;
                Function0 function03 = coachMarkBuilder.f;
                if (function03 != null) {
                    builder.a(function03);
                    builder.b(function03);
                }
                builder.s = TypedValue.applyDimension(1, 6.0f / ContextExtKt.a(1.0f, componentActivity2), Resources.getSystem().getDisplayMetrics());
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(builder.q);
                gradientDrawable.setCornerRadius(ContextExtKt.a(6.0f, componentActivity2));
                builder.r = gradientDrawable;
                Function1 function12 = coachMarkBuilder.d;
                if (function12 != null) {
                    function12.invoke(builder);
                }
                final Balloon balloon = new Balloon(context, builder);
                Function1 function13 = coachMarkBuilder.e;
                if (function13 != null) {
                    ((SimpleCoachMarkSettingsKt$showSimpleCoachMark$1$1) function13).invoke(balloon);
                }
                final View[] viewArr = {anchorView2};
                final View view2 = viewArr[0];
                if (balloon.b(view2)) {
                    final int i8 = i4;
                    final int i9 = i5;
                    view2.post(new Runnable() { // from class: com.skydoves.balloon.Balloon$showAsDropDown$$inlined$show$1
                        /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kotlin.Lazy] */
                        /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
                        @Override // java.lang.Runnable
                        public final void run() {
                            Balloon balloon2 = balloon;
                            PopupWindow popupWindow = balloon2.h;
                            BalloonLayoutBodyBinding balloonLayoutBodyBinding = balloon2.f;
                            View view3 = view2;
                            boolean zB = balloon2.b(view3);
                            Boolean boolValueOf = Boolean.valueOf(zB);
                            if (!zB) {
                                boolValueOf = null;
                            }
                            if (boolValueOf != null) {
                                Balloon.Builder builder2 = balloon2.e;
                                balloon2.j = true;
                                long j2 = builder2.O;
                                if (j2 != -1) {
                                    ((Handler) balloon2.m.getD()).postDelayed((AutoDismissRunnable) balloon2.n.getD(), j2);
                                }
                                if (balloon2.h()) {
                                    balloon2.q(balloonLayoutBodyBinding.g);
                                } else {
                                    balloon2.j(balloonLayoutBodyBinding.i, balloonLayoutBodyBinding.g);
                                }
                                balloonLayoutBodyBinding.d.measure(0, 0);
                                popupWindow.setWidth(balloon2.g());
                                popupWindow.setHeight(balloon2.f());
                                balloonLayoutBodyBinding.i.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                BalloonLayoutBodyBinding balloonLayoutBodyBinding2 = balloon2.f;
                                ImageView imageView = balloonLayoutBodyBinding2.f;
                                Balloon.Builder builder3 = balloon2.e;
                                int i10 = builder3.j;
                                imageView.setLayoutParams(new FrameLayout.LayoutParams(i10, i10));
                                imageView.setAlpha(builder3.C);
                                Drawable drawable = builder3.o;
                                if (drawable != null) {
                                    imageView.setImageDrawable(drawable);
                                }
                                imageView.setPadding(0, 0, 0, 0);
                                int i11 = builder3.i;
                                if (i11 != Integer.MIN_VALUE) {
                                    imageView.setImageTintList(ColorStateList.valueOf(i11));
                                } else {
                                    imageView.setImageTintList(ColorStateList.valueOf(builder3.q));
                                }
                                imageView.setOutlineProvider(ViewOutlineProvider.BOUNDS);
                                balloonLayoutBodyBinding2.g.post(new g(23, balloon2, view3, imageView));
                                balloon2.i();
                                PopupWindow popupWindow2 = balloon2.i;
                                Balloon.Builder builder4 = balloon2.e;
                                if (builder4.R == Integer.MIN_VALUE) {
                                    if (Balloon.WhenMappings.f19013a[builder4.T.ordinal()] == 1) {
                                        popupWindow2.setAnimationStyle(com.woolworths.R.style.Balloon_Fade_Anim);
                                    } else {
                                        popupWindow2.setAnimationStyle(com.woolworths.R.style.Balloon_Normal_Anim);
                                    }
                                } else {
                                    popupWindow2.setAnimationStyle(builder4.Q);
                                }
                                View[] viewArr2 = viewArr;
                                View[] viewArr3 = (View[]) Arrays.copyOf(viewArr2, viewArr2.length);
                                BalloonLayoutOverlayBinding balloonLayoutOverlayBinding = balloon2.g;
                                Balloon.Builder builder5 = balloon2.e;
                                if (builder5.F) {
                                    View view4 = viewArr3[0];
                                    if (viewArr3.length == 1) {
                                        balloonLayoutOverlayBinding.e.setAnchorView(view4);
                                    } else {
                                        balloonLayoutOverlayBinding.e.setAnchorViewList(ArraysKt.l0(viewArr3));
                                    }
                                    balloon2.i.showAtLocation(view4, builder5.J, 0, 0);
                                }
                                PopupWindow popupWindow3 = balloon2.h;
                                Balloon.Builder builder6 = balloon2.e;
                                int i12 = builder6.Q;
                                if (i12 == Integer.MIN_VALUE) {
                                    int iOrdinal = builder6.S.ordinal();
                                    if (iOrdinal == 0) {
                                        popupWindow3.setAnimationStyle(com.woolworths.R.style.Balloon_Normal_Anim);
                                    } else if (iOrdinal == 1) {
                                        popupWindow3.setAnimationStyle(com.woolworths.R.style.Balloon_Elastic_Anim);
                                    } else if (iOrdinal == 2) {
                                        popupWindow3.setAnimationStyle(com.woolworths.R.style.Balloon_Fade_Anim);
                                    } else if (iOrdinal == 3) {
                                        View contentView = popupWindow3.getContentView();
                                        Intrinsics.g(contentView, "bodyWindow.contentView");
                                        long j3 = builder6.U;
                                        contentView.setVisibility(4);
                                        contentView.post(new c(contentView, j3, 2));
                                        popupWindow3.setAnimationStyle(com.woolworths.R.style.Balloon_Normal_Dispose_Anim);
                                    } else if (iOrdinal == 4) {
                                        popupWindow3.setAnimationStyle(com.woolworths.R.style.Balloon_Overshoot_Anim);
                                    }
                                } else {
                                    popupWindow3.setAnimationStyle(i12);
                                }
                                balloon2.f.e.post(new a(balloon2, 0));
                                balloon.h.showAsDropDown(anchorView2, i8, i9);
                            }
                        }
                    });
                }
            }
        }, j);
    }
}
