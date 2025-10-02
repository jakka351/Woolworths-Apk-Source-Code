package com.woolworths.scanlibrary.util.payment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.design.core.ui.component.experimental.quantitystepper.j;
import au.com.woolworths.pay.sdk.hooks.Retryable;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.i;
import com.woolworths.scanlibrary.data.authentication.token.DefaultTokenProvider;
import com.woolworths.scanlibrary.ui.tap.a;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/util/payment/DefaultRetryService;", "Lcom/woolworths/scanlibrary/util/payment/RetryService;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultRetryService implements RetryService {
    public final void a(DefaultTokenProvider tokenProvider, Retryable retryable, Function0 function0) {
        Intrinsics.h(tokenProvider, "tokenProvider");
        Intrinsics.h(retryable, "retryable");
        tokenProvider.a().i(Schedulers.c).a(new LambdaObserver(new a(new i(this, retryable), 4), new a(new j(22, function0), 5)));
    }
}
