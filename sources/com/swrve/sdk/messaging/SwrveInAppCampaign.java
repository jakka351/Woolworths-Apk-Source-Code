package com.swrve.sdk.messaging;

import YU.a;
import com.swrve.sdk.ISwrveCampaignManager;
import com.swrve.sdk.QaCampaignInfo;
import com.swrve.sdk.SwrveAssetsQueueItem;
import com.swrve.sdk.SwrveBase;
import com.swrve.sdk.SwrveCampaignDisplayer;
import com.swrve.sdk.SwrveHelper;
import com.swrve.sdk.SwrveLogger;
import com.swrve.sdk.SwrveTextTemplating;
import com.swrve.sdk.exceptions.SwrveSDKTextTemplatingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class SwrveInAppCampaign extends SwrveBaseCampaign {
    public final SwrveMessage o;

    public SwrveInAppCampaign(ISwrveCampaignManager iSwrveCampaignManager, SwrveCampaignDisplayer swrveCampaignDisplayer, JSONObject jSONObject, HashSet hashSet, HashMap map) {
        super(iSwrveCampaignManager, swrveCampaignDisplayer, jSONObject);
        if (jSONObject.has("message")) {
            SwrveMessage swrveMessage = new SwrveMessage(this, jSONObject.getJSONObject("message"), ((SwrveBase) iSwrveCampaignManager).l());
            this.o = swrveMessage;
            int i = this.c;
            ArrayList arrayList = swrveMessage.e;
            if (arrayList != null && arrayList.size() != 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((SwrveMessageFormat) it.next()).e.entrySet().iterator();
                    while (it2.hasNext()) {
                        SwrveMessagePage swrveMessagePage = (SwrveMessagePage) ((Map.Entry) it2.next()).getValue();
                        Iterator it3 = swrveMessagePage.f19101a.iterator();
                        while (it3.hasNext()) {
                            SwrveButton swrveButton = (SwrveButton) it3.next();
                            String str = swrveButton.w;
                            String str2 = swrveButton.d;
                            if (!SwrveHelper.p(str)) {
                                int i2 = this.c;
                                String str3 = swrveButton.w;
                                hashSet.add(new SwrveAssetsQueueItem(str3, str3, true, i2, false));
                            }
                            if (!SwrveHelper.p(str2)) {
                                try {
                                    String strA = SwrveTextTemplating.a(str2, map);
                                    hashSet.add(new SwrveAssetsQueueItem(SwrveHelper.u(strA.getBytes()), strA, true, this.c, true));
                                } catch (SwrveSDKTextTemplatingException e) {
                                    SwrveLogger.h("Campaign id:%s text templating could not be resolved for button dynamic image url. %s", Integer.valueOf(i), e.getMessage());
                                }
                            }
                            SwrveButtonTheme swrveButtonTheme = swrveButton.D;
                            if (swrveButtonTheme != null) {
                                String str4 = swrveButtonTheme.n;
                                String str5 = swrveButtonTheme.b;
                                if (SwrveHelper.o(str4)) {
                                    int i3 = this.c;
                                    String str6 = swrveButtonTheme.n;
                                    hashSet.add(new SwrveAssetsQueueItem(str6, str6, true, i3, false));
                                }
                                if (SwrveHelper.o(str5) && !SwrveTextUtils.c(str5)) {
                                    hashSet.add(new SwrveAssetsQueueItem(swrveButtonTheme.b, swrveButtonTheme.c, false, this.c, false));
                                }
                                SwrveButtonThemeState swrveButtonThemeState = swrveButtonTheme.p;
                                if (swrveButtonThemeState != null && SwrveHelper.o(swrveButtonThemeState.d)) {
                                    int i4 = this.c;
                                    String str7 = swrveButtonThemeState.d;
                                    hashSet.add(new SwrveAssetsQueueItem(str7, str7, true, i4, false));
                                }
                                SwrveButtonThemeState swrveButtonThemeState2 = swrveButtonTheme.q;
                                if (swrveButtonThemeState2 != null && SwrveHelper.o(swrveButtonThemeState2.d)) {
                                    int i5 = this.c;
                                    String str8 = swrveButtonThemeState2.d;
                                    hashSet.add(new SwrveAssetsQueueItem(str8, str8, true, i5, false));
                                }
                            }
                        }
                        Iterator it4 = swrveMessagePage.b.iterator();
                        while (it4.hasNext()) {
                            SwrveImage swrveImage = (SwrveImage) it4.next();
                            String str9 = swrveImage.u;
                            String str10 = swrveImage.j;
                            String str11 = swrveImage.d;
                            if (!SwrveHelper.p(str9)) {
                                int i6 = this.c;
                                String str12 = swrveImage.u;
                                hashSet.add(new SwrveAssetsQueueItem(str12, str12, true, i6, false));
                            }
                            if (!SwrveHelper.p(str11)) {
                                try {
                                    String strA2 = SwrveTextTemplating.a(str11, map);
                                    hashSet.add(new SwrveAssetsQueueItem(SwrveHelper.u(strA2.getBytes()), strA2, true, this.c, true));
                                } catch (SwrveSDKTextTemplatingException e2) {
                                    SwrveLogger.h("Campaign id:%s text templating could not be resolved for image dynamic image url. %s", Integer.valueOf(i), e2.getMessage());
                                }
                            }
                            if (swrveImage.f && SwrveHelper.o(str10) && SwrveHelper.o(swrveImage.k) && !SwrveTextUtils.c(str10)) {
                                hashSet.add(new SwrveAssetsQueueItem(swrveImage.j, swrveImage.k, false, this.c, false));
                            }
                        }
                    }
                }
            }
            SwrveMessageCenterDetails swrveMessageCenterDetails = this.o.c;
            if (swrveMessageCenterDetails == null) {
                return;
            }
            String str13 = swrveMessageCenterDetails.c;
            if (SwrveHelper.o(str13)) {
                try {
                    String strA3 = SwrveTextTemplating.a(str13, map);
                    hashSet.add(new SwrveAssetsQueueItem(SwrveHelper.u(strA3.getBytes()), strA3, true, this.c, true));
                } catch (SwrveSDKTextTemplatingException e3) {
                    SwrveLogger.h("Campaign id:%s text templating could not be resolved for message center image url. %s", Integer.valueOf(this.c), e3.getMessage());
                }
            }
            if (SwrveHelper.o(swrveMessageCenterDetails.e)) {
                int i7 = this.c;
                String str14 = swrveMessageCenterDetails.e;
                hashSet.add(new SwrveAssetsQueueItem(str14, str14, true, i7, false));
            }
        }
    }

    @Override // com.swrve.sdk.messaging.SwrveBaseCampaign
    public final boolean a(HashSet hashSet, HashMap map) {
        return this.o.e(map, hashSet);
    }

    @Override // com.swrve.sdk.messaging.SwrveBaseCampaign
    public final QaCampaignInfo.CAMPAIGN_TYPE c() {
        return QaCampaignInfo.CAMPAIGN_TYPE.d;
    }

    @Override // com.swrve.sdk.messaging.SwrveBaseCampaign
    public final boolean t(SwrveOrientation swrveOrientation) {
        return this.o.d(swrveOrientation);
    }

    public final SwrveMessage u() {
        return this.o;
    }

    public final SwrveMessage v(String str, Map map, Date date, HashMap map2, HashMap map3) {
        SwrveMessage swrveMessage = this.o;
        if (this.b.h(this, str, map, date, map2, swrveMessage == null ? 0 : 1)) {
            int i = this.c;
            SwrveLogger.e("%s matches a trigger in %s", str, Integer.valueOf(i));
            if (swrveMessage != null && swrveMessage.e(map3, this.f19089a.H())) {
                return swrveMessage;
            }
            String strE = a.e(i, "Campaign ", " hasn't finished downloading.");
            map2.put(Integer.valueOf(i), new QaCampaignInfo(i, x(), QaCampaignInfo.CAMPAIGN_TYPE.d, false, strE));
            SwrveLogger.e(strE, new Object[0]);
        }
        return null;
    }

    public final SwrveMessage w(int i) {
        SwrveMessage swrveMessage = this.o;
        if (swrveMessage == null) {
            SwrveLogger.e("No messages in campaign %s", Integer.valueOf(this.c));
            return null;
        }
        if (swrveMessage.f19098a == i) {
            return swrveMessage;
        }
        return null;
    }

    public final int x() {
        SwrveMessage swrveMessage = this.o;
        if (swrveMessage != null) {
            return swrveMessage.f19098a;
        }
        return -1;
    }
}
