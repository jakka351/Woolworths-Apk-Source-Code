package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
abstract class SendRequest {

    @AutoValue.Builder
    public static abstract class Builder {
    }

    public abstract Encoding a();

    public abstract Event b();

    public abstract Transformer c();

    public abstract TransportContext d();

    public abstract String e();
}
