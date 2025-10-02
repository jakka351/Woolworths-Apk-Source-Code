package au.com.woolworths.shop.cart.ui.preview;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.design.wx.foundation.TintColors;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.woolworths.R;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/cart/ui/preview/CartProductPromoInfoProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/shop/cart/ui/preview/CartProductPromoInfoProvider$Content;", "Content", "TestCase", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CartProductPromoInfoProvider implements PreviewParameterProvider<Content> {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/preview/CartProductPromoInfoProvider$Content;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Content {

        /* renamed from: a, reason: collision with root package name */
        public final long f10501a;
        public final int b;
        public final String c;
        public final boolean d;

        public Content(long j, int i, String str, boolean z) {
            this.f10501a = j;
            this.b = i;
            this.c = str;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Color.c(this.f10501a, content.f10501a) && this.b == content.b && this.c.equals(content.c) && this.d == content.d;
        }

        public final int hashCode() {
            int i = Color.l;
            return Boolean.hashCode(this.d) + ((((this.c.hashCode() + b.a(this.b, Long.hashCode(this.f10501a) * 31, 31)) * 31) - 2097764075) * 31);
        }

        public final String toString() {
            return d.r(this.c, ", subtitle=2 for $8.00, isApplied=", ")", b.u("Content(themeColor=", this.b, Color.i(this.f10501a), ", iconId=", ", title="), this.d);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/preview/CartProductPromoInfoProvider$TestCase;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] e;
        public static final /* synthetic */ EnumEntries f;
        public final Content d;

        static {
            long j = TintColors.d;
            TestCase testCase = new TestCase("BuyMoreSaveMoreNotApplied", 0, new Content(j, R.drawable.ic_promotion_specials, "Buy More Save More", false));
            TestCase testCase2 = new TestCase("BuyMoreSaveMoreApplied", 1, new Content(j, R.drawable.ic_promotion_specials, "Buy More Save More applied", true));
            long j2 = TintColors.c;
            TestCase[] testCaseArr = {testCase, testCase2, new TestCase("MemberPriceNotApplied", 2, new Content(j2, R.drawable.ic_rewards_card_small, "Member Price", false)), new TestCase("MemberPriceApplied", 3, new Content(j2, R.drawable.ic_rewards_card_small, "Member Price applied", true))};
            e = testCaseArr;
            f = EnumEntriesKt.a(testCaseArr);
        }

        public TestCase(String str, int i, Content content) {
            this.d = content;
        }

        public static TestCase valueOf(String str) {
            return (TestCase) Enum.valueOf(TestCase.class, str);
        }

        public static TestCase[] values() {
            return (TestCase[]) e.clone();
        }
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
