package au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan.EverydayExtrasChoosePlanFeed;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/chooseplan/ui/ChoosePlanFeedProviderItem;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ChoosePlanFeedProviderItem {

    /* renamed from: a, reason: collision with root package name */
    public final Screen f6077a;
    public final EverydayExtrasChoosePlanFeed b;
    public final boolean c;

    public ChoosePlanFeedProviderItem(Screen screen, EverydayExtrasChoosePlanFeed everydayExtrasChoosePlanFeed, boolean z) {
        this.f6077a = screen;
        this.b = everydayExtrasChoosePlanFeed;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChoosePlanFeedProviderItem)) {
            return false;
        }
        ChoosePlanFeedProviderItem choosePlanFeedProviderItem = (ChoosePlanFeedProviderItem) obj;
        return this.f6077a == choosePlanFeedProviderItem.f6077a && this.b.equals(choosePlanFeedProviderItem.b) && this.c == choosePlanFeedProviderItem.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f6077a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChoosePlanFeedProviderItem(screen=");
        sb.append(this.f6077a);
        sb.append(", choosePlanFeed=");
        sb.append(this.b);
        sb.append(", showPriceCents=");
        return YU.a.k(")", sb, this.c);
    }
}
