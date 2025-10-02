package com.woolworths.scanlibrary.base;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.deeplink.h;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.wallet.WalletConstants;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import com.woolworths.scanlibrary.models.error.ApigeeErrorResponse;
import com.woolworths.scanlibrary.util.exceptions.PaymentError;
import com.woolworths.scanlibrary.util.exceptions.SessionExpired;
import io.reactivex.observers.DisposableSingleObserver;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.security.cert.CertPathValidatorException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import retrofit2.Response;
import timber.log.Timber;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/scanlibrary/base/BaseDisposableObserver;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lio/reactivex/observers/DisposableSingleObserver;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class BaseDisposableObserver<T> extends DisposableSingleObserver<T> {
    public final MvpView e;
    public final int f;

    public BaseDisposableObserver(MvpView baseView, int i) {
        Intrinsics.h(baseView, "baseView");
        this.e = baseView;
        this.f = i;
    }

    public Class a() {
        return ApigeeErrorResponse.class;
    }

    public void c(int i, int i2, ApigeeErrorResponse apigeeErrorResponse, Function0 function0) {
        this.e.n(i, i2, apigeeErrorResponse, function0);
    }

    public void e(MvpView.ErrorType errorType) {
        this.e.i0(errorType);
    }

    @Override // io.reactivex.SingleObserver
    public void onError(Throwable e) {
        ResponseBody responseBody;
        Intrinsics.h(e, "e");
        Timber.f27013a.n("Error processing the response " + e, e, new Object[0]);
        this.e.N3(false);
        boolean z = e instanceof HttpException;
        int i = this.f;
        ApigeeErrorResponse apigeeErrorResponse = null;
        if (z) {
            if (e instanceof PaymentError) {
                ((PaymentError) e).d.getErrorMessage();
            }
            HttpException httpException = (HttpException) e;
            try {
                Gson gson = new Gson();
                Response response = httpException.e;
                apigeeErrorResponse = (ApigeeErrorResponse) gson.d(a(), (response == null || (responseBody = response.c) == null) ? null : responseBody.d());
            } catch (JsonSyntaxException unused) {
            }
            c(httpException.d, i, apigeeErrorResponse, new h(20));
            return;
        }
        if (e instanceof PaymentError) {
            c(((PaymentError) e).d.getPayErrorCode().getValue(), i, null, new h(20));
            return;
        }
        if ((e instanceof NullPointerException) || (e instanceof JsonSyntaxException) || (e instanceof IndexOutOfBoundsException)) {
            c(WalletConstants.ERROR_CODE_INVALID_PARAMETERS, i, null, new h(20));
        } else if (e instanceof SessionExpired) {
            c(401, i, null, new h(20));
        } else {
            e(e instanceof SocketTimeoutException ? MvpView.ErrorType.d : ((e instanceof CertPathValidatorException) || (e instanceof IOException)) ? MvpView.ErrorType.e : MvpView.ErrorType.f);
        }
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(Object response) {
        Intrinsics.h(response, "response");
    }
}
