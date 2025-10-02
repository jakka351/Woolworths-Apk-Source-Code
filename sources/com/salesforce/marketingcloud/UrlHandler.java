package com.salesforce.marketingcloud;

import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@MCKeep
/* loaded from: classes6.dex */
public interface UrlHandler {

    @NonNull
    public static final String ACTION = "action";

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @Nullable
    PendingIntent handleUrl(@NonNull Context context, @NonNull String str, @NonNull String str2);
}
