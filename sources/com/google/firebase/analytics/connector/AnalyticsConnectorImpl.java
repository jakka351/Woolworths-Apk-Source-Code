package com.google.firebase.analytics.connector;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjh;
import com.google.android.gms.measurement.internal.zzlt;
import com.google.common.collect.ImmutableSet;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.analytics.connector.internal.zzc;
import com.google.firebase.analytics.connector.internal.zze;
import com.google.firebase.analytics.connector.internal.zzg;
import com.google.firebase.events.Subscriber;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class AnalyticsConnectorImpl implements AnalyticsConnector {
    public static volatile AnalyticsConnectorImpl c;

    /* renamed from: a, reason: collision with root package name */
    public final AppMeasurementSdk f15182a;
    public final ConcurrentHashMap b;

    /* renamed from: com.google.firebase.analytics.connector.AnalyticsConnectorImpl$1, reason: invalid class name */
    class AnonymousClass1 implements AnalyticsConnector.AnalyticsConnectorHandle {
    }

    public AnalyticsConnectorImpl(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.f15182a = appMeasurementSdk;
        this.b = new ConcurrentHashMap();
    }

    public static AnalyticsConnector i(FirebaseApp firebaseApp, Context context, Subscriber subscriber) {
        Preconditions.checkNotNull(firebaseApp);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(subscriber);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (c == null) {
            synchronized (AnalyticsConnectorImpl.class) {
                try {
                    if (c == null) {
                        Bundle bundle = new Bundle(1);
                        firebaseApp.a();
                        if ("[DEFAULT]".equals(firebaseApp.b)) {
                            subscriber.b(zzb.d, zza.f15188a);
                            bundle.putBoolean("dataCollectionDefaultEnabled", firebaseApp.j());
                        }
                        c = new AnalyticsConnectorImpl(zzfb.zza(context, bundle).zzb());
                    }
                } finally {
                }
            }
        }
        return c;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public final void a(String str, String str2, Bundle bundle) {
        if (zzc.a(str) && zzc.b(bundle, str2) && zzc.d(bundle, str, str2)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong(NotificationMessage.NOTIF_KEY_REQUEST_ID, 1L);
            }
            this.f15182a.logEvent(str, str2, bundle);
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public final void b(String str) {
        if (zzc.a(AppMeasurement.FCM_ORIGIN) && zzc.c(AppMeasurement.FCM_ORIGIN, "_ln")) {
            this.f15182a.setUserProperty(AppMeasurement.FCM_ORIGIN, "_ln", str);
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public final AnalyticsConnector.AnalyticsConnectorHandle c(String str, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        Preconditions.checkNotNull(analyticsConnectorListener);
        if (zzc.a(str)) {
            boolean zIsEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.b;
            if (zIsEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean zEquals = AppMeasurement.FIAM_ORIGIN.equals(str);
                AppMeasurementSdk appMeasurementSdk = this.f15182a;
                com.google.firebase.analytics.connector.internal.zza zzeVar = zEquals ? new zze(appMeasurementSdk, analyticsConnectorListener) : "clx".equals(str) ? new zzg(appMeasurementSdk, analyticsConnectorListener) : null;
                if (zzeVar != null) {
                    concurrentHashMap.put(str, zzeVar);
                    return new AnonymousClass1();
                }
            }
        }
        return null;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public final void d(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        ImmutableSet immutableSet = zzc.f15183a;
        String str = conditionalUserProperty.f15181a;
        if (str == null || str.isEmpty()) {
            return;
        }
        Object obj = conditionalUserProperty.c;
        if ((obj == null || zzlt.zzb(obj) != null) && zzc.a(str) && zzc.c(str, conditionalUserProperty.b)) {
            String str2 = conditionalUserProperty.k;
            if (str2 != null) {
                if (!zzc.b(conditionalUserProperty.l, str2)) {
                    return;
                }
                if (!zzc.d(conditionalUserProperty.l, str, conditionalUserProperty.k)) {
                    return;
                }
            }
            String str3 = conditionalUserProperty.h;
            if (str3 != null) {
                if (!zzc.b(conditionalUserProperty.i, str3)) {
                    return;
                }
                if (!zzc.d(conditionalUserProperty.i, str, conditionalUserProperty.h)) {
                    return;
                }
            }
            String str4 = conditionalUserProperty.f;
            if (str4 != null) {
                if (!zzc.b(conditionalUserProperty.g, str4)) {
                    return;
                }
                if (!zzc.d(conditionalUserProperty.g, str, conditionalUserProperty.f)) {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            String str5 = conditionalUserProperty.f15181a;
            if (str5 != null) {
                bundle.putString("origin", str5);
            }
            String str6 = conditionalUserProperty.b;
            if (str6 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, str6);
            }
            Object obj2 = conditionalUserProperty.c;
            if (obj2 != null) {
                zzjh.zza(bundle, obj2);
            }
            String str7 = conditionalUserProperty.d;
            if (str7 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str7);
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, conditionalUserProperty.e);
            String str8 = conditionalUserProperty.f;
            if (str8 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, str8);
            }
            Bundle bundle2 = conditionalUserProperty.g;
            if (bundle2 != null) {
                bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, bundle2);
            }
            String str9 = conditionalUserProperty.h;
            if (str9 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, str9);
            }
            Bundle bundle3 = conditionalUserProperty.i;
            if (bundle3 != null) {
                bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, bundle3);
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, conditionalUserProperty.j);
            String str10 = conditionalUserProperty.k;
            if (str10 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str10);
            }
            Bundle bundle4 = conditionalUserProperty.l;
            if (bundle4 != null) {
                bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle4);
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, conditionalUserProperty.m);
            bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, conditionalUserProperty.n);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, conditionalUserProperty.o);
            this.f15182a.setConditionalUserProperty(bundle);
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.f15182a.getConditionalUserProperties("frc", "")) {
            ImmutableSet immutableSet = zzc.f15183a;
            Preconditions.checkNotNull(bundle);
            AnalyticsConnector.ConditionalUserProperty conditionalUserProperty = new AnalyticsConnector.ConditionalUserProperty();
            conditionalUserProperty.f15181a = (String) Preconditions.checkNotNull((String) zzjh.zzb(bundle, "origin", String.class, null));
            conditionalUserProperty.b = (String) Preconditions.checkNotNull((String) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.NAME, String.class, null));
            conditionalUserProperty.c = zzjh.zzb(bundle, "value", Object.class, null);
            conditionalUserProperty.d = (String) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
            conditionalUserProperty.e = ((Long) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L)).longValue();
            conditionalUserProperty.f = (String) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
            conditionalUserProperty.g = (Bundle) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
            conditionalUserProperty.h = (String) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
            conditionalUserProperty.i = (Bundle) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
            conditionalUserProperty.j = ((Long) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L)).longValue();
            conditionalUserProperty.k = (String) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
            conditionalUserProperty.l = (Bundle) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
            conditionalUserProperty.n = ((Boolean) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            conditionalUserProperty.m = ((Long) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.class, 0L)).longValue();
            conditionalUserProperty.o = ((Long) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.class, 0L)).longValue();
            arrayList.add(conditionalUserProperty);
        }
        return arrayList;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public final void f(String str) {
        this.f15182a.clearConditionalUserProperty(str, null, null);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public final Map g(boolean z) {
        return this.f15182a.getUserProperties(null, null, z);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public final int h() {
        return this.f15182a.getMaxUserProperties("frc");
    }
}
