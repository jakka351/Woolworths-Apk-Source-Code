package au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.compose.utils.list.ItemUniqueInScreenKt;
import au.com.woolworths.compose.utils.list.UniqueIdValidator;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.product.list.legacy.a0;
import au.com.woolworths.feature.rewards.offers.OfferSectionViewItem;
import au.com.woolworths.feature.rewards.offers.ProductSectionViewItem;
import au.com.woolworths.feature.rewards.offers.SectionViewItemExtKt;
import au.com.woolworths.feature.rewards.offers.StandardSectionViewItem;
import au.com.woolworths.feature.rewards.offers.data.OfferSectionLayout;
import au.com.woolworths.feature.rewards.offers.data.OffersSectionConfig;
import au.com.woolworths.feature.rewards.offers.data.RewardsOfferFilterData;
import au.com.woolworths.feature.rewards.offers.ui.OffersSectionTitleKt;
import au.com.woolworths.feature.rewards.offers.ui.ProductOfferCardTileKt;
import au.com.woolworths.foundation.feature.analytics.list.ListItemsTrackerState;
import au.com.woolworths.foundation.rewards.common.ui.home.HomepageStyle;
import au.com.woolworths.foundation.rewards.common.ui.home.HomepageStyleKt;
import au.com.woolworths.foundation.rewards.offers.model.OfferViewItem;
import au.com.woolworths.foundation.rewards.offers.model.OfferViewItemKt;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import au.com.woolworths.foundation.rewards.offers.ui.RewardsOfferTileKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OfferSectionViewKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6384a;

        static {
            int[] iArr = new int[OfferSectionLayout.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OfferSectionLayout offerSectionLayout = OfferSectionLayout.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                OfferSectionLayout offerSectionLayout2 = OfferSectionLayout.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[HomepageStyle.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            f6384a = iArr2;
        }
    }

    public static final void a(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(670326453);
        if (i == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            SpacerKt.a(composerImplV, SizeKt.g(Modifier.Companion.d, WhenMappings.f6384a[((HomepageStyle) composerImplV.x(HomepageStyleKt.f8583a)).ordinal()] == 1 ? 24 : 16));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a0(i, 23);
        }
    }

    public static final void b(LazyListScope lazyListScope, final RewardsOfferFilterData rewardsOfferFilterData, final OfferSectionViewItem offerSectionViewItem, final Function1 onOfferSectionCtaClick, final Function1 onOfferClick, final Function1 activateOffer, final Function2 onOfferCtaButtonClick, final ListItemsTrackerState listItemsTrackerState, UniqueIdValidator uniqueIdValidator, final au.com.woolworths.design.wx.component.searchbar.a aVar, final Function0 onProductOffersSwipeStarted, final Function1 onProductOffersSwipeEnded, final boolean z) {
        int i;
        String str;
        boolean z2;
        String str2;
        Intrinsics.h(lazyListScope, "<this>");
        Intrinsics.h(onOfferSectionCtaClick, "onOfferSectionCtaClick");
        Intrinsics.h(onOfferClick, "onOfferClick");
        Intrinsics.h(activateOffer, "activateOffer");
        Intrinsics.h(onOfferCtaButtonClick, "onOfferCtaButtonClick");
        Intrinsics.h(uniqueIdValidator, "uniqueIdValidator");
        Intrinsics.h(onProductOffersSwipeStarted, "onProductOffersSwipeStarted");
        Intrinsics.h(onProductOffersSwipeEnded, "onProductOffersSwipeEnded");
        int size = SectionViewItemExtKt.c(offerSectionViewItem).size();
        if (size == 0) {
            return;
        }
        LazyListScope.i(lazyListScope, null, null, ComposableSingletons$OfferSectionViewKt.f6382a, 3);
        if (!(offerSectionViewItem instanceof ProductSectionViewItem)) {
            if (!(offerSectionViewItem instanceof StandardSectionViewItem)) {
                throw new NoWhenBranchMatchedException();
            }
            StandardSectionViewItem standardSectionViewItem = (StandardSectionViewItem) offerSectionViewItem;
            if (!c(rewardsOfferFilterData, standardSectionViewItem.c) || (str = standardSectionViewItem.d) == null) {
                i = 0;
            } else {
                i = 0;
                final String strQ = StringsKt.Q(str, "%%%", String.valueOf(size), false);
                LazyListScope.i(lazyListScope, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection.OfferSectionViewKt$offersSectionView$5$1
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        LazyItemScope item = (LazyItemScope) obj;
                        Composer composer = (Composer) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Intrinsics.h(item, "$this$item");
                        if ((iIntValue & 17) == 16 && composer.c()) {
                            composer.j();
                        } else {
                            composer.o(-1633490746);
                            Function1 function1 = onOfferSectionCtaClick;
                            boolean zN = composer.n(function1);
                            OfferSectionViewItem offerSectionViewItem2 = offerSectionViewItem;
                            boolean zI = zN | composer.I(offerSectionViewItem2);
                            Object objG = composer.G();
                            if (zI || objG == Composer.Companion.f1624a) {
                                objG = new d(function1, offerSectionViewItem2, 1);
                                composer.A(objG);
                            }
                            composer.l();
                            OffersSectionTitleKt.b(0, 28, composer, null, strQ, null, (Function0) objG, false);
                            SpacerKt.a(composer, SizeKt.g(Modifier.Companion.d, 16));
                        }
                        return Unit.f24250a;
                    }
                }, true, -1108185396), 3);
            }
            List list = standardSectionViewItem.f;
            int size2 = list.size();
            for (int i2 = i; i2 < size2; i2++) {
                final OfferViewItem offerViewItem = (OfferViewItem) list.get(i2);
                final String str3 = "offerSection-" + offerViewItem + ".offerData.offerId";
                ItemUniqueInScreenKt.a(lazyListScope, str3, uniqueIdValidator, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection.OfferSectionViewKt$offersSectionView$6$1
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        LazyItemScope itemUniqueInScreen = (LazyItemScope) obj;
                        Composer composer = (Composer) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Intrinsics.h(itemUniqueInScreen, "$this$itemUniqueInScreen");
                        if ((iIntValue & 17) == 16 && composer.c()) {
                            composer.j();
                        } else {
                            Modifier modifierH = PaddingKt.h(Modifier.Companion.d, 16, BitmapDescriptorFactory.HUE_RED, 2);
                            OfferViewItem offerViewItem2 = offerViewItem;
                            RewardsOfferTileKt.h(offerViewItem2.b, OfferViewItemKt.a(offerViewItem2), onOfferClick, onOfferCtaButtonClick, activateOffer, modifierH, BitmapDescriptorFactory.HUE_RED, composer, 196608, 64);
                            OfferSectionViewKt.a(composer, 0);
                            composer.o(-1746271574);
                            ListItemsTrackerState listItemsTrackerState2 = listItemsTrackerState;
                            boolean zN = composer.n(listItemsTrackerState2);
                            String str4 = str3;
                            boolean zN2 = zN | composer.n(str4) | composer.I(offerViewItem2);
                            Object objG = composer.G();
                            if (zN2 || objG == Composer.Companion.f1624a) {
                                objG = new OfferSectionViewKt$offersSectionView$6$1$1$1(listItemsTrackerState2, str4, offerViewItem2, null);
                                composer.A(objG);
                            }
                            composer.l();
                            EffectsKt.e(composer, str4, (Function2) objG);
                        }
                        return Unit.f24250a;
                    }
                }, true, 2026238115));
            }
            return;
        }
        ProductSectionViewItem productSectionViewItem = (ProductSectionViewItem) offerSectionViewItem;
        String str4 = productSectionViewItem.c;
        if (!c(rewardsOfferFilterData, str4) || (str2 = productSectionViewItem.d) == null) {
            z2 = true;
        } else {
            final String strQ2 = StringsKt.Q(str2, "%%%", String.valueOf(size), false);
            z2 = true;
            LazyListScope.i(lazyListScope, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection.OfferSectionViewKt$offersSectionView$1$1
                /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
                @Override // kotlin.jvm.functions.Function3
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
                    /*
                        r8 = this;
                        androidx.compose.foundation.lazy.LazyItemScope r9 = (androidx.compose.foundation.lazy.LazyItemScope) r9
                        r2 = r10
                        androidx.compose.runtime.Composer r2 = (androidx.compose.runtime.Composer) r2
                        java.lang.Number r11 = (java.lang.Number) r11
                        int r10 = r11.intValue()
                        java.lang.String r11 = "$this$item"
                        kotlin.jvm.internal.Intrinsics.h(r9, r11)
                        r9 = r10 & 17
                        r10 = 16
                        if (r9 != r10) goto L22
                        boolean r9 = r2.c()
                        if (r9 != 0) goto L1d
                        goto L22
                    L1d:
                        r2.j()
                        goto Lba
                    L22:
                        r9 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
                        r2.o(r9)
                        kotlin.jvm.functions.Function1 r9 = r2
                        boolean r10 = r2.n(r9)
                        au.com.woolworths.feature.rewards.offers.OfferSectionViewItem r11 = r3
                        boolean r0 = r2.I(r11)
                        r10 = r10 | r0
                        java.lang.Object r0 = r2.G()
                        if (r10 != 0) goto L3f
                        androidx.compose.runtime.Composer$Companion$Empty$1 r10 = androidx.compose.runtime.Composer.Companion.f1624a
                        if (r0 != r10) goto L48
                    L3f:
                        au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection.d r0 = new au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection.d
                        r10 = 0
                        r0.<init>(r9, r11, r10)
                        r2.A(r0)
                    L48:
                        r6 = r0
                        kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
                        r2.l()
                        au.com.woolworths.feature.rewards.offers.ProductSectionViewItem r11 = (au.com.woolworths.feature.rewards.offers.ProductSectionViewItem) r11
                        au.com.woolworths.android.onesite.data.ContentCta r9 = r11.h
                        r10 = 0
                        if (r9 == 0) goto L7c
                        java.lang.String r9 = r9.getLabel()
                        if (r9 == 0) goto L7c
                        au.com.woolworths.feature.rewards.offers.data.RewardsOfferFilterData r0 = r4
                        if (r0 == 0) goto L62
                        java.lang.String r1 = r0.f6288a
                        goto L63
                    L62:
                        r1 = r10
                    L63:
                        java.lang.String r3 = "ended"
                        boolean r1 = kotlin.jvm.internal.Intrinsics.c(r1, r3)
                        if (r1 != 0) goto L7c
                        if (r0 == 0) goto L70
                        java.lang.String r0 = r0.f6288a
                        goto L71
                    L70:
                        r0 = r10
                    L71:
                        java.lang.String r1 = "ready_to_shop"
                        boolean r0 = kotlin.jvm.internal.Intrinsics.c(r0, r1)
                        if (r0 == 0) goto L7a
                        goto L7c
                    L7a:
                        r5 = r9
                        goto L7d
                    L7c:
                        r5 = r10
                    L7d:
                        boolean r9 = r11.g
                        if (r9 == 0) goto Lb0
                        java.util.List r9 = au.com.woolworths.feature.rewards.offers.SectionViewItemExtKt.c(r11)
                        java.lang.Iterable r9 = (java.lang.Iterable) r9
                        boolean r10 = r9 instanceof java.util.Collection
                        if (r10 == 0) goto L95
                        r10 = r9
                        java.util.Collection r10 = (java.util.Collection) r10
                        boolean r10 = r10.isEmpty()
                        if (r10 == 0) goto L95
                        goto Lb0
                    L95:
                        java.util.Iterator r9 = r9.iterator()
                    L99:
                        boolean r10 = r9.hasNext()
                        if (r10 == 0) goto Lb0
                        java.lang.Object r10 = r9.next()
                        au.com.woolworths.foundation.rewards.offers.model.OfferViewItem r10 = (au.com.woolworths.foundation.rewards.offers.model.OfferViewItem) r10
                        au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData r10 = r10.b
                        au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus r10 = r10.n
                        au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus r11 = au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus.NOT_ACTIVATED
                        if (r10 != r11) goto L99
                        r9 = 1
                    Lae:
                        r7 = r9
                        goto Lb2
                    Lb0:
                        r9 = 0
                        goto Lae
                    Lb2:
                        r0 = 0
                        r1 = 4
                        r3 = 0
                        java.lang.String r4 = r1
                        au.com.woolworths.feature.rewards.offers.ui.OffersSectionTitleKt.b(r0, r1, r2, r3, r4, r5, r6, r7)
                    Lba:
                        kotlin.Unit r9 = kotlin.Unit.f24250a
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection.OfferSectionViewKt$offersSectionView$1$1.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, true, -1299782699), 3);
        }
        int iOrdinal = productSectionViewItem.j.ordinal();
        if (iOrdinal == 0) {
            final String str5 = productSectionViewItem.e;
            if (str5 != null) {
                LazyListScope.i(lazyListScope, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection.OfferSectionViewKt$offersSectionView$2$1
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        LazyItemScope item = (LazyItemScope) obj;
                        Composer composer = (Composer) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Intrinsics.h(item, "$this$item");
                        if ((iIntValue & 17) == 16 && composer.c()) {
                            composer.j();
                        } else {
                            composer.o(-2063625762);
                            String str6 = ((ProductSectionViewItem) offerSectionViewItem).d;
                            Modifier.Companion companion = Modifier.Companion.d;
                            if (str6 != null) {
                                SpacerKt.a(composer, SizeKt.g(companion, 8));
                            }
                            composer.l();
                            TextKt.b(str5, PaddingKt.j(companion, 16, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), WxTheme.a(composer).f(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer).n, composer, 48, 0, 65528);
                        }
                        return Unit.f24250a;
                    }
                }, z2, 149807764), 3);
            }
            LazyListScope.i(lazyListScope, null, null, ComposableSingletons$OfferSectionViewKt.b, 3);
            List list2 = productSectionViewItem.i;
            int size3 = list2.size();
            for (final int i3 = 0; i3 < size3; i3++) {
                final OfferViewItem offerViewItem2 = (OfferViewItem) list2.get(i3);
                final String strI = YU.a.i("offerSection-", str4, "-", offerViewItem2.b.d);
                ItemUniqueInScreenKt.a(lazyListScope, strI, uniqueIdValidator, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection.OfferSectionViewKt$offersSectionView$3$1
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        LazyItemScope itemUniqueInScreen = (LazyItemScope) obj;
                        Composer composer = (Composer) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Intrinsics.h(itemUniqueInScreen, "$this$itemUniqueInScreen");
                        if ((iIntValue & 17) == 16 && composer.c()) {
                            composer.j();
                        } else {
                            OfferViewItem offerViewItem3 = offerViewItem2;
                            RewardsOfferData rewardsOfferData = offerViewItem3.b;
                            StatefulButtonState statefulButtonStateA = OfferViewItemKt.a(offerViewItem3);
                            Modifier.Companion companion = Modifier.Companion.d;
                            float f = 16;
                            ProductOfferCardTileKt.a(rewardsOfferData, statefulButtonStateA, onOfferClick, activateOffer, onOfferCtaButtonClick, z, PaddingKt.h(SizeKt.e(companion, 1.0f), f, BitmapDescriptorFactory.HUE_RED, 2), composer, 1572864, 0);
                            composer.o(1220763023);
                            if (CollectionsKt.I(((ProductSectionViewItem) offerSectionViewItem).i) != i3) {
                                SpacerKt.a(composer, SizeKt.g(companion, f));
                            }
                            composer.l();
                            composer.o(-1746271574);
                            ListItemsTrackerState listItemsTrackerState2 = listItemsTrackerState;
                            boolean zN = composer.n(listItemsTrackerState2);
                            String str6 = strI;
                            boolean zN2 = zN | composer.n(str6) | composer.I(offerViewItem3);
                            Object objG = composer.G();
                            if (zN2 || objG == Composer.Companion.f1624a) {
                                objG = new OfferSectionViewKt$offersSectionView$3$1$1$1(listItemsTrackerState2, str6, offerViewItem3, null);
                                composer.A(objG);
                            }
                            composer.l();
                            EffectsKt.e(composer, str6, (Function2) objG);
                        }
                        return Unit.f24250a;
                    }
                }, true, 993447950));
            }
        } else {
            if (iOrdinal != z2 && iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            LazyListScope.i(lazyListScope, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection.OfferSectionViewKt$offersSectionView$4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    LazyItemScope item = (LazyItemScope) obj;
                    Composer composer = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(item, "$this$item");
                    if ((iIntValue & 17) == 16 && composer.c()) {
                        composer.j();
                    } else {
                        composer.o(483949937);
                        ProductSectionViewItem productSectionViewItem2 = (ProductSectionViewItem) offerSectionViewItem;
                        if (productSectionViewItem2.d != null) {
                            SpacerKt.a(composer, SizeKt.g(Modifier.Companion.d, 8));
                        }
                        composer.l();
                        RewardsOfferFilterData rewardsOfferFilterData2 = rewardsOfferFilterData;
                        boolean zC = Intrinsics.c(rewardsOfferFilterData2 != null ? rewardsOfferFilterData2.f6288a : null, "ended");
                        int i4 = 2;
                        boolean z3 = z;
                        if (z3 && productSectionViewItem2.j == OfferSectionLayout.f) {
                            i4 = 1;
                        }
                        OfferCarouselViewKt.a(productSectionViewItem2, onOfferClick, activateOffer, onOfferCtaButtonClick, aVar, onProductOffersSwipeStarted, onProductOffersSwipeEnded, i4, z3, zC, composer, 0, 0);
                    }
                    return Unit.f24250a;
                }
            }, true, -424076945), 3);
        }
        LazyListScope.i(lazyListScope, null, null, ComposableSingletons$OfferSectionViewKt.c, 3);
    }

    public static final boolean c(RewardsOfferFilterData rewardsOfferFilterData, String str) {
        Object next;
        if (rewardsOfferFilterData == null) {
            return true;
        }
        Iterable iterable = (Iterable) rewardsOfferFilterData.f;
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj instanceof OffersSectionConfig) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((OffersSectionConfig) next).f6278a.equals(str)) {
                break;
            }
        }
        OffersSectionConfig offersSectionConfig = (OffersSectionConfig) next;
        Boolean boolValueOf = offersSectionConfig != null ? Boolean.valueOf(offersSectionConfig.b) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return true;
    }
}
