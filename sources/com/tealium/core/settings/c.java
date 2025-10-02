package com.tealium.core.settings;

import android.app.Application;
import com.medallia.digital.mobilesdk.q2;
import com.tealium.core.JsonLoader;
import com.tealium.core.Loader;
import com.tealium.core.LogLevel;
import com.tealium.core.Logger;
import com.tealium.core.TealiumConfig;
import com.tealium.core.network.HttpClient;
import com.tealium.core.network.ResourceEntity;
import com.tealium.core.network.ResourceRetriever;
import com.tealium.core.settings.a;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.internal.ContextScope;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/settings/c;", "", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class c {
    public static final /* synthetic */ KProperty[] i = {Reflection.f24268a.e(new MutablePropertyReference1Impl(c.class, "librarySettings", "getLibrarySettings()Lcom/tealium/core/settings/LibrarySettings;", 0))};

    /* renamed from: a, reason: collision with root package name */
    public final TealiumConfig f19179a;
    public final Loader b;
    public final com.tealium.core.messaging.c c;
    public final ResourceRetriever d;
    public final String e;
    public final boolean f;
    public final LibrarySettings g;
    public final d h;

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.tealium.core.settings.LibrarySettingsManager$fetchLibrarySettings$2", f = "LibrarySettingsManager.kt", l = {84}, m = "invokeSuspend")
    final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return c.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) create((CoroutineScope) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            aVar.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            JSONObject jSONObject;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            c cVar = c.this;
            cVar.f19179a.getClass();
            if (!cVar.f) {
                String strA = cVar.b.a(cVar.e);
                if (strA != null) {
                    String str = null;
                    try {
                        jSONObject = new JSONObject(strA);
                    } catch (JSONException unused) {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        LibrarySettings librarySettings = new LibrarySettings();
                        librarySettings.f19178a = jSONObject.optBoolean("collect_dispatcher", false);
                        librarySettings.b = jSONObject.optBoolean("tag_management_dispatcher", false);
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("batching");
                        if (jSONObjectOptJSONObject != null) {
                            Batching batching = new Batching();
                            int iOptInt = jSONObjectOptJSONObject.optInt("batch_size");
                            if (iOptInt > 10) {
                                iOptInt = 10;
                            }
                            batching.f19177a = iOptInt;
                            batching.b = jSONObjectOptJSONObject.optInt("max_queue_size");
                            String expirationString = jSONObjectOptJSONObject.optString("expiration");
                            Intrinsics.g(expirationString, "expirationString");
                            batching.c = a.C0392a.a(expirationString);
                            librarySettings.c = batching;
                        }
                        librarySettings.d = jSONObject.optBoolean("battery_saver", false);
                        librarySettings.e = jSONObject.optBoolean("wifi_only", false);
                        String logLevel = jSONObject.optString("log_level", "");
                        Intrinsics.g(logLevel, "logLevel");
                        librarySettings.h = LogLevel.Companion.a(logLevel);
                        String librarySettingsIntervalString = jSONObject.optString("refresh_interval");
                        Intrinsics.g(librarySettingsIntervalString, "librarySettingsIntervalString");
                        librarySettings.f = a.C0392a.a(librarySettingsIntervalString);
                        librarySettings.g = jSONObject.optBoolean("disable_library", false);
                        String strOptString = jSONObject.optString("etag");
                        if (strOptString != null && strOptString.length() != 0) {
                            str = strOptString;
                        }
                        librarySettings.i = str;
                    }
                }
            }
            return Unit.f24250a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.tealium.core.settings.LibrarySettingsManager$fetchRemoteSettings$2", f = "LibrarySettingsManager.kt", l = {157}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/tealium/core/network/ResourceEntity;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "com.tealium.core.settings.LibrarySettingsManager$fetchRemoteSettings$2$1", f = "LibrarySettingsManager.kt", l = {152}, m = "invokeSuspend")
        final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResourceEntity>, Object> {
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                throw null;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                CoroutineScopeKt.d(null);
                throw null;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            throw null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.tealium.core.settings.LibrarySettingsManager$loadSettings$1", f = "LibrarySettingsManager.kt", l = {112}, m = "invokeSuspend")
    /* renamed from: com.tealium.core.settings.c$c, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    final class C0393c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "kotlin-stdlib"}, k = 1, mv = {1, 6, 0})
    public final class d extends ObservableProperty<LibrarySettings> {
        public final /* synthetic */ c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(LibrarySettings librarySettings, c cVar) {
            super(librarySettings);
            this.b = cVar;
        }

        @Override // kotlin.properties.ObservableProperty
        public final void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.h(property, "property");
            LibrarySettings librarySettings = (LibrarySettings) obj2;
            int i = librarySettings.f;
            KProperty[] kPropertyArr = c.i;
            c cVar = this.b;
            cVar.d.c = i / 60;
            cVar.c.C(librarySettings);
        }
    }

    public c(TealiumConfig tealiumConfig, HttpClient httpClient, com.tealium.core.messaging.c cVar, ContextScope contextScope) {
        JSONObject jSONObject;
        JsonLoader.Companion companion = JsonLoader.b;
        Application application = tealiumConfig.f19129a;
        companion.getClass();
        Intrinsics.h(application, "application");
        JsonLoader jsonLoader = JsonLoader.c;
        if (jsonLoader == null) {
            synchronized (companion) {
                jsonLoader = JsonLoader.c;
                if (jsonLoader == null) {
                    jsonLoader = new JsonLoader(application);
                    JsonLoader.c = jsonLoader;
                }
            }
        }
        this.f19179a = tealiumConfig;
        this.b = jsonLoader;
        this.c = cVar;
        this.e = "tealium-settings.json";
        new File(tealiumConfig.j.getCanonicalPath(), "tealium-settings.json");
        this.d = new ResourceRetriever(tealiumConfig, YU.a.o(YU.a.v("https://tags.tiqcdn.com/utag/", tealiumConfig.b, q2.c, tealiumConfig.c, q2.c), tealiumConfig.d.d, "/mobile.html"), httpClient);
        String strA = jsonLoader.a("tealium-settings.json");
        LibrarySettings librarySettings = null;
        str = null;
        String str = null;
        librarySettings = null;
        if (strA != null) {
            try {
                jSONObject = new JSONObject(strA);
            } catch (JSONException unused) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                LibrarySettings librarySettings2 = new LibrarySettings();
                librarySettings2.f19178a = jSONObject.optBoolean("collect_dispatcher", false);
                librarySettings2.b = jSONObject.optBoolean("tag_management_dispatcher", false);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("batching");
                if (jSONObjectOptJSONObject != null) {
                    Batching batching = new Batching();
                    int iOptInt = jSONObjectOptJSONObject.optInt("batch_size");
                    batching.f19177a = iOptInt > 10 ? 10 : iOptInt;
                    batching.b = jSONObjectOptJSONObject.optInt("max_queue_size");
                    String expirationString = jSONObjectOptJSONObject.optString("expiration");
                    Intrinsics.g(expirationString, "expirationString");
                    batching.c = a.C0392a.a(expirationString);
                    librarySettings2.c = batching;
                }
                librarySettings2.d = jSONObject.optBoolean("battery_saver", false);
                librarySettings2.e = jSONObject.optBoolean("wifi_only", false);
                String logLevel = jSONObject.optString("log_level", "");
                Intrinsics.g(logLevel, "logLevel");
                librarySettings2.h = LogLevel.Companion.a(logLevel);
                String librarySettingsIntervalString = jSONObject.optString("refresh_interval");
                Intrinsics.g(librarySettingsIntervalString, "librarySettingsIntervalString");
                librarySettings2.f = a.C0392a.a(librarySettingsIntervalString);
                librarySettings2.g = jSONObject.optBoolean("disable_library", false);
                String strOptString = jSONObject.optString("etag");
                if (strOptString != null && strOptString.length() != 0) {
                    str = strOptString;
                }
                librarySettings2.i = str;
                librarySettings = librarySettings2;
            }
        }
        if (librarySettings != null) {
            Logger.f19124a.b("Tealium-1.6.0", "Loaded local library settings.");
        }
        this.f = true;
        this.g = librarySettings;
        this.h = new d(librarySettings == null ? new LibrarySettings() : librarySettings, this);
        this.d.c = b().f / 60;
    }

    public final Object a(Continuation continuation) {
        Object objC = CoroutineScopeKt.c(new a(null), continuation);
        return objC == CoroutineSingletons.d ? objC : Unit.f24250a;
    }

    public final LibrarySettings b() {
        return (LibrarySettings) this.h.getValue(this, i[0]);
    }
}
