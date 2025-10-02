package au.com.woolworths.shop.checkout.ui.substitution.component.preview;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerActionApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerActionPlacementTypeApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerActionTypeApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerTypeApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonStyleApiData;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerType;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import au.com.woolworths.shop.checkout.domain.model.substitution.CheaperSubstitutesSection;
import au.com.woolworths.shop.checkout.domain.model.substitution.ProductSubstitute;
import au.com.woolworths.shop.checkout.domain.model.substitution.ProductSubstitutesSection;
import au.com.woolworths.shop.checkout.domain.model.substitution.ProductToBeSubstituteSection;
import au.com.woolworths.shop.checkout.domain.model.substitution.SubstitutionPreference;
import au.com.woolworths.shop.checkout.domain.model.substitution.SubstitutionPreferenceFooter;
import au.com.woolworths.shop.checkout.domain.model.substitution.SubstitutionPreferenceOption;
import au.com.woolworths.shop.checkout.domain.model.substitution.SubstitutionPreferenceOptionsSection;
import au.com.woolworths.shop.checkout.ui.details.d;
import au.com.woolworths.shop.checkout.ui.substitution.SubstitutionContract;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/substitution/component/preview/SubstitutionViewStateProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/shop/checkout/ui/substitution/SubstitutionContract$ViewState;", "TestCase", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SubstitutionViewStateProvider implements PreviewParameterProvider<SubstitutionContract.ViewState> {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f10821a;
    public static final SubstitutionContract.ViewState.Content b;
    public static final SubstitutionContract.ViewState.Content c;
    public static final SubstitutionContract.ViewState.Content d;
    public static final SubstitutionContract.ViewState.Content e;
    public static final SubstitutionContract.ViewState.Content f;
    public static final SubstitutionContract.ViewState.Content g;
    public static final SubstitutionContract.ViewState.Content h;
    public static final SubstitutionContract.ViewState.Content i;
    public static final SubstitutionContract.ViewState.Content j;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/substitution/component/preview/SubstitutionViewStateProvider$Companion;", "", "Lau/com/woolworths/shop/checkout/domain/model/substitution/ProductToBeSubstituteSection;", "productToBeSubstituteSection", "Lau/com/woolworths/shop/checkout/domain/model/substitution/ProductToBeSubstituteSection;", "Lau/com/woolworths/shop/checkout/domain/model/substitution/CheaperSubstitutesSection;", "cheaperSubstitutesSectionNoData", "Lau/com/woolworths/shop/checkout/domain/model/substitution/CheaperSubstitutesSection;", "cheaperSubstitutesSection", "Lau/com/woolworths/shop/checkout/domain/model/substitution/ProductSubstitutesSection;", "productSubstitutesSection", "Lau/com/woolworths/shop/checkout/domain/model/substitution/ProductSubstitutesSection;", "productSubstitutesSectionLong", "", "", "", "currentProductSubstituteState", "Ljava/util/Map;", "Lau/com/woolworths/shop/checkout/domain/model/substitution/SubstitutionPreferenceFooter;", "footerWithButtonEnabled", "Lau/com/woolworths/shop/checkout/domain/model/substitution/SubstitutionPreferenceFooter;", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "insetBanner", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static SubstitutionPreferenceOption a(boolean z) {
            return new SubstitutionPreferenceOption("CHOOSE_FOR_ME", "Choose for me", z, true, false, "Your Woolworths's personal shopper will pick a suitable substitute for you.");
        }

        public static SubstitutionPreferenceOption b() {
            return new SubstitutionPreferenceOption("DO_NOT_SUB", "Don't substitute", false, true, false, null);
        }

        public static SubstitutionPreferenceOption c(int i) {
            return new SubstitutionPreferenceOption("MY_CHOICE", "My choice", (i & 1) == 0, (i & 2) != 0, true, "Suggest your substitution preference and we'll do our best to supply any of your choices.");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/substitution/component/preview/SubstitutionViewStateProvider$TestCase;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] e;
        public static final /* synthetic */ EnumEntries f;
        public final SubstitutionContract.ViewState d;

        static {
            TestCase[] testCaseArr = {new TestCase("Loading", 0, SubstitutionContract.ViewState.Loading.f10817a), new TestCase("ConnectionError", 1, new SubstitutionContract.ViewState.Error(FullPageMessage.Error.ConnectionError.f8915a)), new TestCase("ServerError", 2, new SubstitutionContract.ViewState.Error(FullPageMessage.Error.ServerError.f8916a)), new TestCase("ContentWithChooseForMeSelected", 3, SubstitutionViewStateProvider.b), new TestCase("ContentWithMyChoiceSelected", 4, SubstitutionViewStateProvider.c), new TestCase("ContentWithMyChoiceLongListSelected", 5, SubstitutionViewStateProvider.d), new TestCase("ContentWithMyChoiceDisabled", 6, SubstitutionViewStateProvider.e), new TestCase("ContentWithMyChoiceDisabledButSelected", 7, SubstitutionViewStateProvider.f), new TestCase("ContentWithDoNotSubSelected", 8, SubstitutionViewStateProvider.g), new TestCase("ContentWithUnchangedState", 9, SubstitutionViewStateProvider.h), new TestCase("ContentWithCheaperSubstituteBanner", 10, SubstitutionViewStateProvider.i), new TestCase("ContentWithCheaperSubstituteBannerHasBeenDismissed", 11, SubstitutionViewStateProvider.j)};
            e = testCaseArr;
            f = EnumEntriesKt.a(testCaseArr);
        }

        public TestCase(String str, int i, SubstitutionContract.ViewState viewState) {
            this.d = viewState;
        }

        public static TestCase valueOf(String str) {
            return (TestCase) Enum.valueOf(TestCase.class, str);
        }

        public static TestCase[] values() {
            return (TestCase[]) e.clone();
        }
    }

    static {
        ProductToBeSubstituteSection productToBeSubstituteSection = new ProductToBeSubstituteSection("Product name", "123456", "");
        CheaperSubstitutesSection cheaperSubstitutesSection = new CheaperSubstitutesSection(null);
        BroadcastBannerType broadcastBannerType = BroadcastBannerType.PRIMARY;
        Boolean bool = Boolean.TRUE;
        CheaperSubstitutesSection cheaperSubstitutesSection2 = new CheaperSubstitutesSection(new BroadcastBannerData("Banner title", NotificationMessage.NOTIF_KEY_SUB_TITLE, null, null, null, broadcastBannerType, "", bool, "123"));
        ProductSubstitutesSection productSubstitutesSection = new ProductSubstitutesSection(CollectionsKt.R(new ProductSubstitute(1.0d, SequencesKt.p(new LoremIpsum(10).getValues(), null, new d(8), 31), "product1", "", true), new ProductSubstitute(1.0d, SequencesKt.p(new LoremIpsum(10).getValues(), null, new d(9), 31), "product2", "", false), new ProductSubstitute(1.0d, SequencesKt.p(new LoremIpsum(10).getValues(), null, new d(10), 31), "product3", "", false)));
        ProductSubstitutesSection productSubstitutesSection2 = new ProductSubstitutesSection(CollectionsKt.R(new ProductSubstitute(1.0d, SequencesKt.p(new LoremIpsum(10).getValues(), null, new d(11), 31), "product1", "", true), new ProductSubstitute(1.0d, SequencesKt.p(new LoremIpsum(10).getValues(), null, new d(12), 31), "product2", "", false), new ProductSubstitute(1.0d, SequencesKt.p(new LoremIpsum(10).getValues(), null, new d(13), 31), "product3", "", false), new ProductSubstitute(1.0d, SequencesKt.p(new LoremIpsum(10).getValues(), null, new d(14), 31), "product4", "", false), new ProductSubstitute(1.0d, SequencesKt.p(new LoremIpsum(10).getValues(), null, new d(15), 31), "product5", "", false), new ProductSubstitute(1.0d, SequencesKt.p(new LoremIpsum(10).getValues(), null, new d(16), 31), "product6", "", false)));
        Pair pair = new Pair("product1", bool);
        Boolean bool2 = Boolean.FALSE;
        Map mapJ = MapsKt.j(pair, new Pair("product2", bool2), new Pair("product3", bool2));
        f10821a = mapJ;
        SubstitutionPreferenceFooter substitutionPreferenceFooter = new SubstitutionPreferenceFooter(new ButtonApiData("Save", null, ButtonStyleApiData.PRIMARY, true, null, null, null, null, null, 498, null));
        InsetBannerApiData insetBannerApiData = new InsetBannerApiData(InsetBannerTypeApiData.INFO, "Sorry, there is an issue getting your My choice suggestions.", null, new InsetBannerActionApiData("Try again", null, InsetBannerActionTypeApiData.APPLOCAL, InsetBannerActionPlacementTypeApiData.BOTTOM, null), null, null, 32, null);
        SubstitutionPreference substitutionPreference = new SubstitutionPreference(productToBeSubstituteSection, cheaperSubstitutesSection, new SubstitutionPreferenceOptionsSection("Select an option", CollectionsKt.R(Companion.a(true), Companion.c(3), Companion.b()), null), productSubstitutesSection, substitutionPreferenceFooter);
        SubstitutionContract.ViewState.ButtonState buttonState = SubstitutionContract.ViewState.ButtonState.d;
        b = new SubstitutionContract.ViewState.Content(substitutionPreference, "CHOOSE_FOR_ME", buttonState, mapJ, false);
        c = new SubstitutionContract.ViewState.Content(new SubstitutionPreference(productToBeSubstituteSection, cheaperSubstitutesSection, new SubstitutionPreferenceOptionsSection("Select an option", CollectionsKt.R(Companion.a(false), Companion.c(2), Companion.b()), null), productSubstitutesSection, substitutionPreferenceFooter), "MY_CHOICE", buttonState, mapJ, false);
        d = new SubstitutionContract.ViewState.Content(new SubstitutionPreference(productToBeSubstituteSection, cheaperSubstitutesSection, new SubstitutionPreferenceOptionsSection("Select an option", CollectionsKt.R(Companion.a(false), Companion.c(2), Companion.b()), null), productSubstitutesSection2, substitutionPreferenceFooter), "MY_CHOICE", buttonState, mapJ, false);
        e = new SubstitutionContract.ViewState.Content(new SubstitutionPreference(productToBeSubstituteSection, cheaperSubstitutesSection, new SubstitutionPreferenceOptionsSection("Select an option", CollectionsKt.R(Companion.a(true), Companion.c(1), Companion.b()), insetBannerApiData), productSubstitutesSection, substitutionPreferenceFooter), "CHOOSE_FOR_ME", buttonState, mapJ, false);
        f = new SubstitutionContract.ViewState.Content(new SubstitutionPreference(productToBeSubstituteSection, cheaperSubstitutesSection, new SubstitutionPreferenceOptionsSection("Select an option", CollectionsKt.R(Companion.a(false), new SubstitutionPreferenceOption("MY_CHOICE", "My choice", true, false, true, "Suggest your substitution preference and we'll do our best to supply any of your choices."), Companion.b()), insetBannerApiData), productSubstitutesSection, substitutionPreferenceFooter), "MY_CHOICE", buttonState, mapJ, false);
        g = new SubstitutionContract.ViewState.Content(new SubstitutionPreference(productToBeSubstituteSection, cheaperSubstitutesSection, new SubstitutionPreferenceOptionsSection("Select an option", CollectionsKt.R(Companion.a(false), Companion.c(3), new SubstitutionPreferenceOption("DO_NOT_SUB", "Don't substitute", true, true, false, null)), null), productSubstitutesSection, substitutionPreferenceFooter), "DO_NOT_SUB", buttonState, mapJ, false);
        SubstitutionPreference substitutionPreference2 = new SubstitutionPreference(productToBeSubstituteSection, cheaperSubstitutesSection, new SubstitutionPreferenceOptionsSection("Select an option", CollectionsKt.R(Companion.a(true), Companion.c(3), Companion.b()), null), productSubstitutesSection, substitutionPreferenceFooter);
        SubstitutionContract.ViewState.ButtonState buttonState2 = SubstitutionContract.ViewState.ButtonState.e;
        h = new SubstitutionContract.ViewState.Content(substitutionPreference2, "CHOOSE_FOR_ME", buttonState2, mapJ, false);
        i = new SubstitutionContract.ViewState.Content(new SubstitutionPreference(productToBeSubstituteSection, cheaperSubstitutesSection2, new SubstitutionPreferenceOptionsSection("Select an option", CollectionsKt.R(Companion.a(true), Companion.c(3), Companion.b()), null), productSubstitutesSection, substitutionPreferenceFooter), "CHOOSE_FOR_ME", buttonState2, mapJ, false);
        j = new SubstitutionContract.ViewState.Content(new SubstitutionPreference(productToBeSubstituteSection, cheaperSubstitutesSection2, new SubstitutionPreferenceOptionsSection("Select an option", CollectionsKt.R(Companion.a(true), Companion.c(3), Companion.b()), null), productSubstitutesSection, substitutionPreferenceFooter), "CHOOSE_FOR_ME", buttonState2, mapJ, true);
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
