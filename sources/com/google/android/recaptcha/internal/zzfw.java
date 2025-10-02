package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.Arrays;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class zzfw {

    @NotNull
    private final WebView zza;

    @NotNull
    private final CoroutineScope zzb;

    public zzfw(@NotNull WebView webView, @NotNull CoroutineScope coroutineScope) {
        this.zza = webView;
        this.zzb = coroutineScope;
    }

    public final void zzb(@NotNull String str, @NotNull String... strArr) {
        BuildersKt.c(this.zzb, null, null, new zzfv((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null), 3);
    }
}
