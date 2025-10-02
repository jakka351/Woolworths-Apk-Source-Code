package com.woolworths.scanlibrary.data.authentication.token;

import android.os.Build;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.network.Component;
import au.com.woolworths.product.details.d;
import au.com.woolworths.scanandgo.ScanAndGoInteractor;
import au.com.woolworths.scanandgo.ScanAndGoRepository;
import au.com.woolworths.scanandgo.data.ScanAndGoClientData;
import au.com.woolworths.scanandgo.data.ScanAndGoUserData;
import au.com.woolworths.scanandgo.data.ScanAndGoUserDataKt;
import au.com.woolworths.scanandgo.storage.ScanAndGoLocalStorage;
import com.woolworths.scanlibrary.data.authentication.DefaultLocalTokenProvider;
import com.woolworths.scanlibrary.models.authentication.Token;
import com.woolworths.scanlibrary.util.device.DeviceInfoProvider;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.internal.operators.single.SingleDoOnSuccess;
import io.reactivex.internal.operators.single.SingleMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import retrofit2.HttpException;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ DefaultTokenProvider e;

    public /* synthetic */ a(DefaultTokenProvider defaultTokenProvider, int i) {
        this.d = i;
        this.e = defaultTokenProvider;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Single singleMap;
        switch (this.d) {
            case 0:
                Token newToken = (Token) obj;
                Intrinsics.h(newToken, "newToken");
                DefaultTokenProvider defaultTokenProvider = this.e;
                DefaultLocalTokenProvider defaultLocalTokenProvider = defaultTokenProvider.c;
                defaultLocalTokenProvider.c(newToken.getAccessToken());
                defaultLocalTokenProvider.d(newToken.getRefreshToken());
                defaultTokenProvider.b.a(newToken.getAccessToken());
                return Observable.e(newToken);
            default:
                Throwable throwable = (Throwable) obj;
                Intrinsics.h(throwable, "throwable");
                DefaultTokenProvider defaultTokenProvider2 = this.e;
                defaultTokenProvider2.e.getClass();
                if (!(throwable instanceof HttpException) || ((HttpException) throwable).d != 401) {
                    return Observable.b(throwable);
                }
                ScanAndGoInteractor scanAndGoInteractor = defaultTokenProvider2.d.f9980a;
                DefaultLocalTokenProvider defaultLocalTokenProvider2 = scanAndGoInteractor.c;
                ScanAndGoLocalStorage scanAndGoLocalStorage = scanAndGoInteractor.d;
                String string = scanAndGoLocalStorage.b.getString("userData", "");
                ScanAndGoUserData scanAndGoUserDataCopy$default = (string == null || string.length() == 0) ? null : (ScanAndGoUserData) scanAndGoLocalStorage.f9983a.d(ScanAndGoUserData.class, string);
                if (scanAndGoUserDataCopy$default == null || !Intrinsics.c(scanAndGoUserDataCopy$default.getRewardsCardNumber(), null)) {
                    ScanAndGoRepository scanAndGoRepository = scanAndGoInteractor.f9981a;
                    DeviceInfoProvider deviceInfoProvider = scanAndGoRepository.c;
                    deviceInfoProvider.getClass();
                    String strC = ContextExtKt.c(scanAndGoRepository.f9982a);
                    String osVersion = deviceInfoProvider.getOsVersion();
                    String deviceId = deviceInfoProvider.getDeviceId();
                    deviceInfoProvider.d();
                    String str = Build.MANUFACTURER;
                    deviceInfoProvider.getDeviceModel();
                    Single<Component<ScanAndGoUserData>> singleA = scanAndGoRepository.b.a(new ScanAndGoClientData("android", strC, osVersion, deviceId, androidx.camera.core.impl.b.o(str, " ", Build.MODEL)));
                    au.com.woolworths.product.details.epoxy.a aVar = new au.com.woolworths.product.details.epoxy.a(new d(scanAndGoInteractor, 2), 4);
                    singleA.getClass();
                    singleMap = new SingleMap(new SingleDoOnSuccess(singleA, aVar), new au.com.woolworths.product.details.epoxy.a(new au.com.woolworths.foundation.shop.olive.voice.ui.search.a(27), 5));
                } else {
                    if (!StringsKt.D(defaultLocalTokenProvider2.b()) && !StringsKt.D(defaultLocalTokenProvider2.a())) {
                        scanAndGoUserDataCopy$default = ScanAndGoUserData.copy$default(scanAndGoUserDataCopy$default, defaultLocalTokenProvider2.a(), defaultLocalTokenProvider2.b(), null, null, null, null, null, null, false, false, false, null, 4092, null);
                    }
                    scanAndGoInteractor.a(scanAndGoUserDataCopy$default);
                    singleMap = Single.e(ScanAndGoUserDataKt.toTokenData(scanAndGoUserDataCopy$default));
                }
                return singleMap.i();
        }
    }
}
