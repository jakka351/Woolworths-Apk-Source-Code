package au.com.woolworths.shop.checkout.ui.timeselector.uimodel;

import au.com.woolworths.shop.checkout.domain.model.DeliveryNowWindow;
import au.com.woolworths.shop.checkout.domain.model.DirectToBootNowWindow;
import au.com.woolworths.shop.checkout.domain.model.FooterData;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindows;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsFooter;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsOption;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsSlot;
import au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentSlot;
import au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentWindowsFooterV2;
import au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentWindowsSuggestedGroup;
import au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorContract;
import au.com.woolworths.shop.checkout.ui.timeselector.uimodel.TimeSelectorUiItem;
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
public final class TimeSelectorDataMapperKt {
    public static final DateItem a(FulfilmentWindowsOption fulfilmentWindowsOption, String str, boolean z) {
        String str2 = fulfilmentWindowsOption.f10615a;
        String str3 = fulfilmentWindowsOption.b;
        FulfilmentWindowsFooterV2 fulfilmentWindowsFooterV2 = fulfilmentWindowsOption.f;
        String str4 = fulfilmentWindowsFooterV2 != null ? fulfilmentWindowsFooterV2.f10672a : null;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = fulfilmentWindowsFooterV2 != null ? fulfilmentWindowsFooterV2.b : null;
        String str6 = str5 != null ? str5 : "";
        String str7 = str4;
        boolean z2 = fulfilmentWindowsOption.d;
        boolean z3 = false;
        if (fulfilmentWindowsFooterV2 != null && fulfilmentWindowsFooterV2.c) {
            z3 = true;
        }
        boolean z4 = !fulfilmentWindowsOption.c;
        FulfilmentSlot fulfilmentSlotC = null;
        String str8 = str6;
        boolean z5 = z3;
        List list = fulfilmentWindowsOption.m;
        if (!z) {
            fulfilmentSlotC = c(fulfilmentWindowsOption, str);
        }
        return new DateItem(str2, str3, str7, str8, z2, z5, z4, list, fulfilmentSlotC);
    }

