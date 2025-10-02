package io.grpc;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.base.MoreObjects;

/* loaded from: classes7.dex */
public final class ServiceDescriptor {

    public static final class Builder {
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(null, AppMeasurementSdk.ConditionalUserProperty.NAME);
        toStringHelperB.c(null, "schemaDescriptor");
        toStringHelperB.c(null, "methods");
        toStringHelperB.d = true;
        return toStringHelperB.toString();
    }
}
