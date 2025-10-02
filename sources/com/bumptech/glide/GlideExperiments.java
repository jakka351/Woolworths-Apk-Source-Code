package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class GlideExperiments {

    /* renamed from: a, reason: collision with root package name */
    public final Map f13759a;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f13760a = new HashMap();
    }

    public interface Experiment {
    }

    public GlideExperiments(Builder builder) {
        this.f13759a = Collections.unmodifiableMap(new HashMap(builder.f13760a));
    }
}
