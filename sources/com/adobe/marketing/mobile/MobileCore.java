package com.adobe.marketing.mobile;

import android.app.Application;
import com.adobe.marketing.mobile.internal.eventhub.EventHub;
import com.adobe.marketing.mobile.services.Log;
import com.adobe.marketing.mobile.services.ServiceProvider;
import com.adobe.marketing.mobile.services.internal.context.App;
import com.adobe.marketing.mobile.util.DataReader;
import kotlinx.coroutines.BuildersKt;

/* loaded from: classes.dex */
public final class MobileCore {

    /* renamed from: com.adobe.marketing.mobile.MobileCore$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass1 implements AdobeCallbackWithError<Event> {
        @Override // com.adobe.marketing.mobile.AdobeCallback, com.adobe.marketing.mobile.EventHistoryResultHandler
        public final void a(Object obj) {
            MobilePrivacyStatus.a(DataReader.f("global.privacy", null, ((Event) obj).e));
            throw null;
        }

        @Override // com.adobe.marketing.mobile.AdobeCallbackWithError
        public final void c(AdobeError adobeError) {
            throw null;
        }
    }

    /* renamed from: com.adobe.marketing.mobile.MobileCore$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass2 implements AdobeCallbackWithError<Event> {
        @Override // com.adobe.marketing.mobile.AdobeCallback, com.adobe.marketing.mobile.EventHistoryResultHandler
        public final void a(Object obj) {
            DataReader.f("config.allIdentifiers", "{}", ((Event) obj).e);
            throw null;
        }

        @Override // com.adobe.marketing.mobile.AdobeCallbackWithError
        public final void c(AdobeError adobeError) {
            throw null;
        }
    }

    public static void a(Event event) {
        if (event == null) {
            Log.b("MobileCore", "MobileCore", "Failed to dispatchEvent - event is null", new Object[0]);
        } else {
            EventHub eventHub = EventHub.m;
            EventHub.m.b(event);
        }
    }

    public static void b(Application application) {
        MobileCoreInitializer mobileCoreInitializer = MobileCoreInitializer.g;
        mobileCoreInitializer.getClass();
        if (!((Boolean) MobileCoreInitializer$Companion$isUserUnlocked$1.h.invoke(application)).booleanValue()) {
            Log.b("MobileCore", "MobileCoreInitializer", "setApplication failed - device is in direct boot mode, SDK will not be initialized.", new Object[0]);
            return;
        }
        if (mobileCoreInitializer.d.getAndSet(true)) {
            Log.a();
            return;
        }
        ServiceProvider.a().getClass();
        App.f13247a.b(application);
        App.e.f13248a.add(new LaunchInfoCollector());
        BuildersKt.c(mobileCoreInitializer.f13162a, null, null, new MobileCoreInitializer$setApplication$1(mobileCoreInitializer, null), 3);
    }
}
