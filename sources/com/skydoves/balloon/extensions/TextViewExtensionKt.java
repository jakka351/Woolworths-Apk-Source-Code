package com.skydoves.balloon.extensions;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import com.skydoves.balloon.IconGravity;
import com.skydoves.balloon.vectortext.VectorTextViewParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"balloon_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class TextViewExtensionKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[IconGravity.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final void a(TextView textView, VectorTextViewParams vectorTextViewParams) {
        Drawable drawableA;
        Drawable drawableA2;
        Drawable drawableA3;
        Intrinsics.h(vectorTextViewParams, "vectorTextViewParams");
        Integer num = vectorTextViewParams.n;
        Integer num2 = vectorTextViewParams.k;
        Integer numValueOf = vectorTextViewParams.i;
        Drawable drawableA4 = null;
        if (numValueOf == null) {
            Integer num3 = vectorTextViewParams.m;
            numValueOf = num3 != null ? Integer.valueOf(textView.getContext().getResources().getDimensionPixelSize(num3.intValue())) : null;
            if (numValueOf == null) {
                numValueOf = num != null ? Integer.valueOf(textView.getContext().getResources().getDimensionPixelSize(num.intValue())) : null;
            }
        }
        Integer numValueOf2 = vectorTextViewParams.h;
        if (numValueOf2 == null) {
            Integer num4 = vectorTextViewParams.l;
            numValueOf2 = num4 != null ? Integer.valueOf(textView.getContext().getResources().getDimensionPixelSize(num4.intValue())) : null;
            if (numValueOf2 == null) {
                numValueOf2 = num != null ? Integer.valueOf(textView.getContext().getResources().getDimensionPixelSize(num.intValue())) : null;
            }
        }
        Integer num5 = vectorTextViewParams.f19025a;
        Drawable drawableB = num5 != null ? AppCompatResources.b(num5.intValue(), textView.getContext()) : null;
        if (drawableB != null) {
            Context context = textView.getContext();
            Intrinsics.g(context, "context");
            drawableA = DrawableExtensionKt.a(drawableB, context, numValueOf2, numValueOf);
            DrawableExtensionKt.b(drawableA, num2);
        } else {
            drawableA = null;
        }
        Integer num6 = vectorTextViewParams.b;
        Drawable drawableB2 = num6 != null ? AppCompatResources.b(num6.intValue(), textView.getContext()) : null;
        if (drawableB2 != null) {
            Context context2 = textView.getContext();
            Intrinsics.g(context2, "context");
            drawableA2 = DrawableExtensionKt.a(drawableB2, context2, numValueOf2, numValueOf);
            DrawableExtensionKt.b(drawableA2, num2);
        } else {
            drawableA2 = null;
        }
        Integer num7 = vectorTextViewParams.c;
        Drawable drawableB3 = num7 != null ? AppCompatResources.b(num7.intValue(), textView.getContext()) : null;
        if (drawableB3 != null) {
            Context context3 = textView.getContext();
            Intrinsics.g(context3, "context");
            drawableA3 = DrawableExtensionKt.a(drawableB3, context3, numValueOf2, numValueOf);
            DrawableExtensionKt.b(drawableA3, num2);
        } else {
            drawableA3 = null;
        }
        Integer num8 = vectorTextViewParams.d;
        Drawable drawableB4 = num8 != null ? AppCompatResources.b(num8.intValue(), textView.getContext()) : null;
        if (drawableB4 != null) {
            Context context4 = textView.getContext();
            Intrinsics.g(context4, "context");
            drawableA4 = DrawableExtensionKt.a(drawableB4, context4, numValueOf2, numValueOf);
            DrawableExtensionKt.b(drawableA4, num2);
        }
        if (vectorTextViewParams.e) {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawableA2, drawableA4, drawableA, drawableA3);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawableA, drawableA4, drawableA2, drawableA3);
        }
        Integer num9 = vectorTextViewParams.g;
        if (num9 != null) {
            textView.setCompoundDrawablePadding(num9.intValue());
        } else {
            Integer num10 = vectorTextViewParams.j;
            if (num10 != null) {
                textView.setCompoundDrawablePadding(textView.getContext().getResources().getDimensionPixelSize(num10.intValue()));
            }
        }
        textView.setContentDescription(vectorTextViewParams.f);
    }
}
