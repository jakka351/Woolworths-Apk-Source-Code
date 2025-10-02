package com.cisco.or.sdk;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiNetworkSuggestion;
import android.net.wifi.hotspot2.PasspointConfiguration;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import androidx.lifecycle.f;
import androidx.media3.exoplayer.source.mediaparser.a;
import au.com.woolworths.feature.shared.instore.wifi.ui.d;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.cisco.or.sdk.enums.IdType;
import com.cisco.or.sdk.enums.SigningState;
import com.cisco.or.sdk.exceptions.DNASpacesBackgroundExceptionHandler;
import com.cisco.or.sdk.exceptions.DefaultBackgroundExceptionHandler;
import com.cisco.or.sdk.exceptions.EmailException;
import com.cisco.or.sdk.exceptions.Hotspot2NotSupportedException;
import com.cisco.or.sdk.exceptions.NotInitializedException;
import com.cisco.or.sdk.exceptions.NotSignedException;
import com.cisco.or.sdk.exceptions.RegisterFailedException;
import com.cisco.or.sdk.exceptions.ServiceBadResponseException;
import com.cisco.or.sdk.exceptions.SignedException;
import com.cisco.or.sdk.exceptions.UserAlreadyAssociated;
import com.cisco.or.sdk.models.LocationDetailsKt;
import com.cisco.or.sdk.services.AssociateUserService;
import com.cisco.or.sdk.services.DeleteProfileService;
import com.cisco.or.sdk.services.HTTPResponse;
import com.cisco.or.sdk.services.InstallProfileService;
import com.cisco.or.sdk.services.RegisterService;
import com.cisco.or.sdk.services.UserLocationService;
import com.cisco.or.sdk.utils.SharedPrefs;
import com.cisco.or.sdk.utils.Utils;
import com.cisco.or.sdk.utils.ValidateUtil;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Iterator;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/cisco/or/sdk/OpenRoaming;", "", "REGION", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class OpenRoaming {

    /* renamed from: a, reason: collision with root package name */
    public static final OpenRoaming f14038a = new OpenRoaming();
    public static Context b;
    public static SharedPrefs c;
    public static boolean d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/cisco/or/sdk/OpenRoaming$REGION;", "", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class REGION {
        public static final /* synthetic */ REGION[] d = {new REGION("US", 0), new REGION("EU", 1), new REGION("SG", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        REGION EF5;

        public static REGION valueOf(String str) {
            return (REGION) Enum.valueOf(REGION.class, str);
        }

        public static REGION[] values() {
            return (REGION[]) d.clone();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14039a;

        static {
            int[] iArr = new int[IdType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f14039a = iArr;
        }
    }

    public static void a(String id, final DNASpacesBackgroundExceptionHandler exceptionHandler, final Function0 signingHandler) {
        Intrinsics.h(id, "id");
        Intrinsics.h(exceptionHandler, "exceptionHandler");
        Intrinsics.h(signingHandler, "signingHandler");
        g(SigningState.e);
        SharedPrefs sharedPrefs = c;
        if (sharedPrefs == null) {
            Intrinsics.p("sharedPref");
            throw null;
        }
        if (sharedPrefs.a() == SigningState.d) {
            throw new SignedException("this function cannot be called, because there is already an associated user in this application, please delete that user in order to make this call");
        }
        if (WhenMappings.f14039a[0] == 1 && !ValidateUtil.a(id)) {
            throw new EmailException();
        }
        try {
            AssociateUserService associateUserService = AssociateUserService.f14044a;
            Context context = b;
            if (context != null) {
                associateUserService.e(context, id, exceptionHandler, new Function1<HTTPResponse, Unit>() { // from class: com.cisco.or.sdk.OpenRoaming$associateUser$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        HTTPResponse hTTPResponse = (HTTPResponse) obj;
                        if (hTTPResponse != null && hTTPResponse.d != null) {
                            exceptionHandler.a(new UserAlreadyAssociated("User is already associated."));
                        }
                        SharedPrefs sharedPrefs2 = OpenRoaming.c;
                        if (sharedPrefs2 == null) {
                            Intrinsics.p("sharedPref");
                            throw null;
                        }
                        sharedPrefs2.c(SigningState.d);
                        signingHandler.invoke();
                        return Unit.f24250a;
                    }
                });
            } else {
                Intrinsics.p("context");
                throw null;
            }
        } catch (Exception e) {
            Log.e("com.cisco.or.sdk.OpenRoaming", Log.getStackTraceString(e));
            throw new ServiceBadResponseException();
        }
    }

    public static void b(DNASpacesBackgroundExceptionHandler exceptionHandler, final Function0 deleteProfileHandler) throws NotSignedException, NotInitializedException, ServiceBadResponseException {
        Intrinsics.h(exceptionHandler, "exceptionHandler");
        Intrinsics.h(deleteProfileHandler, "deleteProfileHandler");
        g(SigningState.d);
        try {
            DeleteProfileService deleteProfileService = DeleteProfileService.f14045a;
            Context context = b;
            if (context != null) {
                deleteProfileService.d(context, exceptionHandler, new Function1<HTTPResponse, Unit>() { // from class: com.cisco.or.sdk.OpenRoaming$deleteProfile$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) throws ServiceBadResponseException {
                        HTTPResponse hTTPResponse = (HTTPResponse) obj;
                        String str = hTTPResponse != null ? hTTPResponse.f14046a : null;
                        Intrinsics.e(str);
                        if (Boolean.parseBoolean(str)) {
                            throw new ServiceBadResponseException();
                        }
                        OpenRoaming.c();
                        deleteProfileHandler.invoke();
                        return Unit.f24250a;
                    }
                });
            } else {
                Intrinsics.p("context");
                throw null;
            }
        } catch (Exception e) {
            Log.e("com.cisco.or.sdk.OpenRoaming", Log.getStackTraceString(e));
            throw new ServiceBadResponseException();
        }
    }

    public static void c() {
        new DefaultBackgroundExceptionHandler();
        try {
            Context context = b;
            if (context == null) {
                Intrinsics.p("context");
                throw null;
            }
            Object systemService = context.getSystemService("wifi");
            Intrinsics.f(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
            WifiManager wifiManager = (WifiManager) systemService;
            int i = Build.VERSION.SDK_INT;
            List<PasspointConfiguration> passpointConfigurations = i != 29 ? wifiManager.getPasspointConfigurations() : null;
            SharedPrefs sharedPrefs = c;
            if (sharedPrefs == null) {
                Intrinsics.p("sharedPref");
                throw null;
            }
            String string = sharedPrefs.f14054a.getString("INSTALLED_FQDN", "");
            if (passpointConfigurations != null && passpointConfigurations.size() > 0) {
                for (PasspointConfiguration passpointConfiguration : passpointConfigurations) {
                    if (passpointConfiguration.getHomeSp() != null && passpointConfiguration.getHomeSp().getFqdn() != null && Intrinsics.c(passpointConfiguration.getHomeSp().getFqdn(), string)) {
                        wifiManager.removePasspointConfiguration(string);
                    }
                }
            } else if (i == 29) {
                if (string != null) {
                    Context context2 = b;
                    if (context2 == null) {
                        Intrinsics.p("context");
                        throw null;
                    }
                    SharedPrefs sharedPrefs2 = c;
                    if (sharedPrefs2 == null) {
                        Intrinsics.p("sharedPref");
                        throw null;
                    }
                    Utils.b(context2, null, Base64.decode(sharedPrefs2.f14054a.getString("PROFILE_DATA", ""), 0));
                }
            } else if (i >= 30) {
                List networkSuggestions = wifiManager.getNetworkSuggestions();
                Intrinsics.g(networkSuggestions, "wifi.networkSuggestions");
                Iterator it = networkSuggestions.iterator();
                while (it.hasNext()) {
                    WifiNetworkSuggestion wifiNetworkSuggestionN = a.n(it.next());
                    if (wifiNetworkSuggestionN.getPasspointConfig() != null) {
                        PasspointConfiguration passpointConfig = wifiNetworkSuggestionN.getPasspointConfig();
                        Intrinsics.e(passpointConfig);
                        if (Intrinsics.c(passpointConfig.getHomeSp().getFqdn(), string)) {
                            wifiManager.removeNetworkSuggestions(CollectionsKt.Q(wifiNetworkSuggestionN));
                        }
                    }
                }
            }
            Context context3 = b;
            if (context3 == null) {
                Intrinsics.p("context");
                throw null;
            }
            new SharedPrefs(context3).b(false);
        } catch (Exception e) {
            Log.e("com.cisco.or.sdk.OpenRoaming", Log.getStackTraceString(e));
        }
    }

    public static void d(DNASpacesBackgroundExceptionHandler exceptionHandler, final f fVar) {
        Intrinsics.h(exceptionHandler, "exceptionHandler");
        g(SigningState.d);
        try {
            UserLocationService userLocationService = UserLocationService.f14053a;
            Context context = b;
            if (context != null) {
                userLocationService.d(context, exceptionHandler, new Function1<HTTPResponse, Unit>() { // from class: com.cisco.or.sdk.OpenRoaming$getLocationDetails$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) throws Exception {
                        HTTPResponse hTTPResponse = (HTTPResponse) obj;
                        JSONObject jSONObject = hTTPResponse != null ? hTTPResponse.d : null;
                        f fVar2 = fVar;
                        if (jSONObject != null) {
                            JSONObject jSONObject2 = hTTPResponse.d;
                            Intrinsics.e(jSONObject2);
                            fVar2.invoke(LocationDetailsKt.a(jSONObject2));
                        } else {
                            fVar2.invoke(LocationDetailsKt.a(new JSONObject()));
                        }
                        return Unit.f24250a;
                    }
                });
            } else {
                Intrinsics.p("context");
                throw null;
            }
        } catch (Exception e) {
            Log.e("com.cisco.or.sdk.OpenRoaming", Log.getStackTraceString(e));
            throw new ServiceBadResponseException();
        }
    }

    public static void e(DNASpacesBackgroundExceptionHandler exceptionHandler, final Function0 provisionProfileHandler) throws NotSignedException, NotInitializedException, ServiceBadResponseException {
        Intrinsics.h(exceptionHandler, "exceptionHandler");
        Intrinsics.h(provisionProfileHandler, "provisionProfileHandler");
        g(SigningState.d);
        try {
            InstallProfileService installProfileService = InstallProfileService.f14047a;
            Context context = b;
            if (context != null) {
                installProfileService.d(context, exceptionHandler, new Function1<HTTPResponse, Unit>() { // from class: com.cisco.or.sdk.OpenRoaming$installProfile$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Context context2;
                        HTTPResponse hTTPResponse = (HTTPResponse) obj;
                        try {
                            context2 = OpenRoaming.b;
                        } catch (Exception e) {
                            Log.e("com.cisco.or.sdk.OpenRoaming", Log.getStackTraceString(e));
                        }
                        if (context2 == null) {
                            Intrinsics.p("context");
                            throw null;
                        }
                        Intrinsics.e(hTTPResponse);
                        byte[] bArr = hTTPResponse.b;
                        Intrinsics.e(bArr);
                        Utils.d(context2, bArr);
                        provisionProfileHandler.invoke();
                        return Unit.f24250a;
                    }
                });
            } else {
                Intrinsics.p("context");
                throw null;
            }
        } catch (Exception e) {
            Log.e("com.cisco.or.sdk.OpenRoaming", Log.getStackTraceString(e));
            throw new ServiceBadResponseException();
        }
    }

    public static void g(SigningState signingState) throws NotSignedException, NotInitializedException {
        if (!d) {
            throw new NotInitializedException();
        }
        int iOrdinal = signingState.ordinal();
        SharedPrefs sharedPrefs = c;
        if (sharedPrefs == null) {
            Intrinsics.p("sharedPref");
            throw null;
        }
        if (iOrdinal < sharedPrefs.a().ordinal()) {
            NotSignedException notSignedException = new NotSignedException();
            String message = notSignedException.getMessage();
            if (message == null) {
                throw notSignedException;
            }
            Log.e("com.cisco.or.sdk.OpenRoaming", message);
            throw notSignedException;
        }
    }

    public final void f(final Context context, final DNASpacesBackgroundExceptionHandler exceptionHandler, final d dVar) {
        Intrinsics.h(exceptionHandler, "exceptionHandler");
        b = context;
        SharedPrefs sharedPrefs = new SharedPrefs(context);
        c = sharedPrefs;
        c.v(sharedPrefs.f14054a, "PREF_DNA_SPACES_KEY", "5bba6f2b-3399-6246-9257-hcc6c95ba337");
        SharedPrefs sharedPrefs2 = c;
        if (sharedPrefs2 == null) {
            Intrinsics.p("sharedPref");
            throw null;
        }
        c.v(sharedPrefs2.f14054a, "APP_ID", "com.woolworths");
        SharedPrefs sharedPrefs3 = c;
        if (sharedPrefs3 == null) {
            Intrinsics.p("sharedPref");
            throw null;
        }
        c.v(sharedPrefs3.f14054a, "REGION", "US");
        SharedPrefs sharedPrefs4 = c;
        if (sharedPrefs4 == null) {
            Intrinsics.p("sharedPref");
            throw null;
        }
        String string = sharedPrefs4.f14054a.getString("PREF_SDK_TOKEN", null);
        if (string != null && string.length() != 0) {
            d = true;
            Log.d("com.cisco.or.sdk.OpenRoaming", "Initialized with success!");
            SharedPrefs sharedPrefs5 = c;
            if (sharedPrefs5 != null) {
                dVar.invoke(sharedPrefs5.a());
                return;
            } else {
                Intrinsics.p("sharedPref");
                throw null;
            }
        }
        final Function1<Boolean, Unit> function1 = new Function1<Boolean, Unit>() { // from class: com.cisco.or.sdk.OpenRoaming$registerSdk$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws RegisterFailedException {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                DNASpacesBackgroundExceptionHandler dNASpacesBackgroundExceptionHandler = exceptionHandler;
                try {
                    if (zBooleanValue) {
                        RegisterService.f14049a.d(context, dNASpacesBackgroundExceptionHandler, new Function1<HTTPResponse, Unit>(this, dVar, dNASpacesBackgroundExceptionHandler) { // from class: com.cisco.or.sdk.OpenRoaming$registerSdk$1.1
                            public final /* synthetic */ d h;
                            public final /* synthetic */ DNASpacesBackgroundExceptionHandler i;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                                this.h = dVar;
                                this.i = dNASpacesBackgroundExceptionHandler;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) throws JSONException, BadPaddingException, NoSuchPaddingException, InvalidKeySpecException, IllegalBlockSizeException, NoSuchAlgorithmException, RegisterFailedException, InvalidKeyException {
                                HTTPResponse hTTPResponse = (HTTPResponse) obj2;
                                if (hTTPResponse != null) {
                                    SharedPrefs sharedPrefs6 = OpenRoaming.c;
                                    if (sharedPrefs6 == null) {
                                        Intrinsics.p("sharedPref");
                                        throw null;
                                    }
                                    JSONObject jSONObject = hTTPResponse.d;
                                    Intrinsics.e(jSONObject);
                                    SharedPrefs sharedPrefs7 = OpenRoaming.c;
                                    if (sharedPrefs7 == null) {
                                        Intrinsics.p("sharedPref");
                                        throw null;
                                    }
                                    String string2 = sharedPrefs7.f14054a.getString("PREF_CLIENT_PRIVATE_KEY", null);
                                    Intrinsics.e(string2);
                                    c.v(sharedPrefs6.f14054a, "PREF_SDK_TOKEN", Utils.a(string2, jSONObject));
                                    OpenRoaming.d = true;
                                    Log.d("com.cisco.or.sdk.OpenRoaming", "Initialized with success!");
                                    SharedPrefs sharedPrefs8 = OpenRoaming.c;
                                    if (sharedPrefs8 == null) {
                                        Intrinsics.p("sharedPref");
                                        throw null;
                                    }
                                    this.h.invoke(sharedPrefs8.a());
                                } else {
                                    this.i.a(new ServiceBadResponseException());
                                }
                                return Unit.f24250a;
                            }
                        });
                    } else {
                        dNASpacesBackgroundExceptionHandler.a(new Hotspot2NotSupportedException());
                    }
                    return Unit.f24250a;
                } catch (Exception e) {
                    Log.e("com.cisco.or.sdk.OpenRoaming", Log.getStackTraceString(e));
                    throw new RegisterFailedException();
                }
            }
        };
        try {
            Context context2 = b;
            if (context2 == null) {
                Intrinsics.p("context");
                throw null;
            }
            Object systemService = context2.getSystemService("wifi");
            Intrinsics.f(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
            try {
                ((WifiManager) systemService).getPasspointConfigurations();
                function1.invoke(Boolean.TRUE);
            } catch (Exception e) {
                if (!Intrinsics.c(e.getMessage(), "WifiService: Permission denied") || Build.VERSION.SDK_INT != 29) {
                    function1.invoke(Boolean.FALSE);
                    return;
                }
                Context context3 = b;
                if (context3 == null) {
                    Intrinsics.p("context");
                    throw null;
                }
                Function0<Unit> function0 = new Function0<Unit>() { // from class: com.cisco.or.sdk.OpenRoaming$deviceSupportHotspot$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(Boolean.TRUE);
                        return Unit.f24250a;
                    }
                };
                try {
                    Utils.b(context3, "openroamingdummy.com", null);
                    function0.invoke();
                } catch (Exception e2) {
                    exceptionHandler.a(new Hotspot2NotSupportedException());
                    Log.e("com.cisco.or.sdk.OpenRoaming", Log.getStackTraceString(e2));
                }
            }
        } catch (Exception e3) {
            Log.e("com.cisco.or.sdk.OpenRoaming", Log.getStackTraceString(e3));
            throw new Hotspot2NotSupportedException();
        }
    }
}
