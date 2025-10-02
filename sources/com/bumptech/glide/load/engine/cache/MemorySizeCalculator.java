package com.bumptech.glide.load.engine.cache;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class MemorySizeCalculator {

    /* renamed from: a, reason: collision with root package name */
    public final int f13837a;
    public final int b;
    public final int c;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final Context f13838a;
        public final ActivityManager b;
        public final DisplayMetricsScreenDimensions c;
        public final float d;

        public Builder(Context context) {
            this.d = 1;
            this.f13838a = context;
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            this.b = activityManager;
            this.c = new DisplayMetricsScreenDimensions(context.getResources().getDisplayMetrics());
            if (activityManager.isLowRamDevice()) {
                this.d = BitmapDescriptorFactory.HUE_RED;
            }
        }
    }

    public static final class DisplayMetricsScreenDimensions implements ScreenDimensions {

        /* renamed from: a, reason: collision with root package name */
        public final DisplayMetrics f13839a;

        public DisplayMetricsScreenDimensions(DisplayMetrics displayMetrics) {
            this.f13839a = displayMetrics;
        }
    }

    public interface ScreenDimensions {
    }

    public MemorySizeCalculator(Builder builder) {
        Context context = builder.f13838a;
        float f = builder.d;
        ActivityManager activityManager = builder.b;
        int i = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.c = i;
        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = builder.c.f13839a;
        float f2 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int iRound2 = Math.round(f2 * f);
        int iRound3 = Math.round(f2 * 2.0f);
        int i2 = iRound - i;
        int i3 = iRound3 + iRound2;
        if (i3 <= i2) {
            this.b = iRound3;
            this.f13837a = iRound2;
        } else {
            float f3 = i2 / (f + 2.0f);
            this.b = Math.round(2.0f * f3);
            this.f13837a = Math.round(f3 * f);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb.append(Formatter.formatFileSize(context, this.b));
            sb.append(", pool size: ");
            sb.append(Formatter.formatFileSize(context, this.f13837a));
            sb.append(", byte array size: ");
            sb.append(Formatter.formatFileSize(context, i));
            sb.append(", memory class limited? ");
            sb.append(i3 > iRound);
            sb.append(", max size: ");
            sb.append(Formatter.formatFileSize(context, iRound));
            sb.append(", memoryClass: ");
            sb.append(activityManager.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }
}
