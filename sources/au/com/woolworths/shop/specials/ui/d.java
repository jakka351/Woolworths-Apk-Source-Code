package au.com.woolworths.shop.specials.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.markdown.compat.MarkdownCompatKt;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCard;
import au.com.woolworths.shared.ui.compose.dynamicsizecard.DynamicSizeCardKt;
import au.com.woolworths.shop.aem.components.model.CatalogueCard;
import au.com.woolworths.shop.aem.components.model.QuickLinkCard;
import au.com.woolworths.shop.aem.components.model.chatentrycard.ChatEntryCard;
import au.com.woolworths.shop.aem.components.model.contentcard.ContentCardData;
import au.com.woolworths.shop.aem.components.model.editorialbanner.EditorialBannerData;
import au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListItem;
import au.com.woolworths.shop.aem.components.model.offercard.OfferCardData;
import au.com.woolworths.shop.aem.components.model.paragraph.ParagraphTextItemData;
import au.com.woolworths.shop.aem.components.ui.CatalogueCardKt;
import au.com.woolworths.shop.aem.components.ui.editorialbanner.EditorialBannerKt;
import au.com.woolworths.shop.cart.ui.cart.l;
import au.com.woolworths.shop.specials.SpecialsHomeFeature;
import au.com.woolworths.shop.specials.SpecialsHomeViewModel;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ SpecialsHomeViewModel e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ d(SpecialsHomeViewModel specialsHomeViewModel, HorizontalListData horizontalListData, HorizontalListItem horizontalListItem, int i) {
        this.d = i;
        this.e = specialsHomeViewModel;
        this.f = horizontalListData;
        this.g = horizontalListItem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f;
                final List list = (List) this.g;
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.h(LazyColumn, "$this$LazyColumn");
                for (Object obj2 : arrayList) {
                    boolean z = obj2 instanceof HorizontalListData;
                    final SpecialsHomeViewModel specialsHomeViewModel = this.e;
                    if (z) {
                        final HorizontalListData horizontalListData = (HorizontalListData) obj2;
                        LazyListScope.i(LazyColumn, null, obj2, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.specials.ui.SpecialsHomeScreenKt$Listing$2$1$1$1
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                LazyItemScope item = (LazyItemScope) obj3;
                                Composer composer = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer.c()) {
                                    composer.j();
                                } else {
                                    SpecialsHomeViewModel specialsHomeViewModel2 = specialsHomeViewModel;
                                    HorizontalListKt.b(horizontalListData, specialsHomeViewModel2, specialsHomeViewModel2.h.c(SpecialsHomeFeature.h), list, composer, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, true, 1472035932), 1);
                    } else if (obj2 instanceof CatalogueCard) {
                        final CatalogueCard catalogueCard = (CatalogueCard) obj2;
                        LazyListScope.i(LazyColumn, null, obj2, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.specials.ui.SpecialsHomeScreenKt$Listing$2$1$1$2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                LazyItemScope item = (LazyItemScope) obj3;
                                Composer composer = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer.c()) {
                                    composer.j();
                                } else {
                                    Modifier modifierH = PaddingKt.h(Modifier.Companion.d, 16, BitmapDescriptorFactory.HUE_RED, 2);
                                    composer.o(5004770);
                                    SpecialsHomeViewModel specialsHomeViewModel2 = specialsHomeViewModel;
                                    boolean zI = composer.I(specialsHomeViewModel2);
                                    Object objG = composer.G();
                                    if (zI || objG == Composer.Companion.f1624a) {
                                        SpecialsHomeScreenKt$Listing$2$1$1$2$1$1 specialsHomeScreenKt$Listing$2$1$1$2$1$1 = new SpecialsHomeScreenKt$Listing$2$1$1$2$1$1(1, specialsHomeViewModel2, SpecialsHomeViewModel.class, "onCatalogueCardClick", "onCatalogueCardClick(Lau/com/woolworths/shop/aem/components/model/CatalogueCard;)V", 0);
                                        composer.A(specialsHomeScreenKt$Listing$2$1$1$2$1$1);
                                        objG = specialsHomeScreenKt$Listing$2$1$1$2$1$1;
                                    }
                                    composer.l();
                                    CatalogueCardKt.a(catalogueCard, (Function1) ((KFunction) objG), modifierH, null, composer, 392, 8);
                                }
                                return Unit.f24250a;
                            }
                        }, true, 1086175621), 1);
                    } else if (obj2 instanceof ActionableCard) {
                        final ActionableCard actionableCard = (ActionableCard) obj2;
                        LazyListScope.i(LazyColumn, null, obj2, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.specials.ui.SpecialsHomeScreenKt$Listing$2$1$1$3
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                LazyItemScope item = (LazyItemScope) obj3;
                                Composer composer = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer.c()) {
                                    composer.j();
                                } else {
                                    Modifier modifierH = PaddingKt.h(Modifier.Companion.d, 16, BitmapDescriptorFactory.HUE_RED, 2);
                                    composer.o(5004770);
                                    SpecialsHomeViewModel specialsHomeViewModel2 = specialsHomeViewModel;
                                    boolean zI = composer.I(specialsHomeViewModel2);
                                    Object objG = composer.G();
                                    if (zI || objG == Composer.Companion.f1624a) {
                                        SpecialsHomeScreenKt$Listing$2$1$1$3$1$1 specialsHomeScreenKt$Listing$2$1$1$3$1$1 = new SpecialsHomeScreenKt$Listing$2$1$1$3$1$1(1, specialsHomeViewModel2, SpecialsHomeViewModel.class, "onDynamicSizeCardClick", "onDynamicSizeCardClick(Lau/com/woolworths/sdui/shop/dynamicsizecard/DynamicSizeCardData;)V", 0);
                                        composer.A(specialsHomeScreenKt$Listing$2$1$1$3$1$1);
                                        objG = specialsHomeScreenKt$Listing$2$1$1$3$1$1;
                                    }
                                    composer.l();
                                    DynamicSizeCardKt.b(actionableCard, modifierH, (Function1) ((KFunction) objG), null, ContentScale.Companion.f1880a, BitmapDescriptorFactory.HUE_RED, composer, 24632, 40);
                                }
                                return Unit.f24250a;
                            }
                        }, true, -570932636), 1);
                    } else if (obj2 instanceof ChatEntryCard) {
                        final ChatEntryCard chatEntryCard = (ChatEntryCard) obj2;
                        LazyListScope.i(LazyColumn, null, obj2, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.specials.ui.SpecialsHomeScreenKt$Listing$2$1$1$4
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                LazyItemScope item = (LazyItemScope) obj3;
                                Composer composer = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer.c()) {
                                    composer.j();
                                } else {
                                    composer.o(-1633490746);
                                    SpecialsHomeViewModel specialsHomeViewModel2 = specialsHomeViewModel;
                                    boolean zI = composer.I(specialsHomeViewModel2);
                                    ChatEntryCard chatEntryCard2 = chatEntryCard;
                                    boolean zI2 = zI | composer.I(chatEntryCard2);
                                    Object objG = composer.G();
                                    if (zI2 || objG == Composer.Companion.f1624a) {
                                        objG = new au.com.woolworths.shop.checkout.ui.details.c(29, specialsHomeViewModel2, chatEntryCard2);
                                        composer.A(objG);
                                    }
                                    composer.l();
                                    SpecialsHomeScreenKt.a(chatEntryCard2, (Function0) objG, composer, 8);
                                }
                                return Unit.f24250a;
                            }
                        }, true, 2066926403), 1);
                    } else if (obj2 instanceof EditorialBannerData) {
                        final EditorialBannerData editorialBannerData = (EditorialBannerData) obj2;
                        LazyListScope.i(LazyColumn, null, obj2, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.specials.ui.SpecialsHomeScreenKt$Listing$2$1$1$5
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                LazyItemScope item = (LazyItemScope) obj3;
                                Composer composer = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer.c()) {
                                    composer.j();
                                } else {
                                    Modifier modifierH = PaddingKt.h(Modifier.Companion.d, 16, BitmapDescriptorFactory.HUE_RED, 2);
                                    composer.o(-1633490746);
                                    SpecialsHomeViewModel specialsHomeViewModel2 = specialsHomeViewModel;
                                    boolean zI = composer.I(specialsHomeViewModel2);
                                    EditorialBannerData editorialBannerData2 = editorialBannerData;
                                    boolean zI2 = zI | composer.I(editorialBannerData2);
                                    Object objG = composer.G();
                                    if (zI2 || objG == Composer.Companion.f1624a) {
                                        objG = new l(23, specialsHomeViewModel2, editorialBannerData2);
                                        composer.A(objG);
                                    }
                                    composer.l();
                                    EditorialBannerKt.d(editorialBannerData2, modifierH, (Function1) objG, composer, 56);
                                }
                                return Unit.f24250a;
                            }
                        }, true, 409818146), 1);
                    } else if (obj2 instanceof ParagraphTextItemData) {
                        final ParagraphTextItemData paragraphTextItemData = (ParagraphTextItemData) obj2;
                        LazyListScope.i(LazyColumn, null, obj2, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.specials.ui.SpecialsHomeScreenKt$Listing$2$1$1$6
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                LazyItemScope item = (LazyItemScope) obj3;
                                Composer composer = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer.c()) {
                                    composer.j();
                                } else {
                                    MarkdownCompatKt.b(paragraphTextItemData.b, R.layout.content_page_html_text_content, PaddingKt.h(SizeKt.e(Modifier.Companion.d, 1.0f), 16, BitmapDescriptorFactory.HUE_RED, 2), null, null, null, composer, KyberEngine.KyberPolyBytes, 248);
                                }
                                return Unit.f24250a;
                            }
                        }, true, -1247290111), 1);
                    }
                }
                return Unit.f24250a;
            case 1:
                HorizontalListData horizontalListData2 = (HorizontalListData) this.f;
                QuickLinkCard quickLinkCard = (QuickLinkCard) this.g;
                QuickLinkCard it = (QuickLinkCard) obj;
                Intrinsics.h(it, "it");
                this.e.s6(horizontalListData2, quickLinkCard);
                break;
            case 2:
                HorizontalListData horizontalListData3 = (HorizontalListData) this.f;
                OfferCardData offerCardData = (OfferCardData) this.g;
                OfferCardData it2 = (OfferCardData) obj;
                Intrinsics.h(it2, "it");
                this.e.s6(horizontalListData3, offerCardData);
                break;
            default:
                HorizontalListData horizontalListData4 = (HorizontalListData) this.f;
                ContentCardData contentCardData = (ContentCardData) this.g;
                ContentCardData it3 = (ContentCardData) obj;
                Intrinsics.h(it3, "it");
                this.e.s6(horizontalListData4, contentCardData);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ d(ArrayList arrayList, SpecialsHomeViewModel specialsHomeViewModel, List list) {
        this.d = 0;
        this.f = arrayList;
        this.e = specialsHomeViewModel;
        this.g = list;
    }
}
