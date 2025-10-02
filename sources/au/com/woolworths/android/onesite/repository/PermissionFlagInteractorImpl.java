package au.com.woolworths.android.onesite.repository;

import android.content.SharedPreferences;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/repository/PermissionFlagInteractorImpl;", "Lau/com/woolworths/android/onesite/repository/PermissionFlagInteractor;", "Companion", "base-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class PermissionFlagInteractorImpl implements PermissionFlagInteractor {
    public static final String[] b = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f4587a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/android/onesite/repository/PermissionFlagInteractorImpl$Companion;", "", "", "LEGACY_NEVER_ASK_AGAIN_CAMERA_PERMISSION_KEY", "Ljava/lang/String;", "LEGACY_NEVER_ASK_AGAIN_LOCATION_PERMISSION_KEY", "PERMISSION_KEY_PREFIX", "", "locationPermissions", "[Ljava/lang/String;", "base-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public PermissionFlagInteractorImpl(SharedPreferences sharedPreferences) {
        this.f4587a = sharedPreferences;
    }

    public static String c(String str) {
        return YU.a.A("never_ask_again_", str);
    }

    @Override // au.com.woolworths.android.onesite.repository.PermissionFlagInteractor
    public final boolean a(String permission) {
        Intrinsics.h(permission, "permission");
        boolean zEquals = permission.equals("android.permission.CAMERA");
        SharedPreferences sharedPreferences = this.f4587a;
        return zEquals ? sharedPreferences.getBoolean(c(permission), false) | sharedPreferences.getBoolean("never_ask_again_camera_permission", false) : ArraysKt.l(b, permission) ? sharedPreferences.getBoolean(c(permission), false) | sharedPreferences.getBoolean("never_ask_again_location_permission_key", false) : sharedPreferences.getBoolean(c(permission), false);
    }

    @Override // au.com.woolworths.android.onesite.repository.PermissionFlagInteractor
    public final void b(ComponentActivity activity, Map permissionsMap) {
        Intrinsics.h(activity, "activity");
        Intrinsics.h(permissionsMap, "permissionsMap");
        for (Map.Entry entry : permissionsMap.entrySet()) {
            String str = (String) entry.getKey();
            if (!((Boolean) entry.getValue()).booleanValue() && !activity.shouldShowRequestPermissionRationale(str)) {
                d(str, true);
            }
        }
    }

    public final void d(String permission, boolean z) {
        Intrinsics.h(permission, "permission");
        SharedPreferences sharedPreferences = this.f4587a;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putBoolean(c(permission), z);
        editorEdit.apply();
        String[] strArr = b;
        if (ArraysKt.l(strArr, permission) || permission.equals("android.permission.CAMERA")) {
            if (ArraysKt.l(strArr, permission)) {
                if (z || !sharedPreferences.getBoolean("never_ask_again_location_permission_key", false)) {
                    return;
                }
                androidx.constraintlayout.core.state.a.v(sharedPreferences, "never_ask_again_location_permission_key", false);
                return;
            }
            if (permission.equals("android.permission.CAMERA") && !z && sharedPreferences.getBoolean("never_ask_again_camera_permission", false)) {
                androidx.constraintlayout.core.state.a.v(sharedPreferences, "never_ask_again_camera_permission", false);
            }
        }
    }

    public final void e(AppCompatActivity appCompatActivity, String[] strArr, int[] iArr) {
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str = strArr[i];
            int i3 = i2 + 1;
            if (iArr[i2] != 0 && !appCompatActivity.shouldShowRequestPermissionRationale(str)) {
                d(str, true);
            }
            i++;
            i2 = i3;
        }
    }
}
