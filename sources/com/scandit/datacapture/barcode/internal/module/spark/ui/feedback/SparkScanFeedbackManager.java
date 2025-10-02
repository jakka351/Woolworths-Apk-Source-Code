package com.scandit.datacapture.barcode.internal.module.spark.ui.feedback;

import android.content.Context;
import android.view.ViewGroup;
import com.scandit.datacapture.barcode.C0519a7;
import com.scandit.datacapture.barcode.Z6;
import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanStateManager;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewSettings;
import com.scandit.datacapture.core.common.feedback.Feedback;
import com.scandit.datacapture.core.common.feedback.Sound;
import com.scandit.datacapture.core.common.feedback.Vibration;
import com.scandit.datacapture.core.time.TimeInterval;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SparkScanFeedbackManager {

    /* renamed from: a, reason: collision with root package name */
    private final SparkScanViewSettings f17787a;
    private final SparkScanStateManager b;
    private ViewGroup c;
    private Z6 d;
    private C0519a7 e;
    private Feedback f;
    private Feedback g;

    public SparkScanFeedbackManager(SparkScanViewSettings settings, SparkScanStateManager stateManager) {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(stateManager, "stateManager");
        this.f17787a = settings;
        this.b = stateManager;
        Vibration vibration = new Vibration();
        vibration.setDuration(TimeInterval.INSTANCE.millis(40L));
        this.g = new Feedback(vibration, null, 2, null);
    }

    public final void a(ViewGroup container) {
        Intrinsics.h(container, "container");
        this.c = container;
        ViewGroup viewGroup = this.c;
        if (viewGroup == null) {
            Intrinsics.p("container");
            throw null;
        }
        Context context = viewGroup.getContext();
        Intrinsics.g(context, "container.context");
        this.d = new Z6(context);
        ViewGroup viewGroup2 = this.c;
        if (viewGroup2 == null) {
            Intrinsics.p("container");
            throw null;
        }
        Context context2 = viewGroup2.getContext();
        Intrinsics.g(context2, "container.context");
        this.e = new C0519a7(context2);
        ViewGroup viewGroup3 = this.c;
        if (viewGroup3 == null) {
            Intrinsics.p("container");
            throw null;
        }
        viewGroup3.addView(this.d);
        ViewGroup viewGroup4 = this.c;
        if (viewGroup4 != null) {
            viewGroup4.addView(this.e);
        } else {
            Intrinsics.p("container");
            throw null;
        }
    }

    public final void b(int i) {
        C0519a7 c0519a7;
        if (!this.f17787a.getVisualFeedbackEnabled() || (c0519a7 = this.e) == null) {
            return;
        }
        c0519a7.a(i);
    }

    public final void b() {
        this.g.release();
        Feedback feedback = this.f;
        if (feedback != null) {
            feedback.release();
        }
        this.e = null;
        this.d = null;
    }

    public final void a() {
        if (this.b.f()) {
            this.g.emit();
        }
    }

    public final void a(int i) {
        Z6 z6;
        if (!this.f17787a.getVisualFeedbackEnabled() || (z6 = this.d) == null) {
            return;
        }
        z6.a(i);
    }

    public final void a(Feedback feedback) {
        boolean zF = this.b.f();
        boolean zP = this.b.p();
        Sound sound = null;
        Vibration vibration = (!zF || feedback == null) ? null : feedback.getVibration();
        if (zP && feedback != null) {
            sound = feedback.getSound();
        }
        Feedback feedback2 = new Feedback(vibration, sound);
        this.f = feedback2;
        feedback2.emit();
    }
}
