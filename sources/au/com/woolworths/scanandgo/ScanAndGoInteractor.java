package au.com.woolworths.scanandgo;

import android.content.SharedPreferences;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.scanandgo.data.ScanAndGoUserData;
import au.com.woolworths.scanandgo.data.ScanAndGoUserDataKt;
import au.com.woolworths.scanandgo.storage.ScanAndGoLocalStorage;
import com.woolworths.scanlibrary.data.authentication.AuthenticatedUser;
import com.woolworths.scanlibrary.data.authentication.DefaultLocalTokenProvider;
import com.woolworths.scanlibrary.util.payment.DigitalPayProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/scanandgo/ScanAndGoInteractor;", "", "shop-scan-and-go_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ScanAndGoInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final ScanAndGoRepository f9981a;
    public final AuthenticatedUser b;
    public final DefaultLocalTokenProvider c;
    public final ScanAndGoLocalStorage d;
    public final DigitalPayProvider e;
    public final RewardsAccountInteractor f;

    public ScanAndGoInteractor(ScanAndGoRepository scanAndGoRepository, AuthenticatedUser authenticatedUser, DefaultLocalTokenProvider defaultLocalTokenProvider, ScanAndGoLocalStorage scanAndGoLocalStorage, DigitalPayProvider digitalPayProvider, RewardsAccountInteractor rewardsAccountInteractor) {
        Intrinsics.h(digitalPayProvider, "digitalPayProvider");
        Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
        this.f9981a = scanAndGoRepository;
        this.b = authenticatedUser;
        this.c = defaultLocalTokenProvider;
        this.d = scanAndGoLocalStorage;
        this.e = digitalPayProvider;
        this.f = rewardsAccountInteractor;
    }

    public final void a(ScanAndGoUserData scanAndGoUserData) {
        ScanAndGoLocalStorage scanAndGoLocalStorage = this.d;
        SharedPreferences.Editor editorEdit = scanAndGoLocalStorage.b.edit();
        if (scanAndGoUserData != null) {
            editorEdit.putString("userData", scanAndGoLocalStorage.f9983a.j(scanAndGoUserData));
        } else {
            editorEdit.remove("userData");
        }
        editorEdit.apply();
        String accessToken = scanAndGoUserData.getAccessToken();
        DefaultLocalTokenProvider defaultLocalTokenProvider = this.c;
        defaultLocalTokenProvider.c(accessToken);
        defaultLocalTokenProvider.d(scanAndGoUserData.getRefreshToken());
        this.e.a(scanAndGoUserData.getAccessToken());
        this.b.e(ScanAndGoUserDataKt.toAuthenticatedUserData$default(scanAndGoUserData, false, 1, null));
    }
}
