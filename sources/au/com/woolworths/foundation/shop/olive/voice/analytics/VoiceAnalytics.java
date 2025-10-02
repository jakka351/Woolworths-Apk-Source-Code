package au.com.woolworths.foundation.shop.olive.voice.analytics;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.products.VoiceProductAssistantAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchError;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/analytics/VoiceAnalytics;", "", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VoiceAnalytics {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8821a;
    public final AnalyticsManager b;
    public final String c;

    public VoiceAnalytics(Context context, AnalyticsManager analyticsManager, String analyticsContext) {
        Intrinsics.h(context, "context");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(analyticsContext, "analyticsContext");
        this.f8821a = context;
        this.b = analyticsManager;
        this.c = analyticsContext;
    }

    public final void a(Event event) {
        this.b.g(event);
    }

    public final void b() {
        String str = this.c;
        VoiceProductAssistantAnalytics.Assistant assistant = new VoiceProductAssistantAnalytics.Assistant(str);
        a(assistant.h.a(str, VoiceSearchError.ConnectionError.f8823a.a(this.f8821a), "network error"));
    }

    public final void c(final String str) {
        final String str2 = this.c;
        final VoiceProductAssistantAnalytics.Assistant.Action action = new VoiceProductAssistantAnalytics.Assistant(str2).h;
        action.getClass();
        a(new Event(str2, action, str) { // from class: au.com.woolworths.analytics.supers.products.VoiceProductAssistantAnalytics$Assistant$Action$languageUnavailableDialogResponse$1
            public final String d;
            public final Object e;

            {
                this.d = YU.a.h("voiceproduct", str2, "_dialogclick");
                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                spreadBuilder.b(action.f4046a.g);
                spreadBuilder.a(new Pair(k.a.b, "android"));
                spreadBuilder.a(new Pair("event.Action", "dialog_click"));
                androidx.constraintlayout.core.state.a.z("event.Label", str, spreadBuilder, "event.Description", "current device language not available");
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
    }

    public final void d(final String buttonLabel) {
        Intrinsics.h(buttonLabel, "buttonLabel");
        final String str = this.c;
        final VoiceProductAssistantAnalytics.Assistant.Action action = new VoiceProductAssistantAnalytics.Assistant(str).h;
        action.getClass();
        a(new Event(str, action, buttonLabel) { // from class: au.com.woolworths.analytics.supers.products.VoiceProductAssistantAnalytics$Assistant$Action$microphonePermissionRationaleAction$1
            public final String d;
            public final Object e;

            {
                this.d = YU.a.h("voiceproduct", str, "_record_audio_buttonclick");
                SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                spreadBuilder.b(action.f4046a.g);
                spreadBuilder.a(new Pair(k.a.b, "android"));
                androidx.constraintlayout.core.state.a.z("event.Category", "voice product " + str, spreadBuilder, "event.Action", "button_click");
                androidx.constraintlayout.core.state.a.z("event.Label", String.valueOf(buttonLabel), spreadBuilder, "event.Description", "request to record audio");
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
    }

    public final void e(final String str) {
        final String str2 = this.c;
        final VoiceProductAssistantAnalytics.Assistant.Action action = new VoiceProductAssistantAnalytics.Assistant(str2).h;
        action.getClass();
        a(new Event(str2, action, str) { // from class: au.com.woolworths.analytics.supers.products.VoiceProductAssistantAnalytics$Assistant$Action$noMicrophonePermissionDialogResponse$1
            public final String d;
            public final Object e;

            {
                this.d = YU.a.h("voiceproduct", str2, "_dialogclick");
                SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                spreadBuilder.b(action.f4046a.g);
                spreadBuilder.a(new Pair(k.a.b, "android"));
                spreadBuilder.a(new Pair("event.Category", "voice product " + str2));
                spreadBuilder.a(new Pair("event.Action", "dialog_click"));
                androidx.constraintlayout.core.state.a.z("event.Label", str, spreadBuilder, "event.Description", "request to record audio");
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
    }

    public final void f(final String str) {
        final String str2 = this.c;
        final VoiceProductAssistantAnalytics.Onboarding.Action action = new VoiceProductAssistantAnalytics.Onboarding(str2).h;
        action.getClass();
        a(new Event(str2, action, str) { // from class: au.com.woolworths.analytics.supers.products.VoiceProductAssistantAnalytics$Onboarding$Action$onboardingButtonClicked$1
            public final String d;
            public final Object e;

            {
                this.d = YU.a.h("voiceproduct", str2, "onboarding_buttonclick");
                SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                spreadBuilder.b(action.f4047a.g);
                androidx.constraintlayout.core.state.a.z("event.Action", "button_click", spreadBuilder, "event.Label", str);
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
    }

    public final void g(final String str) {
        final String str2 = this.c;
        final VoiceProductAssistantAnalytics.Assistant.Action action = new VoiceProductAssistantAnalytics.Assistant(str2).h;
        action.getClass();
        a(new Event(str2, action, str) { // from class: au.com.woolworths.analytics.supers.products.VoiceProductAssistantAnalytics$Assistant$Action$microphoneAccessButtonClicked$1
            public final String d;
            public final Object e;

            {
                this.d = YU.a.h("voiceproduct", str2, "_microphoneaccess_buttonclick");
                SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                spreadBuilder.b(action.f4046a.g);
                spreadBuilder.a(new Pair("event.Action", "button_click"));
                spreadBuilder.a(new Pair("event.Label", str));
                androidx.constraintlayout.core.state.a.y("event.Description", "microphone access", spreadBuilder);
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
    }

    public final void h() {
        String str = this.c;
        VoiceProductAssistantAnalytics.Assistant assistant = new VoiceProductAssistantAnalytics.Assistant(str);
        a(assistant.h.a(str, VoiceSearchError.ApiError.f8822a.a(this.f8821a), "server error"));
    }
}
