package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.collect.Ordering;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes6.dex */
final class FuturesGetChecked {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f14965a = 0;

    @VisibleForTesting
    public interface GetCheckedTypeValidator {
    }

    @VisibleForTesting
    public static class GetCheckedTypeValidatorHolder {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class WeakSetValidator implements GetCheckedTypeValidator {
            public static final /* synthetic */ WeakSetValidator[] d = {new WeakSetValidator("INSTANCE", 0)};

            /* JADX INFO: Fake field, exist only in values array */
            WeakSetValidator EF5;

            static {
                new CopyOnWriteArraySet();
            }

            public static WeakSetValidator valueOf(String str) {
                return (WeakSetValidator) Enum.valueOf(WeakSetValidator.class, str);
            }

            public static WeakSetValidator[] values() {
                return (WeakSetValidator[]) d.clone();
            }
        }

        static {
            int i = FuturesGetChecked.f14965a;
            WeakSetValidator[] weakSetValidatorArr = WeakSetValidator.d;
        }
    }

    static {
        final int i = 0;
        final int i2 = 1;
        Ordering.c().f(new Function() { // from class: com.google.common.util.concurrent.c
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                List list = (List) obj;
                switch (i) {
                    case 0:
                        int i3 = FuturesGetChecked.f14965a;
                        return Boolean.valueOf(list.contains(String.class));
                    default:
                        int i4 = FuturesGetChecked.f14965a;
                        return Boolean.valueOf(list.contains(Throwable.class));
                }
            }
        }).a(Ordering.c().f(new Function() { // from class: com.google.common.util.concurrent.c
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                List list = (List) obj;
                switch (i2) {
                    case 0:
                        int i3 = FuturesGetChecked.f14965a;
                        return Boolean.valueOf(list.contains(String.class));
                    default:
                        int i4 = FuturesGetChecked.f14965a;
                        return Boolean.valueOf(list.contains(Throwable.class));
                }
            }
        })).g().getClass();
    }
}
