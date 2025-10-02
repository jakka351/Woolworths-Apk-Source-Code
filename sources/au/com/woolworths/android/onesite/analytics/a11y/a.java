package au.com.woolworths.android.onesite.analytics.a11y;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.util.Log;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.core.PreferencesFactory;
import au.com.woolworths.android.onesite.analytics.a11y.AccessibilityAnalytics;
import au.com.woolworths.android.onesite.app.BaseShopApplication;
import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.foundation.force.upgrade.impl.datastore.AppConfigDataStoreKt;
import au.com.woolworths.foundation.force.upgrade.impl.datastore.SoftUpgradeAlertBannerStoreKt;
import au.com.woolworths.foundation.force.upgrade.impl.datastore.UpgradeConfigDataStoreKt;
import au.com.woolworths.foundation.shop.chatbot.session.ChatbotSession;
import au.com.woolworths.foundation.shop.chatbot.session.ChatbotSessionDataStoreKt;
import au.com.woolworths.foundation.wxid.impl.data.WxidDataStoreKt;
import au.com.woolworths.sdui.shop.broadcastbanner.data.BannerDismissDataStoreKt;
import coil3.compose.AsyncImagePainter;
import com.apollographql.apollo.ast.GQLDefinition;
import com.apollographql.apollo.ast.GQLDocument;
import com.apollographql.apollo.ast.internal.Parser;
import com.apollographql.apollo.ast.internal.ParserException;
import com.apollographql.apollo.ast.internal.Token;
import com.cisco.or.sdk.OpenRoaming;
import com.cisco.or.sdk.exceptions.Hotspot2NotSupportedException;
import com.cisco.or.sdk.utils.SharedPrefs;
import com.google.firebase.sessions.settings.SessionConfigsSerializer;
import com.tealium.core.Tealium;
import com.tealium.core.persistence.Expiry;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import okhttp3.Response;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ a(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Hotspot2NotSupportedException, ParserException {
        Context context;
        ArrayList arrayList;
        int i = this.d;
        Unit unit = Unit.f24250a;
        switch (i) {
            case 0:
                AccessibilityAnalytics.DeviceData it = (AccessibilityAnalytics.DeviceData) obj;
                Intrinsics.h(it, "it");
                return it.d;
            case 1:
                Boolean isFullUser = (Boolean) obj;
                int i2 = BaseShopApplication.i;
                Intrinsics.h(isFullUser, "isFullUser");
                return isFullUser;
            case 2:
                Tealium create = (Tealium) obj;
                Intrinsics.h(create, "$this$create");
                create.w.J("tealium_environment", "prod", Expiry.f19166a);
                return unit;
            case 3:
                StackTraceElement it2 = (StackTraceElement) obj;
                Intrinsics.h(it2, "it");
                String string = it2.toString();
                Intrinsics.g(string, "toString(...)");
                return string;
            case 4:
                AppConfig appConfig = (AppConfig) obj;
                Intrinsics.h(appConfig, "<this>");
                return appConfig.d();
            case 5:
                Intrinsics.h((TextLayoutResult) obj, "it");
                return unit;
            case 6:
                Function1 handler = (Function1) obj;
                Intrinsics.h(handler, "handler");
                try {
                    context = OpenRoaming.b;
                } catch (Exception e) {
                    if (!Intrinsics.c(e.getMessage(), "WifiService: Permission denied") || Build.VERSION.SDK_INT != 29) {
                        Log.e("com.cisco.or.sdk.OpenRoaming", Log.getStackTraceString(e));
                        throw new Hotspot2NotSupportedException();
                    }
                    SharedPrefs sharedPrefs = OpenRoaming.c;
                    if (sharedPrefs == null) {
                        Intrinsics.p("sharedPref");
                        throw null;
                    }
                    if (sharedPrefs.f14054a.getBoolean("PROFILE_INSTALLED", false)) {
                        handler.invoke(Boolean.TRUE);
                    } else {
                        handler.invoke(Boolean.FALSE);
                    }
                }
                if (context == null) {
                    Intrinsics.p("context");
                    throw null;
                }
                Object systemService = context.getSystemService("wifi");
                Intrinsics.f(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
                WifiManager wifiManager = (WifiManager) systemService;
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 30) {
                    boolean z = wifiManager.getNetworkSuggestions().size() > 0;
                    if (wifiManager.getNetworkSuggestions().size() == 0) {
                        SharedPrefs sharedPrefs2 = OpenRoaming.c;
                        if (sharedPrefs2 == null) {
                            Intrinsics.p("sharedPref");
                            throw null;
                        }
                        if (sharedPrefs2.f14054a.getBoolean("PROFILE_INSTALLED", false)) {
                            SharedPrefs sharedPrefs3 = OpenRoaming.c;
                            if (sharedPrefs3 == null) {
                                Intrinsics.p("sharedPref");
                                throw null;
                            }
                            z = sharedPrefs3.f14054a.getBoolean("PROFILE_INSTALLED", false);
                        }
                    }
                    if (z) {
                        SharedPrefs sharedPrefs4 = OpenRoaming.c;
                        if (sharedPrefs4 == null) {
                            Intrinsics.p("sharedPref");
                            throw null;
                        }
                        if (sharedPrefs4.a().ordinal() == 1) {
                            OpenRoaming.c();
                            z = false;
                        }
                    }
                    handler.invoke(Boolean.valueOf(z));
                } else {
                    boolean z2 = wifiManager.getPasspointConfigurations().size() > 0;
                    if (i3 >= 30 && wifiManager.getNetworkSuggestions().size() == 0) {
                        SharedPrefs sharedPrefs5 = OpenRoaming.c;
                        if (sharedPrefs5 == null) {
                            Intrinsics.p("sharedPref");
                            throw null;
                        }
                        if (sharedPrefs5.f14054a.getBoolean("PROFILE_INSTALLED", false)) {
                            SharedPrefs sharedPrefs6 = OpenRoaming.c;
                            if (sharedPrefs6 == null) {
                                Intrinsics.p("sharedPref");
                                throw null;
                            }
                            z2 = sharedPrefs6.f14054a.getBoolean("PROFILE_INSTALLED", false);
                        }
                    }
                    if (z2) {
                        SharedPrefs sharedPrefs7 = OpenRoaming.c;
                        if (sharedPrefs7 == null) {
                            Intrinsics.p("sharedPref");
                            throw null;
                        }
                        if (sharedPrefs7.a().ordinal() == 1) {
                            OpenRoaming.c();
                            z2 = false;
                        }
                    }
                    handler.invoke(Boolean.valueOf(z2));
                }
                return unit;
            case 7:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                return unit;
            case 8:
                KProperty[] kPropertyArr = AppConfigDataStoreKt.f8510a;
                Intrinsics.h((CorruptionException) obj, "it");
                return PreferencesFactory.a();
            case 9:
                KProperty[] kPropertyArr2 = SoftUpgradeAlertBannerStoreKt.f8512a;
                Intrinsics.h((CorruptionException) obj, "it");
                return null;
            case 10:
                KProperty[] kPropertyArr3 = UpgradeConfigDataStoreKt.f8513a;
                Intrinsics.h((CorruptionException) obj, "it");
                return null;
            case 11:
                KProperty[] kPropertyArr4 = ChatbotSessionDataStoreKt.f8702a;
                Intrinsics.h((CorruptionException) obj, "it");
                ChatbotSession.INSTANCE.getClass();
                return ChatbotSession.b;
            case 12:
                KProperty[] kPropertyArr5 = WxidDataStoreKt.f8938a;
                Intrinsics.h((CorruptionException) obj, "it");
                return PreferencesFactory.a();
            case 13:
                KProperty[] kPropertyArr6 = BannerDismissDataStoreKt.f10028a;
                Intrinsics.h((CorruptionException) obj, "it");
                return PreferencesFactory.a();
            case 14:
                Response it3 = (Response) obj;
                Intrinsics.h(it3, "it");
                return it3.m;
            case 15:
                return unit;
            case 16:
                return (AsyncImagePainter.State) obj;
            case 17:
                final Parser parseInternal = (Parser) obj;
                Intrinsics.h(parseInternal, "$this$parseInternal");
                Token token = parseInternal.b;
                if (parseInternal.f) {
                    if (!(token instanceof Token.StartOfFile)) {
                        throw new ParserException("Expected " + Reflection.f24268a.b(Token.StartOfFile.class).B() + ", found '" + parseInternal.b + "'.", parseInternal.b);
                    }
                    parseInternal.e();
                    Function1<List<GQLDefinition>, Unit> function1 = new Function1<List<GQLDefinition>, Unit>() { // from class: com.apollographql.apollo.ast.internal.Parser$parseDocument$$inlined$parseList$1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            List buildList = (List) obj2;
                            Intrinsics.h(buildList, "$this$buildList");
                            while (true) {
                                Parser parser = parseInternal;
                                Token token2 = parser.b;
                                if (token2 instanceof Token.EndOfFile) {
                                    parser.e();
                                } else {
                                    token2 = null;
                                }
                                if (token2 != null) {
                                    return Unit.f24250a;
                                }
                                buildList.add(Parser.a(parseInternal));
                            }
                        }
                    };
                    arrayList = new ArrayList();
                    function1.invoke(arrayList);
                } else {
                    if (!(token instanceof Token.StartOfFile)) {
                        throw new ParserException("Expected " + Reflection.f24268a.b(Token.StartOfFile.class).B() + ", found '" + parseInternal.b + "'.", parseInternal.b);
                    }
                    parseInternal.e();
                    Function1<List<GQLDefinition>, Unit> function12 = new Function1<List<GQLDefinition>, Unit>() { // from class: com.apollographql.apollo.ast.internal.Parser$parseDocument$$inlined$parseNonEmptyList$1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Token token2;
                            List buildList = (List) obj2;
                            Intrinsics.h(buildList, "$this$buildList");
                            do {
                                buildList.add(Parser.a(parseInternal));
                                Parser parser = parseInternal;
                                token2 = parser.b;
                                if (token2 instanceof Token.EndOfFile) {
                                    parser.e();
                                } else {
                                    token2 = null;
                                }
                            } while (token2 == null);
                            return Unit.f24250a;
                        }
                    };
                    arrayList = new ArrayList();
                    function12.invoke(arrayList);
                }
                parseInternal.z(token);
                return new GQLDocument(arrayList);
            case 18:
                CorruptionException ex = (CorruptionException) obj;
                Intrinsics.h(ex, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", ex);
                return SessionConfigsSerializer.b;
            case 19:
                CoroutineContext.Element element = (CoroutineContext.Element) obj;
                if (element instanceof CoroutineDispatcher) {
                    return (CoroutineDispatcher) element;
                }
                return null;
            case 20:
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj;
                if (element2 instanceof ExecutorCoroutineDispatcher) {
                    return (ExecutorCoroutineDispatcher) element2;
                }
                return null;
            default:
                return obj;
        }
    }
}
