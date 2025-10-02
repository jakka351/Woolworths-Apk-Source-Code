package au.com.woolworths.feature.shop.account.ui.details.components.preview;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.feature.shop.account.model.details.AccountDetailsData;
import au.com.woolworths.feature.shop.account.model.details.AccountFeedItem;
import au.com.woolworths.sdui.common.corerow.model.CoreRowModel;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.model.action.ActionType;
import au.com.woolworths.shop.aem.components.model.button.ButtonData;
import au.com.woolworths.shop.aem.components.model.button.ButtonStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/account/ui/details/components/preview/AccountDetailsViewStateProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/shop/account/model/details/AccountDetailsData;", "TestCase", "Companion", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AccountDetailsViewStateProvider implements PreviewParameterProvider<AccountDetailsData> {

    /* renamed from: a, reason: collision with root package name */
    public static final AccountDetailsData f6585a;
    public static final AccountDetailsData b;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/feature/shop/account/ui/details/components/preview/AccountDetailsViewStateProvider$Companion;", "", "Lau/com/woolworths/feature/shop/account/model/details/AccountFeedItem$AccountPersonalDetails;", "personalDetails", "Lau/com/woolworths/feature/shop/account/model/details/AccountFeedItem$AccountPersonalDetails;", "Lau/com/woolworths/feature/shop/account/model/details/AccountFeedItem$AccountContactDetails;", "contactDetails", "Lau/com/woolworths/feature/shop/account/model/details/AccountFeedItem$AccountContactDetails;", "Lau/com/woolworths/feature/shop/account/model/details/AccountFeedItem$AccountPreferences;", "preferences", "Lau/com/woolworths/feature/shop/account/model/details/AccountFeedItem$AccountPreferences;", "Lau/com/woolworths/feature/shop/account/model/details/AccountFeedItem$AccountFooter;", "footer", "Lau/com/woolworths/feature/shop/account/model/details/AccountFeedItem$AccountFooter;", "Lau/com/woolworths/feature/shop/account/model/details/AccountDetailsData;", "allData", "Lau/com/woolworths/feature/shop/account/model/details/AccountDetailsData;", "dataWithoutPreferences", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/account/ui/details/components/preview/AccountDetailsViewStateProvider$TestCase;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] e;
        public static final /* synthetic */ EnumEntries f;
        public final AccountDetailsData d;

        static {
            TestCase[] testCaseArr = {new TestCase("AllContent", 0, AccountDetailsViewStateProvider.f6585a), new TestCase("DataWithoutPreferences", 1, AccountDetailsViewStateProvider.b)};
            e = testCaseArr;
            f = EnumEntriesKt.a(testCaseArr);
        }

        public TestCase(String str, int i, AccountDetailsData accountDetailsData) {
            this.d = accountDetailsData;
        }

        public static TestCase valueOf(String str) {
            return (TestCase) Enum.valueOf(TestCase.class, str);
        }

        public static TestCase[] values() {
            return (TestCase[]) e.clone();
        }
    }

    static {
        AccountFeedItem.AccountPersonalDetails accountPersonalDetails = new AccountFeedItem.AccountPersonalDetails("Personal", null, CollectionsKt.R(new CoreRowModel("Full name", null, null, "Christopher Smith-Thomas", null, null), new CoreRowModel("Date of birth", null, null, "14/10/1990", null, null)));
        AccountFeedItem.AccountContactDetails accountContactDetails = new AccountFeedItem.AccountContactDetails("Contact", "Receive updates on your orders", CollectionsKt.R(new CoreRowModel("Phone number", null, null, "0403 123 789", null, null), new CoreRowModel("Active address", null, null, "798 New Line Road, NIMMITABEL NSW 2631", null, null), new CoreRowModel("Email", null, null, "chris-thomas-smith@gmail.com", null, null)));
        AccountFeedItem.AccountPreferences accountPreferences = new AccountFeedItem.AccountPreferences("Account preferences", "Communications, substitutions and free samples", CollectionsKt.Q(new CoreRowModel(null, null, null, "Manage preferences", null, null)));
        AccountFeedItem.AccountFooter accountFooter = new AccountFeedItem.AccountFooter(new ButtonData("id", "Manage account details", ButtonStyle.d, true, new ActionData("url", ActionType.e, "id", null), "url", null, null));
        f6585a = new AccountDetailsData(CollectionsKt.R(accountPersonalDetails, accountContactDetails, accountPreferences, accountFooter));
        b = new AccountDetailsData(CollectionsKt.R(accountPersonalDetails, accountContactDetails, accountFooter));
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        List list = TestCase.f;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator it = ((AbstractList) list).iterator();
        while (it.hasNext()) {
            arrayList.add(((TestCase) it.next()).d);
        }
        return CollectionsKt.n(arrayList);
    }
}
