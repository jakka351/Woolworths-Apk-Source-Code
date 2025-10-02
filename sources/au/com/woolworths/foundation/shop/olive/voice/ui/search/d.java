package au.com.woolworths.foundation.shop.olive.voice.ui.search;

import android.content.Context;
import android.speech.SpeechRecognizer;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.products.VoiceProductAssistantAnalytics;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceSpeechRecogniserImpl;
import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceViewModel;
import au.com.woolworths.foundation.shop.olive.voice.analytics.VoiceAnalytics;
import au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchState;
import au.com.woolworths.foundation.shop.olive.voice.ui.dialog.DialogType;
import com.salesforce.marketingcloud.storage.db.k;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ OliveVoiceViewModel f;

    public /* synthetic */ d(MutableState mutableState, OliveVoiceViewModel oliveVoiceViewModel, int i) {
        this.d = i;
        this.e = mutableState;
        this.f = oliveVoiceViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                DialogType dialogTypeClicked = (DialogType) obj;
                Intrinsics.h(dialogTypeClicked, "dialogTypeClicked");
                this.e.setValue(null);
                OliveVoiceViewModel oliveVoiceViewModel = this.f;
                Context context = oliveVoiceViewModel.i;
                if (dialogTypeClicked instanceof DialogType.NoPermissionDialog) {
                    VoiceAnalytics voiceAnalyticsP6 = oliveVoiceViewModel.p6();
                    String string = context.getString(R.string.olive_voice_action_settings);
                    Intrinsics.g(string, "getString(...)");
                    voiceAnalyticsP6.e(string);
                } else if (dialogTypeClicked instanceof DialogType.LanguageUnavailableDialog) {
                    VoiceAnalytics voiceAnalyticsP62 = oliveVoiceViewModel.p6();
                    String string2 = context.getString(R.string.olive_voice_action_settings);
                    Intrinsics.g(string2, "getString(...)");
                    voiceAnalyticsP62.c(string2);
                }
                return Unit.f24250a;
            case 1:
                DialogType dialogTypeClicked2 = (DialogType) obj;
                Intrinsics.h(dialogTypeClicked2, "dialogTypeClicked");
                this.e.setValue(null);
                OliveVoiceViewModel oliveVoiceViewModel2 = this.f;
                Context context2 = oliveVoiceViewModel2.i;
                if (dialogTypeClicked2 instanceof DialogType.NoPermissionDialog) {
                    VoiceAnalytics voiceAnalyticsP63 = oliveVoiceViewModel2.p6();
                    String string3 = context2.getString(R.string.olive_voice_action_cancel);
                    Intrinsics.g(string3, "getString(...)");
                    voiceAnalyticsP63.e(string3);
                } else if (dialogTypeClicked2 instanceof DialogType.NoDeviceLevelPermissionDialog) {
                    VoiceAnalytics voiceAnalyticsP64 = oliveVoiceViewModel2.p6();
                    final String str = voiceAnalyticsP64.c;
                    VoiceProductAssistantAnalytics.Assistant assistant = new VoiceProductAssistantAnalytics.Assistant(str);
                    final String string4 = voiceAnalyticsP64.f8821a.getString(R.string.olive_voice_action_ok);
                    Intrinsics.g(string4, "getString(...)");
                    final VoiceProductAssistantAnalytics.Assistant.Action action = assistant.h;
                    action.getClass();
                    voiceAnalyticsP64.a(new Event(str, action, string4) { // from class: au.com.woolworths.analytics.supers.products.VoiceProductAssistantAnalytics$Assistant$Action$noDeviceLevelPermissionDialogResponse$1
                        public final String d;
                        public final Object e;

                        {
                            this.d = YU.a.h("voiceproduct", str, "_dialogclick");
                            SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                            spreadBuilder.b(action.f4046a.g);
                            spreadBuilder.a(new Pair(k.a.b, "android"));
                            spreadBuilder.a(new Pair("event.Action", "dialog_click"));
                            androidx.constraintlayout.core.state.a.z("event.Label", string4, spreadBuilder, "event.Description", "microphone access on this device is off");
                            ArrayList arrayList = spreadBuilder.f24269a;
                            this.e = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                        }

                        @Override // au.com.woolworths.analytics.Event
                        /* renamed from: d, reason: from getter */
                        public final String getD() {
                            return this.d;
                        }

                        public final boolean equals(Object obj2) {
                            if (!(obj2 instanceof Event)) {
                                return false;
                            }
                            Event event = (Event) obj2;
                            return Intrinsics.c(this.d, event.getD()) && Intrinsics.c(this.e, event.getData()) && Intrinsics.c(null, event.getF());
                        }

                        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                        @Override // au.com.woolworths.analytics.Event
                        public final Map getData() {
                            return this.e;
                        }
                    });
                } else if (dialogTypeClicked2 instanceof DialogType.LanguageUnavailableDialog) {
                    VoiceAnalytics voiceAnalyticsP65 = oliveVoiceViewModel2.p6();
                    String string5 = context2.getString(R.string.olive_voice_action_cancel);
                    Intrinsics.g(string5, "getString(...)");
                    voiceAnalyticsP65.c(string5);
                }
                return Unit.f24250a;
            case 2:
                if (((Boolean) obj).booleanValue()) {
                    OliveVoiceViewModel oliveVoiceViewModel3 = this.f;
                    if (ContextExtKt.d(oliveVoiceViewModel3.i)) {
                        oliveVoiceViewModel3.s6(VoiceSearchState.Idle.f8832a);
                    } else {
                        oliveVoiceViewModel3.s6(VoiceSearchState.Listening.f8833a);
                        OliveVoiceSpeechRecogniserImpl oliveVoiceSpeechRecogniserImpl = oliveVoiceViewModel3.f;
                        oliveVoiceSpeechRecogniserImpl.b = oliveVoiceViewModel3;
                        SpeechRecognizer speechRecognizer = oliveVoiceSpeechRecogniserImpl.f8805a;
                        if (speechRecognizer == null) {
                            Intrinsics.p("speechRecognizer");
                            throw null;
                        }
                        speechRecognizer.startListening(OliveVoiceSpeechRecogniserImpl.d);
                    }
                } else {
                    this.e.setValue(DialogType.NoPermissionDialog.f8841a);
                }
                return Unit.f24250a;
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    OliveVoiceViewModel oliveVoiceViewModel4 = this.f;
                    OliveVoiceSpeechRecogniserImpl oliveVoiceSpeechRecogniserImpl2 = oliveVoiceViewModel4.f;
                    oliveVoiceSpeechRecogniserImpl2.b = oliveVoiceViewModel4;
                    SpeechRecognizer speechRecognizer2 = oliveVoiceSpeechRecogniserImpl2.f8805a;
                    if (speechRecognizer2 == null) {
                        Intrinsics.p("speechRecognizer");
                        throw null;
                    }
                    speechRecognizer2.startListening(OliveVoiceSpeechRecogniserImpl.d);
                } else {
                    this.e.setValue(DialogType.NoPermissionDialog.f8841a);
                }
                return Unit.f24250a;
            default:
                final LifecycleResumePauseEffectScope LifecycleResumeEffect = (LifecycleResumePauseEffectScope) obj;
                Intrinsics.h(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
                final OliveVoiceViewModel oliveVoiceViewModel5 = this.f;
                final MutableState mutableState = this.e;
                return new LifecyclePauseOrDisposeEffectResult(LifecycleResumeEffect, oliveVoiceViewModel5, mutableState) { // from class: au.com.woolworths.foundation.shop.olive.voice.ui.search.OliveVoiceSearchScreenKt$OliveVoiceSearchScreen$lambda$10$lambda$9$$inlined$onPauseOrDispose$1

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ OliveVoiceViewModel f8863a;
                    public final /* synthetic */ MutableState b;

                    {
                        this.f8863a = oliveVoiceViewModel5;
                        this.b = mutableState;
                    }

                    @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
                    public final void a() {
                        OliveVoiceViewModel oliveVoiceViewModel6 = this.f8863a;
                        OliveVoiceSpeechRecogniserImpl oliveVoiceSpeechRecogniserImpl3 = oliveVoiceViewModel6.f;
                        oliveVoiceSpeechRecogniserImpl3.b = null;
                        SpeechRecognizer speechRecognizer3 = oliveVoiceSpeechRecogniserImpl3.f8805a;
                        if (speechRecognizer3 == null) {
                            Intrinsics.p("speechRecognizer");
                            throw null;
                        }
                        speechRecognizer3.stopListening();
                        if (((Boolean) this.b.getD()).booleanValue()) {
                            return;
                        }
                        oliveVoiceViewModel6.s6(VoiceSearchState.Idle.f8832a);
                    }
                };
        }
    }

    public /* synthetic */ d(OliveVoiceViewModel oliveVoiceViewModel, MutableState mutableState) {
        this.d = 4;
        this.f = oliveVoiceViewModel;
        this.e = mutableState;
    }
}
