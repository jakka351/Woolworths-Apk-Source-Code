package dagger.hilt.android.internal.builders;

import android.app.Service;
import dagger.hilt.DefineComponent;
import dagger.hilt.android.components.ServiceComponent;

@DefineComponent.Builder
/* loaded from: classes7.dex */
public interface ServiceComponentBuilder {
    ServiceComponentBuilder a(Service service);

    ServiceComponent build();
}
