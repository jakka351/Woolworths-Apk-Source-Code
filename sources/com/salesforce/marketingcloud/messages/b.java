package com.salesforce.marketingcloud.messages;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.internal.f;
import com.salesforce.marketingcloud.storage.k;
import java.util.Date;

@SuppressLint
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16986a = d.C;

    private b() {
    }

    @RestrictTo
    public static boolean a(Message message) {
        Date dateEndDateUtc = message.endDateUtc();
        return dateEndDateUtc == null || dateEndDateUtc.getTime() >= System.currentTimeMillis();
    }

    private static int b(Message message) {
        int iMessagesPerPeriod = message.messagesPerPeriod();
        if (iMessagesPerPeriod > 0 || message.numberOfPeriods() <= 0 || message.periodType() == 0) {
            return iMessagesPerPeriod;
        }
        return 1;
    }

    public static boolean c(Message message) {
        try {
            if (TextUtils.isEmpty(message.alert().trim())) {
                g.a(f16986a, "Message (%s) was tripped, but does not have an alert message", message.id());
                return false;
            }
            Date date = new Date();
            if (message.endDateUtc() != null && message.endDateUtc().before(date)) {
                g.a(f16986a, "Message (%s) was tripped, but has expired.", message.id());
                return false;
            }
            if (message.startDateUtc() != null && message.startDateUtc().after(date)) {
                g.a(f16986a, "Message (%s) was tripped, but has not started", message.id());
                return false;
            }
            if (message.messageLimit() > -1 && f.e(message) >= message.messageLimit()) {
                g.a(f16986a, "Message (%s) was tripped, but has met its message limit.", message.id());
                return false;
            }
            int iB = b(message);
            if (iB > -1 && f.d(message) >= iB && f.b(message) != null && date.before(f.b(message))) {
                g.a(f16986a, "Message (%s) was tripped, but has met its message per period limit", message.id());
                return false;
            }
            if (f.b(message) == null || !date.before(f.b(message))) {
                return true;
            }
            g.a(f16986a, "Message (%s) was tripped, but was before its next allowed show time.", message.id());
            return false;
        } catch (Exception e) {
            g.b(f16986a, e, "Failed to determine is message should be shown.", new Object[0]);
            return false;
        }
    }

    @RestrictTo
    public static void a(Message message, k kVar, com.salesforce.marketingcloud.util.c cVar) {
        Message messageA = kVar.a(message.id(), cVar);
        if (messageA != null) {
            f.a(message, f.a(messageA));
            f.c(message, f.e(messageA));
            if (message.periodType() == messageA.periodType()) {
                f.b(message, f.d(messageA));
                f.b(message, f.b(messageA));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(com.salesforce.marketingcloud.messages.Message r18, com.salesforce.marketingcloud.storage.j r19) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.messages.b.a(com.salesforce.marketingcloud.messages.Message, com.salesforce.marketingcloud.storage.j):void");
    }
}
