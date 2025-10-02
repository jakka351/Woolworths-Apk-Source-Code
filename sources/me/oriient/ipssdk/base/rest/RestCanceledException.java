package me.oriient.ipssdk.base.rest;

import androidx.annotation.Keep;
import kotlin.Metadata;

@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lme/oriient/ipssdk/base/rest/RestCanceledException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "me.oriient.sdk-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RestCanceledException extends Exception {
    public RestCanceledException() {
        super("rest call was canceled");
    }
}
