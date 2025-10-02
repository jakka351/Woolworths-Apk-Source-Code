package com.woolworths.scanlibrary.domain.login;

import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.domain.login.SignoutUC;
import com.woolworths.scanlibrary.models.user.User;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableSingleObserver;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/domain/login/LogoutManager;", "", "SignoutObserver", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LogoutManager {

    /* renamed from: a, reason: collision with root package name */
    public final SignoutUC f21185a;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/domain/login/LogoutManager$SignoutObserver;", "Lio/reactivex/observers/DisposableSingleObserver;", "Lcom/woolworths/scanlibrary/domain/login/SignoutUC$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class SignoutObserver extends DisposableSingleObserver<SignoutUC.ResponseValue> {
        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable e) {
            Intrinsics.h(e, "e");
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            SignoutUC.ResponseValue t = (SignoutUC.ResponseValue) obj;
            Intrinsics.h(t, "t");
        }
    }

    public LogoutManager(User authenticatedUser, SignoutUC signoutUC) {
        Intrinsics.h(authenticatedUser, "authenticatedUser");
        this.f21185a = signoutUC;
    }

    public final void a() {
        this.f21185a.b(new SignoutUC.RequestValues()).f(AndroidSchedulers.a()).a(new SignoutObserver());
    }
}
