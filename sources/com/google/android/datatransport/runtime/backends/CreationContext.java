package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
public abstract class CreationContext {
    public abstract Context a();

    public abstract String b();

    public abstract Clock c();

    public abstract Clock d();
}
