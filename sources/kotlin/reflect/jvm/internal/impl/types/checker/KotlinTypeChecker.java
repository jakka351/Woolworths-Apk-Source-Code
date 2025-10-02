package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;

/* loaded from: classes.dex */
public interface KotlinTypeChecker {

    /* renamed from: a, reason: collision with root package name */
    public static final NewKotlinTypeCheckerImpl f24623a;

    public interface TypeConstructorEquality {
        boolean a(TypeConstructor typeConstructor, TypeConstructor typeConstructor2);
    }

    static {
        NewKotlinTypeChecker.b.getClass();
        f24623a = NewKotlinTypeChecker.Companion.b;
    }

    boolean a(KotlinType kotlinType, KotlinType kotlinType2);
}
