package com.salesforce.marketingcloud.internal;

import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.InitializationStatus;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@RestrictTo
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f16921a = new a(null);

    public static final class a {
        private a() {
        }

        @JvmStatic
        @NotNull
        public final InitializationStatus a() {
            return InitializationStatus.INSTANCE.a();
        }

        @JvmStatic
        @NotNull
        public final InitializationStatus.a b() {
            return InitializationStatus.INSTANCE.b();
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmStatic
    @NotNull
    public static final InitializationStatus a() {
        return f16921a.a();
    }

    @JvmStatic
    @NotNull
    public static final InitializationStatus.a b() {
        return f16921a.b();
    }
}
