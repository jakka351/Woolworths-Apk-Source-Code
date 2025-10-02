package com.swrve.sdk;

import com.swrve.sdk.QaCampaignInfo;
import com.swrve.sdk.SwrveUtils;
import com.swrve.sdk.messaging.SwrveBaseCampaign;
import com.swrve.sdk.messaging.SwrveInAppCampaign;
import com.swrve.sdk.messaging.model.Trigger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/swrve/sdk/SwrveCampaignDisplayer;", "", "SwrveSDK_firebaseRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SwrveCampaignDisplayer {

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f19045a;
    public final SimpleDateFormat b;
    public Date c;
    public Date d;
    public int e;
    public long f;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[SwrveBaseCampaign.SwrveTimezoneType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public SwrveCampaignDisplayer() {
        Locale locale = Locale.US;
        this.f19045a = new SimpleDateFormat("HH:mm:ss ZZZZ", locale);
        this.b = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z", locale);
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x058c, code lost:
    
        r1 = true;
        r4 = r18;
        f(r21, true, r24, r22, r4, r5);
        r3 = r21;
        r7 = r24;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x025f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(com.swrve.sdk.messaging.SwrveBaseCampaign r21, java.lang.String r22, java.util.Map r23, java.util.HashMap r24) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 2497
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swrve.sdk.SwrveCampaignDisplayer.a(com.swrve.sdk.messaging.SwrveBaseCampaign, java.lang.String, java.util.Map, java.util.HashMap):boolean");
    }

    public static int c(String str) throws NumberFormatException {
        List listT = StringsKt.T(str, new String[]{":"}, 6);
        return YU.a.C(Integer.parseInt((String) listT.get(1)), 60, Integer.parseInt((String) listT.get(0)) * 3600, Integer.parseInt((String) listT.get(2)));
    }

    public static void e(SwrveBaseCampaign swrveBaseCampaign, String str, boolean z, HashMap map) {
        String str2;
        if (QaUser.l() && swrveBaseCampaign != null && (swrveBaseCampaign instanceof SwrveInAppCampaign)) {
            str2 = str;
            map.put(Integer.valueOf(((SwrveInAppCampaign) swrveBaseCampaign).e()), new QaCampaignInfo(r10.e(), r10.x(), QaCampaignInfo.CAMPAIGN_TYPE.d, z, str2));
        } else {
            str2 = str;
        }
        SwrveLogger.e(str2, new Object[0]);
        QaUser.l();
    }

    public static void f(SwrveBaseCampaign swrveBaseCampaign, boolean z, HashMap map, String str, Trigger trigger, Map map2) {
        String str2;
        if (z) {
            str2 = "Campaign [" + swrveBaseCampaign.e() + "], Trigger [" + trigger + "], matches eventName[" + str + "] & payload[" + map2 + "].";
        } else {
            str2 = "Campaign [" + swrveBaseCampaign.e() + "], Trigger [" + trigger + "], does not match eventName[" + str + "] & payload[" + map2 + "]. Skipping this trigger.";
        }
        e(swrveBaseCampaign, str2, z, map);
    }

    public static void g(String str, String str2, Map map) {
        SwrveLogger.e("Not showing message for %s: %s", str, str2);
        try {
            QaUser.j().d(str, str2, map);
        } catch (Exception e) {
            SwrveLogger.c("Error trying to queue campaign-triggered qalogevent.", e, new Object[0]);
        }
    }

    public final String b(Date date, SwrveBaseCampaign.SwrveTimezoneType swrveTimezoneType) {
        TimeZone timeZone;
        int iOrdinal = swrveTimezoneType.ordinal();
        if (iOrdinal == 0) {
            timeZone = TimeZone.getTimeZone("UTC");
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            timeZone = TimeZone.getDefault();
        }
        SimpleDateFormat simpleDateFormat = this.b;
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTime(date);
        String str = simpleDateFormat.format(calendar.getTime());
        Intrinsics.g(str, "format(...)");
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(SwrveBaseCampaign swrveBaseCampaign, Date now, HashMap map) throws NumberFormatException {
        TimeZone timeZone;
        Intrinsics.h(now, "now");
        SwrveBaseCampaign.SwrveTimezoneType swrveTimezoneTypeL = swrveBaseCampaign.l();
        if (swrveTimezoneTypeL == null) {
            return false;
        }
        Date dateJ = swrveBaseCampaign.j();
        if (dateJ.after(now)) {
            e(swrveBaseCampaign, "Campaign " + swrveBaseCampaign.e() + " has not started yet. Start:" + b(dateJ, swrveTimezoneTypeL) + " TimezoneType:" + swrveTimezoneTypeL + " Now:" + b(now, swrveTimezoneTypeL), false, map);
            return false;
        }
        Date dateD = swrveBaseCampaign.d();
        if (dateD.before(now)) {
            e(swrveBaseCampaign, "Campaign " + swrveBaseCampaign.e() + " has finished. End:" + b(dateD, swrveTimezoneTypeL) + " TimezoneType:" + swrveTimezoneTypeL + " Now:" + b(now, swrveTimezoneTypeL), false, map);
            return false;
        }
        ArrayList arrayListB = swrveBaseCampaign.b();
        if (arrayListB != null) {
            Iterator it = arrayListB.iterator();
            while (it.hasNext()) {
                SwrveBaseCampaign.SwrveBlackoutDate swrveBlackoutDate = (SwrveBaseCampaign.SwrveBlackoutDate) it.next();
                String from = swrveBlackoutDate.f19090a;
                Intrinsics.g(from, "from");
                Date dateA = SwrveUtils.Companion.a(from, swrveTimezoneTypeL);
                String to = swrveBlackoutDate.b;
                Intrinsics.g(to, "to");
                Date dateA2 = SwrveUtils.Companion.a(to, swrveTimezoneTypeL);
                if (now.after(dateA) && now.before(dateA2)) {
                    e(swrveBaseCampaign, "Campaign " + swrveBaseCampaign.e() + " is in blackout period. Blackout from:" + b(dateA, swrveTimezoneTypeL) + " to:" + b(dateA2, swrveTimezoneTypeL) + " TimezoneType:" + swrveTimezoneTypeL + " Now:" + b(now, swrveTimezoneTypeL), false, map);
                    return false;
                }
            }
        }
        SwrveBaseCampaign.SwrveTimezoneType swrveTimezoneTypeL2 = swrveBaseCampaign.l();
        if (swrveTimezoneTypeL2 != null) {
            ArrayList arrayListF = swrveBaseCampaign.f();
            int i = 1;
            if (arrayListF == null || arrayListF.isEmpty()) {
                return true;
            }
            Iterator it2 = arrayListF.iterator();
            while (it2.hasNext()) {
                SwrveBaseCampaign.SwrveIntervalTime swrveIntervalTime = (SwrveBaseCampaign.SwrveIntervalTime) it2.next();
                String from2 = swrveIntervalTime.f19091a;
                Intrinsics.g(from2, "from");
                int iC = c(from2);
                String to2 = swrveIntervalTime.b;
                Intrinsics.g(to2, "to");
                int iC2 = c(to2);
                int iOrdinal = swrveTimezoneTypeL2.ordinal();
                if (iOrdinal == 0) {
                    timeZone = TimeZone.getTimeZone("UTC");
                } else {
                    if (iOrdinal != i) {
                        throw new NoWhenBranchMatchedException();
                    }
                    timeZone = TimeZone.getDefault();
                }
                Calendar calendar = Calendar.getInstance(timeZone);
                calendar.setTime(now);
                boolean z = i;
                int i2 = calendar.get(13) + (calendar.get(12) * 60) + (calendar.get(11) * 3600);
                if (iC <= i2 && i2 <= iC2) {
                    return z;
                }
                i = z ? 1 : 0;
            }
        }
        e(swrveBaseCampaign, "Campaign " + swrveBaseCampaign.e() + " is outside active interval time. TimezoneType:" + swrveTimezoneTypeL + " Now:" + b(now, swrveTimezoneTypeL), false, map);
        return false;
    }

    public final boolean h(SwrveBaseCampaign swrveBaseCampaign, String event, Map map, Date date, HashMap map2, int i) {
        Intrinsics.h(event, "event");
        if (a(swrveBaseCampaign, event, map, map2)) {
            if (i == 0) {
                e(swrveBaseCampaign, "No campaign variants for campaign id:" + swrveBaseCampaign.e(), false, map2);
                return false;
            }
            if (d(swrveBaseCampaign, date, map2)) {
                if (swrveBaseCampaign.h().a() >= swrveBaseCampaign.g()) {
                    e(swrveBaseCampaign, "{Campaign throttle limit} Campaign " + swrveBaseCampaign.e() + " has been shown " + swrveBaseCampaign.g() + " times already", false, map2);
                    return false;
                }
                boolean zEqualsIgnoreCase = event.equalsIgnoreCase("Swrve.Messages.showAtSessionStart");
                SimpleDateFormat simpleDateFormat = this.f19045a;
                if (!zEqualsIgnoreCase && date.before(swrveBaseCampaign.i())) {
                    e(swrveBaseCampaign, "{Campaign throttle limit} Too soon after launch. Wait until " + simpleDateFormat.format(swrveBaseCampaign.i()), false, map2);
                    return false;
                }
                Date date2 = swrveBaseCampaign.h().c;
                if (date2 == null || !date.before(date2)) {
                    return true;
                }
                e(swrveBaseCampaign, "{Campaign throttle limit} Too soon after last campaign. Wait until " + simpleDateFormat.format(swrveBaseCampaign.h().c), false, map2);
                return false;
            }
        }
        return false;
    }
}
