package com.scandit.datacapture.core;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.core.common.geometry.MarginsF;
import com.scandit.datacapture.core.common.geometry.Rect;
import com.scandit.datacapture.core.internal.module.ui.NativeHintAlignment;
import com.scandit.datacapture.core.internal.module.ui.NativeHintAnchor;
import com.scandit.datacapture.core.internal.module.ui.NativeHintIcon;
import com.scandit.datacapture.core.internal.module.ui.NativeHintStyle;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* renamed from: com.scandit.datacapture.core.g3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1011g3 extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f18524a;
    private final ImageView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1011g3(Context context) {
        super(context);
        Intrinsics.h(context, "context");
        View.inflate(context, R.layout.sc_hint_view_v2, this);
        View viewFindViewById = findViewById(R.id.textView);
        Intrinsics.g(viewFindViewById, "findViewById(R.id.textView)");
        this.f18524a = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.iconView);
        Intrinsics.g(viewFindViewById2, "findViewById(R.id.iconView)");
        this.b = (ImageView) viewFindViewById2;
        setBackgroundResource(R.drawable.sc_hint_view_background);
        setAlpha(BitmapDescriptorFactory.HUE_RED);
    }

    public final void a(String text) {
        Intrinsics.h(text, "text");
        this.f18524a.setText(text);
    }

    public final void b(NativeHintStyle hintStyle, Rect rect) {
        int i;
        int i2;
        Intrinsics.h(hintStyle, "hintStyle");
        int i3 = hintStyle.getFitToText() ? -2 : -1;
        Object parent = getParent();
        Intrinsics.f(parent, "null cannot be cast to non-null type android.view.View");
        int width = ((View) parent).getWidth();
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        int iMin = Math.min(width, Math.min(displayMetrics.heightPixels, displayMetrics.widthPixels));
        Intrinsics.f(getParent(), "null cannot be cast to non-null type android.view.View");
        int iB = MathKt.b(PixelExtensionsKt.pxFromDp$default(hintStyle.getHorizontalMargin(), (Context) null, 1, (Object) null) + ((((View) r4).getWidth() - (hintStyle.getMaxWidthFraction() * iMin)) / 2.0f));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i3, -2);
        layoutParams.addRule(14);
        a(layoutParams, hintStyle, rect, iB);
        setLayoutParams(layoutParams);
        MarginsF padding = hintStyle.getPadding();
        Intrinsics.g(padding, "hintStyle.padding");
        setPadding(MathKt.b(PixelExtensionsKt.pxFromDp$default(padding.getLeft(), (Context) null, 1, (Object) null)), MathKt.b(PixelExtensionsKt.pxFromDp$default(padding.getTop(), (Context) null, 1, (Object) null)), MathKt.b(PixelExtensionsKt.pxFromDp$default(padding.getRight(), (Context) null, 1, (Object) null)), MathKt.b(PixelExtensionsKt.pxFromDp$default(padding.getBottom(), (Context) null, 1, (Object) null)));
        TextView textView = this.f18524a;
        textView.setTextSize(2, hintStyle.getTextSize());
        NativeColor textColor = hintStyle.getTextColor();
        Intrinsics.g(textColor, "hintStyle.textColor");
        textView.setTextColor(Color.argb((int) ((textColor.getA() * 255.0f) + 0.5f), (int) ((textColor.getR() * 255.0f) + 0.5f), (int) ((textColor.getG() * 255.0f) + 0.5f), (int) ((textColor.getB() * 255.0f) + 0.5f)));
        NativeHintAlignment textAlignment = hintStyle.getTextAlignment();
        Intrinsics.e(textAlignment);
        int i4 = AbstractC1002f3.f18496a[textAlignment.ordinal()];
        if (i4 == 1) {
            i = 8388627;
        } else if (i4 == 2) {
            i = 17;
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = 8388629;
        }
        textView.setGravity(i);
        textView.setMaxLines(hintStyle.getMaxLines());
        textView.setLineSpacing(PixelExtensionsKt.pxFromSp$default((hintStyle.getLineHeight() >= BitmapDescriptorFactory.HUE_RED ? hintStyle.getLineHeight() : hintStyle.getTextSize()) - hintStyle.getTextSize(), null, 1, null), 1.0f);
        int i5 = 0;
        textView.setTypeface(Typeface.create(null, hintStyle.getTextWeight(), false));
        float cornerRadius = hintStyle.getCornerRadius();
        NativeColor backgroundColor = hintStyle.getBackgroundColor();
        Intrinsics.g(backgroundColor, "hintStyle.backgroundColor");
        Drawable background = getBackground();
        Intrinsics.f(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        gradientDrawable.setCornerRadius(PixelExtensionsKt.pxFromDp$default(cornerRadius, (Context) null, 1, (Object) null));
        gradientDrawable.setTint(Color.argb((int) ((backgroundColor.getA() * 255.0f) + 0.5f), (int) ((backgroundColor.getR() * 255.0f) + 0.5f), (int) ((backgroundColor.getG() * 255.0f) + 0.5f), (int) ((backgroundColor.getB() * 255.0f) + 0.5f)));
        if (hintStyle.getHintIcon() == NativeHintIcon.NONE) {
            this.b.setVisibility(8);
        } else {
            this.b.setVisibility(0);
            NativeHintIcon hintIcon = hintStyle.getHintIcon();
            Intrinsics.g(hintIcon, "hintStyle.hintIcon");
            int i6 = AbstractC1020h3.f18529a[hintIcon.ordinal()];
            if (i6 == 1) {
                i2 = 0;
            } else if (i6 == 2) {
                i2 = R.drawable.sc_ic_hint_check;
            } else {
                if (i6 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R.drawable.sc_ic_hint_exclamation_mark;
            }
            this.b.setImageResource(i2);
            ImageView imageView = this.b;
            NativeColor iconColor = hintStyle.getIconColor();
            Intrinsics.g(iconColor, "hintStyle.iconColor");
            imageView.setImageTintList(ColorStateList.valueOf(Color.argb((int) ((iconColor.getA() * 255.0f) + 0.5f), (int) ((iconColor.getR() * 255.0f) + 0.5f), (int) ((iconColor.getG() * 255.0f) + 0.5f), (int) ((iconColor.getB() * 255.0f) + 0.5f))));
            ViewGroup.LayoutParams layoutParams2 = this.b.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.rightMargin = PixelExtensionsKt.pxFromDp$default(8, (Context) null, 1, (Object) null);
                this.b.setLayoutParams(marginLayoutParams);
            }
        }
        NativeHintIcon hintIcon2 = hintStyle.getHintIcon();
        Intrinsics.g(hintIcon2, "hintStyle.hintIcon");
        if (AbstractC1002f3.b[hintIcon2.ordinal()] != 1) {
            this.f18524a.onPreDraw();
            int topPadding = this.f18524a.getLayout().getTopPadding() + ((PixelExtensionsKt.pxFromDp$default(24, (Context) null, 1, (Object) null) - this.f18524a.getLayout().getLineBaseline(0)) / 2);
            if (topPadding >= 0) {
                i5 = topPadding;
            }
        }
        ViewGroup.LayoutParams layoutParams3 = this.f18524a.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.topMargin = i5;
            marginLayoutParams2.bottomMargin = i5;
            this.f18524a.setLayoutParams(marginLayoutParams2);
        }
    }

    public final void a(NativeHintStyle hintStyle, Rect rect) {
        Intrinsics.h(hintStyle, "hintStyle");
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Intrinsics.f(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        a(layoutParams2, hintStyle, rect, layoutParams2.leftMargin);
        setLayoutParams(layoutParams2);
    }

    private final void a(RelativeLayout.LayoutParams layoutParams, NativeHintStyle nativeHintStyle, Rect rect, int i) {
        layoutParams.removeRule(10);
        layoutParams.removeRule(12);
        int iB = MathKt.b(PixelExtensionsKt.pxFromDp$default(nativeHintStyle.getHintAnchorOffset(), (Context) null, 1, (Object) null));
        int i2 = 0;
        if (nativeHintStyle.getHintAnchor() != NativeHintAnchor.TOP && rect != null) {
            if (nativeHintStyle.getHintAnchor() == NativeHintAnchor.ABOVE_VIEW_FINDER) {
                Object parent = getParent();
                Intrinsics.f(parent, "null cannot be cast to non-null type android.view.View");
                int height = (((View) parent).getHeight() - MathKt.b(PixelExtensionsKt.pxFromDp$default(rect.getOrigin().getY(), (Context) null, 1, (Object) null))) + iB;
                layoutParams.addRule(12);
                iB = 0;
                i2 = height;
            } else if (nativeHintStyle.getHintAnchor() == NativeHintAnchor.BELOW_VIEW_FINDER) {
                iB += MathKt.b(PixelExtensionsKt.pxFromDp$default(rect.getSize().getHeight() + rect.getOrigin().getY(), (Context) null, 1, (Object) null));
                layoutParams.addRule(10);
            } else {
                throw new UnsupportedOperationException("Unsupported anchor " + nativeHintStyle.getHintAnchor());
            }
        } else {
            layoutParams.addRule(10);
        }
        layoutParams.setMargins(i, iB, i, i2);
    }
}
