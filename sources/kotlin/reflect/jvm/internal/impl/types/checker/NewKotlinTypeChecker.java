package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;

/* loaded from: classes.dex */
public interface NewKotlinTypeChecker extends KotlinTypeChecker {
    public static final Companion b = Companion.f24628a;

    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f24628a = new Companion();
        public static final NewKotlinTypeCheckerImpl b = new NewKotlinTypeCheckerImpl();
    }

    OverridingUtil b();

    KotlinTypeRefiner c();
}
