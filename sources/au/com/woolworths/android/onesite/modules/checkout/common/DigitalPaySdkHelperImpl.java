package au.com.woolworths.android.onesite.modules.checkout.common;

import androidx.camera.core.impl.e;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.BasePayResultCallback;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.pay.internal.AccessTokenManager;
import au.com.woolworths.pay.internal.services.merchantprofile.MerchantProfileManager;
import au.com.woolworths.pay.sdk.PayClient;
import au.com.woolworths.pay.sdk.interfaces.PayError;
import au.com.woolworths.pay.sdk.models.merchantprofile.MerchantProfile;
import au.com.woolworths.shop.auth.ShopAppTokenAuthenticator;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.internal.operators.single.SingleCreate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/common/DigitalPaySdkHelperImpl;", "Lau/com/woolworths/android/onesite/modules/checkout/common/DigitalPaySdkHelper;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DigitalPaySdkHelperImpl implements DigitalPaySdkHelper {

    /* renamed from: a, reason: collision with root package name */
    public final SchedulersProvider f4276a;
    public final ShopAppTokenAuthenticator b;
    public final PayClient c;

    public DigitalPaySdkHelperImpl(SchedulersProvider schedulersProvider, ShopAppTokenAuthenticator authenticator, PayClient payClient) {
        Intrinsics.h(schedulersProvider, "schedulersProvider");
        Intrinsics.h(authenticator, "authenticator");
        Intrinsics.h(payClient, "payClient");
        this.f4276a = schedulersProvider;
        this.b = authenticator;
        this.c = payClient;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.common.DigitalPaySdkHelper
    public final SingleCreate b(boolean z) {
        final SchedulersProvider schedulersProvider = this.f4276a;
        if (z) {
            final int i = 1;
            return new SingleCreate(new SingleOnSubscribe(this) { // from class: au.com.woolworths.android.onesite.modules.checkout.common.a
                public final /* synthetic */ DigitalPaySdkHelperImpl e;

                {
                    this.e = this;
                }

                @Override // io.reactivex.SingleOnSubscribe
                public final void d(final SingleEmitter singleEmitter) {
                    switch (i) {
                        case 0:
                            DigitalPaySdkHelperImpl digitalPaySdkHelperImpl = this.e;
                            PayClient payClient = digitalPaySdkHelperImpl.c;
                            payClient.f9189a.c(new BasePayResultCallback<MerchantProfile>(schedulersProvider, digitalPaySdkHelperImpl.b) { // from class: au.com.woolworths.android.onesite.modules.checkout.common.DigitalPaySdkHelperImpl$getMerchantProfileCallback$1
                                @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
                                public final void k0(Object obj) {
                                    MerchantProfile merchantProfile = (MerchantProfile) obj;
                                    Intrinsics.h(merchantProfile, "merchantProfile");
                                    singleEmitter.onSuccess(merchantProfile);
                                }

                                @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
                                public final void v(PayError payError) {
                                    Intrinsics.h(payError, "payError");
                                    singleEmitter.c(DigitalPaySdkHelperImplKt.a(payError));
                                }
                            });
                            break;
                        default:
                            DigitalPaySdkHelperImpl digitalPaySdkHelperImpl2 = this.e;
                            PayClient payClient2 = digitalPaySdkHelperImpl2.c;
                            BasePayResultCallback<MerchantProfile> basePayResultCallback = new BasePayResultCallback<MerchantProfile>(schedulersProvider, digitalPaySdkHelperImpl2.b) { // from class: au.com.woolworths.android.onesite.modules.checkout.common.DigitalPaySdkHelperImpl$getMerchantProfileCallback$1
                                @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
                                public final void k0(Object obj) {
                                    MerchantProfile merchantProfile = (MerchantProfile) obj;
                                    Intrinsics.h(merchantProfile, "merchantProfile");
                                    singleEmitter.onSuccess(merchantProfile);
                                }

                                @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
                                public final void v(PayError payError) {
                                    Intrinsics.h(payError, "payError");
                                    singleEmitter.c(DigitalPaySdkHelperImplKt.a(payError));
                                }
                            };
                            MerchantProfileManager merchantProfileManager = payClient2.f9189a;
                            merchantProfileManager.b();
                            merchantProfileManager.c(basePayResultCallback);
                            break;
                    }
                }
            });
        }
        final int i2 = 0;
        return new SingleCreate(new SingleOnSubscribe(this) { // from class: au.com.woolworths.android.onesite.modules.checkout.common.a
            public final /* synthetic */ DigitalPaySdkHelperImpl e;

            {
                this.e = this;
            }

            @Override // io.reactivex.SingleOnSubscribe
            public final void d(final SingleEmitter singleEmitter) {
                switch (i2) {
                    case 0:
                        DigitalPaySdkHelperImpl digitalPaySdkHelperImpl = this.e;
                        PayClient payClient = digitalPaySdkHelperImpl.c;
                        payClient.f9189a.c(new BasePayResultCallback<MerchantProfile>(schedulersProvider, digitalPaySdkHelperImpl.b) { // from class: au.com.woolworths.android.onesite.modules.checkout.common.DigitalPaySdkHelperImpl$getMerchantProfileCallback$1
                            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
                            public final void k0(Object obj) {
                                MerchantProfile merchantProfile = (MerchantProfile) obj;
                                Intrinsics.h(merchantProfile, "merchantProfile");
                                singleEmitter.onSuccess(merchantProfile);
                            }

                            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
                            public final void v(PayError payError) {
                                Intrinsics.h(payError, "payError");
                                singleEmitter.c(DigitalPaySdkHelperImplKt.a(payError));
                            }
                        });
                        break;
                    default:
                        DigitalPaySdkHelperImpl digitalPaySdkHelperImpl2 = this.e;
                        PayClient payClient2 = digitalPaySdkHelperImpl2.c;
                        BasePayResultCallback<MerchantProfile> basePayResultCallback = new BasePayResultCallback<MerchantProfile>(schedulersProvider, digitalPaySdkHelperImpl2.b) { // from class: au.com.woolworths.android.onesite.modules.checkout.common.DigitalPaySdkHelperImpl$getMerchantProfileCallback$1
                            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
                            public final void k0(Object obj) {
                                MerchantProfile merchantProfile = (MerchantProfile) obj;
                                Intrinsics.h(merchantProfile, "merchantProfile");
                                singleEmitter.onSuccess(merchantProfile);
                            }

                            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
                            public final void v(PayError payError) {
                                Intrinsics.h(payError, "payError");
                                singleEmitter.c(DigitalPaySdkHelperImplKt.a(payError));
                            }
                        };
                        MerchantProfileManager merchantProfileManager = payClient2.f9189a;
                        merchantProfileManager.b();
                        merchantProfileManager.c(basePayResultCallback);
                        break;
                }
            }
        });
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.common.DigitalPaySdkHelper
    public final SingleCreate c() {
        return new SingleCreate(new e(this, 10));
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.common.DigitalPaySdkHelper
    public final void d(String str) {
        PayClient payClient = this.c;
        boolean z = payClient.f;
        AccessTokenManager accessTokenManager = payClient.e;
        if (z) {
            accessTokenManager.f9177a = str;
            return;
        }
        accessTokenManager.f9177a = str;
        payClient.f9189a.b();
        payClient.f = true;
    }
}
