package com.adobe.marketing.mobile.launch.rulesengine;

import com.adobe.marketing.mobile.ExtensionApi;
import com.adobe.marketing.mobile.rulesengine.DelimiterPair;
import com.adobe.marketing.mobile.rulesengine.Template;
import com.adobe.marketing.mobile.util.EventDataUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/LaunchRulesConsequence;", "", "Companion", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LaunchRulesConsequence {

    /* renamed from: a, reason: collision with root package name */
    public final ExtensionApi f13197a;
    public final LinkedHashMap b = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/LaunchRulesConsequence$Companion;", "", "", "CONSEQUENCE_DETAIL_ACTION_COPY", "Ljava/lang/String;", "CONSEQUENCE_DETAIL_ACTION_NEW", "CONSEQUENCE_DISPATCH_EVENT_NAME", "CONSEQUENCE_EVENT_DATA_KEY_CONSEQUENCE", "CONSEQUENCE_EVENT_DATA_KEY_DETAIL", "CONSEQUENCE_EVENT_DATA_KEY_ID", "CONSEQUENCE_EVENT_DATA_KEY_TYPE", "CONSEQUENCE_EVENT_NAME", "CONSEQUENCE_TYPE_ADD", "CONSEQUENCE_TYPE_DISPATCH", "CONSEQUENCE_TYPE_MOD", "LAUNCH_RULE_TOKEN_LEFT_DELIMITER", "LAUNCH_RULE_TOKEN_RIGHT_DELIMITER", "", "MAX_CHAINED_CONSEQUENCE_COUNT", "I", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }

    public LaunchRulesConsequence(ExtensionApi extensionApi) {
        this.f13197a = extensionApi;
    }

    public static Object b(Object obj, LaunchTokenFinder launchTokenFinder) {
        if (obj instanceof String) {
            String strA = new Template((String) obj, new DelimiterPair("{%", "%}")).a(launchTokenFinder, LaunchRuleTransformer.a());
            Intrinsics.g(strA, "template.render(tokenFin…mer.createTransforming())");
            return strA;
        }
        if (obj instanceof Map) {
            return c(EventDataUtils.a((Map) obj), launchTokenFinder);
        }
        if (!(obj instanceof List)) {
            return obj;
        }
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b(it.next(), launchTokenFinder));
        }
        return arrayList;
    }

    public static LinkedHashMap c(Map map, LaunchTokenFinder launchTokenFinder) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        LinkedHashMap linkedHashMapS = MapsKt.s(map);
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMapS.put((String) entry.getKey(), b(entry.getValue(), launchTokenFinder));
        }
        return linkedHashMapS;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x003b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x003b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x003b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ec A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.adobe.marketing.mobile.Event a(com.adobe.marketing.mobile.Event r17, java.util.ArrayList r18) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesConsequence.a(com.adobe.marketing.mobile.Event, java.util.ArrayList):com.adobe.marketing.mobile.Event");
    }
}
