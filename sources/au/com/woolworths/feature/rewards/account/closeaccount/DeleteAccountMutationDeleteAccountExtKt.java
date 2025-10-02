package au.com.woolworths.feature.rewards.account.closeaccount;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.rewards.account.closeaccount.model.DeleteAccountConfirmation;
import com.woolworths.rewards.account.DeleteAccountMutation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"account_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeleteAccountMutationDeleteAccountExtKt {
    public static final DeleteAccountConfirmation a(DeleteAccountMutation.DeleteAccount deleteAccount) {
        Intrinsics.h(deleteAccount, "<this>");
        String str = deleteAccount.f20536a;
        String str2 = deleteAccount.b;
        String str3 = deleteAccount.c;
        DeleteAccountMutation.PrimaryCta primaryCta = deleteAccount.d;
        Intrinsics.h(primaryCta, "<this>");
        return new DeleteAccountConfirmation(str, str2, str3, new ContentCta(primaryCta.f20537a, primaryCta.b, (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null));
    }
}
