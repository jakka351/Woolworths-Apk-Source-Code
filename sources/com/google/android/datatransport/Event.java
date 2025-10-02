package com.google.android.datatransport;

import com.google.auto.value.AutoValue;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;

@AutoValue
/* loaded from: classes.dex */
public abstract class Event<T> {
    public static Event f(MessagingClientEventExtension messagingClientEventExtension, ProductData productData) {
        return new AutoValue_Event(messagingClientEventExtension, Priority.d, productData);
    }

    public static Event g(Object obj) {
        return new AutoValue_Event(obj, Priority.d, null);
    }

    public static Event h(Object obj) {
        return new AutoValue_Event(obj, Priority.e, null);
    }

    public static Event i(CrashlyticsReport crashlyticsReport) {
        return new AutoValue_Event(crashlyticsReport, Priority.f, null);
    }

    public abstract Integer a();

    public abstract EventContext b();

    public abstract Object c();

    public abstract Priority d();

    public abstract ProductData e();
}
