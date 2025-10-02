package au.com.woolworths.rewards.base.analytics;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.android.onesite.analytics.tealium.TealiumEventBundleManager;
import au.com.woolworths.rewards.base.analytics.TealiumEventBundlingRule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/base/analytics/TealiumEventBundleManagerImpl;", "Lau/com/woolworths/android/onesite/analytics/tealium/TealiumEventBundleManager;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Singleton
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class TealiumEventBundleManagerImpl implements TealiumEventBundleManager {

    /* renamed from: a, reason: collision with root package name */
    public Object f9358a;
    public LinkedHashMap b;
    public LinkedHashMap c;

    public static String f(Object obj) {
        String string;
        String strQ = (obj == null || (string = obj.toString()) == null) ? null : StringsKt.Q(string, ",", " ", false);
        return strQ == null ? "" : strQ;
    }

    @Override // au.com.woolworths.android.onesite.analytics.tealium.TealiumEventBundleManager
    public final void a() {
        this.f9358a = EmptyList.d;
        this.b = null;
        this.c = null;
    }

    @Override // au.com.woolworths.android.onesite.analytics.tealium.TealiumEventBundleManager
    public final void b(Map contextData) {
        Intrinsics.h(contextData, "contextData");
        if (this.b == null) {
            Set setKeySet = contextData.keySet();
            if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
                Iterator it = setKeySet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (TealiumEventBundleManagerImplKt.f9359a.contains((String) it.next())) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : contextData.entrySet()) {
                            if (TealiumEventBundleManagerImplKt.f9359a.contains((String) entry.getKey())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        this.b = linkedHashMap;
                    }
                }
            }
        }
        if (this.c == null) {
            Set<String> setKeySet2 = contextData.keySet();
            if (!(setKeySet2 instanceof Collection) || !setKeySet2.isEmpty()) {
                for (String str : setKeySet2) {
                    TealiumEventBundleManagerImplKt.b.getClass();
                }
            }
        }
        this.f9358a = CollectionsKt.d0(contextData, (Collection) this.f9358a);
    }

    @Override // au.com.woolworths.android.onesite.analytics.tealium.TealiumEventBundleManager
    public final boolean c(Map contextData) {
        Intrinsics.h(contextData, "contextData");
        if (this.b == null) {
            return true;
        }
        List list = TealiumEventBundleManagerImplKt.f9359a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (contextData.get((String) it.next()) != null) {
                List<String> list2 = TealiumEventBundleManagerImplKt.f9359a;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    return true;
                }
                for (String str : list2) {
                    LinkedHashMap linkedHashMap = this.b;
                    if (!Intrinsics.c(linkedHashMap != null ? linkedHashMap.get(str) : null, contextData.get(str))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return true;
    }

    @Override // au.com.woolworths.android.onesite.analytics.tealium.TealiumEventBundleManager
    public final Event d() {
        String str;
        Object objA;
        String str2;
        if (((Collection) this.f9358a).isEmpty()) {
            return null;
        }
        Pair pair = new Pair("event.Action", "impression");
        String str3 = "event.Category";
        Pair pair2 = new Pair("event.Category", "combined_events");
        Pair pair3 = new Pair("event.Label", "combined impression data loaded");
        Iterable iterable = (Iterable) this.f9358a;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(iterable, 10));
        Iterator it = iterable.iterator();
        while (true) {
            String string = "";
            if (!it.hasNext()) {
                break;
            }
            Map map = (Map) it.next();
            String strF = f(map.get(str3));
            String strF2 = f(map.get("event.Label"));
            Iterator it2 = TealiumEventKeyPropertyKt.f9361a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    str = null;
                    objA = null;
                    break;
                }
                str = null;
                TealiumEventKeyProperty tealiumEventKeyProperty = (TealiumEventKeyProperty) it2.next();
                objA = tealiumEventKeyProperty.a(map.get(tealiumEventKeyProperty.getF9357a()));
                if (objA != null) {
                    break;
                }
            }
            String strF3 = f(objA);
            Object obj = map.get("event.Value");
            if (obj != null) {
                String string2 = obj.toString();
                Intrinsics.h(string2, "<this>");
                String string3 = StringsKt.k0(string2).toString();
                str2 = str3;
                if (!StringsKt.W(string3, "com.", false) && !StringsKt.W(string3, "http", false)) {
                    string = obj.toString();
                }
            } else {
                str2 = str3;
                string = str;
            }
            arrayList.add(CollectionsKt.M(CollectionsKt.R(strF, strF2, strF3, f(string)), "<>", null, null, null, 62));
            str3 = str2;
        }
        Pair pair4 = new Pair("event.Key", arrayList);
        Iterable iterable2 = (Iterable) this.f9358a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(iterable2, 10));
        Iterator it3 = iterable2.iterator();
        while (it3.hasNext()) {
            Object obj2 = ((Map) it3.next()).get("acs.StitchID");
            String string4 = obj2 != null ? obj2.toString() : null;
            if (string4 == null) {
                string4 = "";
            }
            arrayList2.add(string4);
        }
        Map mapJ = MapsKt.j(pair, pair2, pair3, pair4, new Pair("combined.StitchID", arrayList2));
        Map map2 = this.b;
        if (map2 == null) {
            map2 = EmptyMap.d;
        }
        LinkedHashMap linkedHashMapM = MapsKt.m(mapJ, map2);
        Map map3 = this.c;
        if (map3 == null) {
            map3 = EmptyMap.d;
        }
        return new BundleEvent(MapsKt.m(linkedHashMapM, map3));
    }

    @Override // au.com.woolworths.android.onesite.analytics.tealium.TealiumEventBundleManager
    public final boolean e(String tealiumEventKey, Map contextData, boolean z) {
        Intrinsics.h(tealiumEventKey, "tealiumEventKey");
        Intrinsics.h(contextData, "contextData");
        List list = TealiumEventBundlingRuleKt.f9360a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof TealiumEventBundlingRule.MustExcludeRule) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((TealiumEventBundlingRule.MustExcludeRule) it.next()).a(tealiumEventKey, contextData)) {
                    return false;
                }
            }
        }
        if (z) {
            return true;
        }
        List list2 = TealiumEventBundlingRuleKt.f9360a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof TealiumEventBundlingRule.ExcludedRule) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (((TealiumEventBundlingRule.ExcludedRule) it2.next()).a(tealiumEventKey, contextData)) {
                    return false;
                }
            }
        }
        List list3 = TealiumEventBundlingRuleKt.f9360a;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list3) {
            if (obj3 instanceof TealiumEventBundlingRule.IncludeRule) {
                arrayList3.add(obj3);
            }
        }
        if (arrayList3.isEmpty()) {
            return false;
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            if (((TealiumEventBundlingRule.IncludeRule) it3.next()).a(tealiumEventKey, contextData)) {
                return true;
            }
        }
        return false;
    }
}
