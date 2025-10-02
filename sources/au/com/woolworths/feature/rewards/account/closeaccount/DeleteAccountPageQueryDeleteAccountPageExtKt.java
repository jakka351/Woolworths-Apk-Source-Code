package au.com.woolworths.feature.rewards.account.closeaccount;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.rewards.account.closeaccount.model.DeleteAccount;
import com.woolworths.rewards.account.DeleteAccountPageQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"account_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeleteAccountPageQueryDeleteAccountPageExtKt {
    public static final DeleteAccount a(DeleteAccountPageQuery.DeleteAccountPage deleteAccountPage) {
        Intrinsics.h(deleteAccountPage, "<this>");
        String str = deleteAccountPage.f20539a;
        String str2 = deleteAccountPage.b;
        String str3 = deleteAccountPage.c;
        DeleteAccountPageQuery.PrimaryCta primaryCta = deleteAccountPage.d;
        Intrinsics.h(primaryCta, "<this>");
        return new DeleteAccount(str, str2, str3, new ContentCta(primaryCta.f20540a, primaryCta.b, (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null), deleteAccountPage.e, deleteAccountPage.f);
    }
}
