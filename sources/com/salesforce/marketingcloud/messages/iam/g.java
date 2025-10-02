package com.salesforce.marketingcloud.messages.iam;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.Dimension;
import androidx.annotation.Nullable;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;

/* loaded from: classes6.dex */
class g {

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17006a;

        static {
            int[] iArr = new int[InAppMessage.Alignment.values().length];
            f17006a = iArr;
            try {
                iArr[InAppMessage.Alignment.center.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17006a[InAppMessage.Alignment.end.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17006a[InAppMessage.Alignment.beginning.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private g() {
    }

    public static int a(InAppMessage.Alignment alignment) {
        int i = a.f17006a[alignment.ordinal()];
        if (i != 1) {
            return i != 2 ? 8388611 : 8388613;
        }
        return 17;
    }

    public static void a(TextView textView, String str, @ColorInt int i, @Dimension float f, int i2) {
        textView.setText(str);
        textView.setTextColor(i);
        textView.setTextSize(0, f);
        textView.setGravity(i2);
    }

    public static Drawable a(@ColorInt int i, float f, @ColorInt int i2, float f2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setColor(i);
        gradientDrawable.setStroke(Math.round(f2), i2);
        return gradientDrawable;
    }

    @ColorInt
    public static int a(Context context, @Nullable String str, @ColorRes int i) {
        try {
            return str != null ? Color.parseColor(str.replace("0x", "#")) : context.getResources().getColor(i);
        } catch (Exception unused) {
            return context.getResources().getColor(i);
        }
    }
}
