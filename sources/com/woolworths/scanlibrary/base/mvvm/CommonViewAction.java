package com.woolworths.scanlibrary.base.mvvm;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.deeplink.h;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import com.woolworths.scanlibrary.models.error.ApigeeErrorResponse;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/woolworths/scanlibrary/base/mvvm/CommonViewAction;", "", "ApplicationError", "NonApplicationError", "SetLoadingIndicator", "ShowTapOff", "ShowTapOnView", "ShowSignInView", "ShowError", "ShowGenericError", "ShowNetworkError", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public class CommonViewAction {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/base/mvvm/CommonViewAction$ApplicationError;", "Lcom/woolworths/scanlibrary/base/mvvm/CommonViewAction;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ApplicationError extends CommonViewAction {

        /* renamed from: a, reason: collision with root package name */
        public final int f21144a;
        public final ApigeeErrorResponse b;
        public final int c;
        public final Function0 d;

        public ApplicationError(int i, ApigeeErrorResponse apigeeErrorResponse, int i2) {
            h hVar = new h(20);
            this.f21144a = i;
            this.b = apigeeErrorResponse;
            this.c = i2;
            this.d = hVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ApplicationError)) {
                return false;
            }
            ApplicationError applicationError = (ApplicationError) obj;
            return this.f21144a == applicationError.f21144a && Intrinsics.c(this.b, applicationError.b) && this.c == applicationError.c && this.d.equals(applicationError.d);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f21144a) * 31;
            ApigeeErrorResponse apigeeErrorResponse = this.b;
            return this.d.hashCode() + b.a(this.c, (iHashCode + (apigeeErrorResponse == null ? 0 : apigeeErrorResponse.hashCode())) * 31, 31);
        }

        public final String toString() {
            return "ApplicationError(httpResponseCode=" + this.f21144a + ", errorResponse=" + this.b + ", requestId=" + this.c + ", afterAction=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/base/mvvm/CommonViewAction$NonApplicationError;", "Lcom/woolworths/scanlibrary/base/mvvm/CommonViewAction;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NonApplicationError extends CommonViewAction {

        /* renamed from: a, reason: collision with root package name */
        public final MvpView.ErrorType f21145a;

        public NonApplicationError(MvpView.ErrorType errorType) {
            this.f21145a = errorType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NonApplicationError) && this.f21145a == ((NonApplicationError) obj).f21145a;
        }

        public final int hashCode() {
            return this.f21145a.hashCode();
        }

        public final String toString() {
            return "NonApplicationError(type=" + this.f21145a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/base/mvvm/CommonViewAction$SetLoadingIndicator;", "Lcom/woolworths/scanlibrary/base/mvvm/CommonViewAction;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SetLoadingIndicator extends CommonViewAction {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SetLoadingIndicator);
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        public final String toString() {
            return "SetLoadingIndicator(show=false)";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/base/mvvm/CommonViewAction$ShowError;", "Lcom/woolworths/scanlibrary/base/mvvm/CommonViewAction;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShowError extends CommonViewAction {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/base/mvvm/CommonViewAction$ShowGenericError;", "Lcom/woolworths/scanlibrary/base/mvvm/CommonViewAction;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShowGenericError extends CommonViewAction {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/base/mvvm/CommonViewAction$ShowNetworkError;", "Lcom/woolworths/scanlibrary/base/mvvm/CommonViewAction;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShowNetworkError extends CommonViewAction {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/base/mvvm/CommonViewAction$ShowSignInView;", "Lcom/woolworths/scanlibrary/base/mvvm/CommonViewAction;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShowSignInView extends CommonViewAction {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/base/mvvm/CommonViewAction$ShowTapOff;", "Lcom/woolworths/scanlibrary/base/mvvm/CommonViewAction;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShowTapOff extends CommonViewAction {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/base/mvvm/CommonViewAction$ShowTapOnView;", "Lcom/woolworths/scanlibrary/base/mvvm/CommonViewAction;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShowTapOnView extends CommonViewAction {
    }
}
