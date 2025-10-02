package au.com.woolworths.foundation.shop.cart.data.mapper;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"cart-data_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CartProductCardBuyMoreSaveMorePromotionInfoExtKt {
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 au.com.woolworths.foundation.shop.cart.data.model.BuyMoreSaveMorePromotionInfo, still in use, count: 2, list:
          (r2v0 au.com.woolworths.foundation.shop.cart.data.model.BuyMoreSaveMorePromotionInfo) from 0x006f: MOVE (r22v0 au.com.woolworths.foundation.shop.cart.data.model.BuyMoreSaveMorePromotionInfo) = (r2v0 au.com.woolworths.foundation.shop.cart.data.model.BuyMoreSaveMorePromotionInfo)
          (r2v0 au.com.woolworths.foundation.shop.cart.data.model.BuyMoreSaveMorePromotionInfo) from 0x004a: MOVE (r22v2 au.com.woolworths.foundation.shop.cart.data.model.BuyMoreSaveMorePromotionInfo) = (r2v0 au.com.woolworths.foundation.shop.cart.data.model.BuyMoreSaveMorePromotionInfo)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    public static final au.com.woolworths.foundation.shop.cart.data.model.BuyMoreSaveMorePromotionInfo a(au.com.woolworths.shop.cart.data.common.fragment.CartProductCard.BuyMoreSaveMorePromotionInfo r23) {
        /*
            r0 = r23
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.h(r0, r1)
            au.com.woolworths.foundation.shop.cart.data.model.BuyMoreSaveMorePromotionInfo r2 = new au.com.woolworths.foundation.shop.cart.data.model.BuyMoreSaveMorePromotionInfo
            java.lang.String r3 = r0.f10400a
            java.lang.String r4 = r0.b
            java.lang.String r5 = r0.c
            boolean r6 = r0.d
            au.com.woolworths.shop.graphql.type.BuyMoreSaveMoreType r7 = r0.e
            kotlin.jvm.internal.Intrinsics.h(r7, r1)
            int r7 = r7.ordinal()
            if (r7 == 0) goto L25
            r8 = 1
            if (r7 == r8) goto L22
            au.com.woolworths.foundation.shop.cart.data.model.BuyMoreSaveMoreType r7 = au.com.woolworths.foundation.shop.cart.data.model.BuyMoreSaveMoreType.e
            goto L27
        L22:
            au.com.woolworths.foundation.shop.cart.data.model.BuyMoreSaveMoreType r7 = au.com.woolworths.foundation.shop.cart.data.model.BuyMoreSaveMoreType.e
            goto L27
        L25:
            au.com.woolworths.foundation.shop.cart.data.model.BuyMoreSaveMoreType r7 = au.com.woolworths.foundation.shop.cart.data.model.BuyMoreSaveMoreType.d
        L27:
            au.com.woolworths.shop.cart.data.common.fragment.CartProductCard$ClickAnalytics r0 = r0.f
            kotlin.jvm.internal.Intrinsics.h(r0, r1)
            au.com.woolworths.sdui.shop.fragment.AnalyticsFields r0 = r0.b
            java.lang.String r10 = r0.f10032a
            java.lang.String r11 = r0.b
            java.lang.String r12 = r0.c
            java.lang.String r13 = r0.e
            java.lang.String r14 = r0.f
            java.lang.String r15 = r0.g
            java.lang.String r1 = r0.d
            java.lang.String r8 = r0.h
            java.lang.String r9 = r0.i
            java.util.List r0 = r0.j
            if (r0 == 0) goto L6d
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r16 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r22 = r2
            r2 = 10
            int r2 = kotlin.collections.CollectionsKt.s(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L59:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L72
            java.lang.Object r2 = r0.next()
            au.com.woolworths.sdui.shop.fragment.AnalyticsFields$ExtraContent r2 = (au.com.woolworths.sdui.shop.fragment.AnalyticsFields.ExtraContent) r2
            au.com.woolworths.analytics.model.AnalyticsExtraContent r2 = au.com.woolworths.foundation.shop.cart.data.mapper.AnalyticsFieldsExtraContentExtKt.a(r2)
            r1.add(r2)
            goto L59
        L6d:
            r16 = r1
            r22 = r2
            r1 = 0
        L72:
            if (r1 != 0) goto L76
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.d
        L76:
            r19 = r1
            r17 = r8
            au.com.woolworths.analytics.model.AnalyticsData r8 = new au.com.woolworths.analytics.model.AnalyticsData
            r18 = r9
            r9 = 0
            r20 = 1
            r21 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r2 = r22
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.shop.cart.data.mapper.CartProductCardBuyMoreSaveMorePromotionInfoExtKt.a(au.com.woolworths.shop.cart.data.common.fragment.CartProductCard$BuyMoreSaveMorePromotionInfo):au.com.woolworths.foundation.shop.cart.data.model.BuyMoreSaveMorePromotionInfo");
    }
}