    public static final FulfilmentSlot b(FulfilmentWindowsSlot fulfilmentWindowsSlot, String str) {
        int i = fulfilmentWindowsSlot.d;
        String str2 = fulfilmentWindowsSlot.f10617a;
        String str3 = fulfilmentWindowsSlot.b;
        String str4 = fulfilmentWindowsSlot.h;
        boolean z = fulfilmentWindowsSlot.f;
        boolean z2 = !fulfilmentWindowsSlot.e;
        if (str == null) {
            str = "";
        }
        FooterData footerData = new FooterData(str, fulfilmentWindowsSlot.j, fulfilmentWindowsSlot.d);
        String str5 = fulfilmentWindowsSlot.c;
        List list = fulfilmentWindowsSlot.m;
        EmptyList emptyList = EmptyList.d;
        if (list == null) {
            list = emptyList;
        }
        List list2 = fulfilmentWindowsSlot.l;
        return new FulfilmentSlot(i, str2, str3, str4, z, z2, footerData, str5, list, list2 == null ? emptyList : list2);
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, java.util.List] */
    public static final FulfilmentSlot c(FulfilmentWindowsOption fulfilmentWindowsOption, String str) {
        DeliveryNowWindow deliveryNowWindow = fulfilmentWindowsOption.n;
        if (deliveryNowWindow != null) {
            int i = deliveryNowWindow.f10596a;
            String str2 = deliveryNowWindow.c;
            String str3 = deliveryNowWindow.d;
            String str4 = deliveryNowWindow.f;
            boolean z = deliveryNowWindow.k;
            boolean zEquals = deliveryNowWindow.l.equals(Boolean.FALSE);
            if (str == null) {
                str = "";
            }
            return new FulfilmentSlot(i, str2, str3, str4, z, zEquals, new FooterData(str, deliveryNowWindow.m, deliveryNowWindow.f10596a), deliveryNowWindow.b, deliveryNowWindow.o, deliveryNowWindow.n);
        }
        DirectToBootNowWindow directToBootNowWindow = fulfilmentWindowsOption.o;
        if (directToBootNowWindow == null) {
            return null;
        }
        int i2 = directToBootNowWindow.f10597a;
        String str5 = directToBootNowWindow.c;
        String str6 = directToBootNowWindow.d;
        String str7 = directToBootNowWindow.f;
        boolean z2 = directToBootNowWindow.h;
        boolean zC = Intrinsics.c(directToBootNowWindow.i, Boolean.FALSE);
        if (str == null) {
            str = "";
        }
        FooterData footerData = new FooterData(str, directToBootNowWindow.k, directToBootNowWindow.f10597a);
        String str8 = directToBootNowWindow.b;
        List list = directToBootNowWindow.n;
        EmptyList emptyList = EmptyList.d;
        List list2 = list == null ? emptyList : list;
        List list3 = directToBootNowWindow.m;
        return new FulfilmentSlot(i2, str5, str6, str7, z2, zC, footerData, str8, list2, list3 == null ? emptyList : list3);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.ArrayList d(java.util.List r16, java.lang.String r17, boolean r18, java.lang.Integer r19) {
        /*
            r0 = r17
            r1 = r16
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r4 = kotlin.collections.CollectionsKt.s(r1, r3)
            r2.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
            r4 = 0
            r5 = r4
        L17:
            boolean r6 = r1.hasNext()
            r7 = 1
            r8 = 0
            if (r6 == 0) goto La4
            java.lang.Object r6 = r1.next()
            int r9 = r5 + 1
            if (r5 < 0) goto La0
            au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsGroup r6 = (au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsGroup) r6
            java.lang.String r11 = r6.f10613a
            if (r19 != 0) goto L31
            boolean r7 = r6.b
        L2f:
            r12 = r7
            goto L39
        L31:
            int r10 = r19.intValue()
            if (r5 != r10) goto L38
            goto L2f
        L38:
            r12 = r4
        L39:
            au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsMessage r5 = r6.d
            if (r5 == 0) goto L41
            java.lang.String r7 = r5.f10614a
            r13 = r7
            goto L42
        L41:
            r13 = r8
        L42:
            if (r5 == 0) goto L46
            java.lang.String r8 = r5.b
        L46:
            r14 = r8
            if (r18 == 0) goto L70
            java.util.List r5 = r6.g
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.CollectionsKt.s(r5, r3)
            r6.<init>(r7)
            java.util.Iterator r5 = r5.iterator()
        L5a:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L6e
            java.lang.Object r7 = r5.next()
            au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsSlot r7 = (au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsSlot) r7
            au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentSlot r7 = b(r7, r0)
            r6.add(r7)
            goto L5a
        L6e:
            r15 = r6
            goto L95
        L70:
            java.util.List r5 = r6.f
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.CollectionsKt.s(r5, r3)
            r6.<init>(r7)
            java.util.Iterator r5 = r5.iterator()
        L81:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L6e
            java.lang.Object r7 = r5.next()
            au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsSlot r7 = (au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsSlot) r7
            au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentSlot r7 = b(r7, r0)
            r6.add(r7)
            goto L81
        L95:
            au.com.woolworths.shop.checkout.ui.timeselector.uimodel.TimeOfDay r10 = new au.com.woolworths.shop.checkout.ui.timeselector.uimodel.TimeOfDay
            r10.<init>(r11, r12, r13, r14, r15)
            r2.add(r10)
            r5 = r9
            goto L17
        La0:
            kotlin.collections.CollectionsKt.z0()
            throw r8
        La4:
            java.util.ArrayList r0 = kotlin.collections.CollectionsKt.J0(r2)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Laf
            goto Lc4
        Laf:
            java.util.Iterator r1 = r0.iterator()
        Lb3:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lc4
            java.lang.Object r2 = r1.next()
            au.com.woolworths.shop.checkout.ui.timeselector.uimodel.TimeOfDay r2 = (au.com.woolworths.shop.checkout.ui.timeselector.uimodel.TimeOfDay) r2
            boolean r2 = r2.b
            if (r2 == 0) goto Lb3
            goto Ld5
        Lc4:
            java.lang.Object r1 = kotlin.collections.CollectionsKt.F(r0)
            au.com.woolworths.shop.checkout.ui.timeselector.uimodel.TimeOfDay r1 = (au.com.woolworths.shop.checkout.ui.timeselector.uimodel.TimeOfDay) r1
            if (r1 == 0) goto Ld5
            r2 = 29
            au.com.woolworths.shop.checkout.ui.timeselector.uimodel.TimeOfDay r1 = au.com.woolworths.shop.checkout.ui.timeselector.uimodel.TimeOfDay.a(r1, r7, r8, r2)
            r0.set(r4, r1)
        Ld5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.ui.timeselector.uimodel.TimeSelectorDataMapperKt.d(java.util.List, java.lang.String, boolean, java.lang.Integer):java.util.ArrayList");
    }

    public static final TimeSelectorContract.ViewState e(FulfilmentWindows fulfilmentWindows, boolean z) {
        Object next;
        List listR;
        TimeSelectorUiItem.SuggestedTimeSlotUiItem suggestedTimeSlotUiItem;
        Intrinsics.h(fulfilmentWindows, "<this>");
        FulfilmentWindowsSuggestedGroup fulfilmentWindowsSuggestedGroup = fulfilmentWindows.j;
        FulfilmentWindowsFooter fulfilmentWindowsFooter = fulfilmentWindows.f;
        List list = fulfilmentWindows.e;
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((FulfilmentWindowsOption) next).d) {
                break;
            }
        }
        FulfilmentWindowsOption fulfilmentWindowsOption = (FulfilmentWindowsOption) next;
        if (fulfilmentWindowsOption == null) {
            fulfilmentWindowsOption = (FulfilmentWindowsOption) CollectionsKt.F(list);
        }
        if (fulfilmentWindowsOption == null) {
            return new TimeSelectorContract.ViewState(EmptyList.d, null, null, TimeSelectorContract.TimeSelectorErrorState.TimeSelectorFullEmpty.f10835a, TimeSelectorContract.LoadingState.f, fulfilmentWindows, null);
        }
        List list3 = fulfilmentWindowsOption.m;
        if (z) {
            if (fulfilmentWindowsSuggestedGroup != null) {
                ArrayList arrayList = fulfilmentWindowsSuggestedGroup.b;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(b((FulfilmentWindowsSlot) it2.next(), fulfilmentWindowsFooter != null ? fulfilmentWindowsFooter.f10612a : null));
                }
                suggestedTimeSlotUiItem = new TimeSelectorUiItem.SuggestedTimeSlotUiItem(arrayList2, fulfilmentWindowsSuggestedGroup.f10673a, fulfilmentWindowsSuggestedGroup.c);
            } else {
                suggestedTimeSlotUiItem = null;
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt.s(list2, 10));
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(a((FulfilmentWindowsOption) it3.next(), fulfilmentWindowsFooter != null ? fulfilmentWindowsFooter.f10612a : null, z));
            }
            listR = CollectionsKt.R(suggestedTimeSlotUiItem, new TimeSelectorUiItem.DateSelectorUiItem(arrayList3), new TimeSelectorUiItem.TimeOfDaySelectorUiItem(null, d(list3, fulfilmentWindowsFooter != null ? fulfilmentWindowsFooter.f10612a : null, true, null)));
        } else {
            ArrayList arrayList4 = new ArrayList(CollectionsKt.s(list2, 10));
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList4.add(a((FulfilmentWindowsOption) it4.next(), fulfilmentWindowsFooter != null ? fulfilmentWindowsFooter.f10612a : null, z));
            }
            TimeSelectorUiItem.DateSelectorUiItem dateSelectorUiItem = new TimeSelectorUiItem.DateSelectorUiItem(arrayList4);
            TimeSelectorUiItem.SuggestedTimeSlotUiItem suggestedTimeSlotUiItem2 = new TimeSelectorUiItem.SuggestedTimeSlotUiItem(CollectionsKt.S(c(fulfilmentWindowsOption, fulfilmentWindowsFooter != null ? fulfilmentWindowsFooter.f10612a : null)), null, null);
            String str = fulfilmentWindows.g;
            if (str == null) {
                str = "";
            }
            listR = CollectionsKt.R(dateSelectorUiItem, suggestedTimeSlotUiItem2, new TimeSelectorUiItem.TimeOfDaySelectorUiItem(str, d(list3, fulfilmentWindowsFooter != null ? fulfilmentWindowsFooter.f10612a : null, false, null)));
        }
        return new TimeSelectorContract.ViewState(CollectionsKt.B(listR), null, fulfilmentWindows.f, null, TimeSelectorContract.LoadingState.f, fulfilmentWindows, null);
    }
}
