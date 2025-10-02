package com.swrve.sdk;

import com.swrve.sdk.exceptions.SwrveSDKTextTemplatingException;
import com.swrve.sdk.messaging.SwrveActionType;
import com.swrve.sdk.messaging.SwrveButton;
import com.swrve.sdk.messaging.SwrveImage;
import com.swrve.sdk.messaging.SwrveMessage;
import com.swrve.sdk.messaging.SwrveMessageCenterDetails;
import com.swrve.sdk.messaging.SwrveMessageFormat;
import com.swrve.sdk.messaging.SwrveMessagePage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
class SwrveMessageTextTemplatingChecks {
    public static boolean a(SwrveMessage swrveMessage, HashMap map) {
        try {
            SwrveMessageCenterDetails swrveMessageCenterDetails = swrveMessage.c;
            if (swrveMessageCenterDetails != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(swrveMessageCenterDetails.f19099a);
                arrayList.add(swrveMessageCenterDetails.b);
                arrayList.add(swrveMessageCenterDetails.d);
                arrayList.add(swrveMessageCenterDetails.c);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (!SwrveHelper.p(str)) {
                        String strA = SwrveTextTemplating.a(str, map);
                        if (SwrveHelper.p(strA)) {
                            SwrveLogger.e("Text template could not be resolved: " + str + " in given properties.", new Object[0]);
                            return false;
                        }
                        if (strA == null ? false : SwrveTextTemplating.f19076a.matcher(strA).find()) {
                            SwrveLogger.e("Not showing campaign with personalization outside of Message Center / without personalization info provided.", new Object[0]);
                            return false;
                        }
                    }
                }
            }
            Iterator it2 = swrveMessage.e.iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((SwrveMessageFormat) it2.next()).e.entrySet().iterator();
                while (it3.hasNext()) {
                    SwrveMessagePage swrveMessagePage = (SwrveMessagePage) ((Map.Entry) it3.next()).getValue();
                    Iterator it4 = swrveMessagePage.b.iterator();
                    while (it4.hasNext()) {
                        String strF = ((SwrveImage) it4.next()).f();
                        if (!SwrveHelper.p(strF)) {
                            String strA2 = SwrveTextTemplating.a(strF, map);
                            if (SwrveHelper.p(strA2)) {
                                SwrveLogger.e("Text template could not be resolved: " + strF + " in given properties.", new Object[0]);
                                return false;
                            }
                            if (strA2 == null ? false : SwrveTextTemplating.f19076a.matcher(strA2).find()) {
                                SwrveLogger.e("Not showing campaign with personalization outside of Message Center / without personalization info provided.", new Object[0]);
                                return false;
                            }
                        }
                    }
                    Iterator it5 = swrveMessagePage.f19101a.iterator();
                    while (it5.hasNext()) {
                        SwrveButton swrveButton = (SwrveButton) it5.next();
                        String strF2 = swrveButton.f();
                        String str2 = swrveButton.x;
                        if (!SwrveHelper.p(strF2)) {
                            String strA3 = SwrveTextTemplating.a(strF2, map);
                            if (SwrveHelper.p(strA3)) {
                                SwrveLogger.e("Text template could not be resolved: " + strF2 + " in given properties.", new Object[0]);
                                return false;
                            }
                            if (strA3 == null ? false : SwrveTextTemplating.f19076a.matcher(strA3).find()) {
                                SwrveLogger.e("Not showing campaign with personalization outside of Message Center / without personalization info provided.", new Object[0]);
                                return false;
                            }
                        }
                        SwrveActionType swrveActionType = swrveButton.z;
                        if (swrveActionType == SwrveActionType.e || swrveActionType == SwrveActionType.g) {
                            if (SwrveHelper.p(str2)) {
                                continue;
                            } else {
                                String strA4 = SwrveTextTemplating.a(str2, map);
                                if (SwrveHelper.p(strA4)) {
                                    SwrveLogger.e("Button action template could not be resolved: " + str2 + " in given properties.", new Object[0]);
                                    return false;
                                }
                                if (strA4 == null ? false : SwrveTextTemplating.f19076a.matcher(strA4).find()) {
                                    SwrveLogger.e("Not showing campaign with personalization outside of Message Center / without personalization info provided.", new Object[0]);
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            return true;
        } catch (SwrveSDKTextTemplatingException e) {
            SwrveLogger.c("Not showing campaign, error with personalization", e, new Object[0]);
            return false;
        }
    }
}
