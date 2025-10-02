package com.adobe.marketing.mobile;

import android.app.Application;
import android.os.UserManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "application", "Landroid/app/Application;", "invoke", "(Landroid/app/Application;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class MobileCoreInitializer$Companion$isUserUnlocked$1 extends Lambda implements Function1<Application, Boolean> {
    public static final MobileCoreInitializer$Companion$isUserUnlocked$1 h = new MobileCoreInitializer$Companion$isUserUnlocked$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Application application = (Application) obj;
        Intrinsics.h(application, "application");
        Object systemService = application.getSystemService("user");
        UserManager userManager = systemService instanceof UserManager ? (UserManager) systemService : null;
        return Boolean.valueOf(userManager != null ? userManager.isUserUnlocked() : true);
    }
}
