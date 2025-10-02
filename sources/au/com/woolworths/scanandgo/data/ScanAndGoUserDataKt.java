package au.com.woolworths.scanandgo.data;

import com.woolworths.scanlibrary.data.authentication.AuthenticatedUser;
import com.woolworths.scanlibrary.models.authentication.Token;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0002¨\u0006\u0007"}, d2 = {"toAuthenticatedUserData", "Lcom/woolworths/scanlibrary/data/authentication/AuthenticatedUser$AuthenticatedUserData;", "Lau/com/woolworths/scanandgo/data/ScanAndGoUserData;", "skippedRewards", "", "toTokenData", "Lcom/woolworths/scanlibrary/models/authentication/Token;", "shop-scan-and-go_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ScanAndGoUserDataKt {
    @NotNull
    public static final AuthenticatedUser.AuthenticatedUserData toAuthenticatedUserData(@NotNull ScanAndGoUserData scanAndGoUserData, boolean z) {
        Intrinsics.h(scanAndGoUserData, "<this>");
        String firstName = scanAndGoUserData.getFirstName();
        String lastName = scanAndGoUserData.getLastName();
        String rewardsCardNumber = scanAndGoUserData.getRewardsCardNumber();
        return new AuthenticatedUser.AuthenticatedUserData(z, scanAndGoUserData.isTncAccepted(), scanAndGoUserData.isRewardsAvailable(), firstName, lastName, rewardsCardNumber, scanAndGoUserData.getEmail(), scanAndGoUserData.getBanner());
    }

    public static /* synthetic */ AuthenticatedUser.AuthenticatedUserData toAuthenticatedUserData$default(ScanAndGoUserData scanAndGoUserData, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return toAuthenticatedUserData(scanAndGoUserData, z);
    }

    @NotNull
    public static final Token toTokenData(@NotNull ScanAndGoUserData scanAndGoUserData) {
        Intrinsics.h(scanAndGoUserData, "<this>");
        return new Token(scanAndGoUserData.getAccessToken(), scanAndGoUserData.getRefreshToken(), scanAndGoUserData.getExpiresIn(), null, 8, null);
    }
}
