package au.com.woolworths.shop.checkout.data.mappers;

import au.com.woolworths.sdui.common.corecolortheme.CoreColorTheme;
import au.com.woolworths.sdui.common.coretag.model.CoreTagModel;
import au.com.woolworths.sdui.shop.fragment.CoreTagUI;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowSlotSelectionInfo;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsSlot;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsSlotBadge;
import au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentBottomSheet;
import au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentWindowsSuggestedGroup;
import com.woolworths.shop.checkout.fragment.CheckoutFulfilmentWindows;
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
public final class CheckoutFulfilmentWindowsSuggestedGroupExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [kotlin.collections.EmptyList] */
    public static final FulfilmentWindowsSuggestedGroup a(CheckoutFulfilmentWindows.SuggestedGroup suggestedGroup) {
        FulfilmentWindowSlotSelectionInfo fulfilmentWindowSlotSelectionInfo;
        ArrayList arrayList;
        FulfilmentWindowSlotSelectionInfo fulfilmentWindowSlotSelectionInfo2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String str = "<this>";
        Intrinsics.h(suggestedGroup, "<this>");
        String str2 = suggestedGroup.f22418a;
        ArrayList arrayList5 = suggestedGroup.b;
        int i = 10;
        ArrayList arrayList6 = new ArrayList(CollectionsKt.s(arrayList5, 10));
        Iterator it = arrayList5.iterator();
        while (it.hasNext()) {
            CheckoutFulfilmentWindows.Slot slot = (CheckoutFulfilmentWindows.Slot) it.next();
            Intrinsics.h(slot, str);
            String str3 = slot.f22409a;
            String str4 = slot.b;
            String str5 = slot.c;
            int i2 = slot.d;
            boolean z = slot.e;
            boolean z2 = slot.f;
            boolean z3 = slot.g;
            String str6 = slot.h;
            ArrayList arrayList7 = slot.i;
            Iterator it2 = it;
            ArrayList arrayList8 = new ArrayList(CollectionsKt.s(arrayList7, i));
            for (Iterator it3 = arrayList7.iterator(); it3.hasNext(); it3 = it3) {
                CheckoutFulfilmentWindows.Badge badge = (CheckoutFulfilmentWindows.Badge) it3.next();
                Intrinsics.h(badge, str);
                arrayList8.add(new FulfilmentWindowsSlotBadge(CheckoutBadgeStyleExtKt.a(badge.b), badge.f22378a));
            }
            CheckoutFulfilmentWindows.SelectionInfo selectionInfo = slot.j;
            if (selectionInfo != null) {
                SelectionInfo selectionInfo2 = selectionInfo.b;
                fulfilmentWindowSlotSelectionInfo = new FulfilmentWindowSlotSelectionInfo(selectionInfo2.f22536a, FulfilmentWindowsFooterIconExtKt.a(selectionInfo2.b));
            } else {
                fulfilmentWindowSlotSelectionInfo = null;
            }
            List list = slot.k;
            if (list != null) {
                List list2 = list;
                arrayList = arrayList8;
                fulfilmentWindowSlotSelectionInfo2 = fulfilmentWindowSlotSelectionInfo;
                arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    CheckoutFulfilmentWindows.Tag tag = (CheckoutFulfilmentWindows.Tag) it4.next();
                    Intrinsics.h(tag, str);
                    CoreTagUI coreTagUI = tag.b;
                    Iterator it5 = it4;
                    String str7 = coreTagUI.b;
                    String str8 = str4;
                    CoreColorTheme coreColorThemeA = CoreTagUICoreColorThemeExtKt.a(coreTagUI.c);
                    String str9 = str5;
                    boolean z4 = coreTagUI.d;
                    CoreTagUI.Icon icon = coreTagUI.e;
                    arrayList2.add(new CoreTagModel(str7, coreColorThemeA, z4, icon != null ? CheckoutContentMapperKt.a(icon) : null));
                    it4 = it5;
                    str4 = str8;
                    str5 = str9;
                }
            } else {
                arrayList = arrayList8;
                fulfilmentWindowSlotSelectionInfo2 = fulfilmentWindowSlotSelectionInfo;
                arrayList2 = null;
            }
            String str10 = str4;
            String str11 = str5;
            ?? r3 = EmptyList.d;
            if (arrayList2 == null) {
                arrayList2 = r3;
            }
            List list3 = slot.l;
            if (list3 != null) {
                List<CheckoutFulfilmentWindows.Status> list4 = list3;
                ArrayList arrayList9 = new ArrayList(CollectionsKt.s(list4, 10));
                ArrayList arrayList10 = r3;
                for (CheckoutFulfilmentWindows.Status status : list4) {
                    Intrinsics.h(status, str);
                    CoreTagUI coreTagUI2 = status.b;
                    String str12 = coreTagUI2.b;
                    String str13 = str;
                    CoreColorTheme coreColorThemeA2 = CoreTagUICoreColorThemeExtKt.a(coreTagUI2.c);
                    ArrayList arrayList11 = arrayList10;
                    boolean z5 = coreTagUI2.d;
                    CoreTagUI.Icon icon2 = coreTagUI2.e;
                    arrayList9.add(new CoreTagModel(str12, coreColorThemeA2, z5, icon2 != null ? CheckoutContentMapperKt.a(icon2) : null));
                    arrayList10 = arrayList11;
                    str = str13;
                }
                arrayList3 = arrayList9;
                arrayList4 = arrayList10;
            } else {
                arrayList3 = null;
                arrayList4 = r3;
            }
            String str14 = str;
            ArrayList arrayList12 = arrayList4;
            if (arrayList3 != null) {
                arrayList12 = arrayList3;
            }
            arrayList6.add(new FulfilmentWindowsSlot(str3, str10, str11, i2, z, z2, z3, str6, arrayList, fulfilmentWindowSlotSelectionInfo2, null, arrayList2, arrayList12));
            it = it2;
            i = 10;
            str = str14;
        }
        CheckoutFulfilmentWindows.BottomSheet bottomSheet = suggestedGroup.c;
        return new FulfilmentWindowsSuggestedGroup(str2, arrayList6, new FulfilmentBottomSheet(bottomSheet.f22381a, bottomSheet.b));
    }
}
