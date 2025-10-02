package com.scandit.datacapture.core.extensions;

import com.google.android.gms.ads.RequestConfiguration;
import com.salesforce.marketingcloud.UrlHandler;
import com.scandit.datacapture.core.common.async.Callback;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Callback", "Lcom/scandit/datacapture/core/common/async/Callback;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, UrlHandler.ACTION, "Lkotlin/Function1;", "", "scandit-capture-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LambdaExtensionsKt {
    @NotNull
    public static final <T> Callback<T> Callback(@NotNull final Function1<? super T, Unit> action) {
        Intrinsics.h(action, "action");
        return new Callback<T>() { // from class: com.scandit.datacapture.core.extensions.LambdaExtensionsKt.Callback.1
            @Override // com.scandit.datacapture.core.common.async.Callback
            public void run(T result) {
                action.invoke(result);
            }
        };
    }
}
