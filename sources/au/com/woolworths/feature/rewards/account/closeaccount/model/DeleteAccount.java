package au.com.woolworths.feature.rewards.account.closeaccount.model;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.ContentCta;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/closeaccount/model/DeleteAccount;", "Lau/com/woolworths/feature/rewards/account/closeaccount/model/ConsentPage;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DeleteAccount implements ConsentPage {

    /* renamed from: a, reason: collision with root package name */
    public final String f5692a;
    public final String b;
    public final String c;
    public final ContentCta d;
    public final String e;
    public final String f;

    public DeleteAccount(String str, String str2, String str3, ContentCta contentCta, String str4, String str5) {
        this.f5692a = str;
        this.b = str2;
        this.c = str3;
        this.d = contentCta;
        this.e = str4;
        this.f = str5;
    }

    @Override // au.com.woolworths.feature.rewards.account.closeaccount.model.ConsentPage
    /* renamed from: a, reason: from getter */
    public final ContentCta getD() {
        return this.d;
    }

    @Override // au.com.woolworths.feature.rewards.account.closeaccount.model.ConsentPage
    /* renamed from: b, reason: from getter */
    public final String getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteAccount)) {
            return false;
        }
        DeleteAccount deleteAccount = (DeleteAccount) obj;
        return Intrinsics.c(this.f5692a, deleteAccount.f5692a) && Intrinsics.c(this.b, deleteAccount.b) && Intrinsics.c(this.c, deleteAccount.c) && Intrinsics.c(this.d, deleteAccount.d) && Intrinsics.c(this.e, deleteAccount.e) && Intrinsics.c(this.f, deleteAccount.f);
    }

    @Override // au.com.woolworths.feature.rewards.account.closeaccount.model.ConsentPage
    /* renamed from: getTitle, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final int hashCode() {
        return this.f.hashCode() + b.c((this.d.hashCode() + b.c(b.c(this.f5692a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sbV = a.v("DeleteAccount(navigationTitle=", this.f5692a, ", title=", this.b, ", markdownDescription=");
        sbV.append(this.c);
        sbV.append(", primaryCta=");
        sbV.append(this.d);
        sbV.append(", consentLabel=");
        return androidx.constraintlayout.core.state.a.l(sbV, this.e, ", consentToken=", this.f, ")");
    }
}
