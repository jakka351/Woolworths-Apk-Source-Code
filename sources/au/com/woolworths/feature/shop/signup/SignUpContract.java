package au.com.woolworths.feature.shop.signup;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.signup.data.SignUpError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/signup/SignUpContract;", "", "Action", "ViewState", "signup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SignUpContract {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/signup/SignUpContract$Action;", "", "CloseSignup", "LaunchLogin", "Lau/com/woolworths/feature/shop/signup/SignUpContract$Action$CloseSignup;", "Lau/com/woolworths/feature/shop/signup/SignUpContract$Action$LaunchLogin;", "signup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/signup/SignUpContract$Action$CloseSignup;", "Lau/com/woolworths/feature/shop/signup/SignUpContract$Action;", "signup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CloseSignup implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final CloseSignup f8107a = new CloseSignup();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CloseSignup);
            }

            public final int hashCode() {
                return 791368953;
            }

            public final String toString() {
                return "CloseSignup";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/signup/SignUpContract$Action$LaunchLogin;", "Lau/com/woolworths/feature/shop/signup/SignUpContract$Action;", "signup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchLogin implements Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f8108a;

            public /* synthetic */ LaunchLogin() {
                this(null);
            }

            /* renamed from: a, reason: from getter */
            public final String getF8108a() {
                return this.f8108a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchLogin) && Intrinsics.c(this.f8108a, ((LaunchLogin) obj).f8108a);
            }

            public final int hashCode() {
                String str = this.f8108a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchLogin(email=", this.f8108a, ")");
            }

            public LaunchLogin(String str) {
                this.f8108a = str;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/signup/SignUpContract$ViewState;", "", "Initial", "Failed", "Lau/com/woolworths/feature/shop/signup/SignUpContract$ViewState$Failed;", "Lau/com/woolworths/feature/shop/signup/SignUpContract$ViewState$Initial;", "signup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ViewState {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/signup/SignUpContract$ViewState$Failed;", "Lau/com/woolworths/feature/shop/signup/SignUpContract$ViewState;", "signup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Failed implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final SignUpError f8109a;

            public Failed(SignUpError signUpError) {
                this.f8109a = signUpError;
            }

            /* renamed from: a, reason: from getter */
            public final SignUpError getF8109a() {
                return this.f8109a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Failed) && Intrinsics.c(this.f8109a, ((Failed) obj).f8109a);
            }

            public final int hashCode() {
                return this.f8109a.hashCode();
            }

            public final String toString() {
                return "Failed(error=" + this.f8109a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/signup/SignUpContract$ViewState$Initial;", "Lau/com/woolworths/feature/shop/signup/SignUpContract$ViewState;", "signup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final /* data */ class Initial implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public static final Initial f8110a = new Initial();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Initial);
            }

            public final int hashCode() {
                return 1864146017;
            }

            public final String toString() {
                return "Initial";
            }
        }
    }
}
