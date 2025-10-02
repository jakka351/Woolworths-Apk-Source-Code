package au.com.woolworths.shop.deliveryunlimited.signup.data.mappers;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.base.shopapp.modules.button.ButtonAction;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonStyleApiData;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodItem;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodSection;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedIconItem;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSignUpFooter;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribeLink;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribeTermItem;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribeTerms;
import au.com.woolworths.shop.deliveryunlimited.signup.domain.model.DeliveryUnlimitedPaymentResponse;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import com.woolworths.shop.deliveryunlimited.wpay.DeliveryUnlimitedPaymentQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-delivery-unlimited-sign-up_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class DeliveryUnlimitedPaymentQueryDeliveryUnlimitedPaymentExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.ArrayList] */
    public static final DeliveryUnlimitedPaymentResponse a(DeliveryUnlimitedPaymentQuery.DeliveryUnlimitedPayment deliveryUnlimitedPayment) {
        String str;
        String str2;
        DeliveryUnlimitedIconItem deliveryUnlimitedIconItem;
        ButtonAction buttonAction;
        DeliveryUnlimitedSignUpFooter deliveryUnlimitedSignUpFooter;
        AnalyticsData analyticsData;
        Iterator it;
        String str3;
        ?? arrayList;
        Iterator it2;
        DeliveryUnlimitedSubscribeTerms deliveryUnlimitedSubscribeTerms;
        PaymentMethodItem.CreditCard expired;
        String str4;
        String str5;
        ?? arrayList2;
        String str6;
        String str7;
        ?? arrayList3;
        AnalyticsData analyticsData2;
        String str8;
        ?? arrayList4;
        String str9 = deliveryUnlimitedPayment.f22680a;
        String str10 = deliveryUnlimitedPayment.b;
        String str11 = deliveryUnlimitedPayment.c;
        DeliveryUnlimitedPaymentQuery.IconItem iconItem = deliveryUnlimitedPayment.d;
        DeliveryUnlimitedIconItem deliveryUnlimitedIconItem2 = iconItem != null ? new DeliveryUnlimitedIconItem(iconItem.f22682a, iconItem.b) : null;
        DeliveryUnlimitedPaymentQuery.Footer footer = deliveryUnlimitedPayment.g;
        DeliveryUnlimitedPaymentQuery.Button button = footer.f22681a;
        String str12 = button.f22675a;
        ButtonStyle buttonStyle = button.b;
        DeliveryUnlimitedSignUpFooter deliveryUnlimitedSignUpFooter2 = new DeliveryUnlimitedSignUpFooter(new ButtonApiData(str12, null, buttonStyle != null ? ButtonStyleExtKt.a(buttonStyle) : null, button.c, null, null, null, null, null, 498, null), footer.b);
        DeliveryUnlimitedPaymentQuery.Terms terms = deliveryUnlimitedPayment.h;
        String str13 = terms.f22691a;
        ArrayList<DeliveryUnlimitedPaymentQuery.Term> arrayList5 = terms.b;
        int i = 10;
        ArrayList arrayList6 = new ArrayList(CollectionsKt.s(arrayList5, 10));
        for (DeliveryUnlimitedPaymentQuery.Term term : arrayList5) {
            Intrinsics.h(term, "<this>");
            String str14 = term.f22690a;
            ArrayList<DeliveryUnlimitedPaymentQuery.Link> arrayList7 = term.b;
            ArrayList arrayList8 = new ArrayList(CollectionsKt.s(arrayList7, i));
            for (DeliveryUnlimitedPaymentQuery.Link link : arrayList7) {
                Intrinsics.h(link, "<this>");
                arrayList8.add(new DeliveryUnlimitedSubscribeLink(link.f22684a, link.b));
                str9 = str9;
            }
            arrayList6.add(new DeliveryUnlimitedSubscribeTermItem(str14, arrayList8));
            str9 = str9;
            i = 10;
        }
        String str15 = str9;
        DeliveryUnlimitedPaymentQuery.Button1 button1 = terms.c;
        String str16 = button1.f22676a;
        ButtonStyle buttonStyle2 = button1.b;
        ButtonStyleApiData buttonStyleApiDataA = buttonStyle2 != null ? ButtonStyleExtKt.a(buttonStyle2) : null;
        boolean z = button1.c;
        DeliveryUnlimitedPaymentQuery.ButtonAction buttonAction2 = button1.d;
        EmptyList emptyList = EmptyList.d;
        if (buttonAction2 != null) {
            DeliveryUnlimitedPaymentQuery.Analytics analytics = buttonAction2.f22677a;
            if (analytics != null) {
                AnalyticsFields analyticsFields = analytics.b;
                String str17 = analyticsFields.f10032a;
                String str18 = analyticsFields.b;
                str = str10;
                String str19 = analyticsFields.c;
                String str20 = analyticsFields.e;
                String str21 = analyticsFields.f;
                String str22 = analyticsFields.g;
                String str23 = analyticsFields.d;
                String str24 = analyticsFields.h;
                String str25 = analyticsFields.i;
                List list = analyticsFields.j;
                if (list != null) {
                    List list2 = list;
                    str8 = str25;
                    str2 = str11;
                    deliveryUnlimitedIconItem = deliveryUnlimitedIconItem2;
                    arrayList4 = new ArrayList(CollectionsKt.s(list2, 10));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(AnalyticsFieldsExtraContentExtKt.a((AnalyticsFields.ExtraContent) it3.next()));
                    }
                } else {
                    str8 = str25;
                    str2 = str11;
                    deliveryUnlimitedIconItem = deliveryUnlimitedIconItem2;
                    arrayList4 = 0;
                }
                analyticsData2 = new AnalyticsData((EventConfig) null, str17, str18, str19, str20, str21, str22, str23, str24, str8, arrayList4 == 0 ? emptyList : arrayList4, 1, (DefaultConstructorMarker) null);
            } else {
                str = str10;
                str2 = str11;
                deliveryUnlimitedIconItem = deliveryUnlimitedIconItem2;
                analyticsData2 = null;
            }
            buttonAction = new ButtonAction(analyticsData2);
        } else {
            str = str10;
            str2 = str11;
            deliveryUnlimitedIconItem = deliveryUnlimitedIconItem2;
            buttonAction = null;
        }
        ButtonApiData buttonApiData = new ButtonApiData(str16, null, buttonStyleApiDataA, z, null, null, null, null, buttonAction, 242, null);
        DeliveryUnlimitedPaymentQuery.ImpressionAnalytics impressionAnalytics = terms.d;
        if (impressionAnalytics != null) {
            AnalyticsFields analyticsFields2 = impressionAnalytics.b;
            String str26 = analyticsFields2.f10032a;
            String str27 = analyticsFields2.b;
            String str28 = analyticsFields2.c;
            String str29 = analyticsFields2.e;
            String str30 = analyticsFields2.f;
            String str31 = analyticsFields2.g;
            String str32 = analyticsFields2.d;
            String str33 = analyticsFields2.h;
            String str34 = analyticsFields2.i;
            List list3 = analyticsFields2.j;
            if (list3 != null) {
                List list4 = list3;
                str6 = str34;
                str7 = str27;
                deliveryUnlimitedSignUpFooter = deliveryUnlimitedSignUpFooter2;
                arrayList3 = new ArrayList(CollectionsKt.s(list4, 10));
                Iterator it4 = list4.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(AnalyticsFieldsExtraContentExtKt.a((AnalyticsFields.ExtraContent) it4.next()));
                }
            } else {
                str6 = str34;
                str7 = str27;
                deliveryUnlimitedSignUpFooter = deliveryUnlimitedSignUpFooter2;
                arrayList3 = 0;
            }
            analyticsData = new AnalyticsData((EventConfig) null, str26, str7, str28, str29, str30, str31, str32, str33, str6, arrayList3 == 0 ? emptyList : arrayList3, 1, (DefaultConstructorMarker) null);
        } else {
            deliveryUnlimitedSignUpFooter = deliveryUnlimitedSignUpFooter2;
            analyticsData = null;
        }
        DeliveryUnlimitedSubscribeTerms deliveryUnlimitedSubscribeTerms2 = new DeliveryUnlimitedSubscribeTerms(str13, arrayList6, buttonApiData, analyticsData);
        DeliveryUnlimitedPaymentQuery.PaymentMethodSection paymentMethodSection = deliveryUnlimitedPayment.e;
        String str35 = paymentMethodSection.f22689a;
        ArrayList arrayList9 = paymentMethodSection.b;
        ArrayList arrayList10 = new ArrayList();
        Iterator it5 = arrayList9.iterator();
        while (it5.hasNext()) {
            DeliveryUnlimitedPaymentQuery.PaymentMethod paymentMethod = (DeliveryUnlimitedPaymentQuery.PaymentMethod) it5.next();
            DeliveryUnlimitedPaymentQuery.OnAddCreditCard onAddCreditCard = paymentMethod.b;
            if (onAddCreditCard != null) {
                String str36 = onAddCreditCard.f22685a;
                AnalyticsFields analyticsFields3 = onAddCreditCard.b.b;
                String str37 = analyticsFields3.f10032a;
                String str38 = analyticsFields3.b;
                String str39 = analyticsFields3.c;
                String str40 = analyticsFields3.e;
                String str41 = analyticsFields3.f;
                String str42 = analyticsFields3.g;
                it2 = it5;
                String str43 = analyticsFields3.d;
                String str44 = analyticsFields3.h;
                String str45 = analyticsFields3.i;
                List list5 = analyticsFields3.j;
                if (list5 != null) {
                    List list6 = list5;
                    str4 = str45;
                    deliveryUnlimitedSubscribeTerms = deliveryUnlimitedSubscribeTerms2;
                    str5 = str37;
                    arrayList2 = new ArrayList(CollectionsKt.s(list6, 10));
                    Iterator it6 = list6.iterator();
                    while (it6.hasNext()) {
                        arrayList2.add(AnalyticsFieldsExtraContentExtKt.a((AnalyticsFields.ExtraContent) it6.next()));
                    }
                } else {
                    str4 = str45;
                    deliveryUnlimitedSubscribeTerms = deliveryUnlimitedSubscribeTerms2;
                    str5 = str37;
                    arrayList2 = 0;
                }
                expired = new PaymentMethodItem.CreditCard.Add(str36, new AnalyticsData((EventConfig) null, str5, str38, str39, str40, str41, str42, str43, str44, str4, arrayList2 == 0 ? emptyList : arrayList2, 1, (DefaultConstructorMarker) null));
            } else {
                it2 = it5;
                deliveryUnlimitedSubscribeTerms = deliveryUnlimitedSubscribeTerms2;
                DeliveryUnlimitedPaymentQuery.OnLinkedCreditCard onLinkedCreditCard = paymentMethod.c;
                if (onLinkedCreditCard != null) {
                    expired = new PaymentMethodItem.CreditCard.Linked(onLinkedCreditCard.f22687a, onLinkedCreditCard.b, onLinkedCreditCard.c, onLinkedCreditCard.d, onLinkedCreditCard.e, onLinkedCreditCard.f, onLinkedCreditCard.g, onLinkedCreditCard.h, onLinkedCreditCard.i);
                } else {
                    DeliveryUnlimitedPaymentQuery.OnExpiredCreditCard onExpiredCreditCard = paymentMethod.d;
                    expired = onExpiredCreditCard != null ? new PaymentMethodItem.CreditCard.Expired(onExpiredCreditCard.f22686a, onExpiredCreditCard.b, onExpiredCreditCard.c, onExpiredCreditCard.d) : null;
                }
            }
            if (expired != null) {
                arrayList10.add(expired);
            }
            it5 = it2;
            deliveryUnlimitedSubscribeTerms2 = deliveryUnlimitedSubscribeTerms;
        }
        DeliveryUnlimitedSubscribeTerms deliveryUnlimitedSubscribeTerms3 = deliveryUnlimitedSubscribeTerms2;
        PaymentMethodSection paymentMethodSection2 = new PaymentMethodSection(str35, arrayList10);
        ArrayList arrayList11 = deliveryUnlimitedPayment.f;
        ArrayList arrayList12 = new ArrayList(CollectionsKt.s(arrayList11, 10));
        for (Iterator it7 = arrayList11.iterator(); it7.hasNext(); it7 = it) {
            DeliveryUnlimitedPaymentQuery.Analytic analytic = (DeliveryUnlimitedPaymentQuery.Analytic) it7.next();
            Intrinsics.h(analytic, "<this>");
            AnalyticsFields analyticsFields4 = analytic.b;
            String str46 = analyticsFields4.f10032a;
            String str47 = analyticsFields4.b;
            String str48 = analyticsFields4.c;
            String str49 = analyticsFields4.e;
            String str50 = analyticsFields4.f;
            String str51 = analyticsFields4.g;
            String str52 = analyticsFields4.d;
            String str53 = analyticsFields4.h;
            String str54 = analyticsFields4.i;
            List list7 = analyticsFields4.j;
            if (list7 != null) {
                List list8 = list7;
                it = it7;
                str3 = str46;
                arrayList = new ArrayList(CollectionsKt.s(list8, 10));
                Iterator it8 = list8.iterator();
                while (it8.hasNext()) {
                    arrayList.add(AnalyticsFieldsExtraContentExtKt.a((AnalyticsFields.ExtraContent) it8.next()));
                }
            } else {
                it = it7;
                str3 = str46;
                arrayList = 0;
            }
            arrayList12.add(new AnalyticsData((EventConfig) null, str3, str47, str48, str49, str50, str51, str52, str53, str54, arrayList == 0 ? emptyList : arrayList, 1, (DefaultConstructorMarker) null));
        }
        return new DeliveryUnlimitedPaymentResponse(str15, str, str2, deliveryUnlimitedIconItem, deliveryUnlimitedSignUpFooter, deliveryUnlimitedSubscribeTerms3, paymentMethodSection2, arrayList12, null, 256, null);
    }
}
