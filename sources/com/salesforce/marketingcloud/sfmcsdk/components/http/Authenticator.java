package com.salesforce.marketingcloud.sfmcsdk.components.http;

import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\nJ\u0016\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H&J\u0016\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H&¨\u0006\r"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/http/Authenticator;", "", "()V", "deleteCachedToken", "", "getAuthTokenHeader", "Lkotlin/Pair;", "", "forceRefresh", "", "getAuthTokenHeader$sfmcsdk_release", "getCachedTokenHeader", "refreshAuthTokenHeader", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class Authenticator {
    public static /* synthetic */ Pair getAuthTokenHeader$sfmcsdk_release$default(Authenticator authenticator, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAuthTokenHeader");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return authenticator.getAuthTokenHeader$sfmcsdk_release(z);
    }

    public abstract void deleteCachedToken();

    @Nullable
    public final synchronized Pair<String, String> getAuthTokenHeader$sfmcsdk_release(boolean forceRefresh) {
        Pair<String, String> cachedTokenHeader;
        try {
            if (forceRefresh || (cachedTokenHeader = getCachedTokenHeader()) == null) {
                cachedTokenHeader = refreshAuthTokenHeader();
            }
        } catch (Throwable th) {
            throw th;
        }
        return cachedTokenHeader;
    }

    @Nullable
    public abstract Pair<String, String> getCachedTokenHeader();

    @Nullable
    public abstract Pair<String, String> refreshAuthTokenHeader();
}
