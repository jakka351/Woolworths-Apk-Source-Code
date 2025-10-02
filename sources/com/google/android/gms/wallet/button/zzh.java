package com.google.android.gms.wallet.button;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import androidx.annotation.AttrRes;

/* loaded from: classes2.dex */
public final class zzh {
    public static Drawable zza(Context context, @AttrRes int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{i});
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        return drawable == null ? new GradientDrawable() : drawable;
    }
}
