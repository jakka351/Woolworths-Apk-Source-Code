package au.com.woolworths.shop.checkout.data.mappers;

import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.base.shopapp.data.models.InfoSectionItem;
import au.com.woolworths.base.shopapp.modules.badge.BadgeApiData;
import au.com.woolworths.sdui.common.corecolortheme.CoreColorTheme;
import au.com.woolworths.sdui.common.coretag.model.CoreTagModel;
import au.com.woolworths.sdui.shop.fragment.CoreTagUI;
import au.com.woolworths.shop.checkout.domain.model.CheckoutTermsConditions;
import au.com.woolworths.shop.checkout.domain.model.DeliveryNowStatus;
import au.com.woolworths.shop.checkout.domain.model.DeliveryNowWindow;
import au.com.woolworths.shop.checkout.domain.model.DirectToBootNowStatus;
import au.com.woolworths.shop.checkout.domain.model.DirectToBootNowWindow;
import au.com.woolworths.shop.checkout.domain.model.ExtraInfoButton;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentExtraInfo;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentSlotSelectionOptionsItem;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentSlotSelectionOptionsState;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowSlotSelectionInfo;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsGroup;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsMessage;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsOption;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsSlot;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsSlotBadge;
import au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentWindowsFooterV2;
import au.com.woolworths.shop.graphql.type.FulfilmentWindowSlotSelectionOptionId;
import com.woolworths.shop.checkout.fragment.CheckoutFulfilmentWindows;
import com.woolworths.shop.checkout.fragment.FulfilmentExtraInfo;
import com.woolworths.shop.checkout.fragment.SelectionInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CheckoutFulfilmentWindowsOptionExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v64, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54 */
    /* JADX WARN: Type inference failed for: r6v56, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v63 */
    /* JADX WARN: Type inference failed for: r6v64 */
    /* JADX WARN: Type inference failed for: r6v74, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.util.ArrayList] */
    public static final FulfilmentWindowsOption a(CheckoutFulfilmentWindows.Option option) {
        FulfilmentExtraInfo fulfilmentExtraInfo;
        String str;
        DirectToBootNowWindow directToBootNowWindow;
        EmptyList emptyList;
        DeliveryNowWindow deliveryNowWindow;
        DeliveryNowWindow deliveryNowWindow2;
        DirectToBootNowWindow directToBootNowWindow2;
        String str2;
        String str3;
        FulfilmentWindowSlotSelectionInfo fulfilmentWindowSlotSelectionInfo;
        BadgeApiData badgeApiData;
        FulfilmentWindowSlotSelectionInfo fulfilmentWindowSlotSelectionInfo2;
        String str4;
        FulfilmentSlotSelectionOptionsState fulfilmentSlotSelectionOptionsState;
        ?? arrayList;
        EmptyList emptyList2;
        Iterator it;
        String str5;
        FulfilmentSlotSelectionOptionsItem fulfilmentSlotSelectionOptionsItem;
        FulfilmentWindowSlotSelectionInfo fulfilmentWindowSlotSelectionInfo3;
        InfoSection infoSection;
        EmptyList emptyList3;
        ?? arrayList2;
        boolean z;
        FulfilmentWindowsMessage fulfilmentWindowsMessage;
        ?? arrayList3;
        FulfilmentWindowSlotSelectionInfo fulfilmentWindowSlotSelectionInfo4;
        ArrayList arrayList4;
        ?? arrayList5;
        ?? arrayList6;
        FulfilmentWindowSlotSelectionInfo fulfilmentWindowSlotSelectionInfo5;
        ArrayList arrayList7;
        FulfilmentWindowsFooterV2 fulfilmentWindowsFooterV2;
        ExtraInfoButton extraInfoButton;
        FulfilmentSlotSelectionOptionsState fulfilmentSlotSelectionOptionsState2;
        ?? arrayList8;
        ?? arrayList9;
        Iterator it2;
        ExtraInfoButton extraInfoButton2;
        FulfilmentSlotSelectionOptionsItem fulfilmentSlotSelectionOptionsItem2;
        Object objA;
        Intrinsics.h(option, "<this>");
        String str6 = option.f22398a;
        String str7 = option.b;
        boolean z2 = option.c;
        boolean z3 = option.d;
        String str8 = option.e;
        CheckoutFulfilmentWindows.FooterV2 footerV2 = option.f;
        FulfilmentWindowsFooterV2 fulfilmentWindowsFooterV22 = footerV2 != null ? new FulfilmentWindowsFooterV2(footerV2.f22392a, footerV2.b, footerV2.c) : null;
        String str9 = option.g;
        CheckoutFulfilmentWindows.ExtraInfoButton extraInfoButton3 = option.h;
        ExtraInfoButton extraInfoButton4 = extraInfoButton3 != null ? new ExtraInfoButton(extraInfoButton3.f22389a, extraInfoButton3.b) : null;
        CheckoutFulfilmentWindows.ExtraInfo extraInfo = option.i;
        if (extraInfo != null) {
            com.woolworths.shop.checkout.fragment.FulfilmentExtraInfo fulfilmentExtraInfo2 = extraInfo.b;
            String str10 = fulfilmentExtraInfo2.f22478a;
            ArrayList<FulfilmentExtraInfo.Content> arrayList10 = fulfilmentExtraInfo2.b;
            ArrayList arrayList11 = new ArrayList();
            for (FulfilmentExtraInfo.Content content : arrayList10) {
                FulfilmentExtraInfo.OnBasicInsetAlert onBasicInsetAlert = content.b;
                if (onBasicInsetAlert != null) {
                    objA = FulfilmentExtraInfoOnBasicInsetAlertExtKt.a(onBasicInsetAlert);
                } else {
                    FulfilmentExtraInfo.OnBasicCoreBroadcastBanner onBasicCoreBroadcastBanner = content.c;
                    if (onBasicCoreBroadcastBanner != null) {
                        objA = FulfilmentExtraInfoOnBasicCoreBroadcastBannerExtKt.a(onBasicCoreBroadcastBanner);
                    } else {
                        FulfilmentExtraInfo.OnFulfilmentFeesInfoSection onFulfilmentFeesInfoSection = content.d;
                        if (onFulfilmentFeesInfoSection != null) {
                            objA = FulfilmentExtraInfoOnFulfilmentFeesInfoSectionExtKt.a(onFulfilmentFeesInfoSection);
                        } else {
                            FulfilmentExtraInfo.OnCheckoutTermsConditions onCheckoutTermsConditions = content.e;
                            if (onCheckoutTermsConditions != null) {
                                objA = new CheckoutTermsConditions(onCheckoutTermsConditions.f22494a);
                            } else {
                                FulfilmentExtraInfo.OnFulfilmentInfoRowAccordion onFulfilmentInfoRowAccordion = content.f;
                                objA = onFulfilmentInfoRowAccordion != null ? FulfilmentExtraInfoOnFulfilmentInfoRowAccordionExtKt.a(onFulfilmentInfoRowAccordion) : null;
                            }
                        }
                    }
                }
                if (objA != null) {
                    arrayList11.add(objA);
                }
            }
            fulfilmentExtraInfo = new au.com.woolworths.shop.checkout.domain.model.FulfilmentExtraInfo(str10, arrayList11);
        } else {
            fulfilmentExtraInfo = null;
        }
        int iOrdinal = option.k.ordinal();
        DeliveryNowStatus deliveryNowStatus = iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? DeliveryNowStatus.i : DeliveryNowStatus.h : DeliveryNowStatus.g : DeliveryNowStatus.f : DeliveryNowStatus.e : DeliveryNowStatus.d;
        CheckoutFulfilmentWindows.DirectToBootNow directToBootNow = option.l;
        if (directToBootNow != null) {
            str = str9;
            directToBootNowWindow = new DirectToBootNowWindow(directToBootNow.f22384a, directToBootNow.b, directToBootNow.c, directToBootNow.d, directToBootNow.e, directToBootNow.f, directToBootNow.g, directToBootNow.h, null, null, null, null, null, null);
        } else {
            str = str9;
            directToBootNowWindow = null;
        }
        int iOrdinal2 = option.n.ordinal();
        DirectToBootNowStatus directToBootNowStatus = iOrdinal2 != 0 ? iOrdinal2 != 1 ? iOrdinal2 != 2 ? iOrdinal2 != 3 ? iOrdinal2 != 4 ? DirectToBootNowStatus.i : DirectToBootNowStatus.h : DirectToBootNowStatus.g : DirectToBootNowStatus.f : DirectToBootNowStatus.e : DirectToBootNowStatus.d;
        ArrayList arrayList12 = option.o;
        ArrayList arrayList13 = new ArrayList(CollectionsKt.s(arrayList12, 10));
        Iterator it3 = arrayList12.iterator();
        while (true) {
            boolean zHasNext = it3.hasNext();
            emptyList = EmptyList.d;
            if (!zHasNext) {
                break;
            }
            CheckoutFulfilmentWindows.Group group = (CheckoutFulfilmentWindows.Group) it3.next();
            Intrinsics.h(group, "<this>");
            String str11 = group.f22393a;
            Iterator it4 = it3;
            boolean z4 = group.b;
            String str12 = group.c;
            CheckoutFulfilmentWindows.Message message = group.d;
            String str13 = str7;
            if (message != null) {
                z = z2;
                fulfilmentWindowsMessage = new FulfilmentWindowsMessage(message.f22397a, message.b);
            } else {
                z = z2;
                fulfilmentWindowsMessage = null;
            }
            String str14 = group.e;
            ArrayList arrayList14 = group.f;
            boolean z5 = z3;
            ArrayList arrayList15 = new ArrayList(CollectionsKt.s(arrayList14, 10));
            Iterator it5 = arrayList14.iterator();
            while (it5.hasNext()) {
                CheckoutFulfilmentWindows.Slot1 slot1 = (CheckoutFulfilmentWindows.Slot1) it5.next();
                Intrinsics.h(slot1, "<this>");
                String str15 = slot1.f22410a;
                Iterator it6 = it5;
                String str16 = slot1.b;
                String str17 = slot1.c;
                int i = slot1.d;
                boolean z6 = slot1.e;
                boolean z7 = slot1.f;
                boolean z8 = slot1.g;
                String str18 = slot1.h;
                ArrayList arrayList16 = slot1.i;
                String str19 = str8;
                String str20 = str11;
                ArrayList arrayList17 = new ArrayList(CollectionsKt.s(arrayList16, 10));
                for (Iterator it7 = arrayList16.iterator(); it7.hasNext(); it7 = it7) {
                    CheckoutFulfilmentWindows.Badge1 badge1 = (CheckoutFulfilmentWindows.Badge1) it7.next();
                    Intrinsics.h(badge1, "<this>");
                    arrayList17.add(new FulfilmentWindowsSlotBadge(CheckoutBadgeStyleExtKt.a(badge1.b), badge1.f22379a));
                }
                CheckoutFulfilmentWindows.SelectionInfo3 selectionInfo3 = slot1.j;
                if (selectionInfo3 != null) {
                    SelectionInfo selectionInfo = selectionInfo3.b;
                    fulfilmentWindowSlotSelectionInfo5 = new FulfilmentWindowSlotSelectionInfo(selectionInfo.f22536a, FulfilmentWindowsFooterIconExtKt.a(selectionInfo.b));
                } else {
                    fulfilmentWindowSlotSelectionInfo5 = null;
                }
                CheckoutFulfilmentWindows.SelectionOptionsState1 selectionOptionsState1 = slot1.k;
                if (selectionOptionsState1 != null) {
                    FulfilmentWindowSlotSelectionOptionId.e.getClass();
                    arrayList7 = arrayList17;
                    List listR = CollectionsKt.R(FulfilmentWindowSlotSelectionOptionId.g, FulfilmentWindowSlotSelectionOptionId.h, FulfilmentWindowSlotSelectionOptionId.i);
                    ArrayList arrayList18 = new ArrayList();
                    Iterator it8 = listR.iterator();
                    while (it8.hasNext()) {
                        Object next = it8.next();
                        Iterator it9 = it8;
                        FulfilmentWindowsFooterV2 fulfilmentWindowsFooterV23 = fulfilmentWindowsFooterV22;
                        if (!selectionOptionsState1.b.contains((FulfilmentWindowSlotSelectionOptionId) next)) {
                            arrayList18.add(next);
                        }
                        it8 = it9;
                        fulfilmentWindowsFooterV22 = fulfilmentWindowsFooterV23;
                    }
                    fulfilmentWindowsFooterV2 = fulfilmentWindowsFooterV22;
                    ArrayList arrayList19 = new ArrayList(CollectionsKt.s(arrayList18, 10));
                    Iterator it10 = arrayList18.iterator();
                    while (it10.hasNext()) {
                        FulfilmentWindowSlotSelectionOptionId fulfilmentWindowSlotSelectionOptionId = (FulfilmentWindowSlotSelectionOptionId) it10.next();
                        if (selectionOptionsState1.f22408a.contains(fulfilmentWindowSlotSelectionOptionId)) {
                            it2 = it10;
                            extraInfoButton2 = extraInfoButton4;
                            fulfilmentSlotSelectionOptionsItem2 = new FulfilmentSlotSelectionOptionsItem(FulfilmentWindowSlotSelectionOptionIdExtKt.a(fulfilmentWindowSlotSelectionOptionId), true, fulfilmentWindowSlotSelectionOptionId == selectionOptionsState1.c);
                        } else {
                            it2 = it10;
                            extraInfoButton2 = extraInfoButton4;
                            fulfilmentSlotSelectionOptionsItem2 = new FulfilmentSlotSelectionOptionsItem(FulfilmentWindowSlotSelectionOptionIdExtKt.a(fulfilmentWindowSlotSelectionOptionId), false, false);
                        }
                        arrayList19.add(fulfilmentSlotSelectionOptionsItem2);
                        it10 = it2;
                        extraInfoButton4 = extraInfoButton2;
                    }
                    extraInfoButton = extraInfoButton4;
                    fulfilmentSlotSelectionOptionsState2 = new FulfilmentSlotSelectionOptionsState(arrayList19);
                } else {
                    arrayList7 = arrayList17;
                    fulfilmentWindowsFooterV2 = fulfilmentWindowsFooterV22;
                    extraInfoButton = extraInfoButton4;
                    fulfilmentSlotSelectionOptionsState2 = null;
                }
                List list = slot1.l;
                if (list != null) {
                    List list2 = list;
                    arrayList8 = new ArrayList(CollectionsKt.s(list2, 10));
                    Iterator it11 = list2.iterator();
                    while (it11.hasNext()) {
                        CheckoutFulfilmentWindows.Tag3 tag3 = (CheckoutFulfilmentWindows.Tag3) it11.next();
                        Intrinsics.h(tag3, "<this>");
                        CoreTagUI coreTagUI = tag3.b;
                        String str21 = coreTagUI.b;
                        CoreColorTheme coreColorThemeA = CoreTagUICoreColorThemeExtKt.a(coreTagUI.c);
                        Iterator it12 = it11;
                        boolean z9 = coreTagUI.d;
                        CoreTagUI.Icon icon = coreTagUI.e;
                        arrayList8.add(new CoreTagModel(str21, coreColorThemeA, z9, icon != null ? CheckoutContentMapperKt.a(icon) : null));
                        it11 = it12;
                    }
                } else {
                    arrayList8 = 0;
                }
                EmptyList emptyList4 = arrayList8 == 0 ? emptyList : arrayList8;
                List list3 = slot1.m;
                if (list3 != null) {
                    List<CheckoutFulfilmentWindows.Status3> list4 = list3;
                    arrayList9 = new ArrayList(CollectionsKt.s(list4, 10));
                    for (CheckoutFulfilmentWindows.Status3 status3 : list4) {
                        Intrinsics.h(status3, "<this>");
                        CoreTagUI coreTagUI2 = status3.b;
                        String str22 = coreTagUI2.b;
                        CoreColorTheme coreColorThemeA2 = CoreTagUICoreColorThemeExtKt.a(coreTagUI2.c);
                        boolean z10 = coreTagUI2.d;
                        CoreTagUI.Icon icon2 = coreTagUI2.e;
                        arrayList9.add(new CoreTagModel(str22, coreColorThemeA2, z10, icon2 != null ? CheckoutContentMapperKt.a(icon2) : null));
                    }
                } else {
                    arrayList9 = 0;
                }
                arrayList15.add(new FulfilmentWindowsSlot(str15, str16, str17, i, z6, z7, z8, str18, arrayList7, fulfilmentWindowSlotSelectionInfo5, fulfilmentSlotSelectionOptionsState2, emptyList4, arrayList9 == 0 ? emptyList : arrayList9));
                it5 = it6;
                str11 = str20;
                str8 = str19;
                fulfilmentWindowsFooterV22 = fulfilmentWindowsFooterV2;
                extraInfoButton4 = extraInfoButton;
            }
            String str23 = str8;
            String str24 = str11;
            FulfilmentWindowsFooterV2 fulfilmentWindowsFooterV24 = fulfilmentWindowsFooterV22;
            ExtraInfoButton extraInfoButton5 = extraInfoButton4;
            List list5 = group.g;
            if (list5 != null) {
                List list6 = list5;
                arrayList3 = new ArrayList(CollectionsKt.s(list6, 10));
                Iterator it13 = list6.iterator();
                while (it13.hasNext()) {
                    CheckoutFulfilmentWindows.SlotsV2 slotsV2 = (CheckoutFulfilmentWindows.SlotsV2) it13.next();
                    Intrinsics.h(slotsV2, "<this>");
                    String str25 = slotsV2.f22411a;
                    String str26 = slotsV2.b;
                    String str27 = slotsV2.c;
                    int i2 = slotsV2.d;
                    boolean z11 = slotsV2.e;
                    Iterator it14 = it13;
                    boolean z12 = slotsV2.f;
                    boolean z13 = slotsV2.g;
                    String str28 = slotsV2.h;
                    ArrayList arrayList20 = slotsV2.i;
                    ArrayList arrayList21 = arrayList15;
                    ArrayList arrayList22 = new ArrayList(CollectionsKt.s(arrayList20, 10));
                    for (Iterator it15 = arrayList20.iterator(); it15.hasNext(); it15 = it15) {
                        CheckoutFulfilmentWindows.Badge2 badge2 = (CheckoutFulfilmentWindows.Badge2) it15.next();
                        Intrinsics.h(badge2, "<this>");
                        arrayList22.add(new FulfilmentWindowsSlotBadge(CheckoutBadgeStyleExtKt.a(badge2.b), badge2.f22380a));
                    }
                    CheckoutFulfilmentWindows.SelectionInfo4 selectionInfo4 = slotsV2.j;
                    if (selectionInfo4 != null) {
                        SelectionInfo selectionInfo2 = selectionInfo4.b;
                        fulfilmentWindowSlotSelectionInfo4 = new FulfilmentWindowSlotSelectionInfo(selectionInfo2.f22536a, FulfilmentWindowsFooterIconExtKt.a(selectionInfo2.b));
                    } else {
                        fulfilmentWindowSlotSelectionInfo4 = null;
                    }
                    List list7 = slotsV2.k;
                    if (list7 != null) {
                        List list8 = list7;
                        arrayList4 = arrayList22;
                        arrayList5 = new ArrayList(CollectionsKt.s(list8, 10));
                        Iterator it16 = list8.iterator();
                        while (it16.hasNext()) {
                            CheckoutFulfilmentWindows.Tag4 tag4 = (CheckoutFulfilmentWindows.Tag4) it16.next();
                            Intrinsics.h(tag4, "<this>");
                            CoreTagUI coreTagUI3 = tag4.b;
                            Iterator it17 = it16;
                            String str29 = coreTagUI3.b;
                            String str30 = str27;
                            CoreColorTheme coreColorThemeA3 = CoreTagUICoreColorThemeExtKt.a(coreTagUI3.c);
                            int i3 = i2;
                            boolean z14 = coreTagUI3.d;
                            CoreTagUI.Icon icon3 = coreTagUI3.e;
                            arrayList5.add(new CoreTagModel(str29, coreColorThemeA3, z14, icon3 != null ? CheckoutContentMapperKt.a(icon3) : null));
                            it16 = it17;
                            str27 = str30;
                            i2 = i3;
                        }
                    } else {
                        arrayList4 = arrayList22;
                        arrayList5 = 0;
                    }
                    String str31 = str27;
                    int i4 = i2;
                    EmptyList emptyList5 = arrayList5 == 0 ? emptyList : arrayList5;
                    List list9 = slotsV2.l;
                    if (list9 != null) {
                        List<CheckoutFulfilmentWindows.Status4> list10 = list9;
                        arrayList6 = new ArrayList(CollectionsKt.s(list10, 10));
                        for (CheckoutFulfilmentWindows.Status4 status4 : list10) {
                            Intrinsics.h(status4, "<this>");
                            CoreTagUI coreTagUI4 = status4.b;
                            String str32 = coreTagUI4.b;
                            CoreColorTheme coreColorThemeA4 = CoreTagUICoreColorThemeExtKt.a(coreTagUI4.c);
                            boolean z15 = coreTagUI4.d;
                            CoreTagUI.Icon icon4 = coreTagUI4.e;
                            arrayList6.add(new CoreTagModel(str32, coreColorThemeA4, z15, icon4 != null ? CheckoutContentMapperKt.a(icon4) : null));
                        }
                    } else {
                        arrayList6 = 0;
                    }
                    arrayList3.add(new FulfilmentWindowsSlot(str25, str26, str31, i4, z11, z12, z13, str28, arrayList4, fulfilmentWindowSlotSelectionInfo4, null, emptyList5, arrayList6 == 0 ? emptyList : arrayList6));
                    it13 = it14;
                    arrayList15 = arrayList21;
                }
            } else {
                arrayList3 = 0;
            }
            arrayList13.add(new FulfilmentWindowsGroup(str24, z4, str12, fulfilmentWindowsMessage, str14, arrayList15, arrayList3 == 0 ? emptyList : arrayList3));
            it3 = it4;
            str7 = str13;
            z2 = z;
            z3 = z5;
            str8 = str23;
            fulfilmentWindowsFooterV22 = fulfilmentWindowsFooterV24;
            extraInfoButton4 = extraInfoButton5;
        }
        String str33 = str7;
        boolean z16 = z2;
        boolean z17 = z3;
        String str34 = str8;
        FulfilmentWindowsFooterV2 fulfilmentWindowsFooterV25 = fulfilmentWindowsFooterV22;
        ExtraInfoButton extraInfoButton6 = extraInfoButton4;
        CheckoutFulfilmentWindows.DeliveryNowV2 deliveryNowV2 = option.j;
        if (deliveryNowV2 != null) {
            int i5 = deliveryNowV2.f22382a;
            String str35 = deliveryNowV2.b;
            String str36 = deliveryNowV2.e;
            String str37 = deliveryNowV2.f;
            String str38 = deliveryNowV2.g;
            String str39 = deliveryNowV2.h;
            String str40 = deliveryNowV2.i;
            String str41 = deliveryNowV2.k;
            String str42 = deliveryNowV2.j;
            CheckoutFulfilmentWindows.Info info = deliveryNowV2.l;
            String str43 = info.f22395a;
            ArrayList arrayList23 = info.b;
            ArrayList arrayList24 = new ArrayList(CollectionsKt.s(arrayList23, 10));
            Iterator it18 = arrayList23.iterator();
            while (it18.hasNext()) {
                CheckoutFulfilmentWindows.Item item = (CheckoutFulfilmentWindows.Item) it18.next();
                Intrinsics.h(item, "<this>");
                arrayList24.add(new InfoSectionItem(item.f22396a, item.b, item.c));
                it18 = it18;
                str39 = str39;
            }
            String str44 = str39;
            InfoSection infoSection2 = new InfoSection(str43, arrayList24, null);
            boolean z18 = deliveryNowV2.m;
            boolean z19 = deliveryNowV2.n;
            CheckoutFulfilmentWindows.SelectionInfo1 selectionInfo1 = deliveryNowV2.p;
            if (selectionInfo1 != null) {
                SelectionInfo selectionInfo5 = selectionInfo1.b;
                fulfilmentWindowSlotSelectionInfo3 = new FulfilmentWindowSlotSelectionInfo(selectionInfo5.f22536a, FulfilmentWindowsFooterIconExtKt.a(selectionInfo5.b));
            } else {
                fulfilmentWindowSlotSelectionInfo3 = null;
            }
            List list11 = deliveryNowV2.c;
            if (list11 != null) {
                List list12 = list11;
                infoSection = infoSection2;
                ?? arrayList25 = new ArrayList(CollectionsKt.s(list12, 10));
                Iterator it19 = list12.iterator();
                while (it19.hasNext()) {
                    CheckoutFulfilmentWindows.Tag1 tag1 = (CheckoutFulfilmentWindows.Tag1) it19.next();
                    Intrinsics.h(tag1, "<this>");
                    CoreTagUI coreTagUI5 = tag1.b;
                    Iterator it20 = it19;
                    String str45 = coreTagUI5.b;
                    boolean z20 = z18;
                    CoreColorTheme coreColorThemeA5 = CoreTagUICoreColorThemeExtKt.a(coreTagUI5.c);
                    boolean z21 = z19;
                    boolean z22 = coreTagUI5.d;
                    CoreTagUI.Icon icon5 = coreTagUI5.e;
                    arrayList25.add(new CoreTagModel(str45, coreColorThemeA5, z22, icon5 != null ? CheckoutContentMapperKt.a(icon5) : null));
                    it19 = it20;
                    z19 = z21;
                    z18 = z20;
                }
                emptyList3 = arrayList25;
            } else {
                infoSection = infoSection2;
                emptyList3 = null;
            }
            boolean z23 = z18;
            boolean z24 = z19;
            EmptyList emptyList6 = emptyList3 == null ? emptyList : emptyList3;
            List list13 = deliveryNowV2.d;
            if (list13 != null) {
                List<CheckoutFulfilmentWindows.Status1> list14 = list13;
                arrayList2 = new ArrayList(CollectionsKt.s(list14, 10));
                for (CheckoutFulfilmentWindows.Status1 status1 : list14) {
                    Intrinsics.h(status1, "<this>");
                    CoreTagUI coreTagUI6 = status1.b;
                    String str46 = coreTagUI6.b;
                    CoreColorTheme coreColorThemeA6 = CoreTagUICoreColorThemeExtKt.a(coreTagUI6.c);
                    boolean z25 = coreTagUI6.d;
                    CoreTagUI.Icon icon6 = coreTagUI6.e;
                    arrayList2.add(new CoreTagModel(str46, coreColorThemeA6, z25, icon6 != null ? CheckoutContentMapperKt.a(icon6) : null));
                }
            } else {
                arrayList2 = 0;
            }
            deliveryNowWindow = new DeliveryNowWindow(i5, str35, str36, str37, str38, str44, str40, str41, str42, infoSection, z23, Boolean.valueOf(z24), fulfilmentWindowSlotSelectionInfo3, emptyList6, arrayList2 == 0 ? emptyList : arrayList2);
        } else {
            deliveryNowWindow = null;
        }
        CheckoutFulfilmentWindows.DirectToBootNowV2 directToBootNowV2 = option.m;
        if (directToBootNowV2 != null) {
            int i6 = directToBootNowV2.f22385a;
            String str47 = directToBootNowV2.b;
            String str48 = directToBootNowV2.e;
            String str49 = directToBootNowV2.f;
            String str50 = directToBootNowV2.g;
            String str51 = directToBootNowV2.h;
            String str52 = directToBootNowV2.i;
            boolean z26 = directToBootNowV2.j;
            boolean z27 = directToBootNowV2.k;
            CheckoutFulfilmentWindows.TileBadge tileBadge = directToBootNowV2.m;
            if (tileBadge != null) {
                str2 = str48;
                str3 = str49;
                fulfilmentWindowSlotSelectionInfo = null;
                badgeApiData = new BadgeApiData(tileBadge.f22424a, BadgeTypeExtKt.a(tileBadge.b), null);
            } else {
                str2 = str48;
                str3 = str49;
                fulfilmentWindowSlotSelectionInfo = null;
                badgeApiData = null;
            }
            CheckoutFulfilmentWindows.SelectionInfo2 selectionInfo22 = directToBootNowV2.n;
            if (selectionInfo22 != null) {
                SelectionInfo selectionInfo6 = selectionInfo22.b;
                fulfilmentWindowSlotSelectionInfo2 = new FulfilmentWindowSlotSelectionInfo(selectionInfo6.f22536a, FulfilmentWindowsFooterIconExtKt.a(selectionInfo6.b));
            } else {
                fulfilmentWindowSlotSelectionInfo2 = fulfilmentWindowSlotSelectionInfo;
            }
            CheckoutFulfilmentWindows.SelectionOptionsState selectionOptionsState = directToBootNowV2.o;
            if (selectionOptionsState != null) {
                FulfilmentWindowSlotSelectionOptionId.e.getClass();
                List listR2 = CollectionsKt.R(FulfilmentWindowSlotSelectionOptionId.g, FulfilmentWindowSlotSelectionOptionId.h, FulfilmentWindowSlotSelectionOptionId.i);
                ArrayList arrayList26 = new ArrayList();
                Iterator it21 = listR2.iterator();
                while (it21.hasNext()) {
                    Object next2 = it21.next();
                    Iterator it22 = it21;
                    DeliveryNowWindow deliveryNowWindow3 = deliveryNowWindow;
                    if (!selectionOptionsState.b.contains((FulfilmentWindowSlotSelectionOptionId) next2)) {
                        arrayList26.add(next2);
                    }
                    it21 = it22;
                    deliveryNowWindow = deliveryNowWindow3;
                }
                deliveryNowWindow2 = deliveryNowWindow;
                ArrayList arrayList27 = new ArrayList(CollectionsKt.s(arrayList26, 10));
                Iterator it23 = arrayList26.iterator();
                while (it23.hasNext()) {
                    FulfilmentWindowSlotSelectionOptionId fulfilmentWindowSlotSelectionOptionId2 = (FulfilmentWindowSlotSelectionOptionId) it23.next();
                    if (selectionOptionsState.f22407a.contains(fulfilmentWindowSlotSelectionOptionId2)) {
                        it = it23;
                        str5 = str50;
                        fulfilmentSlotSelectionOptionsItem = new FulfilmentSlotSelectionOptionsItem(FulfilmentWindowSlotSelectionOptionIdExtKt.a(fulfilmentWindowSlotSelectionOptionId2), true, fulfilmentWindowSlotSelectionOptionId2 == selectionOptionsState.c);
                    } else {
                        it = it23;
                        str5 = str50;
                        fulfilmentSlotSelectionOptionsItem = new FulfilmentSlotSelectionOptionsItem(FulfilmentWindowSlotSelectionOptionIdExtKt.a(fulfilmentWindowSlotSelectionOptionId2), false, false);
                    }
                    arrayList27.add(fulfilmentSlotSelectionOptionsItem);
                    it23 = it;
                    str50 = str5;
                }
                str4 = str50;
                fulfilmentSlotSelectionOptionsState = new FulfilmentSlotSelectionOptionsState(arrayList27);
            } else {
                deliveryNowWindow2 = deliveryNowWindow;
                str4 = str50;
                fulfilmentSlotSelectionOptionsState = null;
            }
            List list15 = directToBootNowV2.c;
            if (list15 != null) {
                List list16 = list15;
                arrayList = new ArrayList(CollectionsKt.s(list16, 10));
                Iterator it24 = list16.iterator();
                while (it24.hasNext()) {
                    CheckoutFulfilmentWindows.Tag2 tag2 = (CheckoutFulfilmentWindows.Tag2) it24.next();
                    Intrinsics.h(tag2, "<this>");
                    CoreTagUI coreTagUI7 = tag2.b;
                    String str53 = coreTagUI7.b;
                    CoreColorTheme coreColorThemeA7 = CoreTagUICoreColorThemeExtKt.a(coreTagUI7.c);
                    Iterator it25 = it24;
                    boolean z28 = coreTagUI7.d;
                    CoreTagUI.Icon icon7 = coreTagUI7.e;
                    arrayList.add(new CoreTagModel(str53, coreColorThemeA7, z28, icon7 != null ? CheckoutContentMapperKt.a(icon7) : null));
                    it24 = it25;
                }
            } else {
                arrayList = 0;
            }
            EmptyList emptyList7 = arrayList == 0 ? emptyList : arrayList;
            List list17 = directToBootNowV2.d;
            if (list17 != null) {
                List<CheckoutFulfilmentWindows.Status2> list18 = list17;
                ?? arrayList28 = new ArrayList(CollectionsKt.s(list18, 10));
                for (CheckoutFulfilmentWindows.Status2 status2 : list18) {
                    Intrinsics.h(status2, "<this>");
                    CoreTagUI coreTagUI8 = status2.b;
                    String str54 = coreTagUI8.b;
                    CoreColorTheme coreColorThemeA8 = CoreTagUICoreColorThemeExtKt.a(coreTagUI8.c);
                    boolean z29 = coreTagUI8.d;
                    CoreTagUI.Icon icon8 = coreTagUI8.e;
                    arrayList28.add(new CoreTagModel(str54, coreColorThemeA8, z29, icon8 != null ? CheckoutContentMapperKt.a(icon8) : null));
                }
                emptyList2 = arrayList28;
            } else {
                emptyList2 = null;
            }
            directToBootNowWindow2 = new DirectToBootNowWindow(i6, str47, str2, str3, str4, str51, str52, z26, Boolean.valueOf(z27), badgeApiData, fulfilmentWindowSlotSelectionInfo2, fulfilmentSlotSelectionOptionsState, emptyList7, emptyList2 == null ? emptyList : emptyList2);
        } else {
            deliveryNowWindow2 = deliveryNowWindow;
            directToBootNowWindow2 = null;
        }
        return new FulfilmentWindowsOption(str6, str33, z16, z17, str34, fulfilmentWindowsFooterV25, str, extraInfoButton6, fulfilmentExtraInfo, deliveryNowStatus, directToBootNowWindow, directToBootNowStatus, arrayList13, deliveryNowWindow2, directToBootNowWindow2);
    }
}
