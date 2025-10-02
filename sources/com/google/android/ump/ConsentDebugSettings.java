package com.google.android.ump;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class ConsentDebugSettings {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14778a;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f14779a = new ArrayList();
        public final Context b;

        public Builder(@RecentlyNonNull Context context) {
            this.b = context.getApplicationContext();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface DebugGeography {
    }
}
