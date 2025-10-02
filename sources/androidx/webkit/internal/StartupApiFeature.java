package androidx.webkit.internal;

import java.util.HashSet;

/* loaded from: classes2.dex */
public abstract class StartupApiFeature {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f3855a = new HashSet();

    public static class NoFramework extends StartupApiFeature {
    }

    public static class P extends StartupApiFeature {
    }

    public StartupApiFeature() {
        f3855a.add(this);
    }
}
