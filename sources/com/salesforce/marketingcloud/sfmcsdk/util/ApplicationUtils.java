package com.salesforce.marketingcloud.sfmcsdk.util;

import android.content.Context;
import com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\tH\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/util/ApplicationUtils;", "", "()V", "TAG", "", "findBuildConfig", "packageName", "getApplicationName", "context", "Landroid/content/Context;", "getApplicationVersion", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ApplicationUtils {

    @NotNull
    public static final ApplicationUtils INSTANCE = new ApplicationUtils();

    @NotNull
    public static final String TAG = "~$ApplicationUtils";

    private ApplicationUtils() {
    }

    private final String findBuildConfig(String packageName) throws ClassNotFoundException {
        try {
            Class.forName(packageName + ".BuildConfig");
            return packageName;
        } catch (Exception unused) {
            if (StringsKt.F(0, 6, packageName, ".") <= 0) {
                return null;
            }
            String strSubstring = packageName.substring(0, StringsKt.F(0, 6, packageName, "."));
            Intrinsics.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return findBuildConfig(strSubstring);
        }
    }

    @JvmStatic
    @Nullable
    public static final String getApplicationName(@NotNull Context context) {
        Intrinsics.h(context, "context");
        try {
            return context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
        } catch (Exception e) {
            SFMCSdkLogger.INSTANCE.e(TAG, e, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.util.ApplicationUtils.getApplicationName.1
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Failed to get appName from the packageManager.";
                }
            });
            return null;
        }
    }

    @JvmStatic
    @Nullable
    public static final String getApplicationVersion(@NotNull Context context) {
        Intrinsics.h(context, "context");
        try {
            try {
                ApplicationUtils applicationUtils = INSTANCE;
                String packageName = context.getPackageName();
                Intrinsics.g(packageName, "context.packageName");
                Field field = Class.forName(applicationUtils.findBuildConfig(packageName) + ".BuildConfig").getField("VERSION_NAME");
                Intrinsics.g(field, "clazz.getField(\"VERSION_NAME\")");
                field.setAccessible(true);
                Object obj = field.get(null);
                if (obj != null) {
                    return (String) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            } catch (Throwable unused) {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            }
        } catch (Exception e) {
            SFMCSdkLogger.INSTANCE.w(TAG, e, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.util.ApplicationUtils.getApplicationVersion.1
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Failed to get VERSION_NAME from the application's BuildConfig.";
                }
            });
            return null;
        }
    }
}
