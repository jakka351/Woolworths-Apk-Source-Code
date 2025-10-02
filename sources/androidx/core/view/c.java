package androidx.core.view;

import android.content.Context;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import androidx.lifecycle.DispatchQueue;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleController;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.internal.SavedStateHandleImpl;
import androidx.navigation.NavBackStackEntry;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.products.VoiceProductAssistantAnalytics;
import au.com.woolworths.feature.shared.force.upgrade.ConfigActionContract;
import au.com.woolworths.feature.shop.signup.data.SignUpError;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceContract;
import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceSpeechRecogniserImpl;
import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceViewModel;
import au.com.woolworths.foundation.shop.olive.voice.analytics.VoiceAnalytics;
import au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchError;
import au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchState;
import au.com.woolworths.foundation.shop.olive.voice.ui.OliveVoiceScreenKt;
import au.com.woolworths.shop.checkout.ui.bridge.CheckoutBridgeContract;
import au.com.woolworths.shop.checkout.ui.bridge.CheckoutBridgeViewModel;
import au.com.woolworths.shop.checkout.ui.summary.CheckoutSummaryFragment;
import com.google.accompanist.permissions.MutablePermissionState;
import com.google.accompanist.permissions.PermissionStatus;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements LifecycleEventObserver {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        switch (this.d) {
            case 0:
                MenuHostHelper menuHostHelper = (MenuHostHelper) this.e;
                MenuProvider menuProvider = (MenuProvider) this.f;
                menuHostHelper.getClass();
                if (event == Lifecycle.Event.ON_DESTROY) {
                    menuHostHelper.c(menuProvider);
                    return;
                }
                return;
            case 1:
                LifecycleController lifecycleController = (LifecycleController) this.e;
                Job job = (Job) this.f;
                if (lifecycleOwner.getD().getD() == Lifecycle.State.d) {
                    job.cancel((CancellationException) null);
                    lifecycleController.a();
                    return;
                }
                Lifecycle.State d = lifecycleOwner.getD().getD();
                Lifecycle.State state = lifecycleController.b;
                DispatchQueue dispatchQueue = lifecycleController.c;
                if (d.compareTo(state) < 0) {
                    dispatchQueue.f2785a = true;
                    return;
                } else {
                    if (dispatchQueue.f2785a) {
                        if (dispatchQueue.b) {
                            throw new IllegalStateException("Cannot resume a finished dispatcher");
                        }
                        dispatchQueue.f2785a = false;
                        dispatchQueue.a();
                        return;
                    }
                    return;
                }
            case 2:
                ConfigActionContract.ViewState viewState = (ConfigActionContract.ViewState) this.e;
                Function1 function1 = (Function1) this.f;
                if (event == Lifecycle.Event.ON_RESUME && (viewState instanceof ConfigActionContract.ViewState.FullScreenContent)) {
                    function1.invoke(((ConfigActionContract.ViewState.FullScreenContent) viewState).f6501a);
                    return;
                }
                return;
            case 3:
                MutablePermissionState mutablePermissionState = (MutablePermissionState) this.e;
                Function0 function0 = (Function0) this.f;
                if (event == Lifecycle.Event.ON_RESUME) {
                    PermissionStatus status = mutablePermissionState.getStatus();
                    Intrinsics.h(status, "<this>");
                    if (status.equals(PermissionStatus.Granted.f14367a)) {
                        function0.invoke();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                Function1 function12 = (Function1) this.e;
                SignUpError signUpError = (SignUpError) this.f;
                if (event == Lifecycle.Event.ON_START) {
                    function12.invoke(signUpError);
                    return;
                }
                return;
            case 5:
                OliveVoiceViewModel oliveVoiceViewModel = (OliveVoiceViewModel) this.e;
                Context context = (Context) this.f;
                int i = OliveVoiceScreenKt.WhenMappings.f8838a[event.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                    SpeechRecognizer speechRecognizer = oliveVoiceViewModel.f.f8805a;
                    if (speechRecognizer != null) {
                        speechRecognizer.destroy();
                        return;
                    } else {
                        Intrinsics.p("speechRecognizer");
                        throw null;
                    }
                }
                oliveVoiceViewModel.getClass();
                Intrinsics.h(context, "context");
                final OliveVoiceSpeechRecogniserImpl oliveVoiceSpeechRecogniserImpl = oliveVoiceViewModel.f;
                oliveVoiceSpeechRecogniserImpl.getClass();
                SpeechRecognizer speechRecognizerCreateSpeechRecognizer = SpeechRecognizer.createSpeechRecognizer(context);
                speechRecognizerCreateSpeechRecognizer.setRecognitionListener(new RecognitionListener() { // from class: au.com.woolworths.foundation.shop.olive.voice.OliveVoiceSpeechRecogniserImpl$initialiseRecogniser$1$1
                    @Override // android.speech.RecognitionListener
                    public final void onBeginningOfSpeech() {
                    }

                    @Override // android.speech.RecognitionListener
                    public final void onBufferReceived(byte[] bArr) {
                    }

                    @Override // android.speech.RecognitionListener
                    public final void onEndOfSpeech() {
                        oliveVoiceSpeechRecogniserImpl.c = false;
                    }

                    @Override // android.speech.RecognitionListener
                    public final void onError(int i2) {
                        OliveVoiceViewModel oliveVoiceViewModel2;
                        OliveVoiceSpeechRecogniserImpl oliveVoiceSpeechRecogniserImpl2 = oliveVoiceSpeechRecogniserImpl;
                        if ((i2 != 5 || oliveVoiceSpeechRecogniserImpl2.c) && (oliveVoiceViewModel2 = oliveVoiceSpeechRecogniserImpl2.b) != null) {
                            OliveVoiceSpeechRecogniserImpl oliveVoiceSpeechRecogniserImpl3 = oliveVoiceViewModel2.f;
                            oliveVoiceSpeechRecogniserImpl3.b = null;
                            SpeechRecognizer speechRecognizer2 = oliveVoiceSpeechRecogniserImpl3.f8805a;
                            if (speechRecognizer2 == null) {
                                Intrinsics.p("speechRecognizer");
                                throw null;
                            }
                            speechRecognizer2.stopListening();
                            oliveVoiceViewModel2.j.f(OliveVoiceContract.Action.PerformHapticFailure.f8796a);
                            if (i2 == 1 || i2 == 2) {
                                oliveVoiceViewModel2.p6().b();
                                oliveVoiceViewModel2.s6(new VoiceSearchState.Failure(VoiceSearchError.ConnectionError.f8823a));
                                return;
                            }
                            if (i2 == 6 || i2 == 7) {
                                VoiceAnalytics voiceAnalyticsP6 = oliveVoiceViewModel2.p6();
                                String str = voiceAnalyticsP6.c;
                                VoiceProductAssistantAnalytics.Assistant assistant = new VoiceProductAssistantAnalytics.Assistant(str);
                                String string = voiceAnalyticsP6.f8821a.getString(com.woolworths.R.string.olive_voice_idle_state_title);
                                Intrinsics.g(string, "getString(...)");
                                voiceAnalyticsP6.a(assistant.h.a(str, string, "no input from customer"));
                                oliveVoiceViewModel2.s6(VoiceSearchState.Idle.f8832a);
                                return;
                            }
                            if (i2 == 9) {
                                Bark.Companion companion = Bark.f8483a;
                                Bark.Barker.i(new ReportOwner(ReportOwner.Squad.m), "Olive VPF -> Insufficient permissions", null, 12);
                                oliveVoiceViewModel2.s6(new VoiceSearchState.Failure(VoiceSearchError.InsufficientDeviceLevelPermissions.f8824a));
                                return;
                            }
                            if (i2 == 12) {
                                Bark.Companion companion2 = Bark.f8483a;
                                Bark.Barker.i(new ReportOwner(ReportOwner.Squad.m), "Olive VPF -> Unsupported language " + Locale.getDefault(), null, 12);
                                oliveVoiceViewModel2.s6(new VoiceSearchState.Failure(VoiceSearchError.UnsupportedLanguage.f8828a));
                                return;
                            }
                            if (i2 == 13) {
                                Bark.Companion companion3 = Bark.f8483a;
                                Bark.Barker.i(new ReportOwner(ReportOwner.Squad.m), "Olive VPF -> Language not available for recognition " + Locale.getDefault(), null, 12);
                                oliveVoiceViewModel2.s6(new VoiceSearchState.Failure(VoiceSearchError.LanguageNotAvailable.f8825a));
                                return;
                            }
                            Bark.Companion companion4 = Bark.f8483a;
                            Bark.Barker.i(new ReportOwner(ReportOwner.Squad.m), "Olive VPF -> SpeechRecognizer error : " + i2, null, 12);
                            VoiceAnalytics voiceAnalyticsP62 = oliveVoiceViewModel2.p6();
                            String str2 = voiceAnalyticsP62.c;
                            VoiceProductAssistantAnalytics.Assistant assistant2 = new VoiceProductAssistantAnalytics.Assistant(str2);
                            Context context2 = voiceAnalyticsP62.f8821a;
                            VoiceSearchError.VoiceRecognitionError voiceRecognitionError = VoiceSearchError.VoiceRecognitionError.f8829a;
                            voiceAnalyticsP62.a(assistant2.h.a(str2, voiceRecognitionError.a(context2), "unknown error"));
                            oliveVoiceViewModel2.s6(new VoiceSearchState.Failure(voiceRecognitionError));
                        }
                    }

                    @Override // android.speech.RecognitionListener
                    public final void onEvent(int i2, Bundle bundle) {
                    }

                    @Override // android.speech.RecognitionListener
                    public final void onPartialResults(Bundle bundle) {
                        String str;
                        ArrayList<String> stringArrayList;
                        OliveVoiceViewModel oliveVoiceViewModel2 = oliveVoiceSpeechRecogniserImpl.b;
                        if (oliveVoiceViewModel2 != null) {
                            if (bundle == null || (stringArrayList = bundle.getStringArrayList("results_recognition")) == null || (str = stringArrayList.get(0)) == null) {
                                str = "";
                            }
                            oliveVoiceViewModel2.s6(new VoiceSearchState.Recognising(str));
                        }
                    }

                    @Override // android.speech.RecognitionListener
                    public final void onReadyForSpeech(Bundle bundle) {
                        OliveVoiceSpeechRecogniserImpl oliveVoiceSpeechRecogniserImpl2 = oliveVoiceSpeechRecogniserImpl;
                        oliveVoiceSpeechRecogniserImpl2.c = true;
                        OliveVoiceViewModel oliveVoiceViewModel2 = oliveVoiceSpeechRecogniserImpl2.b;
                        if (oliveVoiceViewModel2 != null) {
                            oliveVoiceViewModel2.j.f(OliveVoiceContract.Action.PerformHapticSuccess.f8797a);
                            VoiceAnalytics voiceAnalyticsP6 = oliveVoiceViewModel2.p6();
                            String str = voiceAnalyticsP6.c;
                            VoiceProductAssistantAnalytics.Assistant.Action action = new VoiceProductAssistantAnalytics.Assistant(str).h;
                            action.getClass();
                            voiceAnalyticsP6.a(new Event(str, action) { // from class: au.com.woolworths.analytics.supers.products.VoiceProductAssistantAnalytics$Assistant$Action$listeningState$1
                                public final String d;
                                public final Object e;

                                {
                                    this.d = YU.a.h("voiceproduct", str, "listening_impression");
                                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                    spreadBuilder.b(action.f4046a.g);
                                    spreadBuilder.a(new Pair("event.Action", "impression"));
                                    spreadBuilder.a(new Pair("event.Label", "listening"));
                                    androidx.constraintlayout.core.state.a.y("event.Description", "listening", spreadBuilder);
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
                                    Event event2 = (Event) obj;
                                    return Intrinsics.c(this.d, event2.getD()) && Intrinsics.c(this.e, event2.getData()) && Intrinsics.c(null, event2.getF());
                                }

                                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                @Override // au.com.woolworths.analytics.Event
                                public final Map getData() {
                                    return this.e;
                                }
                            });
                            oliveVoiceViewModel2.s6(VoiceSearchState.Listening.f8833a);
                        }
                    }

                    @Override // android.speech.RecognitionListener
                    public final void onResults(Bundle bundle) {
                        String str;
                        ArrayList<String> stringArrayList;
                        OliveVoiceViewModel oliveVoiceViewModel2 = oliveVoiceSpeechRecogniserImpl.b;
                        if (oliveVoiceViewModel2 != null) {
                            if (bundle == null || (stringArrayList = bundle.getStringArrayList("results_recognition")) == null || (str = stringArrayList.get(0)) == null) {
                                str = "";
                            }
                            oliveVoiceViewModel2.j.f(OliveVoiceContract.Action.PerformHapticSuccess.f8797a);
                            oliveVoiceViewModel2.s6(new VoiceSearchState.Processing(str));
                            BuildersKt.c(ViewModelKt.a(oliveVoiceViewModel2), null, null, new OliveVoiceViewModel$onEndOfListening$1(oliveVoiceViewModel2, str, null), 3);
                        }
                    }

                    @Override // android.speech.RecognitionListener
                    public final void onRmsChanged(float f) {
                    }
                });
                oliveVoiceSpeechRecogniserImpl.f8805a = speechRecognizerCreateSpeechRecognizer;
                return;
            case 6:
                Lazy lazy = ((NavBackStackEntry) this.e).l;
                CheckoutSummaryFragment checkoutSummaryFragment = (CheckoutSummaryFragment) this.f;
                if (event == Lifecycle.Event.ON_RESUME && Intrinsics.c((Boolean) ((SavedStateHandle) lazy.getD()).a("REFUND_BOTTOM_SHEET_RESULT_KEY"), Boolean.TRUE)) {
                    SavedStateHandle savedStateHandle = (SavedStateHandle) lazy.getD();
                    savedStateHandle.getClass();
                    SavedStateHandleImpl savedStateHandleImpl = savedStateHandle.b;
                    savedStateHandleImpl.f2809a.remove("REFUND_BOTTOM_SHEET_RESULT_KEY");
                    savedStateHandleImpl.c.remove("REFUND_BOTTOM_SHEET_RESULT_KEY");
                    savedStateHandleImpl.d.remove("REFUND_BOTTOM_SHEET_RESULT_KEY");
                    CheckoutBridgeViewModel checkoutBridgeViewModel = (CheckoutBridgeViewModel) checkoutSummaryFragment.e.getD();
                    checkoutBridgeViewModel.h.f(CheckoutBridgeContract.Action.LaunchZeroPayment.f10675a);
                    return;
                }
                return;
            default:
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.e;
                c cVar = (c) this.f;
                if (event == Lifecycle.Event.ON_DESTROY) {
                    navBackStackEntry.k.k.c(cVar);
                    return;
                }
                return;
        }
    }
}
