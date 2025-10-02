package com.google.firebase.remoteconfig.internal;

import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class Personalization {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f15776a;
    public final Map b = Collections.synchronizedMap(new HashMap());

    public Personalization(Provider provider) {
        this.f15776a = provider;
    }
}
