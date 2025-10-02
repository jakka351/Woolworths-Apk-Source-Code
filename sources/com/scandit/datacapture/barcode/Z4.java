package com.scandit.datacapture.barcode;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconStyle;
import com.scandit.datacapture.core.internal.sdk.ui.interpolators.EaseInOutSineInterpolator;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
final class Z4 implements X4 {
    private static final Lazy n = LazyKt.b(Y4.f17353a);

    /* renamed from: a, reason: collision with root package name */
    private final Function2 f17365a;
    private final View b;
    private final View c;
    private final View d;
    private final ImageView e;
    private final ImageView f;
    private final ImageView g;
    private final TextView h;
    private int i;
    private int j;
    private J4 k;
    private BarcodePickState l;
    private T4 m;

    public Z4(FrameLayout container, J4 initialDrawData, Function2 layoutRefresher) {
        Intrinsics.h(container, "container");
        Intrinsics.h(initialDrawData, "initialDrawData");
        Intrinsics.h(layoutRefresher, "layoutRefresher");
        this.f17365a = layoutRefresher;
        this.k = initialDrawData;
        this.m = T4.Collapsed;
        View viewInflate = LayoutInflater.from(container.getContext()).inflate(R.layout.sc_pick_status, (ViewGroup) null);
        Intrinsics.g(viewInflate, "from(container.context).…out.sc_pick_status, null)");
        this.b = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R.id.bubble);
        Intrinsics.g(viewFindViewById, "rootView.findViewById(R.id.bubble)");
        this.c = viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.arrow);
        Intrinsics.g(viewFindViewById2, "rootView.findViewById(R.id.arrow)");
        this.e = (ImageView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.iconContainer);
        Intrinsics.g(viewFindViewById3, "rootView.findViewById(R.id.iconContainer)");
        this.d = viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R.id.icon);
        Intrinsics.g(viewFindViewById4, "rootView.findViewById(R.id.icon)");
        this.g = (ImageView) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(R.id.iconBackground);
        Intrinsics.g(viewFindViewById5, "rootView.findViewById(R.id.iconBackground)");
        this.f = (ImageView) viewFindViewById5;
        View viewFindViewById6 = viewInflate.findViewById(R.id.text);
        Intrinsics.g(viewFindViewById6, "rootView.findViewById(R.id.text)");
        this.h = (TextView) viewFindViewById6;
        h();
        c();
    }

    private final void h() {
        this.h.setTypeface(Typeface.create(null, 600, false));
        this.h.setPadding(0, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$0$a$-Lkotlin-jvm-functions-Function1--V, reason: not valid java name */
    public static /* synthetic */ void m292instrumented$0$a$LkotlinjvmfunctionsFunction1V(Function1 function1, View view) {
        Callback.g(view);
        try {
            a(function1, view);
        } finally {
            Callback.h();
        }
    }

    @Override // com.scandit.datacapture.barcode.X4
    public final void a(J4 drawData) {
        Intrinsics.h(drawData, "drawData");
        if (this.k.a() != drawData.a()) {
            this.l = this.k.a();
        }
        this.k = drawData;
    }

    @Override // com.scandit.datacapture.barcode.X4
    public final T4 d() {
        return this.m;
    }

    @Override // com.scandit.datacapture.barcode.X4
    public final int e() {
        ViewParent parent = this.b.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            return viewGroup.getWidth();
        }
        return 0;
    }

    @Override // com.scandit.datacapture.barcode.X4
    public final BarcodePickState f() {
        return this.l;
    }

    @Override // com.scandit.datacapture.barcode.X4
    public final View getView() {
        return this.b;
    }

    @Override // com.scandit.datacapture.barcode.X4
    public final void b(Function0 onFinished) {
        Intrinsics.h(onFinished, "onFinished");
        if (this.m == T4.Collapsed) {
            CharSequence text = this.h.getText();
            Intrinsics.g(text, "textView.text");
            if (!StringsKt.D(text)) {
                a(T4.Expanded, onFinished);
                return;
            }
        }
        onFinished.invoke();
    }

    @Override // com.scandit.datacapture.barcode.X4
    public final void c() {
        T4 t4 = T4.Collapsed;
        Intrinsics.h(t4, "<set-?>");
        this.m = t4;
        this.j = 0;
        TextView textView = this.h;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Intrinsics.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = 0;
        marginLayoutParams.setMarginStart(0);
        marginLayoutParams.setMarginEnd(0);
        textView.setLayoutParams(marginLayoutParams);
    }

    @Override // com.scandit.datacapture.barcode.X4
    public final void a(Function0 onFinished) {
        Intrinsics.h(onFinished, "onFinished");
        if (this.m == T4.Expanded) {
            a(T4.Collapsed, onFinished);
        } else {
            onFinished.invoke();
        }
    }

    @Override // com.scandit.datacapture.barcode.X4
    public final int b() {
        return this.i + this.j;
    }

    @Override // com.scandit.datacapture.barcode.X4
    public final void a(BarcodePickStatusIconStyle style) {
        Intrinsics.h(style, "style");
        if (style instanceof BarcodePickStatusIconStyle.BarcodePickStatusIconStyleWithIcon) {
            BarcodePickStatusIconStyle.BarcodePickStatusIconStyleWithIcon barcodePickStatusIconStyleWithIcon = (BarcodePickStatusIconStyle.BarcodePickStatusIconStyleWithIcon) style;
            a(barcodePickStatusIconStyleWithIcon.getText());
            this.g.setImageBitmap(barcodePickStatusIconStyleWithIcon.getIcon());
            return;
        }
        if (style instanceof BarcodePickStatusIconStyle.BarcodePickStatusIconStyleWithColors) {
            BarcodePickStatusIconStyle.BarcodePickStatusIconStyleWithColors barcodePickStatusIconStyleWithColors = (BarcodePickStatusIconStyle.BarcodePickStatusIconStyleWithColors) style;
            a(barcodePickStatusIconStyleWithColors.getText());
            int iconBackgroundColor = barcodePickStatusIconStyleWithColors.getIconBackgroundColor();
            int iconColor = barcodePickStatusIconStyleWithColors.getIconColor();
            ImageView imageView = this.f;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView.setColorFilter(iconBackgroundColor, mode);
            this.g.setColorFilter(iconColor, mode);
        }
    }

    @Override // com.scandit.datacapture.barcode.X4
    public final void a(Function1 action) {
        Intrinsics.h(action, "action");
        this.b.setOnClickListener(new df(action, 2));
    }

    private static final void a(Function1 tmp0, View view) {
        Intrinsics.h(tmp0, "$tmp0");
        tmp0.invoke(view);
    }

    @Override // com.scandit.datacapture.barcode.X4
    public final void a(int i) {
        int i2 = (int) (i * 0.14285715f);
        int i3 = i - (i2 * 2);
        View view = this.d;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.height = i3;
        marginLayoutParams.width = i3;
        view.setLayoutParams(marginLayoutParams);
        View view2 = this.c;
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        layoutParams2.height = i;
        view2.setLayoutParams(layoutParams2);
        this.c.setPadding(i2, 0, i2, 0);
        this.h.setTextSize(0, i3);
        this.i = i;
    }

    @Override // com.scandit.datacapture.barcode.X4
    public final void a(int i, boolean z) {
        this.e.setVisibility(!z ? 8 : 0);
        if (z) {
            ImageView imageView = this.e;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            Intrinsics.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = PixelExtensionsKt.pxFromDp$default(-1, (Context) null, 1, (Object) null);
            marginLayoutParams.leftMargin = i;
            imageView.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // com.scandit.datacapture.barcode.X4
    public final void a(int i, int i2) {
        this.b.setX(i);
        this.b.setY(i2);
    }

    @Override // com.scandit.datacapture.barcode.X4
    public final int a() {
        return this.i;
    }

    private final void a(String str) {
        if (str != null && !StringsKt.D(str)) {
            TextView textView = this.h;
            if (str.length() > 20) {
                String strSubstring = str.substring(0, 20);
                Intrinsics.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                str = strSubstring.concat("…");
            }
            textView.setText(str);
            return;
        }
        this.h.setText((CharSequence) null);
    }

    private final void a(T4 t4, final Function0 function0) {
        final int i;
        int iMeasureText;
        this.b.bringToFront();
        T4 t42 = T4.Animating;
        Intrinsics.h(t42, "<set-?>");
        this.m = t42;
        final boolean z = t4 == T4.Expanded;
        if (z) {
            i = 0;
        } else {
            int iMeasureText2 = (int) this.h.getPaint().measureText(this.h.getText().toString());
            int iE = (e() - this.i) - ((Number) n.getD()).intValue();
            if (iMeasureText2 > iE) {
                iMeasureText2 = iE;
            }
            i = iMeasureText2;
        }
        if (z) {
            iMeasureText = (int) this.h.getPaint().measureText(this.h.getText().toString());
            int iE2 = (e() - this.i) - ((Number) n.getD()).intValue();
            if (iMeasureText > iE2) {
                iMeasureText = iE2;
            }
        } else {
            iMeasureText = 0;
        }
        final int i2 = iMeasureText - i;
        final int iIntValue = z ? 0 : ((Number) n.getD()).intValue();
        final int iIntValue2 = (z ? ((Number) n.getD()).intValue() : 0) - iIntValue;
        final float f = z ? 0.0f : 1.0f;
        final float f2 = (z ? 1.0f : 0.0f) - f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.scandit.datacapture.barcode.mf
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Z4.a(i, i2, iIntValue, iIntValue2, f, f2, this, z, function0, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.setInterpolator(new EaseInOutSineInterpolator());
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(int i, int i2, int i3, int i4, float f, float f2, Z4 this$0, boolean z, Function0 onFinished, ValueAnimator valueAnimator) {
        T4 t4;
        Intrinsics.h(this$0, "this$0");
        Intrinsics.h(onFinished, "$onFinished");
        Intrinsics.h(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        int i5 = (int) ((i2 * fFloatValue) + i);
        int i6 = (int) ((i4 * fFloatValue) + i3);
        TextView textView = this$0.h;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Intrinsics.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = i5;
        marginLayoutParams.leftMargin = i6;
        textView.setLayoutParams(marginLayoutParams);
        this$0.h.setAlpha((f2 * fFloatValue) + f);
        this$0.j = i5 + i6;
        this$0.f17365a.invoke(this$0, this$0.k);
        if (fFloatValue == 1.0f) {
            if (z) {
                t4 = T4.Expanded;
            } else {
                t4 = T4.Collapsed;
            }
            Intrinsics.h(t4, "<set-?>");
            this$0.m = t4;
            onFinished.invoke();
        }
    }
}
