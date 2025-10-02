package com.airbnb.deeplinkdispatch.handler;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.MustBeDocumented;

@Target({ElementType.PARAMETER})
@kotlin.annotation.Target
@Retention(RetentionPolicy.RUNTIME)
@kotlin.annotation.Retention
@MustBeDocumented
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/airbnb/deeplinkdispatch/handler/DeeplinkParam;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lcom/airbnb/deeplinkdispatch/handler/DeepLinkParamType;", "type", "<init>", "(Ljava/lang/String;Lcom/airbnb/deeplinkdispatch/handler/DeepLinkParamType;)V", "deeplinkdispatch-base"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Documented
/* loaded from: classes4.dex */
public @interface DeeplinkParam {
    String name();

    DeepLinkParamType type();
}
