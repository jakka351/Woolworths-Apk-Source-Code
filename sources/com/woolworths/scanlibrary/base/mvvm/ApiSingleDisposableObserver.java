package com.woolworths.scanlibrary.base.mvvm;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.wallet.WalletConstants;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import com.woolworths.scanlibrary.base.mvvm.CommonViewAction;
import com.woolworths.scanlibrary.models.error.ApigeeErrorResponse;
import com.woolworths.scanlibrary.util.event.Event;
import com.woolworths.scanlibrary.util.exceptions.PaymentError;
import com.woolworths.scanlibrary.util.exceptions.SessionExpired;
import io.reactivex.observers.DisposableSingleObserver;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.security.cert.CertPathValidatorException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import retrofit2.Response;
import timber.log.Timber;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/scanlibrary/base/mvvm/ApiSingleDisposableObserver;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lio/reactivex/observers/DisposableSingleObserver;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class ApiSingleDisposableObserver<T> extends DisposableSingleObserver<T> {
    public final int e;
    public final MutableLiveData f;

    public ApiSingleDisposableObserver(int i, MutableLiveData mutableLiveData) {
        this.e = i;
        this.f = mutableLiveData;
    }

    public void a(int i, ApigeeErrorResponse apigeeErrorResponse, int i2) {
        MutableLiveData mutableLiveData = this.f;
        if (mutableLiveData != null) {
            mutableLiveData.j(new Event(new CommonViewAction.ApplicationError(i, apigeeErrorResponse, i2)));
        }
    }

    public void c(MvpView.ErrorType errorType) {
        MutableLiveData mutableLiveData = this.f;
        if (mutableLiveData != null) {
            mutableLiveData.j(new Event(new CommonViewAction.NonApplicationError(errorType)));
        }
    }

    @Override // io.reactivex.SingleObserver
    public final void onError(Throwable e) {
        ResponseBody responseBody;
        Intrinsics.h(e, "e");
        Timber.f27013a.n("Error processing the response " + e, e, new Object[0]);
        boolean z = e instanceof HttpException;
        int i = this.e;
        ApigeeErrorResponse apigeeErrorResponse = null;
        if (z) {
            if (e instanceof PaymentError) {
                ((PaymentError) e).d.getErrorMessage();
            }
            HttpException httpException = (HttpException) e;
            try {
                Gson gson = new Gson();
                Response response = httpException.e;
                apigeeErrorResponse = (ApigeeErrorResponse) gson.d(ApigeeErrorResponse.class, (response == null || (responseBody = response.c) == null) ? null : responseBody.d());
            } catch (JsonSyntaxException unused) {
            }
            a(httpException.d, apigeeErrorResponse, i);
            return;
        }
        if (e instanceof PaymentError) {
            a(((PaymentError) e).d.getPayErrorCode().getValue(), null, i);
            return;
        }
        if ((e instanceof NullPointerException) || (e instanceof JsonSyntaxException) || (e instanceof IndexOutOfBoundsException)) {
            a(WalletConstants.ERROR_CODE_INVALID_PARAMETERS, null, i);
        } else if (e instanceof SessionExpired) {
            a(401, null, i);
        } else {
            c(e instanceof SocketTimeoutException ? MvpView.ErrorType.d : ((e instanceof CertPathValidatorException) || (e instanceof IOException)) ? MvpView.ErrorType.e : MvpView.ErrorType.f);
        }
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(Object response) {
        Intrinsics.h(response, "response");
    }
}
