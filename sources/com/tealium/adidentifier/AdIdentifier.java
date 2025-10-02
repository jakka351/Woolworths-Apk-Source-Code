package com.tealium.adidentifier;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import com.tealium.core.Logger;
import com.tealium.core.Module;
import com.tealium.core.ModuleFactory;
import com.tealium.core.TealiumContext;
import com.tealium.core.messaging.MessengerService;
import com.tealium.core.persistence.Serialization;
import com.tealium.core.persistence.f0;
import com.tealium.core.persistence.h0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tealium/adidentifier/AdIdentifier;", "Lcom/tealium/core/Module;", "Companion", "adidentifier_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AdIdentifier implements Module {

    @NotNull
    public static final String MODULE_VERSION = "1.1.2";
    public static final Companion e = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public final TealiumContext f19119a;
    public final Function1 b;
    public final Function1 c;
    public boolean d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/tealium/adidentifier/AdIdentifier$Companion;", "Lcom/tealium/core/ModuleFactory;", "", "KEY_GOOGLE_ADID", "Ljava/lang/String;", "KEY_GOOGLE_AD_TRACKING", "KEY_GOOGLE_APP_SET_ID", "KEY_GOOGLE_APP_SET_SCOPE", "MODULE_NAME", "MODULE_VERSION", "adidentifier_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion implements ModuleFactory {

        public final class a implements com.tealium.adidentifier.internal.b {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f0 f19120a;

            public a(f0 f0Var) {
                this.f19120a = f0Var;
            }

            @Override // com.tealium.adidentifier.internal.b
            public final void l(Integer num, String str) {
                f0 f0Var = this.f19120a;
                if (str != null) {
                    f0Var.J("google_app_set_id", str, null);
                } else {
                    f0Var.K("google_app_set_id");
                }
                if (num != null) {
                    f0Var.F("google_app_set_scope", num, h0.a().getF19167a(), null, Serialization.INT);
                } else {
                    f0Var.K("google_app_set_scope");
                }
            }

            @Override // com.tealium.adidentifier.internal.b
            public final void u(String str, Boolean bool) {
                f0 f0Var = this.f19120a;
                if (str != null) {
                    f0Var.J("google_adid", str, null);
                } else {
                    f0Var.K("google_adid");
                }
                if (bool != null) {
                    f0Var.H("google_limit_ad_tracking", bool.booleanValue(), null);
                } else {
                    f0Var.K("google_limit_ad_tracking");
                }
            }
        }

        @Override // com.tealium.core.ModuleFactory
        public final Module a(TealiumContext context) {
            Intrinsics.h(context, "context");
            return new AdIdentifier(context);
        }
    }

    public final /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Context, AdvertisingIdClient.Info> {
        public static final a d = new a(1, AdvertisingIdClient.class, "getAdvertisingIdInfo", "getAdvertisingIdInfo(Landroid/content/Context;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Context p0 = (Context) obj;
            Intrinsics.h(p0, "p0");
            return AdvertisingIdClient.getAdvertisingIdInfo(p0);
        }
    }

    public final /* synthetic */ class b extends FunctionReferenceImpl implements Function1<Context, AppSetIdClient> {
        public static final b d = new b(1, AppSet.class, "getClient", "getClient(Landroid/content/Context;)Lcom/google/android/gms/appset/AppSetIdClient;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Context p0 = (Context) obj;
            Intrinsics.h(p0, "p0");
            return AppSet.getClient(p0);
        }
    }

    public AdIdentifier(TealiumContext tealiumContext) {
        a aVar = a.d;
        b bVar = b.d;
        Intrinsics.h(tealiumContext, "tealiumContext");
        this.f19119a = tealiumContext;
        this.b = aVar;
        this.c = bVar;
        this.d = true;
        Companion.a aVar2 = new Companion.a(tealiumContext.c);
        MessengerService messengerService = tealiumContext.e;
        messengerService.f19153a.i(aVar2);
        Application application = tealiumContext.f19130a.f19129a;
        try {
            AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) aVar.invoke(application);
            messengerService.a(new com.tealium.adidentifier.internal.a(info.getId(), Boolean.valueOf(info.isLimitAdTrackingEnabled())));
        } catch (Exception e2) {
            Logger.f19124a.b("Tealium-AdIdentifier-1.1.2", "Unable to retrieve AdvertisingIdInfo. See: " + e2.getMessage());
        }
        Task<AppSetIdInfo> appSetIdInfo = ((AppSetIdClient) this.c.invoke(application)).getAppSetIdInfo();
        Intrinsics.g(appSetIdInfo, "client.appSetIdInfo");
        appSetIdInfo.addOnSuccessListener(new androidx.compose.runtime.snapshots.a(this, 11));
    }

    @Override // com.tealium.core.Module
    /* renamed from: A, reason: from getter */
    public final boolean getD() {
        return this.d;
    }

    @Override // com.tealium.core.Module
    /* renamed from: getName */
    public final String getF() {
        return "AdIdentifier";
    }

    @Override // com.tealium.core.Module
    public final void setEnabled(boolean z) {
        this.d = z;
    }
}
