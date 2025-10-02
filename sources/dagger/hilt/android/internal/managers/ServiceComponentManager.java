package dagger.hilt.android.internal.managers;

import android.app.Application;
import android.app.Service;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.Preconditions;

/* loaded from: classes7.dex */
public final class ServiceComponentManager implements GeneratedComponentManager<Object> {
    public final Service d;
    public ServiceComponent e;

    @EntryPoint
    @InstallIn
    /* loaded from: classes.dex */
    public interface ServiceComponentBuilderEntryPoint {
        ServiceComponentBuilder a();
    }

    public ServiceComponentManager(Service service) {
        this.d = service;
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object t3() {
        if (this.e == null) {
            Service service = this.d;
            Application application = service.getApplication();
            Preconditions.a(application instanceof GeneratedComponentManager, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
            ServiceComponentBuilder serviceComponentBuilderA = ((ServiceComponentBuilderEntryPoint) EntryPoints.a(ServiceComponentBuilderEntryPoint.class, application)).a();
            serviceComponentBuilderA.a(service);
            this.e = serviceComponentBuilderA.build();
        }
        return this.e;
    }
}
