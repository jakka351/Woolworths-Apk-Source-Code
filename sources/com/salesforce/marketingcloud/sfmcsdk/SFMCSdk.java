package com.salesforce.marketingcloud.sfmcsdk;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.MainThread;
import androidx.camera.core.processing.g;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.salesforce.marketingcloud.sfmcsdk.components.behaviors.BehaviorManagerImpl;
import com.salesforce.marketingcloud.sfmcsdk.components.events.Event;
import com.salesforce.marketingcloud.sfmcsdk.components.events.EventManager;
import com.salesforce.marketingcloud.sfmcsdk.components.identity.Identity;
import com.salesforce.marketingcloud.sfmcsdk.components.logging.LogLevel;
import com.salesforce.marketingcloud.sfmcsdk.components.logging.LogListener;
import com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger;
import com.salesforce.marketingcloud.sfmcsdk.components.utils.SdkExecutors;
import com.salesforce.marketingcloud.sfmcsdk.components.utils.SdkExecutorsKt;
import com.salesforce.marketingcloud.sfmcsdk.modules.Config;
import com.salesforce.marketingcloud.sfmcsdk.modules.Module;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleIdentifier;
import com.salesforce.marketingcloud.sfmcsdk.modules.cdp.CdpModule;
import com.salesforce.marketingcloud.sfmcsdk.modules.cdp.CdpModuleConfig;
import com.salesforce.marketingcloud.sfmcsdk.modules.cdp.CdpModuleReadyListener;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModule;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleConfig;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleReadyListener;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import me.oriient.positioningengine.ondevice.ml.MlModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J%\u0010\u0018\u001a\u00020\u00132\u0016\u0010\u0019\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001b0\u001a\"\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0002\u0010\u001cJ\u000e\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/SFMCSdk;", "", MlModel.MODEL_FILE_SUFFIX, "Lcom/salesforce/marketingcloud/sfmcsdk/SFMCSdkModuleConfig;", "(Lcom/salesforce/marketingcloud/sfmcsdk/SFMCSdkModuleConfig;)V", "getConfig", "()Lcom/salesforce/marketingcloud/sfmcsdk/SFMCSdkModuleConfig;", "executors", "Lcom/salesforce/marketingcloud/sfmcsdk/components/utils/SdkExecutors;", "identity", "Lcom/salesforce/marketingcloud/sfmcsdk/components/identity/Identity;", "getIdentity", "()Lcom/salesforce/marketingcloud/sfmcsdk/components/identity/Identity;", "setIdentity", "(Lcom/salesforce/marketingcloud/sfmcsdk/components/identity/Identity;)V", "modules", "", "Lcom/salesforce/marketingcloud/sfmcsdk/modules/Module;", "cdp", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/salesforce/marketingcloud/sfmcsdk/modules/cdp/CdpModuleReadyListener;", "getSdkState", "Lorg/json/JSONObject;", "internalTrack", "events", "", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event;", "([Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event;)V", "mp", "Lcom/salesforce/marketingcloud/sfmcsdk/modules/push/PushModuleReadyListener;", "Companion", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SFMCSdk {

    @NotNull
    private static final Object SDK_LOCK;

    @NotNull
    public static final String SDK_VERSION_NAME = "1.0.3";

    @NotNull
    private static final String TAG = "~$SFMCSdk";

    @NotNull
    private static final List<WhenReadyHandler> UNIFIED_SDK_INSTANCE_REQUESTS;

    @SuppressLint
    @NotNull
    private static final BehaviorManagerImpl behaviorManager;

    @NotNull
    private static volatile InitializationState initializationState;

    @SuppressLint
    @Nullable
    private static SFMCSdk instance;

    @NotNull
    private final SFMCSdkModuleConfig config;

    @NotNull
    private final SdkExecutors executors;
    public Identity identity;

    @NotNull
    private final List<Module> modules;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static PushModule pushModule = new PushModule();

    @NotNull
    private static CdpModule cdpModule = new CdpModule();

    @Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u001c\b\u0002\u0010%\u001a\u0016\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020 \u0018\u00010&j\u0004\u0018\u0001`(H\u0007J,\u0010)\u001a\u00020 2\u001a\u0010%\u001a\u0016\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020 \u0018\u00010&j\u0004\u0018\u0001`(2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020 2\u0006\u0010%\u001a\u00020-H\u0007J\u001a\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u0002002\b\u0010%\u001a\u0004\u0018\u000101H\u0007J\b\u00102\u001a\u00020 H\u0002J%\u00103\u001a\u00020 2\u0016\u00104\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010605\"\u0004\u0018\u000106H\u0007¢\u0006\u0002\u00107R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u001aX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u00068"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/SFMCSdk$Companion;", "", "()V", "SDK_LOCK", "Ljava/lang/Object;", "SDK_VERSION_NAME", "", "TAG", "UNIFIED_SDK_INSTANCE_REQUESTS", "", "Lcom/salesforce/marketingcloud/sfmcsdk/WhenReadyHandler;", "behaviorManager", "Lcom/salesforce/marketingcloud/sfmcsdk/components/behaviors/BehaviorManagerImpl;", "getBehaviorManager$sfmcsdk_release", "()Lcom/salesforce/marketingcloud/sfmcsdk/components/behaviors/BehaviorManagerImpl;", "cdpModule", "Lcom/salesforce/marketingcloud/sfmcsdk/modules/cdp/CdpModule;", "getCdpModule$sfmcsdk_release", "()Lcom/salesforce/marketingcloud/sfmcsdk/modules/cdp/CdpModule;", "setCdpModule$sfmcsdk_release", "(Lcom/salesforce/marketingcloud/sfmcsdk/modules/cdp/CdpModule;)V", "initializationState", "Lcom/salesforce/marketingcloud/sfmcsdk/InitializationState;", "instance", "Lcom/salesforce/marketingcloud/sfmcsdk/SFMCSdk;", "pushModule", "Lcom/salesforce/marketingcloud/sfmcsdk/modules/push/PushModule;", "getPushModule$sfmcsdk_release", "()Lcom/salesforce/marketingcloud/sfmcsdk/modules/push/PushModule;", "setPushModule$sfmcsdk_release", "(Lcom/salesforce/marketingcloud/sfmcsdk/modules/push/PushModule;)V", "configure", "", "context", "Landroid/content/Context;", MlModel.MODEL_FILE_SUFFIX, "Lcom/salesforce/marketingcloud/sfmcsdk/SFMCSdkModuleConfig;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "Lcom/salesforce/marketingcloud/sfmcsdk/InitializationStatus;", "Lcom/salesforce/marketingcloud/sfmcsdk/InitializationListener;", "notifyInitializationStatusListener", "isSuccessful", "", "requestSdk", "Lcom/salesforce/marketingcloud/sfmcsdk/SFMCSdkReadyListener;", "setLogging", "level", "Lcom/salesforce/marketingcloud/sfmcsdk/components/logging/LogLevel;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/logging/LogListener;", "staticTearDown", "track", "events", "", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event;", "([Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event;)V", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[InitializationState.values().length];
                iArr[InitializationState.READY.ordinal()] = 1;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void configure$default(Companion companion, Context context, SFMCSdkModuleConfig sFMCSdkModuleConfig, Function1 function1, int i, Object obj) {
            if ((i & 4) != 0) {
                function1 = null;
            }
            companion.configure(context, sFMCSdkModuleConfig, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: configure$lambda-10$lambda-9, reason: not valid java name */
        public static final void m258configure$lambda10$lambda9(final SFMCSdkModuleConfig config, Function1 function1, Context context) {
            Intrinsics.h(config, "$config");
            Intrinsics.h(context, "$context");
            String name = Thread.currentThread().getName();
            Thread.currentThread().setName("SFMCSdk_Init");
            try {
                try {
                    if (SFMCSdk.instance != null) {
                        SFMCSdk.INSTANCE.staticTearDown();
                    }
                    byte b = 0;
                    byte b2 = 0;
                    byte b3 = 0;
                    byte b4 = 0;
                    byte b5 = 0;
                    byte b6 = 0;
                    SFMCSdk.instance = new SFMCSdk(config, null);
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    CountDownLatch countDownLatch = new CountDownLatch(config.getConfigs$sfmcsdk_release().size());
                    SFMCSdkLogger.INSTANCE.d(SFMCSdk.TAG, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.SFMCSdk$Companion$configure$1$3$moduleInitLatch$1$1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final String invoke() {
                            return "Initializing " + config.getConfigs$sfmcsdk_release().size() + " modules.";
                        }
                    });
                    for (final Config config2 : config.getConfigs$sfmcsdk_release()) {
                        SFMCSdkLogger.INSTANCE.d(SFMCSdk.TAG, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.SFMCSdk$Companion$configure$1$3$2$1
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final String invoke() {
                                return "Module (" + config2.getModuleIdentifier() + ") init started. Current Version: " + config2.getVersion() + " && Max Supported Version: " + config2.getMAX_SUPPORTED_VERSION();
                            }
                        });
                        SFMCSdkComponents sFMCSdkComponents = new SFMCSdkComponents(context, config2.getModuleIdentifier().name(), config2.getModuleApplicationId(), SFMCSdk.INSTANCE.getBehaviorManager$sfmcsdk_release().initIfNecessary$sfmcsdk_release(context), new EventManager(config2.getModuleIdentifier().name()));
                        SFMCSdk sFMCSdk = SFMCSdk.instance;
                        if (sFMCSdk != null && sFMCSdk.identity == null) {
                            sFMCSdk.setIdentity(Identity.INSTANCE.getInstance());
                        }
                        int i = 3;
                        if (config2 instanceof PushModuleConfig) {
                            SdkExecutorsKt.namedRunnable(new SdkExecutors(b3 == true ? 1 : 0, b2 == true ? 1 : 0, i, b == true ? 1 : 0).getDiskIO(), config2.getModuleIdentifier().name(), new SFMCSdk$Companion$configure$1$3$2$3(context, config2, sFMCSdkComponents, countDownLatch));
                        } else if (config2 instanceof CdpModuleConfig) {
                            SdkExecutorsKt.namedRunnable(new SdkExecutors(b6 == true ? 1 : 0, b5 == true ? 1 : 0, i, b4 == true ? 1 : 0).getDiskIO(), config2.getModuleIdentifier().name(), new SFMCSdk$Companion$configure$1$3$2$4(context, config2, sFMCSdkComponents, countDownLatch));
                        }
                    }
                    final boolean zAwait = countDownLatch.await(5L, TimeUnit.SECONDS);
                    SFMCSdkLogger sFMCSdkLogger = SFMCSdkLogger.INSTANCE;
                    sFMCSdkLogger.d(SFMCSdk.TAG, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.SFMCSdk$Companion$configure$1$3$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final String invoke() {
                            StringBuilder sb = new StringBuilder("Module init latch time exceeded: ");
                            sb.append(!zAwait);
                            return sb.toString();
                        }
                    });
                    Companion companion = SFMCSdk.INSTANCE;
                    SFMCSdk.initializationState = InitializationState.READY;
                    sFMCSdkLogger.d(SFMCSdk.TAG, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.SFMCSdk$Companion$configure$1$3$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final String invoke() {
                            return android.support.v4.media.session.a.l(System.currentTimeMillis() - jCurrentTimeMillis, "ms.", new StringBuilder("SFMC SDK Ready took "));
                        }
                    });
                    synchronized (SFMCSdk.UNIFIED_SDK_INSTANCE_REQUESTS) {
                        for (final WhenReadyHandler whenReadyHandler : SFMCSdk.UNIFIED_SDK_INSTANCE_REQUESTS) {
                            try {
                                SFMCSdk sFMCSdk2 = SFMCSdk.instance;
                                if (sFMCSdk2 != null) {
                                    whenReadyHandler.deliverSdk(sFMCSdk2);
                                }
                            } catch (Exception e) {
                                SFMCSdkLogger.INSTANCE.e(SFMCSdk.TAG, e, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.SFMCSdk$Companion$configure$1$3$5$1$2
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final String invoke() {
                                        return "Failure during requestSdk() delivery for " + whenReadyHandler + JwtParser.SEPARATOR_CHAR;
                                    }
                                });
                            }
                        }
                        SFMCSdk.UNIFIED_SDK_INSTANCE_REQUESTS.clear();
                        SFMCSdk.INSTANCE.notifyInitializationStatusListener(function1, true);
                    }
                    Thread.currentThread().setName(name);
                    SFMCSdkLogger.INSTANCE.d(SFMCSdk.TAG, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.SFMCSdk$Companion$configure$1$3$7
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final String invoke() {
                            return "~~ SFMCSdk Initialization Complete ~~";
                        }
                    });
                } catch (Exception e2) {
                    Companion companion2 = SFMCSdk.INSTANCE;
                    companion2.staticTearDown();
                    SFMCSdk.UNIFIED_SDK_INSTANCE_REQUESTS.clear();
                    companion2.notifyInitializationStatusListener(function1, false);
                    SFMCSdkLogger sFMCSdkLogger2 = SFMCSdkLogger.INSTANCE;
                    sFMCSdkLogger2.e(SFMCSdk.TAG, e2, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.SFMCSdk$Companion$configure$1$3$6
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final String invoke() {
                            return "An error occurred during SDK initialization.";
                        }
                    });
                    Thread.currentThread().setName(name);
                    sFMCSdkLogger2.d(SFMCSdk.TAG, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.SFMCSdk$Companion$configure$1$3$7
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final String invoke() {
                            return "~~ SFMCSdk Initialization Complete ~~";
                        }
                    });
                }
            } catch (Throwable th) {
                Thread.currentThread().setName(name);
                SFMCSdkLogger.INSTANCE.d(SFMCSdk.TAG, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.SFMCSdk$Companion$configure$1$3$7
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return "~~ SFMCSdk Initialization Complete ~~";
                    }
                });
                throw th;
            }
        }

        private final void notifyInitializationStatusListener(final Function1<? super InitializationStatus, Unit> listener, boolean isSuccessful) {
            if (listener != null) {
                try {
                    listener.invoke(new SFMCSdkInitializationStatus(isSuccessful));
                } catch (Exception e) {
                    SFMCSdkLogger.INSTANCE.e(SFMCSdk.TAG, e, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.SFMCSdk$Companion$notifyInitializationStatusListener$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final String invoke() {
                            return "Failed to delivery initialization state to listener " + listener + JwtParser.SEPARATOR_CHAR;
                        }
                    });
                }
            }
        }

        private final void staticTearDown() {
            SFMCSdk sFMCSdk = SFMCSdk.instance;
            if (sFMCSdk != null) {
                Iterator it = sFMCSdk.modules.iterator();
                while (it.hasNext()) {
                    ((Module) it.next()).tearDown();
                }
            }
            EventManager.INSTANCE.staticTearDown$sfmcsdk_release();
            SFMCSdk.UNIFIED_SDK_INSTANCE_REQUESTS.clear();
            SFMCSdk.instance = null;
            SFMCSdk.initializationState = InitializationState.NONE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: track$lambda-16, reason: not valid java name */
        public static final void m259track$lambda16(Event[] events, SFMCSdk sdk) {
            Intrinsics.h(events, "$events");
            Intrinsics.h(sdk, "sdk");
            sdk.internalTrack((Event[]) Arrays.copyOf(events, events.length));
        }

        @JvmStatic
        @JvmOverloads
        @MainThread
        public final void configure(@NotNull Context context, @NotNull SFMCSdkModuleConfig config) {
            Intrinsics.h(context, "context");
            Intrinsics.h(config, "config");
            configure$default(this, context, config, null, 4, null);
        }

        @NotNull
        public final BehaviorManagerImpl getBehaviorManager$sfmcsdk_release() {
            return SFMCSdk.behaviorManager;
        }

        @NotNull
        public final CdpModule getCdpModule$sfmcsdk_release() {
            return SFMCSdk.cdpModule;
        }

        @NotNull
        public final PushModule getPushModule$sfmcsdk_release() {
            return SFMCSdk.pushModule;
        }

        @JvmStatic
        public final void requestSdk(@NotNull SFMCSdkReadyListener listener) {
            Intrinsics.h(listener, "listener");
            final WhenReadyHandler whenReadyHandler = new WhenReadyHandler(listener);
            synchronized (SFMCSdk.UNIFIED_SDK_INSTANCE_REQUESTS) {
                if (WhenMappings.$EnumSwitchMapping$0[SFMCSdk.initializationState.ordinal()] == 1) {
                    try {
                        SFMCSdk sFMCSdk = SFMCSdk.instance;
                        if (sFMCSdk != null) {
                            whenReadyHandler.deliverSdk(sFMCSdk);
                        }
                    } catch (Exception e) {
                        SFMCSdkLogger.INSTANCE.e(SFMCSdk.TAG, e, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.SFMCSdk$Companion$requestSdk$1$2
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final String invoke() {
                                return "Failure during requestSdk() delivery for " + whenReadyHandler + JwtParser.SEPARATOR_CHAR;
                            }
                        });
                    }
                } else {
                    SFMCSdk.UNIFIED_SDK_INSTANCE_REQUESTS.add(whenReadyHandler);
                }
            }
        }

        public final void setCdpModule$sfmcsdk_release(@NotNull CdpModule cdpModule) {
            Intrinsics.h(cdpModule, "<set-?>");
            SFMCSdk.cdpModule = cdpModule;
        }

        @JvmStatic
        public final void setLogging(@NotNull LogLevel level, @Nullable LogListener listener) {
            Intrinsics.h(level, "level");
            SFMCSdkLogger sFMCSdkLogger = SFMCSdkLogger.INSTANCE;
            sFMCSdkLogger.setLogLevel(level);
            sFMCSdkLogger.setListener(listener);
        }

        public final void setPushModule$sfmcsdk_release(@NotNull PushModule pushModule) {
            Intrinsics.h(pushModule, "<set-?>");
            SFMCSdk.pushModule = pushModule;
        }

        @JvmStatic
        public final void track(@NotNull Event... events) {
            Intrinsics.h(events, "events");
            requestSdk(new au.com.woolworths.product.details.epoxy.a(events, 24));
        }

        private Companion() {
        }

        @JvmStatic
        @JvmOverloads
        @MainThread
        public final void configure(@NotNull Context context, @NotNull final SFMCSdkModuleConfig config, @Nullable Function1<? super InitializationStatus, Unit> listener) {
            Intrinsics.h(context, "context");
            Intrinsics.h(config, "config");
            synchronized (SFMCSdk.SDK_LOCK) {
                try {
                    SFMCSdk sFMCSdk = SFMCSdk.instance;
                    if (sFMCSdk != null) {
                        InitializationState initializationState = SFMCSdk.initializationState;
                        InitializationState initializationState2 = InitializationState.READY;
                        if (initializationState == initializationState2 || SFMCSdk.initializationState == InitializationState.INITIALIZING) {
                            if (config.equals(sFMCSdk.getConfig())) {
                                SFMCSdkLogger.INSTANCE.d(SFMCSdk.TAG, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.SFMCSdk$Companion$configure$1$1$1
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final String invoke() {
                                        return "SDK already initialized for config " + config;
                                    }
                                });
                                if (SFMCSdk.initializationState == initializationState2 && listener != null) {
                                    listener.invoke(new SFMCSdkInitializationStatus(true));
                                }
                                return;
                            }
                        }
                    }
                    SFMCSdk.initializationState = InitializationState.INITIALIZING;
                    SFMCSdkLogger.INSTANCE.d(SFMCSdk.TAG, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.SFMCSdk$Companion$configure$1$2
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final String invoke() {
                            return "~~ SFMCSdk v1.0.3 Initialization Started ~~";
                        }
                    });
                    new Thread(new g(21, config, listener, context)).start();
                    SFMCSdk.SDK_LOCK.notifyAll();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ModuleIdentifier.values().length];
            iArr[ModuleIdentifier.PUSH.ordinal()] = 1;
            iArr[ModuleIdentifier.CDP.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.g(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor()");
        behaviorManager = new BehaviorManagerImpl(executorServiceNewSingleThreadExecutor);
        initializationState = InitializationState.NONE;
        UNIFIED_SDK_INSTANCE_REQUESTS = new ArrayList();
        SDK_LOCK = new Object();
    }

    public /* synthetic */ SFMCSdk(SFMCSdkModuleConfig sFMCSdkModuleConfig, DefaultConstructorMarker defaultConstructorMarker) {
        this(sFMCSdkModuleConfig);
    }

    @JvmStatic
    @JvmOverloads
    @MainThread
    public static final void configure(@NotNull Context context, @NotNull SFMCSdkModuleConfig sFMCSdkModuleConfig) {
        INSTANCE.configure(context, sFMCSdkModuleConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void internalTrack(final Event... events) {
        try {
            SFMCSdkLogger.INSTANCE.d(TAG, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.SFMCSdk$internalTrack$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    StringBuilder sb = new StringBuilder("Tracking events: ");
                    Iterator it = ArraysKt.F(events).iterator();
                    String string = "";
                    while (it.hasNext()) {
                        Event event = (Event) it.next();
                        StringBuilder sbS = YU.a.s(string);
                        sbS.append(StringsKt.D(string) ? "" : ", ");
                        sbS.append(Reflection.f24268a.b(event.getClass()).B());
                        sbS.append("( ");
                        sbS.append(event.getName());
                        sbS.append(" )");
                        string = sbS.toString();
                    }
                    sb.append(string);
                    return sb.toString();
                }
            });
        } catch (Exception unused) {
        }
        EventManager.INSTANCE.publish$sfmcsdk_release(this.executors, (Event[]) Arrays.copyOf(events, events.length));
    }

    @JvmStatic
    public static final void requestSdk(@NotNull SFMCSdkReadyListener sFMCSdkReadyListener) {
        INSTANCE.requestSdk(sFMCSdkReadyListener);
    }

    @JvmStatic
    public static final void setLogging(@NotNull LogLevel logLevel, @Nullable LogListener logListener) {
        INSTANCE.setLogging(logLevel, logListener);
    }

    @JvmStatic
    public static final void track(@NotNull Event... eventArr) {
        INSTANCE.track(eventArr);
    }

    public final void cdp(@NotNull CdpModuleReadyListener listener) {
        Intrinsics.h(listener, "listener");
        cdpModule.requestModule(listener);
    }

    @NotNull
    public final SFMCSdkModuleConfig getConfig() {
        return this.config;
    }

    @NotNull
    public final Identity getIdentity() {
        Identity identity = this.identity;
        if (identity != null) {
            return identity;
        }
        Intrinsics.p("identity");
        throw null;
    }

    @NotNull
    public final JSONObject getSdkState() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sfmcSDKVersion", "1.0.3");
        for (Module module : this.modules) {
            jSONObject.put(module.getName(), module.getState());
        }
        return jSONObject;
    }

    public final void mp(@NotNull PushModuleReadyListener listener) {
        Intrinsics.h(listener, "listener");
        pushModule.requestModule(listener);
    }

    public final void setIdentity(@NotNull Identity identity) {
        Intrinsics.h(identity, "<set-?>");
        this.identity = identity;
    }

    private SFMCSdk(SFMCSdkModuleConfig sFMCSdkModuleConfig) {
        this.config = sFMCSdkModuleConfig;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        Intrinsics.g(executorServiceNewCachedThreadPool, "newCachedThreadPool()");
        this.executors = new SdkExecutors(executorServiceNewCachedThreadPool, null, 2, 0 == true ? 1 : 0);
        this.modules = new ArrayList();
        Iterator<T> it = sFMCSdkModuleConfig.getConfigs$sfmcsdk_release().iterator();
        while (it.hasNext()) {
            int i = WhenMappings.$EnumSwitchMapping$0[((Config) it.next()).getModuleIdentifier().ordinal()];
            if (i != 1) {
                if (i == 2 && this.config.getCdpModuleConfig() != null) {
                    this.modules.add(cdpModule);
                }
            } else if (this.config.getPushModuleConfig() != null) {
                this.modules.add(pushModule);
            }
        }
    }

    @JvmStatic
    @JvmOverloads
    @MainThread
    public static final void configure(@NotNull Context context, @NotNull SFMCSdkModuleConfig sFMCSdkModuleConfig, @Nullable Function1<? super InitializationStatus, Unit> function1) {
        INSTANCE.configure(context, sFMCSdkModuleConfig, function1);
    }
}
