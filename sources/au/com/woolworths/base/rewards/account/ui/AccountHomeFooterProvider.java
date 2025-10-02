package au.com.woolworths.base.rewards.account.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.base.rewards.account.data.AccountHomeFooter;
import au.com.woolworths.base.rewards.account.data.IconListItemAction;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lau/com/woolworths/base/rewards/account/ui/AccountHomeFooterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/base/rewards/account/data/AccountHomeFooter;", "Lkotlin/sequences/Sequence;", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "Companion", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AccountHomeFooterProvider implements PreviewParameterProvider<AccountHomeFooter> {

    @NotNull
    private final Sequence<AccountHomeFooter> values;
    public static final int $stable = 8;

    @NotNull
    private static final AccountHomeFooter WithAction = new AccountHomeFooter("iconUrl", "Woolworths acknowledges the Traditional Owners and Custodians of Country throughout Australia. We pay our respects to all First Nations people and acknowledge Elders past and present.", new IconListItemAction("https://www.everydayrewards.com.au/", "Read more"));

    @NotNull
    private static final AccountHomeFooter WithoutAction = new AccountHomeFooter("iconUrl", "Woolworths acknowledges the Traditional Owners and Custodians of Country throughout Australia. We pay our respects to all First Nations people and acknowledge Elders past and present.", null);

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    @NotNull
    public Sequence<AccountHomeFooter> getValues() {
        return this.values;
    }
}
