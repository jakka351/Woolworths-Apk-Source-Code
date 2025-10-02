package au.com.woolworths.shop.auth;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/auth/AccountRepository;", "", "Companion", "shop-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AccountRepository {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f10225a;
    public final SharedPreferences b;
    public final Gson c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, d2 = {"Lau/com/woolworths/shop/auth/AccountRepository$Companion;", "", "", "ACCOUNT", "Ljava/lang/String;", "GUEST_LOGIN_DATA", "FORCED_LOGGED_OUT", "KEY_USER_NAME", "DEVICE_AUTH_TOKEN", "REGION_MODE_DATA", "shop-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public AccountRepository(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, Gson gson) {
        Intrinsics.h(gson, "gson");
        this.f10225a = sharedPreferences;
        this.b = sharedPreferences2;
        this.c = gson;
    }

    public final void a(String str) {
        SharedPreferences.Editor editorEdit = this.f10225a.edit();
        editorEdit.putString("account", str);
        editorEdit.apply();
    }
}
