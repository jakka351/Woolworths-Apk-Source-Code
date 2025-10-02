package com.adobe.marketing.mobile.internal.eventhub.history;

import com.adobe.marketing.mobile.EventHistoryResultHandler;
import com.adobe.marketing.mobile.services.Log;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/adobe/marketing/mobile/internal/eventhub/history/AndroidEventHistory;", "Lcom/adobe/marketing/mobile/internal/eventhub/history/EventHistory;", "Companion", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidEventHistory implements EventHistory {

    /* renamed from: a, reason: collision with root package name */
    public final AndroidEventHistoryDatabase f13190a = new AndroidEventHistoryDatabase();
    public final Lazy b = LazyKt.b(AndroidEventHistory$executor$2.h);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/adobe/marketing/mobile/internal/eventhub/history/AndroidEventHistory$Companion;", "", "", "LOG_TAG", "Ljava/lang/String;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }

    public static void a(EventHistoryResultHandler eventHistoryResultHandler, Object obj) {
        try {
            eventHistoryResultHandler.a(obj);
        } catch (Exception e) {
            e.toString();
            Log.a();
        }
    }
}
