package com.woolworths.scanlibrary.ui.splash;

import com.woolworths.scanlibrary.domain.login.SignInUC;
import com.woolworths.scanlibrary.models.authentication.AuthResponse;
import com.woolworths.scanlibrary.models.authentication.Banner;
import com.woolworths.scanlibrary.models.cart.CartStatus;
import com.woolworths.scanlibrary.models.profile.KioskFlags;
import com.woolworths.scanlibrary.models.profile.ProfileResponse;
import com.woolworths.scanlibrary.models.profile.Storeinfo;
import com.woolworths.scanlibrary.models.store.StoreCheckoutInstruction;
import com.woolworths.scanlibrary.ui.exit.ExitDTO;
import com.woolworths.scanlibrary.ui.splash.SplashContract;
import com.woolworths.scanlibrary.ui.splash.SplashPresenter;
import com.woolworths.scanlibrary.ui.tap.TapPresenter;
import java.io.IOException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.android.HandlerContext;
import okhttp3.internal.cache.DiskLruCache;

/* loaded from: classes7.dex */
public final /* synthetic */ class d implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        switch (this.d) {
            case 0:
                SplashPresenter splashPresenter = (SplashPresenter) this.e;
                SplashContract.View view = (SplashContract.View) this.f;
                SplashPresenter.PostInitResult postInitResult = (SplashPresenter.PostInitResult) obj;
                if (postInitResult instanceof SplashPresenter.PostInitResult.SignInRequired) {
                    splashPresenter.c.getClass();
                } else {
                    if (!(postInitResult instanceof SplashPresenter.PostInitResult.AuthDone)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SignInUC.ResponseValue responseValue = ((SplashPresenter.PostInitResult.AuthDone) postInitResult).f21335a;
                    SignInUC.AuthState authState = responseValue.f21187a;
                    int i = responseValue.c;
                    ProfileResponse profileResponse = responseValue.b;
                    AuthResponse profile = profileResponse.getProfile();
                    Banner banner = profile != null ? profile.getBanner() : null;
                    Banner banner2 = Banner.GUEST;
                    if (banner == banner2) {
                        splashPresenter.d.g.k(profileResponse.getProfile().getBanner().getBannerName());
                    }
                    switch (authState.ordinal()) {
                        case 0:
                            break;
                        case 1:
                            view.S();
                            break;
                        case 2:
                            AuthResponse profile2 = profileResponse.getProfile();
                            if ((profile2 != null ? profile2.getBanner() : null) != banner2) {
                                view.t();
                                break;
                            } else {
                                view.N(i, profileResponse);
                                break;
                            }
                        case 3:
                        case 4:
                            view.N(i, profileResponse);
                            break;
                        case 5:
                            str = "";
                            String cartId = profileResponse.getStatus().getCartId();
                            String str2 = cartId == null ? str : cartId;
                            CartStatus status = profileResponse.getStatus().getStatus();
                            KioskFlags kioskFlags = profileResponse.getKioskFlags();
                            Storeinfo storeinfo = profileResponse.getStoreinfo();
                            String checkoutTitle = storeinfo != null ? storeinfo.getCheckoutTitle() : null;
                            if (checkoutTitle == null) {
                                checkoutTitle = str;
                            }
                            Storeinfo storeinfo2 = profileResponse.getStoreinfo();
                            String checkoutMessage = storeinfo2 != null ? storeinfo2.getCheckoutMessage() : null;
                            view.l1(new ExitDTO(str2, false, status, kioskFlags, new StoreCheckoutInstruction(checkoutTitle, checkoutMessage != null ? checkoutMessage : "")));
                            break;
                        case 6:
                            view.G2();
                            throw null;
                        case 7:
                            String posBarCode = profileResponse.getStatus().getPosBarCode();
                            if (posBarCode == null) {
                                posBarCode = "";
                            }
                            view.l1(new ExitDTO(posBarCode, true, profileResponse.getStatus().getStatus(), profileResponse.getKioskFlags(), null, 16));
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.f24250a;
            case 1:
                ((TapPresenter) this.e).f.b((String) this.f);
                break;
            case 2:
                ((HandlerContext) this.e).f.removeCallbacks((com.auth0.android.request.internal.a) this.f);
                break;
            default:
                DiskLruCache diskLruCache = (DiskLruCache) this.e;
                DiskLruCache.Editor editor = (DiskLruCache.Editor) this.f;
                IOException it = (IOException) obj;
                Intrinsics.h(it, "it");
                synchronized (diskLruCache) {
                    editor.c();
                    break;
                }
        }
        return Unit.f24250a;
    }
}
