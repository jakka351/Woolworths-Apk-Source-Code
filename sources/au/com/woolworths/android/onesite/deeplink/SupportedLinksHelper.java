package au.com.woolworths.android.onesite.deeplink;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import com.airbnb.deeplinkdispatch.DeepLinkEntry;
import com.airbnb.deeplinkdispatch.base.MatchIndex;
import com.medallia.digital.mobilesdk.q2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.GeneratorSequence;
import kotlin.sequences.Sequence;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/deeplink/SupportedLinksHelper;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SupportedLinksHelper {

    /* renamed from: a, reason: collision with root package name */
    public final FeatureToggleManager f4245a;
    public final ShopAppRegionInteractor b;
    public final Regex c;
    public final List d;

    public SupportedLinksHelper(FeatureToggleManager featureToggleManager, ShopAppRegionInteractor shopAppRegionInteractor) {
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(shopAppRegionInteractor, "shopAppRegionInteractor");
        this.f4245a = featureToggleManager;
        this.b = shopAppRegionInteractor;
        this.c = new Regex("\\{([^}]*)\\}");
        this.d = CollectionsKt.R("freshmag", "lists/suggestedlists/?id", "lists/suggestedlists", "ScanAndGo", "scanandgo/parkingvoucher", "instoreWiFi", "recipes/saved", "recipes", "recipes/search", "recipefeed", "recipe", "notificationpreferences", "everyday-market", "healthylife/foodtracker", "notificationoptin", "notificationcentre", "everydayExtras", "everydayExtra/signUp", "everydayExtra/choosePlan", "voiceProductFinder", "productFinder", "voiceProductSearch", "productRatingsAndReviews", "submitProductReviews", "lists/watchlist", "bundles", "everyday-market/shipping-calculator", "everyday-market/seller?name");
    }

    public final List a() {
        String str;
        Iterator it;
        String str2;
        List listG0;
        List listG02;
        Object obj;
        MatchIndex matchIndex = new ShopAppDeepLinkModuleRegistry().b;
        int i = 0;
        ArrayList arrayListB = matchIndex.b(0, matchIndex.f13300a.length);
        ArrayList arrayList = new ArrayList(CollectionsKt.s(arrayListB, 10));
        Iterator it2 = arrayListB.iterator();
        while (it2.hasNext()) {
            arrayList.add(((DeepLinkEntry) it2.next()).getD());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (StringsKt.W((String) next, "com.woolworths.shop", false)) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList2, 10));
        Iterator it4 = arrayList2.iterator();
        while (true) {
            str = "";
            if (!it4.hasNext()) {
                break;
            }
            arrayList3.add(StringsKt.Q((String) it4.next(), "com.woolworths.shop://", "", false));
        }
        StringsKt.z();
        TreeSet treeSetM0 = CollectionsKt.M0(arrayList3, new SupportedLinksHelper$getSupportedLinks$$inlined$compareBy$1());
        BaseShopAppFeature baseShopAppFeature = BaseShopAppFeature.e;
        FeatureToggleManager featureToggleManager = this.f4245a;
        if (!featureToggleManager.c(baseShopAppFeature)) {
            treeSetM0.remove("bundles");
        }
        if (!featureToggleManager.c(BaseShopAppFeature.N)) {
            treeSetM0.remove("productRatingsAndReviews");
            treeSetM0.remove("submitProductReviews");
        }
        if (!featureToggleManager.c(BaseShopAppFeature.P)) {
            treeSetM0.remove("submitProductReviews");
        }
        if (!featureToggleManager.c(BaseShopAppFeature.G)) {
            treeSetM0.remove("productDetails/{articleId}");
        }
        if (!featureToggleManager.c(BaseShopAppFeature.v)) {
            treeSetM0.remove("lists/watchlist");
        }
        if (!featureToggleManager.c(BaseShopAppFeature.h0) || !featureToggleManager.c(BaseShopAppFeature.i0)) {
            treeSetM0.remove("voiceProductSearch");
        }
        if (!featureToggleManager.c(BaseShopAppFeature.r)) {
            treeSetM0.remove("everyday-market/shipping-calculator");
        }
        if (!featureToggleManager.c(BaseShopAppFeature.D)) {
            treeSetM0.remove("pastShop");
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList(CollectionsKt.s(treeSetM0, 10));
        Iterator it5 = treeSetM0.iterator();
        while (it5.hasNext()) {
            String str3 = (String) it5.next();
            Intrinsics.e(str3);
            Sequence sequenceC = Regex.c(this.c, str3);
            if (((GeneratorSequence.AnonymousClass1) sequenceC.iterator()).hasNext()) {
                String strD0 = StringsKt.d0(str3, q2.c);
                RewritableDeeplinkPath.d.getClass();
                RewritableDeeplinkPath rewritableDeeplinkPath = (RewritableDeeplinkPath) RewritableDeeplinkPath.e.get(strD0);
                ArrayList arrayList6 = new ArrayList();
                arrayList6.add(str);
                Iterator it6 = sequenceC.iterator();
                int i2 = i;
                while (true) {
                    GeneratorSequence.AnonymousClass1 anonymousClass1 = (GeneratorSequence.AnonymousClass1) it6;
                    if (anonymousClass1.hasNext()) {
                        MatchResult matchResult = (MatchResult) anonymousClass1.next();
                        int i3 = 0;
                        for (Object obj2 : arrayList6) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                CollectionsKt.z0();
                                throw null;
                            }
                            String str4 = (String) obj2;
                            Iterator it7 = it5;
                            String strSubstring = str3.substring(i2, matchResult.d().d - 1);
                            Intrinsics.g(strSubstring, "substring(...)");
                            arrayList6.set(i3, str4 + strSubstring);
                            it5 = it7;
                            i3 = i4;
                            str = str;
                        }
                        Iterator it8 = it5;
                        String str5 = str;
                        String key = (String) matchResult.c().get(1);
                        if (rewritableDeeplinkPath != null) {
                            ArrayList arrayList7 = new ArrayList();
                            List listA = rewritableDeeplinkPath.a();
                            ArrayList arrayList8 = new ArrayList(CollectionsKt.s(listA, 10));
                            Iterator it9 = listA.iterator();
                            while (it9.hasNext()) {
                                arrayList8.add(Boolean.valueOf(arrayList7.add(((PlaceholderValue) it9.next()).b())));
                            }
                            listG02 = CollectionsKt.G0(arrayList7);
                        } else {
                            listG02 = null;
                        }
                        if (listG02 == null || !listG02.contains(key)) {
                            int i5 = 0;
                            for (Object obj3 : arrayList6) {
                                int i6 = i5 + 1;
                                if (i5 < 0) {
                                    CollectionsKt.z0();
                                    throw null;
                                }
                                arrayList6.set(i5, (String) obj3);
                                i5 = i6;
                            }
                        } else {
                            List listG03 = CollectionsKt.G0(arrayList6);
                            ArrayList arrayList9 = new ArrayList();
                            Intrinsics.h(rewritableDeeplinkPath, "<this>");
                            Intrinsics.h(key, "key");
                            Iterator it10 = rewritableDeeplinkPath.a().iterator();
                            while (true) {
                                if (!it10.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                Object next2 = it10.next();
                                if (Intrinsics.c(((PlaceholderValue) next2).b(), key)) {
                                    obj = next2;
                                    break;
                                }
                            }
                            PlaceholderValue placeholderValue = (PlaceholderValue) obj;
                            if (placeholderValue == null) {
                                throw new IllegalStateException(YU.a.h("Placeholder ", key, " is marked as rewritable but no values were provided."));
                            }
                            Iterator it11 = placeholderValue.a().iterator();
                            while (it11.hasNext()) {
                                PlaceholderVariables placeholderVariables = (PlaceholderVariables) it11.next();
                                Iterator it12 = listG03.iterator();
                                while (it12.hasNext()) {
                                    arrayList9.add(((String) it12.next()) + q2.c + placeholderVariables.getD());
                                    it11 = it11;
                                }
                            }
                            List listG04 = CollectionsKt.G0(arrayList9);
                            arrayList6.clear();
                            arrayList6 = CollectionsKt.J0(listG04);
                        }
                        i2 = matchResult.d().e + 1;
                        it5 = it8;
                        str = str5;
                    } else {
                        it = it5;
                        str2 = str;
                        if (i2 < str3.length()) {
                            int i7 = 0;
                            for (Object obj4 : arrayList6) {
                                int i8 = i7 + 1;
                                if (i7 < 0) {
                                    CollectionsKt.z0();
                                    throw null;
                                }
                                String strSubstring2 = str3.substring(i2, str3.length());
                                Intrinsics.g(strSubstring2, "substring(...)");
                                arrayList6.set(i7, ((String) obj4) + strSubstring2);
                                i7 = i8;
                            }
                        }
                        listG0 = CollectionsKt.G0(arrayList6);
                    }
                }
            } else {
                listG0 = CollectionsKt.Q(str3);
                it = it5;
                str2 = str;
            }
            arrayList5.add(Boolean.valueOf(arrayList4.addAll(listG0)));
            it5 = it;
            str = str2;
            i = 0;
        }
        if (this.b.b() == Region.j) {
            arrayList4.removeAll(this.d);
        }
        CollectionsKt.g0(arrayList4, new androidx.navigation.a(19));
        return CollectionsKt.G0(arrayList4);
    }
}
