package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.annotation.RequiresApi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.RequiresOptIn;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/core/os/BuildCompat;", "", "Api30Impl", "PrereleaseSdkCheck", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BuildCompat {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2439a = 0;

    @RequiresApi
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/core/os/BuildCompat$Api30Impl;", "", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api30Impl {
        public static void a(int i) {
            SdkExtensions.getExtensionVersion(i);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/core/os/BuildCompat$PrereleaseSdkCheck;", "", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RequiresOptIn
    @Retention(RetentionPolicy.CLASS)
    @kotlin.annotation.Retention
    public @interface PrereleaseSdkCheck {
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            Api30Impl.a(30);
        }
        if (i >= 30) {
            Api30Impl.a(31);
        }
        if (i >= 30) {
            Api30Impl.a(33);
        }
        if (i >= 30) {
            Api30Impl.a(1000000);
        }
    }

    public static final boolean a(String str) {
        String buildCodename = Build.VERSION.CODENAME;
        Intrinsics.h(buildCodename, "buildCodename");
        if (!"REL".equals(buildCodename)) {
            Locale locale = Locale.ROOT;
            String upperCase = buildCodename.toUpperCase(locale);
            Intrinsics.g(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            Integer num = upperCase.equals("BAKLAVA") ? num : null;
            String upperCase2 = str.toUpperCase(locale);
            Intrinsics.g(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            num = upperCase2.equals("BAKLAVA") ? 0 : null;
            if (num == null || num == null) {
                if (num == null && num == null) {
                    String upperCase3 = buildCodename.toUpperCase(locale);
                    Intrinsics.g(upperCase3, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    String upperCase4 = str.toUpperCase(locale);
                    Intrinsics.g(upperCase4, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    if (upperCase3.compareTo(upperCase4) >= 0) {
                        return true;
                    }
                } else if (num != null) {
                    return true;
                }
            } else if (num.intValue() >= num.intValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            return true;
        }
        if (i < 34) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        Intrinsics.g(CODENAME, "CODENAME");
        return a("VanillaIceCream");
    }
}
