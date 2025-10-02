package au.com.woolworths.feature.rewards.account.settings.v2;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOption;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOptionChangeCountryItem;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOptionLogoutItem;
import au.com.woolworths.feature.rewards.account.settings.v2.model.AccountMenuSection;
import au.com.woolworths.feature.rewards.account.settings.v2.model.RewardsAccountMenu;
import com.apollographql.apollo.ApolloClient;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsRepository;", "", "Companion", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AccountSettingsRepository {

    /* renamed from: a, reason: collision with root package name */
    public final Application f5787a;
    public final ApolloClient b;
    public final DispatcherProvider c;
    public final ArrayList d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsRepository$Companion;", "", "", "RewardsSectionTitle", "Ljava/lang/String;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public AccountSettingsRepository(Application application, ApolloClient apolloClient, DispatcherProvider dispatcherProvider) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        this.f5787a = application;
        this.b = apolloClient;
        this.c = dispatcherProvider;
        this.d = ArraysKt.F(new AccountHomeOption[]{new AccountHomeOptionChangeCountryItem("changeCountryMenu", "Change country", null, null, false), new AccountHomeOptionLogoutItem("logOutMenu", "Log Out", null, null, false), null});
    }

    public static final RewardsAccountMenu a(AccountSettingsRepository accountSettingsRepository, RewardsAccountMenu rewardsAccountMenu) {
        ArrayList arrayList;
        accountSettingsRepository.getClass();
        List list = rewardsAccountMenu.b;
        if (list != null) {
            List<AccountMenuSection> list2 = list;
            arrayList = new ArrayList(CollectionsKt.s(list2, 10));
            for (AccountMenuSection accountMenuSection : list2) {
                if (accountMenuSection.f5792a.equals("REWARDS")) {
                    accountMenuSection = new AccountMenuSection(accountMenuSection.f5792a, CollectionsKt.c0(accountSettingsRepository.d, accountMenuSection.b));
                }
                arrayList.add(accountMenuSection);
            }
        } else {
            arrayList = null;
        }
        return RewardsAccountMenu.a(rewardsAccountMenu, arrayList, 5);
    }
}
