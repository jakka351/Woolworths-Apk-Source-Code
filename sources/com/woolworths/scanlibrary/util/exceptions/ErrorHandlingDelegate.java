package com.woolworths.scanlibrary.util.exceptions;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.shop.lists.ui.magicmatch.ui.c;
import com.woolworths.R;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import com.woolworths.scanlibrary.configuration.ScanAndGoFeature;
import com.woolworths.scanlibrary.models.error.ApigeeErrorResponse;
import com.woolworths.scanlibrary.util.extensions.AppCompatActivityExtKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/util/exceptions/ErrorHandlingDelegate;", "Lcom/woolworths/scanlibrary/util/exceptions/ErrorHandler;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ErrorHandlingDelegate implements ErrorHandler {

    /* renamed from: a, reason: collision with root package name */
    public final FragmentActivity f21368a;
    public final FeatureToggleManager b;
    public final Function0 c;
    public final Function0 d;
    public final Function0 e;
    public final Function0 f;
    public final Function0 g;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[MvpView.ErrorType.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MvpView.ErrorType errorType = MvpView.ErrorType.d;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ErrorHandlingDelegate(FragmentActivity fragmentActivity, FeatureToggleManager featureToggleManager, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05) {
        this.f21368a = fragmentActivity;
        this.b = featureToggleManager;
        this.c = function0;
        this.d = function02;
        this.e = function03;
        this.f = function04;
        this.g = function05;
    }

    public final void a(int i, int i2, ApigeeErrorResponse apigeeErrorResponse, Function0 function0) {
        if (i == 401) {
            this.c.invoke();
            return;
        }
        FragmentActivity fragmentActivity = this.f21368a;
        if (i != 404) {
            if (500 > i || i >= 512) {
                d(i2, i, apigeeErrorResponse, function0);
                return;
            } else {
                if (fragmentActivity != null) {
                    String string = fragmentActivity.getString(R.string.sng_error_unhandled);
                    Intrinsics.g(string, "getString(...)");
                    c(string, function0);
                    return;
                }
                return;
            }
        }
        if (apigeeErrorResponse == null) {
            d(i2, i, apigeeErrorResponse, function0);
            return;
        }
        if ((Intrinsics.c(apigeeErrorResponse.getErrorCode(), "40403") | Intrinsics.c(apigeeErrorResponse.getErrorCode(), "40411")) || Intrinsics.c(apigeeErrorResponse.getErrorCode(), "40401")) {
            Intrinsics.e(fragmentActivity);
            String string2 = fragmentActivity.getString(R.string.sng_message_session_expired);
            Intrinsics.g(string2, "getString(...)");
            c(string2, new a(this, 1));
            return;
        }
        if (Intrinsics.c(apigeeErrorResponse.getErrorCode(), "40410")) {
            this.g.invoke();
        } else {
            d(i2, i, apigeeErrorResponse, function0);
        }
    }

    public final void b(MvpView.ErrorType errorType) {
        int iOrdinal = errorType.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            this.d.invoke();
            return;
        }
        FragmentActivity fragmentActivity = this.f21368a;
        if (fragmentActivity != null) {
            String string = fragmentActivity.getString(R.string.sng_error_unhandled);
            Intrinsics.g(string, "getString(...)");
            String string2 = fragmentActivity.getString(R.string.sng_label_ok);
            Intrinsics.g(string2, "getString(...)");
            AppCompatActivityExtKt.d(fragmentActivity, string, string2, new a(this, 0));
        }
    }

    public final void c(String str, Function0 function0) {
        FragmentActivity fragmentActivity = this.f21368a;
        if (fragmentActivity != null) {
            String string = fragmentActivity.getString(R.string.sng_label_ok);
            Intrinsics.g(string, "getString(...)");
            AppCompatActivityExtKt.f(fragmentActivity, str, string, new c(25, function0), new c(26, function0));
        }
    }

    public final void d(int i, int i2, ApigeeErrorResponse apigeeErrorResponse, Function0 function0) {
        String errorCode;
        String description = apigeeErrorResponse != null ? apigeeErrorResponse.getDescription() : null;
        FragmentActivity fragmentActivity = this.f21368a;
        if (description == null || StringsKt.D(description)) {
            description = fragmentActivity != null ? fragmentActivity.getString(R.string.sng_error_unhandled) : null;
        }
        if (apigeeErrorResponse == null || (errorCode = apigeeErrorResponse.getErrorCode()) == null) {
            errorCode = "";
        }
        StringBuilder sbP = androidx.constraintlayout.core.state.a.p("Reference #: R", i, "C", errorCode, "S");
        sbP.append(i2);
        String string = sbP.toString();
        if (this.b.c(ScanAndGoFeature.f)) {
            if (fragmentActivity != null) {
                if (description == null) {
                    description = fragmentActivity.getString(R.string.sng_error_unhandled);
                    Intrinsics.g(description, "getString(...)");
                }
                String string2 = fragmentActivity.getString(R.string.sng_label_ok);
                Intrinsics.g(string2, "getString(...)");
                AppCompatActivityExtKt.g(fragmentActivity, description, string, string2, new c(27, function0), new c(28, function0));
                return;
            }
            return;
        }
        if (fragmentActivity != null) {
            if (description == null) {
                description = fragmentActivity.getString(R.string.sng_error_unhandled);
                Intrinsics.g(description, "getString(...)");
            }
            String string3 = fragmentActivity.getString(R.string.sng_label_ok);
            Intrinsics.g(string3, "getString(...)");
            AppCompatActivityExtKt.f(fragmentActivity, description, string3, new c(29, function0), new b(0, function0));
        }
    }
}
