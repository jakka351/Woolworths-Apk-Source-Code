package au.com.woolworths.foundation.shop.olive.voice.ui;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.products.VoiceProductAssistantAnalytics;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.compose.utils.preview.PermissionKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceContract;
import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceViewModel;
import au.com.woolworths.foundation.shop.olive.voice.analytics.VoiceAnalytics;
import au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchState;
import au.com.woolworths.foundation.shop.olive.voice.ui.onboarding.OliveVoiceOnboardingScreenKt;
import au.com.woolworths.foundation.shop.olive.voice.ui.permission.OliveVoicePermissionScreenKt;
import au.com.woolworths.foundation.shop.olive.voice.ui.search.OliveVoiceSearchScreenKt;
import com.google.accompanist.permissions.PermissionState;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"olive-voice_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class OliveVoiceScreenKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8838a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f8838a = iArr;
        }
    }

    public static final void a(final Function0 onClose, final Function1 onSearchSubmit, final Function0 onAppSettingsClick, final Function0 onDeviceSettingsClick, final Function0 onDisplayFeedbackClick, final Function0 onSearchFallbackAction, final Function0 onHapticSuccess, final Function0 onHapticFailure, final OliveVoiceViewModel viewModel, final VoiceAnalytics voiceAnalytics, Modifier modifier, Composer composer, final int i) {
        Object oliveVoiceScreenKt$OliveVoiceScreen$3$1;
        LifecycleOwner lifecycleOwner;
        Flow flow;
        OliveVoiceViewModel oliveVoiceViewModel;
        Modifier.Companion companion;
        OliveVoiceViewModel oliveVoiceViewModel2;
        Function0 function0;
        VoiceAnalytics voiceAnalytics2;
        Object oliveVoiceScreenKt$OliveVoiceScreen$13$1;
        VoiceAnalytics voiceAnalytics3;
        final Modifier modifier2;
        OliveVoiceViewModel oliveVoiceViewModel3;
        Object oliveVoiceScreenKt$OliveVoiceScreen$6$1;
        final VoiceAnalytics voiceAnalytics4;
        final Function0 function02;
        Intrinsics.h(onClose, "onClose");
        Intrinsics.h(onSearchSubmit, "onSearchSubmit");
        Intrinsics.h(onAppSettingsClick, "onAppSettingsClick");
        Intrinsics.h(onDeviceSettingsClick, "onDeviceSettingsClick");
        Intrinsics.h(onDisplayFeedbackClick, "onDisplayFeedbackClick");
        Intrinsics.h(onSearchFallbackAction, "onSearchFallbackAction");
        Intrinsics.h(onHapticSuccess, "onHapticSuccess");
        Intrinsics.h(onHapticFailure, "onHapticFailure");
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(voiceAnalytics, "voiceAnalytics");
        ComposerImpl composerImplV = composer.v(-1109623800);
        int i2 = (composerImplV.I(voiceAnalytics) ? 536870912 : 268435456) | i | (composerImplV.I(onClose) ? 4 : 2) | (composerImplV.I(onSearchSubmit) ? 32 : 16) | (composerImplV.I(onAppSettingsClick) ? 256 : 128) | (composerImplV.I(onDeviceSettingsClick) ? 2048 : 1024) | (composerImplV.I(onDisplayFeedbackClick) ? 16384 : 8192) | (composerImplV.I(onSearchFallbackAction) ? 131072 : 65536) | (composerImplV.I(onHapticSuccess) ? 1048576 : 524288) | (composerImplV.I(onHapticFailure) ? 8388608 : 4194304) | (composerImplV.n(viewModel) ? 67108864 : 33554432);
        if ((306783379 & i2) == 306783378 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerImplV.x(LocalLifecycleOwnerKt.f2808a);
            PermissionState permissionStateA = PermissionKt.a("android.permission.RECORD_AUDIO", null, composerImplV, 2);
            View view = (View) composerImplV.x(AndroidCompositionLocals_androidKt.f);
            boolean zA = DarkThemeKt.a(composerImplV);
            long j = CoreTheme.d(composerImplV).f4872a.e;
            Boolean boolValueOf = Boolean.valueOf(zA);
            composerImplV.o(-1633490746);
            boolean zI = composerImplV.I(view) | composerImplV.s(j);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                objG = new OliveVoiceScreenKt$OliveVoiceScreen$1$1(view, j, null);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, boolValueOf, (Function2) objG);
            composerImplV.o(-1633490746);
            int i3 = 234881024 & i2;
            boolean zN = (i3 == 67108864) | composerImplV.n(permissionStateA);
            Object objG2 = composerImplV.G();
            if (zN || objG2 == composer$Companion$Empty$1) {
                objG2 = new OliveVoiceScreenKt$OliveVoiceScreen$2$1(viewModel, permissionStateA, null);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, Unit.f24250a, (Function2) objG2);
            Flow flow2 = viewModel.k;
            composerImplV.o(-1224400529);
            boolean z = (i3 == 67108864) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((i2 & 112) == 32) | ((458752 & i2) == 131072) | ((57344 & i2) == 16384) | ((29360128 & i2) == 8388608) | ((3670016 & i2) == 1048576);
            Object objG3 = composerImplV.G();
            if (z || objG3 == composer$Companion$Empty$1) {
                lifecycleOwner = lifecycleOwner2;
                flow = flow2;
                oliveVoiceScreenKt$OliveVoiceScreen$3$1 = new OliveVoiceScreenKt$OliveVoiceScreen$3$1(viewModel, onAppSettingsClick, onDeviceSettingsClick, onSearchSubmit, onSearchFallbackAction, onDisplayFeedbackClick, onHapticFailure, onHapticSuccess, null);
                oliveVoiceViewModel = viewModel;
                composerImplV.A(oliveVoiceScreenKt$OliveVoiceScreen$3$1);
            } else {
                lifecycleOwner = lifecycleOwner2;
                flow = flow2;
                oliveVoiceScreenKt$OliveVoiceScreen$3$1 = objG3;
                oliveVoiceViewModel = viewModel;
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, flow, (Function2) oliveVoiceScreenKt$OliveVoiceScreen$3$1);
            composerImplV.o(-1746271574);
            LifecycleOwner lifecycleOwner3 = lifecycleOwner;
            boolean zI2 = (i3 == 67108864) | composerImplV.I(context) | composerImplV.I(lifecycleOwner3);
            Object objG4 = composerImplV.G();
            if (zI2 || objG4 == composer$Companion$Empty$1) {
                objG4 = new a(0, lifecycleOwner3, oliveVoiceViewModel, context);
                composerImplV.A(objG4);
            }
            composerImplV.V(false);
            EffectsKt.c(lifecycleOwner3, (Function1) objG4, composerImplV);
            OliveVoiceContract.ViewState viewState = (OliveVoiceContract.ViewState) FlowExtKt.a(oliveVoiceViewModel.m, composerImplV).getD();
            boolean z2 = viewState instanceof OliveVoiceContract.ViewState.Onboarding;
            Modifier.Companion companion2 = Modifier.Companion.d;
            if (z2) {
                composerImplV.o(1563900314);
                composerImplV.o(5004770);
                boolean z3 = i3 == 67108864;
                Object objG5 = composerImplV.G();
                if (z3 || objG5 == composer$Companion$Empty$1) {
                    objG5 = new OliveVoiceScreenKt$OliveVoiceScreen$5$1(0, oliveVoiceViewModel, OliveVoiceViewModel.class, "handleOnboardingContinue", "handleOnboardingContinue()V", 0);
                    oliveVoiceViewModel3 = oliveVoiceViewModel;
                    composerImplV.A(objG5);
                } else {
                    oliveVoiceViewModel3 = oliveVoiceViewModel;
                }
                KFunction kFunction = (KFunction) objG5;
                composerImplV.V(false);
                composerImplV.o(5004770);
                boolean zI3 = composerImplV.I(voiceAnalytics);
                Object objG6 = composerImplV.G();
                if (zI3 || objG6 == composer$Companion$Empty$1) {
                    oliveVoiceScreenKt$OliveVoiceScreen$6$1 = new OliveVoiceScreenKt$OliveVoiceScreen$6$1(0, voiceAnalytics, VoiceAnalytics.class, "trackOnboardingScreenImpression", "trackOnboardingScreenImpression()V", 0);
                    voiceAnalytics4 = voiceAnalytics;
                    composerImplV.A(oliveVoiceScreenKt$OliveVoiceScreen$6$1);
                } else {
                    oliveVoiceScreenKt$OliveVoiceScreen$6$1 = objG6;
                    voiceAnalytics4 = voiceAnalytics;
                }
                KFunction kFunction2 = (KFunction) oliveVoiceScreenKt$OliveVoiceScreen$6$1;
                composerImplV.V(false);
                boolean z4 = oliveVoiceViewModel3.n;
                composerImplV.o(-1633490746);
                int i4 = i2 & 14;
                boolean zI4 = composerImplV.I(voiceAnalytics4) | (i4 == 4);
                Object objG7 = composerImplV.G();
                if (zI4 || objG7 == composer$Companion$Empty$1) {
                    final int i5 = 0;
                    function02 = onClose;
                    objG7 = new Function0() { // from class: au.com.woolworths.foundation.shop.olive.voice.ui.b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i5) {
                                case 0:
                                    voiceAnalytics4.f("close");
                                    function02.invoke();
                                    break;
                                default:
                                    VoiceAnalytics voiceAnalytics5 = voiceAnalytics4;
                                    voiceAnalytics5.getClass();
                                    String str = voiceAnalytics5.c;
                                    VoiceProductAssistantAnalytics.Onboarding.Action action = new VoiceProductAssistantAnalytics.Onboarding(str).h;
                                    action.getClass();
                                    voiceAnalytics5.a(new Event(str, action) { // from class: au.com.woolworths.analytics.supers.products.VoiceProductAssistantAnalytics$Onboarding$Action$deviceNotSupportedPermissionDialogResponse$1
                                        public final String d;
                                        public final Object e;

                                        {
                                            this.d = YU.a.h("voiceproduct", str, "onboarding_dialogclick");
                                            SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                            spreadBuilder.b(action.f4047a.g);
                                            spreadBuilder.a(new Pair(k.a.b, "android"));
                                            spreadBuilder.a(new Pair("event.Action", "dialog_click"));
                                            androidx.constraintlayout.core.state.a.z("event.Label", "ok", spreadBuilder, "event.Description", "device not supported");
                                            ArrayList arrayList = spreadBuilder.f24269a;
                                            this.e = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                        }

                                        @Override // au.com.woolworths.analytics.Event
                                        /* renamed from: d, reason: from getter */
                                        public final String getD() {
                                            return this.d;
                                        }

                                        public final boolean equals(Object obj) {
                                            if (!(obj instanceof Event)) {
                                                return false;
                                            }
                                            Event event = (Event) obj;
                                            return Intrinsics.c(this.d, event.getD()) && Intrinsics.c(this.e, event.getData()) && Intrinsics.c(null, event.getF());
                                        }

                                        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                        @Override // au.com.woolworths.analytics.Event
                                        public final Map getData() {
                                            return this.e;
                                        }
                                    });
                                    function02.invoke();
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG7);
                } else {
                    function02 = onClose;
                }
                Function0 function03 = (Function0) objG7;
                composerImplV.V(false);
                Function0 function04 = (Function0) kFunction;
                Function0 function05 = (Function0) kFunction2;
                composerImplV.o(-1633490746);
                boolean zI5 = composerImplV.I(voiceAnalytics4) | (i4 == 4);
                Object objG8 = composerImplV.G();
                if (zI5 || objG8 == composer$Companion$Empty$1) {
                    final int i6 = 1;
                    objG8 = new Function0() { // from class: au.com.woolworths.foundation.shop.olive.voice.ui.b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i6) {
                                case 0:
                                    voiceAnalytics4.f("close");
                                    function02.invoke();
                                    break;
                                default:
                                    VoiceAnalytics voiceAnalytics5 = voiceAnalytics4;
                                    voiceAnalytics5.getClass();
                                    String str = voiceAnalytics5.c;
                                    VoiceProductAssistantAnalytics.Onboarding.Action action = new VoiceProductAssistantAnalytics.Onboarding(str).h;
                                    action.getClass();
                                    voiceAnalytics5.a(new Event(str, action) { // from class: au.com.woolworths.analytics.supers.products.VoiceProductAssistantAnalytics$Onboarding$Action$deviceNotSupportedPermissionDialogResponse$1
                                        public final String d;
                                        public final Object e;

                                        {
                                            this.d = YU.a.h("voiceproduct", str, "onboarding_dialogclick");
                                            SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                            spreadBuilder.b(action.f4047a.g);
                                            spreadBuilder.a(new Pair(k.a.b, "android"));
                                            spreadBuilder.a(new Pair("event.Action", "dialog_click"));
                                            androidx.constraintlayout.core.state.a.z("event.Label", "ok", spreadBuilder, "event.Description", "device not supported");
                                            ArrayList arrayList = spreadBuilder.f24269a;
                                            this.e = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                        }

                                        @Override // au.com.woolworths.analytics.Event
                                        /* renamed from: d, reason: from getter */
                                        public final String getD() {
                                            return this.d;
                                        }

                                        public final boolean equals(Object obj) {
                                            if (!(obj instanceof Event)) {
                                                return false;
                                            }
                                            Event event = (Event) obj;
                                            return Intrinsics.c(this.d, event.getD()) && Intrinsics.c(this.e, event.getData()) && Intrinsics.c(null, event.getF());
                                        }

                                        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                        @Override // au.com.woolworths.analytics.Event
                                        public final Map getData() {
                                            return this.e;
                                        }
                                    });
                                    function02.invoke();
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG8);
                }
                composerImplV.V(false);
                OliveVoiceOnboardingScreenKt.a(function03, function04, function05, (Function0) objG8, z4, companion2, composerImplV, 196608, 0);
                composerImplV.V(false);
                composerImplV = composerImplV;
                companion = companion2;
            } else {
                OliveVoiceViewModel oliveVoiceViewModel4 = oliveVoiceViewModel;
                if (viewState instanceof OliveVoiceContract.ViewState.Permission) {
                    composerImplV.o(1564609842);
                    boolean zA2 = oliveVoiceViewModel4.e.a();
                    composerImplV.o(5004770);
                    boolean z5 = i3 == 67108864;
                    Object objG9 = composerImplV.G();
                    if (z5 || objG9 == composer$Companion$Empty$1) {
                        function0 = onClose;
                        OliveVoiceScreenKt$OliveVoiceScreen$9$1 oliveVoiceScreenKt$OliveVoiceScreen$9$1 = new OliveVoiceScreenKt$OliveVoiceScreen$9$1(0, oliveVoiceViewModel4, OliveVoiceViewModel.class, "handlePermissionContinue", "handlePermissionContinue()V", 0);
                        composerImplV.A(oliveVoiceScreenKt$OliveVoiceScreen$9$1);
                        objG9 = oliveVoiceScreenKt$OliveVoiceScreen$9$1;
                    } else {
                        function0 = onClose;
                    }
                    KFunction kFunction3 = (KFunction) objG9;
                    composerImplV.V(false);
                    composerImplV.o(5004770);
                    boolean z6 = i3 == 67108864;
                    Object objG10 = composerImplV.G();
                    if (z6 || objG10 == composer$Companion$Empty$1) {
                        OliveVoiceScreenKt$OliveVoiceScreen$10$1 oliveVoiceScreenKt$OliveVoiceScreen$10$1 = new OliveVoiceScreenKt$OliveVoiceScreen$10$1(0, viewModel, OliveVoiceViewModel.class, "handlePermissionGranted", "handlePermissionGranted()V", 0);
                        composerImplV.A(oliveVoiceScreenKt$OliveVoiceScreen$10$1);
                        objG10 = oliveVoiceScreenKt$OliveVoiceScreen$10$1;
                    }
                    KFunction kFunction4 = (KFunction) objG10;
                    composerImplV.V(false);
                    composerImplV.o(5004770);
                    boolean z7 = i3 == 67108864;
                    Object objG11 = composerImplV.G();
                    if (z7 || objG11 == composer$Companion$Empty$1) {
                        objG11 = new OliveVoiceScreenKt$OliveVoiceScreen$11$1(0, viewModel, OliveVoiceViewModel.class, "handlePermissionDenied", "handlePermissionDenied()V", 0);
                        composerImplV.A(objG11);
                    }
                    KFunction kFunction5 = (KFunction) objG11;
                    composerImplV.V(false);
                    composerImplV.o(5004770);
                    boolean zI6 = composerImplV.I(voiceAnalytics);
                    Object objG12 = composerImplV.G();
                    if (zI6 || objG12 == composer$Companion$Empty$1) {
                        voiceAnalytics2 = voiceAnalytics;
                        OliveVoiceScreenKt$OliveVoiceScreen$12$1 oliveVoiceScreenKt$OliveVoiceScreen$12$1 = new OliveVoiceScreenKt$OliveVoiceScreen$12$1(0, voiceAnalytics2, VoiceAnalytics.class, "trackPermissionScreenImpression", "trackPermissionScreenImpression()V", 0);
                        composerImplV.A(oliveVoiceScreenKt$OliveVoiceScreen$12$1);
                        objG12 = oliveVoiceScreenKt$OliveVoiceScreen$12$1;
                    } else {
                        voiceAnalytics2 = voiceAnalytics;
                    }
                    KFunction kFunction6 = (KFunction) objG12;
                    composerImplV.V(false);
                    composerImplV.o(5004770);
                    boolean zI7 = composerImplV.I(voiceAnalytics2);
                    Object objG13 = composerImplV.G();
                    if (zI7 || objG13 == composer$Companion$Empty$1) {
                        oliveVoiceScreenKt$OliveVoiceScreen$13$1 = new OliveVoiceScreenKt$OliveVoiceScreen$13$1(1, voiceAnalytics2, VoiceAnalytics.class, "trackMicrophonePermissionRationaleClick", "trackMicrophonePermissionRationaleClick(Ljava/lang/String;)V", 0);
                        voiceAnalytics3 = voiceAnalytics2;
                        composerImplV.A(oliveVoiceScreenKt$OliveVoiceScreen$13$1);
                    } else {
                        oliveVoiceScreenKt$OliveVoiceScreen$13$1 = objG13;
                        voiceAnalytics3 = voiceAnalytics2;
                    }
                    KFunction kFunction7 = (KFunction) oliveVoiceScreenKt$OliveVoiceScreen$13$1;
                    composerImplV.V(false);
                    Function0 function06 = (Function0) kFunction3;
                    Function0 function07 = (Function0) kFunction4;
                    Function0 function08 = (Function0) kFunction5;
                    composerImplV.o(-1633490746);
                    boolean zI8 = composerImplV.I(voiceAnalytics3) | ((i2 & 14) == 4);
                    Object objG14 = composerImplV.G();
                    if (zI8 || objG14 == composer$Companion$Empty$1) {
                        objG14 = new au.com.woolworths.foundation.rewards.common.ui.b(voiceAnalytics3, function0, 4);
                        composerImplV.A(objG14);
                    }
                    Function2 function2 = (Function2) objG14;
                    composerImplV.V(false);
                    Function0 function09 = (Function0) kFunction6;
                    composerImplV.o(1849434622);
                    Object objG15 = composerImplV.G();
                    if (objG15 == composer$Companion$Empty$1) {
                        objG15 = new h(20);
                        composerImplV.A(objG15);
                    }
                    composerImplV.V(false);
                    composerImplV = composerImplV;
                    OliveVoicePermissionScreenKt.b(zA2, function06, function07, function08, function2, function09, (Function0) objG15, (Function1) kFunction7, companion2, composerImplV, 102236160, 0);
                    companion = companion2;
                    composerImplV.V(false);
                } else {
                    companion = companion2;
                    composerImplV = composerImplV;
                    if (!(viewState instanceof OliveVoiceContract.ViewState.VoiceSearch)) {
                        throw au.com.woolworths.android.onesite.a.w(-1196479397, composerImplV, false);
                    }
                    composerImplV.o(1565904557);
                    VoiceSearchState voiceSearchState = ((OliveVoiceContract.ViewState.VoiceSearch) viewState).f8802a;
                    composerImplV.o(5004770);
                    boolean z8 = i3 == 67108864;
                    Object objG16 = composerImplV.G();
                    if (z8 || objG16 == composer$Companion$Empty$1) {
                        OliveVoiceScreenKt$OliveVoiceScreen$16$1 oliveVoiceScreenKt$OliveVoiceScreen$16$1 = new OliveVoiceScreenKt$OliveVoiceScreen$16$1(0, viewModel, OliveVoiceViewModel.class, "handleSearchFallbackClick", "handleSearchFallbackClick()V", 0);
                        composerImplV.A(oliveVoiceScreenKt$OliveVoiceScreen$16$1);
                        objG16 = oliveVoiceScreenKt$OliveVoiceScreen$16$1;
                    }
                    KFunction kFunction8 = (KFunction) objG16;
                    composerImplV.V(false);
                    composerImplV.o(5004770);
                    boolean zI9 = composerImplV.I(voiceAnalytics);
                    Object objG17 = composerImplV.G();
                    if (zI9 || objG17 == composer$Companion$Empty$1) {
                        OliveVoiceScreenKt$OliveVoiceScreen$17$1 oliveVoiceScreenKt$OliveVoiceScreen$17$1 = new OliveVoiceScreenKt$OliveVoiceScreen$17$1(1, voiceAnalytics, VoiceAnalytics.class, "trackSearchFallbackActionShown", "trackSearchFallbackActionShown(Lau/com/woolworths/foundation/shop/olive/voice/data/VoiceSearchError;)V", 0);
                        composerImplV.A(oliveVoiceScreenKt$OliveVoiceScreen$17$1);
                        objG17 = oliveVoiceScreenKt$OliveVoiceScreen$17$1;
                    }
                    KFunction kFunction9 = (KFunction) objG17;
                    composerImplV.V(false);
                    composerImplV.o(5004770);
                    boolean z9 = i3 == 67108864;
                    Object objG18 = composerImplV.G();
                    if (z9 || objG18 == composer$Companion$Empty$1) {
                        oliveVoiceViewModel2 = viewModel;
                        objG18 = new OliveVoiceScreenKt$OliveVoiceScreen$18$1(0, oliveVoiceViewModel2, OliveVoiceViewModel.class, "handleDisplayFeedbackClick", "handleDisplayFeedbackClick()V", 0);
                        composerImplV.A(objG18);
                    } else {
                        oliveVoiceViewModel2 = viewModel;
                    }
                    KFunction kFunction10 = (KFunction) objG18;
                    composerImplV.V(false);
                    boolean z10 = oliveVoiceViewModel2.n;
                    boolean zBooleanValue = ((Boolean) oliveVoiceViewModel2.o.getD()).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) oliveVoiceViewModel2.p.getD()).booleanValue();
                    Function0 function010 = (Function0) kFunction8;
                    Function1 function1 = (Function1) kFunction9;
                    composerImplV.o(-1633490746);
                    boolean zI10 = composerImplV.I(voiceAnalytics) | ((i2 & 14) == 4);
                    Object objG19 = composerImplV.G();
                    if (zI10 || objG19 == composer$Companion$Empty$1) {
                        objG19 = new au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.a(24, voiceAnalytics, onClose);
                        composerImplV.A(objG19);
                    }
                    composerImplV.V(false);
                    OliveVoiceSearchScreenKt.b(oliveVoiceViewModel2, voiceAnalytics, voiceSearchState, function010, function1, (Function1) objG19, (Function0) kFunction10, z10, zBooleanValue, zBooleanValue2, composerImplV, (i2 >> 24) & 126, 6);
                    composerImplV.V(false);
                }
            }
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(onSearchSubmit, onAppSettingsClick, onDeviceSettingsClick, onDisplayFeedbackClick, onSearchFallbackAction, onHapticSuccess, onHapticFailure, viewModel, voiceAnalytics, modifier2, i) { // from class: au.com.woolworths.foundation.shop.olive.voice.ui.c
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ Function0 g;
                public final /* synthetic */ Function0 h;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ Function0 j;
                public final /* synthetic */ Function0 k;
                public final /* synthetic */ OliveVoiceViewModel l;
                public final /* synthetic */ VoiceAnalytics m;
                public final /* synthetic */ Modifier n;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1073741825);
                    OliveVoiceScreenKt.a(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
