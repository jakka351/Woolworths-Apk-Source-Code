package com.adobe.marketing.mobile.services;

import com.adobe.marketing.mobile.services.internal.caching.FileCacheService;
import com.adobe.marketing.mobile.services.ui.AEPUIService;

/* loaded from: classes.dex */
public class ServiceProvider {

    /* renamed from: a, reason: collision with root package name */
    public DeviceInfoService f13238a;
    public NetworkService b;
    public DataQueuing c;
    public DataStoring d;
    public Logging e;
    public FileCacheService f;

    public static class ServiceProviderSingleton {

        /* renamed from: a, reason: collision with root package name */
        public static final ServiceProvider f13239a;

        static {
            ServiceProvider serviceProvider = new ServiceProvider();
            serviceProvider.b = new NetworkService();
            serviceProvider.f13238a = new DeviceInfoService();
            serviceProvider.c = new DataQueueService();
            serviceProvider.d = new LocalDataStoreService();
            new AEPUIService();
            serviceProvider.e = new AndroidLoggingService();
            serviceProvider.f = new FileCacheService();
            f13239a = serviceProvider;
        }
    }

    public static ServiceProvider a() {
        return ServiceProviderSingleton.f13239a;
    }
}
