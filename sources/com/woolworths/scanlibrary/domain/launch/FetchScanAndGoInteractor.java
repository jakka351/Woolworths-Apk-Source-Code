package com.woolworths.scanlibrary.domain.launch;

import android.content.SharedPreferences;
import android.os.Build;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.network.Component;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.i;
import au.com.woolworths.shop.ratingsandreviews.ui.shared.a;
import com.woolworths.scanlibrary.data.authentication.AuthenticatedUser;
import com.woolworths.scanlibrary.data.authentication.DefaultLocalTokenProvider;
import com.woolworths.scanlibrary.data.launch.BffScanAndGoRepository;
import com.woolworths.scanlibrary.data.launch.ScanAndGoClientData;
import com.woolworths.scanlibrary.data.launch.ScanAndGoUserData;
import com.woolworths.scanlibrary.data.source.local.persistent.ScanAndGoLaunchPersistent;
import com.woolworths.scanlibrary.models.authentication.Token;
import com.woolworths.scanlibrary.util.device.DeviceInfoProvider;
import com.woolworths.scanlibrary.util.payment.DigitalPayProvider;
import io.reactivex.Single;
import io.reactivex.internal.operators.single.SingleDoOnSuccess;
import io.reactivex.internal.operators.single.SingleMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/domain/launch/FetchScanAndGoInteractor;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FetchScanAndGoInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final BffScanAndGoRepository f21181a;
    public final AuthenticatedUser b;
    public final DefaultLocalTokenProvider c;
    public final ScanAndGoLaunchPersistent d;
    public final DigitalPayProvider e;

    public FetchScanAndGoInteractor(BffScanAndGoRepository bffScanAndGoRepository, AuthenticatedUser authenticatedUser, DefaultLocalTokenProvider defaultLocalTokenProvider, ScanAndGoLaunchPersistent scanAndGoLaunchPersistent, DigitalPayProvider digitalPayProvider) {
        Intrinsics.h(digitalPayProvider, "digitalPayProvider");
        this.f21181a = bffScanAndGoRepository;
        this.b = authenticatedUser;
        this.c = defaultLocalTokenProvider;
        this.d = scanAndGoLaunchPersistent;
        this.e = digitalPayProvider;
    }

    public final Single a(String str) {
        ScanAndGoLaunchPersistent scanAndGoLaunchPersistent = this.d;
        String string = scanAndGoLaunchPersistent.b.getString("userData", "");
        ScanAndGoUserData scanAndGoUserDataA = (string == null || string.length() == 0) ? null : (ScanAndGoUserData) scanAndGoLaunchPersistent.f21162a.d(ScanAndGoUserData.class, string);
        if (scanAndGoUserDataA != null && Intrinsics.c(scanAndGoUserDataA.getRewardsCardNumber(), str)) {
            DefaultLocalTokenProvider defaultLocalTokenProvider = this.c;
            if (!StringsKt.D(defaultLocalTokenProvider.b()) && !StringsKt.D(defaultLocalTokenProvider.a())) {
                scanAndGoUserDataA = ScanAndGoUserData.a(scanAndGoUserDataA, defaultLocalTokenProvider.a(), defaultLocalTokenProvider.b());
            }
            b(scanAndGoUserDataA);
            return Single.e(new Token(scanAndGoUserDataA.getAccessToken(), scanAndGoUserDataA.getRefreshToken(), scanAndGoUserDataA.getExpiresIn(), null, 8, null));
        }
        BffScanAndGoRepository bffScanAndGoRepository = this.f21181a;
        DeviceInfoProvider deviceInfoProvider = bffScanAndGoRepository.c;
        deviceInfoProvider.getClass();
        String strC = ContextExtKt.c(bffScanAndGoRepository.f21160a);
        String osVersion = deviceInfoProvider.getOsVersion();
        String deviceId = deviceInfoProvider.getDeviceId();
        deviceInfoProvider.d();
        String str2 = Build.MANUFACTURER;
        deviceInfoProvider.getDeviceModel();
        Single<Component<ScanAndGoUserData>> singleA = bffScanAndGoRepository.b.a(new ScanAndGoClientData("android", strC, osVersion, deviceId, b.o(str2, " ", Build.MODEL)));
        com.woolworths.scanlibrary.data.authentication.token.b bVar = new com.woolworths.scanlibrary.data.authentication.token.b(new i(this, 16), 10);
        singleA.getClass();
        return new SingleMap(new SingleDoOnSuccess(singleA, bVar), new com.woolworths.scanlibrary.data.authentication.token.b(new a(16), 11));
    }

    public final void b(ScanAndGoUserData scanAndGoUserData) {
        ScanAndGoLaunchPersistent scanAndGoLaunchPersistent = this.d;
        SharedPreferences.Editor editorEdit = scanAndGoLaunchPersistent.b.edit();
        if (scanAndGoUserData != null) {
            editorEdit.putString("userData", scanAndGoLaunchPersistent.f21162a.j(scanAndGoUserData));
        } else {
            editorEdit.remove("userData");
        }
        editorEdit.apply();
        String accessToken = scanAndGoUserData.getAccessToken();
        DefaultLocalTokenProvider defaultLocalTokenProvider = this.c;
        defaultLocalTokenProvider.c(accessToken);
        defaultLocalTokenProvider.d(scanAndGoUserData.getRefreshToken());
        this.e.a(scanAndGoUserData.getAccessToken());
        String firstName = scanAndGoUserData.getFirstName();
        String lastName = scanAndGoUserData.getLastName();
        String rewardsCardNumber = scanAndGoUserData.getRewardsCardNumber();
        this.b.e(new AuthenticatedUser.AuthenticatedUserData(true, scanAndGoUserData.getIsTncAccepted(), scanAndGoUserData.getIsRewardsAvailable(), firstName, lastName, rewardsCardNumber, scanAndGoUserData.getEmail(), scanAndGoUserData.getBanner()));
    }
}
